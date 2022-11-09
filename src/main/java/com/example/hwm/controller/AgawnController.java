package com.example.hwm.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.hwm.model.*;
import com.example.hwm.repository.*;
import org.springframework.data.domain.Sort;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class AgawnController {

    @Autowired
	private LaboratoryRepository laboratoryRepository;

    @GetMapping("/hello")
	public String getHello() {
		return "Hello World WEWEWEWEW!";
	}

    @GetMapping("/labresults")
	public List<Laboratory> getAllUsers() {
		return laboratoryRepository.findAll(Sort.by(Sort.Direction.DESC,"laboratory_created"));
	}

}
