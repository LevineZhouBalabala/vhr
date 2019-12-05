package org.sang.service;

import org.sang.bean.File;
import org.sang.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Component
public class FileService {

    @Autowired
    FileMapper fileMapper;

    //插入
    public int insertUrl(String name,String filepath,String url){
        System.out.print("开始插入=name=="+name+"\n");
        System.out.print("开始插入=filepath=="+filepath+"\n");
        System.out.print("开始插入=url=="+url+"\n");
        int result=fileMapper.insertUrl(name,filepath,url);
        System.out.print("插入结果==="+result+"\n");
        return result;
    }

    //查询
    public List<File> selectFile(){
        List<File> files=fileMapper.selectFile();
        return  files;
    }
}