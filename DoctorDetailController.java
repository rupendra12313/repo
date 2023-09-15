package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/doctordetail")
public class DoctorDetailController {
	
	
	private List<DoctorDetail> DoctorDetail1 = new ArrayList();
	
	@PostMapping
	public ResponseEntity<DoctorDetail> add(@RequestBody DoctorDetail doctordetail) {

		DoctorDetail1.add(doctordetail);

		return new ResponseEntity<DoctorDetail>(doctordetail, HttpStatus.CREATED);

	}
	
	
	
}


