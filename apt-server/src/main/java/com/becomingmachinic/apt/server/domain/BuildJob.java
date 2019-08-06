package com.becomingmachinic.apt.server.domain;

public class BuildJob {
	// BuildJob.name should be globally unique
	private String name;
	private GitRepository repository;
	private String buildScriptPath;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GitRepository getRepository() {
		return repository;
	}
	public void setRepository(GitRepository repository) {
		this.repository = repository;
	}
	public String getBuildScriptPath() {
		return buildScriptPath;
	}
	public void setBuildScriptPath(String buildScriptPath) {
		this.buildScriptPath = buildScriptPath;
	}
}
