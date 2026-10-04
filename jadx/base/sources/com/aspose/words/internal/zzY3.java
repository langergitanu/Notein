package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzY3 {
    private int zzWa;
    private boolean zzWb;
    private boolean zzWc;
    private int zzWd;
    private int zzWe;
    private String zzWf;

    public zzY3(String str, int i) {
        this(str, i, 0);
    }

    public final int getLevel() {
        return this.zzWe;
    }

    public final String getText() {
        return this.zzWf;
    }

    public final void zzE(boolean z) {
        this.zzWb = z;
    }

    public final void zzF(boolean z) {
        this.zzWc = z;
    }

    public final int zzXi() {
        return this.zzWa;
    }

    public final boolean zzXj() {
        return zzXn() && this.zzWc && this.zzWb;
    }

    public final boolean zzXk() {
        return this.zzWb;
    }

    public final boolean zzXl() {
        return this.zzWc;
    }

    public final int zzXm() {
        return this.zzWd;
    }

    public final boolean zzXn() {
        return this.zzWe % 2 != 0;
    }

    public final void zzp(int i) {
        this.zzWa = i;
    }

    public zzY3(String str, int i, int i2) {
        this.zzWe = i;
        this.zzWf = str;
        this.zzWd = i2;
    }
}
