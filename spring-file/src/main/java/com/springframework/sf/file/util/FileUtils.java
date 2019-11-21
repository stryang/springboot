package com.springframework.sf.file.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @author: yq
 * @date: 2019/11/15 13:47
 * @description:
 */
@Slf4j
public class FileUtils {

    public static String getFileDir() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getYear() + "-" + localDateTime.getMonth().getValue() + "-" + localDateTime.getDayOfMonth();
    }

    public static boolean saveFile(MultipartFile file, File filepath) {
        boolean r = true;
        // 判断路径是否存在，不存在则新创建一个
        if (!filepath.getParentFile().exists()) {
            filepath.getParentFile().mkdirs();
        }

        // 存在的文件先删除再保存
        if(filepath.exists()) {
            filepath.delete();
        }

        // 将上传文件保存到目标文件目录
        try {
            file.transferTo(filepath);
        } catch (IOException e) {
            e.printStackTrace();
            r = false;
            log.info("{}:文件保存失败", file.getOriginalFilename());
        }
        return r;
    }
}
