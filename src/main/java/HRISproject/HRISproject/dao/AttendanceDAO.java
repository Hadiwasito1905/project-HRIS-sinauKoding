package HRISproject.HRISproject.dao;

import HRISproject.HRISproject.entity.Attendance;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class AttendanceDAO extends BaseDAO<Attendance> {

    @Override
    public List<Predicate> predicates(Attendance param, CriteriaBuilder builder, Root<Attendance> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);

        /*if (param != null) {
            if (param.getUsername() != null) {
                predicates.add(builder.equal(root.get("username"), param.getUsername()));
            }
        }**/

        return predicates;
    }
}
