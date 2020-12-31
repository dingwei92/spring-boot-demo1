package com.example.demo.service.proc.impl;


import com.example.demo.service.proc.Context;
import com.example.demo.service.proc.PushData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("pushDataImpl")
public class PushDataImpl implements PushData<String> {
    private final Logger logger = LoggerFactory.getLogger(PushDataImpl.class);

    @Override
    public  boolean send(String s, Context context) {
        logger.info("send1");
        return false;
    }
}

