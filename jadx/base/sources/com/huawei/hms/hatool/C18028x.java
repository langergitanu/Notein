package com.huawei.hms.hatool;

import o0O00o0o.C25846OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.hatool.x */
/* JADX INFO: loaded from: classes8.dex */
public class C18028x {

    /* JADX INFO: renamed from: b */
    public static C18028x f53931b = new C18028x();

    /* JADX INFO: renamed from: a */
    public a f53932a = new a();

    /* JADX INFO: renamed from: com.huawei.hms.hatool.x$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public String f53933a;

        /* JADX INFO: renamed from: b */
        public String f53934b;

        /* JADX INFO: renamed from: c */
        public long f53935c = 0;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m77574a(long j) {
            C18028x.this.f53932a.f53935c = j;
        }

        /* JADX INFO: renamed from: b */
        public void m77576b(String str) {
            C18028x.this.f53932a.f53933a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m77575a(String str) {
            C18028x.this.f53932a.f53934b = str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C18028x m77569d() {
        return f53931b;
    }

    /* JADX INFO: renamed from: b */
    public long m77572b() {
        return this.f53932a.f53935c;
    }

    /* JADX INFO: renamed from: c */
    public String m77573c() {
        return this.f53932a.f53933a;
    }

    /* JADX INFO: renamed from: a */
    public String m77570a() {
        return this.f53932a.f53934b;
    }

    /* JADX INFO: renamed from: a */
    public void m77571a(String str, String str2) {
        long jM77572b = m77572b();
        String strM77522b = C18017r0.m77522b(str, str2);
        if (strM77522b == null || strM77522b.isEmpty()) {
            C18030y.m77590e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (jM77572b == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strOooO0O0 = C25846OooO00o.OooO0O0(16);
            String strM77288a = C17979e.m77288a(strM77522b, strOooO0O0);
            this.f53932a.m77574a(jCurrentTimeMillis);
            this.f53932a.m77576b(strOooO0O0);
            this.f53932a.m77575a(strM77288a);
            return;
        }
        if (System.currentTimeMillis() - jM77572b > 43200000) {
            String strOooO0O02 = C25846OooO00o.OooO0O0(16);
            String strM77288a2 = C17979e.m77288a(strM77522b, strOooO0O02);
            this.f53932a.m77574a(jM77572b);
            this.f53932a.m77576b(strOooO0O02);
            this.f53932a.m77575a(strM77288a2);
        }
    }
}
