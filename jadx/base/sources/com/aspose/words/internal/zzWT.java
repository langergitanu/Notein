package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzWT {
    public static zzWT zzY(zzWK zzwk, int i) throws Exception {
        if (zzWR.zzZv(i)) {
            return new zzWR(i);
        }
        zzwk.zzZp(i);
        return zzWS.zzZ(zzwk);
    }

    public abstract int getDataSize();

    public abstract void zzX(zzWJ zzwj) throws Exception;

    public abstract int zzZw(int i);
}
