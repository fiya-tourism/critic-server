package com.fy.travelscritic.background.comment.mapper;


import com.fy.travelscritic.background.comment.domain.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentsMapper {
    int deleteByPrimaryKey(Integer comTravelsId);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Integer comTravelsId);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);

    List<Comments> upUserById(Integer travelsId);

    List<Comments> upUserByLv(@Param("userId") Integer userId,@Param("travelsId") Integer travelsId);
}