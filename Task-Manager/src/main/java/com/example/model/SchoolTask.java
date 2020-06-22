package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="school_task")

public class SchoolTask {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id")
	    private int Id;
	    @Column(name = "task_name")
	    private String taskName;
	    @Column(name = "task_priority")
	    private  int taskPriority;
	    @Column(name = "task_status")
	    private String taskStatus;
	    @Column(name = "start_date")
	    private String startDate;
	    @Column(name = "end_date")
	    private String endDate;
	    @Column(name = "color_code")
	    private  String colorCode;
	    public SchoolTask(int Id, String taskName, int taskPriority, String taskStatus,
	                    String startDate,String endDate,String colorCode) {
	        this.Id=Id;
	        this.taskName=taskName;
	        this.taskPriority=taskPriority;
	        this.taskStatus=taskStatus;
	        this.startDate=startDate;
	        this.endDate=endDate;
	        this.colorCode=colorCode;
	    }
	    public SchoolTask() {
	    }

}
