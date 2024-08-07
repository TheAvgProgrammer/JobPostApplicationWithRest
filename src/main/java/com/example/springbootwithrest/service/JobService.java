package com.example.springbootwithrest.service;

import com.example.springbootwithrest.model.JobPost;
import com.example.springbootwithrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    private final List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost("1", "Software Engineer", "Responsible for developing software applications.", 3, Arrays.asList("Java", "Spring", "Hibernate")),
            new JobPost("2", "Frontend Developer", "Design and implement user interfaces for web applications.", 2, Arrays.asList("HTML", "CSS", "JavaScript", "React")),
            new JobPost("3", "Data Scientist", "Analyze and interpret complex data to provide insights.", 4, Arrays.asList("Python", "R", "SQL", "TensorFlow")),
            new JobPost("4", "DevOps Engineer", "Manage infrastructure and ensure smooth deployment pipelines.", 5, Arrays.asList("Docker", "Kubernetes", "Jenkins", "AWS")),
            new JobPost("5", "QA Engineer", "Test and ensure the quality of software products.", 3, Arrays.asList("Selenium", "JUnit", "Cucumber", "Postman"))
    ));

    @Autowired
    private JobRepo service;

    public void addJob(JobPost jobPost){
        service.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return service.findAll();
    }

    public JobPost getJob(int postId) {
        return service.findById(postId).orElse(new JobPost());
    }

    public JobPost updateJob(JobPost post) {
        return service.save(post);
    }

    public void deleteJob(int postId) {
        service.deleteById(postId);
    }

    public void load() {
        service.saveAll(jobs);
    }
}
