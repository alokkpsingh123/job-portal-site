package com.alok.Jobportal.repository;

import com.alok.Jobportal.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
    //will take care of all the crud operations.

}
