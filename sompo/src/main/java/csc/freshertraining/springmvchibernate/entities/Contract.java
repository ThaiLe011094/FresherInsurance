package csc.freshertraining.springmvchibernate.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class Contract {
	@Id
	@Column(name = "contractId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contractId;

	@Column(name = "contractEff")
	private Date contractEff;

	@Column(name = "contractExp")
	private Date contractExp;

	@Column(name = "agentId")
	private int agentId;
	
	public Contract() {
	}

	public Contract(int contractId, Date contractEff, Date contractExp, int agentId) {
		this.contractId = contractId;
		this.contractEff = contractEff;
		this.contractExp = contractExp;
		this.agentId = agentId;
	}

	public Contract(Date contractEff, Date contractExp, int agentId) {
		this.contractEff = contractEff;
		this.contractExp = contractExp;
		this.agentId = agentId;
	}

	public int getContractId() {
		return contractId;
	}

	public void setContractId(int contractId) {
		this.contractId = contractId;
	}

	public Date getContractEff() {
		return contractEff;
	}

	public void setContractEff(Date contractEff) {
		this.contractEff = contractEff;
	}

	public Date getContractExp() {
		return contractExp;
	}

	public void setContractExp(Date contractExp) {
		this.contractExp = contractExp;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	
	
}
