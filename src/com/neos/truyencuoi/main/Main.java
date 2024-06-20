package com.neos.truyencuoi.main;

import com.neos.truyencuoi.nguoidung.NguoiDung;
import com.neos.truyencuoi.truyen.ChuDe;
import com.neos.truyencuoi.truyen.Truyen;

public class Main {
    public static void main(String[] args) {
        NguoiDung nd = new NguoiDung();
        nd.themCD("CD1", "Dân gian");
        nd.themCD("CD2", "Tiếu lâm");
        nd.themCD("CD3", "Học đường");
        nd.themCD("CD4", "Y tế");
        nd.themCD("CD1", "Dân gian");

//        Truyen t1 = new Truyen("T1", "Vừa đi vừa khóc", "N/A", "NXB Văn Học", "Có 1 anh chàng...");
//        Truyen t2 = new Truyen("T2", "Hai anh chàng", "N/A", "NXB Văn Học", "Có 2 anh chàng...");
//        Truyen t3 = new Truyen("T3", "Của thiên trả địa", "N/A", "NXB Văn Học", "Có 3 anh chàng...");
//        Truyen t4 = new Truyen("T4", "Thơ ca cười", "N/A", "NXB Văn Học", "Có 4 anh chàng...");
//        Truyen t5 = new Truyen("T1", "Vừa đi vừa khóc", "N/A", "NXB Văn Học", "Có 1 anh chàng...");
//
//        nd.themTruyen(t1, "CD1");
//        nd.themTruyen(t2, "CD1");
//
//        nd.themTruyen(t3, "CD2");
//        nd.themTruyen(t4, "CD2");
//
//        nd.themTruyen(t5, "CD1");
//
//        ChuDe cd1 = nd.timChuDe("CD1");
//        System.out.println(cd1);
//
//        nd.docTruyen("T3", "CD2");
//
//        System.out.println("----------------");
//        nd.xoaTruyen("T1", "CD1");
//        System.out.println(nd.timChuDe("CD1"));

        ChuDe cd = new ChuDe("CD1", "Dân gian dxs");
        int pos = nd.getDsCD().indexOf(cd);
        System.out.println(pos);
    }
}