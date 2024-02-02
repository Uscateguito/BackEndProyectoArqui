package com.capibaras.bottomline.services;

import com.capibaras.bottomline.models.SalesCommission;
import com.capibaras.bottomline.repository.SalesCommissionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SalesCommissionService {

    private SalesCommissionRepository salesCommissionRepository;

    @Transactional(readOnly = true)
    public List<SalesCommission> findAll(){
        return (List<SalesCommission>) salesCommissionRepository.findAll();
    }
}