package com.carlease.carlease.Utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;


/**
 * 阿里云工具类
 */
@Component
//放到IOC容器中，方便调用
public class AliOSSUtils {

    /**
     * 上传文件到阿里云OSS
     */
    @Value("${aliyun.oss.endpoint}")
    private  String endpoint;
    @Value("${aliyun.oss.accessKeyId}")
    private  String accessKeyId;
    @Value("${aliyun.oss.accessKeySecret}")
    private  String accessKeySecret;
    @Value("${aliyun.oss.bucketName}")
    private  String bucketName;

    public String upload(MultipartFile file) throws IOException {
        //获取上传文件的输入流
        InputStream inputStream=file.getInputStream();

        //获取文件名，UUID格式
        String originalFileName=file.getOriginalFilename();
        String newFileName= UUID.randomUUID().toString()+originalFileName.substring(originalFileName.lastIndexOf('.'));

        //上传文件
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName,newFileName,inputStream);

        //获取上传后的文件url
        String url = endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + newFileName;
        // 关闭ossClient
        ossClient.shutdown();
        return url;// 把上传到oss的路径返回给前端
    }
}
