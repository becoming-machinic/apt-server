package com.becomingmachinic.apt.server.properties;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
@Validated
@ConfigurationProperties(prefix = "apt-server")
public class AptBuildProperties {

	@NotEmpty
	private String configPath = "/var/lib/apt-server/config/";
	@NotEmpty
	private String sourcePath = "/var/lib/apt-server/source/";
	@NotEmpty
	private String repositoryPath = "/var/lib/apt-server/repository/";
	
	/**
	 * The config path holds the configuration files
	 * @return
	 */
	public String getConfigPath() {
		return configPath;
	}
	public void setConfigPath(String configPath) {
		this.configPath = configPath;
	}
	/**
	 * The source path is where the git repositories are downloaded to.
	 * @return
	 */
	public String getSourcePath() {
		return sourcePath;
	}
	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}
	/**
	 * The repositoryPath is where the repository data is stored.
	 * @return
	 */
	public String getRepositoryPath() {
		return repositoryPath;
	}
	public void setRepositoryPath(String repositoryPath) {
		this.repositoryPath = repositoryPath;
	}
	
	
}
