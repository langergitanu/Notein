package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18158e6 extends AbstractC18387v4 {

    /* JADX INFO: renamed from: i */
    public static final String f54614i = "URLConnRequestFinishedInfo";

    /* JADX INFO: renamed from: f */
    public AbstractC18439z4 f54615f = new a(false);

    /* JADX INFO: renamed from: g */
    public AbstractC18439z4 f54616g = new a(true);

    /* JADX INFO: renamed from: h */
    public C18426y4 f54617h = new C18426y4();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.e6$a */
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
            return 0L;
        }
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public C18426y4 getMetrics() {
        return this.f54617h;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public AbstractC18439z4 getMetricsRealTime() {
        return this.f54616g;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public AbstractC18439z4 getMetricsTime() {
        return this.f54615f;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getNetworkSdkType() {
        return C18183g3.TYPE_URLCONNECTION;
    }
}
