package com.jetbrains.SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jetbrains.SpringDataJPA.entity.MayBay;
import com.jetbrains.SpringDataJPA.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

	@Query( value =  " select * from nhanvien where  Luong < 10000",nativeQuery = true ) 
	List<NhanVien> findNhanVienLuongBeHon10000();
	
	@Query( value =  " select sum(Luong) from nhanvien ",nativeQuery = true ) 
	public double sumLuong();
	
	@Query( value =  " select MaNV from nhanvien where Luong = max(Luong) ",nativeQuery = true ) 
	public List<NhanVien> findNhanVienCoLuongCaoNhat();
}
