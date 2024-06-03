package com.assignment.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assignment.model.Beneficiary;
import com.assignment.service.BeneficiaryService;

@Controller
@RequestMapping("/beneficiaries")
public class BeneficiaryController {

    @Autowired
    private BeneficiaryService beneficiaryService;

    /*@GetMapping
    public String showBeneficiaries(Model model) {
    	System.out.println("showBeneficiaries");
        model.addAttribute("beneficiaries", beneficiaryService.findAll());
        return "beneficiary";
    }

    @PostMapping
    public String addBeneficiary(@ModelAttribute Beneficiary beneficiary) {
    	System.out.println("addBeneficiary");
        beneficiaryService.save(beneficiary);
        return "redirect:/beneficiaries";
    }

    @DeleteMapping("/{id}")
    public String deleteBeneficiary(@PathVariable Long id) {
    	System.out.println("deleteBeneficiary: "+id);
        beneficiaryService.deleteById(id);
        return "redirect:/beneficiaries";
    }*/
    
    @GetMapping
    public String showBeneficiaries(Model model) {
        List<Beneficiary> beneficiaries = beneficiaryService.findAll();
        model.addAttribute("beneficiaries", beneficiaries);
        return "beneficiary";
    }

    @PostMapping
    @ResponseBody
    public void addBeneficiary(@ModelAttribute Beneficiary beneficiary) {
        beneficiaryService.save(beneficiary);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Beneficiary getBeneficiary(@PathVariable Long id) {
        return beneficiaryService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void editBeneficiary(@PathVariable Long id, @ModelAttribute Beneficiary beneficiary) {
        beneficiary.setId(id);
        beneficiaryService.save(beneficiary);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteBeneficiary(@PathVariable Long id) {
        beneficiaryService.deleteById(id);
    }
}

