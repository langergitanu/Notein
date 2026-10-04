package com.huawei.hms.hwid;

import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AuthAccount;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.hwid.g */
/* JADX INFO: loaded from: classes8.dex */
public class C18059g {

    /* JADX INFO: renamed from: a */
    private static final C18059g f53968a = new C18059g();

    /* JADX INFO: renamed from: b */
    private Map<String, String> f53969b = new ConcurrentHashMap();

    private C18059g() {
    }

    /* JADX INFO: renamed from: a */
    public static C18059g m77675a() {
        return f53968a;
    }

    /* JADX INFO: renamed from: b */
    public final AuthAccount m77678b() {
        C18053as.m77659b("[AccountSDK]AccountAuthMemCache", "getSignInAccount start.", true);
        try {
            String str = this.f53969b.get("AccountAuth");
            if (str != null) {
                return AuthAccount.fromJson(str);
            }
            return null;
        } catch (Throwable th) {
            C18053as.m77661d("[AccountSDK]AccountAuthMemCache", "getSignInAccount faild, exception:".concat(th.getClass().getSimpleName()), true);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77679c() {
        this.f53969b.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m77677a(AuthAccount authAccount, AccountAuthParams accountAuthParams) {
        String json;
        C18053as.m77659b("[AccountSDK]AccountAuthMemCache", "saveDefaultAccountSignInAccount start.", true);
        if (authAccount != null) {
            try {
                json = authAccount.toJson();
            } catch (Throwable th) {
                C18053as.m77661d("[AccountSDK]AccountAuthMemCache", "store faild, exception:".concat(th.getClass().getSimpleName()), true);
                return;
            }
        } else {
            json = null;
        }
        m77676a(json, accountAuthParams != null ? accountAuthParams.toJson() : null);
    }

    /* JADX INFO: renamed from: a */
    private void m77676a(String str, String str2) {
        C18053as.m77659b("[AccountSDK]AccountAuthMemCache", "saveDefaultAccountSignInAccount start.", true);
        this.f53969b.remove("AccountAuth");
        this.f53969b.remove("AccountAuthParams");
        if (str != null) {
            this.f53969b.put("AccountAuth", str);
        }
        if (str2 != null) {
            this.f53969b.put("AccountAuthParams", str2);
        }
    }
}
