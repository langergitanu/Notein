package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z4 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18439z4 extends RequestFinishedInfo.MetricsTime {

    /* JADX INFO: renamed from: a */
    public long f56782a;

    /* JADX INFO: renamed from: b */
    public long f56783b;

    /* JADX INFO: renamed from: c */
    public long f56784c;

    /* JADX INFO: renamed from: d */
    public long f56785d;

    /* JADX INFO: renamed from: e */
    public long f56786e;

    /* JADX INFO: renamed from: f */
    public long f56787f;

    /* JADX INFO: renamed from: g */
    public long f56788g;

    /* JADX INFO: renamed from: h */
    public long f56789h;

    /* JADX INFO: renamed from: i */
    public long f56790i;

    /* JADX INFO: renamed from: j */
    public long f56791j;

    /* JADX INFO: renamed from: k */
    public long f56792k;

    /* JADX INFO: renamed from: l */
    public long f56793l;

    /* JADX INFO: renamed from: m */
    public long f56794m;

    /* JADX INFO: renamed from: n */
    public long f56795n;

    /* JADX INFO: renamed from: o */
    public long f56796o;

    /* JADX INFO: renamed from: p */
    public long f56797p;

    /* JADX INFO: renamed from: q */
    public long f56798q;

    /* JADX INFO: renamed from: r */
    public long f56799r;

    /* JADX INFO: renamed from: s */
    public boolean f56800s;

    /* JADX INFO: renamed from: t */
    public long f56801t;
    public long ttfb;

    public AbstractC18439z4() {
    }

    public long getAndCheckEndTime(long j, long j2) {
        return (j == 0 || j2 != 0) ? j2 : Utils.getCurrentTime(this.f56800s);
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getCallEndTime() {
        return this.f56799r;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getCallStartTime() {
        return this.f56782a;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getConnectEndTime() {
        return this.f56788g;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getConnectStartTime() {
        return this.f56785d;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getConnectionAcquiredTime() {
        return this.f56789h;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getConnectionReleasedTime() {
        return this.f56790i;
    }

    public long getCurrentTime() {
        return Utils.getCurrentTime(this.f56800s);
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getDnsEndTime() {
        return this.f56784c;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getDnsStartTime() {
        return this.f56783b;
    }

    public long getPingInterval() {
        return this.f56801t;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getRequestBodyEndTime() {
        return this.f56794m;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getRequestBodyStartTime() {
        return this.f56793l;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getRequestHeadersEndTime() {
        return this.f56792k;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getRequestHeadersStartTime() {
        return this.f56791j;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getResponseBodyEndTime() {
        return this.f56798q;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getResponseBodyStartTime() {
        return this.f56797p;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getResponseHeadersEndTime() {
        return this.f56796o;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getResponseHeadersStartTime() {
        return this.f56795n;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getSecureConnectEndTime() {
        return this.f56787f;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
    public long getSecureConnectStartTime() {
        return this.f56786e;
    }

    public void setCallEndTime() {
        this.f56799r = getCurrentTime();
    }

    public void setCallStartTime() {
        this.f56782a = getCurrentTime();
    }

    public void setConnectEndTime() {
        this.f56788g = getCurrentTime();
    }

    public void setConnectStartTime() {
        this.f56785d = getCurrentTime();
    }

    public void setConnectionAcquiredTime() {
        this.f56789h = getCurrentTime();
    }

    public void setConnectionReleasedTime() {
        this.f56790i = getCurrentTime();
    }

    public void setDnsEndTime() {
        this.f56784c = getCurrentTime();
    }

    public void setDnsStartTime() {
        this.f56783b = getCurrentTime();
    }

    public void setPingInterval(long j) {
        this.f56801t = j;
    }

    public void setRequestBodyEndTime() {
        this.f56794m = getCurrentTime();
    }

    public void setRequestBodyStartTime() {
        this.f56793l = getCurrentTime();
    }

    public void setRequestHeadersEndTime() {
        this.f56792k = getCurrentTime();
    }

    public void setRequestHeadersStartTime() {
        this.f56791j = getCurrentTime();
    }

    public void setResponseBodyEndTime() {
        this.f56798q = getCurrentTime();
    }

    public void setResponseBodyStartTime() {
        this.f56797p = getCurrentTime();
    }

    public void setResponseHeadersEndTime() {
        this.f56796o = getCurrentTime();
    }

    public void setResponseHeadersStartTime() {
        this.f56795n = getCurrentTime();
    }

    public void setSecureConnectEndTime() {
        this.f56787f = getCurrentTime();
    }

    public void setSecureConnectStartTime() {
        this.f56786e = getCurrentTime();
    }

    public void setTtfb(long j) {
        this.ttfb = j;
    }

    public AbstractC18439z4(boolean z) {
        this.f56800s = z;
    }

    public void setCallEndTime(long j) {
        this.f56799r = j;
    }

    public void setCallStartTime(long j) {
        this.f56782a = j;
    }

    public void setConnectEndTime(long j) {
        this.f56788g = j;
    }

    public void setConnectStartTime(long j) {
        this.f56785d = j;
    }

    public void setConnectionAcquiredTime(long j) {
        this.f56789h = j;
    }

    public void setConnectionReleasedTime(long j) {
        this.f56790i = j;
    }

    public void setDnsEndTime(long j) {
        this.f56784c = j;
    }

    public void setDnsStartTime(long j) {
        this.f56783b = j;
    }

    public void setRequestBodyEndTime(long j) {
        this.f56794m = j;
    }

    public void setRequestBodyStartTime(long j) {
        this.f56793l = j;
    }

    public void setRequestHeadersEndTime(long j) {
        this.f56792k = j;
    }

    public void setRequestHeadersStartTime(long j) {
        this.f56791j = j;
    }

    public void setResponseBodyEndTime(long j) {
        this.f56798q = j;
    }

    public void setResponseBodyStartTime(long j) {
        this.f56797p = j;
    }

    public void setResponseHeadersEndTime(long j) {
        this.f56796o = j;
    }

    public void setResponseHeadersStartTime(long j) {
        this.f56795n = j;
    }

    public void setSecureConnectEndTime(long j) {
        this.f56787f = j;
    }

    public void setSecureConnectStartTime(long j) {
        this.f56786e = j;
    }
}
