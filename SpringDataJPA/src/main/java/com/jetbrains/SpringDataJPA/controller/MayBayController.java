package com.jetbrains.SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jetbrains.SpringDataJPA.entity.MayBay;
import com.jetbrains.SpringDataJPA.repository.MayBayRepository;

@RestController
public class MayBayController {
	
	@Autowired
	MayBayRepository mayBayRepository;
	
	@GetMapping("/cau2")
	public List<MayBay> findMayBayTamBayLonHon10000(){
		return mayBayRepository.findMayBayTamBayLonHon10000();
	}
	
	
	@GetMapping("/cau7")
	public int countBoeing (){
		return mayBayRepository.countBoeing();
	}
	
	@GetMapping("/cau13")
	public List<String> findMayBayCoTheThucHienCB820(){
		return mayBayRepository.findMayBayCoTheThucHienCB820();
	}

}
