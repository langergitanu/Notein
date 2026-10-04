package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6O {
    private boolean zzX5C;
    private int zzX5D;
    private int zzX5E;
    private int zzX5F;
    private int zzX5G;
    private int zzX5H;
    private int zzX5I;
    private int zzX5J;
    private int zzX5K;
    private int zzX5L;
    private int zzX5M;
    private int zzX5N;
    private int zzX5O;
    private int zzX5P;
    private int zzX5Q;
    private zzY6V zzX5R;

    public zzY6O(zzY6V zzy6v, boolean z, int i, int i2, PreferredWidth preferredWidth, int i3, int i4) {
        this.zzX5R = zzy6v;
        this.zzX5O = i4 * 2;
        this.zzX5Q = Math.max(0, i - zzXYH());
        this.zzX5P = i2;
        PreferredWidth preferredWidthZzYmG = preferredWidth.zzYmG();
        int iZzZ = preferredWidthZzYmG.isAuto() ? zzZ(this.zzX5R) : 0;
        for (int i5 = 0; i5 < this.zzX5R.getCount(); i5++) {
            zzY6T zzy6tZzkf = this.zzX5R.zzkf(i5);
            this.zzX5D += zzy6tZzkf.zz56();
            int iZzke = this.zzX5R.zzke(i5);
            int iZzOg = this.zzX5R.zzOg(i5);
            boolean zIsAuto = true;
            if (iZzOg > 32767) {
                this.zzX5C = true;
            }
            if (zzy6tZzkf.getWidth() < iZzke) {
                zzy6tZzkf.setWidth(iZzke);
            }
            if (zzy6tZzkf.zzXZl()) {
                this.zzX5J += iZzke;
                this.zzX5I += iZzOg;
                if (this.zzX5K + zzy6tZzkf.zzXZm() <= 5000) {
                    this.zzX5K += zzy6tZzkf.zzXZm();
                } else {
                    int i6 = this.zzX5K;
                    if (i6 < 5000) {
                        zzy6tZzkf.zzk9(5000 - i6);
                        this.zzX5K = 5000;
                    } else {
                        zzy6tZzkf.zzk9(0);
                        zzy6tZzkf.setWidth(iZzke);
                    }
                }
            } else {
                zzy6tZzkf.setWidth(iZzOg);
                if (this.zzX5R.zzYKv()) {
                    zIsAuto = zzy6tZzkf.isAuto();
                } else if (!z || !zzy6tZzkf.zzXZk().zzZXi()) {
                    zIsAuto = false;
                }
                if (zIsAuto) {
                    this.zzX5G += iZzke;
                    this.zzX5H += iZzOg;
                } else {
                    this.zzX5E += iZzke;
                    this.zzX5F += iZzOg;
                }
            }
        }
        zzZ(preferredWidthZzYmG, iZzZ, i, i3);
        zzXYO();
    }

    private void zzVd(int i, int i2) {
        int i3;
        int i4 = this.zzX5N;
        if (i4 == 0 || i4 < i2 || (i3 = i4 - i) == 0) {
            return;
        }
        this.zzX5R.getCount();
        zzY6V zzy6v = this.zzX5R;
        zzY6R.zzZ(zzy6v, 0, zzy6v.getCount(), i3, 2);
    }

    private int zzXYH() {
        return (this.zzX5R.getCount() + 1) * this.zzX5O;
    }

    private int zzXYJ() {
        int i = this.zzX5M - this.zzX5F;
        int i2 = this.zzX5G;
        int i3 = i - i2;
        if (i3 <= 0) {
            return i2;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzX5R.getCount(); i5++) {
            zzY6T zzy6tZzkf = this.zzX5R.zzkf(i5);
            if (zzy6tZzkf.zzXZj()) {
                int iZz56 = zzy6tZzkf.zz56() + com.aspose.words.internal.zzAN.zzZX(zzy6tZzkf.zz56() * i3, i2);
                zzy6tZzkf.setWidth(iZz56);
                i4 += iZz56;
            }
        }
        return i4;
    }

    private int zzXYK() {
        int iZzXYy = zzXYy();
        int iZzXYx = zzXYx();
        int i = this.zzX5M;
        if (i == 0) {
            return 0;
        }
        if (iZzXYy == i) {
            return i;
        }
        if (iZzXYy < i) {
            return this.zzX5G > 0 ? this.zzX5F + zzXYJ() : zzC(i, iZzXYy, false);
        }
        int i2 = iZzXYy - iZzXYx;
        return i2 > 0 ? zzU(i2, iZzXYx, i, false) : iZzXYx;
    }

    private void zzXYN() {
        if (this.zzX5N <= 31680) {
            return;
        }
        int width = 0;
        for (int i = 0; i < this.zzX5R.getCount(); i++) {
            width += this.zzX5R.zzkf(i).getWidth();
        }
        int i2 = width - (this.zzX5P + 31680);
        if (i2 > 0) {
            int count = this.zzX5R.getCount() - 1;
            int iZzke = this.zzX5R.zzke(count);
            int iMin = Math.min(this.zzX5P, iZzke - Math.min(iZzke, 20));
            while (count >= 0) {
                zzY6T zzy6tZzkf = this.zzX5R.zzkf(count);
                int iZzke2 = this.zzX5R.zzke(count) - iMin;
                int width2 = zzy6tZzkf.getWidth() - iZzke2;
                if (width2 >= i2) {
                    zzy6tZzkf.setWidth(zzy6tZzkf.getWidth() - i2);
                    return;
                }
                zzy6tZzkf.setWidth(iZzke2);
                i2 -= width2;
                count--;
                iMin = 0;
            }
        }
    }

    private void zzXYO() {
        if (this.zzX5N > 31680) {
            this.zzX5C = true;
        }
        if (zzXYx() > 0) {
            this.zzX5L = com.aspose.words.internal.zzAN.zzZX(this.zzX5N * this.zzX5K, 5000);
        } else {
            this.zzX5L = this.zzX5N;
        }
        int i = this.zzX5L;
        int i2 = this.zzX5J;
        if (i < i2) {
            this.zzX5L = i2;
        }
        int iZzXYx = this.zzX5N - this.zzX5L;
        if (iZzXYx < zzXYx()) {
            iZzXYx = zzXYx();
        }
        this.zzX5L = Math.max(0, this.zzX5N - iZzXYx);
        this.zzX5M = iZzXYx;
    }

    private int zzXYy() {
        return this.zzX5H + this.zzX5F;
    }

    public static int zzZ(zzY6V zzy6v) {
        int iZzZX;
        int iZzXZm = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < zzy6v.getCount(); i4++) {
            zzY6T zzy6tZzkf = zzy6v.zzkf(i4);
            int iZzke = zzy6v.zzke(i4);
            int iZzOg = zzy6v.zzOg(i4);
            if (iZzOg >= iZzke) {
                iZzke = iZzOg;
            }
            if (zzy6tZzkf.zzXZl()) {
                iZzXZm += zzy6tZzkf.zzXZm();
                i2 += iZzke;
                if (zzy6tZzkf.zzXZm() > 0 && (iZzZX = com.aspose.words.internal.zzAN.zzZX(zzy6tZzkf.zzXZg() * 5000, zzy6tZzkf.zzXZm())) > i) {
                    i = iZzZX;
                }
            } else {
                i3 += iZzke;
            }
        }
        return zzz(i, Math.min(iZzXZm, 5000), i2, i3);
    }

    private void zzk3(int i) {
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzX5R.getCount(); i3++) {
            if (this.zzX5R.zzkf(i3).getWidth() > this.zzX5R.zzke(i3)) {
                i2++;
            }
        }
        while (i > 0 && i2 > 0) {
            int i4 = i / i2;
            int i5 = i2;
            int i6 = i % i2;
            i = 0;
            for (int i7 = 0; i7 < this.zzX5R.getCount(); i7++) {
                zzY6T zzy6tZzkf = this.zzX5R.zzkf(i7);
                int iZzke = this.zzX5R.zzke(i7);
                if (iZzke < zzy6tZzkf.getWidth()) {
                    int i8 = i6 > 0 ? 1 : 0;
                    i6--;
                    int width = ((zzy6tZzkf.getWidth() - i4) - i8) - i;
                    if (width <= iZzke) {
                        i = iZzke - width;
                        i5--;
                    } else {
                        i = 0;
                        iZzke = width;
                    }
                    zzy6tZzkf.setWidth(iZzke);
                }
            }
            i2 = i5;
        }
    }

    private static int zzz(int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            int i5 = 5000 - i2;
            if (i5 > 0) {
                i = Math.max(i, com.aspose.words.internal.zzAN.zzZX(i4 * 5000, i5));
            } else if (i4 > 0) {
                i = 31680;
            }
        } else {
            i = i3 + i4;
        }
        return Math.min(31680, i);
    }

    public final int zzC(int i, int i2, boolean z) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzX5R.getCount(); i4++) {
            zzY6T zzy6tZzkf = this.zzX5R.zzkf(i4);
            if (!zzy6tZzkf.zzXZl() && (!z || zzy6tZzkf.isAuto())) {
                int iZzZX = com.aspose.words.internal.zzAN.zzZX(zzy6tZzkf.getWidth() * i, i2);
                zzy6tZzkf.setWidth(iZzZX);
                i3 += iZzZX;
            }
        }
        return i3;
    }

    public final int zzU(int i, int i2, int i3, boolean z) {
        int i4 = (i2 + i) - i3;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzX5R.getCount(); i6++) {
            zzY6T zzy6tZzkf = this.zzX5R.zzkf(i6);
            if (!zzy6tZzkf.zzXZl() || z) {
                int width = zzy6tZzkf.getWidth();
                int iZz56 = (!this.zzX5R.zzYKv() || z) ? zzy6tZzkf.zz56() : zzy6tZzkf.zz6f();
                if (i > 0) {
                    iZz56 = Math.max(iZz56, width - com.aspose.words.internal.zzAN.zzJ(i4, Math.max(0, width - iZz56), i));
                }
                i5 += iZz56;
                zzy6tZzkf.setWidth(iZz56);
            }
        }
        return i5;
    }

    public final void zzVe(int i, int i2) {
        int i3 = i - this.zzX5N;
        if (i3 > 0) {
            zzk3(i3);
        } else {
            zzVd(i, i2);
        }
    }

    public final void zzWx() {
        int iZzXYL = zzXYL() + zzXYK();
        if (zzXYM()) {
            iZzXYL = this.zzX5L;
        }
        zzVe(iZzXYL, this.zzX5D);
        zzXYN();
    }

    public final int zzXYA() {
        return this.zzX5E;
    }

    public final int zzXYB() {
        return this.zzX5F;
    }

    public final int zzXYC() {
        return this.zzX5G;
    }

    public final int zzXYD() {
        return this.zzX5H;
    }

    public final int zzXYE() {
        return this.zzX5J;
    }

    public final int zzXYF() {
        return this.zzX5L;
    }

    public final int zzXYG() {
        return this.zzX5N;
    }

    public final int zzXYI() {
        return this.zzX5Q;
    }

    public final int zzXYL() {
        if (this.zzX5K <= 0) {
            return this.zzX5J;
        }
        int iZzZX = com.aspose.words.internal.zzAN.zzZX(this.zzX5L * 5000, this.zzX5N);
        int i = 0;
        for (int i2 = 0; i2 < this.zzX5R.getCount(); i2++) {
            zzY6T zzy6tZzkf = this.zzX5R.zzkf(i2);
            if (zzy6tZzkf.zzXZl()) {
                int iZzXZm = zzy6tZzkf.zzXZm();
                if (this.zzX5K < 5000 || iZzZX < 5000) {
                    iZzXZm = com.aspose.words.internal.zzAN.zzZX(zzy6tZzkf.zzXZm() * iZzZX, this.zzX5K);
                }
                int iZzke = this.zzX5R.zzke(i2);
                int iZzZX2 = com.aspose.words.internal.zzAN.zzZX(this.zzX5N * iZzXZm, 5000);
                if (iZzZX2 > iZzke) {
                    iZzke = iZzZX2;
                }
                zzy6tZzkf.setWidth(iZzke);
                i += iZzke;
            }
        }
        return i;
    }

    public final boolean zzXYM() {
        boolean z = zzXYx() == 0 && this.zzX5K == 0;
        if (z) {
            if (this.zzX5J > 0) {
                zzZ(this.zzX5R, this.zzX5L);
                return z;
            }
            this.zzX5C = true;
        }
        return z;
    }

    public final zzY6V zzXYW() {
        return this.zzX5R;
    }

    public final boolean zzXYw() {
        return this.zzX5C;
    }

    public final int zzXYx() {
        return this.zzX5G + this.zzX5E;
    }

    public final int zzXYz() {
        return this.zzX5D;
    }

    public final void zzk1(int i) {
        this.zzX5D = i;
    }

    public final void zzk2(int i) {
        this.zzX5N = i;
    }

    private void zzZ(PreferredWidth preferredWidth, int i, int i2, int i3) {
        if (preferredWidth.isAuto()) {
            if (this.zzX5K > 0 || this.zzX5R.zzYKv()) {
                i = Math.min(i, this.zzX5Q);
            }
            if (!this.zzX5R.zzYKv()) {
                i = Math.max(i, this.zzX5I + zzXYy());
            }
        } else if (preferredWidth.zzYmB()) {
            int iZzZX = com.aspose.words.internal.zzAN.zzZX(preferredWidth.zzYmE() * Math.max(0, i2 + i3), 5000) - zzXYH();
            i = 31680;
            if (iZzZX > 31680) {
                this.zzX5C = true;
            } else {
                i = iZzZX;
            }
        } else {
            i = preferredWidth.zzYmD() - zzXYH();
        }
        this.zzX5N = Math.max(1, i);
    }

    private static void zzZ(zzY6V zzy6v, int i) {
        int width = 0;
        for (int i2 = 0; i2 < zzy6v.getCount(); i2++) {
            width += zzy6v.zzkf(i2).getWidth();
        }
        int i3 = i - width;
        if (i3 <= 0) {
            return;
        }
        int count = zzy6v.getCount();
        int i4 = i3 / count;
        int i5 = i3 % count;
        for (int i6 = 0; i6 < zzy6v.getCount(); i6++) {
            zzY6T zzy6tZzkf = zzy6v.zzkf(i6);
            int i7 = i5 > 0 ? 1 : 0;
            i5--;
            zzy6tZzkf.setWidth(zzy6tZzkf.getWidth() + i4 + i7);
        }
    }
}
