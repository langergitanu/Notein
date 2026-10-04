package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz45 {
    public abstract zzZOP zz4(zzZOP zzzop) throws Exception;

    public abstract void zzG(zzFY zzfy) throws Exception;

    public void zzH(zzFY zzfy) throws Exception {
        zzfy.zzH("/Filter", zzwE());
        if (zzuB()) {
            zzfy.zzYY("/DecodeParms");
            zzG(zzfy);
            zzfy.zzFg();
        }
    }

    public final void zzZ(zzZOR zzzor, zzZOP zzzop, zz2V zz2v) throws Exception {
        if (zz2v != null) {
            zzzop = zz2v.zz3(zzzop);
        }
        zzZOP zzzopZz4 = zz4(zzzop);
        zzzopZz4.write(zzzor.zziA(), 0, (int) zzzor.getLength());
        zzzopZz4.flush();
    }

    public abstract boolean zzuB();

    public abstract String zzwE();
}
