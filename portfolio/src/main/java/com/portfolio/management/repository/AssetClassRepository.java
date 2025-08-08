package com.portfolio.management.repository;

import com.portfolio.management.entity.AssetClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetClassRepository extends JpaRepository<AssetClass, Long> {
}
