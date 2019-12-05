package org.sang.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.sang.bean.File;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface FileMapper {
    //插入
    @Insert({"insert into file_upload (name,filepath,url) values (#{name},#{filepath},#{url})"})
    int insertUrl(@Param("name")String name, @Param("filepath")String lujing, @Param("url")String url);

    //查询
    @Select("select * from file_upload")
    List<File> selectFile();




}
