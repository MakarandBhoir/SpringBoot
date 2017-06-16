package org.makarands;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.makarands.domain.Post;
import org.makarands.repository.PostRepository;
import org.makarands.services.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2Application 
{
	private static final Logger logger = Logger.getLogger(H2Application.class);

	@Autowired 
	PostRepository postRepository;
	
	@Autowired
	DataLoader dataLoader;
	
    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }
    
    @PostConstruct
    void seePosts()
    {
    	for(Post post : postRepository.findAll() )
    	{
    		logger.info(post.toString());
    	}
    }
}