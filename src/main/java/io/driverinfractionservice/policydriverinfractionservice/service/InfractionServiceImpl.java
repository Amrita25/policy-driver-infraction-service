package io.driverinfractionservice.policydriverinfractionservice.service;

import io.driverinfractionservice.policydriverinfractionservice.dao.InfractionRepository;
import io.driverinfractionservice.policydriverinfractionservice.model.Infraction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfractionServiceImpl implements InfractionService {
	
	@Autowired
	InfractionRepository repo;

	@Override
	public List<Infraction> findByLicenseNumber(String licenseNumber) {
		// TODO Auto-generated method stub
		return repo.findByLicenseNumber(licenseNumber);
	}

	@Override
	public Infraction saveNewInfraction(Infraction infraction) {
		// TODO Auto-generated method stub
		return repo.save(infraction);
	}

}
