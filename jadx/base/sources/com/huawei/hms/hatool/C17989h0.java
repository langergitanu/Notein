package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.h0 */
/* JADX INFO: loaded from: classes8.dex */
public class C17989h0 {

    /* JADX INFO: renamed from: b */
    public static C17989h0 f53792b;

    /* JADX INFO: renamed from: a */
    public Context f53793a;

    static {
        new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C17989h0 m77341a() {
        return m77342b();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C17989h0 m77342b() {
        try {
            if (f53792b == null) {
                f53792b = new C17989h0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f53792b;
    }

    /* JADX INFO: renamed from: a */
    public void m77343a(Context context) {
        this.f53793a = context;
        m77348b(context);
        C17991i.m77353c().m77358b().m77438h(AbstractC17982f.m77305a());
    }

    /* JADX INFO: renamed from: b */
    public final void m77348b(Context context) {
        String strM77312d = AbstractC17982f.m77312d(context);
        AbstractC17970b.m77215a(strM77312d);
        if (!C18027w0.m77566b().m77567a()) {
            C18030y.m77586c("hmsSdk", "userManager.isUserUnlocked() == false");
            return;
        }
        String strM77329a = C17986g0.m77329a(context, "global_v2", "app_ver", "");
        C17986g0.m77334b(context, "global_v2", "app_ver", strM77312d);
        AbstractC17970b.m77217b(strM77329a);
        if (TextUtils.isEmpty(strM77329a)) {
            C18030y.m77586c("hmsSdk", "app ver is first save!");
        } else {
            if (strM77329a.equals(strM77312d)) {
                return;
            }
            C18030y.m77586c("hmsSdk", "the appVers are different!");
            m77341a().m77347a("", "alltype", strM77329a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77344a(String str, int i) {
        if (this.f53793a == null) {
            C18030y.m77590e("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            C18030y.m77586c("hmsSdk", "onReport: Before calling runtaskhandler()");
            m77347a(str, AbstractC18023u0.m77546a(i), AbstractC17970b.m77226g());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77345a(String str, int i, String str2, JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            jCurrentTimeMillis = AbstractC18023u0.m77544a("yyyy-MM-dd", jCurrentTimeMillis);
        }
        C18010o0.m77487c().m77488a(new C17995j0(str2, jSONObject, str, AbstractC18023u0.m77546a(i), jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: a */
    public void m77346a(String str, String str2) {
        if (!AbstractC17973c.m77242a(str, str2)) {
            C18030y.m77586c("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long jM77251j = AbstractC17973c.m77251j(str, str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jM77251j <= 30000) {
            C18030y.m77591f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        C18030y.m77580a("hmsSdk", "begin to call onReport!");
        AbstractC17973c.m77241a(str, str2, jCurrentTimeMillis);
        m77347a(str, str2, AbstractC17970b.m77226g());
    }

    /* JADX INFO: renamed from: a */
    public void m77347a(String str, String str2, String str3) {
        Context context = this.f53793a;
        if (context == null) {
            C18030y.m77590e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String strM77340a = C17988h.m77340a(context);
        if (AbstractC17973c.m77246e(str, str2) && !"WIFI".equals(strM77340a)) {
            C18030y.m77586c("hmsSdk", "strNetworkType is :" + strM77340a);
        } else if (TextUtils.isEmpty(strM77340a) || "2G".equals(strM77340a)) {
            C18030y.m77590e("hmsSdk", "The network is bad.");
        } else {
            C18010o0.m77487c().m77488a(new C17998k0(str, str2, str3));
        }
    }
}
