package com.huawei.hms.network.embedded;

import android.os.UserManager;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18141d3;
import com.huawei.hms.network.embedded.C18295o3;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.x3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18412x3 extends Interceptor {

    /* JADX INFO: renamed from: b */
    public static final String f56566b = "CacheInterceptor";

    /* JADX INFO: renamed from: c */
    public static final String f56567c = "com.huawei.secure.android.common.encrypt.aes.AesGcm";

    /* JADX INFO: renamed from: d */
    public static final ResponseBody f56568d = new C18321q3.g(new C18295o3.b().build());

    /* JADX INFO: renamed from: e */
    public static final int f56569e = 307;

    /* JADX INFO: renamed from: f */
    public static final int f56570f = 308;

    /* JADX INFO: renamed from: g */
    public static final int f56571g = 504;

    /* JADX INFO: renamed from: h */
    public static final int f56572h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f56573i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f56574j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f56575k = 3;

    /* JADX INFO: renamed from: l */
    public static final int f56576l = 4;

    /* JADX INFO: renamed from: a */
    public C18360t3 f56577a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.x3$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final long f56578a;

        /* JADX INFO: renamed from: b */
        public final c f56579b;

        /* JADX INFO: renamed from: c */
        public Request f56580c;

        /* JADX INFO: renamed from: d */
        public Date f56581d;

        /* JADX INFO: renamed from: e */
        public String f56582e;

        /* JADX INFO: renamed from: f */
        public Date f56583f;

        /* JADX INFO: renamed from: g */
        public String f56584g;

        /* JADX INFO: renamed from: h */
        public Date f56585h;

        /* JADX INFO: renamed from: i */
        public long f56586i;

        /* JADX INFO: renamed from: j */
        public long f56587j;

        /* JADX INFO: renamed from: k */
        public C18386v3 f56588k;

        /* JADX INFO: renamed from: l */
        public String f56589l;

        /* JADX INFO: renamed from: m */
        public int f56590m;

        public b(c cVar) {
            String strValue;
            this.f56590m = -1;
            this.f56578a = System.currentTimeMillis();
            this.f56579b = cVar;
            if (cVar != null) {
                this.f56588k = cVar.m79877b();
                this.f56586i = cVar.m79881f();
                this.f56587j = cVar.m79876a();
                Headers headersM77737of = Headers.m77737of(cVar.m79879d().getHeaders());
                int size = headersM77737of.size();
                for (int i = 0; i < size; i++) {
                    String lowerCase = headersM77737of.name(i).toLowerCase(Locale.ROOT);
                    strValue = headersM77737of.value(i);
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "expires":
                            this.f56585h = C18100a4.parse(strValue);
                            break;
                        case "age":
                            this.f56590m = C18100a4.parseSeconds(strValue, -1);
                            break;
                        case "date":
                            this.f56581d = C18100a4.parse(strValue);
                            this.f56582e = strValue;
                            break;
                        case "etag":
                            this.f56589l = strValue;
                            break;
                        case "last-modified":
                            this.f56583f = C18100a4.parse(strValue);
                            this.f56584g = strValue;
                            break;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private long m79871b() {
            if (this.f56579b.m79880e().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            if (this.f56585h != null) {
                Date date = this.f56581d;
                long time = this.f56585h.getTime() - (date != null ? date.getTime() : this.f56587j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f56583f != null) {
                Date date2 = this.f56581d;
                long time2 = (date2 != null ? date2.getTime() : this.f56586i) - this.f56583f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public int m79873c() {
            String str;
            long jM79870a = m79870a();
            long jM79871b = m79871b();
            if (this.f56588k.maxAgeSeconds() != -1) {
                jM79871b = Math.min(jM79871b, TimeUnit.SECONDS.toMillis(this.f56588k.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = this.f56588k.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(this.f56588k.minFreshSeconds()) : 0L;
            if (!this.f56588k.mustRevalidate() && this.f56588k.maxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(this.f56588k.maxStaleSeconds());
            }
            if (!this.f56579b.m79880e().noCache()) {
                long j = millis2 + jM79870a;
                if (j < millis + jM79871b) {
                    if (j >= jM79871b) {
                        return 2;
                    }
                    return (jM79870a <= C18385v2.f56338j || !m79875e()) ? 1 : 3;
                }
            }
            String str2 = this.f56589l;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f56583f != null) {
                    str2 = this.f56584g;
                } else {
                    if (this.f56581d == null) {
                        return 0;
                    }
                    str2 = this.f56582e;
                }
            }
            Headers headersBuild = Headers.m77737of(this.f56579b.m79878c().getHeaders()).newBuilder().add(str, str2).build();
            Request.Builder builderNewBuilder = this.f56579b.m79878c().newBuilder();
            for (int i = 0; i < headersBuild.size(); i++) {
                builderNewBuilder.addHeader(headersBuild.name(i), headersBuild.value(i));
            }
            this.f56580c = builderNewBuilder.build();
            return 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public Request m79874d() {
            return this.f56580c;
        }

        /* JADX INFO: renamed from: e */
        private boolean m79875e() {
            return this.f56579b.m79880e().maxAgeSeconds() == -1 && this.f56585h == null;
        }

        /* JADX INFO: renamed from: a */
        private long m79870a() {
            Date date = this.f56581d;
            long jMax = date != null ? Math.max(0L, this.f56587j - date.getTime()) : 0L;
            int i = this.f56590m;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            return (this.f56578a - this.f56586i) + jMax;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.x3$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final long f56591a;

        /* JADX INFO: renamed from: b */
        public final long f56592b;

        /* JADX INFO: renamed from: c */
        public final Response<ResponseBody> f56593c;

        /* JADX INFO: renamed from: d */
        public final Request f56594d;

        public c(long j, long j2, Request request, Response<ResponseBody> response) {
            CheckParamUtils.checkNotNull(response, "response == null");
            CheckParamUtils.checkNotNull(request, "request == null");
            this.f56591a = j;
            this.f56592b = j2;
            this.f56593c = response;
            this.f56594d = request;
        }

        /* JADX INFO: renamed from: a */
        public long m79876a() {
            return this.f56592b;
        }

        /* JADX INFO: renamed from: b */
        public C18386v3 m79877b() {
            return C18386v3.parse(Headers.m77737of(this.f56594d.getHeaders()));
        }

        /* JADX INFO: renamed from: c */
        public Request m79878c() {
            return this.f56594d;
        }

        /* JADX INFO: renamed from: d */
        public Response<ResponseBody> m79879d() {
            return this.f56593c;
        }

        /* JADX INFO: renamed from: e */
        public C18386v3 m79880e() {
            return C18386v3.parse(Headers.m77737of(this.f56593c.getHeaders()));
        }

        /* JADX INFO: renamed from: f */
        public long m79881f() {
            return this.f56591a;
        }
    }

    public C18412x3(C18360t3 c18360t3) {
        if (c18360t3 != null) {
            this.f56577a = c18360t3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Headers m79859a(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String strName = headers.name(i);
            String strValue = headers.value(i);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(strName) || !strValue.startsWith("1")) && (m79866b(strName) || !m79867c(strName) || headers2.get(strName) == null)) {
                builder.add(strName, strValue);
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String strName2 = headers2.name(i2);
            if (!m79866b(strName2) && m79867c(strName2)) {
                builder.add(strName2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r3.m79880e().isPrivate() == false) goto L33;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m79865b(c cVar) {
        int code = cVar.m79879d().getCode();
        if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
            if (code != 307) {
                if (code != 308 && code != 404 && code != 405) {
                    switch (code) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (cVar.m79879d().getHeaders().get("Expires") == null) {
                if (cVar.m79880e().maxAgeSeconds() == -1) {
                    if (!cVar.m79880e().isPublic()) {
                    }
                }
            }
        }
        return (cVar.m79880e().noStore() || cVar.m79877b().noStore()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m79867c(String str) {
        return (HttpHeaders.CONNECTION.equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || HttpHeaders.f51754TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m79868d(String str) {
        return str.equals("GET");
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws Throwable {
        Request request = chain.request();
        if (request == null) {
            throw new IOException("cacheInterceptor: request == null");
        }
        C18360t3 c18360t3 = this.f56577a;
        if (c18360t3 == null || c18360t3.isInvalid() || !m79864a(f56567c)) {
            return chain.proceed(request);
        }
        if (!m79868d(request.getMethod())) {
            return chain.proceed(request);
        }
        C18386v3 c18386v3 = C18386v3.parse(Headers.m77737of(request.getHeaders()));
        if (!m79861a()) {
            Logger.m76963i(f56566b, "The device is locked");
            if (!c18386v3.onlyIfCached()) {
                return chain.proceed(request);
            }
            Logger.m76967w(f56566b, "Device first started and unlocked, only-If-Cached:gateway timeout, 504");
            return new C18141d3.b().code(504).message("Unsatisfiable Request (only-if-cached)").body(f56568d).url(request.getUrl()).build();
        }
        if (c18386v3.noStore()) {
            Logger.m76963i(f56566b, "request with header:no-store");
            return chain.proceed(request);
        }
        if (c18386v3.noCache() || m79862a(request)) {
            long currentTime = Utils.getCurrentTime(false);
            Response<ResponseBody> responseProceed = chain.proceed(request);
            Logger.m76963i(f56566b, "request with header:no-cache or if-modified-since/if-none-match");
            return m79860a(new c(currentTime, Utils.getCurrentTime(false), request, responseProceed));
        }
        if (c18386v3.onlyIfCached()) {
            c cVar = this.f56577a.get(request);
            if (cVar == null || cVar.m79879d() == null || !m79863a(cVar.m79879d().getBody())) {
                Logger.m76963i(f56566b, "only-If-Cached:gateway timeout, 504");
                return new C18141d3.b().url(request.getUrl()).code(504).message("Unsatisfiable Request (only-if-cached)").body(f56568d).build();
            }
            Logger.m76963i(f56566b, "only-If-Cached: available response");
            return cVar.m79879d();
        }
        c cVar2 = this.f56577a.get(request);
        if (cVar2 == null || cVar2.m79879d() == null) {
            long currentTime2 = Utils.getCurrentTime(false);
            Response<ResponseBody> responseProceed2 = chain.proceed(request);
            Logger.m76963i(f56566b, "Cache response is null, send the request to server");
            return m79860a(new c(currentTime2, Utils.getCurrentTime(false), request, responseProceed2));
        }
        b bVar = new b(cVar2);
        int iM79873c = bVar.m79873c();
        Logger.m76963i(f56566b, "cacheStrategy cacheStrategy code is: " + iM79873c);
        C18141d3.b bVarErrorBody = new C18141d3.b().headers(cVar2.m79879d().getHeaders()).url(cVar2.m79879d().getUrl()).message(cVar2.m79879d().getMessage()).code(cVar2.m79879d().getCode()).body(cVar2.m79879d().getBody()).errorBody(cVar2.m79879d().getErrorBody());
        if (iM79873c == 0) {
            long currentTime3 = Utils.getCurrentTime(false);
            Response<ResponseBody> responseProceed3 = chain.proceed(request);
            IoUtils.closeSecure(cVar2.m79879d());
            Logger.m76963i(f56566b, "Cache response is expried， and without Etag");
            return m79860a(new c(currentTime3, Utils.getCurrentTime(false), request, responseProceed3));
        }
        if (iM79873c == 1 && m79863a(cVar2.m79879d().getBody())) {
            Logger.m76963i(f56566b, "Cached response is not expried");
            return bVarErrorBody.build();
        }
        if (iM79873c == 2 && m79863a(cVar2.m79879d().getBody())) {
            bVarErrorBody.headers(Headers.m77738of(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"").toMultimap());
            Logger.m76963i(f56566b, "Warning: 110 HttpURLConnection \"Response is stale\"");
            return bVarErrorBody.build();
        }
        if (iM79873c == 3 && m79863a(cVar2.m79879d().getBody())) {
            bVarErrorBody.url(request.getUrl()).headers(Headers.m77738of(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"").toMultimap());
            Logger.m76963i(f56566b, "Warning: 113 HttpURLConnection \"Heuristic expiration\"");
            return bVarErrorBody.build();
        }
        if (iM79873c != 4) {
            return null;
        }
        long currentTime4 = Utils.getCurrentTime(false);
        Response<ResponseBody> responseProceed4 = chain.proceed(bVar.m79874d());
        if (responseProceed4.getCode() != 304) {
            IoUtils.closeSecure(cVar2.m79879d());
            return m79860a(new c(currentTime4, Utils.getCurrentTime(false), request, responseProceed4));
        }
        C18141d3 c18141d3Build = bVarErrorBody.headers(m79859a(Headers.m77737of(cVar2.m79879d().getHeaders()), Headers.m77737of(responseProceed4.getHeaders())).toMultimap()).build();
        Logger.m76963i(f56566b, "http not modified: 304, update the cached response");
        IoUtils.closeSecure(responseProceed4.getBody());
        this.f56577a.update(new c(currentTime4, Utils.getCurrentTime(false), request, responseProceed4));
        return c18141d3Build;
    }

    /* JADX INFO: renamed from: a */
    private Response<ResponseBody> m79860a(c cVar) throws Throwable {
        Response<ResponseBody> responseM79879d = cVar.m79879d();
        if (C18141d3.hasBody(responseM79879d) && m79865b(cVar)) {
            InterfaceC18373u3 interfaceC18373u3Put = this.f56577a.put(cVar);
            String str = Headers.m77737of(responseM79879d.getHeaders()).get("Content-Length");
            if (interfaceC18373u3Put != null && C18100a4.stringToLong(str, -1L) <= C18163eb.f54662y) {
                C18399w3 c18399w3 = new C18399w3(responseM79879d.isSuccessful() ? responseM79879d.getBody() : responseM79879d.getErrorBody(), interfaceC18373u3Put);
                ResponseBody body = responseM79879d.getBody();
                C18295o3 c18295o3Build = new C18295o3.b().contentLength(body.getContentLength()).contentType(body.getContentType()).charSet(body.charSet).inputStream(c18399w3).build();
                Logger.m76963i(f56566b, "The response has been cached to the file");
                return new C18141d3.b().url(responseM79879d.getUrl()).code(responseM79879d.getCode()).headers(responseM79879d.getHeaders()).message(responseM79879d.getMessage()).body(new C18321q3.g(c18295o3Build)).build();
            }
        }
        Logger.m76963i(f56566b, "The response isn't cached to the file");
        return responseM79879d;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79866b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: a */
    private boolean m79861a() {
        UserManager userManager = (UserManager) ContextHolder.getAppContext().getSystemService("user");
        if (userManager != null) {
            return userManager.isUserUnlocked();
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79862a(Request request) {
        return (request.getHeaders().get("If-Modified-Since") == null && request.getHeaders().get("If-None-Match") == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m79863a(ResponseBody responseBody) {
        InputStream inputStream;
        if (responseBody == null || (inputStream = responseBody.getInputStream()) == null) {
            return false;
        }
        return ((C18438z3) inputStream).isDecryptable();
    }

    /* JADX INFO: renamed from: a */
    private boolean m79864a(String str) {
        try {
            ClassLoader classLoader = C18412x3.class.getClassLoader();
            if (classLoader == null) {
                throw new ClassNotFoundException("not found classloader");
            }
            classLoader.loadClass(str);
            return true;
        } catch (Exception unused) {
            Logger.m76967w(f56566b, str + " ClassNotFoundException");
            return false;
        }
    }
}
