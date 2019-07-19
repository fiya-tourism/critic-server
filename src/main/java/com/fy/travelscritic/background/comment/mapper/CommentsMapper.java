package com.fy.travelscritic.background.comment.mapper;


import com.fy.travelscritic.background.comment.domain.Comments;
import com.fy.travelscritic.config.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface CommentsMapper {

    int insert(Comments record);


    List<Comments> upUserById(Integer travelsId);


    void upTravelYn(@Param("comTravelsUpdate") Date comTravelsUpdate,@Param("comTravelsId") Integer comTravelsId,@Param("comTravelsYn") Integer comTravelsYn);

    List<Comments> queryTravelList(Page page);
}