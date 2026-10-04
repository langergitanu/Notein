package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18160e8;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import java.util.Random;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18269m5 extends WebSocket implements InterfaceC18242k6 {

    /* JADX INFO: renamed from: a */
    public C18163eb f55660a;

    /* JADX INFO: renamed from: b */
    public Request f55661b;

    /* JADX INFO: renamed from: c */
    public C18118b8 f55662c;

    /* JADX INFO: renamed from: d */
    public C18336r5 f55663d;

    public C18269m5(C18160e8.a aVar, C18321q3.d dVar, WebSocket webSocket, C18118b8 c18118b8) {
        if (!(webSocket instanceof C18228j6)) {
            throw new ClassCastException("websocket can not cast to WebSocketImpl");
        }
        this.f55663d = new C18336r5(webSocket, ((C18228j6) webSocket).getWebSocketListener(), dVar);
        aVar.m78322a(false);
        this.f55660a = new C18163eb(aVar.m78323a(), this.f55663d, new Random(), c18118b8.m77959t());
        this.f55661b = dVar;
        this.f55662c = c18118b8;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public void cancel() {
        this.f55660a.cancel();
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean close(int i, String str) {
        return this.f55660a.mo78351a(i, str);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18242k6
    public void connect() {
        this.f55663d.getRequestFinishedInfo().getMetricsTime().setSecureConnectStartTime();
        this.f55660a.m78345a(this.f55662c);
    }

    public C18336r5 getWebSocketListenerAdapter() {
        return this.f55663d;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public long queueSize() {
        return this.f55660a.mo78343a();
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public Request request() {
        return this.f55661b;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean send(String str) {
        return this.f55660a.mo78356b(str);
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean send(byte[] bArr) {
        return this.f55660a.mo78355b(C18303ob.m79300e(bArr));
    }
}
