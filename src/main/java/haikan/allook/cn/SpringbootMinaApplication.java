package haikan.allook.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"haikan.allook.cn.mina"})
public class SpringbootMinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMinaApplication.class, args);
	}

}
