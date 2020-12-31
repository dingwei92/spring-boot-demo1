package com.example.demo.service.proc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class Proc<T> {
    private static final Logger logger = LoggerFactory.getLogger(Proc.class);
    private Context context;

    protected abstract boolean init();

    protected abstract void finish();

    protected abstract List<T> getData();


    protected abstract boolean sendData(T t);

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void proc() {
        boolean result = init();
        if (result) {
            List<T> list = getData();
            list.forEach(par->{
                sendData(par);
            });
            finish();
        }
    }
}
