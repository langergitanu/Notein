package com.huawei.hms.hatool;

import android.text.TextUtils;
import o0O00o0O.C25845OooO00o;
import o0O00o0o.C25846OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.hatool.d0 */
/* JADX INFO: loaded from: classes8.dex */
public class C17977d0 {

    /* JADX INFO: renamed from: c */
    public static C17977d0 f53769c;

    /* JADX INFO: renamed from: a */
    public String f53770a;

    /* JADX INFO: renamed from: b */
    public String f53771b;

    /* JADX INFO: renamed from: f */
    public static C17977d0 m77273f() {
        if (f53769c == null) {
            m77274g();
        }
        return f53769c;
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m77274g() {
        if (f53769c == null) {
            f53769c = new C17977d0();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m77275a() {
        if (TextUtils.isEmpty(this.f53770a)) {
            this.f53770a = m77279c();
        }
        return this.f53770a;
    }

    /* JADX INFO: renamed from: b */
    public final String m77277b(String str) {
        return m77282e() ? C25845OooO00o.OooO0Oo("analytics_keystore", str) : C17976d.m77272b(str, m77281d());
    }

    /* JADX INFO: renamed from: c */
    public final String m77279c() {
        String strM77329a = C17986g0.m77329a(AbstractC17970b.m77230i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(strM77329a)) {
            return m77276a(strM77329a);
        }
        String strOooO0O0 = C25846OooO00o.OooO0O0(16);
        m77280c(m77277b(strOooO0O0));
        return strOooO0O0;
    }

    /* JADX INFO: renamed from: d */
    public final String m77281d() {
        if (TextUtils.isEmpty(this.f53771b)) {
            this.f53771b = new C17974c0().m77259a();
        }
        return this.f53771b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m77282e() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final String m77276a(String str) {
        String strOooO0O0 = m77282e() ? C25845OooO00o.OooO0O0("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(strOooO0O0)) {
            return strOooO0O0;
        }
        C18030y.m77586c("hmsSdk", "deCrypt work key first");
        String strM77270a = C17976d.m77270a(str, m77281d());
        if (!TextUtils.isEmpty(strM77270a)) {
            if (m77282e()) {
                m77280c(m77277b(strM77270a));
                C17974c0.m77258d();
            }
            return strM77270a;
        }
        String strOooO0O02 = C25846OooO00o.OooO0O0(16);
        m77280c(m77277b(strOooO0O02));
        if (m77282e()) {
            C17974c0.m77258d();
        }
        return strOooO0O02;
    }

    /* JADX INFO: renamed from: b */
    public void m77278b() {
        String strOooO0O0 = C25846OooO00o.OooO0O0(16);
        if (m77280c(m77277b(strOooO0O0))) {
            this.f53770a = strOooO0O0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m77280c(String str) {
        C18030y.m77586c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            C18030y.m77586c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        C17986g0.m77334b(AbstractC17970b.m77230i(), "Privacy_MY", "PrivacyData", str);
        C17986g0.m77333b(AbstractC17970b.m77230i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }
}
