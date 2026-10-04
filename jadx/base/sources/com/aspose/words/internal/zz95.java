package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz95 {
    public static zz95 zzUN(int i) {
        if (i == 0) {
            return new zz93();
        }
        if (i == 1) {
            return new zz92();
        }
        if (i == 2) {
            return new zz91();
        }
        throw new IllegalStateException("Unexpected gradient fill mode.");
    }

    public abstract void zzY(zzO8 zzo8, int i) throws Exception;

    public abstract zzG zzZ(long[] jArr, zzPV[] zzpvArr) throws Exception;
}
