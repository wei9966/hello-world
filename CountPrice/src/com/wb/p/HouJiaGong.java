package com.wb.p;

import com.wb.pojo.Var;

public class HouJiaGong {


    public double getHJG(Var v){
        double fumo=0;
        double jiaozhuang=0;
        double qmd=0;
        if (v.getFumo()!=""){
            fumo=getFuMo(v);
        }
        if (v.getJiaozhuang()!=""){
            jiaozhuang=getJZ(v);
        }
        if (v.getQmd()!=""){
            qmd=getQmd1(v);
        }

        return fumo+jiaozhuang+qmd;
    }

    private double getQmd1(Var v) {
        double qmd=  (v.getpCount()/8*0.03+0.05)*v.getCount();
        return qmd;
    }

    private double getJZ(Var v) {
      double jz=  (v.getpCount()/8*0.03+0.25)*v.getCount();


        return jz;

    }

    private double getFuMo(Var v) {
        double price;
        if (v.getfSize()=="正度"){
            price= v.getCount()*0.11;
        }else {
            price=v.getCount()*0.12;
        }
        if (price<50){
            price=50;
        }

        return price;
    }
}
