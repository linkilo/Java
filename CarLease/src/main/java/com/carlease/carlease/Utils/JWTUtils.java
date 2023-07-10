package com.carlease.carlease.Utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

/**
 * 生成JWT令牌工具类
 */

public class JWTUtils {
    private static final String signKey="kilo";
    private static final Long expire=43200000000L;//12小时

    /**
     * 生成JWT令牌
     */
    public static String generateJWT(Map<String,Object> claims){
            String jwt= Jwts.builder()
                    .signWith(SignatureAlgorithm.HS256,signKey)
                    .setClaims(claims)
                    .setExpiration(new Date(System.currentTimeMillis()+expire))
                    .compact();
            return jwt;
    }

    /**
     * 解析jwt令牌
     */
    public static Claims parseJWT(String jwt){
        Claims claims=Jwts.parser()
                .setSigningKey(signKey)
                .parseClaimsJws(jwt)
                .getBody();
        return claims;
    }
}
