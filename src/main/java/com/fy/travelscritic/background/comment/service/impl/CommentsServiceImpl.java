package com.fy.travelscritic.background.comment.service.impl;


import com.fy.travelscritic.background.comment.mapper.CommentsMapper;
import com.fy.travelscritic.background.comment.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    private CommentsMapper commentsMapper;


}
