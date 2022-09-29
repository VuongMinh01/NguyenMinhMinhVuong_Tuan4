package com.jetbrains.SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jetbrains.SpringDataJPA.entity.ChuyenBay;
import com.jetbrains.SpringDataJPA.entity.MayBay;

public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
	
	@Query( value =  " select * from maybay where tamBay > 10000",nativeQuery = true ) 
	List<MayBay> findMayBayTamBayLonHon10000();
	
	@Query( value =  " select count(MaMB) from maybay where Loai = 'Boeing'",nativeQuery = true ) 
	public int countBoeing();
	
	@Query( value =  " select Loai from maybay where TamBay > (select DoDai from chuyenbay where MaCB = 'VN820')",nativeQuery = true ) 
	List<String> findMayBayCoTheThucHienCB820();
}
