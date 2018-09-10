package com.geekcattle.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QiniuConfig {

    @Value("${upload.qiniu.access-key}")
    private String accessKey;

    @Value("${upload.qiniu.secret-key}")
    private String secretKey;

    @Value("${upload.qiniu.bucket}")
    private String bucket;

    @Value("${upload.qiniu.domain}")
    private String domain;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
