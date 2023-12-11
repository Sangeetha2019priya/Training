package com.example.File.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.File.Entity.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {
    // Additional query methods if needed
}