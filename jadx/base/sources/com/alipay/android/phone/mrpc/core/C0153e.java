package com.alipay.android.phone.mrpc.core;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0153e extends DefaultRedirectHandler {

    /* JADX INFO: renamed from: a */
    public int f58a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0152d f59b;

    public C0153e(C0152d c0152d) {
        this.f59b = c0152d;
    }

    @Override // org.apache.http.impl.client.DefaultRedirectHandler, org.apache.http.client.RedirectHandler
    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        int statusCode;
        this.f58a++;
        boolean zIsRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
        if (zIsRedirectRequested || this.f58a >= 5 || !((statusCode = httpResponse.getStatusLine().getStatusCode()) == 301 || statusCode == 302)) {
            return zIsRedirectRequested;
        }
        return true;
    }
}
