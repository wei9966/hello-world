package com.wb.dao;

import com.wb.p.FengMian;
import com.wb.p.HouJiaGong;
import com.wb.p.NeiXing;
import com.wb.pojo.Var;

public class Dao {

    public double getResult(Var v){
        FengMian fm=new FengMian();
        NeiXing neiXing=new NeiXing();
        HouJiaGong houJiaGong=new HouJiaGong();

        /**
         * 封面纸价
         */
        double v1 = fm.pagePrice(v);

        /**
         * 封面印工价
         */
        int i = fm.yinPrice(v);

        /**
         * 内芯纸价
         */
        double v2=neiXing.getNxPage(v);
        /**
         * 内芯印工价
         */
        double i2=neiXing.getYinGongPrice(v);
        /**
         * 后加工
         */
        double hjg = houJiaGong.getHJG(v);
        double result=v1+v2+i+i2+hjg;
        return result;
    }

}
