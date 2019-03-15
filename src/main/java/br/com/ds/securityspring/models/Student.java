package br.com.ds.securityspring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class Student {

    @Getter @Setter
    private Integer studentId;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Integer age;
}
