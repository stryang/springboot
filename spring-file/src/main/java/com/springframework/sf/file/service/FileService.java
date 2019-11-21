package com.springframework.sf.file.service;

import com.springframework.sf.file.util.FileUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: yq
 * @date: 2019/11/21 15:25
 * @description:
 */
@Service
@Slf4j
public class FileService {


    /**
     * 文件上传，按照日期区分文件夹
     * @param file
     * @param path
     * @return
     */
    public boolean upload(MultipartFile file, String path) {
        String filename = file.getOriginalFilename();
        File filepath = new File(path + "/" + FileUtils.getFileDir(), filename);
        return FileUtils.saveFile(file, filepath);
    }

    /**
     * 文件下载，返回二进制流
     * @param filePath
     * @param response
     */
    public void download(String filePath, HttpServletResponse response) {
        File file = new File(filePath);
        if(!file.exists()) {
            log.info("{}文件不存在", filePath);
            return;
        }
        response.setContentType("application/octet-stream; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.addHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");

        try{
            ServletOutputStream outputStream = response.getOutputStream();
            try{
                outputStream.write(Files.readAllBytes(file.toPath()));
            } catch (NoSuchFileException e) {
                log.info("{}文件不匹配", filePath);
            }

            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
