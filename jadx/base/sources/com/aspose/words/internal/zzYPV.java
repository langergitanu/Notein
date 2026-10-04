package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYPV extends zzYQR {
    public static void zzZ(zzYQ8 zzyq8, String str, String str2, zzYPS zzyps, String str3, zzYPS zzyps2, String str4, zzYPS zzyps3) {
        String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC", str);
        zzyq8.zzZ("Mac." + strOooO00o, str2, zzyps);
        zzyq8.zzZ("Mac", strOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC-", str), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC/", str));
        zzyq8.zzZ("KeyGenerator." + strOooO00o, str3, zzyps2);
        zzyq8.zzZ("KeyGenerator", strOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC-", str), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC/", str));
        zzyq8.zzZ("SecretKeyFactory." + strOooO00o, str4, zzyps3);
        zzyq8.zzZ("SecretKeyFactory", strOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC-", str), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC/", str));
    }

    public static void zzZ(zzYQ8 zzyq8, String str, String... strArr) {
        String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC", str);
        zzyq8.zzZ("Mac", strOooO00o, strArr);
        zzyq8.zzZ("KeyGenerator", strOooO00o, strArr);
        zzyq8.zzZ("SecretKeyFactory", strOooO00o, strArr);
    }

    public static void zzZ(zzYQ8 zzyq8, String str, zzZDA... zzzdaArr) {
        String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("HMAC", str);
        zzyq8.zzZ("Mac", strOooO00o, zzzdaArr);
        zzyq8.zzZ("KeyGenerator", strOooO00o, zzzdaArr);
        zzyq8.zzZ("SecretKeyFactory", strOooO00o, zzzdaArr);
    }
}
