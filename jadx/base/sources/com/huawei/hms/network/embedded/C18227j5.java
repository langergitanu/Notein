package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.AbstractC18338r7;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.inner.api.DnsNetworkService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18227j5 extends AbstractC18338r7 {

    /* JADX INFO: renamed from: g */
    public static final String f55339g = "HttpEventListener";

    /* JADX INFO: renamed from: h */
    public static final AtomicLong f55340h = new AtomicLong(1);

    /* JADX INFO: renamed from: i */
    public static final a f55341i = new a();

    /* JADX INFO: renamed from: a */
    public final long f55342a;

    /* JADX INFO: renamed from: b */
    public final C18310p5 f55343b;

    /* JADX INFO: renamed from: c */
    public final DnsNetworkService f55344c;

    /* JADX INFO: renamed from: d */
    public long f55345d;

    /* JADX INFO: renamed from: e */
    public int f55346e = 0;

    /* JADX INFO: renamed from: f */
    public C18199h5 f55347f;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.j5$a */
    public static class a implements AbstractC18338r7.b {

        /* JADX INFO: renamed from: a */
        public WeakHashMap<InterfaceC18159e7, WeakReference<C18227j5>> f55348a = new WeakHashMap<>();

        /* JADX INFO: renamed from: b */
        public final Object f55349b = new Object();

        @Override // com.huawei.hms.network.embedded.AbstractC18338r7.b
        public C18227j5 create(InterfaceC18159e7 interfaceC18159e7) {
            C18227j5 c18227j5 = new C18227j5();
            synchronized (this.f55349b) {
                this.f55348a.put(interfaceC18159e7, new WeakReference<>(c18227j5));
            }
            return c18227j5;
        }

        public C18227j5 getListener(InterfaceC18159e7 interfaceC18159e7) {
            WeakReference<C18227j5> weakReference;
            synchronized (this.f55349b) {
                weakReference = this.f55348a.get(interfaceC18159e7);
            }
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    }

    public C18227j5() {
        NetworkService service = NetworkKitInnerImpl.getInstance().getService("dns");
        if (!(service instanceof DnsNetworkService)) {
            throw new IllegalStateException("DNS service not available");
        }
        this.f55344c = (DnsNetworkService) service;
        this.f55342a = f55340h.getAndIncrement();
        this.f55343b = new C18310p5();
    }

    /* JADX INFO: renamed from: a */
    private void m78881a(String str, long j) {
        Logger.m76966v(f55339g, "callId = %d / %s : ElapsedTime = %d", Long.valueOf(this.f55342a), str, Long.valueOf(j - this.f55345d));
    }

    public static a getFactory() {
        return f55341i;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void callEnd(InterfaceC18159e7 interfaceC18159e7) {
        super.callEnd(interfaceC18159e7);
        this.f55343b.getMetricsRealTime().setCallEndTime();
        this.f55343b.getMetricsTime().setCallEndTime();
        m78881a("callEnd", this.f55343b.getMetricsRealTime().getCallEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void callFailed(InterfaceC18159e7 interfaceC18159e7, IOException iOException) {
        super.callFailed(interfaceC18159e7, iOException);
        this.f55343b.setException(iOException);
        this.f55343b.getMetricsRealTime().setCallEndTime();
        this.f55343b.getMetricsTime().setCallEndTime();
        m78881a("callFailed", this.f55343b.getMetricsRealTime().getCallEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void callStart(InterfaceC18159e7 interfaceC18159e7) {
        super.callStart(interfaceC18159e7);
        this.f55343b.getMetricsRealTime().setCallStartTime();
        this.f55343b.getMetricsTime().setCallStartTime();
        this.f55343b.setUrl(interfaceC18159e7.request().m78310k().toString());
        this.f55345d = SystemClock.elapsedRealtime();
        m78881a("callStart", this.f55343b.getMetricsRealTime().getCallStartTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void connectEnd(InterfaceC18159e7 interfaceC18159e7, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC18132c8 enumC18132c8) {
        super.connectEnd(interfaceC18159e7, inetSocketAddress, proxy, enumC18132c8);
        if (enumC18132c8 != null) {
            this.f55343b.getMetrics().setProtocol(enumC18132c8.toString());
        }
        m78882a(inetSocketAddress, true);
        this.f55343b.getMetricsRealTime().setConnectEndTime();
        this.f55343b.getMetricsTime().setConnectEndTime();
        m78881a("connectEnd", this.f55343b.getMetricsRealTime().getConnectEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void connectFailed(InterfaceC18159e7 interfaceC18159e7, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC18132c8 enumC18132c8, IOException iOException) {
        super.connectFailed(interfaceC18159e7, inetSocketAddress, proxy, enumC18132c8, iOException);
        if (enumC18132c8 != null) {
            this.f55343b.getMetrics().setProtocol(enumC18132c8.toString());
        }
        this.f55343b.getMetricsRealTime().setConnectEndTime();
        this.f55343b.getMetricsTime().setConnectEndTime();
        m78881a("connectFailed", this.f55343b.getMetricsRealTime().getConnectEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void connectStart(InterfaceC18159e7 interfaceC18159e7, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(interfaceC18159e7, inetSocketAddress, proxy);
        C18426y4 metrics = this.f55343b.getMetrics();
        int i = this.f55346e;
        this.f55346e = i + 1;
        metrics.setConnectRetryTime(i);
        m78882a(inetSocketAddress, false);
        if (this.f55343b.getMetricsRealTime().getConnectStartTime() == 0) {
            this.f55343b.getMetricsRealTime().setConnectStartTime();
            this.f55343b.getMetricsTime().setConnectStartTime();
        }
        m78881a("connectStart", this.f55343b.getMetricsRealTime().getConnectStartTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void connectionAcquired(InterfaceC18159e7 interfaceC18159e7, InterfaceC18229j7 interfaceC18229j7) {
        super.connectionAcquired(interfaceC18159e7, interfaceC18229j7);
        C18217i9 c18217i9 = (C18217i9) interfaceC18229j7;
        this.f55343b.getMetricsRealTime().setConnectionAcquiredTime();
        this.f55343b.getMetricsTime().setConnectionAcquiredTime();
        m78881a("connectionAcquired", this.f55343b.getMetricsRealTime().getConnectionAcquiredTime());
        if (c18217i9 == null) {
            return;
        }
        this.f55347f = new C18199h5(this.f55343b.getHost(), c18217i9);
        C18216i8 c18216i8Mo78789b = c18217i9.mo78789b();
        EnumC18132c8 enumC18132c8Mo78791d = c18217i9.mo78791d();
        String strM78885a = c18217i9.mo78781a() != null ? c18217i9.mo78781a().m79565f().m78885a() : null;
        if (strM78885a != null) {
            this.f55343b.getMetrics().setTlsVersion(strM78885a);
        }
        if (enumC18132c8Mo78791d != null) {
            this.f55343b.getMetrics().setProtocol(enumC18132c8Mo78791d.toString());
        }
        if (c18216i8Mo78789b == null) {
            return;
        }
        m78882a(c18216i8Mo78789b.m78769d(), true);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void connectionReleased(InterfaceC18159e7 interfaceC18159e7, InterfaceC18229j7 interfaceC18229j7) {
        super.connectionReleased(interfaceC18159e7, interfaceC18229j7);
        this.f55343b.getMetricsRealTime().setConnectionReleasedTime();
        this.f55343b.getMetricsTime().setConnectionReleasedTime();
        m78881a("connectionReleased", this.f55343b.getMetricsRealTime().getConnectionReleasedTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void dnsEnd(InterfaceC18159e7 interfaceC18159e7, String str, List<InetAddress> list) {
        super.dnsEnd(interfaceC18159e7, str, list);
        this.f55343b.getMetricsRealTime().setDnsEndTime();
        this.f55343b.getMetricsTime().setDnsEndTime();
        this.f55343b.getMetrics().setDnsCache(this.f55344c.getDnsCache());
        this.f55343b.getMetrics().setDnsType(this.f55344c.getDnsType());
        m78881a("dnsEnd", this.f55343b.getMetricsRealTime().getDnsEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void dnsStart(InterfaceC18159e7 interfaceC18159e7, String str) {
        super.dnsStart(interfaceC18159e7, str);
        this.f55343b.getMetricsRealTime().setDnsStartTime();
        this.f55343b.getMetricsTime().setDnsStartTime();
        m78881a("dnsStart", this.f55343b.getMetricsRealTime().getDnsStartTime());
    }

    public C18199h5 getConnectionInfo() {
        return this.f55347f;
    }

    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.f55343b;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void requestBodyEnd(InterfaceC18159e7 interfaceC18159e7, long j) {
        super.requestBodyEnd(interfaceC18159e7, j);
        this.f55343b.getMetrics().setRequestByteCount(j);
        this.f55343b.getMetricsRealTime().setRequestBodyEndTime();
        this.f55343b.getMetricsTime().setRequestBodyEndTime();
        m78881a("requestBodyEnd", this.f55343b.getMetricsRealTime().getRequestBodyEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void requestBodyStart(InterfaceC18159e7 interfaceC18159e7) {
        super.requestBodyStart(interfaceC18159e7);
        this.f55343b.getMetricsRealTime().setRequestBodyStartTime();
        this.f55343b.getMetricsTime().setRequestBodyStartTime();
        m78881a("requestBodyStart", this.f55343b.getMetricsRealTime().getRequestBodyStartTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void requestHeadersEnd(InterfaceC18159e7 interfaceC18159e7, C18160e8 c18160e8) {
        super.requestHeadersEnd(interfaceC18159e7, c18160e8);
        this.f55343b.getMetricsRealTime().setRequestHeadersEndTime();
        this.f55343b.getMetricsTime().setRequestHeadersEndTime();
        m78881a("requestHeadersEnd", this.f55343b.getMetricsRealTime().getRequestHeadersEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void requestHeadersStart(InterfaceC18159e7 interfaceC18159e7) {
        super.requestHeadersStart(interfaceC18159e7);
        this.f55343b.getMetricsRealTime().setRequestHeadersStartTime();
        this.f55343b.getMetricsTime().setRequestHeadersStartTime();
        m78881a("requestHeadersStart", this.f55343b.getMetricsRealTime().getRequestHeadersStartTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void responseBodyEnd(InterfaceC18159e7 interfaceC18159e7, long j) {
        super.responseBodyEnd(interfaceC18159e7, j);
        this.f55343b.getMetricsRealTime().setResponseBodyEndTime();
        this.f55343b.getMetricsTime().setResponseBodyEndTime();
        m78881a("responseBodyEnd", this.f55343b.getMetricsRealTime().getResponseBodyEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void responseBodyStart(InterfaceC18159e7 interfaceC18159e7) {
        super.responseBodyStart(interfaceC18159e7);
        this.f55343b.getMetricsRealTime().setResponseBodyStartTime();
        this.f55343b.getMetricsTime().setResponseBodyStartTime();
        m78881a("responseBodyStart", this.f55343b.getMetricsRealTime().getResponseBodyStartTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void responseHeadersEnd(InterfaceC18159e7 interfaceC18159e7, C18188g8 c18188g8) {
        super.responseHeadersEnd(interfaceC18159e7, c18188g8);
        this.f55343b.getMetricsRealTime().setResponseHeadersEndTime();
        this.f55343b.getMetricsTime().setResponseHeadersEndTime();
        m78881a("responseHeadersEnd", this.f55343b.getMetricsRealTime().getResponseHeadersEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void responseHeadersStart(InterfaceC18159e7 interfaceC18159e7) {
        super.responseHeadersStart(interfaceC18159e7);
        this.f55343b.getMetricsRealTime().setResponseHeadersStartTime();
        this.f55343b.getMetricsTime().setResponseHeadersStartTime();
        this.f55343b.getMetricsRealTime().setTtfb(this.f55343b.getMetricsRealTime().getResponseHeadersStartTime());
        this.f55343b.getMetricsTime().setTtfb(this.f55343b.getMetricsTime().getResponseHeadersStartTime());
        m78881a("responseHeadersStart", this.f55343b.getMetricsRealTime().getResponseHeadersStartTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void secureConnectEnd(InterfaceC18159e7 interfaceC18159e7, C18364t7 c18364t7) {
        super.secureConnectEnd(interfaceC18159e7, c18364t7);
        this.f55343b.getMetricsRealTime().setSecureConnectEndTime();
        this.f55343b.getMetricsTime().setSecureConnectEndTime();
        m78881a("secureConnectEnd", this.f55343b.getMetricsRealTime().getSecureConnectEndTime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18338r7
    public void secureConnectStart(InterfaceC18159e7 interfaceC18159e7) {
        super.secureConnectStart(interfaceC18159e7);
        this.f55343b.getMetricsRealTime().setSecureConnectStartTime();
        this.f55343b.getMetricsTime().setSecureConnectStartTime();
        m78881a("secureConnectStart", this.f55343b.getMetricsRealTime().getSecureConnectStartTime());
    }

    /* JADX INFO: renamed from: a */
    private void m78882a(InetSocketAddress inetSocketAddress, boolean z) {
        InetAddress address;
        if (inetSocketAddress == null || (address = inetSocketAddress.getAddress()) == null) {
            return;
        }
        if (z) {
            this.f55343b.getMetrics().setSuccessIp(address.getHostAddress());
        } else {
            this.f55343b.getMetrics().addConnectIps(address.getHostAddress());
        }
    }
}
