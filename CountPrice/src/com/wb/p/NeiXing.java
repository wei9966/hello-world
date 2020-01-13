package com.wb.p;

import com.wb.pojo.PagePrice;
import com.wb.pojo.Var;
import com.wb.util.Util;

public class NeiXing {

    public double getNxPage(Var var){
        PagePrice p=new PagePrice();
        p.setSize(var.getnSize());
        p.setKd(var.getNxKg());
        double nd= Util.pagePrice(p);
        int fCount = Util.getZCount(var.getCount());
        int zCount=fCount+var.getCount();
        double k=var.getNxSize()/2.0;
        double i = var.getpCount() / k * zCount / 4.0;
        return i*nd;
    }

    public double getYinGongPrice(Var v) {
        FengMian fm=new FengMian();
        double k=v.getNxSize()/2.0;
        double i = v.getpCount() / k * fm.yinPrice(v) * 2.0;
        return i;
    }
}
