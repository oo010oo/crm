package com.shsxt.crm.vo;

import com.shsxt.crm.base.BaseQuery;
import lombok.Data;


@Data
public class UserVo extends BaseQuery {
    private String UserName;
    private String email;
    private String phone;
}
