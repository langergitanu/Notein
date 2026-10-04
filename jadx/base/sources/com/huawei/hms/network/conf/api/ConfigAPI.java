package com.huawei.hms.network.conf.api;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.network.embedded.C18345s1;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigAPI {
    public static Object getValue(String str) {
        return C18345s1.m79477c().m79482a(str);
    }

    public static void init(Context context) {
        C18345s1.m79477c().m79483a(context);
    }

    public static Bundle providerCall(Context context, String str, String str2, Bundle bundle) {
        return C18345s1.m79477c().m79481a(context, str, str2, bundle);
    }
}
