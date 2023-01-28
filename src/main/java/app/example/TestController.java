package app.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "Keycloack CLIENT-CREDENTIALS secured resource gives: success";
	}

	@GetMapping("/test2")
	public String test2() {
		return "Keycloack USERNAME/PASSWORD secured resource gives: success";
	}
}
