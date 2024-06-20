package com.neos.truyencuoi.truyen;

import java.util.ArrayList;

public class ChuDe {
    private String ma, ten;
    private ArrayList<Truyen> dsTruyen;

    public ChuDe(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        dsTruyen = new ArrayList<Truyen>();
    }

    public void themTruyen(Truyen truyen) {
        for (int i = 0; i < dsTruyen.size(); i++) {
            Truyen item = dsTruyen.get(i);

            if (item.getId().equals(truyen.getId())) {
                System.out.println("Err: Truyện bị trùng id: " + truyen.getId());
                return;
            }
        }

        dsTruyen.add(truyen);
        System.out.println("Thêm truyện thành công!" + truyen.getId());
    }

    public void xoaTruyen(String idXoa) {
        for (int i = 0; i < dsTruyen.size(); i++) {
            Truyen item = dsTruyen.get(i);

            if ( item.getId().equals(idXoa) ) {
                dsTruyen.remove(item);

                System.out.println("Truyện đã bị xóa: id = " + idXoa);

                return;
            }
        }

        System.out.println("Err: không thìm thấy truyện" + idXoa);
    }

    public void docTruyen(String idTruyen) {
        for (int i = 0; i < dsTruyen.size(); i++) {
            Truyen item = dsTruyen.get(i);

            if ( item.getId().equals(idTruyen) ) {
                System.out.println(item);
                return;
            }
        }

        System.out.println("Err: không thìm thấy truyện" + idTruyen);
    }

    public Truyen timTruyenTheoId(String idTruyen) {
        for (int i = 0; i < dsTruyen.size(); i++) {
            Truyen item = dsTruyen.get(i);

            if ( item.getId().equals(idTruyen) ) {
                return item;
            }
        }

        return null;
    }

    public ArrayList<Truyen> timTruyenTheoTen(String ten) {
        ArrayList<Truyen> dsKQ = new ArrayList<Truyen>();

        for (int i = 0; i < dsTruyen.size(); i++) {
            Truyen item = dsTruyen.get(i);

            if ( item.getTen().equals(ten) ) {
                dsKQ.add(item);
            }
        }

        return dsKQ;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChuDe ) {
            ChuDe cd2 = (ChuDe) obj;

            return ma.equals(cd2.ma);
        }

        return super.equals(obj);
    }
}
