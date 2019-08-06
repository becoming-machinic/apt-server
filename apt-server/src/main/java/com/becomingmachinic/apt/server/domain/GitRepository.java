package com.becomingmachinic.apt.server.domain;

public class GitRepository {
	private String url;
	private String branch;
	private String keyPath;

	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getKeyPath() {
		return keyPath;
	}
	public void setKeyPath(String keyPath) {
		this.keyPath = keyPath;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}


}
