package com.fy.travelscritic.background.comment.comtroller;


import com.fy.travelscritic.background.comment.domain.Comments;
import com.fy.travelscritic.background.comment.service.CommentsService;
import com.fy.travelscritic.config.DataGridVo;
import com.fy.travelscritic.config.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("com")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

    @RequestMapping("upUserById")
    @ResponseBody
    public List<Comments> upUserById(Integer travelsId) {

        List<Comments> comList = commentsService.upUserById(travelsId);
        return comList;
    }

    @RequestMapping("upUserByLv")
    @ResponseBody
    public List<Comments> upUserByLv(Integer userId,Integer travelsId) {

        List<Comments> comList = commentsService.upUserByLv(userId,travelsId);
        return comList;
    }


}
