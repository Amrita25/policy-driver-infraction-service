package io.driverinfractionservice.policydriverinfractionservice;

import java.util.Date;

import io.driverinfractionservice.policydriverinfractionservice.dao.InfractionRepository;
import io.driverinfractionservice.policydriverinfractionservice.model.Infraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PolicyDriverInfractionServiceApplication implements CommandLineRunner{
	
	@Autowired
	InfractionRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(PolicyDriverInfractionServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		long count = repo.count();

		if (count == 0) {
			repo.save(new Infraction("BVY123", "001", "ATFAULT", new Date()));
			repo.save(new Infraction("ABC123", "002", "ATFAULT", new Date()));
		}
		
	}

}
