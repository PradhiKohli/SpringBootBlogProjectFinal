package com.tts.techtalentblog.repo;


import com.tts.techtalentblog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Long is a type
// its a wrapper class that represents your id
// anything in the diamond is known as a generic or type parameters
@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
    List<BlogPost> findAll();
//    List<BlogPost> findByAuthorIgnoreCase(String author);
//	List<BlogPost> save(String blogPost);

    BlogPost findById(long id);
    BlogPost deleteById(long id);

}

