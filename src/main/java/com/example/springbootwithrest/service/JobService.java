package com.example.springbootwithrest.service;

import com.example.springbootwithrest.model.JobPost;
import com.example.springbootwithrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo service;

    public void addJob(JobPost jobPost){
        service.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return service.getJob(postId);
    }

    public JobPost updateJob(JobPost post) {
        return service.updateJob(post);
    }

    public JobPost deleteJob(int postId) {
        return service.deleteJob(postId);
    }
}
