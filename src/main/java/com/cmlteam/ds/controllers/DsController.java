package com.cmlteam.ds.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DsController {

    private static final Logger log = LoggerFactory.getLogger(DsController.class);

    @Autowired
    public DsController() {
    }

    @RequestMapping(
            value = "/webhook",
            method = RequestMethod.GET)
    public String getWebHook() {
        return "test";
    }

    @RequestMapping(value = "/webhook", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public String postWebHook(HttpEntity httpEntity) throws Exception {
        log.info("Received Web Hook request, {}", httpEntity);
        // TODO: optimize this stupid shit, remove fucking gson
        return "";
    }
}