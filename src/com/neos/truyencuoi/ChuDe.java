package com.neos.truyencuoi;

import java.util.ArrayList;

public class ChuDe {
    private String ma, ten;
    private ArrayList<Truyen> dsTruyen;

    public ChuDe(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        dsTruyen = new ArrayList<Truyen>();
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public ArrayList<Truyen> getDsTruyen() {
        return dsTruyen;
    }

    @Override
    public String toString() {
        return "Mã: " + ma + "\nTên: " + ten + "\nDs Truyện trong chủ để:\n" + dsTruyen;
    }
}
