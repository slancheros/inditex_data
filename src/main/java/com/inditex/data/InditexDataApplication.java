package com.inditex.data;


import com.inditex.data.entity.Price;
import com.inditex.data.repository.PriceRepository;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Date;

import java.time.LocalDate;
import java.time.ZoneId;


@SpringBootApplication
public class InditexDataApplication {

	ZoneId defaultZoneId = ZoneId.systemDefault();

	public static void main(String[] args) {
		SpringApplication.run(InditexDataApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(PriceRepository repository) {


		return (args) -> {
			/*Date startDate1 = this.convertToDate(2020,6,14,0,0,0);
			Date startDate2 = this.convertToDate(2020,6,14,15,0,0);
			Date startDate3 = this.convertToDate( 2020,6,15,0,0,0);
			Date startDate4 = this.convertToDate(2020,6,15,16,0,0);

			Date endDate1 = this.convertToDate(2020,12,31,23,59,59);
			Date endDate2 = this.convertToDate(2020,6,14,18,30,0);
			Date endDate3 = this.convertToDate( 2020,6,15,11,0,0);
			Date endDate4 = this.convertToDate(2020,12,31,23,59,59);



			repository.save(new Price(
					Long.valueOf(1), startDate1, endDate1,
					Long.valueOf(1), "3455", Long.valueOf(0),
					BigDecimal.valueOf(35.50), "EUR" ));
			repository.save(new Price(
					Long.valueOf(1), startDate2, endDate2,
					Long.valueOf(2), "3455", Long.valueOf(1),
					BigDecimal.valueOf(25.45), "EUR"));
			repository.save(new Price(
					Long.valueOf(1), startDate3, endDate3,
					Long.valueOf(3), "3455", Long.valueOf(1),
					BigDecimal.valueOf(30.50),"EUR"));
			repository.save(new Price(
					Long.valueOf(1),startDate4, endDate4,
					Long.valueOf(4), "3455",Long.valueOf(1),
					BigDecimal.valueOf(38.95), "EUR"));*/


		};
	}

	public Date convertToDate(int year, int month , int day, int hour, int min, int sec){
		return Date.from(LocalDate.of(year, month, day)
				.atTime(hour,min,sec)
				.atZone(defaultZoneId).toInstant());
	}
}
