package com.cg.capstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="feedbackcommon")
public class FeedbackCommon {
	
	@Column(name = "cust_id")
	@NotNull(message = "enter customer Id")
	private int cust_id;
	
	@Id
	@Column(name = "merc_id")
	@NotNull(message = "enter merchant Id")
	private int merc_id;
	
	
	private String feedback;
	private String response;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getMerc_id() {
		return merc_id;
	}

	public void setMerc_id(int merc_id) {
		this.merc_id = merc_id;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "FeedbackCommon [cust_id=" + cust_id + ", merc_id=" + merc_id
				+ ", feedback=" + feedback + ", response=" + response + "]";
	}

	public FeedbackCommon(int cust_id, int merc_id, String feedback,
			String response) {
		super();
		this.cust_id = cust_id;
		this.merc_id = merc_id;
		this.feedback = feedback;
		this.response = response;
	}

	public FeedbackCommon() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
