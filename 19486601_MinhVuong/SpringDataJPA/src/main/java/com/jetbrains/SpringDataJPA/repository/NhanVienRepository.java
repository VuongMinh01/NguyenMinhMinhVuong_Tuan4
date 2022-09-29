package com.jetbrains.SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jetbrains.SpringDataJPA.entity.MayBay;
import com.jetbrains.SpringDataJPA.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

	@Query( value =  " select * from nhanvien where  > 10000",nativeQuery = true ) 
	List<MayBay> findMayBayTamBayLonHon10000();
}
