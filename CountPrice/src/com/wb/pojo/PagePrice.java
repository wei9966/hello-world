package com.wb.pojo;

/**
 * 计算纸张单价参数
 */
public class PagePrice {
    /**
     * 吨价
     */
    private double dPrice=6000;
    /**
     * 尺寸
     */
    private String size;
    /**
     * 克度
     */
    private int kd;

    public double getdPrice() {
        return dPrice;
    }

    public void setdPrice(double dPrice) {
        this.dPrice = dPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getKd() {
        return kd;
    }

    public void setKd(int kd) {
        this.kd = kd;
    }

    public double zh(){
        if (size.equals("大度")){
            return 1884;
        }else if(size.equals("正度")) {
            return 2327;
        }else {
            return 0;
        }
    }
}
