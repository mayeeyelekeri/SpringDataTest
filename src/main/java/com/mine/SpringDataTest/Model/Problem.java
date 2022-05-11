package com.mine.SpringDataTest.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.redis.core.RedisHash;

@Entity
@Table(name = "PROBLEM")
@XmlRootElement 
public class Problem implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //this make the ID autoincrement
	int id; 
	
	@Column
	String problem; 
	
	@Column
	String reasonForProblem; 
	
	@Column
	String solution; 
	
	@Column
	Date submitDate; 
	
	@Column
	Date modifiedDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TECHNOLOGY", referencedColumnName = "ID")
	Technology technology;
	
	// default constructor
	public Problem() {
	}
	
	// constructor with all params 
	public Problem(int id, String problem, String reasonForProblem, String solution, Date submitDate, Date modifiedDate, Technology technology) {
		super();
		this.id = id;
		this.problem = problem;
		this.reasonForProblem = reasonForProblem;
		this.solution = solution; 
		this.submitDate = submitDate;
		this.modifiedDate = modifiedDate;
		this.technology = technology;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getReasonForProblem() {
		return reasonForProblem;
	}
	
	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public void setReasonForProblem(String reasonForProblem) {
		this.reasonForProblem = reasonForProblem;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Problem [id=" + id + ", problem=" + problem + ", reasonForProblem=" + reasonForProblem + ", solution="
				+ solution + ", submitDate=" + submitDate + ", modifiedDate=" + modifiedDate + ", technology="
				+ technology + "]";
	}
	
	
}
