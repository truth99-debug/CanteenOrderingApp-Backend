package com.Interfile.intercafe.Controller;

import com.Interfile.intercafe.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/storeImage")
    private void storeImage(@RequestParam("file") MultipartFile file) throws IOException {
        imageService.processImage(file);
    }
}
