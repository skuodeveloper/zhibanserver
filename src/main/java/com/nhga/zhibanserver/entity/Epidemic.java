package com.nhga.zhibanserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Epidemic implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String tbdw;
    private String tbrq;
    private String xm;
    private int xb;
    private String sfzh;
    private String hjd;
    private String xjzd;
    private String gzdw;
    private String lxdh;
    private String lhsj;
    private String ljsj;
    private String gcsj;
    private String gcdd;
    private String lrd;
    private String tw;
    private int ywks;
    private int xmqc;
    private int tt;
    private int fx;
    private String qtzz;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTbdw() {
        return tbdw;
    }

    public void setTbdw(String tbdw) {
        this.tbdw = tbdw;
    }

    public String getTbrq() {
        return tbrq;
    }

    public void setTbrq(String tbrq) {
        this.tbrq = tbrq;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public int getXb() {
        return xb;
    }

    public void setXb(int xb) {
        this.xb = xb;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getHjd() {
        return hjd;
    }

    public void setHjd(String hjd) {
        this.hjd = hjd;
    }

    public String getXjzd() {
        return xjzd;
    }

    public void setXjzd(String xjzd) {
        this.xjzd = xjzd;
    }

    public String getGzdw() {
        return gzdw;
    }

    public void setGzdw(String gzdw) {
        this.gzdw = gzdw;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getLhsj() {
        return lhsj;
    }

    public void setLhsj(String lhsj) {
        this.lhsj = lhsj;
    }

    public String getLjsj() {
        return ljsj;
    }

    public void setLjsj(String ljsj) {
        this.ljsj = ljsj;
    }

    public String getGcsj() {
        return gcsj;
    }

    public void setGcsj(String gcsj) {
        this.gcsj = gcsj;
    }

    public String getGcdd() {
        return gcdd;
    }

    public void setGcdd(String gcdd) {
        this.gcdd = gcdd;
    }

    public String getLrd() {
        return lrd;
    }

    public void setLrd(String lrd) {
        this.lrd = lrd;
    }

    public String getTw() {
        return tw;
    }

    public void setTw(String tw) {
        this.tw = tw;
    }

    public int getYwks() {
        return ywks;
    }

    public void setYwks(int ywks) {
        this.ywks = ywks;
    }

    public int getXmqc() {
        return xmqc;
    }

    public void setXmqc(int xmqc) {
        this.xmqc = xmqc;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public int getFx() {
        return fx;
    }

    public void setFx(int fx) {
        this.fx = fx;
    }

    public String getQtzz() {
        return qtzz;
    }

    public void setQtzz(String qtzz) {
        this.qtzz = qtzz;
    }
}
