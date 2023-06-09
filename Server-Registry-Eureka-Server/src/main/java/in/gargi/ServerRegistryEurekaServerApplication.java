package in.gargi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerRegistryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegistryEurekaServerApplication.class, args);
	}

}
