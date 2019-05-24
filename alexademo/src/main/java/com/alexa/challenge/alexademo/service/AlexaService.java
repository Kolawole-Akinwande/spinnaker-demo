package com.alexa.challenge.alexademo.service;

import com.alexa.challenge.alexademo.model.Request;
import com.alexa.challenge.alexademo.model.Slots;
import com.alexa.challenge.alexademo.rest.MonitorClient;
import com.alexa.challenge.alexademo.utils.AlexaUtils;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;


@Service
public class AlexaService {

    //private static final DateTimeFormatter

    private MonitorClient monitorClient;

    public String getIntroductionIntentResponse(){
        return " We are the exterminators, mind the engineering team 7. We are not here to play ";
    }

    public String getTransactionTypeReportResponse(){
        return " There are 20000 billpayment transactions, 13,406 recharge transactions and  12000 transfers";
    }
    public String getFuturePredictionResponse(){
        return "Based on the current transaction count history and considering the coming festivity, transaction volume will most likely increase by 15%. However, Adequate measure should be put in place to reduce failure rate. ";
    }


    public String getNinetyOneResponse(){
        return "Quickteller response code 91 means the issuer or switch is inoperative ";
    }

    public String getMonitorIntent(Request request){
//        Slots slots = AlexaUtils.getSlots(request);
//        if (slots == null) {
//            return getFallBackIntent();
//        }
//        LocalDateTime from, to;
//        if (slots.getTime() != null) {
//            to = LocalDateTime.parse(slots.getTime().getValue(), DateTimeFormatter.ofPattern(""));
//            from = to.minus(Duration.ofDays(1));
//        } else if (slots.getFromTime() != null || slots.getToTime() != null) {
//            if (slots.getToTime() == null) {
//                to = LocalDateTime.now();
//            } else {
//                to = LocalDateTime.parse(slots.getToTime().getValue(), DateTimeFormatter.ofPattern(""));
//            }
//            if (slots.getFromTime() == null) {
//                from = to.minus(Duration.ofDays(1));
//            } else {
//                from = LocalDateTime.parse(slots.getFromTime().getValue(), DateTimeFormatter.ofPattern(""));
//            }
//        } else if (slots.getPeriod() != null) {
//            Duration duration = Duration.parse(slots.getPeriod().getValue());
//            to = LocalDateTime.now();
//            from = to.minus(duration);
//        } else {
//            return getFallBackIntent();
//        }
//        if (from.isBefore(LocalDateTime.of(2018, 9, 1, 0, 0, 0)) ||
//                to.isAfter(LocalDateTime.of(2018, 9, 30, 23, 59, 59))) {
//            return getNewSkillFallBackIntent();
        return "Quickteller has a total of 54696 successful transactions and 387 unsuccessful transactions. Compared to yesterday, there has been 5%  increase in successful transactions"+
                "and a 0.2% decrease in failed transactions. Yaaaaaay looks impressive!";
        }



    public String getMonitorIntroductionIntent(){
        return "My name is monitor and I can give a summary of transaction status for quickteller on production";
    }

    public String getShouldIIntent(){
        return "okay";
    }
    public String getFailureIntent(){
        return "There is a total of 387 failed transaction today on quickteller and the top on the list is response code 91 which makes up 22% of the total failure count. Should i notify the monitoring team?";
    }


    public String getFallBackIntent(){
//        return String.format("I could not understand your question but %s", monitorClient.getDefault());
        return "I could not understand your question but Quickteller has 20000 requests today and about 60% of these transactions were successful, only 5% failed and the rest were incomplete transactions. I think we are looking good so far";
    }

    public String getNewSkillFallBackIntent() {
        return "I cannot answer that currently but you can reach out to the exterminators team to teach me this new skill";
    }

    public String getWelcomeIntent() {
        return "What service would you like to get a report for?";
    }
}
