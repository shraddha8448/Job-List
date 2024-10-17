package com.mongodb.joblisting.repository;

import com.mongodb.joblisting.modal.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
