package okhttp3.logging;

import OooOoo.C20593OooO0Oo;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.words.ControlChar;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34533OooOOO0;
import oOo00OoO.InterfaceC34525OooO0o;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
public final class HttpLoggingInterceptor implements Interceptor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f124789OooO0Oo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C22218Oooo f124790OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Set<String> f124791OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile Level f124792OooO0OO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Level {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final Level f124793OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final Level f124794OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ Level[] f124795OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final Level f124796OooOoO0;

        static {
            Level level = new Level("NONE", 0);
            f124794OooOo0o = level;
            Level level2 = new Level("BASIC", 1);
            Level level3 = new Level("HEADERS", 2);
            f124793OooOo = level3;
            Level level4 = new Level("BODY", 3);
            f124796OooOoO0 = level4;
            f124795OooOoO = new Level[]{level, level2, level3, level4};
        }

        public Level() {
            throw null;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f124795OooOoO.clone();
        }
    }

    public interface Logger {

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public static final C22218Oooo f124797OooOo0O = new C22218Oooo();

        static void OooO00o(String str) {
            Platform.f124683OooO00o.getClass();
            Platform.f124684OooO0O0.log(4, str, null);
        }
    }

    public HttpLoggingInterceptor() {
        C22218Oooo c22218Oooo = Logger.f124797OooOo0O;
        this.f124791OooO0O0 = Collections.EMPTY_SET;
        this.f124792OooO0OO = Level.f124794OooOo0o;
        this.f124790OooO00o = c22218Oooo;
    }

    public static boolean OooO00o(C34524OooO0Oo c34524OooO0Oo) {
        C34524OooO0Oo c34524OooO0Oo2;
        int i;
        try {
            c34524OooO0Oo2 = new C34524OooO0Oo();
            long j = c34524OooO0Oo.f123723OooOo;
            c34524OooO0Oo.OooOOoo(c34524OooO0Oo2, 0L, j < 64 ? j : 64L);
        } catch (EOFException unused) {
        }
        for (i = 0; i < 16; i++) {
            if (c34524OooO0Oo2.o0000o0O()) {
                return true;
            }
            int iO00000oO = c34524OooO0Oo2.o00000oO();
            if (Character.isISOControl(iO00000oO) && !Character.isWhitespace(iO00000oO)) {
                return false;
            }
        }
        return true;
    }

    public final void OooO0O0(Headers headers, int i) {
        String strOooO0oO = this.f124791OooO0O0.contains(headers.OooO0Oo(i)) ? "██" : headers.OooO0oO(i);
        C22218Oooo c22218Oooo = this.f124790OooO00o;
        String str = headers.OooO0Oo(i) + ": " + strOooO0oO;
        c22218Oooo.getClass();
        Logger.OooO00o(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e6  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        String string;
        boolean z;
        boolean z2;
        ResponseBody responseBody;
        long j;
        String string2;
        Long lValueOf;
        boolean z3;
        int size;
        int i;
        Level level = this.f124792OooO0OO;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f124446OooO0o0;
        if (level == Level.f124794OooOo0o) {
            return realInterceptorChain.OooO00o(request);
        }
        boolean z4 = level == Level.f124796OooOoO0;
        boolean z5 = z4 || level == Level.f124793OooOo;
        RequestBody requestBody = request.f124241OooO0Oo;
        boolean z6 = requestBody != null;
        Exchange exchange = realInterceptorChain.f124444OooO0Oo;
        RealConnection realConnection = exchange == null ? null : exchange.f124352OooO0oO;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(request.f124239OooO0O0);
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(request.f124238OooO00o);
        if (realConnection != null) {
            StringBuilder sb2 = new StringBuilder(" ");
            Protocol protocol = realConnection.f124401OooO0o;
            OooOOO0.OooO0Oo(protocol);
            sb2.append(protocol);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        String string3 = sb.toString();
        if (!z5 && z6) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(string3, " (");
            sbOooO0OO.append(requestBody.contentLength());
            sbOooO0OO.append("-byte body)");
            string3 = sbOooO0OO.toString();
        }
        this.f124790OooO00o.getClass();
        Logger.OooO00o(string3);
        if (z5) {
            if (z6) {
                if (requestBody.getF124249OooO00o() != null) {
                    C22218Oooo c22218Oooo = this.f124790OooO00o;
                    z = z5;
                    String str = "Content-Type: " + requestBody.getF124249OooO00o();
                    c22218Oooo.getClass();
                    Logger.OooO00o(str);
                } else {
                    z = z5;
                }
                if (requestBody.contentLength() != -1) {
                    C22218Oooo c22218Oooo2 = this.f124790OooO00o;
                    StringBuilder sb3 = new StringBuilder("Content-Length: ");
                    z2 = z4;
                    z3 = z6;
                    sb3.append(requestBody.contentLength());
                    String string4 = sb3.toString();
                    c22218Oooo2.getClass();
                    Logger.OooO00o(string4);
                }
                Headers headers = request.f124240OooO0OO;
                size = headers.size();
                i = 0;
                while (i < size) {
                    String strOooO0Oo = headers.OooO0Oo(i);
                    int i2 = size;
                    if (!"Content-Type".equalsIgnoreCase(strOooO0Oo) && !"Content-Length".equalsIgnoreCase(strOooO0Oo)) {
                        OooO0O0(headers, i);
                    }
                    i++;
                    size = i2;
                }
                if (z2 || !z3) {
                    C22218Oooo c22218Oooo3 = this.f124790OooO00o;
                    String str2 = "--> END " + request.f124239OooO0O0;
                    c22218Oooo3.getClass();
                    Logger.OooO00o(str2);
                } else {
                    String strOooO0O0 = request.f124240OooO0OO.OooO0O0("Content-Encoding");
                    if (strOooO0O0 != null && !strOooO0O0.equalsIgnoreCase("identity") && !strOooO0O0.equalsIgnoreCase("gzip")) {
                        C22218Oooo c22218Oooo4 = this.f124790OooO00o;
                        String str3 = "--> END " + request.f124239OooO0O0 + " (encoded body omitted)";
                        c22218Oooo4.getClass();
                        Logger.OooO00o(str3);
                    } else if (requestBody.isDuplex()) {
                        C22218Oooo c22218Oooo5 = this.f124790OooO00o;
                        String str4 = "--> END " + request.f124239OooO0O0 + " (duplex request body omitted)";
                        c22218Oooo5.getClass();
                        Logger.OooO00o(str4);
                    } else {
                        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                        requestBody.writeTo(c34524OooO0Oo);
                        Charset charsetOooO00o = f124789OooO0Oo;
                        MediaType mediaTypeContentType = requestBody.getF124249OooO00o();
                        if (mediaTypeContentType != null) {
                            charsetOooO00o = mediaTypeContentType.OooO00o(charsetOooO00o);
                        }
                        this.f124790OooO00o.getClass();
                        Logger.OooO00o("");
                        if (OooO00o(c34524OooO0Oo)) {
                            C22218Oooo c22218Oooo6 = this.f124790OooO00o;
                            String strOooooOo = c34524OooO0Oo.OooooOo(charsetOooO00o);
                            c22218Oooo6.getClass();
                            Logger.OooO00o(strOooooOo);
                            C22218Oooo c22218Oooo7 = this.f124790OooO00o;
                            String str5 = "--> END " + request.f124239OooO0O0 + " (" + requestBody.contentLength() + "-byte body)";
                            c22218Oooo7.getClass();
                            Logger.OooO00o(str5);
                        } else {
                            C22218Oooo c22218Oooo8 = this.f124790OooO00o;
                            String str6 = "--> END " + request.f124239OooO0O0 + " (binary " + requestBody.contentLength() + "-byte body omitted)";
                            c22218Oooo8.getClass();
                            Logger.OooO00o(str6);
                        }
                    }
                }
            } else {
                z = z5;
            }
            z2 = z4;
            z3 = z6;
            Headers headers2 = request.f124240OooO0OO;
            size = headers2.size();
            i = 0;
            while (i < size) {
            }
            if (z2) {
                C22218Oooo c22218Oooo32 = this.f124790OooO00o;
                String str22 = "--> END " + request.f124239OooO0O0;
                c22218Oooo32.getClass();
                Logger.OooO00o(str22);
            }
        } else {
            z = z5;
            z2 = z4;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseOooO00o = ((RealInterceptorChain) chain).OooO00o(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBody2 = responseOooO00o.f124262OooOoo;
            long jContentLength = responseBody2.getF124449OooOo();
            if (jContentLength != -1) {
                responseBody = responseBody2;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(jContentLength);
                j = jContentLength;
                sb4.append("-byte");
                string2 = sb4.toString();
            } else {
                responseBody = responseBody2;
                j = jContentLength;
                string2 = "unknown-length";
            }
            C22218Oooo c22218Oooo9 = this.f124790OooO00o;
            StringBuilder sb5 = new StringBuilder("<-- ");
            sb5.append(responseOooO00o.f124259OooOoO);
            sb5.append(responseOooO00o.f124260OooOoO0.isEmpty() ? "" : " " + responseOooO00o.f124260OooOoO0);
            sb5.append(ControlChar.SPACE_CHAR);
            sb5.append(responseOooO00o.f124258OooOo0o.f124238OooO00o);
            sb5.append(" (");
            sb5.append(millis);
            sb5.append(TranslateLanguage.MALAY);
            sb5.append(!z ? C20593OooO0Oo.OooO0O0(", ", string2, " body") : "");
            sb5.append(')');
            String string5 = sb5.toString();
            c22218Oooo9.getClass();
            Logger.OooO00o(string5);
            if (z) {
                Headers headers3 = responseOooO00o.f124263OooOoo0;
                int size2 = headers3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    OooO0O0(headers3, i3);
                }
                if (z2 && HttpHeaders.OooO00o(responseOooO00o)) {
                    String strOooO0O02 = responseOooO00o.f124263OooOoo0.OooO0O0("Content-Encoding");
                    if (strOooO0O02 != null && !strOooO0O02.equalsIgnoreCase("identity") && !strOooO0O02.equalsIgnoreCase("gzip")) {
                        this.f124790OooO00o.getClass();
                        Logger.OooO00o("<-- END HTTP (encoded body omitted)");
                        return responseOooO00o;
                    }
                    InterfaceC34525OooO0o interfaceC34525OooO0oSource = responseBody.getF124289OooOoO0();
                    interfaceC34525OooO0oSource.request(LocationRequestCompat.PASSIVE_INTERVAL);
                    C34524OooO0Oo c34524OooO0OoOooOO0O = interfaceC34525OooO0oSource.OooOO0O();
                    if ("gzip".equalsIgnoreCase(headers3.OooO0O0("Content-Encoding"))) {
                        lValueOf = Long.valueOf(c34524OooO0OoOooOO0O.f123723OooOo);
                        C34533OooOOO0 c34533OooOOO0 = new C34533OooOOO0(c34524OooO0OoOooOO0O.clone());
                        try {
                            c34524OooO0OoOooOO0O = new C34524OooO0Oo();
                            c34524OooO0OoOooOO0O.o0000O00(c34533OooOOO0);
                            c34533OooOOO0.close();
                        } finally {
                        }
                    } else {
                        lValueOf = null;
                    }
                    Charset charsetOooO00o2 = f124789OooO0Oo;
                    MediaType mediaTypeContentType2 = responseBody.getF124288OooOo0o();
                    if (mediaTypeContentType2 != null) {
                        charsetOooO00o2 = mediaTypeContentType2.OooO00o(charsetOooO00o2);
                    }
                    if (!OooO00o(c34524OooO0OoOooOO0O)) {
                        this.f124790OooO00o.getClass();
                        Logger.OooO00o("");
                        C22218Oooo c22218Oooo10 = this.f124790OooO00o;
                        String str7 = "<-- END HTTP (binary " + c34524OooO0OoOooOO0O.f123723OooOo + "-byte body omitted)";
                        c22218Oooo10.getClass();
                        Logger.OooO00o(str7);
                        return responseOooO00o;
                    }
                    if (j != 0) {
                        this.f124790OooO00o.getClass();
                        Logger.OooO00o("");
                        C22218Oooo c22218Oooo11 = this.f124790OooO00o;
                        String strOooooOo2 = c34524OooO0OoOooOO0O.clone().OooooOo(charsetOooO00o2);
                        c22218Oooo11.getClass();
                        Logger.OooO00o(strOooooOo2);
                    }
                    if (lValueOf == null) {
                        C22218Oooo c22218Oooo12 = this.f124790OooO00o;
                        String str8 = "<-- END HTTP (" + c34524OooO0OoOooOO0O.f123723OooOo + "-byte body)";
                        c22218Oooo12.getClass();
                        Logger.OooO00o(str8);
                        return responseOooO00o;
                    }
                    C22218Oooo c22218Oooo13 = this.f124790OooO00o;
                    String str9 = "<-- END HTTP (" + c34524OooO0OoOooOO0O.f123723OooOo + "-byte, " + lValueOf + "-gzipped-byte body)";
                    c22218Oooo13.getClass();
                    Logger.OooO00o(str9);
                    return responseOooO00o;
                }
                this.f124790OooO00o.getClass();
                Logger.OooO00o("<-- END HTTP");
            }
            return responseOooO00o;
        } catch (Exception e) {
            this.f124790OooO00o.getClass();
            Logger.OooO00o("<-- HTTP FAILED: " + e);
            throw e;
        }
    }
}
