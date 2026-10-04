package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz6S {
    private ArrayList<zz6S> zzZc = new ArrayList<>();
    private Object zzmb;
    private boolean zzmc;
    private int zzmd;
    private int zzme;
    private zz6S zzmf;

    public final void zzUf(int i) {
        this.zzmd = 0;
    }

    public final void zzUg(int i) {
        this.zzme = i;
    }

    public final void zzX(zz6S zz6s) {
        this.zzmf = null;
    }

    public final void zzY(zz6S zz6s) {
        zz6s.zzmf = this;
        zz6s.zzmd = this.zzmd + 1;
        zzZQG.zzZ(this.zzZc, zz6s);
    }

    public final void zzZM(boolean z) {
        this.zzmc = z;
    }

    public final void zzl(Object obj) {
        this.zzmb = obj;
    }

    public final Object zzwX() {
        return this.zzmb;
    }

    public final boolean zzwY() {
        return this.zzmc;
    }

    public final ArrayList<zz6S> zzwZ() {
        return this.zzZc;
    }

    public final int zzx0() {
        return this.zzmd;
    }

    public final int zzx1() {
        return this.zzme;
    }

    public final zz6S zzx2() {
        return this.zzmf;
    }
}
