package com.jetbrains.SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jetbrains.SpringDataJPA.entity.ChuyenBay;
import com.jetbrains.SpringDataJPA.repository.ChuyenBayRepository;

@RestController
public class ChuyenBayController {
	
	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	
	
	
	@GetMapping("/cau1")
	public List<ChuyenBay> findChuyenBaysDaLat(){
		return chuyenBayRepository.findChuyenBaysDaLat();
	}
	
	
	@GetMapping("/cau4")
	public List<ChuyenBay> findChuyenBaysDoDaiLon10000VaNho8000(){
		return chuyenBayRepository.findChuyenBaysDoDaiLon10000VaNho8000();
	}
	
	
	@GetMapping("/cau5")
	public List<ChuyenBay> findChuyenBaySGDenBMT(){
		return chuyenBayRepository.findChuyenBaySGDenBMT();
	}
	
	@GetMapping("/cau6")
	public int countSaiGon(){
		return chuyenBayRepository.countSaiGon();
	}
	
	@GetMapping("/cau14")
	public List<ChuyenBay> findChuyenBayCoTheThucHienBoiA320(){
		return chuyenBayRepository.findChuyenBayCoTheThucHienBoiA320();
	}
	
	
}
