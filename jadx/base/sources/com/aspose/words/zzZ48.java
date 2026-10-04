package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ48 {
    private int zzYbQ;
    private int zzYbR = -1;
    private int[] zzYbS;

    public zzZ48(int[] iArr, List list) {
        this.zzYbS = iArr;
        this.zzYbQ = list.getListLevels().getCount();
    }

    public final void zzZ(List list, int i, int i2) {
        list.zzYPb().getCount();
        if (this.zzYbR < 0) {
            this.zzYbR = i;
        }
        if (i2 >= i) {
            i2 = i + 1;
        }
        if (this.zzYbQ <= i2 || i2 == this.zzYbR) {
            return;
        }
        for (int i3 = i2; i3 < this.zzYbQ; i3++) {
            zzZ4B zzz4bZzZ = zzZ(i3, list);
            if (zzz4bZzZ != null) {
                this.zzYbS[i3] = zzz4bZzZ.getListLevel().getStartAt() + (this.zzYbS[i3] - list.zzxx(i3));
            }
        }
        this.zzYbQ = i2;
    }

    public static zzZ4B zzZ(int i, List list) {
        zzZ4B zzz4bZzxz = list.zzxz(i);
        if (zzz4bZzxz == null || list.zzxy(i)) {
            return null;
        }
        return zzz4bZzxz;
    }
}
