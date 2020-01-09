package com.mngtofinformationsys.project.details.service;

import com.mngtofinformationsys.project.details.model.ProjectDetails;

public interface ProjectDetailService {
    public ProjectDetails getProjectDetailsByEmployeeId(int employeeId);
}
