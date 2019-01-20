package dxc.com.sompo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Size;
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "agent")

public class Agent {
	@Id
	@Column(name = "agentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int agentId;

//	@Size(min = 3, max = 30)
//	@NotEmpty
	@Column(name = "agentName")
	private String agentName;

//	@Email
//	@NotEmpty
	@Column(name = "agentAddress")
	private String agentAddress;

//	@Size(min = 10, max = 10)
//	@NotEmpty
	@Column(name = "agentPhone")
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

//	@Override
//	public String toString() {
//		return "Agent [agentID =" + agentId + " agentName=" + agentName + ", agentAddress=" + agentAddress
//				+ ", agentPhone=" + agentPhone + "]";
//	}

}
