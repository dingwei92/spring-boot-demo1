package com.example.demo.service.proc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sun.dc.pr.PRError;

/**
 * @Auther: dingwei
 * @Date: 2020/12/31 16:42
 * @Description:
 */
@Service
public class ProcABC {
    @Autowired
    @Qualifier("finishImpl")
    private Finish finish;
    @Autowired
    @Qualifier("getDataImpl")
    private GetData getData;
    @Autowired
    @Qualifier("initImpl")
    private Initialization initialization;
    @Autowired
    @Qualifier("pushDataImpl")
    private PushData pushData;


    public void process() {
        Context context = new Context();
        context.setItem("taskType", 2);
        context.setItem("operatorId", 3);
        Type1ProcBuilder builder = new Type1ProcBuilder(context);
        Proc proc = builder.setInit(initialization)
                .setPushData(pushData)
                .setData(getData)
                .setFinish(finish)
                .build();
        proc.proc();
    }
}
