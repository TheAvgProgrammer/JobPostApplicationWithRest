package com.example.springbootwithrest.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {
    @Id
    private String postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    @ElementCollection
    private List<String> postTechStack;
}
