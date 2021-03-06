package guru.springframeword.sfgpetclinic;

import guru.springframeword.sfgpetclinic.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}
}
