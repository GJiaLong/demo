package com.example.demo.pojo;

public class Books {
    private Integer bId;
    private String bName;
    private Double price;

    public Books(){}

    public Books(Integer bId, String bName, Double price) {
        this.bId = bId;
        this.bName = bName;
        this.price = price;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", price=" + price +
                '}';
    }
}
