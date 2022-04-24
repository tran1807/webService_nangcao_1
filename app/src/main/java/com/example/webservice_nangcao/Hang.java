package com.example.webservice_nangcao;

import java.io.Serializable;

public class Hang implements Serializable {


    private int MaHang;
    private String TenHang;
    private int NamSanXuat;
    private int Soluong;
    private String Loai;


    public Hang(int maHang, String tenHang, int namSanXuat, int soluong, String loai) {
        MaHang = maHang;
        TenHang = tenHang;
        NamSanXuat = namSanXuat;
        Soluong = soluong;
        Loai = loai;
    }

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public int getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }
}
