package com.jetbrains.SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jetbrains.SpringDataJPA.entity.ChuyenBay;
import com.jetbrains.SpringDataJPA.entity.MayBay;

public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
	
	@Query( value =  " select * from maybay where tamBay > 10000",nativeQuery = true ) 
	List<MayBay> findMayBayTamBayLonHon10000();
}
