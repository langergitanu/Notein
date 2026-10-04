package okhttp3.internal.cache;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import okhttp3.CacheControl;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Companion f124311OooO00o = new Companion(0);

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static final Response OooO00o(Companion companion, Response response) {
            companion.getClass();
            if ((response == null ? null : response.f124262OooOoo) == null) {
                return response;
            }
            Response.Builder builderOooOOO0 = response.OooOOO0();
            builderOooOOO0.f124277OooO0oO = null;
            return builderOooOOO0.OooO00o();
        }

        public static boolean OooO0O0(String str) {
            return (HttpHeaders.CONNECTION.equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || HttpHeaders.f51754TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        CacheStrategy cacheStrategy;
        String str2;
        Headers headers;
        int i;
        int length;
        String str3;
        int i2;
        String string;
        int length2;
        int length3;
        String str4 = "networkResponse";
        Companion companion = f124311OooO00o;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall call = realInterceptorChain.f124441OooO00o;
        System.currentTimeMillis();
        Request request = realInterceptorChain.f124446OooO0o0;
        OooOOO0.OooO0oO(request, "request");
        CacheStrategy cacheStrategy2 = new CacheStrategy(request, null);
        CacheControl cacheControl = request.f124242OooO0o;
        if (cacheControl == null) {
            CacheControl.Companion companion2 = CacheControl.f124032OooOOO;
            Headers headers2 = request.f124240OooO0OO;
            companion2.getClass();
            int size = headers2.size();
            boolean z = true;
            int i3 = 0;
            String str5 = null;
            boolean z2 = false;
            boolean z3 = false;
            int iOooOoO = -1;
            int iOooOoO2 = -1;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            int iOooOoO3 = -1;
            int iOooOoO4 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (i3 < size) {
                int i4 = i3 + 1;
                String strOooO0Oo = headers2.OooO0Oo(i3);
                String strOooO0oO = headers2.OooO0oO(i3);
                Headers headers3 = headers2;
                CacheStrategy cacheStrategy3 = cacheStrategy2;
                boolean z10 = true;
                if (C33595OooOOo.OooOOo(strOooO0Oo, "Cache-Control", true)) {
                    if (str5 == null) {
                        str5 = strOooO0oO;
                    }
                    i = 0;
                    while (i < strOooO0oO.length()) {
                        int length4 = strOooO0oO.length();
                        int i5 = i;
                        while (true) {
                            if (i5 >= length4) {
                                length = strOooO0oO.length();
                                break;
                            }
                            int i6 = i5 + 1;
                            int i7 = length4;
                            int i8 = i5;
                            if (C33599OooOo0O.OooOoo0("=,;", strOooO0oO.charAt(i5))) {
                                length = i8;
                                break;
                            }
                            i5 = i6;
                            length4 = i7;
                        }
                        String strSubstring = strOooO0oO.substring(i, length);
                        OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String string2 = C33599OooOo0O.Oooooo0(strSubstring).toString();
                        int i9 = size;
                        if (length != strOooO0oO.length()) {
                            str3 = str4;
                            if (strOooO0oO.charAt(length) != ',' && strOooO0oO.charAt(length) != ';') {
                                int i10 = length + 1;
                                byte[] bArr = Util.f124301OooO00o;
                                int length5 = strOooO0oO.length();
                                while (true) {
                                    if (i10 >= length5) {
                                        length2 = strOooO0oO.length();
                                        break;
                                    }
                                    int i11 = i10 + 1;
                                    int i12 = length5;
                                    char cCharAt = strOooO0oO.charAt(i10);
                                    int i13 = i10;
                                    if (cCharAt != ' ' && cCharAt != '\t') {
                                        length2 = i13;
                                        break;
                                    }
                                    i10 = i11;
                                    length5 = i12;
                                }
                                if (length2 >= strOooO0oO.length() || strOooO0oO.charAt(length2) != '\"') {
                                    int length6 = strOooO0oO.length();
                                    int i14 = length2;
                                    while (true) {
                                        if (i14 >= length6) {
                                            length3 = strOooO0oO.length();
                                            break;
                                        }
                                        int i15 = i14 + 1;
                                        int i16 = length6;
                                        int i17 = i14;
                                        if (C33599OooOo0O.OooOoo0(",;", strOooO0oO.charAt(i14))) {
                                            length3 = i17;
                                            break;
                                        }
                                        i14 = i15;
                                        length6 = i16;
                                    }
                                    String strSubstring2 = strOooO0oO.substring(length2, length3);
                                    OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    string = C33599OooOo0O.Oooooo0(strSubstring2).toString();
                                    i2 = length3;
                                } else {
                                    int i18 = length2 + 1;
                                    int iOooo0 = C33599OooOo0O.Oooo0(strOooO0oO, '\"', i18, 4);
                                    String strSubstring3 = strOooO0oO.substring(i18, iOooo0);
                                    OooOOO0.OooO0o(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    i2 = iOooo0 + 1;
                                    string = strSubstring3;
                                }
                            }
                            if (!"no-cache".equalsIgnoreCase(string2)) {
                                i = i2;
                                size = i9;
                                str4 = str3;
                                z10 = true;
                                z2 = true;
                            } else if ("no-store".equalsIgnoreCase(string2)) {
                                i = i2;
                                size = i9;
                                str4 = str3;
                                z10 = true;
                                z3 = true;
                            } else {
                                if ("max-age".equalsIgnoreCase(string2)) {
                                    iOooOoO = Util.OooOoO(-1, string);
                                } else if ("s-maxage".equalsIgnoreCase(string2)) {
                                    iOooOoO2 = Util.OooOoO(-1, string);
                                } else if ("private".equalsIgnoreCase(string2)) {
                                    i = i2;
                                    size = i9;
                                    str4 = str3;
                                    z10 = true;
                                    z4 = true;
                                } else if ("public".equalsIgnoreCase(string2)) {
                                    i = i2;
                                    size = i9;
                                    str4 = str3;
                                    z10 = true;
                                    z5 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                                    i = i2;
                                    size = i9;
                                    str4 = str3;
                                    z10 = true;
                                    z6 = true;
                                } else if ("max-stale".equalsIgnoreCase(string2)) {
                                    iOooOoO3 = Util.OooOoO(Integer.MAX_VALUE, string);
                                } else if ("min-fresh".equalsIgnoreCase(string2)) {
                                    iOooOoO4 = Util.OooOoO(-1, string);
                                } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                                    i = i2;
                                    size = i9;
                                    str4 = str3;
                                    z10 = true;
                                    z7 = true;
                                } else if ("no-transform".equalsIgnoreCase(string2)) {
                                    i = i2;
                                    size = i9;
                                    str4 = str3;
                                    z10 = true;
                                    z8 = true;
                                } else {
                                    boolean zEqualsIgnoreCase = "immutable".equalsIgnoreCase(string2);
                                    i = i2;
                                    size = i9;
                                    if (zEqualsIgnoreCase) {
                                        str4 = str3;
                                        z10 = true;
                                        z9 = true;
                                    } else {
                                        str4 = str3;
                                        z10 = true;
                                    }
                                }
                                i = i2;
                                size = i9;
                                str4 = str3;
                                z10 = true;
                            }
                        } else {
                            str3 = str4;
                        }
                        i2 = length + 1;
                        string = null;
                        if (!"no-cache".equalsIgnoreCase(string2)) {
                        }
                    }
                    i3 = i4;
                    headers2 = headers3;
                    cacheStrategy2 = cacheStrategy3;
                } else if (!C33595OooOOo.OooOOo(strOooO0Oo, HttpHeaders.PRAGMA, true)) {
                    i3 = i4;
                    headers2 = headers3;
                    cacheStrategy2 = cacheStrategy3;
                }
                z = false;
                i = 0;
                while (i < strOooO0oO.length()) {
                }
                i3 = i4;
                headers2 = headers3;
                cacheStrategy2 = cacheStrategy3;
            }
            str = str4;
            cacheStrategy = cacheStrategy2;
            cacheControl = new CacheControl(z2, z3, iOooOoO, iOooOoO2, z4, z5, z6, iOooOoO3, iOooOoO4, z7, z8, z9, !z ? null : str5);
            request.f124242OooO0o = cacheControl;
        } else {
            str = "networkResponse";
            cacheStrategy = cacheStrategy2;
        }
        CacheStrategy cacheStrategy4 = cacheControl.f124042OooOO0 ? new CacheStrategy(null, null) : cacheStrategy;
        Request request2 = cacheStrategy4.f124313OooO00o;
        Response response = cacheStrategy4.f124314OooO0O0;
        RealCall realCall = call != null ? call : null;
        EventListener eventListener = realCall == null ? null : realCall.f124378OooOoOO;
        if (eventListener == null) {
            eventListener = EventListener.f124110OooO00o;
        }
        if (request2 == null && response == null) {
            Response.Builder builder = new Response.Builder();
            Request request3 = realInterceptorChain.f124446OooO0o0;
            OooOOO0.OooO0oO(request3, "request");
            builder.f124271OooO00o = request3;
            builder.f124272OooO0O0 = Protocol.HTTP_1_1;
            builder.f124273OooO0OO = 504;
            builder.f124274OooO0Oo = "Unsatisfiable Request (only-if-cached)";
            builder.f124277OooO0oO = Util.f124303OooO0OO;
            builder.f124280OooOO0O = -1L;
            builder.f124281OooOO0o = System.currentTimeMillis();
            Response responseOooO00o = builder.OooO00o();
            eventListener.getClass();
            OooOOO0.OooO0oO(call, "call");
            return responseOooO00o;
        }
        if (request2 == null) {
            OooOOO0.OooO0Oo(response);
            Response.Builder builderOooOOO0 = response.OooOOO0();
            Response responseOooO00o2 = Companion.OooO00o(companion, response);
            Response.Builder.OooO0O0("cacheResponse", responseOooO00o2);
            builderOooOOO0.f124270OooO = responseOooO00o2;
            Response responseOooO00o3 = builderOooOOO0.OooO00o();
            eventListener.getClass();
            OooOOO0.OooO0oO(call, "call");
            return responseOooO00o3;
        }
        if (response != null) {
            eventListener.getClass();
            OooOOO0.OooO0oO(call, "call");
        }
        Response responseOooO00o4 = realInterceptorChain.OooO00o(request2);
        if (response == null) {
            str2 = str;
        } else {
            if (responseOooO00o4.f124259OooOoO == 304) {
                Response.Builder builderOooOOO02 = response.OooOOO0();
                Headers headers4 = response.f124263OooOoo0;
                Headers headers5 = responseOooO00o4.f124263OooOoo0;
                companion.getClass();
                Headers.Builder builder2 = new Headers.Builder();
                int size2 = headers4.size();
                int i19 = 0;
                while (i19 < size2) {
                    int i20 = i19 + 1;
                    String strOooO0Oo2 = headers4.OooO0Oo(i19);
                    String strOooO0oO2 = headers4.OooO0oO(i19);
                    if (HttpHeaders.WARNING.equalsIgnoreCase(strOooO0Oo2)) {
                        headers = headers4;
                        if (C33595OooOOo.OooOoO0(strOooO0oO2, "1", false)) {
                        }
                        i19 = i20;
                        headers4 = headers;
                    } else {
                        headers = headers4;
                    }
                    if ("Content-Length".equalsIgnoreCase(strOooO0Oo2) || "Content-Encoding".equalsIgnoreCase(strOooO0Oo2) || "Content-Type".equalsIgnoreCase(strOooO0Oo2) || !Companion.OooO0O0(strOooO0Oo2) || headers5.OooO0O0(strOooO0Oo2) == null) {
                        builder2.OooO0O0(strOooO0Oo2, strOooO0oO2);
                    }
                    i19 = i20;
                    headers4 = headers;
                }
                int i21 = 0;
                int size3 = headers5.size();
                while (i21 < size3) {
                    int i22 = i21 + 1;
                    String strOooO0Oo3 = headers5.OooO0Oo(i21);
                    if (!"Content-Length".equalsIgnoreCase(strOooO0Oo3) && !"Content-Encoding".equalsIgnoreCase(strOooO0Oo3) && !"Content-Type".equalsIgnoreCase(strOooO0Oo3) && Companion.OooO0O0(strOooO0Oo3)) {
                        builder2.OooO0O0(strOooO0Oo3, headers5.OooO0oO(i21));
                    }
                    i21 = i22;
                }
                builderOooOOO02.f124275OooO0o = builder2.OooO0OO().OooO0o0();
                builderOooOOO02.f124280OooOO0O = responseOooO00o4.f124268Oooo00O;
                builderOooOOO02.f124281OooOO0o = responseOooO00o4.f124269Oooo00o;
                Response responseOooO00o5 = Companion.OooO00o(companion, response);
                Response.Builder.OooO0O0("cacheResponse", responseOooO00o5);
                builderOooOOO02.f124270OooO = responseOooO00o5;
                Response responseOooO00o6 = Companion.OooO00o(companion, responseOooO00o4);
                Response.Builder.OooO0O0(str, responseOooO00o6);
                builderOooOOO02.f124278OooO0oo = responseOooO00o6;
                builderOooOOO02.OooO00o();
                ResponseBody responseBody = responseOooO00o4.f124262OooOoo;
                OooOOO0.OooO0Oo(responseBody);
                responseBody.close();
                OooOOO0.OooO0Oo(null);
                throw null;
            }
            str2 = str;
            ResponseBody responseBody2 = response.f124262OooOoo;
            if (responseBody2 != null) {
                Util.OooO0OO(responseBody2);
            }
        }
        Response.Builder builderOooOOO03 = responseOooO00o4.OooOOO0();
        Response responseOooO00o7 = Companion.OooO00o(companion, response);
        Response.Builder.OooO0O0("cacheResponse", responseOooO00o7);
        builderOooOOO03.f124270OooO = responseOooO00o7;
        Response responseOooO00o8 = Companion.OooO00o(companion, responseOooO00o4);
        Response.Builder.OooO0O0(str2, responseOooO00o8);
        builderOooOOO03.f124278OooO0oo = responseOooO00o8;
        return builderOooOOO03.OooO00o();
    }
}
