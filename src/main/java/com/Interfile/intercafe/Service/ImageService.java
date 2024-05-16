package com.Interfile.intercafe.Service;

import com.Interfile.intercafe.Entity.ImageData;
import com.Interfile.intercafe.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public void processImage(MultipartFile file) throws IOException {
        ImageData imageData = new ImageData();

        imageData.setImageFile(file.getBytes());
        imageRepository.save(imageData);

    }
}
