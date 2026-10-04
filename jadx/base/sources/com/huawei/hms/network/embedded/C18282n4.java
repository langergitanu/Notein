package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.base.common.MediaType;
import com.huawei.hms.network.embedded.C18141d3;
import com.huawei.hms.network.embedded.C18295o3;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.n4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18282n4 implements InterfaceC18267m3 {

    /* JADX INFO: renamed from: p */
    public static final String f55749p = "n4";

    /* JADX INFO: renamed from: q */
    public static final String f55750q = "Content-Length";

    /* JADX INFO: renamed from: a */
    public final CronetEngine f55751a;

    /* JADX INFO: renamed from: c */
    public final C18296o4 f55753c;

    /* JADX INFO: renamed from: d */
    public UrlRequest f55754d;

    /* JADX INFO: renamed from: f */
    public UrlResponseInfo f55756f;

    /* JADX INFO: renamed from: g */
    public IOException f55757g;

    /* JADX INFO: renamed from: h */
    public boolean f55758h;

    /* JADX INFO: renamed from: i */
    public boolean f55759i;

    /* JADX INFO: renamed from: j */
    public C18321q3.d f55760j;

    /* JADX INFO: renamed from: k */
    public boolean f55761k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f55762l;

    /* JADX INFO: renamed from: n */
    public boolean f55764n;

    /* JADX INFO: renamed from: o */
    public AbstractC18129c5 f55765o;

    /* JADX INFO: renamed from: b */
    public final ExecutorC18309p4 f55752b = new ExecutorC18309p4();

    /* JADX INFO: renamed from: e */
    public C18226j4 f55755e = new C18226j4(this);

    /* JADX INFO: renamed from: m */
    public RequestFinishedInfo f55763m = new C18268m4();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.n4$a */
    public class a extends UrlRequest.Callback {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        private void m79253a(IOException iOException) {
            C18282n4.this.f55757g = iOException;
            if (C18282n4.this.f55755e != null) {
                C18282n4.this.f55755e.m78880a(iOException);
            }
            C18282n4.this.f55759i = true;
            C18282n4.this.f55752b.quit();
        }

        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            C18282n4.this.f55756f = urlResponseInfo;
            m79253a(new IOException("disconnect() called"));
        }

        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            if (cronetException == null) {
                throw new IllegalStateException("Exception cannot be null in onFailed.");
            }
            C18282n4.this.f55756f = urlResponseInfo;
            m79253a(cronetException);
        }

        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            C18282n4.this.f55756f = urlResponseInfo;
            C18282n4.this.f55752b.quit();
        }

        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            C18282n4.this.f55758h = true;
            try {
                if (new URL(str).getProtocol().equals(C18282n4.this.m79244g())) {
                    C18282n4.this.f55754d.followRedirect();
                    return;
                }
            } catch (MalformedURLException e) {
                Logger.m76965v(C18282n4.f55749p, "onRedirectReceived occur exception:".concat(e.getClass().getSimpleName()));
            }
            C18282n4.this.f55756f = urlResponseInfo;
            C18282n4.this.f55754d.cancel();
            m79253a(null);
        }

        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            C18282n4.this.f55756f = urlResponseInfo;
            C18282n4.this.f55759i = true;
            C18282n4.this.f55752b.quit();
        }

        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            C18282n4.this.f55756f = urlResponseInfo;
            m79253a(null);
        }
    }

    public C18282n4(CronetEngine cronetEngine, C18296o4 c18296o4) {
        this.f55751a = cronetEngine;
        this.f55753c = c18296o4;
    }

    /* JADX INFO: renamed from: e */
    private long m79242e() {
        if (m79249a("content-length", -1L) > 2147483647L) {
            return -1L;
        }
        return (int) r3;
    }

    /* JADX INFO: renamed from: f */
    private String m79243f() {
        return m79250a("content-type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public String m79244g() {
        try {
            return new URL(this.f55760j.getUrl()).getProtocol();
        } catch (MalformedURLException e) {
            Logger.m76966v(f55749p, "getProtocol failed, Exception:%s", e.getClass().getSimpleName());
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    private int m79245h() {
        return this.f55760j.getNetConfig().getReadTimeout();
    }

    /* JADX INFO: renamed from: i */
    private void m79246i() throws IOException {
        if (!this.f55759i) {
            m79248k();
            this.f55752b.loop(m79245h());
        }
        m79239c();
    }

    /* JADX INFO: renamed from: j */
    private C18321q3.f m79247j() throws IOException {
        m79246i();
        int httpStatusCode = this.f55756f.getHttpStatusCode();
        if (this.f55762l) {
            disconnect();
            throw C18127c3.m78085a("Canceled");
        }
        C18295o3.b bVar = new C18295o3.b();
        String strM79243f = m79243f();
        MediaType mediaType = strM79243f != null ? MediaType.parse(strM79243f) : null;
        bVar.inputStream(httpStatusCode >= 400 ? getErrorStream() : getInputStream()).contentLength(m79242e()).contentType(strM79243f).charSet(mediaType != null ? mediaType.charset() : null);
        C18295o3 c18295o3Build = bVar.build();
        String url = this.f55756f.getUrl() != null ? this.f55756f.getUrl() : this.f55760j.getUrl();
        C18141d3.b bVar2 = new C18141d3.b();
        bVar2.body(new C18321q3.g(c18295o3Build)).code(httpStatusCode).message(this.f55756f.getHttpStatusText()).url(url).headers(this.f55756f.getAllHeaders());
        if (!this.f55762l) {
            return new C18321q3.f(bVar2.build());
        }
        disconnect();
        throw C18127c3.m78085a("Canceled");
    }

    /* JADX INFO: renamed from: k */
    private void m79248k() throws IOException {
        if (this.f55764n) {
            return;
        }
        ExperimentalUrlRequest.Builder builderNewUrlRequestBuilder = this.f55751a.newUrlRequestBuilder(this.f55760j.getUrl() == null ? "" : this.f55760j.getUrl(), new a(), this.f55752b);
        builderNewUrlRequestBuilder.addRequestAnnotation(this);
        String method = this.f55760j.getMethod();
        m79231a((UrlRequest.Builder) builderNewUrlRequestBuilder, Headers.m77737of(this.f55760j.getHeaders()));
        if (this.f55760j.getBody() != null) {
            if (method.equals("GET")) {
                method = "POST";
            }
            if (TextUtils.isEmpty(m79236b("Content-Length"))) {
                m79232a(builderNewUrlRequestBuilder, "Content-Length", this.f55760j.getBody().contentLength() + "");
            }
            Logger.m76963i(f55749p, "using cronet to request" + this.f55760j.getBody().contentLength());
            C18102a6 c18102a6 = new C18102a6((C18321q3.e) this.f55760j.getBody());
            builderNewUrlRequestBuilder.setUploadDataProvider(c18102a6, this.f55752b);
            m79232a(builderNewUrlRequestBuilder, "Content-Type", this.f55760j.getBody().contentType());
            if (TextUtils.isEmpty(m79236b("Content-Length"))) {
                m79232a(builderNewUrlRequestBuilder, "Content-Length", "" + c18102a6.getLength());
            }
        }
        builderNewUrlRequestBuilder.setHttpMethod(method);
        ExperimentalUrlRequest experimentalUrlRequestBuild = builderNewUrlRequestBuilder.build();
        this.f55754d = experimentalUrlRequestBuild;
        experimentalUrlRequestBuild.start();
        this.f55764n = true;
    }

    /* JADX INFO: renamed from: a */
    public long m79249a(String str, long j) {
        try {
            return Long.parseLong(m79250a(str));
        } catch (NumberFormatException e) {
            Logger.m76969w(f55749p, "getHeaderFieldLong failed, Exception:%s", e.getClass().getSimpleName());
            return j;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public void cancel() {
        this.f55762l = true;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC18267m3 m80718clone() {
        return new C18282n4(this.f55751a, this.f55753c);
    }

    public void disconnect() {
        if (this.f55764n) {
            this.f55754d.cancel();
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18321q3.f execute(C18321q3.d dVar, WebSocket webSocket) throws IOException {
        String str = f55749p;
        Logger.m76963i(str, "the request has used the cronet!");
        if (webSocket != null) {
            Logger.m76967w(str, "cronet can't use websocket");
            throw C18127c3.m78091d("cronet can't use websocket");
        }
        CheckParamUtils.checkNotNull(dVar, "request == null");
        synchronized (this) {
            if (this.f55761k) {
                throw new IllegalStateException("Already executed");
            }
            this.f55761k = true;
        }
        if (this.f55762l) {
            throw C18127c3.m78085a("Canceled");
        }
        this.f55760j = dVar;
        m79248k();
        if (!this.f55762l) {
            return m79247j();
        }
        disconnect();
        throw C18127c3.m78085a("Canceled");
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18199h5 getConnectionInfo() {
        return null;
    }

    public InputStream getErrorStream() {
        try {
            m79246i();
            if (this.f55756f.getHttpStatusCode() >= 400) {
                return this.f55755e;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public InputStream getInputStream() throws IOException {
        m79246i();
        if ("HEAD".equalsIgnoreCase(this.f55760j.getMethod())) {
            this.f55754d.cancel();
        }
        return this.f55755e;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.f55763m;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public boolean isCanceled() {
        return this.f55762l;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public synchronized boolean isExecuted() {
        return this.f55761k;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18321q3.d request() {
        return this.f55760j;
    }

    public void setRcEventListener(AbstractC18129c5 abstractC18129c5) {
        this.f55765o = abstractC18129c5;
    }

    /* JADX INFO: renamed from: c */
    private void m79239c() throws IOException {
        if (!this.f55759i) {
            throw new IllegalStateException("No response.");
        }
        IOException iOException = this.f55757g;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f55756f == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    /* JADX INFO: renamed from: d */
    private Map<String, List<String>> m79241d() {
        return this.f55756f.getAllHeaders();
    }

    /* JADX INFO: renamed from: b */
    private String m79236b(String str) {
        return Headers.m77737of(this.f55760j.getHeaders()).get(str);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [long] */
    /* JADX INFO: renamed from: a */
    public final String m79250a(String str) {
        try {
            m79246i();
            Map<String, List<String>> mapM79241d = m79241d();
            if (!mapM79241d.containsKey(str)) {
                return null;
            }
            mapM79241d.get(str);
            return (String) System.currentTimeMillis();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m79251a() {
        String str = f55749p;
        Logger.m76965v(str, "onRequestFinish");
        if (this.f55765o != null) {
            Logger.m76965v(str, "callback rcEventListener#callFinishAtNetLib");
            this.f55765o.callFinishAtNetLib();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m79252a(ByteBuffer byteBuffer) throws IOException {
        this.f55754d.read(byteBuffer);
        this.f55752b.loop(m79245h());
    }

    /* JADX INFO: renamed from: a */
    private void m79231a(UrlRequest.Builder builder, Headers headers) {
        if (builder == null || headers == null) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < headers.size(); i++) {
            String strName = headers.name(i);
            builder.addHeader(strName, headers.value(i));
            if (!z && StringUtils.toLowerCase(strName).equals("user-agent")) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        builder.addHeader("User-Agent", C18347s3.getUserAgent(ContextHolder.getAppContext()));
    }

    /* JADX INFO: renamed from: a */
    private void m79232a(UrlRequest.Builder builder, String str, String str2) {
        if (str2 == null) {
            return;
        }
        builder.addHeader(str, str2);
    }
}
