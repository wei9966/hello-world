package com.wb.pojo;

public class Var {
    /**
     *成品数量
     */
    private int count;
    /**
     * 封面尺寸
     */
    private int fmSize;
    /**
     * 封面克数
     */
    private int fmKg;
    /**
     * 内芯尺寸
     */
    private int nxSize;
    /**
     * 内芯克数
     */
    private int nxKg;
    /**
     * P数
     */
    private int pCount;
    /**
     * 客户名称
     */
    private String cName;
    private String fSize;
    private String fPageType;
    private String nPageType;
    private int other;

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

    public String getfPageType() {
        return fPageType;
    }

    public void setfPageType(String fPageType) {
        this.fPageType = fPageType;
    }

    public String getnPageType() {
        return nPageType;
    }

    public void setnPageType(String nPageType) {
        this.nPageType = nPageType;
    }

    public String getfSize() {
        return fSize;
    }

    public void setfSize(String fSize) {
        this.fSize = fSize;
    }

    public String getnSize() {
        return nSize;
    }

    public void setnSize(String nSize) {
        this.nSize = nSize;
    }

    private String nSize;
    public String getFumo() {
        return fumo;
    }

    public void setFumo(String fumo) {
        this.fumo = fumo;
    }

    public String getJiaozhuang() {
        return jiaozhuang;
    }

    public void setJiaozhuang(String jiaozhuang) {
        this.jiaozhuang = jiaozhuang;
    }

    public String getQmd() {
        return qmd;
    }

    public void setQmd(String qmd) {
        this.qmd = qmd;
    }

    private String fumo;
    private String jiaozhuang;
    private String qmd;
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFmSize() {
        return fmSize;
    }

    public void setFmSize(int fmSize) {
        this.fmSize = fmSize;
    }

    public int getFmKg() {
        return fmKg;
    }

    public void setFmKg(int fmKg) {
        this.fmKg = fmKg;
    }

    public int getNxSize() {
        return nxSize;
    }

    public void setNxSize(int nxSize) {
        this.nxSize = nxSize;
    }

    public int getNxKg() {
        return nxKg;
    }

    public void setNxKg(int nxKg) {
        this.nxKg = nxKg;
    }

    public int getpCount() {
        return pCount;
    }

    public void setpCount(int pCount) {
        this.pCount = pCount;
    }

}
