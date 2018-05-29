package com.yiban.erp.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GoodsCare {
    private Long id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品编号
     */
    private String goodsNo;
    /**
     * 商品id
     */
    private Long goodsId;

    private String careResult;

    private String carePerson;

    private Double temperature;

    private Integer page;

    private Integer pageSize;

    private Integer offset;

    private Integer limit;

    private String careTime;

    public Integer getOffset() {
        return (this.page == null || this.page <= 0 ? 0 : this.page - 1) * this.getLimit();
    }

    public Integer getLimit() {
        if (this.pageSize == null || this.pageSize <=0 ) {
            return 30;
        }else {
            return this.pageSize;
        }
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    /**
     * 工厂名称
     */
    private String fname;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getGoodsNo() { return goodsNo; }

    public void setGoodsNo(String goodsNo) { this.goodsNo = goodsNo; }

    public Long getGoodsId() { return goodsId; }

    public void setGoodsId(Long goodsId) { this.goodsId = goodsId; }

    public String getCareResult() { return careResult; }

    public void setCareResult(String careResult) { this.careResult = careResult; }

    public String getCarePerson() { return carePerson; }

    public void setCarePerson(String carePerson) { this.carePerson = carePerson; }

    public Double getTemperature() { return temperature; }

    public void setTemperature(Double temperature) { this.temperature = temperature; }

    public String getFname() { return fname; }

    public void setFname(String fname) { this.fname = fname; }

    public String getCareTime() {
        return careTime;
    }

    public void setCareTime(String careTime) {
        this.careTime = careTime;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "GoodsCare{" +
                "name='" + name + '\'' +
                ", goodsNo='" + goodsNo + '\'' +
                ", goodsId=" + goodsId +
                ", careResult='" + careResult + '\'' +
                ", carePerson='" + carePerson + '\'' +
                ", temperature=" + temperature +
                ", fname='" + fname + '\'' +
                '}';
    }
}
