package com.fy.travelscritic.background.comment.mapper;

import com.fy.travelscritic.background.comment.domain.SpotsComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface SpotsCommentMapper {

    int insert(SpotsComment record);


    List<SpotsComment> upSpotsById(Integer spotsId);

    void upSpotsYn(@Param("comSpotsId") Integer comSpotsId,@Param("comSpotsUpdate") Date comSpotsUpdate,@Param("comSpotsYn") Integer comSpotsYn);
}