package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class HttpMethod {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HttpMethod f124439OooO00o = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean OooO00o(String method) {
        OooOOO0.OooO0oO(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }
}
