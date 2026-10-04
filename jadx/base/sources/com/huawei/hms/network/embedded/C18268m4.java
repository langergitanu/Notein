package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18268m4 extends AbstractC18387v4 {

    /* JADX INFO: renamed from: h */
    public static final String f55655h = "CronetRequestFinishedInfo";

    /* JADX INFO: renamed from: f */
    public AbstractC18439z4 f55656f = new a();

    /* JADX INFO: renamed from: g */
    public C18426y4 f55657g = new C18426y4();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.m4$a */
    public static class a extends AbstractC18439z4 {

        /* JADX INFO: renamed from: u */
        public long f55658u;

        /* JADX INFO: renamed from: v */
        public long f55659v;

        @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
        public long getTotalTime() {
            return this.f55658u;
        }

        @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo.MetricsTime
        public long getTtfb() {
            return this.f55659v;
        }

        public void setTotalTime(long j) {
            this.f55658u = j;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18439z4
        public void setTtfb(long j) {
            this.f55659v = j;
        }
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public C18426y4 getMetrics() {
        return this.f55657g;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public AbstractC18439z4 getMetricsRealTime() {
        return this.f55656f;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public AbstractC18439z4 getMetricsTime() {
        return this.f55656f;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getNetworkSdkType() {
        return C18183g3.TYPE_CRONET;
    }
}
