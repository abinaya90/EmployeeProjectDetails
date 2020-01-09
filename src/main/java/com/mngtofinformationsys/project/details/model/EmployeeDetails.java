package com.mngtofinformationsys.project.details.model;

import javax.persistence.*;

@Entity
@Table(name="employee_detail")
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(mappedBy = "employeeDetails")
    private ProjectDetails projectDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", projectDetails=" + projectDetails +
                '}';
    }
}
