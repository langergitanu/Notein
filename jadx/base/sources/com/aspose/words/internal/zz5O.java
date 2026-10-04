package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz5O {
    public abstract void zzV(zzFY zzfy) throws Exception;

    public final void zzW(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Action");
        zzfy.zzH("/S", zzw8());
        zzV(zzfy);
        zzfy.zzFc();
    }

    public abstract String zzw8();
}
