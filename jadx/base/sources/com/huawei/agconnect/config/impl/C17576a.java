package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectApp;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.CustomAuthProvider;
import com.huawei.agconnect.CustomCredentialsProvider;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.core.p569a.C17593b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17576a extends AGConnectApp {

    /* JADX INFO: renamed from: a */
    private static final Map<String, AGConnectApp> f51981a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static final Object f51982b = new Object();

    /* JADX INFO: renamed from: c */
    private static String f51983c;

    /* JADX INFO: renamed from: d */
    private AGConnectServicesConfig f51984d;

    private C17576a(Context context, String str) {
        this.f51984d = AGConnectServicesConfig.fromContext(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static AGConnectApp m75345a() {
        return m75348a(f51983c);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setApiKey(String str) {
        this.f51984d.setParam("/client/api_key", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setAppId(String str) {
        this.f51984d.setParam("/client/app_id", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setClientId(String str) {
        this.f51984d.setParam("/client/client_id", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setClientSecret(String str) {
        this.f51984d.setParam("/client/client_secret", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setCpId(String str) {
        this.f51984d.setParam("/client/cp_id", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setCustomAuthProvider(CustomAuthProvider customAuthProvider) {
        ((C17593b) AGConnectInstance.getInstance()).m75396a(customAuthProvider);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setCustomCredentialsProvider(CustomCredentialsProvider customCredentialsProvider) {
        ((C17593b) AGConnectInstance.getInstance()).m75397a(customCredentialsProvider);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setParam(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("path can not be empty");
        }
        this.f51984d.setParam(str, str2);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setProductId(String str) {
        this.f51984d.setParam("/client/product_id", str);
    }

    /* JADX INFO: renamed from: a */
    public static AGConnectApp m75346a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        f51983c = packageName;
        return m75347a(context, packageName);
    }

    /* JADX INFO: renamed from: a */
    public static AGConnectApp m75347a(Context context, String str) {
        AGConnectApp aGConnectApp;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName can not be empty");
        }
        synchronized (f51982b) {
            try {
                Map<String, AGConnectApp> map = f51981a;
                aGConnectApp = map.get(str);
                if (aGConnectApp == null) {
                    map.put(str, new C17576a(context, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aGConnectApp;
    }

    /* JADX INFO: renamed from: a */
    public static AGConnectApp m75348a(String str) {
        AGConnectApp aGConnectApp;
        synchronized (f51982b) {
            try {
                aGConnectApp = f51981a.get(str);
                if (aGConnectApp == null) {
                    throw new IllegalStateException("you should call AGConnectApp.initialize first");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aGConnectApp;
    }
}
