package com.hexa.portfolio.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.portfolio.entity.Security;

import java.util.Optional;

public interface SecurityRepository extends JpaRepository<Security, Long> {
    Optional<Security> findByIsin(String isin);
}
