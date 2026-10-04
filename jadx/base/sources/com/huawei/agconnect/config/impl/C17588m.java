package com.huawei.agconnect.config.impl;

import android.content.Context;
import com.huawei.agconnect.config.ConfigReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.m */
/* JADX INFO: loaded from: classes8.dex */
class C17588m implements ConfigReader {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f52024a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private final C17586k f52025b;

    public C17588m(Context context, String str) {
        this.f52025b = new C17586k(context, str);
    }

    @Override // com.huawei.agconnect.config.ConfigReader
    public String getString(String str, String str2) {
        String str3 = this.f52024a.get(str);
        if (str3 != null) {
            return str3;
        }
        String strM75379a = this.f52025b.m75379a(str, str2);
        if (strM75379a == null) {
            return str2;
        }
        this.f52024a.put(str, strM75379a);
        return strM75379a;
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=true}";
    }
}
