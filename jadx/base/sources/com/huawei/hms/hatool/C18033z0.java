package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.hihonor.honorid.core.data.DeviceInfo;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.UUID;
import o0O00o00.OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.hatool.z0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18033z0 {

    /* JADX INFO: renamed from: b */
    public static C18033z0 f53947b;

    /* JADX INFO: renamed from: a */
    public Context f53948a;

    /* JADX INFO: renamed from: com.huawei.hms.hatool.z0$a */
    public static class a extends AbstractC17969a1 {

        /* JADX INFO: renamed from: a */
        public String f53949a;

        /* JADX INFO: renamed from: b */
        public String f53950b;

        public a(String str, String str2) {
            this.f53949a = str;
            this.f53950b = str2;
        }

        @Override // com.huawei.hms.hatool.AbstractC17969a1
        /* JADX INFO: renamed from: a */
        public String mo77206a() {
            return AbstractC17967a.m77191d(this.f53949a, this.f53950b);
        }

        @Override // com.huawei.hms.hatool.AbstractC17969a1
        /* JADX INFO: renamed from: b */
        public String mo77209b() {
            return AbstractC17967a.m77194g(this.f53949a, this.f53950b);
        }

        @Override // com.huawei.hms.hatool.AbstractC17969a1
        /* JADX INFO: renamed from: c */
        public String mo77210c() {
            return AbstractC17967a.m77197j(this.f53949a, this.f53950b);
        }

        @Override // com.huawei.hms.hatool.AbstractC17969a1
        /* JADX INFO: renamed from: d */
        public int mo77211d() {
            return (AbstractC17967a.m77198k(this.f53949a, this.f53950b) ? 4 : 0) | (AbstractC17967a.m77192e(this.f53949a, this.f53950b) ? 2 : 0) | (AbstractC17967a.m77195h(this.f53949a, this.f53950b) ? 1 : 0);
        }

        @Override // com.huawei.hms.hatool.AbstractC17969a1
        /* JADX INFO: renamed from: a */
        public String mo77207a(String str) {
            return OooO00o.OooO00o(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18033z0 m77597a() {
        C18033z0 c18033z0;
        synchronized (C18033z0.class) {
            try {
                if (f53947b == null) {
                    f53947b = new C18033z0();
                }
                c18033z0 = f53947b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c18033z0;
    }

    /* JADX INFO: renamed from: b */
    public String m77601b(String str, String str2) {
        return AbstractC17985g.m77325b(this.f53948a, str, str2);
    }

    /* JADX INFO: renamed from: c */
    public C18029x0 m77602c(String str, String str2) {
        return new a(str, str2).m77205a(this.f53948a);
    }

    /* JADX INFO: renamed from: d */
    public String m77603d(String str, String str2) {
        return AbstractC17975c1.m77268b(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public Pair<String, String> m77604e(String str, String str2) {
        if (!AbstractC17967a.m77193f(str, str2)) {
            return new Pair<>("", "");
        }
        String strM77453p = C17991i.m77353c().m77358b().m77453p();
        String strM77455q = C17991i.m77353c().m77358b().m77455q();
        if (!TextUtils.isEmpty(strM77453p) && !TextUtils.isEmpty(strM77455q)) {
            return new Pair<>(strM77453p, strM77455q);
        }
        Pair<String, String> pairM77240e = C17972b1.m77240e(this.f53948a);
        C17991i.m77353c().m77358b().m77444k((String) pairM77240e.first);
        C17991i.m77353c().m77358b().m77446l((String) pairM77240e.second);
        return pairM77240e;
    }

    /* JADX INFO: renamed from: f */
    public String m77605f(String str, String str2) {
        return AbstractC17975c1.m77267a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public String m77598a(String str, String str2) {
        return AbstractC17985g.m77324a(this.f53948a, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public String m77599a(boolean z) {
        if (!z) {
            return "";
        }
        String strM77222e = AbstractC17970b.m77222e();
        if (TextUtils.isEmpty(strM77222e)) {
            strM77222e = C17986g0.m77329a(this.f53948a, "global_v2", DeviceInfo.TAG_UUID, "");
            if (TextUtils.isEmpty(strM77222e)) {
                strM77222e = UUID.randomUUID().toString().replace(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "");
                C17986g0.m77334b(this.f53948a, "global_v2", DeviceInfo.TAG_UUID, strM77222e);
            }
            AbstractC17970b.m77229h(strM77222e);
        }
        return strM77222e;
    }

    /* JADX INFO: renamed from: a */
    public void m77600a(Context context) {
        if (this.f53948a == null) {
            this.f53948a = context;
        }
    }
}
