package com.tjy.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author tjy
 * @ClassName LoginFilter
 * @Description TODO
 * @Date 2020/3/13 22:28
 * @Version 1.0
 **/
@Component //注入容器中
public class LoginFilter extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return "pre";  //请求路由之前执行
    }

    @Override
    public int filterOrder() {
        return 1; //过滤器的执行顺序
    }

    @Override
    public boolean shouldFilter() {
        return true; //当前过滤器是否执行 true：执行；false：不执行
    }

    //定义过滤功能
    @Override
    public Object run() throws ZuulException {
        //1、获取请求上下文
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        //如果请求带了一个token值，则表示已经登陆过
        if(token == null){
            logger.warn("此操作需要登录系统");
            context.setSendZuulResponse(false);//拒绝访问
            context.setResponseStatusCode(200);//响应状态码
            try {
                context.getResponse().getWriter().write("token is empty...");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        //通过，会进行路由转发
        logger.info("通过，会进行路由转发");
        return null;
    }
}
