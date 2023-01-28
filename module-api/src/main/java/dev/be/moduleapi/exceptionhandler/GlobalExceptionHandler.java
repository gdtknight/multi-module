package dev.be.moduleapi.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import dev.be.moduleapi.exception.CustomException;
import dev.be.moduleapi.response.CommonResponse;
import dev.be.modulecommon.enums.CodeEnum;

@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(CustomException.class)
  public CommonResponse handleCustomException(CustomException e) {
    return CommonResponse.builder()
        .returnCode(e.getReturnCode())
        .returnMessage(e.getReturnMessage())
        .build();
  }

  @ExceptionHandler(Exception.class)
  public CommonResponse handleCustomException(Exception e) {
    return CommonResponse.builder()
        .returnCode(CodeEnum.UNKNOWN_ERROR.getCode())
        .returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage())
        .build();
  }
}
