package com.huawei.hms.network.embedded;

import Oooo0oO.C21111o0ooOoO;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18118b8;
import com.huawei.hms.network.embedded.C18141d3;
import com.huawei.hms.network.embedded.C18160e8;
import com.huawei.hms.network.embedded.C18295o3;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.embedded.C18377u7;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.n5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18283n5 implements InterfaceC18267m3 {

    /* JADX INFO: renamed from: f */
    public static final String f55767f = "OkRequestTask";

    /* JADX INFO: renamed from: a */
    public C18118b8 f55768a;

    /* JADX INFO: renamed from: b */
    public InterfaceC18159e7 f55769b;

    /* JADX INFO: renamed from: c */
    public C18321q3.d f55770c;

    /* JADX INFO: renamed from: d */
    public boolean f55771d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f55772e;

    public C18283n5(C18118b8 c18118b8) {
        this.f55768a = c18118b8;
    }

    /* JADX INFO: renamed from: a */
    private C18118b8 m79254a(C18321q3.d dVar) {
        C18118b8.c cVarM77958s = this.f55768a.m77958s();
        long connectTimeout = dVar.getNetConfig().getConnectTimeout();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return cVarM77958s.m77997b(connectTimeout, timeUnit).m78010e(dVar.getNetConfig().getReadTimeout(), timeUnit).m78008d(dVar.getNetConfig().getPingInterval(), timeUnit).m78012f(dVar.getNetConfig().getWriteTimeout(), timeUnit).m78004c(dVar.getNetConfig().getConcurrentConnectDelay(), timeUnit).m77995a();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public void cancel() {
        this.f55772e = true;
        InterfaceC18159e7 interfaceC18159e7 = this.f55769b;
        if (interfaceC18159e7 != null) {
            interfaceC18159e7.cancel();
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC18267m3 m80719clone() {
        return new C18283n5(this.f55768a);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18321q3.f<ResponseBody> execute(C18321q3.d dVar, WebSocket webSocket) throws IOException {
        C18116b6 c18116b6;
        InterfaceC18159e7 c18323q5;
        Logger.m76963i(f55767f, "the request has used the okhttp!");
        synchronized (this) {
            if (this.f55771d) {
                throw new IllegalStateException("Already executed.");
            }
            this.f55771d = true;
        }
        if (this.f55772e) {
            throw C18127c3.m78085a("Canceled");
        }
        this.f55770c = dVar;
        C18160e8.a aVar = new C18160e8.a();
        String method = dVar.getMethod();
        if (dVar.getBody() != null) {
            if ("GET".equals(method)) {
                method = "POST";
            } else if (!C18366t9.m79567b(method)) {
                throw new ProtocolException(C21111o0ooOoO.OooO0Oo(method, " does not support writing"));
            }
            c18116b6 = new C18116b6((C18321q3.e) dVar.getBody());
        } else {
            c18116b6 = null;
        }
        Headers headersM77737of = Headers.m77737of(dVar.getHeaders());
        int size = headersM77737of.size();
        C18377u7.a aVar2 = new C18377u7.a();
        for (int i = 0; i < size; i++) {
            aVar2.m79624a(headersM77737of.name(i), headersM77737of.value(i));
        }
        aVar.m78330c(dVar.getUrl()).m78318a(method, c18116b6).m78313a(aVar2.m79627a()).m78322a(dVar.getNetConfig().enableConcurrentConnect());
        C18118b8 c18118b8M79254a = m79254a(dVar);
        if (dVar.getNetConfig().enableConnectEmptyBody() || dVar.getNetConfig().enableInnerConnectEmptyBody()) {
            c18323q5 = new C18323q5(c18118b8M79254a, aVar.m78323a());
        } else {
            if (webSocket != null) {
                if (!(webSocket instanceof C18321q3.i)) {
                    throw new ClassCastException("websocket can not cast to SafeApi.SafeWebSocket");
                }
                WebSocket webSocket2 = ((C18321q3.i) webSocket).getWebSocket();
                if (!(webSocket2 instanceof C18228j6)) {
                    throw new ClassCastException("websocket can not cast to WebSocketImpl");
                }
                C18228j6 c18228j6 = (C18228j6) webSocket2;
                C18269m5 c18269m5 = new C18269m5(aVar, dVar, c18228j6, c18118b8M79254a);
                c18269m5.connect();
                c18228j6.setProxy(c18269m5);
                return c18269m5.getWebSocketListenerAdapter().getResponse();
            }
            c18323q5 = c18118b8M79254a.mo77936a(aVar.m78323a());
        }
        this.f55769b = c18323q5;
        return m79255a(this.f55769b.execute());
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18199h5 getConnectionInfo() {
        C18227j5 listener = C18227j5.getFactory().getListener(this.f55769b);
        if (listener != null) {
            return listener.getConnectionInfo();
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public synchronized RequestFinishedInfo getRequestFinishedInfo() {
        C18227j5 listener = C18227j5.getFactory().getListener(this.f55769b);
        if (listener == null) {
            return null;
        }
        return listener.getRequestFinishedInfo();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public boolean isCanceled() {
        if (this.f55772e) {
            return true;
        }
        InterfaceC18159e7 interfaceC18159e7 = this.f55769b;
        return interfaceC18159e7 != null && interfaceC18159e7.isCanceled();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public synchronized boolean isExecuted() {
        return this.f55771d;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18321q3.d request() {
        return this.f55770c;
    }

    /* JADX INFO: renamed from: a */
    private C18321q3.f<ResponseBody> m79255a(C18188g8 c18188g8) {
        AbstractC18202h8 abstractC18202h8M78585s = c18188g8.m78585s();
        String strM79613a = c18188g8.m78591y().m79613a("Content-Type");
        C18295o3 c18295o3Build = null;
        C18442z7 c18442z7M80034b = strM79613a != null ? C18442z7.m80034b(strM79613a) : null;
        if (abstractC18202h8M78585s != null) {
            c18295o3Build = new C18295o3.b().inputStream(abstractC18202h8M78585s.m78687s()).contentLength(abstractC18202h8M78585s.mo78124v()).charSet(c18442z7M80034b != null ? c18442z7M80034b.m80035a() : null).contentType(c18442z7M80034b != null ? c18442z7M80034b.m80038c() : "").build();
        }
        C18141d3.b bVar = new C18141d3.b();
        if (c18295o3Build != null) {
            bVar.body(new C18321q3.g(c18295o3Build));
        }
        bVar.headers(m79256a(c18188g8.m78591y())).code(c18188g8.m78589w()).message(c18188g8.m78572B()).url(c18188g8.m78578H().m78310k().toString());
        return new C18321q3.f<>(bVar.build());
    }

    /* JADX INFO: renamed from: a */
    private Map<String, List<String>> m79256a(C18377u7 c18377u7) {
        Headers.Builder builder = new Headers.Builder();
        int iM79619d = c18377u7.m79619d();
        for (int i = 0; i < iM79619d; i++) {
            builder.addLenient(c18377u7.m79612a(i), c18377u7.m79614b(i));
        }
        return builder.build().toMultimap();
    }
}
