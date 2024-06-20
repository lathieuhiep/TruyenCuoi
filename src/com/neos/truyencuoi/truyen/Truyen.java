package com.neos.truyencuoi.truyen;

public class Truyen {
    private String id, ten, tacGia, nxb, noiDung;

    public Truyen(String id, String ten, String tacGia, String nxb, String noiDung) {
        this.id = id;
        this.ten = ten;
        this.tacGia = tacGia;
        this.nxb = nxb;
        this.noiDung = noiDung;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getNxb() {
        return nxb;
    }

    public String getNoiDung() {
        return noiDung;
    }

    @Override
    public String toString() {
        return "\nThông tin truyện:\nId:" + id
                + "\nTên: " + ten
                + "\nTác giả: " + tacGia
                + "\nNXB: " + nxb
                + "\nNội dung: " + noiDung;
    }
}
