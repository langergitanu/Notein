package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.hatool.i */
/* JADX INFO: loaded from: classes8.dex */
public final class C17991i {

    /* JADX INFO: renamed from: b */
    public static Map<String, C18003m> f53797b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static C17991i f53798c;

    /* JADX INFO: renamed from: a */
    public C18000l f53799a = new C18000l();

    /* JADX INFO: renamed from: c */
    public static C17991i m77353c() {
        if (f53798c == null) {
            m77354d();
        }
        return f53798c;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m77354d() {
        if (f53798c == null) {
            f53798c = new C17991i();
        }
    }

    /* JADX INFO: renamed from: a */
    public C18003m m77355a(String str) {
        return f53797b.get(str);
    }

    /* JADX INFO: renamed from: b */
    public C18000l m77358b() {
        return this.f53799a;
    }

    /* JADX INFO: renamed from: a */
    public Set<String> m77356a() {
        return f53797b.keySet();
    }

    /* JADX INFO: renamed from: a */
    public void m77357a(String str, C18003m c18003m) {
        f53797b.put(str, c18003m);
    }
}
