package com.alexa.challenge.alexademo.rest;

import com.alexa.challenge.alexademo.auth.InterswitchAuth;
import com.alexa.challenge.alexademo.model.Paycode.PaycodeRequest;
import com.alexa.challenge.alexademo.model.Paycode.PaycodeResponse;
import com.alexa.challenge.alexademo.model.Response;
import com.alexa.challenge.alexademo.utils.ConstantUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class PaycodeRest {
    @Value("$client.id")
    public String clientId;
    @Value("$client.secret")
    public String clientSecret;
    @Value("$front.end.partner.id")
    public String frontEndPartner;
    @Value("${pwm.resource.host}")
    public String pwmResourceHost;
    @Value("${pwm.ttid}")
    public String ttid;
    @Value("${pwm.oneTime.pin}")
    public String oneTimePin;
    @Value("${pwm.token.life.in.minutes}")
    public String tokenLifeInMinutes;
    @Value("${pwm.payment.method.code}")
    public String paymentMethodCode;
    @Value("${pwm.payment.method.type.code}")
    public String paymentMethodTypeCode;

    public ResponseEntity<PaycodeResponse> getPaycode(String amount, String mobileNumber) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        RestTemplate restTemplate = new RestTemplate();
        PaycodeRequest paycodeRequest = new PaycodeRequest();
        paycodeRequest.setAmount(amount);
        paycodeRequest.setTtid(ttid);
        paycodeRequest.setOneTimePin(oneTimePin);
        paycodeRequest.setPaymentMethodTypeCode(paymentMethodTypeCode);
        paycodeRequest.setTokenLifeTimeInMinutes(tokenLifeInMinutes);
        paycodeRequest.setPaymentMethodCode(paymentMethodCode);
        paycodeRequest.setFrontEndPartnerId(frontEndPartner);
        String resourceUrl =  pwmResourceHost + ConstantUtils.API_V1_PWM_SUBSCRIBERS + mobileNumber + ConstantUtils.TOKENS;
        Map<String, String> headers =  InterswitchAuth.generateInterswitchAuth("POST",resourceUrl, clientId,clientSecret,"", "SHA1" );
        headers.put(ConstantUtils.FRONT_END_PARTNER, frontEndPartner);
        System.out.println(headers);
        ResponseEntity<PaycodeResponse> paycodeResponse =  restTemplate.postForEntity(resourceUrl,paycodeRequest, PaycodeResponse.class, headers);
        return paycodeResponse;
    }

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        PaycodeRest paycodeRest = new PaycodeRest();
        ResponseEntity<PaycodeResponse> paycodeResponseResponseEntity= paycodeRest.getPaycode("5000", "2348124888436");

    }


}
