package com.mngtofinformationsys.project.details.dao;

import com.mngtofinformationsys.project.details.model.ProjectDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDetailsDAO  extends JpaRepository<ProjectDetails, Integer> {
    ProjectDetails getProjectDetailsByEmpId(int empId);
}
