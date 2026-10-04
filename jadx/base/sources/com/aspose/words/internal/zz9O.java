package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz9O {
    public static zz9O zzX(int i, zzZXH zzzxh) {
        if (i == 2) {
            return new zz9N();
        }
        int iZzt = zzT8.zzt(i, 1252);
        if (i == 1 && zzzxh != null && !zzzxh.zzHB().zzI6() && zzzxh.zzHB().zzI5()) {
            iZzt = 1256;
        }
        return new zz9M(zzZO0.zzQz(iZzt));
    }

    public abstract int zzV2(int i);

    public abstract String zzZn(byte[] bArr);

    public abstract String zzZo(byte[] bArr);
}
