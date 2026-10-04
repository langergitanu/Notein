package com.alipay.apmobilesecuritysdk.p006b;

import Oooo0oO.C21111o0ooOoO;
import o0000OoO.C24224OooO00o;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0176a {

    /* JADX INFO: renamed from: b */
    public static C0176a f129b = new C0176a();

    /* JADX INFO: renamed from: a */
    public int f130a = 0;

    /* JADX INFO: renamed from: a */
    public static C0176a m129a() {
        return f129b;
    }

    /* JADX INFO: renamed from: b */
    public final int m132b() {
        return this.f130a;
    }

    /* JADX INFO: renamed from: c */
    public final String m133c() {
        String str;
        if (C24224OooO00o.OooO0Oo(null)) {
            return null;
        }
        int i = this.f130a;
        if (i == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return m130a("http", str);
    }

    /* JADX INFO: renamed from: a */
    public static String m130a(String str, String str2) {
        return C21111o0ooOoO.OooO0Oo(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m131a(int i) {
        this.f130a = i;
    }
}
