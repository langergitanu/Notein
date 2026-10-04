package com.huawei.hms.network.httpclient.websocket;

import com.huawei.hms.network.httpclient.Request;

/* JADX INFO: loaded from: classes9.dex */
public abstract class WebSocket {
    public abstract void cancel();

    public abstract boolean close(int i, String str);

    public abstract long queueSize();

    public abstract Request request();

    public abstract boolean send(String str);

    public abstract boolean send(byte[] bArr);
}
