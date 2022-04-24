package com.example.webservice_nangcao;

import java.io.Serializable;

public class NhanVien implements Serializable {
    private int MaNV;
    private String TenNV;
    private int TUOI;
    private int SDT;
    private String DIACHI;

    public NhanVien(int maNV, String tenNV, int TUOI, int SDT, String DIACHI) {
        MaNV = maNV;
        TenNV = tenNV;
        this.TUOI = TUOI;
        this.SDT = SDT;
        this.DIACHI = DIACHI;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public int getTUOI() {
        return TUOI;
    }

    public void setTUOI(int TUOI) {
        this.TUOI = TUOI;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }
}
