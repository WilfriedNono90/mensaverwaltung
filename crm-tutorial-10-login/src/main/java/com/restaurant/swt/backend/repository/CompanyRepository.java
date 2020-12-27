package com.restaurant.swt.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.swt.backend.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
