package csc.freshertraining.springmvchibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.validation.constraints.Size;
//import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "agent")
public class Agent {
	@Id
	@Column(name = "agentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int agentId;

	@Column(name = "agentName")
//	@Size(min=3, max=100)
//	@NotEmpty
	private String agentName;

	@Column(name = "agentAddress")
//	@Size(min=3, max=100)
//	@NotEmpty
	private String agentAddress;

	@Column(name = "agentPhone")
//	@Size(min=9, max=10)
//	@NotEmpty
	private String agentPhone;
	
	public Agent() {
	}

	public Agent(int agentId, String agentName, String agentAddress, String agentPhone) {
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentAddress = agentAddress;
		this.agentPhone = agentPhone;
	}

	public Agent(String agentName, String agentAddress, String agentPhone) {
		this.agentName = agentName;
		this.agentAddress = agentAddress;
		this.agentPhone = agentPhone;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
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
	
}
