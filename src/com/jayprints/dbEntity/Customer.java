package com.jayprints.dbEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SrNo")
	private int srNo;
	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="DressType")
	private String dressType;
	
	public Customer() {
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo= srNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getDressType() {
		return dressType;
	}

	public void setDressType(String dressType) {
		this.dressType = dressType;
	}

	@Override
	public String toString() {
		return "Customer [SrNo=" + srNo + ", custName=" + custName + ", dressType=" + dressType + "]";
	}
	

	
}
