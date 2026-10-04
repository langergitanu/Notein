package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzD3 extends zz80 implements Cloneable {
    private zzEG zzZ9Y;
    private com.aspose.words.internal.zzD3<zzD1> zzZ9Z = new com.aspose.words.internal.zzD3<>();
    private String zzZh;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static boolean zzKo(int i) {
        return i != 4;
    }

    public final String getId() {
        return this.zzZh;
    }

    public final void setId(String str) {
        this.zzZh = str;
    }

    public final zzD1 zzKn(int i) {
        zzD1 zzd1 = this.zzZ9Z.get(i);
        if (zzd1 != null || !zzKo(i)) {
            return zzd1;
        }
        zzD1 zzd12 = new zzD1();
        this.zzZ9Z.set(i, zzd12);
        return zzd12;
    }

    public final void zzZ(int i, zzD1 zzd1) {
        this.zzZ9Z.set(i, zzd1);
    }

    public final zzEG zzZHu() {
        return this.zzZ9Y;
    }

    public final zzD3 zzZHv() {
        zzD3 zzd3 = (zzD3) memberwiseClone();
        zzd3.zzZ9Z = new com.aspose.words.internal.zzD3<>();
        int[] values = zzD0.getValues();
        for (int i = 0; i < 30; i++) {
            int i2 = values[i];
            if (this.zzZ9Z.get(i2) != null) {
                zzd3.zzZ(i2, zzKn(i2).zzZHr());
            }
        }
        zzEG zzeg = this.zzZ9Y;
        if (zzeg != null) {
            zzd3.zzZ9Y = zzeg.zzZLh();
        }
        zzd3.setExtensions(zzZBz());
        return zzd3;
    }

    public final void zzZ(zzEG zzeg) {
        this.zzZ9Y = zzeg;
    }
}
