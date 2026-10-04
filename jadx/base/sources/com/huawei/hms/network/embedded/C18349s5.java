package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18349s5 {

    /* JADX INFO: renamed from: d */
    public static final String f56105d = "WebSocketEventListener";

    /* JADX INFO: renamed from: a */
    public C18310p5 f56106a;

    /* JADX INFO: renamed from: b */
    public C18321q3.d f56107b;

    /* JADX INFO: renamed from: c */
    public C18115b5 f56108c = new C18115b5();

    public C18349s5(C18310p5 c18310p5, C18321q3.d dVar) {
        this.f56106a = c18310p5;
        this.f56107b = dVar;
        m79488a();
    }

    /* JADX INFO: renamed from: a */
    private void m79488a() {
        try {
            URL url = new URL(this.f56107b.getUrl());
            this.f56108c.put("domain", url.getHost());
            this.f56108c.put(C18115b5.API_ID, url.getPath());
        } catch (MalformedURLException unused) {
            Logger.m76967w(f56105d, "Create Url error");
            this.f56108c.put(C18115b5.API_ID, "unknown");
        }
        this.f56108c.put("sdk_version", "5.0.4.300");
        this.f56108c.put("network_type", NetworkUtil.netWork(ContextHolder.getAppContext()));
        String str = this.f56107b.getNetConfig().getMap(PolicyNetworkService.RequestConstants.METRICS_DATA).get("trace_id");
        if (TextUtils.isEmpty(str)) {
            this.f56108c.put("trace_id", UUID.randomUUID().toString());
        } else {
            this.f56108c.put("trace_id", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void reportData(T t) {
        C18115b5 c18115b5;
        long secureConnectEndTime;
        if (!HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
            Logger.m76963i(f56105d, "HianalyticsHelper report disable");
            return;
        }
        if (t instanceof Integer) {
            this.f56108c.put("error_code", ((Integer) t).intValue());
        }
        this.f56108c.put("req_start_time", this.f56106a.getMetricsTime().getCallStartTime());
        this.f56108c.put(C18115b5.TOTAL_TIME, System.currentTimeMillis() - this.f56106a.getMetricsTime().getCallStartTime());
        if (this.f56106a.getMetricsTime().getSecureConnectEndTime() == 0) {
            c18115b5 = this.f56108c;
            secureConnectEndTime = System.currentTimeMillis();
        } else {
            c18115b5 = this.f56108c;
            secureConnectEndTime = this.f56106a.getMetricsTime().getSecureConnectEndTime();
        }
        c18115b5.put(C18115b5.CONNECT_TIME, secureConnectEndTime - this.f56106a.getMetricsTime().getSecureConnectStartTime());
        this.f56108c.put(C18115b5.WEBSOCKET_CLIENT_PING_INTERVAL, this.f56106a.getPingInterval());
        Exception exception = this.f56106a.getException();
        if (exception != null) {
            this.f56108c.put("error_code", C18214i6.getErrorCodeFromException(exception)).put("exception_name", exception.getClass().getSimpleName()).put("message", StringUtils.anonymizeMessage(exception.getMessage()));
        }
        HianalyticsHelper.getInstance().onEvent(this.f56108c.get(), C18115b5.WEBSOCKET_ID);
    }
}
