package com.Interfile.intercafe.Repository;

import com.Interfile.intercafe.Entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageData, Long> {

}
