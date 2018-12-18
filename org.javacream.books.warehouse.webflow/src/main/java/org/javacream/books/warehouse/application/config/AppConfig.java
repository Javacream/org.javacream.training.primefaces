package org.javacream.books.warehouse.application.config;

import org.javacream.books.warehouse.infrastructure.config.WebFlowConfig;
import org.javacream.books.warehouse.infrastructure.config.WebMvcConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="org.javacream")
@Import(value={
		WebMvcConfig.class,
		WebFlowConfig.class
	})
@ImportResource(value={"classpath:/spring/books-warehouse.xml"})
public class AppConfig {

}
