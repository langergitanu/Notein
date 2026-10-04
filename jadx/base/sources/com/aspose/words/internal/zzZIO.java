package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZIO {
    private static final int[] zzZIQ = {8, 16, 16, 32, 32, 64};
    protected int offset;
    protected int size;
    protected int[] zzZIN;
    protected int zzZIO;
    protected int zzZIP;

    public zzZIO(int i, int i2) {
        this.zzZIP = i;
        this.zzZIO = 1;
        this.size = i2;
        this.offset = 0;
        this.zzZIN = new int[1];
    }

    public static int zzPB(int i) {
        if (i < 0 || i > 5) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Unknown data type "));
        }
        return zzZIQ[i];
    }

    public int zzPC(int i) {
        return zzYP(0, i);
    }

    public abstract int zzYP(int i, int i2);

    public abstract void zzq(int i, int i2, int i3);

    public zzZIO(int i, int i2, int i3) {
        this.zzZIP = i;
        this.zzZIO = i3;
        this.size = i2;
        this.offset = 0;
        this.zzZIN = new int[i3];
    }
}
