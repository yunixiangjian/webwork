package com.ityc.controller;

import com.ityc.pojo.Result;
import com.ityc.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@RestController
public class UploadController {

    @Autowired
    private AliOSSUtils aliOSSUtils;


    /*@PostMapping("/upload")
    public Result upload(String username,Integer age, MultipartFile image) throws IOException {
        log.info("文件上传: {},{},{}", username, age, image);

        String originalFilename = image.getOriginalFilename();

        int index = originalFilename.lastIndexOf(".");
        String extname = originalFilename.substring(index);
        String newFileName = UUID.randomUUID().toString() + extname;
        log.info("新的文件名,{}", newFileName);

        image.transferTo(new File("D:\\images\\"+newFileName));

        return Result.success();
    }*/

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        log.info("文件上传, 文件名:{}", image.getOriginalFilename());
        String url = aliOSSUtils.upload(image);
        log.info("文件上传完成, 文件访问的url:{}", url);
        return Result.success(url);
    }
}
