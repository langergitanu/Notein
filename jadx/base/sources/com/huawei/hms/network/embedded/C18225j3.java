package com.huawei.hms.network.embedded;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.AbstractC18129c5;
import com.huawei.hms.network.embedded.C18253l3;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.embedded.C18413x4;
import com.huawei.hms.network.embedded.InterfaceC18267m3;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.httpclient.excutor.PolicyExecutor;
import com.huawei.hms.network.httpclient.internal.IHttpClientBuilder;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.httpclient.websocket.WebSocketListener;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.io.IOException;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o0O00oO0.C25847OooO0Oo;
import o0O00oO0.C25849OooO0oO;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18225j3 extends HttpClient {

    /* JADX INFO: renamed from: o */
    public static final String f55306o = "RealHttpClient";

    /* JADX INFO: renamed from: p */
    public static final int f55307p = 101;

    /* JADX INFO: renamed from: q */
    public static volatile X509TrustManager f55308q;

    /* JADX INFO: renamed from: a */
    public final List<Interceptor> f55309a;

    /* JADX INFO: renamed from: b */
    public final List<Interceptor> f55310b;

    /* JADX INFO: renamed from: c */
    public InterfaceC18267m3.a f55311c;

    /* JADX INFO: renamed from: d */
    public InterfaceC18267m3.a f55312d;

    /* JADX INFO: renamed from: e */
    public X509TrustManager f55313e;

    /* JADX INFO: renamed from: f */
    public SSLSocketFactory f55314f;

    /* JADX INFO: renamed from: g */
    public HostnameVerifier f55315g;

    /* JADX INFO: renamed from: h */
    public AbstractC18129c5.c f55316h;

    /* JADX INFO: renamed from: i */
    public boolean f55317i;

    /* JADX INFO: renamed from: j */
    public InterfaceC18335r4 f55318j;

    /* JADX INFO: renamed from: k */
    public Proxy f55319k;

    /* JADX INFO: renamed from: l */
    public C18360t3 f55320l;

    /* JADX INFO: renamed from: m */
    public boolean f55321m;

    /* JADX INFO: renamed from: n */
    public final PolicyExecutor f55322n;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.j3$a */
    public class a extends Callback<ResponseBody> {
        public a() {
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit<ResponseBody> submit, Throwable th) {
            Logger.m76967w(C18225j3.f55306o, "websocket request fail");
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit<ResponseBody> submit, Response<ResponseBody> response) throws IOException {
            if (response == null || response.getCode() != 101) {
                Logger.m76967w(C18225j3.f55306o, "websocket response exception");
            } else {
                Logger.m76963i(C18225j3.f55306o, "websocket response ok");
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.j3$b */
    public static final class b extends IHttpClientBuilder {

        /* JADX INFO: renamed from: a */
        public final List<Interceptor> f55324a;

        /* JADX INFO: renamed from: b */
        public final List<Interceptor> f55325b;

        /* JADX INFO: renamed from: c */
        public X509TrustManager f55326c;

        /* JADX INFO: renamed from: d */
        public SSLSocketFactory f55327d;

        /* JADX INFO: renamed from: e */
        public HostnameVerifier f55328e;

        /* JADX INFO: renamed from: f */
        public boolean f55329f;

        /* JADX INFO: renamed from: g */
        public boolean f55330g;

        /* JADX INFO: renamed from: h */
        public Proxy f55331h;

        /* JADX INFO: renamed from: i */
        public C18360t3 f55332i;

        /* JADX INFO: renamed from: j */
        public PolicyExecutor f55333j;

        public b() {
            this.f55324a = new ArrayList();
            this.f55325b = new ArrayList();
            this.f55330g = true;
            this.f55333j = new PolicyExecutor();
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b addInterceptor(Interceptor interceptor) {
            if (interceptor == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f55324a.add(new C18321q3.c(interceptor));
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b addNetworkInterceptor(Interceptor interceptor) {
            if (interceptor == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f55325b.add(new C18321q3.c(interceptor));
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public HttpClient build() {
            return new C18225j3(this, null);
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b cache(String str, long j) {
            this.f55332i = new C18360t3(str, j);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b callTimeout(int i) {
            this.f55333j.setValue(PolicyNetworkService.RequestConstants.CALL_TIMEOUT, Integer.valueOf(i));
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b connectTimeout(int i) {
            this.f55333j.setValue(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT, Integer.valueOf(i));
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b enableQuic(boolean z) {
            this.f55329f = z;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b hostnameVerifier(HostnameVerifier hostnameVerifier) {
            CheckParamUtils.checkNotNull(hostnameVerifier, "hostnameVerifier == null");
            this.f55328e = hostnameVerifier;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b options(String str) {
            if (str == null) {
                Logger.m76967w(C18225j3.f55306o, "RealHttpclient options == null");
                return this;
            }
            this.f55333j.setOptions(str);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b pingInterval(int i) {
            this.f55333j.setValue(PolicyNetworkService.RequestConstants.PING_INTERVAL, Integer.valueOf(i));
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b proxy(Proxy proxy) {
            this.f55331h = proxy;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b readTimeout(int i) {
            this.f55333j.setValue(PolicyNetworkService.RequestConstants.READ_TIMEOUT, Integer.valueOf(i));
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b retryTimeOnConnectionFailure(int i) {
            this.f55333j.setValue(PolicyNetworkService.RequestConstants.RETRY_TIME, Integer.valueOf(i));
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            CheckParamUtils.checkNotNull(sSLSocketFactory, "sslSocketFactory == null");
            CheckParamUtils.checkNotNull(x509TrustManager, "trustManager == null");
            this.f55327d = sSLSocketFactory;
            this.f55326c = x509TrustManager;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.internal.IHttpClientBuilder
        public b writeTimeout(int i) {
            this.f55333j.setValue(PolicyNetworkService.RequestConstants.WRITE_TIMEOUT, Integer.valueOf(i));
            return this;
        }

        public b(C18225j3 c18225j3) {
            ArrayList arrayList = new ArrayList();
            this.f55324a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f55325b = arrayList2;
            this.f55330g = true;
            arrayList.addAll(c18225j3.f55309a);
            arrayList2.addAll(c18225j3.f55310b);
            this.f55326c = c18225j3.f55313e;
            this.f55327d = c18225j3.f55314f;
            this.f55328e = c18225j3.f55315g;
            this.f55329f = c18225j3.f55317i;
            this.f55332i = c18225j3.f55320l;
            this.f55330g = c18225j3.f55321m;
            this.f55331h = c18225j3.f55319k;
            this.f55333j = c18225j3.f55322n;
        }
    }

    public C18225j3(b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f55309a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f55310b = arrayList2;
        this.f55321m = true;
        PolicyExecutor policyExecutor = bVar.f55333j;
        this.f55322n = policyExecutor;
        this.f55313e = bVar.f55326c;
        this.f55314f = bVar.f55327d;
        this.f55317i = bVar.f55329f;
        if (this.f55313e == null) {
            m78859c();
        }
        HostnameVerifier hostnameVerifier = bVar.f55328e;
        this.f55315g = hostnameVerifier;
        if (hostnameVerifier == null) {
            this.f55315g = C25847OooO0Oo.f88202OooO0Oo;
        }
        arrayList.addAll(bVar.f55324a);
        arrayList2.addAll(bVar.f55325b);
        if (this.f55316h == null) {
            this.f55316h = new C18413x4.b(policyExecutor.getBoolean("", PolicyNetworkService.ClientConstants.ENABLE_PLAINTEXT_URL_PATH));
        }
        if (this.f55318j == null) {
            InterfaceC18335r4 interfaceC18335r4 = InterfaceC18335r4.DEFAULT;
            this.f55318j = interfaceC18335r4;
            interfaceC18335r4.setDnstime(policyExecutor.getInt("", PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT));
        }
        if (this.f55317i) {
            if (C18240k4.getInstance().isSupportCronet()) {
                C18240k4.getInstance().lazyInitHmsQuicLoader();
                C18240k4.getInstance().loadQuicConf();
            } else {
                Logger.m76963i(f55306o, "system don't support cronet, so diable quic!!!");
                this.f55317i = false;
            }
        }
        this.f55319k = bVar.f55331h;
        this.f55320l = bVar.f55332i;
        this.f55321m = bVar.f55330g;
        this.f55311c = m78849a();
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC18267m3.a m78849a() {
        InterfaceC18267m3.a aVarM78855b = m78855b();
        return aVarM78855b == null ? new C18186g6(this) : aVarM78855b;
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC18267m3.a m78855b() {
        try {
            C18118b8.m77930D();
            Logger.m76965v(f55306o, "OkHttpClient create success");
            return new C18297o5(this);
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            Logger.m76968w(f55306o, "is this type you want?", e);
            return null;
        }
    }

    public boolean disableWeakNetworkRetry() {
        return this.f55322n.getBoolean("", PolicyNetworkService.ClientConstants.DISABLE_WEAKNETWORK_RETRY);
    }

    public C18360t3 getCache() {
        return this.f55320l;
    }

    public InterfaceC18335r4 getDns() {
        return this.f55318j;
    }

    public AbstractC18129c5.c getEventListenerFactory() {
        return this.f55316h;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f55315g;
    }

    public List<Interceptor> getInterceptors() {
        return Collections.unmodifiableList(this.f55309a);
    }

    public List<Interceptor> getNetworkInterceptors() {
        return Collections.unmodifiableList(this.f55310b);
    }

    public PolicyExecutor getPolicyExecutor() {
        return this.f55322n;
    }

    public Proxy getProxy() {
        return this.f55319k;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f55314f;
    }

    public X509TrustManager getTrustManager() {
        return this.f55313e;
    }

    @Override // com.huawei.hms.network.httpclient.HttpClient
    public IHttpClientBuilder newBuilder() {
        return new b(this);
    }

    @Override // com.huawei.hms.network.httpclient.HttpClient
    public Request.Builder newRequest() {
        return new C18253l3.b();
    }

    @Override // com.huawei.hms.network.httpclient.HttpClient, com.huawei.hms.network.httpclient.Submit.Factory
    public Submit<ResponseBody> newSubmit(Request request) {
        CheckParamUtils.checkNotNull(request, "request == null");
        if (this.f55313e == null || this.f55314f == null) {
            m78859c();
            this.f55311c = m78849a();
        }
        C18185g5 c18185g5 = new C18185g5(request.getUrl());
        String strM78852a = m78852a(c18185g5.getHost());
        return new C18321q3.h(new C18155e3(this, m78851a(request, this.f55322n.getRequestPramas(strM78852a, c18185g5.getHost()), strM78852a), null));
    }

    @Override // com.huawei.hms.network.httpclient.HttpClient
    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        C18185g5 c18185g5 = new C18185g5(request.getUrl());
        String strM78852a = m78852a(c18185g5.getHost());
        C18321q3.d dVarM78851a = m78851a(request, this.f55322n.getRequestPramas(strM78852a, c18185g5.getHost()), strM78852a);
        C18228j6 c18228j6 = new C18228j6(dVarM78851a, new C18321q3.j(webSocketListener));
        m78854a(dVarM78851a, new C18321q3.i(c18228j6));
        return c18228j6;
    }

    public boolean quicEnabled() {
        return this.f55317i;
    }

    public /* synthetic */ C18225j3(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC18267m3.a m78850a(Context context) {
        C18296o4 c18296o4;
        if (context == null || !C18240k4.getInstance().isAvailable() || (c18296o4 = C18296o4.getInstance(context)) == null || !c18296o4.isAvailable()) {
            return null;
        }
        return c18296o4;
    }

    /* JADX INFO: renamed from: b */
    private Submit<ResponseBody> m78856b(C18321q3.d dVar, WebSocket webSocket) {
        if (this.f55313e == null || this.f55314f == null) {
            m78859c();
            this.f55311c = m78849a();
        }
        return new C18321q3.h(new C18155e3(this, dVar, webSocket));
    }

    /* JADX INFO: renamed from: c */
    private void m78859c() {
        try {
            if (f55308q == null) {
                synchronized (HttpClient.class) {
                    try {
                        if (f55308q == null) {
                            f55308q = new C25849OooO0oO(ContextHolder.getResourceContext());
                        }
                    } finally {
                    }
                }
            }
            this.f55313e = f55308q;
            this.f55314f = C25847OooO0Oo.OooO00o(ContextHolder.getResourceContext());
        } catch (IOException e) {
            e = e;
            Logger.m76968w(f55306o, "catch exception when create sslSocketFactory", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            Logger.m76968w(f55306o, "catch exception when create sslSocketFactory", e);
        } catch (KeyManagementException e3) {
            e = e3;
            Logger.m76968w(f55306o, "catch exception when create sslSocketFactory", e);
        } catch (KeyStoreException e4) {
            e = e4;
            Logger.m76968w(f55306o, "catch exception when create sslSocketFactory", e);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            Logger.m76968w(f55306o, "catch exception when create sslSocketFactory", e);
        } catch (CertificateException e6) {
            e = e6;
            Logger.m76968w(f55306o, "catch exception when create sslSocketFactory", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC18267m3.a m78867a(Request request) {
        C18185g5 c18185g5 = new C18185g5(request.getUrl());
        String host = c18185g5.getHost();
        int port = c18185g5.getPort();
        if (this.f55317i && C18240k4.getInstance().isEnableQuic(host, port).booleanValue()) {
            if (this.f55312d == null) {
                try {
                    this.f55312d = m78850a(new C18184g4(ContextHolder.getResourceContext()));
                } catch (Throwable th) {
                    Logger.m76960e(f55306o, "fail to get cronet factory, exception name:".concat(th.getClass().getSimpleName()));
                    this.f55312d = null;
                }
            }
            InterfaceC18267m3.a aVar = this.f55312d;
            if (aVar != null) {
                return aVar;
            }
        }
        return this.f55311c;
    }

    /* JADX INFO: renamed from: a */
    private C18321q3.d m78851a(Request request, String str, String str2) {
        C18170f4 c18170f4 = new C18170f4(request.getOptions());
        Logger.m76965v(f55306o, "requestOptions: " + request.getOptions());
        Logger.m76965v(f55306o, "clientOptions: " + str);
        c18170f4.appendOption(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PolicyNetworkService.ProfileConstants.SCENE_TYPE, str2);
        } catch (JSONException unused) {
            Logger.m76967w(f55306o, "appendSceneType error " + str2);
        }
        c18170f4.appendOption(jSONObject.toString());
        Logger.m76965v(f55306o, "newRequestOptions: " + c18170f4.toString());
        return new C18321q3.d(request.newBuilder().options(c18170f4.toString()).build());
    }

    /* JADX INFO: renamed from: a */
    private String m78852a(String str) {
        String value = this.f55322n.getValue(str, PolicyNetworkService.ProfileConstants.SCENE_TYPE);
        return (value == null || value.length() == 0) ? "default" : (TextUtils.equals(value, PolicyNetworkService.ProfileConstants.FILE_MANAGER) || TextUtils.equals(value, PolicyNetworkService.ProfileConstants.RESTFUL)) ? value : "default";
    }

    /* JADX INFO: renamed from: a */
    private void m78854a(C18321q3.d dVar, WebSocket webSocket) {
        m78856b(dVar, webSocket).enqueue(new a());
    }
}
