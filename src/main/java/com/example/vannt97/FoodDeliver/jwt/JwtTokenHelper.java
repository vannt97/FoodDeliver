package com.example.vannt97.FoodDeliver.jwt;

import com.example.vannt97.FoodDeliver.payload.response.DataTokenResponse;
import com.example.vannt97.FoodDeliver.payload.response.DataUserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;

@Component
public class JwtTokenHelper {

    private final long expiredDate = 8 * 60 * 60 * 1000; //millies
    private final long expiredDateRefeshToken = 10 * 60 * 60 * 1000; //millies
    private final String SECRET_KEY = "aGVsbG8tZXZlcnlvbmUtbXktbmFtZS1pcy12YW4tZXctZWR2di16eHMtZXFxLWF6eC1iYmZn";
    public DataTokenResponse genaralToken(DataUserResponse dataUserResponse){
        Date now = new Date();
        Date dateExpired = new Date(now.getTime() + expiredDate);
        Date dateExpriredRefeshToken = new Date(now.getTime() + expiredDateRefeshToken);
        SecretKey secretKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(SECRET_KEY));



        try {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            dataUserResponse.setTypeToken("auth");
            String json = ow.writeValueAsString(dataUserResponse);
            String token = Jwts.builder()
                    .setSubject(json)
                    .setIssuedAt(now)
                    .setExpiration(dateExpired)
                    .signWith(secretKey, SignatureAlgorithm.HS256)
                    .compact();

            dataUserResponse.setTypeToken("refesh");
            String jsonRefeshToken = ow.writeValueAsString(dataUserResponse);
            String refeshToken = Jwts.builder()
                    .setSubject(jsonRefeshToken)
                    .setIssuedAt(now)
                    .setExpiration(dateExpriredRefeshToken)
                    .signWith(secretKey, SignatureAlgorithm.HS256)
                    .compact();
            return new DataTokenResponse(token,now,dateExpired,refeshToken);

        }catch (Exception e){
            return new DataTokenResponse(null,now,dateExpired,null);
        }

    }

//    public String decodeToken(String token){
//        String[] chunks = token.split("\\.");
//        Base64.Decoder decoder = Base64.getUrlDecoder();
//
//        String header = new String(decoder.decode(chunks[0]));
//        String payload = new String(decoder.decode(chunks[1]));
//        System.out.println(header + " - " + payload);
//        return "";
//    }

    public String decodeTokenBuoiHoc(String token){
        SecretKey secretKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(SECRET_KEY));
        return Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validaToken(String token){
        SecretKey secretKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(SECRET_KEY));
        boolean isSuccess = false;
        try{
            Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token);
            isSuccess = true;
        }catch (MalformedJwtException ex){
            System.out.println("invalid jwt token");
        }catch (ExpiredJwtException ex){
            System.out.println("expired jwt token");

        }catch (UnsupportedJwtException ex){
            System.out.println("Unsupport jwt token");
        }catch (IllegalArgumentException ex){
            System.out.println("jwt claims string is emty");
        }
        return isSuccess;
    }
}
