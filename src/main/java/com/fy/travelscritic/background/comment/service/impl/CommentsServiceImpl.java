package com.fy.travelscritic.background.comment.service.impl;


import com.fy.travelscritic.background.comment.domain.Comments;
import com.fy.travelscritic.background.comment.mapper.CommentsMapper;
import com.fy.travelscritic.background.comment.service.CommentsService;
import com.fy.travelscritic.config.DataGridVo;
import com.fy.travelscritic.config.Page;
import com.fy.travelscritic.config.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    private CommentsMapper commentsMapper;

    @Override
    public List<Comments> upUserById(Integer travelsId) {
        List<Comments> comments = commentsMapper.upUserById(travelsId);
        return comments;
    }

    @Override
    public List<Comments> upUserByLv(Integer userId,Integer travelsId) {
        List<Comments> comments = commentsMapper.upUserByLv(userId,travelsId);
        return comments;
    }


}
