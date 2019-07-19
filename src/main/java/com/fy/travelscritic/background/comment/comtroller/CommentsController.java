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
import org.springframework.web.bind.annotation.RequestBody;
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
    @ApiOperation(value = "根据游记主键查询全部与此主键相关的数据",nickname = "只需要知道游记主键Id即可使用该接口")
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
    @ApiOperation(value = "根据Yn审核评论的通过与不通过",nickname = "只需要通过当前游记的主键即可调用接口")
    @ResponseBody
    public ResultMsg upTravelsYn (@RequestBody Comments comments){
        return commentsService.upTravelYn(comments);
    }

    /**
     * 新增游记评论
     * @param comments
     * @return
     */
    @RequestMapping("insertTravels")
    @ApiOperation(value = "新增游记评论的接口",nickname = "只需要写出评论语句就可以其他的后台已经处理完成")
    @ResponseBody
    public ResultMsg insertTravels(@RequestBody Comments comments){
        return commentsService.insertTravels(comments);
    }

    /**
     * 查询全部评论
     * @param page
     * @return
     */
    @RequestMapping("selTravelsQuery")
    @ApiOperation(value = "查询全部游记评论",nickname = "查询全部接口供修改使用")
    @ResponseBody
    public DataGridVo selTravelsQuery(@RequestBody Page page){
        return commentsService.selTravelsQuery(page);
    }

//----------------------------------------------h17--------------------------------------------------------------------------
    /**
     * 根据商品Id查看评价
     * @param itemId
     * @return
     */
    @RequestMapping("upItemById")
    @ApiOperation(value = "根据商品主键查询全部与此主键相关的数据",nickname = "只需要知道商品Id即可使用该接口")
    @ResponseBody
    public List<ItemComment> upItemById(Integer itemId) {

        List<ItemComment> comList = commentsService.upItemById(itemId);
        return comList;
    }

    /**
     * 审核商品评价
     * @param ItemComment
     * @return
     */
    @RequestMapping("upItemYn")
    @ApiOperation(value = "根据Yn审核评价的通过与不通过",nickname = "只需要通过当前商品的主键即可调用接口")
    @ResponseBody
    public ResultMsg upItemYn (ItemComment ItemComment){
        return commentsService.upItemYn(ItemComment);
    }

    /**
     * 新增商品评价
     * @param itemComment
     * @return
     */
    @RequestMapping("insertItem")
    @ApiOperation(value = "新增商品评价的接口",nickname = "只需要写出评价语句就可以其他的后台已经处理完成")
    @ResponseBody
    public ResultMsg insertItem(ItemComment itemComment){
        return commentsService.insertItem(itemComment);
    }


//-------------------------------------------------pzx-----------------------------------------------------------------------
    /**
     * 审核游记评价
     * @param spotsComment
     * @return
     */
    @RequestMapping("upSpotsYn")
    @ApiOperation(value = "根据Yn审核评价的通过与不通过",nickname = "只需要通过当前旅游的主键即可调用接口")
    @ResponseBody
    public ResultMsg upSpotsYn (SpotsComment spotsComment){
        return commentsService.upSpotsYn(spotsComment);
    }

    /**
     * 新增旅游评价
     * @param spotsComment
     * @return
     */
    @ApiOperation(value = "新增旅游评价的接口",nickname = "只需要写出评价语句就可以其他的后台已经处理完成")
    @RequestMapping("insertSpots")
    @ResponseBody
    public ResultMsg insertSpots(SpotsComment spotsComment){
        return commentsService.insertSpots(spotsComment);
    }
    /**
     * 根据旅游Id查看评价
     * @param spotsId
     * @return
     */
    @RequestMapping("upSpotsById")
    @ApiOperation(value = "根据旅游主键查询全部与此主键相关的数据",nickname = "只需要知道旅游主键Id即可使用该接口")
    @ResponseBody
    public List<SpotsComment> upSpotsById(Integer spotsId) {

        List<SpotsComment> comList = commentsService.upSpotsById(spotsId);
        return comList;
    }



}
