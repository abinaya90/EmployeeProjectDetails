package com.mngtofinformationsys.project.details.controller;

import com.mngtofinformationsys.project.details.model.ProjectDetails;
import com.mngtofinformationsys.project.details.service.ProjectDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/project")
public class ProjectDetailsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectDetailsController.class);

    @Autowired
    private ProjectDetailService projectDetailService;

    @GetMapping
    public ProjectDetails getProjectDetails(@RequestParam (name = "empId") int id){
        LOGGER.debug("Inside the getProjectDetails Method" + id);
        return projectDetailService.getProjectDetailsByEmployeeId(id);
    }
}
