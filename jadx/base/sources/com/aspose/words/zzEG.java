package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEG implements Cloneable {
    private int zzVf;
    private String zzZbX;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getSize() {
        return this.zzVf;
    }

    public final String getSymbol() {
        return this.zzZbX;
    }

    public final void setSize(int i) {
        this.zzVf = i;
    }

    public final void zzRp(String str) {
        this.zzZbX = str;
    }

    public final zzEG zzZLh() {
        return (zzEG) memberwiseClone();
    }
}
