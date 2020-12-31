package com.example.demo.service.proc.impl;


import com.example.demo.service.proc.GetData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("getDataImpl")
public class GetDataImpl implements GetData<String> {
    private final Logger logger = LoggerFactory.getLogger(GetDataImpl.class);

    @Override
    public List<String> getData() {
        logger.info("getData1");
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        return list;
    }
}
