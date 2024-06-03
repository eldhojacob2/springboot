package com.assignment.service;

import com.assignment.model.Beneficiary;
import java.util.List;

public interface BeneficiaryService {
    List<Beneficiary> findAll();
    Beneficiary save(Beneficiary beneficiary);
    void deleteById(Long id);
    Beneficiary findById(Long id);
}
