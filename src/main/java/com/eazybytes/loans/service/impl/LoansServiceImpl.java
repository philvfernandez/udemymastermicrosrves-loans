package com.eazybytes.loans.service.impl;

import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.repository.LoansRepository;
import com.eazybytes.loans.service.ILoansService;

public class LoansServiceImpl implements ILoansService {

    private LoansRepository loansRepository;

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    @Override
    public void createLoan(String mobileNumber) {

    }

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return
     */
    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        return null;
    }

    /**
     *
     * @param loansDto - LoansDto Object
     * @return
     */
    @Override
    public boolean updateLoan(LoansDto loansDto) {
        return false;
    }

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return
     */
    @Override
    public boolean deleteLoan(String mobileNumber) {
        return false;
    }
}
