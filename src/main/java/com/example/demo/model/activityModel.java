package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="activity")
public class activityModel {

    @Id
    @Column(name = "a_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long a_id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "start_time")
    private String start_time;
    @Column(name = "end_time")
    private String end_time;
    @Column(name = "owner")
    private String owner;
    @Column(name = "start_sign_time")
    private String start_sign_time;
    @Column(name = "end_sign_time")
    private String end_sign_time;
    @Column(name = "content")
    private String content;
    @Column(name = "limit_num")
    private String limit_num;

    public activityModel() {

    }


    public Long getA_id() {
        return a_id;
    }

    public void setA_id(Long a_id) {
        this.a_id = a_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStart_sign_time() {
        return start_sign_time;
    }

    public void setStart_sign_time(String start_sign_time) {
        this.start_sign_time = start_sign_time;
    }

    public String getEnd_sign_time() {
        return end_sign_time;
    }

    public void setEnd_sign_time(String end_sign_time) {
        this.end_sign_time = end_sign_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLimit_num() {
        return limit_num;
    }

    public void setLimit_num(String limit_num) {
        this.limit_num = limit_num;
    }
}
