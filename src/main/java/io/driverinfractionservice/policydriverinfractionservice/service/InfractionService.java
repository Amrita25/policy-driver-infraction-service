package io.driverinfractionservice.policydriverinfractionservice.service;

import io.driverinfractionservice.policydriverinfractionservice.model.Infraction;

import java.util.List;

public interface InfractionService {
	
	List<Infraction> findByLicenseNumber(String licenseNumber);

	Infraction saveNewInfraction(Infraction infraction);

}
