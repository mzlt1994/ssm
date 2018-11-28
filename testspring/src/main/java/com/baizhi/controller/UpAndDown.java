package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Controller
@RequestMapping("upAndLoad")
public class UpAndDown {

    @RequestMapping("upLoad")
    @ResponseBody
    public void upLoad(MultipartFile filename, HttpSession session) throws IOException {
        //获取绝对路径
        String realPath = session.getServletContext().getRealPath("/upload");
        //创建文件
        File file = new File(realPath+"/"+filename);
        //将filename中的内容写到file中
        filename.transferTo(file);
    }

    @RequestMapping("download")
    @ResponseBody
    public void download(String filename, HttpSession session, HttpServletResponse response) throws IOException {
        String realPath = session.getServletContext().getRealPath("/upload");
        File file = new File(realPath + "/" + filename);
        //创建输入流
        FileInputStream fileInputStream = new FileInputStream(file);
        //获取filename的文本格式
        String substring = filename.substring(filename.lastIndexOf("."));
        //设置响应类型
        response.setContentType(substring);
        //设置响应头信息
        response.setHeader("content-disposition"," attachment;fileName="+filename);
        //创建响应输出流
        ServletOutputStream outputStream = response.getOutputStream();
        //springBoot中的封装的工具类FileCopyUtils
        FileCopyUtils.copy(fileInputStream,outputStream);
    }
}
