package se.systementor.startStreams;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import se.systementor.startStreams.models.Actor;

@SpringBootApplication
public class StartStreamsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StartStreamsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var alla = getAll();
		
	}

	private List<Actor> getAll() {
		return null;
	}

}
