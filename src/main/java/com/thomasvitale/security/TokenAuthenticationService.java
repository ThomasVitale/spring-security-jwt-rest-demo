package com.thomasvitale.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;

public interface TokenAuthenticationService {

	/**
	 * When a user successfully logs into the application, create a token for that user.
	 * 
	 * @param res		An http response that will be filled with an 'Authentication' header containing the token.
	 * @param username	The username mapped to the user.
	 */
	void addAuthentication(HttpServletResponse res, Authentication authentication);

	/**
	 * The JWTAuthenticationFilter calls this method to verify the user authentication.
	 * If the token is not valid, the authentication fails and the request will be refused.
	 * 
	 * @param request	An http request that will be check for authentication token to verify.
	 * @return
	 */
	Authentication getAuthentication(HttpServletRequest request);

}