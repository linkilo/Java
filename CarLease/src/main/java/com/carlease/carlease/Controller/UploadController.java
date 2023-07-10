package com.carlease.carlease.Controller;

import com.carlease.carlease.Utils.AliOSSUtils;
import com.carlease.carlease.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 文件上传到阿里云OSS控制类
 */

@RestController
@Slf4j
public class UploadController {

    @Autowired
    private AliOSSUtils aliOSSUtils;

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        log.info("上传文件:{}",image.getOriginalFilename());
        String url=aliOSSUtils.upload(image);
        log.info("文件上传成功，文件路径为:{}",url);
        return new Result().success(url);
    }
}
