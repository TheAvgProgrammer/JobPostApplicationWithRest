package com.example.springbootwithrest.repo;

import com.example.springbootwithrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Dummy repo class cuz I was too lazy to make a database lol
//I'll be doing that in future projects tho

@Repository
public class JobRepo {
    private final List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost("1", "Software Engineer", "Responsible for developing software applications.", 3, Arrays.asList("Java", "Spring", "Hibernate")),
            new JobPost("2", "Frontend Developer", "Design and implement user interfaces for web applications.", 2, Arrays.asList("HTML", "CSS", "JavaScript", "React")),
            new JobPost("3", "Data Scientist", "Analyze and interpret complex data to provide insights.", 4, Arrays.asList("Python", "R", "SQL", "TensorFlow")),
            new JobPost("4", "DevOps Engineer", "Manage infrastructure and ensure smooth deployment pipelines.", 5, Arrays.asList("Docker", "Kubernetes", "Jenkins", "AWS")),
            new JobPost("5", "QA Engineer", "Test and ensure the quality of software products.", 3, Arrays.asList("Selenium", "JUnit", "Cucumber", "Postman"))
    ));

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println("Added Job " + job);
    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public JobPost getJob(int postId) {
        for (JobPost jobPost: jobs){
            if (Integer.parseInt(jobPost.getPostId()) == postId) return jobPost;
        }
        return null;
    }

    public JobPost updateJob(JobPost post) {
        for (JobPost jobPost: jobs){
            if (Objects.equals(jobPost.getPostId(), post.getPostId())){
                jobPost.setPostDesc(post.getPostDesc());
                jobPost.setPostProfile(post.getPostProfile());
                jobPost.setPostTechStack(post.getPostTechStack());
                jobPost.setReqExperience(post.getReqExperience());
                return jobPost;
            }
        }
        return null;
    }

    public JobPost deleteJob(int postId) {
        for (JobPost jobPost: jobs){
            if (Integer.parseInt(jobPost.getPostId()) == postId){
                jobs.remove(jobPost);
                return jobPost;
            }
        }
        return null;
    }
}
