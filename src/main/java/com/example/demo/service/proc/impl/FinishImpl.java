package com.example.demo.service.proc.impl;

import com.example.demo.service.proc.Finish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("finishImpl")
public class FinishImpl implements Finish {
    private final Logger logger = LoggerFactory.getLogger(FinishImpl.class);

    @Override
    public void end() {
        logger.info("end1");
    }
}
