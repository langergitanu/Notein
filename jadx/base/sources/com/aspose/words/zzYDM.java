package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDM implements Cloneable {
    private int zzXoj;
    private String zzjy;
    static zzYDM zzXol = new zzYDM("MS Gothic", 9746);
    static zzYDM zzXok = new zzYDM("MS Gothic", 9744);

    public zzYDM(String str, int i) {
        this.zzjy = str;
        this.zzXoj = i;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getFontName() {
        return this.zzjy;
    }

    public final int zzYcU() {
        return this.zzXoj;
    }

    public final zzYDM zzYcV() {
        return (zzYDM) memberwiseClone();
    }
}
