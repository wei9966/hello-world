package com.wb.p;

import com.wb.pojo.PagePrice;
import com.wb.pojo.Var;
import com.wb.util.Util;

/**
 * 计算封面价格
 */
public class FengMian {
    /**
     * 封面纸张价格
     * @return 封面纸张价格
     */
    public double pagePrice(Var v){
        /**
         * 单张价
         */
        double sPrice;
        /**
         * 放数
         */
        int uCount;
        /**
         * 成品数量
         */
        int count=v.getCount();

        PagePrice p=new PagePrice();
        p.setKd(v.getFmKg());
        p.setSize(v.getfSize());
        sPrice=Util.pagePrice(p);
        uCount=Util.getZCount(v.getCount());
        int count1=count+uCount;
        double k=v.getFmSize()/2.0;
        /**
         * 总数
         */
        double zCount=(4.0/k*count1)/4;
        return sPrice*zCount;
    }

    /**
     *
     *
     * @return 印工价格
     */
    public int yinPrice(Var v){
        int count=v.getCount();
        if (count>200){
            return 150;
        }

        return 0;
    }



}
