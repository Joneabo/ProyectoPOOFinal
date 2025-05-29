package taller.tallerautomotriz;

import org.springframework.boot.SpringApplication;

public class TestTallerautomotrizApplication {

	public static void main(String[] args) {
		SpringApplication.from(TallerautomotrizApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
