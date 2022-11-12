package com.example.postdemo.repo;

import com.example.postdemo.domain.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerRepo extends JpaRepository<Logger, Long> {

}
