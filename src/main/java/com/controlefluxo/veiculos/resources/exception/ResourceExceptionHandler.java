package com.controlefluxo.veiculos.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<StandarError> dataIntegrityViolationException(DataIntegrityViolationException e,
			HttpServletRequest request) {

		StandarError err = new StandarError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST, "Veiculo já cadastrado",
				e.getMessage(), request.getRequestURI());
		return ResponseEntity.badRequest().body(err);

	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<StandarError> nullPointerExceptionException(NullPointerException e,
			HttpServletRequest request) {

		StandarError err = new StandarError(System.currentTimeMillis(), HttpStatus.NOT_FOUND, "Veiculo não cadastrado",
				e.getMessage(), request.getRequestURI());
		return ResponseEntity.badRequest().body(err);

	}

}
