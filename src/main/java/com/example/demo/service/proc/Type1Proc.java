package com.example.demo.service.proc;

import java.util.List;

/**
 * @Auther: dingwei
 * @Date: 2020/12/31 16:11
 * @Description:
 */
public class Type1Proc<T> extends Proc<T> {
    private Initialization initialization;
    private Finish finish;
    private GetData getData;
    private PushData pushData;


    @Override
    protected boolean init() {
        return initialization.init();
    }

    @Override
    protected void finish() {
        finish.end();
    }

    @Override
    protected List getData() {
        return getData.getData();
    }

    @Override
    protected boolean sendData(T t) {
        return pushData.send(t,this.getContext());
    }

    public Initialization getInitialization() {
        return initialization;
    }

    public void setInitialization(Initialization initialization) {
        this.initialization = initialization;
    }

    public Finish getFinish() {
        return finish;
    }

    public void setFinish(Finish finish) {
        this.finish = finish;
    }

    public GetData getGetData() {
        return getData;
    }

    public void setGetData(GetData getData) {
        this.getData = getData;
    }

    public PushData getPushData() {
        return pushData;
    }

    public void setPushData(PushData pushData) {
        this.pushData = pushData;
    }
}
