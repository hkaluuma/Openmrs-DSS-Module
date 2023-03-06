package org.openmrs.module.dssmodule;

import org.openmrs.BaseOpenmrsData;

public class Dss extends BaseOpenmrsData {
	
	public String fever;
	
	public String Nuesea;
	
	public String getFever() {
		return fever;
	}
	
	public void setFever(String fever) {
		this.fever = fever;
	}
	
	public String getNuesea() {
		return Nuesea;
	}
	
	public void setNuesea(String nuesea) {
		Nuesea = nuesea;
	}
	
	@Override
	public Integer getId() {
		throw new UnsupportedOperationException("Unimplemented method 'getId'");
	}
	
	@Override
	public void setId(Integer arg0) {
		
		throw new UnsupportedOperationException("Unimplemented method 'setId'");
	}
	
}
