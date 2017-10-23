package com.infotech.model;

public class EmployeeStatistics {

	private Long empCount;
	private Double avgSal;
	private Double minSal;
	private Double sumOfSal;
	
	public EmployeeStatistics(Long empCount, Double avgSal, Double minSal, Double sumOfSal) {
		super();
		this.empCount = empCount;
		this.avgSal = avgSal;
		this.minSal = minSal;
		this.sumOfSal = sumOfSal;
	}
	public Long getEmpCount() {
		return empCount;
	}
	public void setEmpCount(Long empCount) {
		this.empCount = empCount;
	}
	public Double getAvgSal() {
		return avgSal;
	}
	public void setAvgSal(Double avgSal) {
		this.avgSal = avgSal;
	}
	public Double getMinSal() {
		return minSal;
	}
	public void setMinSal(Double minSal) {
		this.minSal = minSal;
	}
	public Double getSumOfSal() {
		return sumOfSal;
	}
	public void setSumOfSal(Double sumOfSal) {
		this.sumOfSal = sumOfSal;
	}
	@Override
	public String toString() {
		return "EmployeeStatistics [empCount=" + empCount + ", avgSal=" + avgSal + ", minSal=" + minSal + ", sumOfSal="
				+ sumOfSal + "]";
	}
}
