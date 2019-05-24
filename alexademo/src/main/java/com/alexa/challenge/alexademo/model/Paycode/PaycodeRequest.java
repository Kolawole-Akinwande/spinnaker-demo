package com.alexa.challenge.alexademo.model.Paycode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaycodeRequest {


    public String ttid;
    public String paymentMethodTypeCode;
    public String paymentMethodCode;
    public String payWithMobileChannel;
    public String tokenLifeTimeInMinutes;
    public String amount;
    public String oneTimePin;
    public String frontEndPartnerId;

    public String getFrontEndPartnerId() {
        return frontEndPartnerId;
    }

    public void setFrontEndPartnerId(String frontEndPartnerId) {
        this.frontEndPartnerId = frontEndPartnerId;
    }

    public String getTtid() {
        return ttid;
    }

    public void setTtid(String ttid) {
        this.ttid = ttid;
    }

    public String getPaymentMethodTypeCode() {
        return paymentMethodTypeCode;
    }

    public void setPaymentMethodTypeCode(String paymentMethodTypeCode) {
        this.paymentMethodTypeCode = paymentMethodTypeCode;
    }

    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    public String getPayWithMobileChannel() {
        return payWithMobileChannel;
    }

    public void setPayWithMobileChannel(String payWithMobileChannel) {
        this.payWithMobileChannel = payWithMobileChannel;
    }

    public String getTokenLifeTimeInMinutes() {
        return tokenLifeTimeInMinutes;
    }

    public void setTokenLifeTimeInMinutes(String tokenLifeTimeInMinutes) {
        this.tokenLifeTimeInMinutes = tokenLifeTimeInMinutes;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOneTimePin() {
        return oneTimePin;
    }

    public void setOneTimePin(String oneTimePin) {
        this.oneTimePin = oneTimePin;
    }
}
