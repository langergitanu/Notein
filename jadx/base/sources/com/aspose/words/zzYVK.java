package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVK {
    private zzYVJ[] zzXUx = new zzYVJ[6];

    private int zzAh(int i) {
        int i2 = i - 12;
        if (i2 < 0 || i2 > this.zzXUx.length) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: storyType");
        }
        return i2;
    }

    public final void zzZ(zzZYW zzzyw, int i) {
        if (zzzyw == null) {
            return;
        }
        int iZzAh = zzAh(i);
        zzYVJ[] zzyvjArr = this.zzXUx;
        if (zzyvjArr[iZzAh] == null) {
            zzyvjArr[iZzAh] = new zzYVJ(zzzyw, i);
        }
    }

    public final zzYVJ zztl(int i) throws Exception {
        zzYVJ zzyvjZztm = zztm(i);
        if (zzyvjZztm == null) {
            return null;
        }
        zzYVJ zzyvj = new zzYVJ(zzyvjZztm.zzab(), i);
        zzY9E.zzZ(zzyvjZztm, zzyvj);
        return zzyvj;
    }

    public final zzYVJ zztm(int i) {
        return this.zzXUx[zzAh(i)];
    }
}
