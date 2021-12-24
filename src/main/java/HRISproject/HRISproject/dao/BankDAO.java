package HRISproject.HRISproject.dao;


import HRISproject.HRISproject.entity.Bank;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;


public class BankDAO extends BaseDAO<Bank> {

    @Override
    public List<Predicate> predicates(Bank param, CriteriaBuilder builder, Root<Bank> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);

        return predicates;
    }
}
