package com.example.springbootwithrest.repo;

import com.example.springbootwithrest.model.JobPost;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Dummy repo class cuz I was too lazy to make a database lol
//I'll be doing that in future projects tho

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

}


/*


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
}*/
