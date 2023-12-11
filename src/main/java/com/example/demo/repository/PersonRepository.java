package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by User: Vu
 * Date: 11.12.2023
 * Time: 20:12
 */
public interface PersonRepository extends JpaRepository<Person, Long> {



}
