package com.veolia.error;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import com.veolia.model.ErrorMessage;
import com.veolia.model.ServiceException;

/**
 * @author veolia
 *
 */

@Provider
public class ServiceExceptionMapper implements ExceptionMapper<ServiceException> {

	@Override
	public Response toResponse(ServiceException ex) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setCode(ex.getCode());
		errorMessage.setMessage(ex.getMessage());
		StringWriter errorStackTrace = new StringWriter();
		ex.printStackTrace(new PrintWriter(errorStackTrace));
		errorMessage.setDeveloperMessage(ex.toString());
		return Response.status(ex.getHttpStatus()).entity(errorMessage).type(MediaType.APPLICATION_JSON).build();
	}

}
