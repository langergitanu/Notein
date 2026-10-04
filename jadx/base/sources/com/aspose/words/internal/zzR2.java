package com.aspose.words.internal;

import com.aspose.words.ref.RefInt;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zzR2 {
    private int zzMc;
    private char[] zzMd;
    public int zzMe;
    public int zzMf;
    public int zzMg;
    public int zzMh;
    public int zzMi;
    public int zzMj;
    public int zzMk;
    public int zzMl;
    public int zzMm;
    public int zzMn;
    private static int[] zzMb = {-1, 10, 100, 1000, 10000, 100000, 1000000};
    private static int zzMa = 4;
    private static int zzM9 = 5;
    private static int zzM8 = 7;
    private static int zzM7 = 8;
    private static int zzM6 = 10;
    private static int zzM5 = 11;
    private static int zzM4 = 2;
    private static int zzM3 = 3;
    private static int zzM2 = 5;
    private static int zzM1 = 6;
    private static int zzM0 = 8;
    private static int zzLZ = 1;
    private static int zzLY = 3;

    private boolean zzU(RefInt refInt) {
        int i;
        int i2;
        RefInt refInt2 = new RefInt(this.zzMk);
        RefInt refInt3 = new RefInt(this.zzMj);
        RefInt refInt4 = new RefInt(this.zzMi);
        boolean z = (zzY(refInt.get(), refInt2) && this.zzMk <= 24 && zzX(refInt.get() + zzM4, ':') && zzY(refInt.get() + zzM3, refInt3) && this.zzMj < 60 && zzX(refInt.get() + zzM2, ':') && zzY(refInt.get() + zzM1, refInt4) && (i2 = this.zzMi) < 60 && (this.zzMk != 24 || (this.zzMj == 0 && i2 == 0))) ? false : true;
        this.zzMk = refInt2.get();
        this.zzMj = refInt3.get();
        this.zzMi = refInt4.get();
        if (z) {
            return false;
        }
        refInt.set(refInt.get() + zzM0);
        if (zzX(refInt.get(), FilenameUtils.EXTENSION_SEPARATOR)) {
            this.zzMh = 0;
            int i3 = 0;
            while (refInt.set(refInt.get() + 1) < this.zzMc && i3 < 7 && this.zzMd[refInt.get()] - '0' >= 0 && i <= 9) {
                this.zzMh = (this.zzMh * 10) + i;
                i3++;
            }
            if (i3 < 7) {
                if (i3 == 0) {
                    return false;
                }
                this.zzMh *= zzMb[7 - i3];
            }
            if (this.zzMk == 24 && this.zzMh != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean zzX(int i, char c) {
        return i < this.zzMc && this.zzMd[i] == c;
    }

    private boolean zzY(int i, RefInt refInt) {
        int i2 = i + 1;
        if (i2 < this.zzMc) {
            char[] cArr = this.zzMd;
            int i3 = cArr[i] - '0';
            int i4 = cArr[i2] - '0';
            if (i3 >= 0 && i3 < 10 && i4 >= 0 && i4 < 10) {
                refInt.set((i3 * 10) + i4);
                return true;
            }
        }
        refInt.set(0);
        return false;
    }

    private boolean zzYo(int i) {
        int i2;
        if (i < this.zzMc) {
            char c = this.zzMd[i];
            if (c == 'Z' || c == 'z') {
                this.zzMe = 1;
                i++;
            } else {
                RefInt refInt = new RefInt(this.zzMg);
                boolean z = i + 2 < this.zzMc && zzY(zzLZ + i, refInt) && this.zzMg <= 99;
                this.zzMg = refInt.get();
                if (z) {
                    if (c == '+') {
                        this.zzMe = 3;
                        i2 = zzLY;
                    } else if (c == '-') {
                        this.zzMe = 2;
                        i2 = zzLY;
                    }
                    i += i2;
                }
                if (i < this.zzMc) {
                    if (zzX(i, ':')) {
                        int i3 = i + 1;
                        RefInt refInt2 = new RefInt(this.zzMf);
                        boolean z2 = i + 2 < this.zzMc && zzY(i3, refInt2) && this.zzMf <= 99;
                        this.zzMf = refInt2.get();
                        i = z2 ? i + 3 : i3;
                    } else {
                        RefInt refInt3 = new RefInt(this.zzMf);
                        boolean z3 = i + 1 < this.zzMc && zzY(i, refInt3) && this.zzMf <= 99;
                        this.zzMf = refInt3.get();
                        if (z3) {
                            i += 2;
                        }
                    }
                }
            }
        }
        return i == this.zzMc;
    }

    private boolean zzYp(int i) {
        return zzU(new RefInt(i)) && zzYo(i);
    }

    private boolean zzYq(int i) {
        int i2;
        int i3;
        return zzZ(i, new RefInt(this.zzMn)) && this.zzMn > 0 && zzX(zzMa + i, '-') && zzY(zzM9 + i, new RefInt(this.zzMm)) && (i2 = this.zzMm) > 0 && i2 <= 12 && zzX(zzM8 + i, '-') && zzY(i + zzM7, new RefInt(this.zzMl)) && (i3 = this.zzMl) > 0 && i3 <= zzZQ9.zzZn(this.zzMn, this.zzMm);
    }

    public final boolean zzZ(char[] cArr, int i, int i2) {
        this.zzMd = cArr;
        this.zzMc = i2 + i;
        return zzYq(i) && zzX(zzM6 + i, 'T') && zzYp(zzM5 + i);
    }

    private boolean zzZ(int i, RefInt refInt) {
        int i2 = i + 3;
        if (i2 < this.zzMc) {
            char[] cArr = this.zzMd;
            int i3 = cArr[i] - '0';
            int i4 = cArr[i + 1] - '0';
            int i5 = cArr[i + 2] - '0';
            int i6 = cArr[i2] - '0';
            if (i3 >= 0 && i3 < 10 && i4 >= 0 && i4 < 10 && i5 >= 0 && i5 < 10 && i6 >= 0 && i6 < 10) {
                refInt.set((((((i3 * 10) + i4) * 10) + i5) * 10) + i6);
                return true;
            }
        }
        refInt.set(0);
        return false;
    }
}
