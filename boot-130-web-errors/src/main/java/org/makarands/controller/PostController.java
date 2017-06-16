package org.makarands.controller;

import org.apache.log4j.Logger;
import org.makarands.domain.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {
	
	private static final Logger logger = Logger.getLogger(PostController.class);

	@SuppressWarnings("unused")
	@RequestMapping("/get/{val}")
	public String getPost( @PathVariable(value="val") String value ) throws Exception {
		//Post post = null;
		Post post = new Post();
		logger.debug("getPost called with slug: " + value);
		if( post == null ) 
		{
			throw new Exception("We couldn't find the post with slug: " + value);
		}
		return "post";
	}
		
	@ExceptionHandler(Exception.class)
	public String handleException(Exception exception, Model model)
	{
		logger.error("Exception Occured", exception);
		model.addAttribute("errorMessage", exception.getMessage() );
		return "error";
	}
	
	
}
