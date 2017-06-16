package org.makarands.services;

import javax.annotation.PostConstruct;

import org.makarands.domain.Author;
import org.makarands.domain.Post;
import org.makarands.repository.AuthorRepository;
import org.makarands.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	@Autowired
	public DataLoader(PostRepository postRepository,AuthorRepository authorRepository){
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}
	
	@PostConstruct
	private void loadData(){
		// create an author
		Author mb = new Author("Makarand","Bhoir");
		authorRepository.save(mb);
		
		// create a post
		Post post = new Post("Spring Data Rocks!");
		post.setBody("Post Body here...");
		post.setAuthor(mb);
		postRepository.save(post);
	}
	
}
