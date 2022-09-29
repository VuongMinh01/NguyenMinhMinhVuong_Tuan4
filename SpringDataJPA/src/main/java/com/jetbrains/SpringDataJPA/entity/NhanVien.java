package com.jetbrains.SpringDataJPA.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name="nhanvien")
public class NhanVien {
    @Id
    @Column(name = "MaNV")
    private String maNV;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "Luong")
    private int luong;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public NhanVien(String maNV, String ten, int luong) {
		super();
		this.maNV = maNV;
		this.ten = ten;
		this.luong = luong;
	}
	public NhanVien() {
		super();
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", ten=" + ten + ", luong=" + luong + "]";
	}
    
    
}
