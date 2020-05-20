package com.example.readinglist.repository;

import com.example.readinglist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ReaderRepository extends JpaRepository<Reader,String> {

}
