package com.ityc;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootTest
class TalisWebProjectApplicationTests {

    @Test
    void testGenJwt() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", "1");
        claims.put("name","Tom");
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "ityc")/*签名算法*/
                .setClaims(claims)/*自定义内容*/
                .setIssuedAt(new Date(System.currentTimeMillis() + 3600 * 1000))/*设置有效期为一小时*/
                .compact();
                System.out.println(jwt);
    }

}
