package com.huawei.hms.hatool;

/* JADX INFO: renamed from: com.huawei.hms.hatool.y */
/* JADX INFO: loaded from: classes8.dex */
public class C18030y {

    /* JADX INFO: renamed from: a */
    public static C18032z f53939a = new C18032z();

    /* JADX INFO: renamed from: a */
    public static void m77579a(int i) {
        f53939a.m77593a(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m77583b(String str, String str2) {
        if (!m77585b() || str == null || str2 == null) {
            return;
        }
        f53939a.m77595b(6, str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m77586c(String str, String str2) {
        if (!m77587c() || str == null || str2 == null) {
            return;
        }
        f53939a.m77595b(4, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m77588d(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f53939a.m77595b(4, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m77590e(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f53939a.m77595b(5, str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m77591f(String str, String str2) {
        if (!m77589d() || str == null || str2 == null) {
            return;
        }
        f53939a.m77595b(5, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m77580a(String str, String str2) {
        if (!m77582a() || str == null || str2 == null) {
            return;
        }
        f53939a.m77595b(3, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m77584b(String str, String str2, Object... objArr) {
        m77588d(str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m77587c() {
        return f53939a.m77596b(4);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m77589d() {
        return f53939a.m77596b(5);
    }

    /* JADX INFO: renamed from: a */
    public static void m77581a(String str, String str2, Object... objArr) {
        if (!m77587c() || str == null || str2 == null) {
            return;
        }
        f53939a.m77595b(4, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m77585b() {
        return f53939a.m77596b(6);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77582a() {
        return f53939a.m77596b(3);
    }
}
