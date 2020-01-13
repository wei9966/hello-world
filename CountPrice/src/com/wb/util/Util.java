package com.wb.util;

import com.wb.pojo.PagePrice;

public class Util {

    /**
     * 纸张单价
     * @param price
     * @return
     */
    public static double pagePrice(PagePrice price){
       double size=price.zh();
       double dPrice=price.getdPrice();
       int kd=price.getKd();
        double result= dPrice/size*kd/500;
        return result;
    }
    /**
     * 根据成品数量获取放数
     * @param count 成品数量
     * @return 返回放数
     */
    public static int getZCount(int count){
       if (count>0&&count<5000){
           return 200;
       }else{
           return 300;
       }
    }

}
