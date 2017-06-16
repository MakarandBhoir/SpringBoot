package org.makarands.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController 
{	
	private static final Logger logger = Logger.getLogger(PostController.class);
	
	@RequestMapping("/get")
	public String getPost()
	{
		logger.info("--- In post method ---");
		return "post";
	}
}

