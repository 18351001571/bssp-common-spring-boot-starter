package com.cloud.bssp.knife4j;

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

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
