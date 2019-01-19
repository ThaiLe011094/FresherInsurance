package model;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

@SuppressWarnings("serial")
public class Agent implements Serializable {

	@NotEmpty
	private Number agentId;
	
	@Size(min=3, max=30) 
	@NotEmpty
	private String agentName;
	
	@Email @NotEmpty
	private String agentAddress;
	
	@Size(min=10, max=10)
	@NotEmpty
	private String agentPhone;
	
	
	
	public Number getAgentId() {
		return agentId;
	}


	public void setAgentId(Number agentId) {
		this.agentId = agentId;
	}


	public String getAgentName() {
		return agentName;
	}


	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}


	public String getAgentAddress() {
		return agentAddress;
	}


	public void setAgentAddress(String agentAddress) {
		this.agentAddress = agentAddress;
	}


	public String getAgentPhone() {
		return agentPhone;
	}


	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}


	@Override
	public String toString() {
		return "Agent [agentID =" + agentId + " agentName=" + agentName
				+ ", agentAddress=" + agentAddress	+ ", agentPhone=" + agentPhone + "]";
	}

}
