package com.alipay.android.phone.mrpc.core;

import com.alipay.android.phone.mrpc.core.C0150b;
import org.apache.http.client.RedirectHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0152d extends DefaultHttpClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0150b f57a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152d(C0150b c0150b, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
        this.f57a = c0150b;
    }

    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    public final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new C0154f(this);
    }

    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    public final HttpContext createHttpContext() {
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    public final BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor basicHttpProcessorCreateHttpProcessor = super.createHttpProcessor();
        basicHttpProcessorCreateHttpProcessor.addRequestInterceptor(C0150b.f50c);
        basicHttpProcessorCreateHttpProcessor.addRequestInterceptor(new C0150b.a(this.f57a, (byte) 0));
        return basicHttpProcessorCreateHttpProcessor;
    }

    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    public final RedirectHandler createRedirectHandler() {
        return new C0153e(this);
    }
}
