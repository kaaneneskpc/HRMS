package com.example.hrms.api.controller;

import com.example.hrms.business.abstracts.JobTitleService;
import com.example.hrms.entities.concretes.JobTitle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitles")
public class JobsController {

    private JobTitleService jobTitleService;

    public JobsController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }


    @GetMapping("/getall")
    public List<JobTitle> getAll(){

        return jobTitleService.getAll();
    }
}
