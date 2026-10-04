package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzFP implements Cloneable {
    private String mName;
    private int zzZEh;
    private String zzZyL;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getFormatCode() {
        return this.zzZyL;
    }

    public final String getName() {
        return this.mName;
    }

    public final int getValueCount() {
        return this.zzZEh;
    }

    public final void setFormatCode(String str) {
        this.zzZyL = str;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final void zzNy(int i) {
        this.zzZEh = i;
    }

    public final zzFP zzZNb() {
        return (zzFP) memberwiseClone();
    }
}
