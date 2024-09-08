package com.successdca.DemoSpringBootHateoas.common.error;

import static com.successdca.DemoSpringBootHateoas.common.error.ErrorType.DATA_CONFLICT;

public class DataConflictException extends AppException {
    public DataConflictException(String msg) {
        super(msg, DATA_CONFLICT);
    }
}