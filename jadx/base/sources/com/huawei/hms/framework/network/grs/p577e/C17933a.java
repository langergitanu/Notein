package com.huawei.hms.framework.network.grs.p577e;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.C17929a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p579g.C17944d;
import com.huawei.hms.framework.network.grs.p579g.C17948h;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17953c;
import com.huawei.hms.framework.network.grs.p582h.C17959e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.e.a */
/* JADX INFO: loaded from: classes7.dex */
public class C17933a {

    /* JADX INFO: renamed from: f */
    private static final String f53649f = "a";

    /* JADX INFO: renamed from: a */
    private final Map<String, Map<String, Map<String, String>>> f53650a = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b */
    private final Map<String, Long> f53651b = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c */
    private final C17935c f53652c;

    /* JADX INFO: renamed from: d */
    private final C17935c f53653d;

    /* JADX INFO: renamed from: e */
    private final C17948h f53654e;

    public C17933a(C17935c c17935c, C17935c c17935c2, C17948h c17948h) {
        this.f53653d = c17935c2;
        this.f53652c = c17935c;
        this.f53654e = c17948h;
        c17948h.m77124a(this);
    }

    /* JADX INFO: renamed from: a */
    public C17935c m77010a() {
        return this.f53652c;
    }

    /* JADX INFO: renamed from: b */
    public C17948h m77014b() {
        return this.f53654e;
    }

    /* JADX INFO: renamed from: c */
    public C17935c m77016c() {
        return this.f53653d;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m77011a(GrsBaseInfo grsBaseInfo, String str, C17934b c17934b, Context context) {
        Map<String, Map<String, String>> map = this.f53650a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        m77008a(grsBaseInfo, c17934b, context, str);
        return map.get(str);
    }

    /* JADX INFO: renamed from: b */
    public void m77015b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String strM77020a = this.f53652c.m77020a(grsParasKey, "");
        String strM77020a2 = this.f53652c.m77020a(grsParasKey + "time", "0");
        long j = 0;
        if (!TextUtils.isEmpty(strM77020a2) && strM77020a2.matches("\\d+")) {
            try {
                j = Long.parseLong(strM77020a2);
            } catch (NumberFormatException e) {
                Logger.m76968w(f53649f, "convert urlParamKey from String to Long catch NumberFormatException.", e);
            }
        }
        this.f53650a.put(grsParasKey, C17929a.m76972a(strM77020a));
        this.f53651b.put(grsParasKey, Long.valueOf(j));
        m77009a(grsBaseInfo, grsParasKey, context);
    }

    /* JADX INFO: renamed from: a */
    public void m77012a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f53652c.m77024b(grsParasKey + "time", "0");
        this.f53651b.remove(grsParasKey + "time");
        this.f53650a.remove(grsParasKey);
        this.f53654e.m77126a(grsParasKey);
    }

    /* JADX INFO: renamed from: a */
    private void m77008a(GrsBaseInfo grsBaseInfo, C17934b c17934b, Context context, String str) {
        Long l = this.f53651b.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (C17959e.m77159a(l)) {
            c17934b.m77017a(2);
            return;
        }
        if (C17959e.m77160a(l, 300000L)) {
            this.f53654e.m77125a(new C17953c(grsBaseInfo, context), null, str, this.f53653d);
        }
        c17934b.m77017a(1);
    }

    /* JADX INFO: renamed from: a */
    public void m77013a(GrsBaseInfo grsBaseInfo, C17944d c17944d, Context context, C17953c c17953c) {
        if (c17944d.m77106f() == 2) {
            Logger.m76967w(f53649f, "update cache from server failed");
            return;
        }
        if (c17953c.m77138d().size() != 0) {
            this.f53652c.m77024b("geoipCountryCode", c17944d.m77110j());
            this.f53652c.m77024b("geoipCountryCodetime", c17944d.m77096a());
            return;
        }
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        if (c17944d.m77113m()) {
            this.f53650a.put(grsParasKey, C17929a.m76972a(this.f53652c.m77020a(grsParasKey, "")));
        } else {
            this.f53652c.m77024b(grsParasKey, c17944d.m77110j());
            this.f53650a.put(grsParasKey, C17929a.m76972a(c17944d.m77110j()));
        }
        if (!TextUtils.isEmpty(c17944d.m77105e())) {
            this.f53652c.m77024b(C21111o0ooOoO.OooO0Oo(grsParasKey, "ETag"), c17944d.m77105e());
        }
        this.f53652c.m77024b(C21111o0ooOoO.OooO0Oo(grsParasKey, "time"), c17944d.m77096a());
        this.f53651b.put(grsParasKey, Long.valueOf(Long.parseLong(c17944d.m77096a())));
    }

    /* JADX INFO: renamed from: a */
    private void m77009a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (C17959e.m77160a(this.f53651b.get(str), 300000L)) {
            this.f53654e.m77125a(new C17953c(grsBaseInfo, context), null, null, this.f53653d);
        }
    }
}
