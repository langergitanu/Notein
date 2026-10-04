package com.huawei.agconnect.https;

import android.util.Log;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes8.dex */
public class OKHttpBuilder {
    private OkHttpClient.Builder builder = new OkHttpClient.Builder();

    public OKHttpBuilder addInterceptor(Interceptor interceptor) {
        if (interceptor == null) {
            throw new IllegalArgumentException("interceptor == null");
        }
        this.builder.f124204OooO0OO.add(interceptor);
        return this;
    }

    public OKHttpBuilder authenticator(Authenticator authenticator) {
        OkHttpClient.Builder builder = this.builder;
        builder.getClass();
        OooOOO0.OooO0oO(authenticator, "authenticator");
        builder.f124208OooO0oO = authenticator;
        return this;
    }

    public OkHttpClient build() {
        OkHttpClient.Builder builder = this.builder;
        builder.getClass();
        return new OkHttpClient(builder);
    }

    public OkHttpClient buildWithTimeOut(long j, TimeUnit timeUnit) {
        OkHttpClient.Builder builder = this.builder;
        builder.OooO00o(j, timeUnit);
        builder.OooO0OO(j, timeUnit);
        builder.OooO0o0(j, timeUnit);
        return new OkHttpClient(builder);
    }

    public OKHttpBuilder connectTimeout(long j) {
        this.builder.OooO00o(j, TimeUnit.MILLISECONDS);
        return this;
    }

    public OKHttpBuilder enableGzip() {
        OkHttpClient.Builder builder = this.builder;
        builder.f124204OooO0OO.add(new C17661c());
        return this;
    }

    public OKHttpBuilder readTimeout(long j) {
        this.builder.OooO0OO(j, TimeUnit.MILLISECONDS);
        return this;
    }

    public OKHttpBuilder setRetryTimes(int i) {
        OkHttpClient.Builder builder = this.builder;
        builder.f124204OooO0OO.add(new C17666g(i));
        return this;
    }

    public OKHttpBuilder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        try {
            this.builder.OooO0Oo(sSLSocketFactory, x509TrustManager);
            return this;
        } catch (NoSuchMethodError unused) {
            Log.d("OKHttpBuilder", "use default ssl");
            return this;
        }
    }

    public OKHttpBuilder writeTimeout(long j) {
        this.builder.OooO0o0(j, TimeUnit.MILLISECONDS);
        return this;
    }
}
