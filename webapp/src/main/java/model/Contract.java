package model;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@SuppressWarnings("serial")
public class Contract implements Serializable {

	@Size(min=3, max=30)
	private Number contractNumber;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotEmpty
	private Date dateEffective;
	
	@NotEmpty
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateExpire;

	public Number getcontractNumber() {
		return contractNumber;
	}

	public void setcontractNumber(Number contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getdateEffective() {
		return dateEffective;
	}

	public void setdateEffective(Date dateEffective) {
		this.dateEffective = dateEffective;
	}

	public Date getdateExpire() {
		return dateExpire;
	}

	public void setdateExpire(Date dateExpire) {
		this.dateExpire = dateExpire;
	}


	@Override
	public String toString() {
		return "Contract [contractNumber=" + contractNumber + ", dateEffective=" + dateEffective
				+ ", dateExpire=" + dateExpire + "]";
	}

}
