package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYL6 {
    private int zzXDB;
    private int zzXDC;
    private int zzXDD;
    private int zzXDE;
    private com.aspose.words.internal.zzKA[] zzXDH;
    private com.aspose.words.internal.zzKA[] zzXDI;
    private Object[] zzXDJ;
    private Object[] zzXDK;
    private zzYLC zzXDL;
    private zzYLC zzXDM;
    private boolean zzXDz;
    private long zzXDG = 0;
    private long zzXDF = 0;
    private long zzXDA = 0;

    public zzYL6(zzYLC zzylc, zzYLC zzylc2) {
        this.zzXDM = zzylc;
        this.zzXDL = zzylc2;
        this.zzXDK = new Object[zzylc.zzYnj()];
        this.zzXDJ = new Object[zzylc2.zzYnj()];
        this.zzXDI = new com.aspose.words.internal.zzKA[zzylc.zzYnj()];
        this.zzXDH = new com.aspose.words.internal.zzKA[zzylc2.zzYnj()];
    }

    public final void zzXr(long j) {
        this.zzXDA = j;
    }

    public final void zzXs(long j) {
        this.zzXDF = j;
    }

    public final void zzXt(long j) {
        this.zzXDG = j;
    }

    public final int zzYmT() {
        return this.zzXDB;
    }

    public final int zzYmU() {
        return this.zzXDC;
    }

    public final int zzYmV() {
        return this.zzXDD;
    }

    public final int zzYmW() {
        return this.zzXDE;
    }

    public final void zzYmX() {
        this.zzXDz = true;
    }

    public final boolean zzYmY() {
        return this.zzXDz;
    }

    public final long zzYmZ() {
        return this.zzXDA;
    }

    public final long zzYn0() {
        return this.zzXDF;
    }

    public final long zzYn1() {
        return this.zzXDG;
    }

    public final zzYLC zzYn2() {
        return this.zzXDL;
    }

    public final zzYLC zzYn3() {
        return this.zzXDM;
    }

    public final com.aspose.words.internal.zzKA zzpR(int i) {
        com.aspose.words.internal.zzKA[] zzkaArr = this.zzXDH;
        if (zzkaArr[i] == null) {
            zzkaArr[i] = new com.aspose.words.internal.zzKA();
        }
        return this.zzXDH[i];
    }

    public final com.aspose.words.internal.zzKA zzpS(int i) {
        com.aspose.words.internal.zzKA[] zzkaArr = this.zzXDI;
        if (zzkaArr[i] == null) {
            zzkaArr[i] = new com.aspose.words.internal.zzKA();
        }
        return this.zzXDI[i];
    }

    public final ArrayList<zzYL8> zzpT(int i) {
        Object[] objArr = this.zzXDJ;
        if (objArr[i] == null) {
            objArr[i] = new ArrayList();
        }
        return (ArrayList) this.zzXDJ[i];
    }

    public final ArrayList<zzYL8> zzpU(int i) {
        Object[] objArr = this.zzXDK;
        if (objArr[i] == null) {
            objArr[i] = new ArrayList();
        }
        return (ArrayList) this.zzXDK[i];
    }

    public final void zzpV(int i) {
        this.zzXDB = i;
    }

    public final void zzpW(int i) {
        this.zzXDC = i;
    }

    public final void zzpX(int i) {
        this.zzXDD = i;
    }

    public final void zzpY(int i) {
        this.zzXDE = i;
    }
}
