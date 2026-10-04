package com.huawei.hms.network.httpclient;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Response<T> implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract T getBody();

    public abstract int getCode();

    public abstract ResponseBody getErrorBody();

    public abstract Map<String, List<String>> getHeaders();

    public abstract String getMessage();

    public abstract String getUrl();

    public boolean isOK() {
        return getCode() == 200;
    }

    public boolean isSuccessful() {
        int code = getCode();
        return code >= 200 && code < 300;
    }
}
