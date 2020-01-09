package com.mngtofinformationsys.project.details.service;

import com.mngtofinformationsys.project.details.dao.ProjectDetailsDAO;
import com.mngtofinformationsys.project.details.model.ProjectDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectDetailServiceImpl implements ProjectDetailService{

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectDetailServiceImpl.class);

    @Autowired
    private ProjectDetailsDAO projectDetailsDAO;

    public ProjectDetails getProjectDetailsByEmployeeId(int employeeId){

        LOGGER.debug("ProjectDetailServiceImpl--getProjectDetailsByEmployeeId() method Started ");

        ProjectDetails prjDtls = projectDetailsDAO.getProjectDetailsByEmpId(employeeId);

        LOGGER.debug("ProjectDetailServiceImpl--getProjectDetailsByEmployeeId() method Ended ");

        return prjDtls;
    }
}
