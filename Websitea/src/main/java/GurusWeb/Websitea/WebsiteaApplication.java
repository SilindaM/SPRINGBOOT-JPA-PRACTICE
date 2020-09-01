package GurusWeb.Websitea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("springboot")
@SpringBootApplication
public class WebsiteaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteaApplication.class, args);
	}

}
