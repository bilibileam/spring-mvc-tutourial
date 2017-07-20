package tutorial.spring.boot.controller;

import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@EnableSwagger2
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET,value ="/test")
	public String get() {
		return "get!";
	}
	
	@RequestMapping(method = RequestMethod.PUT,value ="/test")
	public String put() {
		return "put!";
	}

}
