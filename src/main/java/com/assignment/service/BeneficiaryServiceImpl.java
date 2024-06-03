package com.assignment.service;

import com.assignment.model.Beneficiary;
import com.assignment.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    @Override
    public List<Beneficiary> findAll() {
        return beneficiaryRepository.findAll();
    }

    @Override
    public Beneficiary findById(Long id) {
        return beneficiaryRepository.findById(id).orElse(null);
    }
    
    @Override
    public Beneficiary save(Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }

    @Override
    public void deleteById(Long id) {
        beneficiaryRepository.deleteById(id);
    }
}
