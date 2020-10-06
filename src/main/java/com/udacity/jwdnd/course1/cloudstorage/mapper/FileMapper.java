package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.FileUpload;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FileMapper {
    @Select("SELECT * FROM FILES")
    List<FileUpload> getFiles();
    @Select("SELECT * FROM FILES WHERE fileid=#{fileId}")
    FileUpload getFileById(Integer fileId);
    @Insert("INSERT INTO FILES(filename,contenttype,filesize,userid) VALUES (#{fileName},#{contentType},#{fileSize},#{userId})")
    Integer createFile(FileUpload file);
}