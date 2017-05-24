package com.demo.service;

import com.demo.entity.S3File;
import com.demo.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 10105 on 2017/5/23.
 */
@Service
public class FileService {
    @Autowired
    private FileRepository fileRepository;

    public void upload(S3File s3File){
        fileRepository.save(s3File);
    }
    public S3File findById(Long id){
        return fileRepository.findOne(id);
    }

}
