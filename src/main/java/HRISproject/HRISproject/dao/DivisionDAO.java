package HRISproject.HRISproject.dao;

import HRISproject.HRISproject.entity.Division;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class DivisionDAO extends BaseDAO<Division> {

    @Override
    public List<Predicate> predicates(Division param, CriteriaBuilder builder, Root<Division> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);


        return predicates;
    }
}
