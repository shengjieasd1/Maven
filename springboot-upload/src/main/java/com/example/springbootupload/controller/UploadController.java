package com.example.springbootupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.List;

/**
 * @author shuzheng
 */
@Controller
public class UploadController{
    @RequestMapping(value = "/uploadPre",method = RequestMethod.GET)
    public String uploadPre(){
        return "upload_page";
    }
    
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(String name, HttpServletRequest request){
        if(request instanceof MultipartHttpServletRequest){
            MultipartHttpServletRequest mrequest = (MultipartHttpServletRequest) request;
            List<MultipartFile> files = mrequest.getFiles("photo");
            Iterator<MultipartFile> iter = files.iterator();
            while (iter.hasNext()) {
                MultipartFile photo = iter.next();
                if (photo != null) {
                    System.out.println("【******文件上传******】name=" + name);
                    System.out.println("【******文件上传******】photoName=" + photo.getName());
                    System.out.println("【******文件上传******】photoContentType=" + photo.getContentType());
                }
            }
        }
        
        return "upload_page";
    }
    
}
