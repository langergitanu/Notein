package com.huawei.hms.framework.network.grs.p577e;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.e.c */
/* JADX INFO: loaded from: classes7.dex */
public class C17935c {

    /* JADX INFO: renamed from: b */
    private static final String f53656b = "c";

    /* JADX INFO: renamed from: c */
    private static final Map<String, PLSharedPreferences> f53657c = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: a */
    private final PLSharedPreferences f53658a;

    public C17935c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.m76959d(f53656b, "get pkgname from context is{%s}", packageName);
        Map<String, PLSharedPreferences> map = f53657c;
        if (map.containsKey(str + packageName)) {
            this.f53658a = map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, C21111o0ooOoO.OooO0Oo(str, packageName));
            this.f53658a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        m77019a(context);
    }

    /* JADX INFO: renamed from: a */
    public String m77020a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f53658a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f53658a.getString(str, str2);
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public void m77023b() {
        PLSharedPreferences pLSharedPreferences = this.f53658a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f53658a.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public Map<String, ?> m77021a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f53658a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f53658a.getAll();
        }
        return all;
    }

    /* JADX INFO: renamed from: b */
    public void m77024b(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f53658a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f53658a.putString(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m77019a(Context context) {
        String str = f53656b;
        Logger.m76963i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String string = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String strM77020a = m77020a("version", "");
            if (string.equals(strM77020a)) {
                return;
            }
            Logger.m76964i(str, "app version changed! old version{%s} and new version{%s}", strM77020a, string);
            m77023b();
            m77024b("version", string);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.m76967w(f53656b, "get app version failed and catch NameNotFoundException");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77022a(String str) {
        PLSharedPreferences pLSharedPreferences = this.f53658a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f53658a.remove(str);
        }
    }
}
