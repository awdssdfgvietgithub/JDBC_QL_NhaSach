/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

import java.util.Date;

/**
 *
 * @author ThinhDN
 */
public class KhachHang_pojo {

    private String maKH;
    private String tenKH;
    private String sdtKH;
    private String email;
    private String giamGia;
    private String loaiThe;
    private String soDiem;

    public KhachHang_pojo(String maKH, String tenKH, String sdtKH, String email, String giamGia, String loaiThe, String soDiem) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdtKH = sdtKH;
        this.email = email;
        this.giamGia = giamGia;
        this.loaiThe = loaiThe;
        this.soDiem = soDiem;
    }

    public KhachHang_pojo() {
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(String giamGia) {
        this.giamGia = giamGia;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public String getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(String soDiem) {
        this.soDiem = soDiem;
    }

    
}
