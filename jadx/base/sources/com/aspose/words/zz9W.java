package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz9W extends zz9Y {
    protected zz9M zzZ6l;
    protected zzAL zzZ6m;
    private zz6C zzZ6n;
    private zz93 zzZ6o;

    public zz9W(zzAL zzal, zz93 zz93Var, zz6C zz6c) {
        this.zzZ6o = zz93Var;
        this.zzZ6n = zz6c;
        this.zzZ6m = zzal;
        this.zzZ6l = new zz9M(zzal);
    }

    public final ArrayList<zz93> zzZEa() {
        return this.zzZ6l.zzZ(this.zzZ6n, this.zzZ6o);
    }
}
