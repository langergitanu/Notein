package com.alipay.apmobilesecuritysdk.p009e;

import android.content.Context;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.HashMap;
import java.util.Map;
import o0000OoO.C24224OooO00o;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0193i {

    /* JADX INFO: renamed from: a */
    public static String f147a = "";

    /* JADX INFO: renamed from: b */
    public static String f148b = "";

    /* JADX INFO: renamed from: c */
    public static String f149c = "";

    /* JADX INFO: renamed from: d */
    public static String f150d = "";

    /* JADX INFO: renamed from: e */
    public static String f151e = "";

    /* JADX INFO: renamed from: f */
    public static Map<String, String> f152f = new HashMap();

    /* JADX INFO: renamed from: a */
    public static synchronized String m196a(String str) {
        String str2 = "apdidTokenCache" + str;
        if (f152f.containsKey(str2)) {
            String str3 = f152f.get(str2);
            if (C24224OooO00o.OooO0Oo(str3)) {
                return str3;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m202b() {
        return f147a;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized String m204c() {
        return f148b;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m206d() {
        return f150d;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized String m208e() {
        return f151e;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized String m210f() {
        return f149c;
    }

    /* JADX INFO: renamed from: g */
    public static synchronized C0187c m212g() {
        return new C0187c(f147a, f148b, f149c, f150d, f151e);
    }

    /* JADX INFO: renamed from: h */
    public static void m213h() {
        f152f.clear();
        f147a = "";
        f148b = "";
        f150d = "";
        f151e = "";
        f149c = "";
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m197a() {
    }

    /* JADX INFO: renamed from: b */
    public static void m203b(String str) {
        f147a = str;
    }

    /* JADX INFO: renamed from: c */
    public static void m205c(String str) {
        f148b = str;
    }

    /* JADX INFO: renamed from: d */
    public static void m207d(String str) {
        f149c = str;
    }

    /* JADX INFO: renamed from: e */
    public static void m209e(String str) {
        f150d = str;
    }

    /* JADX INFO: renamed from: f */
    public static void m211f(String str) {
        f151e = str;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m198a(C0186b c0186b) {
        if (c0186b != null) {
            f147a = c0186b.f133a;
            f148b = c0186b.f134b;
            f149c = c0186b.f135c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m199a(C0187c c0187c) {
        if (c0187c != null) {
            f147a = c0187c.f136a;
            f148b = c0187c.f137b;
            f150d = c0187c.f139d;
            f151e = c0187c.f140e;
            f149c = c0187c.f138c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m200a(String str, String str2) {
        try {
            String str3 = "apdidTokenCache" + str;
            if (f152f.containsKey(str3)) {
                f152f.remove(str3);
            }
            f152f.put(str3, str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m201a(Context context, String str) {
        long jM179a;
        try {
            jM179a = C0192h.m179a(context);
        } catch (Throwable unused) {
        }
        if (jM179a < 0) {
            jM179a = C18385v2.f56338j;
        }
        try {
            if (Math.abs(System.currentTimeMillis() - C0192h.m195h(context, str)) < jM179a) {
                return true;
            }
        } finally {
        }
        return false;
    }
}
