package okhttp3.internal.http2;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18134ca;
import com.huawei.hms.network.embedded.C18190ga;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RealConnection f124593OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RealInterceptorChain f124594OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Http2Connection f124595OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Http2Stream f124596OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f124597OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Protocol f124598OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Companion f124591OooO0oO = new Companion(0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final List<String> f124592OooO0oo = Util.OooOO0o(C18190ga.f54963h, "host", C18190ga.f54965j, C18190ga.f54966k, "te", C18190ga.f54967l, "encoding", C18190ga.f54970o, C18134ca.f54487f, C18134ca.f54488g, C18134ca.f54489h, C18134ca.f54490i);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final List<String> f124590OooO = Util.OooOO0o(C18190ga.f54963h, "host", C18190ga.f54965j, C18190ga.f54966k, "te", C18190ga.f54967l, "encoding", C18190ga.f54970o);

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, m80612d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "<init>", "()V", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", HttpHeaders.f51754TE, "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        OooOOO0.OooO0oO(client, "client");
        OooOOO0.OooO0oO(connection, "connection");
        OooOOO0.OooO0oO(http2Connection, "http2Connection");
        this.f124593OooO00o = connection;
        this.f124594OooO0O0 = realInterceptorChain;
        this.f124595OooO0OO = http2Connection;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f124598OooO0o0 = client.f124192Oooo0oo.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final InterfaceC34548OooOoo0 OooO00o(Response response) {
        Http2Stream http2Stream = this.f124596OooO0Oo;
        OooOOO0.OooO0Oo(http2Stream);
        return http2Stream.f124610OooO;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final RealConnection getF124593OooO00o() {
        return this.f124593OooO00o;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final InterfaceC34544OooOoO OooO0OO(Request request, long j) {
        OooOOO0.OooO0oO(request, "request");
        Http2Stream http2Stream = this.f124596OooO0Oo;
        OooOOO0.OooO0Oo(http2Stream);
        return http2Stream.OooO0oO();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void OooO0Oo() throws IOException {
        this.f124595OooO0OO.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long OooO0o(Response response) {
        if (okhttp3.internal.http.HttpHeaders.OooO00o(response)) {
            return Util.OooOO0O(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void OooO0o0() throws IOException {
        Http2Stream http2Stream = this.f124596OooO0Oo;
        OooOOO0.OooO0Oo(http2Stream);
        http2Stream.OooO0oO().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void OooO0oO(Request request) throws IOException {
        int i;
        Http2Stream http2Stream;
        boolean z = true;
        OooOOO0.OooO0oO(request, "request");
        if (this.f124596OooO0Oo != null) {
            return;
        }
        boolean z2 = request.f124241OooO0Oo != null;
        f124591OooO0oO.getClass();
        Headers headers = request.f124240OooO0OO;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f124494OooO0o, request.f124239OooO0O0));
        C34527OooO0oO c34527OooO0oO = Header.f124496OooO0oO;
        RequestLine requestLine = RequestLine.f124452OooO00o;
        HttpUrl httpUrl = request.f124238OooO00o;
        requestLine.getClass();
        arrayList.add(new Header(c34527OooO0oO, RequestLine.OooO00o(httpUrl)));
        String strOooO0O0 = request.f124240OooO0OO.OooO0O0("Host");
        if (strOooO0O0 != null) {
            arrayList.add(new Header(Header.f124492OooO, strOooO0O0));
        }
        arrayList.add(new Header(Header.f124497OooO0oo, httpUrl.f124129OooO00o));
        int size = headers.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            String strOooO0Oo = headers.OooO0Oo(i2);
            Locale US = Locale.US;
            OooOOO0.OooO0o(US, "US");
            String lowerCase = strOooO0Oo.toLowerCase(US);
            OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f124592OooO0oo.contains(lowerCase) || (lowerCase.equals("te") && OooOOO0.OooO0O0(headers.OooO0oO(i2), "trailers"))) {
                arrayList.add(new Header(lowerCase, headers.OooO0oO(i2)));
            }
            i2 = i3;
        }
        Http2Connection http2Connection = this.f124595OooO0OO;
        http2Connection.getClass();
        boolean z3 = !z2;
        synchronized (http2Connection.f124546OoooO) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.f124530OooOoOO > 1073741823) {
                        http2Connection.OooOOoo(ErrorCode.REFUSED_STREAM);
                    }
                    if (http2Connection.f124532OooOoo0) {
                        throw new ConnectionShutdownException();
                    }
                    i = http2Connection.f124530OooOoOO;
                    http2Connection.f124530OooOoOO = i + 2;
                    http2Stream = new Http2Stream(i, http2Connection, z3, false, null);
                    if (z2 && http2Connection.f124548OoooO00 < http2Connection.f124547OoooO0 && http2Stream.f124616OooO0o0 < http2Stream.f124615OooO0o) {
                        z = false;
                    }
                    if (http2Stream.OooO()) {
                        http2Connection.f124526OooOo.put(Integer.valueOf(i), http2Stream);
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            http2Connection.f124546OoooO.OooOOo0(arrayList, i, z3);
        }
        if (z) {
            http2Connection.f124546OoooO.flush();
        }
        this.f124596OooO0Oo = http2Stream;
        if (this.f124597OooO0o) {
            Http2Stream http2Stream2 = this.f124596OooO0Oo;
            OooOOO0.OooO0Oo(http2Stream2);
            http2Stream2.OooO0o0(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream3 = this.f124596OooO0Oo;
        OooOOO0.OooO0Oo(http2Stream3);
        Http2Stream.StreamTimeout streamTimeout = http2Stream3.f124620OooOO0O;
        long j = this.f124594OooO0O0.f124447OooO0oO;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.timeout(j, timeUnit);
        Http2Stream http2Stream4 = this.f124596OooO0Oo;
        OooOOO0.OooO0Oo(http2Stream4);
        http2Stream4.f124621OooOO0o.timeout(this.f124594OooO0O0.f124448OooO0oo, timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder OooO0oo(boolean z) throws IOException {
        Headers headers;
        Http2Stream http2Stream = this.f124596OooO0Oo;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (http2Stream) {
            http2Stream.f124620OooOO0O.enter();
            while (http2Stream.f124617OooO0oO.isEmpty() && http2Stream.f124623OooOOO0 == null) {
                try {
                    http2Stream.OooOO0o();
                } catch (Throwable th) {
                    http2Stream.f124620OooOO0O.OooO00o();
                    throw th;
                }
            }
            http2Stream.f124620OooOO0O.OooO00o();
            if (http2Stream.f124617OooO0oO.isEmpty()) {
                IOException iOException = http2Stream.f124622OooOOO;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = http2Stream.f124623OooOOO0;
                OooOOO0.OooO0Oo(errorCode);
                throw new StreamResetException(errorCode);
            }
            Headers headersRemoveFirst = http2Stream.f124617OooO0oO.removeFirst();
            OooOOO0.OooO0o(headersRemoveFirst, "headersQueue.removeFirst()");
            headers = headersRemoveFirst;
        }
        Companion companion = f124591OooO0oO;
        Protocol protocol = this.f124598OooO0o0;
        companion.getClass();
        OooOOO0.OooO0oO(protocol, "protocol");
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        int i = 0;
        StatusLine statusLineOooO00o = null;
        while (i < size) {
            int i2 = i + 1;
            String strOooO0Oo = headers.OooO0Oo(i);
            String strOooO0oO = headers.OooO0oO(i);
            if (OooOOO0.OooO0O0(strOooO0Oo, C18134ca.f54486e)) {
                StatusLine.Companion companion2 = StatusLine.f124454OooO0Oo;
                String strOooOOO0 = OooOOO0.OooOOO0(strOooO0oO, "HTTP/1.1 ");
                companion2.getClass();
                statusLineOooO00o = StatusLine.Companion.OooO00o(strOooOOO0);
            } else if (!f124590OooO.contains(strOooO0Oo)) {
                builder.OooO0O0(strOooO0Oo, strOooO0oO);
            }
            i = i2;
        }
        if (statusLineOooO00o == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.f124272OooO0O0 = protocol;
        builder2.f124273OooO0OO = statusLineOooO00o.f124456OooO0O0;
        String message = statusLineOooO00o.f124457OooO0OO;
        OooOOO0.OooO0oO(message, "message");
        builder2.f124274OooO0Oo = message;
        builder2.f124275OooO0o = builder.OooO0OO().OooO0o0();
        if (z && builder2.f124273OooO0OO == 100) {
            return null;
        }
        return builder2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f124597OooO0o = true;
        Http2Stream http2Stream = this.f124596OooO0Oo;
        if (http2Stream == null) {
            return;
        }
        http2Stream.OooO0o0(ErrorCode.CANCEL);
    }
}
