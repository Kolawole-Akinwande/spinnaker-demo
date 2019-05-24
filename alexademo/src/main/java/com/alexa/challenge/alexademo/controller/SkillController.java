package com.alexa.challenge.alexademo.controller;

import com.alexa.challenge.alexademo.model.*;
import com.alexa.challenge.alexademo.model.Paycode.PaycodeResponse;
import com.alexa.challenge.alexademo.rest.PaycodeRest;
import com.alexa.challenge.alexademo.service.AlexaService;
import com.alexa.challenge.alexademo.utils.AlexaUtils;
import com.alexa.challenge.alexademo.utils.ConstantUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.lang.System;
import java.security.NoSuchAlgorithmException;

@RestController
public class SkillController {
    @Autowired
    AlexaService alexaService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public SkillResponse response2(@RequestBody SkillRequest skillRequest){
        ObjectMapper objectMapper =  new ObjectMapper();

        try {
            System.out.println("SkillId is : " + objectMapper.writeValueAsString(skillRequest));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        SkillResponse skillResponse =  new SkillResponse();
        Response response = new Response();
        OutputSpeech outputSpeech = new OutputSpeech();
        outputSpeech.setType("PlainText");
        Request request = skillRequest != null && skillRequest.getRequest() !=null ? skillRequest.getRequest() : null;
        String intentType = AlexaUtils.getIntentName(request);
        System.out.println("Intent Type:>>>>>>> " + intentType);

        switch (intentType) {
           case ConstantUtils.INTRODUCTION_INTENT:
               outputSpeech.setText(alexaService.getIntroductionIntentResponse());
               break;
           case ConstantUtils.MONITOR_INTRODUCTION_INTENT:
               outputSpeech.setText(alexaService.getMonitorIntroductionIntent());
               break;
           case ConstantUtils.FAILURE_INTENT:
                outputSpeech.setText(alexaService.getFailureIntent());
                break;
            case ConstantUtils.SHOULD_IINTENT:
                outputSpeech.setText(alexaService.getShouldIIntent());
                break;
           case ConstantUtils.MONITOR_INTENT:
               outputSpeech.setText(alexaService.getMonitorIntent(request));
               break;
            case ConstantUtils.WHAT_IS_NINETY_ONE:
                outputSpeech.setText(alexaService.getNinetyOneResponse());
                break;
            case ConstantUtils.TEAM_INTRO:
                outputSpeech.setText(alexaService.getIntroductionIntentResponse());
                break;
            case ConstantUtils.TRANSACTION_TYPE_INTENT:
                outputSpeech.setText(alexaService.getTransactionTypeReportResponse());
                break;
            case ConstantUtils.FUTURE_PREDICTION:
                outputSpeech.setText(alexaService.getFuturePredictionResponse());
                break;
            case "AMAZON.FallbackIntent":
           default:
               outputSpeech.setText(alexaService.getFallBackIntent());
        }
        if (request != null && request.type.equalsIgnoreCase("LaunchRequest") ){
            outputSpeech.setText(alexaService.getWelcomeIntent());
        }




//        if (skillRequest.getRequest() != null && skillRequest.getRequest().getIntent() != null && skillRequest.getRequest().getIntent().getSlots() != null && skillRequest.getRequest().getIntent().getSlots().getTime() != null && skillRequest.getRequest().getIntent().getSlots().getTime().getValue().equalsIgnoreCase("2018-09-28")  ){
//            outputSpeech.setText("I have sent 5000  % naira to your driver");
//        }else {
//            outputSpeech.setText("Quickteller has a 20000 requests today and about 60% of these transactions were successful, only 5% failed and the rest were incomplete transactions. I think we are looking good so far");
//        }
//        if (skillRequest.getRequest() != null && skillRequest.getRequest().getIntent() != null && skillRequest.getRequest().getIntent().getName().equalsIgnoreCase("PaycodeIntent")){
//            PaycodeRest paycodeRest =  new PaycodeRest();
//            try {
//                ResponseEntity<PaycodeResponse> paycodeResponseResponseEntity = paycodeRest.getPaycode("5000" );
//                System.out.println("SkillId is : " + objectMapper.writeValueAsString(paycodeResponseResponseEntity));
//
//                outputSpeech.setText("I have sent five thousand naira to your driver");
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            } catch (NoSuchAlgorithmException e) {
//                e.printStackTrace();
//            } catch (JsonProcessingException e) {
//                e.printStackTrace();
//            }
//        }
//        outputSpeech.setSsml("<speak>This is the exterminators<speak>");
        response.setOutputSpeech(outputSpeech);
        skillResponse.setResponse(response);
        return skillResponse;
    }



    @RequestMapping(value = "/teamintro", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public SkillResponse response(@RequestBody SkillRequest skillRequest){
        SkillResponse skillResponse =  new SkillResponse();
        Response response = new Response();
        OutputSpeech outputSpeech = new OutputSpeech();
        outputSpeech.setType("PlainText");
        outputSpeech.setText("They are the exterminators, they exist to completely destroy bugs and build mind blowing solution that solve real life problems");
        outputSpeech.setSsml("<speak>This is the exterminators<speak>");
        response.setOutputSpeech(outputSpeech);
        skillResponse.setResponse(response);
        return skillResponse;
    }


}
