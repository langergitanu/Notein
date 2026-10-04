package com.huawei.hms.hatool;

import android.content.Context;

/* JADX INFO: renamed from: com.huawei.hms.hatool.h1 */
/* JADX INFO: loaded from: classes8.dex */
public final class C17990h1 {

    /* JADX INFO: renamed from: b */
    public static C17990h1 f53794b;

    /* JADX INFO: renamed from: c */
    public static final Object f53795c = new Object();

    /* JADX INFO: renamed from: a */
    public Context f53796a;

    /* JADX INFO: renamed from: a */
    public static C17990h1 m77349a() {
        if (f53794b == null) {
            m77350b();
        }
        return f53794b;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m77350b() {
        if (f53794b == null) {
            f53794b = new C17990h1();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77351a(Context context) {
        synchronized (f53795c) {
            try {
                if (this.f53796a != null) {
                    C18030y.m77591f("hmsSdk", "DataManager already initialized.");
                    return;
                }
                this.f53796a = context;
                C17991i.m77353c().m77358b().m77423a(this.f53796a);
                C17991i.m77353c().m77358b().m77442j(context.getPackageName());
                C18033z0.m77597a().m77600a(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77352a(String str) {
        C18030y.m77586c("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f53796a;
        if (context == null) {
            C18030y.m77590e("hmsSdk", "sdk is not init");
        } else {
            C17991i.m77353c().m77358b().m77440i(C18019s0.m77524a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
