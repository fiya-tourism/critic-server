package com.fy.travelscritic.background.comment.comtroller;


import com.fy.travelscritic.background.comment.domain.Comments;
import com.fy.travelscritic.background.comment.domain.ItemComment;
import com.fy.travelscritic.background.comment.domain.SpotsComment;
import com.fy.travelscritic.background.comment.service.CommentsService;
import com.fy.travelscritic.config.DataGridVo;
import com.fy.travelscritic.config.Page;
import com.fy.travelscritic.config.ResultMsg;
import com.fy.travelscritic.config.ResultVo;
import io.swagger.annotations.ApiOperation;
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

//------------------------------------------------sl------------------------------------------------------------------------
    /**
     * 根据游记Id查看相关评论
     * @param travelsId
     * @return
     */
    @RequestMapping("upUserById")
    @ResponseBody
    public List<Comments> upUserById(Integer travelsId) {

        List<Comments> comList = commentsService.upUserById(travelsId);
        return comList;
    }

    /**
     * 审核游记评论
     * @param comments
     * @return
     */
    @RequestMapping("upTravelsYn")
    @ResponseBody
    public ResultMsg upTravelsYn (Comments comments){
        return commentsService.upTravelYn(comments);
    }

    /**
     * 新增游记评论
     * @param comments
     * @return
     */
    @RequestMapping("insertTravels")
    @ResponseBody
    public ResultMsg insertTravels(Comments comments){
        return commentsService.insertTravels(comments);
    }

//----------------------------------------------h17--------------------------------------------------------------------------
    /**
     * 根据旅游Id查看评价
     * @param spotsId
     * @return
     */
    @ApiOperation("")
    @RequestMapping("upSpotsById")
    @ResponseBody
    public List<SpotsComment> upSpotsById(Integer spotsId) {

        List<SpotsComment> comList = commentsService.upSpotsById(spotsId);
        return comList;
    }
    /**
     * 审核商品评价
     * @param ItemComment
     * @return
     */
    @RequestMapping("upItemYn")
    @ResponseBody
    public ResultMsg upItemYn (ItemComment ItemComment){
        return commentsService.upItemYn(ItemComment);
    }

    /**
     * 新增商品评论
     * @param itemComment
     * @return
     */
    @RequestMapping("insertItem")
    @ResponseBody
    public ResultMsg insertItem(ItemComment itemComment){
        return commentsService.insertItem(itemComment);
    }


//-------------------------------------------------pzx-----------------------------------------------------------------------
    /**
     * 根据商品Id查看评价
     * @param itemId
     * @return
     */
    @RequestMapping("upItemById")
    @ResponseBody
    public List<ItemComment> upItemById(Integer itemId) {

        List<ItemComment> comList = commentsService.upItemById(itemId);
        return comList;
    }


    /**
     * 审核游记评价
     * @param spotsComment
     * @return
     */
    @RequestMapping("upSpotsYn")
    @ResponseBody
    public ResultMsg upSpotsYn (SpotsComment spotsComment){
        return commentsService.upSpotsYn(spotsComment);
    }

    /**
     * 新增旅游评论
     * @param spotsComment
     * @return
     */
    @RequestMapping("insertSpots")
    @ResponseBody
    public ResultMsg insertSpots(SpotsComment spotsComment){
        return commentsService.insertSpots(spotsComment);
    }




}
