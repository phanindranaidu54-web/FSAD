package com.klu;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
<<<<<<< HEAD
		return application.sources(Skill7ExpApplication.class);
=======
		return application.sources(Skill6ExpApplication.class);
>>>>>>> 7380ab6ae8315514d31a92e826bdbd14665b633f
	}

}
