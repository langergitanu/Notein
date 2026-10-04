package com.huawei.hms.framework.network.grs.p582h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.h.d */
/* JADX INFO: loaded from: classes7.dex */
public class C17958d {

    /* JADX INFO: renamed from: a */
    private static final Map<String, a> f53751a = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.h.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final long f53752a;

        /* JADX INFO: renamed from: b */
        private final long f53753b;

        public a(long j, long j2) {
            this.f53752a = j;
            this.f53753b = j2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m77158a() {
            return SystemClock.elapsedRealtime() - this.f53753b <= this.f53752a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m77156a(String str) {
        StringBuilder sb = new StringBuilder("map size of get is before:");
        Map<String, a> map = f53751a;
        sb.append(map.size());
        Logger.m76965v("RequestUtil", sb.toString());
        a aVar = map.get(str);
        Logger.m76965v("RequestUtil", "map size of get is after:" + map.size());
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m77157a(String str, a aVar) {
        StringBuilder sb = new StringBuilder("map size of put is before:");
        Map<String, a> map = f53751a;
        sb.append(map.size());
        Logger.m76965v("RequestUtil", sb.toString());
        map.put(str, aVar);
        Logger.m76965v("RequestUtil", "map size of put is after:" + map.size());
    }
}
