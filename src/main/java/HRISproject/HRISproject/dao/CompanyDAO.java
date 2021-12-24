package HRISproject.HRISproject.dao;


import HRISproject.HRISproject.entity.Company;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CompanyDAO extends BaseDAO<Company> {


    @Override
    public List<Predicate> predicates(Company param, CriteriaBuilder builder, Root<Company> root, boolean isCount) {
        List<javax.persistence.criteria.Predicate> predicates = super.predicates(param, builder, root, isCount);

        return predicates;
    }


}
