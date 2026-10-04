package com.huawei.agconnect.remoteconfig.internal;

import com.huawei.agconnect.remoteconfig.AGConnectConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.d */
/* JADX INFO: loaded from: classes8.dex */
class C17682d {

    /* JADX INFO: renamed from: a */
    private C17679c f52284a;

    /* JADX INFO: renamed from: b */
    private C17679c f52285b;

    public C17682d(C17679c c17679c, C17679c c17679c2) {
        this.f52284a = c17679c;
        this.f52285b = c17679c2;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m75677a() {
        HashMap map = new HashMap();
        map.putAll(this.f52285b.m75671c());
        map.putAll(this.f52284a.m75671c());
        return map;
    }

    /* JADX INFO: renamed from: b */
    public double m75679b(String str) {
        C17679c c17679c;
        C17679c c17679c2 = this.f52284a;
        if (c17679c2 == null || !c17679c2.containKey(str)) {
            C17679c c17679c3 = this.f52285b;
            if (c17679c3 == null || !c17679c3.containKey(str)) {
                return 0.0d;
            }
            c17679c = this.f52285b;
        } else {
            c17679c = this.f52284a;
        }
        return c17679c.getValueAsDouble(str).doubleValue();
    }

    /* JADX INFO: renamed from: c */
    public long m75680c(String str) {
        C17679c c17679c;
        C17679c c17679c2 = this.f52284a;
        if (c17679c2 == null || !c17679c2.containKey(str)) {
            C17679c c17679c3 = this.f52285b;
            if (c17679c3 == null || !c17679c3.containKey(str)) {
                return 0L;
            }
            c17679c = this.f52285b;
        } else {
            c17679c = this.f52284a;
        }
        return c17679c.getValueAsLong(str).longValue();
    }

    /* JADX INFO: renamed from: d */
    public String m75681d(String str) {
        C17679c c17679c;
        C17679c c17679c2 = this.f52284a;
        if (c17679c2 == null || !c17679c2.containKey(str)) {
            C17679c c17679c3 = this.f52285b;
            if (c17679c3 == null || !c17679c3.containKey(str)) {
                return "";
            }
            c17679c = this.f52285b;
        } else {
            c17679c = this.f52284a;
        }
        return c17679c.getValueAsString(str);
    }

    /* JADX INFO: renamed from: e */
    public byte[] m75682e(String str) {
        C17679c c17679c;
        C17679c c17679c2 = this.f52284a;
        if (c17679c2 == null || !c17679c2.containKey(str)) {
            C17679c c17679c3 = this.f52285b;
            if (c17679c3 == null || !c17679c3.containKey(str)) {
                return AGConnectConfig.DEFAULT.BYTE_ARRAY_VALUE;
            }
            c17679c = this.f52285b;
        } else {
            c17679c = this.f52284a;
        }
        return c17679c.getValueAsByteArray(str);
    }

    /* JADX INFO: renamed from: a */
    public boolean m75678a(String str) {
        C17679c c17679c;
        C17679c c17679c2 = this.f52284a;
        if (c17679c2 == null || !c17679c2.containKey(str)) {
            C17679c c17679c3 = this.f52285b;
            if (c17679c3 == null || !c17679c3.containKey(str)) {
                return false;
            }
            c17679c = this.f52285b;
        } else {
            c17679c = this.f52284a;
        }
        return c17679c.getValueAsBoolean(str).booleanValue();
    }
}
