package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0154f implements ConnectionKeepAliveStrategy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0152d f60a;

    public C0154f(C0152d c0152d) {
        this.f60a = c0152d;
    }

    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return 180000L;
    }
}
