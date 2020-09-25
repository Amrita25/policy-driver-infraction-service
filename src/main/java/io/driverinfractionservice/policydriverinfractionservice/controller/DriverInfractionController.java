package io.driverinfractionservice.policydriverinfractionservice.controller;

import java.util.List;
import java.util.Map;

import io.driverinfractionservice.policydriverinfractionservice.dao.InfractionRepository;
import io.driverinfractionservice.policydriverinfractionservice.model.DriverInfraction;
import io.driverinfractionservice.policydriverinfractionservice.model.Infraction;
import io.driverinfractionservice.policydriverinfractionservice.service.InfractionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverInfractionController {
	
	@Autowired
	private InfractionService service;
	
	@PostMapping("/add-infraction/{licenseNumber}")
	public ResponseEntity<Infraction> saveNewInfraction(@RequestBody Infraction infraction,@PathVariable String licenseNumber){
		System.out.println("inside save new infraction");
		infraction.setLicenseNumber(licenseNumber);
		return new ResponseEntity<Infraction>(service.saveNewInfraction(infraction),HttpStatus.CREATED);
	}
	
	@GetMapping("/driver-infraction/{licenseNum}")
	public DriverInfraction retrieveInfractions(@PathVariable String licenseNum,@RequestHeader Map<String, String> headers) {
		
		List<Infraction> infractions= service.findByLicenseNumber(licenseNum);
		DriverInfraction driverInfraction = new DriverInfraction();
		driverInfraction.setInfractions(infractions);
		
		return driverInfraction;
	}

}
