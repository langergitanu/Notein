package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz2K {
    private zz4L zzgq;
    private int zzkA;
    private String zzky;
    private int zzgr = 0;
    private ArrayList<zz2X> zzgp = new ArrayList<>();

    public zz2K(String str, int i, zz4L zz4l) {
        this.zzky = str;
        this.zzkA = i;
        this.zzgq = zz4l;
    }

    private int zztn() {
        int i = this.zzgr;
        this.zzgr = i + 1;
        return i;
    }

    public final int zzV(zzZN zzzn) {
        int iZztn = zztn();
        zz2X zz2x = new zz2X(iZztn, this.zzky, zzzn.getId());
        zzZQG.zzZ(this.zzgp, zz2x);
        this.zzgq.zzZ(zz2x);
        return iZztn;
    }

    public final void zzZ(zz5J zz5j, zzL zzl) {
        if (zz5j == null || zzl.zzZY() == 0) {
            return;
        }
        this.zzgq.zzZ(new zz5I(this.zzky, zz5j, zzl.zzZY()));
    }

    public final ArrayList<zz2X> zztm() {
        return this.zzgp;
    }

    public final int zzw7() {
        return this.zzkA;
    }
}
