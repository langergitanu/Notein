package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.hatool.e0 */
/* JADX INFO: loaded from: classes8.dex */
public final class C17980e0 {

    /* JADX INFO: renamed from: b */
    public static C17980e0 f53773b;

    /* JADX INFO: renamed from: a */
    public volatile Map<String, C17983f0> f53774a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static C17980e0 m77292a() {
        if (f53773b == null) {
            m77293b();
        }
        return f53773b;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m77293b() {
        if (f53773b == null) {
            f53773b = new C17980e0();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C17983f0 m77294a(String str) {
        if (!this.f53774a.containsKey(str)) {
            this.f53774a.put(str, new C17983f0());
        }
        return this.f53774a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public C17983f0 m77295a(String str, long j) {
        C17983f0 c17983f0M77294a = m77294a(str);
        c17983f0M77294a.m77317a(j);
        return c17983f0M77294a;
    }
}
