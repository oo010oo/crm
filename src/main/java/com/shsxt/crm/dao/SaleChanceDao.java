package com.shsxt.crm.dao;

import com.shsxt.crm.po.SaleChance;


import java.util.List;

public interface SaleChanceDao {
    List<SaleChance>selectList (SaleChance vo);

    void insert(SaleChance saleChance);

    SaleChance selectSaleChanInfoById(String saleChanceId);

    Integer update(SaleChance saleChance);

    void delete(String ids);

    void delete(String[]array);

    SaleChance selectSaleChanceInfoById(String saleChanceId);

    void deleteIds(String[] ids);

    ;
}
