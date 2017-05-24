package com.demo.controller;

import com.demo.entity.S3File;
import com.demo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 10105 on 2017/5/23.
 */
@RestController
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping("/upload")
    public void upload(){
        S3File s3File=new S3File();
        s3File.setUrl("aaa");
        s3File.setCreateDate(new Date());
        fileService.upload(s3File);
    }

    @RequestMapping("/file/{id}")
    public S3File findById(@PathVariable("id") Long id){
        return fileService.findById(id);
    }
}
