package com.kosa.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@Autowired
	IPatientService patientService;
	
	@Autowired
	IVacService vacService;
	
	@RequestMapping(value = "/menu", method=RequestMethod.GET)
	public String menu() {
		return "menu";
	}
	
	@RequestMapping(value = "/patient/getInfo", method=RequestMethod.GET)
	public String getInfo() {
		return "patient/getInfo";
	}
	
	@RequestMapping(value = "/patient/getInfo", method=RequestMethod.POST)
	public String getInfo(@PathVariable String name, String birthDate, Model model) {
		PatientVO patient = patientService.getInfo(name, birthDate);
		if(patient!=null) {
			model.addAttribute("patient", patient);
		} else {
			model.addAttribute("message", "해당 정보가 없습니다.");
			return "patient/info";
		}
		
		VacVO vac = vacService.getVacInfo(patient.getRotNumber());
		model.addAttribute("vac", vac);
		
		return "patient/info";
	}
}


