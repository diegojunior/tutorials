package br.com.poc.foobah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoobahApplication /*extends SpringBootServletInitializer*/ {

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FoobahApplication.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(FoobahApplication.class, args);
	}

}
