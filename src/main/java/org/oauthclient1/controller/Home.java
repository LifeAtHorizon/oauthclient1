package org.oauthclient1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
	return "index";	
	}
	
	@RequestMapping(value="/securePage",method=RequestMethod.GET)
	public String securePage() {
		return "securePage";
	}
}
