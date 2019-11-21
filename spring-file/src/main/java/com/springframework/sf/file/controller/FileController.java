package com.springframework.sf.file.controller;

import com.springframework.sf.file.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @author: yq
 * @date: 2019/11/21 15:25
 * @description:
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @Value("${spring.fileLocation}")
    private String fileLocation;

    @PostMapping("/upload")
    public boolean upload(@RequestParam("file") MultipartFile file) {
        return fileService.upload(file, fileLocation);
    }

    @GetMapping("/download")
    public void download(@RequestParam String filePath , HttpServletResponse response) {
        fileService.download(filePath, response);
    }
}
