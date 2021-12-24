package HRISproject.HRISproject.service;


import HRISproject.HRISproject.dao.BaseDAO;

import HRISproject.HRISproject.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService extends BaseService<Company> {

    @Autowired
    private Company dao;

    @Override
    protected BaseDAO<Company> getDAO() {
        return dao;
    }
}
