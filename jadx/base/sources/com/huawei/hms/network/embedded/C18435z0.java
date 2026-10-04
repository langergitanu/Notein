package com.huawei.hms.network.embedded;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18435z0 {

    /* JADX INFO: renamed from: b */
    public static final String f56742b = "HttpClientManager";

    /* JADX INFO: renamed from: c */
    public static final String f56743c = "https://";

    /* JADX INFO: renamed from: a */
    public volatile HttpClient f56744a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C18435z0 f56745a = new C18435z0();
    }

    public C18435z0() {
    }

    /* JADX INFO: renamed from: b */
    public static C18435z0 m80017b() {
        return b.f56745a;
    }

    /* JADX INFO: renamed from: a */
    public HttpClient m80018a() {
        if (this.f56744a == null) {
            synchronized (C18435z0.class) {
                try {
                    if (this.f56744a == null) {
                        NetworkKit.init(ContextHolder.getAppContext(), null);
                        this.f56744a = new HttpClient.Builder().retryTimeOnConnectionFailure(0).build();
                    }
                } finally {
                }
            }
        }
        return this.f56744a;
    }

    /* JADX INFO: renamed from: a */
    public void m80019a(HttpClient httpClient, String str, int i, Callback callback) {
        if (callback == null) {
            Logger.m76967w(f56742b, "callback is null connect no effect");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject().put("inner_connect_empty_body", true);
        } catch (JSONException e) {
            Logger.m76968w(f56742b, "recordMap fail to put:", e);
        }
        Request requestBuild = httpClient.newRequest().url(str).method("GET").options(jSONObject.toString()).build();
        for (int i2 = 0; i2 < i; i2++) {
            httpClient.newSubmit(requestBuild).enqueue(callback);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m80020a(String str, int i, Callback callback) {
        m80019a(m80018a(), OooO00o.OooO00o("https://", str), i, callback);
    }
}
