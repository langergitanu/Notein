package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v4 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18387v4 extends RequestFinishedInfo {

    /* JADX INFO: renamed from: e */
    public static final String f56362e = "BaseRequestFinishedInfo";

    /* JADX INFO: renamed from: a */
    public String f56363a;

    /* JADX INFO: renamed from: b */
    public String f56364b;

    /* JADX INFO: renamed from: c */
    public Exception f56365c;

    /* JADX INFO: renamed from: d */
    public Response f56366d;

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public Exception getException() {
        return this.f56365c;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getHost() {
        return this.f56363a;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public long getPingInterval() {
        return 0L;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public Response getResponse() {
        return this.f56366d;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getUrl() {
        return this.f56364b;
    }

    public void setException(Exception exc) {
        this.f56365c = exc;
    }

    public void setResponse(Response response) {
        this.f56366d = response;
    }

    public void setUrl(String str) {
        this.f56364b = str;
        try {
            this.f56363a = new URL(str).getHost();
        } catch (MalformedURLException unused) {
            Logger.m76963i(f56362e, "fail to get hostname from url");
        }
    }
}
