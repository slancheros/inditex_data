package com.inditex.data.repository;


import com.inditex.data.entity.Price;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PriceRepository extends CrudRepository<Price, Long> {



        Price findById(long id);

        @Query(value = "Select * from Price p "+
                "where p.brand_Id = :brandId " +
                "and p.product_Id = :productId " +
                "and :queryDate between p.start_Date and p.end_Date " +
                "order by p.priority desc, p.price_list asc " +
                "LIMIT 1", nativeQuery = true )
        Price findUserByProductAndBrand(
                @Param("queryDate") Date queryDate,
                @Param("productId") String productId,
                @Param("brandId") Long brandId);

}
