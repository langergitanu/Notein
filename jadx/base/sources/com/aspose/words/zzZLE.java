package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZLE {
    private int zzTL;
    com.aspose.words.internal.zzPV zzYuy;
    int zzZfb;

    public zzZLE() {
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzZLE.class) {
            zzZLE zzzle = (zzZLE) obj;
            if (this.zzZfb == zzzle.zzZfb && this.zzYuy.equals(zzzle.zzYuy)) {
                return true;
            }
        }
        return false;
    }

    public final int getIndex() {
        return this.zzTL;
    }

    public final void setIndex(int i) {
        this.zzTL = i;
    }

    public zzZLE(zzZLE zzzle) {
        this.zzYuy = new com.aspose.words.internal.zzPV(zzzle.zzYuy.toArgb());
        this.zzZfb = zzzle.zzZfb;
    }
}
