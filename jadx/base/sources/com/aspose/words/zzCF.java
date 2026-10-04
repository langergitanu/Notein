package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzCF implements Cloneable, Comparable<zzCF> {
    private int zzTL;
    private zzCE zzZex;
    private int zzZxi;

    public zzCF(int i, int i2) {
        this.zzTL = i;
        this.zzZxi = i2;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean zzQ(zzCF zzcf) {
        return zzcf == null || zzcf.zzZxi == 0;
    }

    public static boolean zzR(zzCF zzcf) {
        return zzcf == null || Double.isNaN(zzcf.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzCF zzcf) {
        int iZzF = com.aspose.words.internal.zzZKT.zzF(getValue(), zzcf == null ? -1.7976931348623157E308d : zzcf.getValue());
        return iZzF != 0 ? iZzF : com.aspose.words.internal.zzZKR.zzZ7(zzcf.zzTL, this.zzTL);
    }

    public final int getIndex() {
        return this.zzTL;
    }

    public abstract String getStringValue();

    public abstract double getValue();

    public final int getValueType() {
        return this.zzZxi;
    }

    public boolean isDate() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public final void setIndex(int i) {
        if (this.zzTL == i) {
            return;
        }
        this.zzTL = i;
        zzZGd();
    }

    public zzCF zzKK(int i) {
        return (i < 0 || i >= zzZLd()) ? new zzFA(this.zzTL, getValue()) : this;
    }

    public final void zzT(zzCE zzce) {
        this.zzZex = zzce;
    }

    public final void zzZGd() {
        zzCE zzce = this.zzZex;
        if (zzce != null) {
            zzce.zzZGb();
        }
    }

    public int zzZLd() {
        return 1;
    }

    public zzCF zzZLf() {
        zzCF zzcf = (zzCF) memberwiseClone();
        zzcf.zzZex = null;
        return zzcf;
    }
}
