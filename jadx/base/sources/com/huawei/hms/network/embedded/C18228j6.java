package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.httpclient.websocket.WebSocketListener;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18228j6 extends WebSocket {

    /* JADX INFO: renamed from: a */
    public WebSocket f55350a;

    /* JADX INFO: renamed from: b */
    public Request f55351b;

    /* JADX INFO: renamed from: c */
    public WebSocketListener f55352c;

    public C18228j6(Request request, WebSocketListener webSocketListener) {
        this.f55351b = request;
        this.f55352c = webSocketListener;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public void cancel() {
        WebSocket webSocket = this.f55350a;
        if (webSocket != null) {
            webSocket.cancel();
        }
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean close(int i, String str) {
        WebSocket webSocket = this.f55350a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.close(i, str);
    }

    public Request getRequest() {
        return this.f55351b;
    }

    public WebSocketListener getWebSocketListener() {
        return this.f55352c;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public long queueSize() {
        WebSocket webSocket = this.f55350a;
        if (webSocket == null) {
            return 0L;
        }
        return webSocket.queueSize();
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public Request request() {
        WebSocket webSocket = this.f55350a;
        if (webSocket == null) {
            return null;
        }
        return webSocket.request();
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean send(String str) {
        WebSocket webSocket = this.f55350a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.send(str);
    }

    public void setProxy(WebSocket webSocket) {
        this.f55350a = webSocket;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean send(byte[] bArr) {
        WebSocket webSocket = this.f55350a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.send(bArr);
    }
}
