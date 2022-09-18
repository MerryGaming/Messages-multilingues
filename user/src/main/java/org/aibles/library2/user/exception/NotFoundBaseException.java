package org.aibles.library2.user.exception;

import org.springframework.http.HttpStatus;


public class NotFoundBaseException extends BaseExceptionRequest {
    public NotFoundBaseException(Object setData) {
        setStatusException(HttpStatus.NOT_FOUND.value());
        setCode("org.aibles.validator.exception.NotFoundBaseException");
        addParams("400: BAD REQUEST!!!", setData);
    }
}
