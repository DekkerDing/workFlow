//package io.github.dekkerding.interfaces.exception;
//
//import com.lenovo.common.base.dto.Result;
//import com.lenovo.common.base.dto.ResultCode;
//import com.lenovo.common.base.exception.BizException;
//import com.lenovo.tpam.domain.lb.exception.DomainException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.NoHandlerFoundException;
//
//import java.io.FileNotFoundException;
//
///**
// * @author qiushi7@lenovo.com created on 2022/1/21
// * @version 1$
// */
//@Slf4j
//@ResponseBody
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//  /**
//   * 处理非法参数异常
//   *
//   * @param ex
//   * @return
//   */
//  @ExceptionHandler(value = IllegalArgumentException.class)
//  public Result<?> handleException(IllegalArgumentException ex) {
//    log.error("发生非法参数异常：", ex);
//    return Result.fail(ResultCode.PARAM_ERROR, ex.getMessage());
//  }
//
//  @ExceptionHandler(value = DomainException.class)
//  public Result<?> handleException(DomainException ex) {
//    log.error("发生非法参数异常：", ex);
//    return Result.fail(ResultCode.BIZ_FAILURE, ex.getMessage());
//  }
//
//  /**
//   * 处理业务异常
//   *
//   * @param ex
//   * @return
//   */
//  @ExceptionHandler(value = BizException.class)
//  public Result<?> handleException(BizException ex) {
//    log.error("发生业务异常：", ex);
//    return Result.fail(ex.getCode(), ex.getMessage());
//  }
//
//  /**
//   * 处理404异常
//   *
//   * @param ex
//   * @return
//   */
//  @ExceptionHandler({FileNotFoundException.class, NoHandlerFoundException.class})
//  public Result<?> noFoundException(Exception ex) {
//    log.error("发生404异常", ex);
//    return Result.fail(HttpStatus.NOT_FOUND.value(), ex.getMessage());
//  }
//
//  /**
//   * 处理空指针异常
//   *
//   * @param ex
//   * @return
//   */
//  @ExceptionHandler(value = NullPointerException.class)
//  public Result<?> handleException(NullPointerException ex) {
//    log.error("发生空指针异常：", ex);
//    return Result.fail(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
//  }
//
//  /**
//   * 处理其他异常
//   *
//   * @param ex
//   * @return
//   */
//  @ExceptionHandler(value = Exception.class)
//  public Result<?> handleException(Exception ex) {
//    log.error("发生未知异常：", ex);
//    return Result.fail(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
//  }
//}