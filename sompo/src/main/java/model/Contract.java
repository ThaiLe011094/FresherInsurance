package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class Contract implements Serializable {

	@Size(min=3, max=30) 
	private String contractNumber;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotEmpty
	private Date dateEffective;
	
	@NotEmpty
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateExpire;
	
	@NotEmpty
	private List<String> subjects = new ArrayList<String>();

	public String getName() {
		return agentName;
	}

	public void setName(String firstName) {
		this.agentName = agentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	public Number phone() {
		return phone;
	}

	public void setphone(Number phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "Agent [name=" + agentName + ", address=" + address
				+ ", phone=" + phone + "]";
	}

}
