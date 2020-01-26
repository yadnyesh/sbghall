package io.yadnyesh.sbghall;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.yadnyesh.sbghall.model.User;
import io.yadnyesh.sbghall.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class SbghallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbghallApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(UserService userService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
				List<User> users = mapper.readValue(inputStream, typeReference);
				userService.saveUsers(users);

		};
	}

}
