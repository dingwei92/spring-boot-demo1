package com.example.demo.service.proc.impl;

import com.example.demo.service.proc.Initialization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("initImpl")
public class InitImpl implements Initialization {
    private final Logger logger = LoggerFactory.getLogger(InitImpl.class);

    @Override
    public boolean init() {
        logger.info("init1");
        return true;
    }
}
