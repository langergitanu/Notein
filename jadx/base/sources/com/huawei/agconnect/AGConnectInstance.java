package com.huawei.agconnect;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.core.p569a.C17593b;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AGConnectInstance {
    public static AGConnectInstance buildInstance(AGConnectOptions aGConnectOptions) {
        return C17593b.m75388a(aGConnectOptions);
    }

    public static AGConnectInstance getInstance() {
        return C17593b.m75387a();
    }

    public static void initialize(Context context) {
        Log.i("AGConnectInstance", "AGConnectInstance#initialize");
        C17593b.m75391a(context);
    }

    public abstract Context getContext();

    public abstract String getIdentifier();

    public abstract AGConnectOptions getOptions();

    public abstract <T> T getService(Class<? super T> cls);

    public static AGConnectInstance getInstance(String str) {
        return C17593b.m75390a(str);
    }

    public static void initialize(Context context, AGConnectOptionsBuilder aGConnectOptionsBuilder) {
        Log.i("AGConnectInstance", "AGConnectInstance#initialize with options");
        C17593b.m75393a(context, aGConnectOptionsBuilder);
    }
}
