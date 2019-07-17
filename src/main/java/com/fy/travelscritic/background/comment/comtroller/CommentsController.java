package com.fy.travelscritic.background.comment.comtroller;


import com.fy.travelscritic.background.comment.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("comments")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;





}
