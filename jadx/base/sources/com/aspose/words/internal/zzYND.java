package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYND extends zzYQR {
    public static void zzY(zzYQ8 zzyq8, String str, zzYPS zzyps, zzZDA... zzzdaArr) {
        for (zzZDA zzzda : zzzdaArr) {
            zzyq8.zzZ("KeyGenerator", zzzda, str + "$" + zzzda, zzyps);
        }
    }

    public static void zzZ(zzYQ8 zzyq8, String str, zzYPS zzyps, zzZDA... zzzdaArr) {
        for (int i = 0; i < 2; i++) {
            zzZDA zzzda = zzzdaArr[i];
            zzyq8.zzZ("SecretKeyFactory", zzzda, str + "$" + zzzda, zzyps);
        }
    }
}
