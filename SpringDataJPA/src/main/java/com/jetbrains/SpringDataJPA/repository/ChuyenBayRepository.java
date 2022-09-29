package com.jetbrains.SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jetbrains.SpringDataJPA.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	
	@Query( value =  " select * from chuyenbay where GaDen = 'DAD'",nativeQuery = true ) 
	public List<ChuyenBay> findChuyenBaysDaLat();
	
	@Query( value =  " select * from chuyenbay where DoDai < 10000 AND DoDai > 8000",nativeQuery = true ) 
	public List<ChuyenBay> findChuyenBaysDoDaiLon10000VaNho8000();
	
	@Query( value =  " select * from chuyenbay where GaDi = 'SGN' AND GaDen = 'BMV'",nativeQuery = true ) 
	public List<ChuyenBay> findChuyenBaySGDenBMT();
	
	@Query( value =  " select count(MaCB) from chuyenbay where GaDi = 'SGN'",nativeQuery = true ) 
	public int countSaiGon();
	
	@Query( value =  " select * from chuyenbay where GioDi < '12:00:00' ",nativeQuery = true ) 
	public List<ChuyenBay> findChuyenBayTruoc12Gio();
	
	@Query( value =  " select * from chuyenbay where DoDai < (select TamBay from maybay where Loai = 'Airbus A320')",nativeQuery = true ) 
	List<ChuyenBay> findChuyenBayCoTheThucHienBoiA320();
}
