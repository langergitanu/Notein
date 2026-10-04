package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.k */
/* JADX INFO: loaded from: classes8.dex */
public class C17586k {

    /* JADX INFO: renamed from: a */
    private final AesDecrypt f52023a;

    public C17586k(Context context, String str) {
        this.f52023a = !TextUtils.isEmpty(m75378a(context, str)) ? new C17583h(context, str) : new C17582g(context, str);
    }

    /* JADX INFO: renamed from: a */
    private String m75378a(Context context, String str) {
        String strM75381a = C17587l.m75381a(context, str, "agc_plugin_", "crypto");
        if (strM75381a == null) {
            return null;
        }
        try {
            return new String(Hex.decodeHexString(strM75381a), "utf-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            Log.e("ReaderStrategy", "UnsupportedEncodingException" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m75379a(String str, String str2) {
        return this.f52023a.decrypt(str, str2);
    }
}
