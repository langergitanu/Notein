package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6V {
    private boolean zzY6B;
    private ArrayList<zzY6T> zzYhr = new ArrayList<>();

    public zzY6V(boolean z) {
        this.zzY6B = z;
    }

    private boolean zzVh(int i, int i2) {
        return zzkc(i) && i2 > 0 && i + i2 <= this.zzYhr.size();
    }

    private void zzVi(int i, int i2) {
        if (!zzkc(0)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: firstColumn");
        }
        if (!zzVh(0, i2)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: columnCount");
        }
    }

    private boolean zzkc(int i) {
        return i >= 0 && i < this.zzYhr.size();
    }

    public final int getCount() {
        return this.zzYhr.size();
    }

    public final int zzOg(int i) {
        zzY6T zzy6t = this.zzYhr.get(i);
        return this.zzY6B ? zzy6t.zzXZg() : zzy6t.zzXZi();
    }

    public final void zzXZr() {
        this.zzYhr.clear();
    }

    public final zzY6P zzXZs() {
        int iZz56 = 0;
        int i = 0;
        int iMax = 0;
        for (int i2 = 0; i2 < this.zzYhr.size(); i2++) {
            zzY6T zzy6tZzkf = zzkf(i2);
            iZz56 += zzy6tZzkf.zz55().zz56();
            int iMax2 = Math.max(zzy6tZzkf.zz55().zz56(), zzy6tZzkf.zz55().zz6f());
            i += iMax2;
            iMax += Math.max(zzy6tZzkf.zzXZn() ? zzy6tZzkf.zzXZo() : zzy6tZzkf.zz55().zz6e(), iMax2);
        }
        return new zzY6P(iZz56, i, iMax);
    }

    public final boolean zzYKv() {
        return this.zzY6B;
    }

    public final void zzZ(zzY6T zzy6t) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYhr, zzy6t);
    }

    public final void zzkb(int i) {
        this.zzYhr.remove(i);
    }

    public final int zzkd(int i) {
        zzVi(0, i);
        int iZzXZm = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iZzXZm += zzkf(i2).zzXZm();
        }
        return iZzXZm;
    }

    public final int zzke(int i) {
        zzY6T zzy6t = this.zzYhr.get(i);
        return this.zzY6B ? zzy6t.zz55().zz6f() : zzy6t.zz55().zz56();
    }

    public final zzY6T zzkf(int i) {
        return this.zzYhr.get(i);
    }
}
