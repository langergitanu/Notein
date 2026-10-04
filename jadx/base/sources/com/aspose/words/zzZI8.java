package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZI8 {
    private com.aspose.words.internal.zzD4 zzYqO = new com.aspose.words.internal.zzD4();

    public final int get(int i) {
        int i2 = this.zzYqO.get(i);
        if (com.aspose.words.internal.zzD4.zzWm(i2)) {
            throw new IllegalStateException("Marker type not found.");
        }
        return i2;
    }

    public final void update(int i, int i2) {
        if (!this.zzYqO.zzVE(i)) {
            this.zzYqO.add(i, i2);
        }
        if (i2 > this.zzYqO.get(i)) {
            this.zzYqO.set(i, i2);
        }
    }
}
