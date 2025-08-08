package com.portfolio.management.controller;

import com.portfolio.management.entity.AssetClass;
import com.portfolio.management.service.AssetClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asset-classes")
public class AssetClassController {

    @Autowired
    private AssetClassService service;

    @GetMapping
    public List<AssetClass> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AssetClass getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
