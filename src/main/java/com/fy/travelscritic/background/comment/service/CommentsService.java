package com.fy.travelscritic.background.comment.service;


import com.fy.travelscritic.background.comment.domain.Comments;
import com.fy.travelscritic.config.DataGridVo;
import com.fy.travelscritic.config.Page;

import java.util.List;

public interface CommentsService {
    List<Comments> upUserById(Integer travelsId);

    List<Comments> upUserByLv(Integer userId,Integer travelsId);
}
