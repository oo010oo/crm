package com.shsxt.crm.utils;

import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Component
public class GetCookieFromRequest {

    private static String cookieName;

    public static String getValueFromCookieByName(HttpServletRequest request, String id){

        String cookieValue = "";
        Cookie[]cookies = request.getCookies();
        for (int i = 0; i<cookies.length;i++){
            Cookie cookie = cookies[i];
            String name = cookie.getName();
            if(name.equals(cookieName)){
                cookieValue =cookie.getValue();
            }
        }
        return cookieValue;
    }
}
