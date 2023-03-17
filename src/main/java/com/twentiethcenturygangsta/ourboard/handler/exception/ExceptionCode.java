package com.twentiethcenturygangsta.ourboard.handler.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public enum ExceptionCode {

    NOT_FOUND_OUR_BOARD_MEMBER(HttpStatus.BAD_REQUEST, "NOT_FOUND_OUR_BOARD_MEMBER", "입력하신 아이디 또는 비밀번호가 올바르지 않습니다.");

    private final HttpStatus statusCode;
    private final String code;
    private final String message;

    ExceptionCode(HttpStatus httpStatus, String code, String message) {
        this.statusCode = httpStatus;
        this.code = code;
        this.message = message;
    }
}
