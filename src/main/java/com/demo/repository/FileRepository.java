package com.demo.repository;

import com.demo.entity.S3File;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 10105 on 2017/5/23.
 */

public interface FileRepository extends JpaRepository<S3File,Long> {
}
