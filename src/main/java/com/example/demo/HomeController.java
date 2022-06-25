package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping(value = "/") // flags the index() method to support the / route.
	public String index() {
		return "index";          // It returns index as the name of the template, 
                                 // which Spring Boot’s autoconfigured view resolver will map to src/main/resources/templates/index.html.
	}

}