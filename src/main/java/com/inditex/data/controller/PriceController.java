package com.inditex.data.controller;


import com.inditex.data.entity.Price;
import com.inditex.data.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Date;

@RestController
public class PriceController {

    @Autowired
    private PriceRepository repository;

    DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "Bienvenidos a los precios de Inditex";
    }

    @RequestMapping(value = "prices", method = RequestMethod.GET)
    public List<Price> list() {
        return (List<Price>)repository.findAll();
    }

    @RequestMapping(value = "prices/{id}", method = RequestMethod.GET)
    public Price get(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @RequestMapping(value = "/prices/{brandId}/{productId}/{queryDate}", method = RequestMethod.GET)
    public Price getFilteredPriceInfo(  @PathVariable String brandId,@PathVariable String  productId,
                                        @PathVariable String  queryDate) {

        LocalDateTime localDateTime = LocalDateTime.parse(queryDate, formatter);
        Date convertedStartDate =Date.from(localDateTime.toInstant(ZoneOffset.of("+2")));
        Price p = repository.findUserByProductAndBrand( convertedStartDate,productId,Long.valueOf(brandId));
        return p;
    }


}
