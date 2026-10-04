package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZWZ {
    private zzZOR zzQH() throws Exception {
        zzZOR zzzor = new zzZOR();
        zzX(new zzXZ(zzzor));
        return zzzor;
    }

    public final byte[] toByteArray() throws Exception {
        zzZOR zzzorZzQH = zzQH();
        try {
            return zzzorZzQH.zzWy();
        } finally {
            zzzorZzQH.close();
        }
    }

    public abstract void zzX(zzXZ zzxz) throws Exception;
}
