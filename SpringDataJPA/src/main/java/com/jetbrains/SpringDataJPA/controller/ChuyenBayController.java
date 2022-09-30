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
	
	@GetMapping("/didalat")
	public List<ChuyenBay> findChuyenBaysDaLat(){
		return chuyenBayRepository.findChuyenBaysDaLat();
	}
	
}
