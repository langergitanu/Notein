package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLT implements Cloneable {
    private String zzLu;
    private String zzXEM;
    private int zzXEN;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getAuthor() {
        return this.zzLu;
    }

    public final void setAuthor(String str) {
        this.zzLu = str;
    }

    public final void zzCW(String str) {
        this.zzXEM = str;
    }

    public final String zzYns() {
        return this.zzXEM;
    }

    public final int zzYnt() {
        return this.zzXEN;
    }

    public final zzYLT zzYnu() {
        return (zzYLT) memberwiseClone();
    }

    public final void zzq4(int i) {
        this.zzXEN = i;
    }
}
