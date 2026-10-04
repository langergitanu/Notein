package okhttp3;

import androidx.core.location.LocationRequestCompat;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34542OooOo0O;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Builder", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Response implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Protocol f124257OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Request f124258OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f124259OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f124260OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Handshake f124261OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ResponseBody f124262OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Headers f124263OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Response f124264OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Response f124265OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Exchange f124266Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Response f124267Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final long f124268Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final long f124269Oooo00o;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static class Builder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Response f124270OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Request f124271OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Protocol f124272OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f124274OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Handshake f124276OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ResponseBody f124277OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Response f124278OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Response f124279OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f124280OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f124281OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Exchange f124282OooOOO0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f124273OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Headers.Builder f124275OooO0o = new Headers.Builder();

        public static void OooO0O0(String str, Response response) {
            if (response == null) {
                return;
            }
            if (response.f124262OooOoo != null) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(".body != null", str).toString());
            }
            if (response.f124264OooOooO != null) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(".networkResponse != null", str).toString());
            }
            if (response.f124265OooOooo != null) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(".cacheResponse != null", str).toString());
            }
            if (response.f124267Oooo000 != null) {
                throw new IllegalArgumentException(OooOOO0.OooOOO0(".priorResponse != null", str).toString());
            }
        }

        public final Response OooO00o() {
            int i = this.f124273OooO0OO;
            if (i < 0) {
                throw new IllegalStateException(OooOOO0.OooOOO0(Integer.valueOf(i), "code < 0: ").toString());
            }
            Request request = this.f124271OooO00o;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f124272OooO0O0;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f124274OooO0Oo;
            if (str != null) {
                return new Response(request, protocol, str, i, this.f124276OooO0o0, this.f124275OooO0o.OooO0OO(), this.f124277OooO0oO, this.f124278OooO0oo, this.f124270OooO, this.f124279OooOO0, this.f124280OooOO0O, this.f124281OooOO0o, this.f124282OooOOO0);
            }
            throw new IllegalStateException("message == null");
        }
    }

    public Response(Request request, Protocol protocol, String message, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
        OooOOO0.OooO0oO(request, "request");
        OooOOO0.OooO0oO(protocol, "protocol");
        OooOOO0.OooO0oO(message, "message");
        this.f124258OooOo0o = request;
        this.f124257OooOo = protocol;
        this.f124260OooOoO0 = message;
        this.f124259OooOoO = i;
        this.f124261OooOoOO = handshake;
        this.f124263OooOoo0 = headers;
        this.f124262OooOoo = responseBody;
        this.f124264OooOooO = response;
        this.f124265OooOooo = response2;
        this.f124267Oooo000 = response3;
        this.f124268Oooo00O = j;
        this.f124269Oooo00o = j2;
        this.f124266Oooo0 = exchange;
    }

    public static String OooO00o(String str, Response response) {
        response.getClass();
        String strOooO0O0 = response.f124263OooOoo0.OooO0O0(str);
        if (strOooO0O0 == null) {
            return null;
        }
        return strOooO0O0;
    }

    public final boolean OooO0OO() {
        int i = this.f124259OooOoO;
        return 200 <= i && i < 300;
    }

    public final Builder OooOOO0() {
        Builder builder = new Builder();
        builder.f124271OooO00o = this.f124258OooOo0o;
        builder.f124272OooO0O0 = this.f124257OooOo;
        builder.f124273OooO0OO = this.f124259OooOoO;
        builder.f124274OooO0Oo = this.f124260OooOoO0;
        builder.f124276OooO0o0 = this.f124261OooOoOO;
        builder.f124275OooO0o = this.f124263OooOoo0.OooO0o0();
        builder.f124277OooO0oO = this.f124262OooOoo;
        builder.f124278OooO0oo = this.f124264OooOooO;
        builder.f124270OooO = this.f124265OooOooo;
        builder.f124279OooOO0 = this.f124267Oooo000;
        builder.f124280OooOO0O = this.f124268Oooo00O;
        builder.f124281OooOO0o = this.f124269Oooo00o;
        builder.f124282OooOOO0 = this.f124266Oooo0;
        return builder;
    }

    public final ResponseBody$Companion$asResponseBody$1 OooOOo0() throws IOException {
        ResponseBody responseBody = this.f124262OooOoo;
        OooOOO0.OooO0Oo(responseBody);
        C34542OooOo0O c34542OooOo0OPeek = responseBody.getF124289OooOoO0().peek();
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        c34542OooOo0OPeek.request(LocationRequestCompat.PASSIVE_INTERVAL);
        long jMin = Math.min(LocationRequestCompat.PASSIVE_INTERVAL, c34542OooOo0OPeek.f123776OooOo.f123723OooOo);
        while (jMin > 0) {
            long j = c34542OooOo0OPeek.read(c34524OooO0Oo, jMin);
            if (j == -1) {
                throw new EOFException();
            }
            jMin -= j;
        }
        ResponseBody.Companion companion = ResponseBody.INSTANCE;
        MediaType mediaTypeContentType = responseBody.getF124288OooOo0o();
        long j2 = c34524OooO0Oo.f123723OooOo;
        companion.getClass();
        return ResponseBody.Companion.OooO0O0(c34524OooO0Oo, mediaTypeContentType, j2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.f124262OooOoo;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f124257OooOo + ", code=" + this.f124259OooOoO + ", message=" + this.f124260OooOoO0 + ", url=" + this.f124258OooOo0o.f124238OooO00o + '}';
    }
}
