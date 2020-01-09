package com.mngtofinformationsys.project.details.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="project_dtls")
@NamedQuery(name = "ProjectDetails.getProjectDetailsByEmpId", query="select p from ProjectDetails p where p.employeeDetails.id = ?1")
public class ProjectDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int projectId;
    private String projectName;
    private LocalDate startDate;
    private LocalDate plannedEndDate;

    @OneToOne
    @JoinColumn(name = "manager_id", nullable = false)
    private EmployeeDetails employeeDetails;

    /*@OneToMany(mappedBy = "projectDetails")
    private ClientDetails clientDetails;*/

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(LocalDate plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }

    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    @Override
    public String toString() {
        return "ProjectDetails{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", plannedEndDate=" + plannedEndDate +
                ", employeeDetails=" + employeeDetails +
                '}';
    }
}
