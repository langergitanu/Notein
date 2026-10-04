package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzQX {
    public static zzXO zzY(zzZOX zzzox) throws Exception {
        long position = zzzox.zzq().getPosition();
        int iZzXc = zzzox.zzXc();
        zzXO zzxo = new zzXO();
        if (iZzXc != 12) {
            zzxo.setWidth(zzzox.zzXc());
            zzxo.setHeight(zzzox.zzXc());
            zzxo.zzX(zzzox.zzXa());
            zzxo.zzW(zzzox.zzXa());
            if (iZzXc != 16) {
                zzxo.zzZW((int) (((long) zzzox.zzXc()) & 4294967295L));
                zzxo.zzZV(zzzox.zzXc());
                zzxo.zzZU(zzzox.zzXc());
                zzxo.zzZT(zzzox.zzXc());
                zzxo.zzZS(zzzox.zzXc());
                zzxo.zzZR(zzzox.zzXc());
            }
        } else {
            zzxo.setWidth(zzzox.zzXa() & 65535);
            zzxo.setHeight(zzzox.zzXa() & 65535);
            zzxo.zzX(zzzox.zzXa());
            zzxo.zzW(zzzox.zzXa());
        }
        zzzox.zzq().zzH(position + ((long) iZzXc));
        return zzxo;
    }

    public abstract void zzZ(zzZOW zzzow) throws Exception;
}
