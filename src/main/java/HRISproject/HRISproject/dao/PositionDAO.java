package HRISproject.HRISproject.dao;

import HRISproject.HRISproject.entity.Position;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class PositionDAO extends BaseDAO<Position> {
    @Override
    public List<Predicate> predicates(Position param, CriteriaBuilder builder, Root<Position> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);

        return predicates;
    }
}
