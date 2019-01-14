/**
 * 
 */
package com.veolia.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.veolia.error.GenericExceptionMapper;
import com.veolia.error.ServiceExceptionMapper;
import com.veolia.resource.UserResource;

/**
 * @author veolia
 *
 */
@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(UserResource.class);
		register(ServiceExceptionMapper.class);
		register(GenericExceptionMapper.class);
	}
}
