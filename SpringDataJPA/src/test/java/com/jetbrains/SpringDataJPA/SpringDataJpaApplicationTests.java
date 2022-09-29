package com.jetbrains.SpringDataJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jetbrains.SpringDataJPA.entity.ChuyenBay;
import com.jetbrains.SpringDataJPA.entity.MayBay;
import com.jetbrains.SpringDataJPA.repository.ChuyenBayRepository;
import com.jetbrains.SpringDataJPA.repository.MayBayRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	ChuyenBayRepository chuyenBayRepository; 

	@Autowired
	MayBayRepository mayBayRepository;
	
	@Test
	void cau1() {
		List<ChuyenBay> chuyenBays ;
		
		chuyenBays = chuyenBayRepository.findChuyenBaysDaLat();
		for (ChuyenBay chuyenBay : chuyenBays) {
			System.out.println(chuyenBay);
		}
	}
	
	@Test
	void cau2() {
		List<MayBay> mayBays;
		mayBays = mayBayRepository.findMayBayTamBayLonHon10000();
		for (MayBay mayBay : mayBays) {
			System.out.println(mayBay);
		}
		
	}

}