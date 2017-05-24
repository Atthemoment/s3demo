package com.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 10105 on 2017/5/23.
 */
@Entity
@Table(name = "t_file")
public class S3File implements Serializable {
    private static final long serialVersionUID = 3760602307560419818L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    //URL地址
    private String url;
    //创建时间
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        S3File s3File = (S3File) o;

        if (id != null ? !id.equals(s3File.id) : s3File.id != null) return false;
        if (url != null ? !url.equals(s3File.url) : s3File.url != null) return false;
        return createDate != null ? createDate.equals(s3File.createDate) : s3File.createDate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "S3File{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
