package okhttp3.internal.connection;

import OooOoo.C20593OooO0Oo;
import Oooo.OooO0OO;
import androidx.core.location.LocationRequestCompat;
import com.aspose.words.ControlChar;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18217i9;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32435OooO0Oo;
import oO0o0O0o.C33591OooOOO;
import oOo000Oo.OooOo;
import oOo00OoO.C34522OooO0O0;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34542OooOo0O;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C34540OooOo0 f124397OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Route f124398OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Socket f124399OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Socket f124400OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Protocol f124401OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Handshake f124402OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Http2Connection f124403OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C34542OooOo0O f124404OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f124405OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f124406OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f124407OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f124408OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f124409OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f124410OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList f124411OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f124412OooOOo0;

    @Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "<init>", "()V", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80613k = 3, m80614mv = {1, 6, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f124413OooO00o;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f124413OooO00o = iArr;
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        OooOOO0.OooO0oO(connectionPool, "connectionPool");
        OooOOO0.OooO0oO(route, "route");
        this.f124398OooO0O0 = route;
        this.f124410OooOOOO = 1;
        this.f124411OooOOOo = new ArrayList();
        this.f124412OooOOo0 = LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public static void OooO0Oo(OkHttpClient client, Route failedRoute, IOException failure) {
        OooOOO0.OooO0oO(client, "client");
        OooOOO0.OooO0oO(failedRoute, "failedRoute");
        OooOOO0.OooO0oO(failure, "failure");
        if (failedRoute.f124291OooO0O0.type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.f124290OooO00o;
            address.f124026OooO0oo.connectFailed(address.f124018OooO.OooO(), failedRoute.f124291OooO0O0.address(), failure);
        }
        RouteDatabase routeDatabase = client.f124199OoooOOo;
        synchronized (routeDatabase) {
            routeDatabase.f124420OooO00o.add(failedRoute);
        }
    }

    public final boolean OooO(boolean z) {
        long j;
        byte[] bArr = Util.f124301OooO00o;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f124399OooO0OO;
        OooOOO0.OooO0Oo(socket);
        Socket socket2 = this.f124400OooO0Oo;
        OooOOO0.OooO0Oo(socket2);
        OooOOO0.OooO0Oo(this.f124404OooO0oo);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f124403OooO0oO;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f124532OooOoo0) {
                    return false;
                }
                if (http2Connection.f124541Oooo0OO < http2Connection.f124540Oooo0O0) {
                    if (jNanoTime >= http2Connection.f124543Oooo0o0) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f124412OooOOo0;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.o0000o0O();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final synchronized void OooO00o(Http2Connection connection, Settings settings) {
        OooOOO0.OooO0oO(connection, "connection");
        OooOOO0.OooO0oO(settings, "settings");
        this.f124410OooOOOO = (settings.f124650OooO00o & 16) != 0 ? settings.f124651OooO0O0[4] : Integer.MAX_VALUE;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void OooO0O0(Http2Stream http2Stream) throws IOException {
        http2Stream.OooO0OO(ErrorCode.REFUSED_STREAM, null);
    }

    public final void OooO0OO(int i, int i2, int i3, boolean z, Call call, EventListener eventListener) throws Throwable {
        Route route;
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(eventListener, "eventListener");
        if (this.f124401OooO0o != null) {
            throw new IllegalStateException("already connected");
        }
        List<ConnectionSpec> list = this.f124398OooO0O0.f124290OooO00o.f124028OooOO0O;
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
        Address address = this.f124398OooO0O0.f124290OooO00o;
        if (address.f124021OooO0OO == null) {
            if (!list.contains(ConnectionSpec.f124076OooO0o)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f124398OooO0O0.f124290OooO00o.f124018OooO.f124132OooO0Oo;
            Platform.f124683OooO00o.getClass();
            if (!Platform.f124684OooO0O0.OooO0oo(str)) {
                throw new RouteException(new UnknownServiceException(C20593OooO0Oo.OooO0O0("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (address.f124027OooOO0.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                Route route2 = this.f124398OooO0O0;
                if (route2.f124290OooO00o.f124021OooO0OO != null && route2.f124291OooO0O0.type() == Proxy.Type.HTTP) {
                    OooO0o(i, i2, i3, call, eventListener);
                    if (this.f124399OooO0OO == null) {
                    }
                    route = this.f124398OooO0O0;
                    if (route.f124290OooO00o.f124021OooO0OO == null && route.f124291OooO0O0.type() == Proxy.Type.HTTP && this.f124399OooO0OO == null) {
                        throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f124412OooOOo0 = System.nanoTime();
                    return;
                }
                OooO0o0(i, i2, call, eventListener);
                OooO0oO(connectionSpecSelector, call, eventListener);
                Route route3 = this.f124398OooO0O0;
                eventListener.OooO0Oo(call, route3.f124292OooO0OO, route3.f124291OooO0O0, this.f124401OooO0o);
                route = this.f124398OooO0O0;
                if (route.f124290OooO00o.f124021OooO0OO == null) {
                }
                this.f124412OooOOo0 = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.f124400OooO0Oo;
                if (socket != null) {
                    Util.OooO0Oo(socket);
                }
                Socket socket2 = this.f124399OooO0OO;
                if (socket2 != null) {
                    Util.OooO0Oo(socket2);
                }
                this.f124400OooO0Oo = null;
                this.f124399OooO0OO = null;
                this.f124404OooO0oo = null;
                this.f124397OooO = null;
                this.f124402OooO0o0 = null;
                this.f124401OooO0o = null;
                this.f124403OooO0oO = null;
                this.f124410OooOOOO = 1;
                Route route4 = this.f124398OooO0O0;
                eventListener.OooO0o0(call, route4.f124292OooO0OO, route4.f124291OooO0O0, e);
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    C32435OooO0Oo.OooO00o(routeException.f124422OooOo0o, e);
                    routeException.f124421OooOo = e;
                }
                if (!z) {
                    throw routeException;
                }
                connectionSpecSelector.f124345OooO0Oo = true;
                if (!connectionSpecSelector.f124344OooO0OO) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
            }
        } while (e instanceof SSLException);
        throw routeException;
    }

    public final void OooO0o(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request.Builder builder = new Request.Builder();
        Route route = this.f124398OooO0O0;
        HttpUrl url = route.f124290OooO00o.f124018OooO;
        OooOOO0.OooO0oO(url, "url");
        builder.f124244OooO00o = url;
        builder.OooO0Oo("CONNECT", null);
        Address address = route.f124290OooO00o;
        builder.OooO0OO("Host", Util.OooOo(address.f124018OooO, true));
        builder.OooO0OO("Proxy-Connection", HttpHeaders.KEEP_ALIVE);
        builder.OooO0OO("User-Agent", "okhttp/4.11.0");
        Request requestOooO0O0 = builder.OooO0O0();
        Response.Builder builder2 = new Response.Builder();
        builder2.f124271OooO00o = requestOooO0O0;
        builder2.f124272OooO0O0 = Protocol.HTTP_1_1;
        builder2.f124273OooO0OO = 407;
        builder2.f124274OooO0Oo = "Preemptive Authenticate";
        builder2.f124277OooO0oO = Util.f124303OooO0OO;
        builder2.f124280OooOO0O = -1L;
        builder2.f124281OooOO0o = -1L;
        Headers.Builder builder3 = builder2.f124275OooO0o;
        builder3.getClass();
        Headers.f124123OooOo.getClass();
        Headers.Companion.OooO00o(HttpHeaders.PROXY_AUTHENTICATE);
        Headers.Companion.OooO0O0("OkHttp-Preemptive", HttpHeaders.PROXY_AUTHENTICATE);
        builder3.OooO0Oo(HttpHeaders.PROXY_AUTHENTICATE);
        builder3.OooO0O0(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive");
        Request requestAuthenticate = address.f124023OooO0o.authenticate(route, builder2.OooO00o());
        if (requestAuthenticate != null) {
            requestOooO0O0 = requestAuthenticate;
        }
        OooO0o0(i, i2, call, eventListener);
        String str = "CONNECT " + Util.OooOo(requestOooO0O0.f124238OooO00o, true) + " HTTP/1.1";
        while (true) {
            C34542OooOo0O c34542OooOo0O = this.f124404OooO0oo;
            OooOOO0.OooO0Oo(c34542OooOo0O);
            C34540OooOo0 c34540OooOo0 = this.f124397OooO;
            OooOOO0.OooO0Oo(c34540OooOo0);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, c34542OooOo0O, c34540OooOo0);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c34542OooOo0O.f123777OooOo0o.timeout().timeout(i2, timeUnit);
            c34540OooOo0.f123767OooOo0o.timeout().timeout(i3, timeUnit);
            http1ExchangeCodec.OooOO0o(requestOooO0O0.f124240OooO0OO, str);
            http1ExchangeCodec.OooO0o0();
            Response.Builder builderOooO0oo = http1ExchangeCodec.OooO0oo(false);
            OooOOO0.OooO0Oo(builderOooO0oo);
            builderOooO0oo.f124271OooO00o = requestOooO0O0;
            Response responseOooO00o = builderOooO0oo.OooO00o();
            http1ExchangeCodec.OooOO0O(responseOooO00o);
            int i4 = responseOooO00o.f124259OooOoO;
            if (i4 == 200) {
                if (!c34542OooOo0O.f123776OooOo.o0000o0O() || !c34540OooOo0.f123766OooOo.o0000o0O()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                return;
            } else {
                if (i4 != 407) {
                    throw new IOException(OooOOO0.OooOOO0(Integer.valueOf(i4), "Unexpected response code for CONNECT: "));
                }
                Request requestAuthenticate2 = address.f124023OooO0o.authenticate(route, responseOooO00o);
                if (requestAuthenticate2 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if ("close".equalsIgnoreCase(Response.OooO00o(HttpHeaders.CONNECTION, responseOooO00o))) {
                    return;
                } else {
                    requestOooO0O0 = requestAuthenticate2;
                }
            }
        }
    }

    public final void OooO0o0(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Route route = this.f124398OooO0O0;
        Proxy proxy = route.f124291OooO0O0;
        Address address = route.f124290OooO00o;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : WhenMappings.f124413OooO00o[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = address.f124020OooO0O0.createSocket();
            OooOOO0.OooO0Oo(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f124399OooO0OO = socketCreateSocket;
        eventListener.OooO0o(call, this.f124398OooO0O0.f124292OooO0OO, proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            Platform.f124683OooO00o.getClass();
            Platform.f124684OooO0O0.OooO0o0(socketCreateSocket, this.f124398OooO0O0.f124292OooO0OO, i);
            try {
                this.f124404OooO0oo = C34535OooOOOo.OooO0O0(C34535OooOOOo.OooO0oO(socketCreateSocket));
                this.f124397OooO = C34535OooOOOo.OooO00o(C34535OooOOOo.OooO0Oo(socketCreateSocket));
            } catch (NullPointerException e) {
                if (OooOOO0.OooO0O0(e.getMessage(), C18217i9.f55238y)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(OooOOO0.OooOOO0(this.f124398OooO0O0.f124292OooO0OO, "Failed to connect to "));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooO0oO(ConnectionSpecSelector connectionSpecSelector, Call call, EventListener eventListener) throws Throwable {
        Throwable th;
        Protocol protocolOooO00o;
        Address address = this.f124398OooO0O0.f124290OooO00o;
        if (address.f124021OooO0OO == null) {
            List<Protocol> list = address.f124027OooOO0;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f124400OooO0Oo = this.f124399OooO0OO;
                this.f124401OooO0o = Protocol.HTTP_1_1;
                return;
            } else {
                this.f124400OooO0Oo = this.f124399OooO0OO;
                this.f124401OooO0o = protocol;
                OooOO0o();
                return;
            }
        }
        eventListener.OooOo0O(call);
        Address address2 = this.f124398OooO0O0.f124290OooO00o;
        SSLSocketFactory sSLSocketFactory = address2.f124021OooO0OO;
        SSLSocket sSLSocket = null;
        String strOooO0o = null;
        try {
            OooOOO0.OooO0Oo(sSLSocketFactory);
            Socket socket = this.f124399OooO0OO;
            HttpUrl httpUrl = address2.f124018OooO;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, httpUrl.f124132OooO0Oo, httpUrl.f124134OooO0o0, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecOooO00o = connectionSpecSelector.OooO00o(sSLSocket2);
                if (connectionSpecOooO00o.f124079OooO0O0) {
                    Platform.f124683OooO00o.getClass();
                    Platform.f124684OooO0O0.OooO0Oo(sSLSocket2, address2.f124018OooO.f124132OooO0Oo, address2.f124027OooOO0);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.f124116OooO0o0;
                OooOOO0.OooO0o(sslSocketSession, "sslSocketSession");
                companion.getClass();
                Handshake handshakeOooO00o = Handshake.Companion.OooO00o(sslSocketSession);
                HostnameVerifier hostnameVerifier = address2.f124022OooO0Oo;
                OooOOO0.OooO0Oo(hostnameVerifier);
                if (hostnameVerifier.verify(address2.f124018OooO.f124132OooO0Oo, sslSocketSession)) {
                    CertificatePinner certificatePinner = address2.f124024OooO0o0;
                    OooOOO0.OooO0Oo(certificatePinner);
                    this.f124402OooO0o0 = new Handshake(handshakeOooO00o.f124117OooO00o, handshakeOooO00o.f124118OooO0O0, handshakeOooO00o.f124119OooO0OO, new RealConnection$connectTls$1(certificatePinner, handshakeOooO00o, address2));
                    certificatePinner.OooO0O0(address2.f124018OooO.f124132OooO0Oo, new RealConnection$connectTls$2(this));
                    if (connectionSpecOooO00o.f124079OooO0O0) {
                        Platform.f124683OooO00o.getClass();
                        strOooO0o = Platform.f124684OooO0O0.OooO0o(sSLSocket2);
                    }
                    this.f124400OooO0Oo = sSLSocket2;
                    this.f124404OooO0oo = C34535OooOOOo.OooO0O0(C34535OooOOOo.OooO0oO(sSLSocket2));
                    this.f124397OooO = C34535OooOOOo.OooO00o(C34535OooOOOo.OooO0Oo(sSLSocket2));
                    if (strOooO0o != null) {
                        Protocol.f124229OooOo.getClass();
                        protocolOooO00o = Protocol.Companion.OooO00o(strOooO0o);
                    } else {
                        protocolOooO00o = Protocol.HTTP_1_1;
                    }
                    this.f124401OooO0o = protocolOooO00o;
                    Platform.f124683OooO00o.getClass();
                    Platform.f124684OooO0O0.OooO00o(sSLSocket2);
                    eventListener.OooOo0(call, this.f124402OooO0o0);
                    if (this.f124401OooO0o == Protocol.HTTP_2) {
                        OooOO0o();
                        return;
                    }
                    return;
                }
                List<Certificate> listOooO00o = handshakeOooO00o.OooO00o();
                if (listOooO00o.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address2.f124018OooO.f124132OooO0Oo + " not verified (no certificates)");
                }
                X509Certificate certificate = (X509Certificate) listOooO00o.get(0);
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(address2.f124018OooO.f124132OooO0Oo);
                sb.append(" not verified:\n              |    certificate: ");
                CertificatePinner.f124046OooO0OO.getClass();
                OooOOO0.OooO0oO(certificate, "certificate");
                C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
                byte[] encoded = certificate.getPublicKey().getEncoded();
                OooOOO0.OooO0o(encoded, "publicKey.encoded");
                int length = C34522OooO0O0.f123718OooO0O0;
                if (length == C34522OooO0O0.f123718OooO0O0) {
                    length = encoded.length;
                }
                C34522OooO0O0.OooO0O0(encoded.length, 0, length);
                sb.append(OooOOO0.OooOOO0(new C34527OooO0oO(OooO0OO.OooOO0O(encoded, 0, length)).OooO0O0(KeyUtil.HMAC_KEY_HASH_ALGORITHM).OooO00o(), "sha256/"));
                sb.append("\n              |    DN: ");
                sb.append((Object) certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                OkHostnameVerifier.f124724OooO00o.getClass();
                sb.append(OooOo.OooooOO(OkHostnameVerifier.OooO00o(certificate, 7), OkHostnameVerifier.OooO00o(certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(C33591OooOOO.OooO(sb.toString()));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.f124683OooO00o.getClass();
                    Platform.f124684OooO0O0.OooO00o(sSLSocket);
                }
                if (sSLSocket == null) {
                    throw th;
                }
                Util.OooO0Oo(sSLSocket);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0oo(Address address, ArrayList arrayList) {
        Handshake handshake;
        byte[] bArr = Util.f124301OooO00o;
        if (this.f124411OooOOOo.size() < this.f124410OooOOOO && !this.f124405OooOO0) {
            Route route = this.f124398OooO0O0;
            if (route.f124290OooO00o.OooO00o(address)) {
                HttpUrl httpUrl = address.f124018OooO;
                String str = httpUrl.f124132OooO0Oo;
                Address address2 = route.f124290OooO00o;
                if (OooOOO0.OooO0O0(str, address2.f124018OooO.f124132OooO0Oo)) {
                    return true;
                }
                if (this.f124403OooO0oO != null && arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Route route2 = (Route) it.next();
                        Proxy.Type type = route2.f124291OooO0O0.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && route.f124291OooO0O0.type() == type2) {
                            if (OooOOO0.OooO0O0(route.f124292OooO0OO, route2.f124292OooO0OO)) {
                                OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f124724OooO00o;
                                if (address.f124022OooO0Oo == okHostnameVerifier) {
                                    byte[] bArr2 = Util.f124301OooO00o;
                                    HttpUrl httpUrl2 = address2.f124018OooO;
                                    if (httpUrl.f124134OooO0o0 == httpUrl2.f124134OooO0o0) {
                                        String str2 = httpUrl2.f124132OooO0Oo;
                                        String str3 = httpUrl.f124132OooO0Oo;
                                        if (!OooOOO0.OooO0O0(str3, str2)) {
                                            if (!this.f124406OooOO0O && (handshake = this.f124402OooO0o0) != null) {
                                                List<Certificate> listOooO00o = handshake.OooO00o();
                                                if (!listOooO00o.isEmpty()) {
                                                    X509Certificate x509Certificate = (X509Certificate) listOooO00o.get(0);
                                                    okHostnameVerifier.getClass();
                                                    if (OkHostnameVerifier.OooO0OO(str3, x509Certificate)) {
                                                        try {
                                                            CertificatePinner certificatePinner = address.f124024OooO0o0;
                                                            OooOOO0.OooO0Oo(certificatePinner);
                                                            Handshake handshake2 = this.f124402OooO0o0;
                                                            OooOOO0.OooO0Oo(handshake2);
                                                            certificatePinner.OooO00o(str3, handshake2.OooO00o());
                                                            return true;
                                                        } catch (SSLPeerUnverifiedException unused) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final ExchangeCodec OooOO0(OkHttpClient client, RealInterceptorChain realInterceptorChain) throws SocketException {
        OooOOO0.OooO0oO(client, "client");
        Socket socket = this.f124400OooO0Oo;
        OooOOO0.OooO0Oo(socket);
        C34542OooOo0O c34542OooOo0O = this.f124404OooO0oo;
        OooOOO0.OooO0Oo(c34542OooOo0O);
        C34540OooOo0 c34540OooOo0 = this.f124397OooO;
        OooOOO0.OooO0Oo(c34540OooOo0);
        Http2Connection http2Connection = this.f124403OooO0oO;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, realInterceptorChain, http2Connection);
        }
        int i = realInterceptorChain.f124447OooO0oO;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c34542OooOo0O.f123777OooOo0o.timeout().timeout(i, timeUnit);
        c34540OooOo0.f123767OooOo0o.timeout().timeout(realInterceptorChain.f124448OooO0oo, timeUnit);
        return new Http1ExchangeCodec(client, this, c34542OooOo0O, c34540OooOo0);
    }

    public final synchronized void OooOO0O() {
        this.f124405OooOO0 = true;
    }

    public final void OooOO0o() throws IOException {
        Socket socket = this.f124400OooO0Oo;
        OooOOO0.OooO0Oo(socket);
        C34542OooOo0O c34542OooOo0O = this.f124404OooO0oo;
        OooOOO0.OooO0Oo(c34542OooOo0O);
        C34540OooOo0 c34540OooOo0 = this.f124397OooO;
        OooOOO0.OooO0Oo(c34540OooOo0);
        socket.setSoTimeout(0);
        TaskRunner taskRunner = TaskRunner.f124329OooO;
        Http2Connection.Builder builder = new Http2Connection.Builder(taskRunner);
        String peerName = this.f124398OooO0O0.f124290OooO00o.f124018OooO.f124132OooO0Oo;
        OooOOO0.OooO0oO(peerName, "peerName");
        builder.f124553OooO0O0 = socket;
        String str = Util.f124308OooO0oo + ControlChar.SPACE_CHAR + peerName;
        OooOOO0.OooO0oO(str, "<set-?>");
        builder.f124554OooO0OO = str;
        builder.f124555OooO0Oo = c34542OooOo0O;
        builder.f124557OooO0o0 = c34540OooOo0;
        builder.f124556OooO0o = this;
        Http2Connection http2Connection = new Http2Connection(builder);
        this.f124403OooO0oO = http2Connection;
        Http2Connection.f124524OoooOOO.getClass();
        Settings settings = Http2Connection.f124525OoooOOo;
        this.f124410OooOOOO = (settings.f124650OooO00o & 16) != 0 ? settings.f124651OooO0O0[4] : Integer.MAX_VALUE;
        Http2Writer http2Writer = http2Connection.f124546OoooO;
        synchronized (http2Writer) {
            try {
                if (http2Writer.f124638OooOoO) {
                    throw new IOException("closed");
                }
                Logger logger = Http2Writer.f124635OooOoo0;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.OooO(OooOOO0.OooOOO0(Http2.f124520OooO0O0.OooO0Oo(), ">> CONNECTION "), new Object[0]));
                }
                http2Writer.f124637OooOo0o.Oooo0O0(Http2.f124520OooO0O0);
                http2Writer.f124637OooOo0o.flush();
            } finally {
            }
        }
        Http2Writer http2Writer2 = http2Connection.f124546OoooO;
        Settings settings2 = http2Connection.f124542Oooo0o;
        synchronized (http2Writer2) {
            try {
                OooOOO0.OooO0oO(settings2, "settings");
                if (http2Writer2.f124638OooOoO) {
                    throw new IOException("closed");
                }
                http2Writer2.OooO0OO(0, Integer.bitCount(settings2.f124650OooO00o) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    int i2 = i + 1;
                    boolean z = true;
                    if (((1 << i) & settings2.f124650OooO00o) == 0) {
                        z = false;
                    }
                    if (z) {
                        http2Writer2.f124637OooOo0o.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        http2Writer2.f124637OooOo0o.writeInt(settings2.f124651OooO0O0[i]);
                    }
                    i = i2;
                }
                http2Writer2.f124637OooOo0o.flush();
            } finally {
            }
        }
        if (http2Connection.f124542Oooo0o.OooO00o() != 65535) {
            http2Connection.f124546OoooO.o00000O(0, r1 - 65535);
        }
        TaskQueue taskQueueOooO0o0 = taskRunner.OooO0o0();
        final String str2 = http2Connection.f124529OooOoO0;
        final Http2Connection.ReaderRunnable readerRunnable = http2Connection.f124550OoooOO0;
        taskQueueOooO0o0.OooO0OO(new Task(str2) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long OooO00o() throws Throwable {
                readerRunnable.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final String toString() {
        CipherSuite cipherSuite;
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.f124398OooO0O0;
        sb.append(route.f124290OooO00o.f124018OooO.f124132OooO0Oo);
        sb.append(':');
        sb.append(route.f124290OooO00o.f124018OooO.f124134OooO0o0);
        sb.append(", proxy=");
        sb.append(route.f124291OooO0O0);
        sb.append(" hostAddress=");
        sb.append(route.f124292OooO0OO);
        sb.append(" cipherSuite=");
        Handshake handshake = this.f124402OooO0o0;
        Object obj = "none";
        if (handshake != null && (cipherSuite = handshake.f124118OooO0O0) != null) {
            obj = cipherSuite;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f124401OooO0o);
        sb.append('}');
        return sb.toString();
    }
}
