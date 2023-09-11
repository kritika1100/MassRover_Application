package com.example.entity;

public class HomeDto {
	private String marsApiRoverData;
	private boolean defaultCheck;
	private int marsSol;
	public String getMarsApiRoverData() {
		return marsApiRoverData;
	}
	public void setMarsApiRoverData(String marsApiRoverData) {
		this.marsApiRoverData = marsApiRoverData;
	}
	public boolean isDefaultCheck() {
		return defaultCheck;
	}
	public void setDefaultCheck(boolean defaultCheck) {
		this.defaultCheck = defaultCheck;
	}
	public int getMarsSol() {
		return marsSol;
	}
	public void setMarsSol(int marsSol) {
		this.marsSol = marsSol;
	}
	@Override
	public String toString() {
		return "HomeDto [marsApiRoverData=" + marsApiRoverData + ", defaultCheck=" + defaultCheck + ", marsSol="
				+ marsSol + "]";
	}
	

}
