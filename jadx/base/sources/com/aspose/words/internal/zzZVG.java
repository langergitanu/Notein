package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVG {
    short[] zz7m;
    zzZVH[] zz7n;

    public zzZVG(zzY0 zzy0, int i, int i2) throws Exception {
        i = i > i2 ? i2 : i;
        this.zz7n = new zzZVH[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            zzZVH[] zzzvhArr = this.zz7n;
            if (i4 >= zzzvhArr.length) {
                break;
            }
            zzzvhArr[i4] = new zzZVH(zzy0);
            i4++;
        }
        this.zz7m = new short[i2 - i];
        while (true) {
            short[] sArr = this.zz7m;
            if (i3 >= sArr.length) {
                return;
            }
            sArr[i3] = zzy0.zzXa();
            i3++;
        }
    }

    public final zzZVH zzS0(int i) {
        zzZVH[] zzzvhArr = this.zz7n;
        if (i < zzzvhArr.length) {
            return zzzvhArr[i];
        }
        return new zzZVH(zzzvhArr[zzzvhArr.length - 1].zz7p, this.zz7m[i - zzzvhArr.length]);
    }
}
