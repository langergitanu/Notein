package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZVB extends zzZV5 {
    private ArrayList<zzZV7> zz7c;
    private int zz7d;
    protected int zz7e;
    private zzZV7 zz7f;

    public zzZVB(zzZVD zzzvd) {
        super(zzzvd);
        this.zz7c = new ArrayList<>();
    }

    public abstract void endDocument() throws Exception;

    public abstract void startDocument() throws Exception;

    public final void zzG3() throws Exception {
        this.zz7f.zzG3();
        this.zz7c.add(this.zz7f);
        this.zz7f = null;
    }

    public abstract zzZV7 zzG8() throws Exception;

    public final void zzRT(int i) {
        this.zz7d = i;
    }

    public final void zzX(zzZH zzzh) throws Exception {
        if (this.zz7e < zzzh.getWidthPixels()) {
            this.zz7e = zzzh.getWidthPixels();
        }
        this.zz7d = zzzh.getHeightPixels() + this.zz7d;
        zzZV7 zzzv7ZzG8 = zzG8();
        this.zz7f = zzzv7ZzG8;
        zzzv7ZzG8.zzX(zzzh);
    }

    public final ArrayList<zzZV7> zzn9() {
        return this.zz7c;
    }

    public final int zzna() {
        return this.zz7d;
    }

    public final int zznb() {
        return this.zz7e;
    }

    public final zzZV7 zznc() {
        return this.zz7f;
    }
}
