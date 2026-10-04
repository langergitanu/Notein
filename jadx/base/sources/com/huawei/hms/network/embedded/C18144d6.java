package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18144d6 {

    /* JADX INFO: renamed from: a */
    public C18158e6 f54530a = new C18158e6();

    /* JADX INFO: renamed from: a */
    public void m78176a() {
    }

    /* JADX INFO: renamed from: b */
    public void m78183b() {
    }

    /* JADX INFO: renamed from: c */
    public void m78186c() {
    }

    /* JADX INFO: renamed from: d */
    public void m78187d() {
    }

    /* JADX INFO: renamed from: e */
    public void m78188e() {
    }

    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.f54530a;
    }

    /* JADX INFO: renamed from: a */
    public void m78177a(long j) {
        this.f54530a.getMetrics().setRequestByteCount(j);
    }

    /* JADX INFO: renamed from: b */
    public void m78184b(long j) {
        this.f54530a.getMetrics().setResponseByteCount(j);
    }

    /* JADX INFO: renamed from: a */
    public void m78178a(Response response) {
        this.f54530a.getMetricsTime().setCallEndTime();
        this.f54530a.getMetricsRealTime().setCallEndTime();
    }

    /* JADX INFO: renamed from: b */
    public void m78185b(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m78179a(Exception exc) {
        this.f54530a.setException(exc);
        this.f54530a.getMetricsTime().setCallEndTime();
        this.f54530a.getMetricsRealTime().setCallEndTime();
    }

    /* JADX INFO: renamed from: a */
    public void m78180a(String str) {
        this.f54530a.setUrl(str);
        this.f54530a.getMetricsTime().setCallStartTime();
        this.f54530a.getMetricsRealTime().setCallStartTime();
    }

    /* JADX INFO: renamed from: a */
    public void m78181a(String str, String str2, String str3, InterfaceC18267m3 interfaceC18267m3) {
    }

    /* JADX INFO: renamed from: a */
    public void m78182a(Map<String, List<String>> map) {
    }
}
