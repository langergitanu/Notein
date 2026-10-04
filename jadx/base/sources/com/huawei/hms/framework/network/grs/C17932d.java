package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.d */
/* JADX INFO: loaded from: classes7.dex */
public class C17932d {

    /* JADX INFO: renamed from: a */
    private static final Map<String, C17931c> f53647a = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b */
    private static final Object f53648b = new Object();

    /* JADX INFO: renamed from: a */
    public static C17931c m77007a(GrsBaseInfo grsBaseInfo, Context context) {
        C17931c c17931c;
        synchronized (f53648b) {
            try {
                int iUniqueCode = grsBaseInfo.uniqueCode();
                Map<String, C17931c> map = f53647a;
                c17931c = map.get(context.getPackageName() + iUniqueCode);
                if (c17931c == null) {
                    c17931c = new C17931c(context, grsBaseInfo);
                    map.put(context.getPackageName() + iUniqueCode, c17931c);
                } else if (!c17931c.m77005a((Object) new C17931c(grsBaseInfo))) {
                    c17931c = new C17931c(context, grsBaseInfo);
                    map.put(context.getPackageName() + iUniqueCode, c17931c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17931c;
    }
}
