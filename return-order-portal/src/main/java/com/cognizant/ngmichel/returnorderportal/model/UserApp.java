package com.cognizant.ngmichel.returnorderportal.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@SequenceGenerator(name="seq", initialValue=2)
public class UserApp {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    private int id;
    private Long userId;
    private String userFirstName;
    private String email;
    private String password;
    private String role;

    @JsonIgnore
    @ManyToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Authority> authorities;
}
