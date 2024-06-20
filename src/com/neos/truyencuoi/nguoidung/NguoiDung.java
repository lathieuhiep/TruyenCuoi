package com.neos.truyencuoi.nguoidung;

import com.neos.truyencuoi.truyen.ChuDe;
import com.neos.truyencuoi.truyen.Truyen;

import java.util.ArrayList;

public class NguoiDung {
    private ArrayList<ChuDe> dsCD;

    public NguoiDung() {
        dsCD = new ArrayList<ChuDe>();
    }

    public ArrayList<ChuDe> getDsCD() {
     return dsCD;
    }

    public void themCD(String ma, String ten) {
        for (int i = 0; i < dsCD.size(); i++) {
            ChuDe item = dsCD.get(i);

            if ( item.getMa().equals(ma) ) {
                System.out.println("Err: Chủ đề bị trùng id: " + ma);
                return;
            }
        }

        dsCD.add( new ChuDe(ma, ten) );
        System.out.println("Thêm chủ đề thành công!" + ma);
    }

    public void xoaCD(String ma) {
        for (int i = 0; i < dsCD.size(); i++) {
            ChuDe item = dsCD.get(i);

            if ( item.getMa().equals(ma) ) {
                dsCD.remove(item);
                System.out.println("chủ để bị xóa, mã: " + ma);
                return;
            }
        }

        System.out.println("Không thìm thấy chủ đề" + ma);
    }

    public ChuDe timChuDe(String ma) {
        for (int i = 0; i < dsCD.size(); i++) {
            ChuDe item = dsCD.get(i);

            if ( item.getMa().equals(ma) ) {
                return item;
            }
        }

        return null;
    }

    public void themTruyen(Truyen truyen, String maCD) {
        for (int i = 0; i < dsCD.size(); i++) {
            ChuDe item = dsCD.get(i);

            if ( item.getMa().equals(maCD) ) {
                item.themTruyen(truyen);
                return;
            }
        }

        System.out.println("Không tìm thấy chủ đề: " + maCD);
    }

    public void xoaTruyen(String idXoa, String maCD) {
        for (int i = 0; i < dsCD.size(); i++) {
            ChuDe item = dsCD.get(i);

            if ( item.getMa().equals(maCD) ) {
                item.xoaTruyen(idXoa);
                return;
            }
        }

        System.out.println("Không tìm thấy chủ đề: " + maCD);
    }

    public void docTruyen(String idTruyen, String maCD) {
        for (int i = 0; i < dsCD.size(); i++) {
            ChuDe item = dsCD.get(i);

            if ( item.getMa().equals(maCD) ) {
                item.docTruyen(idTruyen);
                return;
            }
        }

        System.out.println("Không tìm thấy chủ đề: " + maCD);
    }

    public Truyen timTruyenTheoId(String idTruyen, String maCD) {
        for (int i = 0; i < dsCD.size(); i++) {
            ChuDe item = dsCD.get(i);

            if ( item.getMa().equals(maCD) ) {
                return item.timTruyenTheoId(idTruyen);
            }
        }

        return null;
    }

    public ArrayList<Truyen> timTruyenTheoTen(String ten, String maCD) {
        for (int i = 0; i < dsCD.size(); i++) {
            ChuDe item = dsCD.get(i);

            if ( item.getMa().equals(maCD) ) {
               return item.timTruyenTheoTen(ten);
            }
        }

        return null;
    }
}
