package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0151c implements HttpRequestInterceptor {
    @Override // org.apache.http.HttpRequestInterceptor
    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new RuntimeException("This thread forbids HTTP requests");
        }
    }
}
