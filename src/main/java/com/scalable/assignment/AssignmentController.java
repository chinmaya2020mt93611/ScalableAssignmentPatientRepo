package com.scalable.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentController {

	@GetMapping("/getDetails")
	public String index() {
		return "Scalable Assignment!";
	}
	
	// API: POST - /add/patientDetails
	@PostMapping("/add/patientDetails")
	public void addPatient(String patientid) {
		
	}
	
	@PutMapping("/update/patientDetails")
	public void updatePatient(String patientid) {
		
	}
	
	@PostMapping("/fetch/patientDrugDetails")
	public void fetchDrug(String patientid) {
		//API that Komal will build
		
	}

}