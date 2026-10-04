package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY4K {
    private int zzPm;
    private boolean zzX1A;
    private boolean zzX1O = true;
    private boolean zzYpc;

    public zzY4K(boolean z, boolean z2, int i) {
        this.zzYpc = z;
        this.zzX1A = z2;
        this.zzPm = i;
    }

    public final boolean getDetectNumberingWithWhitespaces() {
        return this.zzX1O;
    }

    public final int getNumberStyle() {
        return this.zzPm;
    }

    public final void setDetectNumberingWithWhitespaces(boolean z) {
        this.zzX1O = z;
    }

    public abstract String zzPm(int i);

    public abstract zzY4L zzTD(String str);

    public abstract String zzTE(String str);

    public abstract boolean zzTF(String str);

    public final boolean zzXUA() {
        return !this.zzYpc;
    }

    public final boolean zzXUz() {
        return this.zzX1A;
    }

    public final boolean zzZ1m() {
        return this.zzYpc;
    }
}
