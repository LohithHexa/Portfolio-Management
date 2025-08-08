package com.hexa.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.portfolio.entity.Security;
import com.hexa.portfolio.service.SecurityService;

@RestController
@RequestMapping("/securities")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @GetMapping
    public ResponseEntity<List<Security>> getAllSecurities() {
        return ResponseEntity.ok(securityService.getAllSecurities());
    }

    @GetMapping("/{isin}")
    public ResponseEntity<?> getSecurityByIsin(@PathVariable String isin) {
        return securityService.getSecurityByIsin(isin)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
