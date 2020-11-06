package com.shsxt.crm.service;

import com.shsxt.crm.po.SaleChance;

import java.util.Map;

public interface SaleChanceService {

    Map<String,Object> selectList(SaleChance vo);

    void insert(SaleChance saleChance);

    SaleChance selectSaleChanceInfoById(String saleChanceId);

    void update(SaleChance saleChance);

    void delete(String ids);

    void deleteIds(String[] ids);
}
