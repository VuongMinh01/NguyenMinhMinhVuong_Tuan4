package com.jetbrains.SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jetbrains.SpringDataJPA.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	
	@Query( value =  " select * from chuyenbay where GaDen = 'DAD'",nativeQuery = true ) 
	public List<ChuyenBay> findChuyenBaysDaLat();
	
	
	
}
