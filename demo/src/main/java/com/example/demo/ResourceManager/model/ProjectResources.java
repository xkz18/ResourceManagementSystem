package com.example.demo.ResourceManager.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Table(name="Project_Resources")
public class ProjectResources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer record_id;

    @ManyToOne
    @JoinColumn(name="project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name="resource_id")
    private Resource resource;

    private Date time_created;


    public Integer getRecord_id(){
        return record_id;
    }
    public void setRecord_id(Integer record_id){
        this.record_id=record_id;
    }
    public Project getProject(){
        return project;
    }
    public void setProject(Project project){
        this.project=project;
    }
    public void setResource(Resource resource) {
        this.resource=resource;
    }
    public Resource getResource(){
        return resource;
    }
    public void setTime_created(Date time_created){
        this.time_created=time_created;
    }
    public Date getTime_created(){
        return time_created;
    }
    @Override
    public String toString(){
        return "ProjectResource["+ "record_id=" + record_id+
                "time_created=" + time_created+
                ", resource=" + resource+
                ", project=" + project+
                "]";
    }


}