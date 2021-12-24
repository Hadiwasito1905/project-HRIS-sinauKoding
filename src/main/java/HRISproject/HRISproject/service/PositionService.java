package HRISproject.HRISproject.service;


import HRISproject.HRISproject.dao.BaseDAO;
import HRISproject.HRISproject.dao.PositionDAO;
import HRISproject.HRISproject.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService extends BaseService<Position> {

    @Autowired
    private PositionDAO dao;

    @Override
    protected BaseDAO<Position> getDAO() {
        return dao;
    }
}
