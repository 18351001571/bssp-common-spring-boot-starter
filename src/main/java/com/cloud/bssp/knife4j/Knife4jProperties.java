package com.cloud.bssp.knife4j;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description: knife4j属性配置
 * Create Date: 2020/6/18
 * Modified By：<br>
 * Modified Date：<br>
 * Why & What is modified：<br>
 *
 * @author weirx
 * @version 1.0
 */
@Data
@ConfigurationProperties(prefix = "knife4j" )
public class Knife4jProperties {

    /**
     * 包路径
     */
    private String basePackage;

    /**
     * 服务标题
     */
    private String title;

    /**
     * 服务地址
     */
    private String serviceUrl;

    /**
     * 描述
     */
    private String describe;

    /**
     * 作者
     */
    private String author;

    /**
     * 版本
     */
    private String version;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 服务url
     */
    private String host;
}
