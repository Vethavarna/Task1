package com.sopra.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Sopra {
@RequestMapping("/Vetha")

public String Vetha() {
	return "index";
}

@RequestMapping("/About")
public String About() {
	return "index1";
}
                

}
