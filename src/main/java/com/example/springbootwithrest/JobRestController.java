package com.example.springbootwithrest;

import com.example.springbootwithrest.model.JobPost;
import com.example.springbootwithrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {
    @Autowired
    private JobService jobService;
    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        System.out.println(jobService.getJob(postId));
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost post){
        jobService.addJob(post);
        return jobService.getJob(Integer.parseInt(post.getPostId()));
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost post){
        jobService.updateJob(post);
        return jobService.getJob(Integer.parseInt(post.getPostId()));
    }

    @DeleteMapping("jobPost/{postId}")
    public JobPost deleteJob(@PathVariable("postId") int postId){
        return jobService.deleteJob(postId);
    }
}
