package com.huyouxiao.space.web.handler;

import com.huyouxiao.space.common.enums.ResultEnum;
import com.huyouxiao.space.common.exception.BusinessException;
import com.huyouxiao.space.web.api.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler
  public ApiResult<Void> handlerException(Exception exception, HttpServletRequest request, HttpServletResponse response) {
    if(exception instanceof BusinessException) {
      BusinessException businessException = (BusinessException) exception;
      return ApiResult.exception(businessException);
    }

    log.warn("handle exception: ", exception);
    // not business exception.
    ApiResult result = new ApiResult(ResultEnum.SYSTEM_ERROR.getCode(), ResultEnum.SYSTEM_ERROR.getMessage());
    result.addError(exception.getMessage());
    return result;
  }
}
