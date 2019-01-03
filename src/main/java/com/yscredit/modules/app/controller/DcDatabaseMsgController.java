package com.yscredit.modules.app.controller;

import com.github.pagehelper.PageInfo;
import com.yscredit.common.page.Page;
import com.yscredit.common.util.Effect;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import com.yscredit.modules.app.entity.DcDatabaseMsgEntity;
import com.yscredit.modules.app.service.DcDatabaseMsgService;



/**
 * 数据源表
 *
 * @author buwei
 * @email jiangyun@yscredit.com
 * @date 2019-01-02 17:36:14
 */
@RestController
@RequestMapping("app/dcdatabasemsg")
@Api("数据源")
public class DcDatabaseMsgController {
    @Autowired
    private DcDatabaseMsgService dcDatabaseMsgService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Effect list(Page page){
        Effect effect = new Effect();
        PageInfo<DcDatabaseMsgEntity> pages = dcDatabaseMsgService.queryPage(page);
        effect.setSucceed(pages);
        return effect;
    }


    /**
     * 列表
     */
    @RequestMapping("/insert")
    public Effect insert(DcDatabaseMsgEntity dcDatabaseMsgEntity){
        Effect effect = new Effect();
        try{
            dcDatabaseMsgService.insert(dcDatabaseMsgEntity);
            effect.setSucceed(true);
        }catch (Exception e){
            e.printStackTrace();
            effect.setFail(false,e.getMessage());
        }
        return effect;
    }

    /**
     * 列表
     */
    @RequestMapping("/update")
    public Effect update(DcDatabaseMsgEntity dcDatabaseMsgEntity){
        Effect effect = new Effect();
        try{
            dcDatabaseMsgService.update(dcDatabaseMsgEntity);
            effect.setSucceed(true);
        }catch (Exception e){
            e.printStackTrace();
            effect.setFail(false,e.getMessage());
        }
        return effect;
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @ApiOperation("删除")
    @ApiImplicitParam(value = "id", name = "id", dataType = "Integer",paramType = "query")
    public Effect delete(Integer id){
        Effect effect = new Effect();
        try{
            dcDatabaseMsgService.delete(id);
            effect.setSucceed(true);
        }catch (Exception e){
            e.printStackTrace();
            effect.setFail(false,e.getMessage());
        }
        return effect;
    }



}
