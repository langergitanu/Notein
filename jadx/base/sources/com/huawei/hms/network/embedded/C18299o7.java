package com.huawei.hms.network.embedded;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18299o7 {
    /* JADX INFO: renamed from: a */
    public static String m79276a(String str, String str2) {
        return m79277a(str, str2, StandardCharsets.ISO_8859_1);
    }

    /* JADX INFO: renamed from: a */
    public static String m79277a(String str, String str2, Charset charset) {
        return OooO00o.OooO00o("Basic ", C18303ob.m79292a(str + C18241k5.f55433h + str2, charset).mo78727b());
    }
}
