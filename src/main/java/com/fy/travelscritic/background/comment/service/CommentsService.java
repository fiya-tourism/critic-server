package com.fy.travelscritic.background.comment.service;


import com.fy.travelscritic.background.comment.domain.Comments;
import com.fy.travelscritic.background.comment.domain.ItemComment;
import com.fy.travelscritic.background.comment.domain.SpotsComment;
import com.fy.travelscritic.config.DataGridVo;
import com.fy.travelscritic.config.Page;
import com.fy.travelscritic.config.ResultMsg;

import java.util.List;

public interface CommentsService {
    List<Comments> upUserById(Integer travelsId);
    ResultMsg upTravelYn(Comments comments);
    DataGridVo selTravelsQuery(Page page);
    ResultMsg insertTravels(Comments comments);



    DataGridVo selItemQuery(Page page);
    List<ItemComment> upItemById(Integer itemId);
    ResultMsg upItemYn(ItemComment itemComment);
    ResultMsg insertItem(ItemComment itemComment);


    List<SpotsComment> upSpotsById(Integer spotsId);
    ResultMsg upSpotsYn(SpotsComment spotsComment);
    ResultMsg insertSpots(SpotsComment spotsComment);


}
