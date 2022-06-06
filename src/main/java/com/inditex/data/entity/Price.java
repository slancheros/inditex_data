package com.inditex.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;


@Entity
public class Price {


    private Long brandId;
    private Date startDate;
    private Date endDate;
    @Id
    private Long priceList;
    private String productId;
    private Long priority;
    private BigDecimal price;
    private String currency;

    protected Price(){

    }

    public Price(Long brandId, Date startDate, Date endDate, Long priceList, String productId, Long priority, BigDecimal price, String currency) {
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productId = productId;
        this.priority = priority;
        this.price = price;
        this.currency = currency;
    }

    public Long getBrandId() {
        return this.brandId;
    }


    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }


    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public Date  getEndDate() {
        return this.endDate;
    }


    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }



    public Long getPriceList() {
        return this.priceList;
    }

    public void setPriceList(Long priceList) {
        this.priceList = priceList;
    }


    public String getProductId() {
        return this.productId;
    }


    public void setProductId(String productId) {
        this.productId = productId;
    }


    public Long getPriority() {
        return this.priority;
    }


    public void setPriority(Long priority) {
        this.priority = priority;
    }


    public BigDecimal getPrice() {
        return this.price;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public String getCurrency() {
        return this.currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
