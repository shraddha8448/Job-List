package com.mongodb.joblisting.repository;

import com.mongodb.joblisting.modal.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
