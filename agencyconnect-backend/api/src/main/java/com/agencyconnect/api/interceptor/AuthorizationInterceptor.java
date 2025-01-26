package com.agencyconnect.api.interceptor;

import com.agencyconnect.api.annotation.PermissionStore;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import java.lang.reflect.Method;

@Component
public class AuthorizationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler instanceof HandlerMethod) {

            Method method = ((HandlerMethod)handler).getMethod();

            if(method.isAnnotationPresent(PermissionStore.class)) {
                PermissionStore annotation = method.getAnnotation(PermissionStore.class);
                for (String perm : annotation.global()) {
                    System.out.println(perm);
                }

            }
        }


        return true;
    }
}
