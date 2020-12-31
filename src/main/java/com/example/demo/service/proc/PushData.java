package com.example.demo.service.proc;

public interface PushData<T> {
    boolean send(T t,Context context);
}
