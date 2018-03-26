package com.hc.exception;

import com.hc.model.IMoocJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
@ResponseBody
public class GlobalException {
    public static final String ERROT_PAGE = "error";

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e){
        if(isAjax(request)){
            System.out.print("ajax请求异常"+e.getMessage());
            return IMoocJSONResult.errorException("ajax请求异常"+e.getMessage());
        }else{
            ModelAndView mav = new ModelAndView();
            mav.addObject("exception",e);
            mav.addObject("url",request.getRequestURL());
            mav.setViewName(ERROT_PAGE);
            return mav;
        }

    }

    /**
     * 判断是否为ajax请求
     */
    public static boolean isAjax(HttpServletRequest httpRequest){
        return (httpRequest.getHeader("X-Requested-With") != null
                && "XMLHttpRequest".equals(httpRequest.getHeader("X-Requested-With").toString()));
    }
}
