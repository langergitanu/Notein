package com.huawei.hms.hatool;

import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.hatool.c */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC17973c {
    /* JADX INFO: renamed from: a */
    public static void m77241a(String str, String str2, long j) {
        C17997k c17997kM77249h = m77249h(str, str2);
        if (c17997kM77249h != null) {
            c17997kM77249h.m77388a(j);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m77243b(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        if (c17997kM77249h != null) {
            return c17997kM77249h.m77400d();
        }
        return 7;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m77244c(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        if (c17997kM77249h != null) {
            return c17997kM77249h.m77409g();
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static String m77245d(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        return c17997kM77249h != null ? c17997kM77249h.m77406f() : "";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m77246e(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        if (c17997kM77249h != null) {
            return c17997kM77249h.m77411i();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static String m77247f(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        return c17997kM77249h != null ? c17997kM77249h.m77410h() : "";
    }

    /* JADX INFO: renamed from: g */
    public static String m77248g(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        return c17997kM77249h != null ? c17997kM77249h.m77416n() : "";
    }

    /* JADX INFO: renamed from: h */
    public static C17997k m77249h(String str, String str2) {
        C18003m c18003mM77355a = C17991i.m77353c().m77355a(str);
        if (c18003mM77355a == null) {
            return null;
        }
        if (!"alltype".equals(str2)) {
            return c18003mM77355a.m77464a(str2);
        }
        C17997k c17997kM77464a = c18003mM77355a.m77464a("oper");
        return c17997kM77464a == null ? c18003mM77355a.m77464a("maint") : c17997kM77464a;
    }

    /* JADX INFO: renamed from: i */
    public static Map<String, String> m77250i(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        if (c17997kM77249h != null) {
            return c17997kM77249h.m77413k();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static long m77251j(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        if (c17997kM77249h != null) {
            return c17997kM77249h.m77414l();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public static int m77252k(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        if (c17997kM77249h != null) {
            return c17997kM77249h.m77393b();
        }
        return 10;
    }

    /* JADX INFO: renamed from: l */
    public static String m77253l(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        return c17997kM77249h != null ? c17997kM77249h.m77417o() : "";
    }

    /* JADX INFO: renamed from: m */
    public static String m77254m(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        return c17997kM77249h != null ? c17997kM77249h.m77419q() : "";
    }

    /* JADX INFO: renamed from: n */
    public static String m77255n(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        return c17997kM77249h != null ? c17997kM77249h.m77415m() : "";
    }

    /* JADX INFO: renamed from: o */
    public static String m77256o(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        return c17997kM77249h != null ? c17997kM77249h.m77418p() : "";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77242a(String str, String str2) {
        C17997k c17997kM77249h = m77249h(str, str2);
        if (c17997kM77249h != null) {
            return c17997kM77249h.m77392a();
        }
        return true;
    }
}
