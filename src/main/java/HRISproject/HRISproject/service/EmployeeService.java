package HRISproject.HRISproject.service;


import HRISproject.HRISproject.dao.BaseDAO;
import HRISproject.HRISproject.dao.EmployeeDAO;
import HRISproject.HRISproject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends BaseService<Employee> {

    @Autowired
    private EmployeeDAO dao;

    @Override
    protected BaseDAO<Employee> getDAO() {
        return dao;
    }
}
