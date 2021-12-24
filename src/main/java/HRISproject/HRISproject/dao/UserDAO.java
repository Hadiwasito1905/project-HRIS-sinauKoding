package HRISproject.HRISproject.dao;

import HRISproject.HRISproject.entity.User;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class UserDAO extends BaseDAO<User> {

    @Override
    public List<Predicate> predicates(User param, CriteriaBuilder builder, Root<User> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);

        return predicates;
    }
}
