package com.cloud.bssp.util;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 分页父类
 * Create Date: 2020/7/13
 * Modified By：
 * Modified Date：
 * Why &amp; What is modified：
 * Copyright (C) 2020 mvtech.com.cn All Right Reserved.
 * @author weirx
 * @version 1.0
 */
@Data
public class BaseDTO {

    @ApiModelProperty(notes  = "查询条数")
    private Integer limit;

    @ApiModelProperty(notes  = "页数")
    private Integer page;
}
