package com.huawei.agconnect;

import android.content.Context;
import com.huawei.agconnect.config.impl.C17576a;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public abstract class AGConnectApp {
    public static AGConnectApp getInstance() {
        return C17576a.m75345a();
    }

    public static AGConnectApp initialize(Context context) {
        return C17576a.m75346a(context);
    }

    public abstract void setApiKey(String str);

    public abstract void setAppId(String str);

    public abstract void setClientId(String str);

    public abstract void setClientSecret(String str);

    public abstract void setCpId(String str);

    public abstract void setCustomAuthProvider(CustomAuthProvider customAuthProvider);

    public abstract void setCustomCredentialsProvider(CustomCredentialsProvider customCredentialsProvider);

    public abstract void setParam(String str, String str2);

    public abstract void setProductId(String str);

    private static AGConnectApp getInstance(String str) {
        return C17576a.m75348a(str);
    }

    private static AGConnectApp initialize(Context context, String str) {
        return C17576a.m75347a(context, str);
    }
}
