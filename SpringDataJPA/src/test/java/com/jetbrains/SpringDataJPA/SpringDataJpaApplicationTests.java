package com.jetbrains.SpringDataJPA;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jetbrains.SpringDataJPA.entity.ChuyenBay;
import com.jetbrains.SpringDataJPA.entity.MayBay;
import com.jetbrains.SpringDataJPA.entity.NhanVien;
import com.jetbrains.SpringDataJPA.repository.ChuyenBayRepository;
import com.jetbrains.SpringDataJPA.repository.MayBayRepository;
import com.jetbrains.SpringDataJPA.repository.NhanVienRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	ChuyenBayRepository chuyenBayRepository; 

	@Autowired
	MayBayRepository mayBayRepository;
	
	@Autowired
	NhanVienRepository nhanVienRepository;
	
//	@Test
//	void cau1() {
//		List<ChuyenBay> chuyenBays ;
//		
//		chuyenBays = chuyenBayRepository.findChuyenBaysDaLat();
//		for (ChuyenBay chuyenBay : chuyenBays) {
//			System.out.println(chuyenBay);
//		}
//	}
//	
//	@Test
//	void cau2() {
//		List<MayBay> mayBays;
//		mayBays = mayBayRepository.findMayBayTamBayLonHon10000();
//		for (MayBay mayBay : mayBays) {
//			System.out.println(mayBay);
//		}
//		
//	}
	
//	@Test
//	void cau3() {
//		List<NhanVien> nhanViens;
//		nhanViens = nhanVienRepository.findNhanVienLuongBeHon10000();
//		for (NhanVien nhanVien : nhanViens) {
//			System.out.println(nhanVien);
//		}
//		
//	}
	
//	@Test
//	void cau4() {
//		List<ChuyenBay> chuyenBays ;
//		
//		chuyenBays = chuyenBayRepository.findChuyenBaysDoDaiLon10000VaNho8000();
//		for (ChuyenBay chuyenBay : chuyenBays) {
//			System.out.println(chuyenBay);
//		}
//	}
	
//	@Test
//	void cau5() {
//		List<ChuyenBay> chuyenBays ;
//		
//		chuyenBays = chuyenBayRepository.findChuyenBaySGDenBMT();
//		for (ChuyenBay chuyenBay : chuyenBays) {
//			System.out.println(chuyenBay);
//		}
//	}
	
//	@Test
//	void cau6() {
//		int n = chuyenBayRepository.countSaiGon();
//		System.out.println("Số chuyến bay đi từ Sài Gòn (SGN): "+n);
//	}
	
//	@Test
//	void cau7() {
//		int n = mayBayRepository.countBoeing();
//		System.out.println("Số máy bay Boeing): "+n);
//	}
	
//	@Test
//	void cau8() {
//		double n = nhanVienRepository.sumLuong();
//		System.out.println("Số tiền lương phải trả): "+n);
//	}
	
//	@Test
//	void cau8() {
//		double n = nhanVienRepository.sumLuong();
//		System.out.println("Số tiền lương phải trả): "+n);
//	}
	
//	@Test
//	void cau20() {
//		List<ChuyenBay> chuyenBays ;
//		chuyenBays = chuyenBayRepository.findChuyenBayTruoc12Gio();
//		for (ChuyenBay chuyenBay : chuyenBays) {
//			System.out.println(chuyenBay);
//		}
//	}
	
//	@Test
//	void cau13() {
//		List<String> n = mayBayRepository.findMayBayCoTheThucHienCB820();
//		System.out.println("Các loại máy bay có thể thực hiện được chuyến bay 820 là: " +n);
//	}
	
//	@Test
//	void cau14() {
//		List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayCoTheThucHienBoiA320();
//		for (ChuyenBay chuyenBay : chuyenBays) {
//			System.out.println(chuyenBay);
//		}
//	}
	
	
}
