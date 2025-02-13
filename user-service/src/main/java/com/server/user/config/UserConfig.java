package com.server.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class UserConfig {
	
	@Value("${server.port")
	private String port;
	
	public String getPort() {
		return port;
	}

}
