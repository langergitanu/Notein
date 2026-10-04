package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzWU {
    private int zzTL;
    private byte[] zzTM;
    private ArrayList<Object> zzTK = new ArrayList<>();
    private HashMap<Integer, Object[]> zzTP = new HashMap<>();

    public zzWU(byte[] bArr) {
        this.zzTM = bArr;
    }

    public final byte readByte() {
        int i = this.zzTL;
        byte[] bArr = this.zzTM;
        if (i >= bArr.length) {
            throw new IllegalStateException("Invalid CFF DICT data.");
        }
        this.zzTL = i + 1;
        return bArr[i];
    }

    public final void zzH(double d) {
        zzZQG.zzZ((ArrayList<Double>) this.zzTK, Double.valueOf(d));
    }

    public final boolean zzUY() {
        return this.zzTL >= this.zzTM.length;
    }

    public final HashMap<Integer, Object[]> zzVb() {
        return this.zzTP;
    }

    public final void zzZx(int i) {
        zzZQF.zzY(this.zzTP, Integer.valueOf(i), this.zzTK.toArray(new Object[0]));
        this.zzTK = new ArrayList<>();
    }

    public final void zzZy(int i) {
        zzZQG.zzZ((ArrayList<Integer>) this.zzTK, Integer.valueOf(i));
    }
}
