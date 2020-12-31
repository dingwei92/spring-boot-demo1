package com.example.demo.service.proc;

/**
 * @Auther: dingwei
 * @Date: 2020/12/31 16:26
 * @Description:
 */
public class Type1ProcBuilder {
    private Type1Proc<String> type1Proc;
    private Context context;

    public Type1ProcBuilder(Context context) {
        this.context = context;
        this.type1Proc = new Type1Proc<>();
        this.type1Proc.setContext(context);
    }

    public Type1ProcBuilder setInit(Initialization init) {
        if (init != null) {
            this.type1Proc.setInitialization(init);
        }
        return this;
    }

    public Type1ProcBuilder setFinish(Finish finish) {
        if (finish != null) {
            this.type1Proc.setFinish(finish);
        }
        return this;
    }

    public Type1ProcBuilder setData(GetData getData) {
        if (getData != null) {
            this.type1Proc.setGetData(getData);
        }
        return this;
    }


    public Type1ProcBuilder setPushData(PushData pushData) {
        if (pushData != null) {
            this.type1Proc.setPushData(pushData);
        }
        return this;
    }

    public Proc build() {
        return this.type1Proc;
    }
}
