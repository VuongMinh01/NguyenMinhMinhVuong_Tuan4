package com.jetbrains.SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jetbrains.SpringDataJPA.entity.NhanVien;
import com.jetbrains.SpringDataJPA.repository.NhanVienRepository;

@RestController
public class NhanVienController {
	
	@Autowired
	NhanVienRepository nhanVienRepository;
	
	@GetMapping("/cau3")
	List<NhanVien> findNhanVienLuongBeHon10000(){
		return nhanVienRepository.findNhanVienLuongBeHon10000();
	}
}
