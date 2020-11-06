package com.shsxt.crm.controller;

import com.shsxt.crm.base.ResultInfo;
import com.shsxt.crm.po.Menu;
import com.shsxt.crm.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuService menuService;


    @RequestMapping("list")
    public ResultInfo selectList(){
        List<Menu> list = menuService.selectList();

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(200);
        resultInfo.setMsg("菜单");
        resultInfo.setResult(list);
        return resultInfo;
    }


}