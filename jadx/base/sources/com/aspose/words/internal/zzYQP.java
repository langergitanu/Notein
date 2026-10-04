package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYQP extends zzYQR {
    public static void zzZ(zzYQ8 zzyq8, String str, String str2, Map<String, String> map, zzYPS zzyps) {
        zzyq8.zzZ("KeyAgreement." + str, str2, zzyps);
        zzyq8.zzV("KeyAgreement." + str, map);
    }

    public static void zzZ(zzYQ8 zzyq8, String str, String str2, String str3, zzZDA zzzda, Map<String, String> map, zzYPS zzyps) {
        String strOooO0Oo = o0Oo0oo.OooO0Oo(str, "WITH", str2);
        String strOooO0Oo2 = o0Oo0oo.OooO0Oo(str, "/", str2);
        zzyq8.zzZ("Signature." + strOooO0Oo, str3, zzyps);
        zzyq8.zzZ(RequestParameters.SIGNATURE, strOooO0Oo, strOooO0Oo2);
        if (zzzda != null) {
            zzyq8.zzZ(RequestParameters.SIGNATURE, strOooO0Oo, zzzda);
        }
        zzyq8.zzV("Signature." + strOooO0Oo, map);
    }

    public static void zzZ(zzYQ8 zzyq8, String str, String str2, String str3, zzZDA zzzda, zzYPS zzyps) {
        String strOooO0Oo = o0Oo0oo.OooO0Oo(str, "WITH", str2);
        String strOooO0Oo2 = o0Oo0oo.OooO0Oo(str, "/", str2);
        zzyq8.zzZ("Signature." + strOooO0Oo, str3, zzyps);
        zzyq8.zzZ(RequestParameters.SIGNATURE, strOooO0Oo, strOooO0Oo2);
        if (zzzda != null) {
            zzyq8.zzZ(RequestParameters.SIGNATURE, strOooO0Oo, zzzda);
        }
    }

    public static void zzZ(zzYQ8 zzyq8, zzZDA zzzda, String str, zzYQO zzyqo) {
        zzyq8.zzZ("KeyFactory", str, zzzda);
        zzyq8.zzZ("KeyPairGenerator", str, zzzda);
        zzyq8.zzZ(zzzda, zzyqo);
    }

    public static void zzZ(zzYQ8 zzyq8, zzZDA zzzda, String str) {
        zzyq8.zzZ("AlgorithmParameterGenerator", str, zzzda);
        zzyq8.zzZ("AlgorithmParameters", str, zzzda);
    }
}
