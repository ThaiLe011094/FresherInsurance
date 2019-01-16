package model;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

@SuppressWarnings("serial")
public class Agent implements Serializable {

	@Size(min=3, max=30) 
	@NotEmpty
	private String agentName;
	
	@Email @NotEmpty
	private String agentAddress;
	
	@NotEmpty @NumberFormat
	private Number agentPhone;
	

	public String getagentName() {
		return agentName;
	}

	public void setName(String agentName) {
		this.agentName = agentName;
	}

	public String getAddress() {
		return agentAddress;
	}

	public void setAdress(String agentAddress) {
		this.agentAddress = agentAddress;
	}

	public Number agentPhone() {
		return agentPhone;
	}

	public void setphone(Number agentPhone) {
		this.agentPhone = agentPhone;
	}



	@Override
	public String toString() {
		return "Agent [name=" + agentName + ", agentAddress=" + agentAddress
				+ ", agentPhone=" + agentPhone + "]";
	}

}
