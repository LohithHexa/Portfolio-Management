package com.hexa.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.portfolio.entity.Security;
import com.hexa.portfolio.repository.SecurityRepository;

@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    public Optional<Security> getSecurityByIsin(String isin) {
        return securityRepository.findByIsin(isin);
    }
}
