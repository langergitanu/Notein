package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.y4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18426y4 extends RequestFinishedInfo.Metrics {

    /* JADX INFO: renamed from: a */
    public final List<String> f56701a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public String f56702b = "";

    /* JADX INFO: renamed from: c */
    public String f56703c = "unknown";

    /* JADX INFO: renamed from: d */
    public int f56704d = -1;

    /* JADX INFO: renamed from: e */
    public long f56705e = -1;

    /* JADX INFO: renamed from: f */
    public long f56706f = -1;

    /* JADX INFO: renamed from: g */
    public String f56707g = "Reuse";

    /* JADX INFO: renamed from: h */
    public String f56708h = "unknown";

    /* JADX INFO: renamed from: i */
    public int f56709i = -1;

    public void addConnectIps(String str) {
        this.f56701a.add(str);
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public List<String> getConnectIps() {
        return this.f56701a;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public int getConnectRetryTime() {
        return this.f56704d;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public int getDnsCache() {
        return this.f56709i;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public String getDnsType() {
        return this.f56707g;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public String getProtocol() {
        return this.f56703c;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public long getRequestByteCount() {
        return this.f56705e;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public long getResponseByteCount() {
        return this.f56706f;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public String getSuccessIp() {
        return this.f56702b;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.Metrics
    public String getTlsVersion() {
        return this.f56708h;
    }

    public void setConnectIps(List<String> list) {
        this.f56701a.addAll(list);
    }

    public void setConnectRetryTime(int i) {
        this.f56704d = i;
    }

    public void setDnsCache(int i) {
        this.f56709i = i;
    }

    public void setDnsType(String str) {
        this.f56707g = str;
    }

    public void setProtocol(String str) {
        this.f56703c = str;
    }

    public void setRequestByteCount(long j) {
        this.f56705e = j;
    }

    public void setResponseByteCount(long j) {
        this.f56706f = j;
    }

    public void setSuccessIp(String str) {
        this.f56702b = str;
    }

    public void setTlsVersion(String str) {
        this.f56708h = str;
    }
}
