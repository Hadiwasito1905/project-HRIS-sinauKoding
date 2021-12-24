package HRISproject.HRISproject.service;

import HRISproject.HRISproject.dao.AttendanceDAO;
import HRISproject.HRISproject.dao.BaseDAO;
import HRISproject.HRISproject.entity.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService extends BaseService<Attendance> {

    @Autowired
    private AttendanceDAO dao;

    @Override
    protected BaseDAO<Attendance> getDAO() {
        return dao;
    }
}
