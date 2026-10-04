package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.huawei.hms.hatool.l1 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC18002l1 {

    /* JADX INFO: renamed from: a */
    public static C17996j1 f53870a;

    /* JADX INFO: renamed from: a */
    public static synchronized C17996j1 m77458a() {
        try {
            if (f53870a == null) {
                f53870a = C18011o1.m77489c().m77492b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f53870a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m77461b() {
        return C18011o1.m77489c().m77491a();
    }

    /* JADX INFO: renamed from: c */
    public static void m77462c() {
        if (m77458a() == null || !C18027w0.m77566b().m77567a()) {
            return;
        }
        f53870a.m77380a(-1);
    }

    /* JADX INFO: renamed from: a */
    public static void m77459a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m77458a() == null || !C18027w0.m77566b().m77567a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f53870a.m77381a(i, str, linkedHashMap);
            return;
        }
        C18030y.m77588d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m77460a(Context context, String str, String str2) {
        if (m77458a() != null) {
            f53870a.m77382a(context, str, str2);
        }
    }
}
