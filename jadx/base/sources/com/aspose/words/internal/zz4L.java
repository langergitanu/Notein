package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz4L {
    private int zziX = 0;
    private zzD3<zz2X> zziW = new zzD3<>();
    private ArrayList<zz2K> zziV = new ArrayList<>();
    private zzD3<zz5I> zziU = new zzD3<>();

    private int zzuL() {
        int i = this.zziX;
        this.zziX = i + 1;
        return i;
    }

    public final zz5I zzU8(int i) {
        return this.zziU.get(i);
    }

    public final zz2X zzU9(int i) {
        return this.zziW.get(i);
    }

    public final zz2K zzXT(String str) {
        zz2K zz2k = new zz2K(str, zzuL(), this);
        zzZQG.zzZ(this.zziV, zz2k);
        return zz2k;
    }

    public final void zzZ(zz2X zz2x) {
        this.zziW.add(zz2x.zztL(), zz2x);
    }

    public final zzD3<zz5I> zzuI() {
        return this.zziU;
    }

    public final int zzuJ() {
        return this.zziX;
    }

    public final ArrayList<zz2K> zzuK() {
        return this.zziV;
    }

    public final void zzZ(zz5I zz5i) {
        this.zziU.add(zz5i.zzw5(), zz5i);
        zz5i.zzw6().zzUb(zzuL());
    }
}
