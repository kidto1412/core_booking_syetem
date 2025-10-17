package com.example.demo;

// import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class BookingSystemApplication implements CommandLineRunner {
	public final Logger LOG = LoggerFactory.getLogger(BookingSystemApplication.class);

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookingSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		List<User> users = userRepository.findAll();
		LOG.info("Books : " + users);

	}

}
