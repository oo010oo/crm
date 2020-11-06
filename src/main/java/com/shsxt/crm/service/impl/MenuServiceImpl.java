package com.shsxt.crm.service.impl;

import com.shsxt.crm.dao.MenuDao;
import com.shsxt.crm.po.Menu;
import com.shsxt.crm.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;


    @Override
    public List<Menu> selectList() {
        List<Menu> list = menuDao.selectList();
        return list;
    }
}
