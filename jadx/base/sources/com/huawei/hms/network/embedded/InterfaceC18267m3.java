package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m3 */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18267m3 {

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.m3$a */
    public interface a {
        InterfaceC18267m3 newTask();
    }

    void cancel();

    InterfaceC18267m3 clone();

    C18321q3.f<ResponseBody> execute(C18321q3.d dVar, WebSocket webSocket) throws IOException;

    C18199h5 getConnectionInfo();

    RequestFinishedInfo getRequestFinishedInfo();

    boolean isCanceled();

    boolean isExecuted();

    C18321q3.d request();
}
