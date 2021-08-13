package com.dio.live;

import com.dio.live.Enterprise;
import com.dio.live.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnterpriseService {


    EnterpriseRepository enterpriseRepository;

    @Autowired
    public EnterpriseService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    public Enterprise saveEnterprise(Enterprise enterprise){
       return enterpriseRepository.save(enterprise);

    }

    public Iterable<Enterprise> findAll() {
       return   enterpriseRepository.findAll();
    }

    public Optional<Enterprise> getById(Long idEnterprise) {
        return enterpriseRepository.findById(idEnterprise);
    }

    public Enterprise updateEnterprise(Enterprise enterprise){
        return enterpriseRepository.save(enterprise);

    }

    public void deleteEnterprise(Long idEnterprise) {
        enterpriseRepository.deleteById(idEnterprise);
    }
}
