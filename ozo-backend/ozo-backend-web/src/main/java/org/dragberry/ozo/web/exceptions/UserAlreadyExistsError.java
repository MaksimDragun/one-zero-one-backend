package org.dragberry.ozo.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "User already exists")
public class UserAlreadyExistsError extends RuntimeException {

	private static final long serialVersionUID = 7042632574266870016L;

	public UserAlreadyExistsError() {}
}
