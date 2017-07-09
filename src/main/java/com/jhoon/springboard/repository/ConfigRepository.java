package com.jhoon.springboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhoon.springboard.entity.Config;

public interface ConfigRepository extends JpaRepository<Config, Long> {

}
