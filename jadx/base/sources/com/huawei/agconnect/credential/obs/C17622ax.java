package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ax */
/* JADX INFO: loaded from: classes8.dex */
public final class C17622ax {

    /* JADX INFO: renamed from: a */
    private static final Map<String, C17621aw> f52147a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static synchronized InterfaceC17620av m75514a(Context context, C17623ay c17623ay) {
        String str;
        String str2;
        try {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                str = "HAInstanceManager";
                str2 = "init must be called in the main thread";
            } else if (context == null) {
                str = "HAInstanceManager";
                str2 = "context cannot be null to init HiAnalyticsInstanceEx.";
            } else if (TextUtils.isEmpty(c17623ay.f52148a) || c17623ay.f52148a.length() > 256) {
                str = "HAInstanceManager";
                str2 = "serviceTag check failed";
            } else {
                if (!TextUtils.isEmpty(c17623ay.f52149b) && c17623ay.f52149b.length() <= 256) {
                    Map<String, C17621aw> map = f52147a;
                    C17621aw c17621aw = map.get(c17623ay.f52148a);
                    if (c17621aw == null) {
                        C17621aw c17621aw2 = new C17621aw(context, c17623ay);
                        map.put(c17623ay.f52148a, c17621aw2);
                        return c17621aw2;
                    }
                    if (c17623ay.f52150c.equals(c17621aw.f52143a.f52150c)) {
                        return c17621aw;
                    }
                    c17621aw.m75513a(context, c17623ay);
                    return c17621aw;
                }
                str = "HAInstanceManager";
                str2 = "httpheader check failed";
            }
            Log.e(str, str2);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
