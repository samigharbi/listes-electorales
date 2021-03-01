package gouv.mtes.listeselectorales.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgentControler {
	@GetMapping("/")
	public String index() {
		// return System.getProperty("spring.config.location");
		return "index";
	}
}
