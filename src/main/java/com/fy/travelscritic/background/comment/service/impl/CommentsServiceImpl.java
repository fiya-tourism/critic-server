package com.fy.travelscritic.background.comment.service.impl;


import com.fy.travelscritic.background.comment.domain.Comments;
import com.fy.travelscritic.background.comment.domain.ItemComment;
import com.fy.travelscritic.background.comment.domain.SpotsComment;
import com.fy.travelscritic.background.comment.mapper.CommentsMapper;
import com.fy.travelscritic.background.comment.mapper.ItemCommentMapper;
import com.fy.travelscritic.background.comment.mapper.SpotsCommentMapper;
import com.fy.travelscritic.background.comment.service.CommentsService;
import com.fy.travelscritic.config.DataGridVo;
import com.fy.travelscritic.config.Page;
import com.fy.travelscritic.config.ResultMsg;
import com.fy.travelscritic.config.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    private CommentsMapper commentsMapper;

    @Autowired
    private ItemCommentMapper itemCommentMapper;

    @Autowired
    private SpotsCommentMapper spotsCommentMapper;



//------------------------------------------------------------------------------------------------------------------
    /**
     * 根据游记Id查看相关评论
     * @param travelsId
     * @return
     */
    @Override
    public List<Comments> upUserById(Integer travelsId) {
        List<Comments> comments = commentsMapper.upUserById(travelsId);
        return comments;
    }

    /**
     * 审核游记评论
     * @param comments
     * @return
     */
    @Override
    public ResultMsg upTravelYn(Comments comments) {
        comments.setComTravelsUpdate(new Date());
        comments.setComTravelsYn(1);
        ResultMsg rs = new ResultMsg();
        try{
            commentsMapper.upTravelYn(comments.getComTravelsUpdate(),comments.getComTravelsId(),comments.getComTravelsYn());
            rs.setMsg("审核成功");
            rs.setCode(200);
        }catch(Exception e){
            rs.setMsg("审核失败  请重试");
            rs.setCode(500);
            rs.setSuccessFalse();
        }
        return rs;
    }

    @Override
    public DataGridVo selTravelsQuery(Page page) {
        if (page == null){
            page= new Page();
        }
        PageHelper.startPage(page.getPage(),page.getRows());
        page.setSort(StringUtil.underscoreName(page.getSort()));
        List<Comments> pmList = commentsMapper.queryTravelList(page);
        PageInfo<Comments> pageIn = new PageInfo(pmList);
        return new DataGridVo(pageIn.getTotal(),pageIn.getList());
    }

    @Override
    public ResultMsg insertTravels(Comments comments) {
        comments.setComTravelsCreate(new Date());
        comments.setComTravelsYn(0);
        comments.setComTravelsRelease(new Date());
        ResultMsg rs = new ResultMsg();
        try{
            commentsMapper.insert(comments);
            rs.setMsg("操作成功");
            rs.setCode(200);
        }catch(Exception e){
            System.out.println(e);
            rs.setCode(500);
            rs.setMsg("操作失败");
            rs.setSuccessFalse();
        }
        return rs;
    }


//------------------------------------------------------------------------------------------------------------------
    /**
     * 根据商品Id查看评价
     * @param itemId
     * @return
     */
    @Override
    public List<ItemComment> upItemById(Integer itemId) {
        List<ItemComment> itemComments = itemCommentMapper.upItemById(itemId);
        return itemComments;
    }

    /**
     * 审核商品评价
     * @param itemComment
     * @return
     */
    @Override
    public ResultMsg upItemYn(ItemComment itemComment) {
        itemComment.setComItemUpdate(new Date());
        itemComment.setComItemYn(1);
        ResultMsg rs = new ResultMsg();
        try{
            itemCommentMapper.upItemYn(itemComment.getComItemId(),itemComment.getComItemYn(),itemComment.getComItemUpdate());
            rs.setMsg("审核成功");
            rs.setCode(200);
        }catch(Exception e){
            rs.setMsg("审核失败  请重试");
            rs.setCode(500);
            rs.setSuccessFalse();
        }
        return rs;

    }

    /**
     * 新增商品评论
     * @param itemComment
     * @return
     */
    @Override
    public ResultMsg insertItem(ItemComment itemComment) {
        itemComment.setComItemCreate(new Date());
        itemComment.setComItemYn(0);
        itemComment.setComItemRelease(new Date());
        ResultMsg rs = new ResultMsg();
        try{
            itemCommentMapper.insert(itemComment);
            rs.setMsg("操作成功");
            rs.setCode(200);
        }catch(Exception e){
            System.out.println(e);
            rs.setCode(500);
            rs.setMsg("操作失败");
            rs.setSuccessFalse();
        }
        return rs;
    }
//------------------------------------------------------------------------------------------------------------------
    /**
     * 根据旅游Id查看评价
     * @param spotsId
     * @return
     */
    @Override
    public List<SpotsComment> upSpotsById(Integer spotsId) {
        List<SpotsComment> spotsComments = spotsCommentMapper.upSpotsById(spotsId);
        return spotsComments;
    }

    /**
     * 审核游记评价
     * @param spotsComment
     * @return
     */
    @Override
    public ResultMsg upSpotsYn(SpotsComment spotsComment) {
        spotsComment.setComSpotsUpdate(new Date());
        spotsComment.setComSpotsYn(1);
        ResultMsg rs = new ResultMsg();
        try{
            spotsCommentMapper.upSpotsYn(spotsComment.getComSpotsId(),spotsComment.getComSpotsUpdate(),spotsComment.getComSpotsYn());
            rs.setMsg("审核成功");
            rs.setCode(200);
        }catch(Exception e){
            rs.setMsg("审核失败  请重试");
            rs.setCode(500);
            rs.setSuccessFalse();
        }
        return rs;
    }

    @Override
    public ResultMsg insertSpots(SpotsComment spotsComment) {
        spotsComment.setComSpotsCreate(new Date());
        spotsComment.setComSpotsYn(0);
        spotsComment.setComSpotsRelease(new Date());
        ResultMsg rs = new ResultMsg();
        try{
            spotsCommentMapper.insert(spotsComment);
            rs.setMsg("操作成功");
            rs.setCode(200);
        }catch(Exception e){
            System.out.println(e);
            rs.setCode(500);
            rs.setMsg("操作失败");
            rs.setSuccessFalse();
        }
        return rs;
    }

}
