package com.becomingmachinic.apt.server.domain;

import java.util.List;

public class AptRepository {
	
	// Name should contain url safe characters only
	private String name;
	// Distribution should contain url safe characters only
	// distribution subdivides the repository ex: unstable
	private String distribution;
	public List<BuildJob> jobs;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDistribution() {
		return distribution;
	}
	
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}
	
	public List<BuildJob> getJobs() {
		return jobs;
	}
	
	public void setJobs(List<BuildJob> jobs) {
		this.jobs = jobs;
	}
}
