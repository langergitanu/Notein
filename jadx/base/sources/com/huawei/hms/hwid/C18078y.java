package com.huawei.hms.hwid;

import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.hwid.y */
/* JADX INFO: loaded from: classes8.dex */
public class C18078y {

    /* JADX INFO: renamed from: a */
    private static final C18078y f53980a = new C18078y();

    /* JADX INFO: renamed from: b */
    private Map<String, String> f53981b = new ConcurrentHashMap();

    private C18078y() {
    }

    /* JADX INFO: renamed from: a */
    public static C18078y m77716a() {
        return f53980a;
    }

    /* JADX INFO: renamed from: b */
    public final AuthHuaweiId m77719b() {
        try {
            String str = this.f53981b.get("HuaweiIdAccount");
            if (str != null) {
                return AuthHuaweiId.fromJson(str);
            }
            return null;
        } catch (Throwable th) {
            C18053as.m77661d("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "getHuaweiSignInAccount faild, exception:".concat(th.getClass().getSimpleName()), true);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77720c() {
        this.f53981b.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m77718a(AuthHuaweiId authHuaweiId, HuaweiIdAuthParams huaweiIdAuthParams) {
        String json;
        C18053as.m77659b("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "saveDefaultHuaweiIdSignInAccount start.", true);
        if (authHuaweiId != null) {
            try {
                json = authHuaweiId.toJson();
            } catch (Throwable th) {
                C18053as.m77661d("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "store faild, exception:".concat(th.getClass().getSimpleName()), true);
                return;
            }
        } else {
            json = null;
        }
        m77717a(json, huaweiIdAuthParams != null ? huaweiIdAuthParams.toJson() : null);
    }

    /* JADX INFO: renamed from: a */
    private void m77717a(String str, String str2) {
        C18053as.m77659b("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "saveDefaultHuaweiIdSignInAccount start.", true);
        this.f53981b.remove("HuaweiIdAccount");
        this.f53981b.remove("HuaweiIdAuthParams");
        if (str != null) {
            this.f53981b.put("HuaweiIdAccount", str);
        }
        if (str2 != null) {
            this.f53981b.put("HuaweiIdAuthParams", str2);
        }
    }
}
