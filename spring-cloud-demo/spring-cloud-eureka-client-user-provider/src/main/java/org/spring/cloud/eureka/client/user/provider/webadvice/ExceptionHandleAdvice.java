package org.spring.cloud.eureka.client.user.provider.webadvice;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

/**
 * 统一异常处理
 * 类描述：
 * @ClassName: ExceptionHandleAdvice 
 * @author my
 * @date 2018年5月13日 上午11:51:27
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandleAdvice  {
	@ExceptionHandler(RuntimeException.class)
	public ModelMap exception(Exception exception,WebRequest request) {
		ModelMap resultMap = new ModelMap();
		resultMap.put("result", "error");
		return resultMap;
	}
}
