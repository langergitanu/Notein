package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAR {
    private int mColumnIndex;
    private int zzXcL;
    private Cell zzZAc;

    public zzYAR() {
    }

    public final int getColumnIndex() {
        return this.mColumnIndex;
    }

    public final Cell zz6C() {
        return this.zzZAc;
    }

    public final int zzY66() {
        return this.zzXcL;
    }

    public zzYAR(Cell cell, int i) {
        this.zzZAc = cell;
        this.mColumnIndex = i;
        this.zzXcL = zzZSF.zzT(cell);
    }
}
