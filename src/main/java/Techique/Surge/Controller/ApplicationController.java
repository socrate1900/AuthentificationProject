package Techique.Surge.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*In this class I want to Implement the security for other Controller*/
@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {

	@GetMapping("/getMsg") // here I define my Url
	public String MyMethode() {
		return "Hello this is the new test 2012";

	}
}
