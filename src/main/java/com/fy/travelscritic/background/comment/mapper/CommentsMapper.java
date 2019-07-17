package com.fy.travelscritic.background.comment.mapper;


import com.fy.travelscritic.background.comment.domain.Comments;

public interface CommentsMapper {
    int deleteByPrimaryKey(Integer comTravelsId);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Integer comTravelsId);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);
}