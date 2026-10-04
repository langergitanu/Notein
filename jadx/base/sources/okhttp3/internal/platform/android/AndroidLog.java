package okhttp3.internal.platform.android;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.Metadata;
import oOo000Oo.C34444Oooo0O0;
import okhttp3.OkHttpClient;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class AndroidLog {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AndroidLog f124690OooO00o = new AndroidLog();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f124691OooO0O0 = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<String, String> f124692OooO0OO;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        String name = r2 == null ? null : r2.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f124692OooO0OO = C34444Oooo0O0.OooOOO0(linkedHashMap);
    }

    private AndroidLog() {
    }
}
