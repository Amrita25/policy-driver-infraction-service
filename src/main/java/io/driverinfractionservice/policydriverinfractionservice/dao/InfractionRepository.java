package io.driverinfractionservice.policydriverinfractionservice.dao;

import java.util.List;

import io.driverinfractionservice.policydriverinfractionservice.model.Infraction;

import org.springframework.data.jpa.repository.JpaRepository;



public interface InfractionRepository extends JpaRepository<Infraction, Long> {
	List<Infraction> findByLicenseNumber(String licenseNumber);

}
