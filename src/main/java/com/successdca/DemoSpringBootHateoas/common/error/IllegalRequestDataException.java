package com.successdca.DemoSpringBootHateoas.common.error;

import static com.successdca.DemoSpringBootHateoas.common.error.ErrorType.BAD_REQUEST;

public class IllegalRequestDataException extends AppException {
    public IllegalRequestDataException(String msg) {
        super(msg, BAD_REQUEST);
    }
}