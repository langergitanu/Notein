package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/http/RequestLine;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RequestLine {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final RequestLine f124452OooO00o = new RequestLine();

    private RequestLine() {
    }

    public static String OooO00o(HttpUrl url) {
        OooOOO0.OooO0oO(url, "url");
        String strOooO0O0 = url.OooO0O0();
        String strOooO0Oo = url.OooO0Oo();
        if (strOooO0Oo == null) {
            return strOooO0O0;
        }
        return strOooO0O0 + '?' + ((Object) strOooO0Oo);
    }
}
