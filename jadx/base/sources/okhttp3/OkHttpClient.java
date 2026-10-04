package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0oO0OO.C34010OooO00o;
import oOo000Oo.C34431OooOo0;
import okhttp3.Call;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m80612d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "<init>", "()V", "Builder", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final Companion f124170OoooOo0 = new Companion(0);

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final List<Protocol> f124171OoooOoO = Util.OooOO0o(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final List<ConnectionSpec> f124172OoooOoo = Util.OooOO0o(ConnectionSpec.f124077OooO0o0, ConnectionSpec.f124076OooO0o);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ConnectionPool f124173OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Dispatcher f124174OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final List<Interceptor> f124175OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final List<Interceptor> f124176OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C34010OooO00o f124177OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Authenticator f124178OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f124179OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final boolean f124180OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final boolean f124181OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final HostnameVerifier f124182Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final ProxySelector f124183Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final CookieJar f124184Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Dns f124185Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final Proxy f124186Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Authenticator f124187Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final SocketFactory f124188Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final X509TrustManager f124189Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final SSLSocketFactory f124190Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final List<ConnectionSpec> f124191Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final List<Protocol> f124192Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f124193OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final CertificateChainCleaner f124194OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final CertificatePinner f124195OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f124196OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f124197OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final long f124198OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final RouteDatabase f124199OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int f124200o000oOoO;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f124201OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Dispatcher f124202OooO00o = new Dispatcher();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ConnectionPool f124203OooO0O0 = new ConnectionPool();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f124204OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f124205OooO0Oo = new ArrayList();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f124206OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public C34010OooO00o f124207OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Authenticator f124208OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f124209OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public CookieJar f124210OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Dns f124211OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Proxy f124212OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Authenticator f124213OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public ProxySelector f124214OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public SocketFactory f124215OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public SSLSocketFactory f124216OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public List<ConnectionSpec> f124217OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public X509TrustManager f124218OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public List<? extends Protocol> f124219OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f124220OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public CertificatePinner f124221OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public HostnameVerifier f124222OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public CertificateChainCleaner f124223OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f124224OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f124225OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f124226OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public long f124227OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public RouteDatabase f124228OooOoo0;

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f124110OooO00o;
            byte[] bArr = Util.f124301OooO00o;
            OooOOO0.OooO0oO(eventListener$Companion$NONE$1, "<this>");
            this.f124207OooO0o0 = new C34010OooO00o(eventListener$Companion$NONE$1);
            this.f124206OooO0o = true;
            Authenticator authenticator = Authenticator.f124029OooO00o;
            this.f124208OooO0oO = authenticator;
            this.f124209OooO0oo = true;
            this.f124201OooO = true;
            this.f124210OooOO0 = CookieJar.f124100OooO00o;
            this.f124211OooOO0O = Dns.f124108OooO00o;
            this.f124213OooOOO = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            OooOOO0.OooO0o(socketFactory, "getDefault()");
            this.f124215OooOOOO = socketFactory;
            OkHttpClient.f124170OoooOo0.getClass();
            this.f124217OooOOo = OkHttpClient.f124172OoooOoo;
            this.f124219OooOOoo = OkHttpClient.f124171OoooOoO;
            this.f124222OooOo00 = OkHostnameVerifier.f124724OooO00o;
            this.f124221OooOo0 = CertificatePinner.f124047OooO0Oo;
            this.f124220OooOo = 10000;
            this.f124226OooOoO0 = 10000;
            this.f124225OooOoO = 10000;
            this.f124227OooOoOO = 1024L;
        }

        public final void OooO00o(long j, TimeUnit unit) {
            OooOOO0.OooO0oO(unit, "unit");
            this.f124220OooOo = Util.OooO0O0(j, unit);
        }

        public final void OooO0O0(HostnameVerifier hostnameVerifier) {
            if (!hostnameVerifier.equals(this.f124222OooOo00)) {
                this.f124228OooOoo0 = null;
            }
            this.f124222OooOo00 = hostnameVerifier;
        }

        public final void OooO0OO(long j, TimeUnit unit) {
            OooOOO0.OooO0oO(unit, "unit");
            this.f124226OooOoO0 = Util.OooO0O0(j, unit);
        }

        public final void OooO0Oo(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            OooOOO0.OooO0oO(sslSocketFactory, "sslSocketFactory");
            OooOOO0.OooO0oO(trustManager, "trustManager");
            if (!sslSocketFactory.equals(this.f124216OooOOOo) || !trustManager.equals(this.f124218OooOOo0)) {
                this.f124228OooOoo0 = null;
            }
            this.f124216OooOOOo = sslSocketFactory;
            CertificateChainCleaner.f124723OooO00o.getClass();
            Platform.f124683OooO00o.getClass();
            this.f124223OooOo0O = Platform.f124684OooO0O0.OooO0O0(trustManager);
            this.f124218OooOOo0 = trustManager;
        }

        public final void OooO0o0(long j, TimeUnit unit) {
            OooOOO0.OooO0oO(unit, "unit");
            this.f124225OooOoO = Util.OooO0O0(j, unit);
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector;
        OooOOO0.OooO0oO(builder, "builder");
        this.f124174OooOo0o = builder.f124202OooO00o;
        this.f124173OooOo = builder.f124203OooO0O0;
        this.f124176OooOoO0 = Util.OooOoO0(builder.f124204OooO0OO);
        this.f124175OooOoO = Util.OooOoO0(builder.f124205OooO0Oo);
        this.f124177OooOoOO = builder.f124207OooO0o0;
        this.f124179OooOoo0 = builder.f124206OooO0o;
        this.f124178OooOoo = builder.f124208OooO0oO;
        this.f124180OooOooO = builder.f124209OooO0oo;
        this.f124181OooOooo = builder.f124201OooO;
        this.f124184Oooo000 = builder.f124210OooOO0;
        this.f124185Oooo00O = builder.f124211OooOO0O;
        Proxy proxy = builder.f124212OooOO0o;
        this.f124186Oooo00o = proxy;
        if (proxy != null) {
            proxySelector = NullProxySelector.f124712OooO00o;
        } else {
            proxySelector = builder.f124214OooOOO0;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.f124712OooO00o;
            }
        }
        this.f124183Oooo0 = proxySelector;
        this.f124187Oooo0O0 = builder.f124213OooOOO;
        this.f124188Oooo0OO = builder.f124215OooOOOO;
        List<ConnectionSpec> list = builder.f124217OooOOo;
        this.f124191Oooo0oO = list;
        this.f124192Oooo0oo = builder.f124219OooOOoo;
        this.f124182Oooo = builder.f124222OooOo00;
        this.f124196OoooO0O = builder.f124224OooOo0o;
        this.f124193OoooO = builder.f124220OooOo;
        this.f124197OoooOO0 = builder.f124226OooOoO0;
        this.f124200o000oOoO = builder.f124225OooOoO;
        this.f124198OoooOOO = builder.f124227OooOoOO;
        RouteDatabase routeDatabase = builder.f124228OooOoo0;
        this.f124199OoooOOo = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List<ConnectionSpec> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f124190Oooo0o0 = null;
            this.f124194OoooO0 = null;
            this.f124189Oooo0o = null;
            this.f124195OoooO00 = CertificatePinner.f124047OooO0Oo;
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f124078OooO00o) {
                    SSLSocketFactory sSLSocketFactory = builder.f124216OooOOOo;
                    if (sSLSocketFactory != null) {
                        this.f124190Oooo0o0 = sSLSocketFactory;
                        CertificateChainCleaner certificateChainCleaner = builder.f124223OooOo0O;
                        OooOOO0.OooO0Oo(certificateChainCleaner);
                        this.f124194OoooO0 = certificateChainCleaner;
                        X509TrustManager x509TrustManager = builder.f124218OooOOo0;
                        OooOOO0.OooO0Oo(x509TrustManager);
                        this.f124189Oooo0o = x509TrustManager;
                        CertificatePinner certificatePinner = builder.f124221OooOo0;
                        certificatePinner.getClass();
                        this.f124195OoooO00 = OooOOO0.OooO0O0(certificatePinner.f124049OooO0O0, certificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.f124048OooO00o, certificateChainCleaner);
                    } else {
                        Platform.Companion companion = Platform.f124683OooO00o;
                        companion.getClass();
                        X509TrustManager x509TrustManagerOooOOO0 = Platform.f124684OooO0O0.OooOOO0();
                        this.f124189Oooo0o = x509TrustManagerOooOOO0;
                        this.f124190Oooo0o0 = Platform.f124684OooO0O0.OooOO0o(x509TrustManagerOooOOO0);
                        CertificateChainCleaner.f124723OooO00o.getClass();
                        companion.getClass();
                        CertificateChainCleaner certificateChainCleanerOooO0O0 = Platform.f124684OooO0O0.OooO0O0(x509TrustManagerOooOOO0);
                        this.f124194OoooO0 = certificateChainCleanerOooO0O0;
                        CertificatePinner certificatePinner2 = builder.f124221OooOo0;
                        certificatePinner2.getClass();
                        this.f124195OoooO00 = OooOOO0.OooO0O0(certificatePinner2.f124049OooO0O0, certificateChainCleanerOooO0O0) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f124048OooO00o, certificateChainCleanerOooO0O0);
                    }
                }
            }
            this.f124190Oooo0o0 = null;
            this.f124194OoooO0 = null;
            this.f124189Oooo0o = null;
            this.f124195OoooO00 = CertificatePinner.f124047OooO0Oo;
        }
        List<Interceptor> list3 = this.f124176OooOoO0;
        if (list3.contains(null)) {
            throw new IllegalStateException(OooOOO0.OooOOO0(list3, "Null interceptor: ").toString());
        }
        List<Interceptor> list4 = this.f124175OooOoO;
        if (list4.contains(null)) {
            throw new IllegalStateException(OooOOO0.OooOOO0(list4, "Null network interceptor: ").toString());
        }
        List<ConnectionSpec> list5 = this.f124191Oooo0oO;
        boolean z = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.f124189Oooo0o;
        CertificateChainCleaner certificateChainCleaner2 = this.f124194OoooO0;
        SSLSocketFactory sSLSocketFactory2 = this.f124190Oooo0o0;
        if (!z || !list5.isEmpty()) {
            Iterator<T> it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).f124078OooO00o) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (certificateChainCleaner2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (certificateChainCleaner2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!OooOOO0.OooO0O0(this.f124195OoooO00, CertificatePinner.f124047OooO0Oo)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call.Factory
    public final RealCall OooO00o(Request request) {
        OooOOO0.OooO0oO(request, "request");
        return new RealCall(this, request, false);
    }

    public final Builder OooO0O0() {
        Builder builder = new Builder();
        builder.f124202OooO00o = this.f124174OooOo0o;
        builder.f124203OooO0O0 = this.f124173OooOo;
        C34431OooOo0.OooOo0o(builder.f124204OooO0OO, this.f124176OooOoO0);
        C34431OooOo0.OooOo0o(builder.f124205OooO0Oo, this.f124175OooOoO);
        builder.f124207OooO0o0 = this.f124177OooOoOO;
        builder.f124206OooO0o = this.f124179OooOoo0;
        builder.f124208OooO0oO = this.f124178OooOoo;
        builder.f124209OooO0oo = this.f124180OooOooO;
        builder.f124201OooO = this.f124181OooOooo;
        builder.f124210OooOO0 = this.f124184Oooo000;
        builder.f124211OooOO0O = this.f124185Oooo00O;
        builder.f124212OooOO0o = this.f124186Oooo00o;
        builder.f124214OooOOO0 = this.f124183Oooo0;
        builder.f124213OooOOO = this.f124187Oooo0O0;
        builder.f124215OooOOOO = this.f124188Oooo0OO;
        builder.f124216OooOOOo = this.f124190Oooo0o0;
        builder.f124218OooOOo0 = this.f124189Oooo0o;
        builder.f124217OooOOo = this.f124191Oooo0oO;
        builder.f124219OooOOoo = this.f124192Oooo0oo;
        builder.f124222OooOo00 = this.f124182Oooo;
        builder.f124221OooOo0 = this.f124195OoooO00;
        builder.f124223OooOo0O = this.f124194OoooO0;
        builder.f124224OooOo0o = this.f124196OoooO0O;
        builder.f124220OooOo = this.f124193OoooO;
        builder.f124226OooOoO0 = this.f124197OoooOO0;
        builder.f124225OooOoO = this.f124200o000oOoO;
        builder.f124227OooOoOO = this.f124198OoooOOO;
        builder.f124228OooOoo0 = this.f124199OoooOOo;
        return builder;
    }

    public final Object clone() {
        return super.clone();
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
