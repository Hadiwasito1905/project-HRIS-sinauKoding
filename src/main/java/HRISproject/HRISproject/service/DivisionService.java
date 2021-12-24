package HRISproject.HRISproject.service;

import HRISproject.HRISproject.dao.BankDAO;
import HRISproject.HRISproject.dao.BaseDAO;
import HRISproject.HRISproject.dao.DivisionDAO;
import HRISproject.HRISproject.entity.Bank;
import HRISproject.HRISproject.entity.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionService extends BaseService<Division> {
    @Autowired
    private DivisionDAO dao;

    @Override
    protected BaseDAO<Division> getDAO() {
        return dao;
    }
}
