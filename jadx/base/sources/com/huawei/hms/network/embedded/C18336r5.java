package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18141d3;
import com.huawei.hms.network.embedded.C18295o3;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.httpclient.websocket.WebSocketListener;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.r5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18336r5 extends AbstractC18258l8 {

    /* JADX INFO: renamed from: i */
    public static final String f56004i = "WebSocketListenerAdapter";

    /* JADX INFO: renamed from: a */
    public WebSocketListener f56005a;

    /* JADX INFO: renamed from: b */
    public WebSocket f56006b;

    /* JADX INFO: renamed from: c */
    public CountDownLatch f56007c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public volatile C18321q3.f<ResponseBody> f56008d;

    /* JADX INFO: renamed from: e */
    public Throwable f56009e;

    /* JADX INFO: renamed from: f */
    public C18321q3.d f56010f;

    /* JADX INFO: renamed from: g */
    public C18310p5 f56011g;

    /* JADX INFO: renamed from: h */
    public C18349s5 f56012h;

    public C18336r5(WebSocket webSocket, WebSocketListener webSocketListener, C18321q3.d dVar) {
        this.f56005a = webSocketListener;
        this.f56006b = webSocket;
        this.f56010f = dVar;
        m79444a();
    }

    /* JADX INFO: renamed from: a */
    private C18321q3.f<ResponseBody> m79442a(C18188g8 c18188g8) {
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
        bVar.headers(m79443a(c18188g8.m78591y())).code(c18188g8.m78589w()).message(c18188g8.m78572B()).url(c18188g8.m78578H().m78310k().toString());
        return new C18321q3.f<>(bVar.build());
    }

    public CountDownLatch getCountDownLatch() {
        return this.f56007c;
    }

    public C18310p5 getRequestFinishedInfo() {
        return this.f56011g;
    }

    public C18321q3.f<ResponseBody> getResponse() throws IOException {
        try {
            this.f56007c.await();
        } catch (InterruptedException e) {
            Logger.m76968w(f56004i, "InterruptedException ", e);
        }
        if (this.f56008d == null) {
            Throwable th = this.f56009e;
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
        }
        return this.f56008d == null ? new C18321q3.f<>(new C18141d3.b().build()) : this.f56008d;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18258l8
    public void onClosed(InterfaceC18244k8 interfaceC18244k8, int i, String str) {
        this.f56012h.reportData(Integer.valueOf(i));
        this.f56005a.onClosed(this.f56006b, i, str);
        Logger.m76965v(f56004i, "Closed " + str);
        CountDownLatch countDownLatch = this.f56007c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18258l8
    public void onClosing(InterfaceC18244k8 interfaceC18244k8, int i, String str) {
        this.f56005a.onClosing(this.f56006b, i, str);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18258l8
    public void onFailure(InterfaceC18244k8 interfaceC18244k8, Throwable th, C18188g8 c18188g8) {
        this.f56009e = th;
        if (th instanceof Exception) {
            Exception exc = (Exception) th;
            this.f56011g.setException(exc);
            this.f56012h.reportData(exc);
        } else {
            Exception exc2 = new Exception(th);
            this.f56011g.setException(exc2);
            this.f56012h.reportData(exc2);
        }
        this.f56008d = c18188g8 == null ? null : m79442a(c18188g8);
        this.f56005a.onFailure(this.f56006b, th, this.f56008d);
        CountDownLatch countDownLatch = this.f56007c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18258l8
    public void onMessage(InterfaceC18244k8 interfaceC18244k8, C18303ob c18303ob) {
        this.f56005a.onMessage(this.f56006b, c18303ob.mo78739m());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18258l8
    public void onOpen(InterfaceC18244k8 interfaceC18244k8, C18188g8 c18188g8) {
        this.f56011g.getMetricsTime().setSecureConnectEndTime();
        this.f56012h.reportData(Integer.valueOf(c18188g8.m78589w()));
        this.f56008d = m79442a(c18188g8);
        this.f56005a.onOpen(this.f56006b, this.f56008d);
        CountDownLatch countDownLatch = this.f56007c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: a */
    private Map<String, List<String>> m79443a(C18377u7 c18377u7) {
        Headers.Builder builder = new Headers.Builder();
        int iM79619d = c18377u7.m79619d();
        for (int i = 0; i < iM79619d; i++) {
            builder.add(c18377u7.m79612a(i), c18377u7.m79614b(i));
        }
        return builder.build().toMultimap();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18258l8
    public void onMessage(InterfaceC18244k8 interfaceC18244k8, String str) {
        this.f56005a.onMessage(this.f56006b, str);
    }

    /* JADX INFO: renamed from: a */
    private void m79444a() {
        C18310p5 c18310p5 = new C18310p5();
        this.f56011g = c18310p5;
        this.f56012h = new C18349s5(c18310p5, this.f56010f);
        this.f56011g.getMetricsTime().setPingInterval(this.f56010f.getNetConfig().getPingInterval());
        this.f56011g.getMetricsTime().setCallStartTime(System.currentTimeMillis());
    }
}
