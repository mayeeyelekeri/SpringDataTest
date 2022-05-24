package com.mine.SpringDataTest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mine.SpringDataTest.Model.FullName;
import com.mine.SpringDataTest.service.FullNameService;

@RestController
@RequestMapping("/test")
public class TestController {

	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping(produces = { "application/json" })
    public @ResponseBody String hello() {
		
		System.out.println("inside TestController::hello()");
		return "hello from controller";
    }		
}
