/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import POJO.NhanVien_pojo;

/**
 *
 * @author ThinhDN
 */
public class NhanVien_dao {

    public static ArrayList<NhanVien_pojo> layDanhSachNhanVien() {
        ArrayList<NhanVien_pojo> dsNV = new ArrayList<>();
        try {
            String sql = "Select * from NHANVIEN";
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ResultSet rs = ds.executeQuery(sql);
            while (rs.next()) {
                NhanVien_pojo hd = new NhanVien_pojo();
                hd.setMaNV(rs.getString("maNV"));
                hd.setTenNV(rs.getString("tenNV"));
                hd.setCccd(rs.getString("CCCD"));
                hd.setSdtNV(rs.getString("SDT"));
                hd.setThamNien(rs.getString("thamNien"));
                hd.setDiaChi(rs.getString("diaChi"));
                hd.setEmail(rs.getString("email"));
                hd.setChucVu(rs.getString("chucVu"));
                hd.setMatKhau(rs.getString("matKhau"));
                hd.setKyNangQL(rs.getString("kyNangQL"));
                hd.setKyNangTinhToan(rs.getString("kyNangTinhToan"));
                hd.setKinhNghiem(rs.getString("kinhNghiem"));
                dsNV.add(hd);
            }
            ds.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNV;
    }

    public static boolean themNhanVien(NhanVien_pojo nv) {
        boolean kq = false;
        String sql = String.format("Insert into NHANVIEN (maNV,tenNV,CCCD,SDT,thamNien,diaChi,email,chucVu,"
                + "matKhau,kyNangQL,kyNangTinhToan,kinhNghiem) Values ('%s',N'%s','%s','%s','%s',N'%s','%s',N'%s','%s','%s','%s','%s')", nv.getMaNV(), nv.getTenNV(), nv.getCccd(), nv.getSdtNV(), nv.getThamNien(), nv.getDiaChi(), nv.getEmail(), nv.getChucVu(), nv.getMatKhau(), nv.getKyNangQL(), nv.getKyNangTinhToan(), nv.getKinhNghiem());
        SQLServerDataProvider ds = new SQLServerDataProvider();
        ds.open();
        int n = ds.executeUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        ds.close();
        return kq;
    }

    public static void themQuyenNhanVienThuNgan(String tk, String mk) {
        try {
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ds.statement = ds.connection.prepareCall("{call pr_TaoTK_TN(?,?)}");
            ds.statement.setString(1, tk);
            ds.statement.setString(2, mk);
            ds.statement.execute();
            ds.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void themQuyenNhanVienKho(String tk, String mk) {
        try {
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ds.statement = ds.connection.prepareCall("{call pr_TaoTK_K(?,?)}");
            ds.statement.setString(1, tk);
            ds.statement.setString(2, mk);
            ds.statement.execute();
            ds.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void xoaQuyenNhanVien(String tk) {
        try {
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ds.statement = ds.connection.prepareCall("{call pr_XoaTK(?)}");
            ds.statement.setString(1, tk);
            ds.statement.execute();
            ds.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean xoaNhanVien(String maNV) {
        boolean kq = false;
        String sql = String.format("Delete from NHANVIEN where maNV='%s'", maNV);
        SQLServerDataProvider ds = new SQLServerDataProvider();
        ds.open();
        int n = ds.executeUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        ds.close();
        return kq;
    }

    public static NhanVien_pojo layNhanVien(int maNV) {
        NhanVien_pojo nv = null;
        try {
            String sql = "Select * from NHANVIEN where maNV = " + maNV;
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ResultSet rs = ds.executeQuery(sql);
            if (rs.next()) {
                nv = new NhanVien_pojo();
                nv.setMaNV(rs.getString("maNV"));
                nv.setTenNV(rs.getString("tenNV"));
                nv.setCccd(rs.getString("CCCD"));
                nv.setSdtNV(rs.getString("SDT"));
                nv.setThamNien(rs.getString("thamNien"));
                nv.setDiaChi(rs.getString("diaChi"));
                nv.setEmail(rs.getString("email"));
                nv.setChucVu(rs.getString("chucVu"));
                nv.setMatKhau(rs.getString("matKhau"));
                nv.setKyNangQL(rs.getString("kyNangQL"));
                nv.setKyNangTinhToan(rs.getString("kyNangTinhToan"));
                nv.setKinhNghiem(rs.getString("kinhNghiem"));
            }
            ds.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nv;
    }

    public static boolean capNhatNhanVien(NhanVien_pojo nv) {
        boolean kq = false;
        String sql = String.format("Update NHANVIEN set tenNV = N'%s' , CCCD = '%s',SDT='%s',thamNien='%s',diaChi =N'%s',email='%s',chucVu=N'%s',matKhau='%s',kyNangQL='%s',kyNangTinhToan='%s',kinhNghiem='%s' Where maNV = '%s'", nv.getTenNV(), nv.getCccd(), nv.getSdtNV(), nv.getThamNien(), nv.getDiaChi(), nv.getEmail(), nv.getChucVu(), nv.getMatKhau(), nv.getKyNangQL(), nv.getKyNangTinhToan(), nv.getKinhNghiem(), nv.getMaNV());
        SQLServerDataProvider ds = new SQLServerDataProvider();
        ds.open();
        int n = ds.executeUpdate(sql);
        if (n == 1) {
            kq = true;
        }
        ds.close();
        return kq;
    }

    public static boolean ktraMaNV(String maNV) {
        try {
            String sql = "Select * from NHANVIEN where maNV = '" + maNV + "'";
            SQLServerDataProvider ds = new SQLServerDataProvider();
            ds.open();
            ResultSet rs = ds.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
