package com.fy.travelscritic.background.comment.mapper;

import com.fy.travelscritic.background.comment.domain.ItemComment;
import com.fy.travelscritic.background.comment.domain.SpotsComment;
import com.fy.travelscritic.config.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface ItemCommentMapper {

    int insert(ItemComment record);


    List<ItemComment> upItemById(Integer itemId);

    void upItemYn(@Param("comItemId") Integer comItemId,@Param("comItemYn") Integer comItemYn,@Param("comItemUpdate") Date comItemUpdate);

    List<ItemComment> selItemQuery(Page page);
}