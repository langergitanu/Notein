package com.huawei.hms.network.embedded;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.embedded.C18126c2;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18224j2 {

    /* JADX INFO: renamed from: a */
    public static final String f55302a = "CacheManager";

    /* JADX INFO: renamed from: c */
    public static final int f55304c = 300000;

    /* JADX INFO: renamed from: b */
    public static final C18266m2<C18385v2> f55303b = new C18266m2<>();

    /* JADX INFO: renamed from: d */
    public static long f55305d = 0;

    /* JADX INFO: renamed from: a */
    public static C18385v2 m78840a(String str) {
        C18385v2 c18385v2M79114b = f55303b.m79114b(str);
        if (c18385v2M79114b == null) {
            return null;
        }
        Logger.m76965v(f55302a, "Memory Cache host:" + str);
        c18385v2M79114b.m79674a(1);
        int iM79688f = c18385v2M79114b.m79688f();
        if (iM79688f != 0) {
            if (iM79688f != 1) {
                m78847c(str);
                return null;
            }
            C18307p2.m79339a(str, C18126c2.h.f54408c, C18126c2.m78048j().m78079h() ? 3 : 2);
        }
        return c18385v2M79114b;
    }

    /* JADX INFO: renamed from: b */
    public static C18385v2 m78844b(String str) {
        return C18252l2.m79027b(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m78846c() {
        Logger.m76965v(f55302a, "enter loadFileCacheToMemeory");
        for (Map.Entry<String, C18385v2> entry : C18252l2.m79030s().entrySet()) {
            Logger.m76966v(f55302a, "Load a record from File, host:%s, value:%s", entry.getKey(), entry.getValue());
            f55303b.m79113a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m78848d() {
        Map<String, C18385v2> mapM78845b = m78845b();
        if (mapM78845b == null || mapM78845b.isEmpty()) {
            return;
        }
        Logger.m76966v(f55302a, "Totol Cache Num: %s", Integer.valueOf(mapM78845b.size()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f55305d < 300000 || !NetworkUtil.isForeground(ContextHolder.getAppContext())) {
            return;
        }
        Logger.m76965v(f55302a, "updateAllCache updateAll all");
        f55305d = jCurrentTimeMillis;
        ListIterator listIterator = new ArrayList(mapM78845b.entrySet()).listIterator(mapM78845b.size());
        int i = 0;
        while (listIterator.hasPrevious()) {
            String str = (String) ((Map.Entry) listIterator.previous()).getKey();
            if (i >= 5) {
                m78847c(str);
            } else if (C18126c2.m78048j().m78076f(str) != 1) {
                C18307p2.m79339a(str, "dns_network_change", 2);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78841a() {
        f55303b.m79111a();
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, C18385v2> m78845b() {
        return f55303b.m79115b();
    }

    /* JADX INFO: renamed from: c */
    public static void m78847c(String str) {
        if (!TextUtils.isEmpty(str) && f55303b.m79112a(str)) {
            C18252l2.m79029c(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78842a(NetworkInfo networkInfo) {
        int iM78413c = C18168f2.m78413c();
        if (iM78413c == 0) {
            m78841a();
            return;
        }
        if (iM78413c != 1) {
            if (iM78413c != 2) {
                Logger.m76967w(f55302a, "Unkown netowrk change strategy, used to update all cache, strategy:" + C18168f2.m78413c());
                m78848d();
                return;
            }
        } else if (networkInfo == null || NetworkUtil.getNetworkType(networkInfo) != 1) {
            return;
        }
        m78848d();
    }

    /* JADX INFO: renamed from: a */
    public static void m78843a(String str, C18385v2 c18385v2) {
        if (TextUtils.isEmpty(str) || C18196h2.m78675b(c18385v2)) {
            Logger.m76967w(f55302a, "saveValidIP: host or dnsResult is null");
            return;
        }
        C18266m2<C18385v2> c18266m2 = f55303b;
        C18385v2 c18385v2M79114b = c18266m2.m79114b(str);
        if (c18385v2.m79678a(c18385v2M79114b) || c18385v2M79114b.m79688f() != 0) {
            Logger.m76966v(f55302a, "saveValidIP，host: %s, value: %s", str, c18385v2);
            c18266m2.m79113a(str, c18385v2);
            C18252l2.m79028b(str, c18385v2);
        }
    }
}
