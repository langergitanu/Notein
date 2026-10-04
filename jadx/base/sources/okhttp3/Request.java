package okhttp3;

import OooOoo.C20593OooO0Oo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/Request;", "", "Builder", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Request {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HttpUrl f124238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f124239OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Headers f124240OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RequestBody f124241OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CacheControl f124242OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Map<Class<?>, Object> f124243OooO0o0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public HttpUrl f124244OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public RequestBody f124247OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public LinkedHashMap f124248OooO0o0 = new LinkedHashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f124245OooO0O0 = "GET";

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Headers.Builder f124246OooO0OO = new Headers.Builder();

        public final void OooO00o(String name, String value) {
            OooOOO0.OooO0oO(name, "name");
            OooOOO0.OooO0oO(value, "value");
            this.f124246OooO0OO.OooO00o(name, value);
        }

        public final Request OooO0O0() {
            Map mapUnmodifiableMap;
            HttpUrl httpUrl = this.f124244OooO00o;
            if (httpUrl == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.f124245OooO0O0;
            Headers headersOooO0OO = this.f124246OooO0OO.OooO0OO();
            RequestBody requestBody = this.f124247OooO0Oo;
            LinkedHashMap linkedHashMap = this.f124248OooO0o0;
            byte[] bArr = Util.f124301OooO00o;
            OooOOO0.OooO0oO(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = C34436OooOoOO.f123455OooOo0o;
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                OooOOO0.OooO0o(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new Request(httpUrl, str, headersOooO0OO, requestBody, mapUnmodifiableMap);
        }

        public final void OooO0OO(String str, String value) {
            OooOOO0.OooO0oO(value, "value");
            Headers.Builder builder = this.f124246OooO0OO;
            builder.getClass();
            Headers.f124123OooOo.getClass();
            Headers.Companion.OooO00o(str);
            Headers.Companion.OooO0O0(value, str);
            builder.OooO0Oo(str);
            builder.OooO0O0(str, value);
        }

        public final void OooO0Oo(String method, RequestBody requestBody) {
            OooOOO0.OooO0oO(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.f124439OooO00o;
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.OooO00o(method)) {
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("method ", method, " must not have a request body.").toString());
            }
            this.f124245OooO0O0 = method;
            this.f124247OooO0Oo = requestBody;
        }

        public final void OooO0o(String url) {
            OooOOO0.OooO0oO(url, "url");
            if (C33595OooOOo.OooOoO0(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = OooOOO0.OooOOO0(strSubstring, "http:");
            } else if (C33595OooOOo.OooOoO0(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                OooOOO0.OooO0o(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = OooOOO0.OooOOO0(strSubstring2, "https:");
            }
            HttpUrl.f124126OooOO0O.getClass();
            this.f124244OooO00o = HttpUrl.Companion.OooO0OO(url);
        }

        public final void OooO0o0(Class type, Object obj) {
            OooOOO0.OooO0oO(type, "type");
            if (obj == null) {
                this.f124248OooO0o0.remove(type);
                return;
            }
            if (this.f124248OooO0o0.isEmpty()) {
                this.f124248OooO0o0 = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f124248OooO0o0;
            Object objCast = type.cast(obj);
            OooOOO0.OooO0Oo(objCast);
            linkedHashMap.put(type, objCast);
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(method, "method");
        this.f124238OooO00o = url;
        this.f124239OooO0O0 = method;
        this.f124240OooO0OO = headers;
        this.f124241OooO0Oo = requestBody;
        this.f124243OooO0o0 = map;
    }

    public final Builder OooO00o() {
        Builder builder = new Builder();
        builder.f124248OooO0o0 = new LinkedHashMap();
        builder.f124244OooO00o = this.f124238OooO00o;
        builder.f124245OooO0O0 = this.f124239OooO0O0;
        builder.f124247OooO0Oo = this.f124241OooO0Oo;
        Map<Class<?>, Object> map = this.f124243OooO0o0;
        builder.f124248OooO0o0 = map.isEmpty() ? new LinkedHashMap() : C34444Oooo0O0.OooOOOO(map);
        builder.f124246OooO0OO = this.f124240OooO0OO.OooO0o0();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f124239OooO0O0);
        sb.append(", url=");
        sb.append(this.f124238OooO00o);
        Headers headers = this.f124240OooO0OO;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (C32443OooOOO<? extends String, ? extends String> c32443OooOOO : headers) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                C32443OooOOO<? extends String, ? extends String> c32443OooOOO2 = c32443OooOOO;
                String str = (String) c32443OooOOO2.f116638OooOo0o;
                String str2 = (String) c32443OooOOO2.f116637OooOo;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map<Class<?>, Object> map = this.f124243OooO0o0;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
