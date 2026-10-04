package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18310p5 extends AbstractC18387v4 {

    /* JADX INFO: renamed from: k */
    public static final String f55874k = "OkhttpConnRequestFinish";

    /* JADX INFO: renamed from: f */
    public String f55875f;

    /* JADX INFO: renamed from: g */
    public String f55876g;

    /* JADX INFO: renamed from: h */
    public AbstractC18439z4 f55877h = new a(false);

    /* JADX INFO: renamed from: i */
    public AbstractC18439z4 f55878i = new a(true);

    /* JADX INFO: renamed from: j */
    public C18426y4 f55879j = new C18426y4();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.p5$a */
    public static class a extends AbstractC18439z4 {
        public a(boolean z) {
            super(z);
        }

        @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
        public long getTotalTime() {
            return getAndCheckEndTime(getCallStartTime(), getCallEndTime()) - getCallStartTime();
        }

        @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
        public long getTtfb() {
            return getAndCheckEndTime(getCallStartTime(), this.ttfb) - getCallStartTime();
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18387v4, com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getHost() {
        return this.f55875f;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public C18426y4 getMetrics() {
        return this.f55879j;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public AbstractC18439z4 getMetricsRealTime() {
        return this.f55878i;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public AbstractC18439z4 getMetricsTime() {
        return this.f55877h;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getNetworkSdkType() {
        return C18183g3.TYPE_OKHTTP;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18387v4, com.huawei.hms.network.httpclient.RequestFinishedInfo
    public long getPingInterval() {
        return this.f55877h.getPingInterval();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18387v4, com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getUrl() {
        return this.f55876g;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18387v4
    public void setUrl(String str) {
        this.f55876g = str;
        try {
            this.f55875f = new URL(str).getHost();
        } catch (MalformedURLException unused) {
            Logger.m76963i(f55874k, "fail to get hostname from url");
        }
    }
}
