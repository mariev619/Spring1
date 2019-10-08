package com.wildcodeschool.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String wh() {
		return "<a href='https://en.wikipedia.org/wiki/William_Hartnell'>William Hartnell</a>";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String pt() {
		return "<a href='https://en.wikipedia.org/wiki/Patrick_Troughton'>Patrick Troughton</a>";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String jp() {
		return "<a href='https://en.wikipedia.org/wiki/Jon_Pertwee'>Jon Pertwee</a>";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String tb() {
		return "<a href='https://en.wikipedia.org/wiki/Tom_Baker'>Tom Baker</a>";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul><li><a href='/doctor/1'>William Hartnell</a></li>" +
                "<li><a href='/doctor/2'>Patrick Troughton</a></li>" +
                "<li><a href='/doctor/3'>Jon Pertwee</a></li>" +
                "<li><a href='/doctor/4'>Tom Baker</a></li></ul>";
	}

}
