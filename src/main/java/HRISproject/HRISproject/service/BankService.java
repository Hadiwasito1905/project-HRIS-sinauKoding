package HRISproject.HRISproject.service;


import HRISproject.HRISproject.dao.BankDAO;
import HRISproject.HRISproject.dao.BaseDAO;

import HRISproject.HRISproject.entity.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService extends BaseService<Bank> {

    @Autowired
    private BankDAO dao;

    @Override
    protected BaseDAO<Bank> getDAO() {
        return dao;
    }

}
