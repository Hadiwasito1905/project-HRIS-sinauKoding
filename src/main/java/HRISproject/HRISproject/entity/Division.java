package HRISproject.HRISproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "division")
@Setter
@Getter
@NoArgsConstructor
public class Division extends BaseEntity<Division> {


    private static final long serialVersionUID = 8497514655310258610L;


}