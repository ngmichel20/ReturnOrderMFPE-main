package com.cognizant.ngmichel.returnorderportal.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@SequenceGenerator(name="seq", initialValue=2)
public class Authority {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    private Long id;
    private String name;
}
