package com.portfolio.management.service;

import com.portfolio.management.entity.AssetClass;
import com.portfolio.management.repository.AssetClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetClassService {

    @Autowired
    private AssetClassRepository repository;

    public List<AssetClass> getAll() {
        return repository.findAll();
    }

    public AssetClass save(AssetClass assetClass) {
        return repository.save(assetClass);
    }
    public AssetClass getById(Long id) {
        return repository.findById(id).orElse(null);
    }

}
