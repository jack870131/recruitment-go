package com.recruit.recruitment.controller;

import com.recruit.recruitment.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
  @Autowired
  private PostService postService;
}