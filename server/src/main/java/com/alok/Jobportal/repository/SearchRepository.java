package com.alok.Jobportal.repository;

import com.alok.Jobportal.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
