package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6C {
    private int zzX4A;
    private int zzX4B;
    private int zzX4C;
    private int zzX4y;
    private int zzX4z;
    private int zzX5b;
    private int zzX5c;
    private int zzX5d;

    private void zzN(zzZL5 zzzl5) {
        int i = 0;
        for (int columnsCount = zzzl5.getColumnsCount() - 1; columnsCount >= 0; columnsCount--) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(columnsCount);
            if (zzzl7ZzAm.zzYug.zzYmB()) {
                i = (zzzl7ZzAm.zzCu - zzzl7ZzAm.zzYui) + i;
            }
        }
        for (int columnsCount2 = zzzl5.getColumnsCount() - 1; columnsCount2 >= 0 && i > 0; columnsCount2--) {
            zzZL7 zzzl7ZzAm2 = zzzl5.zzAm(columnsCount2);
            if (zzzl7ZzAm2.zzYug.zzYmB()) {
                int i2 = zzzl7ZzAm2.zzCu;
                int i3 = i2 - zzzl7ZzAm2.zzYui;
                int i4 = this.zzX4C;
                int i5 = (i4 * i3) / i;
                zzzl7ZzAm2.zzCu = i2 + i5;
                int i6 = i4 - i5;
                this.zzX4C = i6;
                i -= i3;
                if (i6 >= 0) {
                    return;
                }
            }
        }
    }

    private void zzO(zzZL5 zzzl5) {
        int i = 0;
        for (int columnsCount = zzzl5.getColumnsCount() - 1; columnsCount >= 0; columnsCount--) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(columnsCount);
            if (zzzl7ZzAm.zzYug.isFixed()) {
                i = (zzzl7ZzAm.zzCu - zzzl7ZzAm.zzYui) + i;
            }
        }
        for (int columnsCount2 = zzzl5.getColumnsCount() - 1; columnsCount2 >= 0 && i > 0; columnsCount2--) {
            zzZL7 zzzl7ZzAm2 = zzzl5.zzAm(columnsCount2);
            if (zzzl7ZzAm2.zzYug.isFixed()) {
                int i2 = zzzl7ZzAm2.zzCu;
                int i3 = i2 - zzzl7ZzAm2.zzYui;
                int i4 = this.zzX4C;
                int i5 = (i4 * i3) / i;
                zzzl7ZzAm2.zzCu = i2 + i5;
                int i6 = i4 - i5;
                this.zzX4C = i6;
                i -= i3;
                if (i6 >= 0) {
                    return;
                }
            }
        }
    }

    private void zzP(zzZL5 zzzl5) {
        int i = 0;
        for (int columnsCount = zzzl5.getColumnsCount() - 1; columnsCount >= 0; columnsCount--) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(columnsCount);
            if (zzzl7ZzAm.zzYug.isAuto()) {
                i = (zzzl7ZzAm.zzCu - zzzl7ZzAm.zzYui) + i;
            }
        }
        for (int columnsCount2 = zzzl5.getColumnsCount() - 1; columnsCount2 >= 0 && i > 0; columnsCount2--) {
            zzZL7 zzzl7ZzAm2 = zzzl5.zzAm(columnsCount2);
            if (zzzl7ZzAm2.zzYug.isAuto()) {
                int i2 = zzzl7ZzAm2.zzCu;
                int i3 = i2 - zzzl7ZzAm2.zzYui;
                int i4 = this.zzX4C;
                int i5 = (i4 * i3) / i;
                zzzl7ZzAm2.zzCu = i2 + i5;
                int i6 = i4 - i5;
                this.zzX4C = i6;
                i -= i3;
                if (i6 >= 0) {
                    return;
                }
            }
        }
    }

    private void zzQ(zzZL5 zzzl5) {
        int columnsCount = zzzl5.getColumnsCount();
        int i = columnsCount;
        while (true) {
            int i2 = columnsCount - 1;
            if (columnsCount <= 0) {
                return;
            }
            int i3 = this.zzX4C;
            int i4 = i3 / i;
            this.zzX4C = i3 - i4;
            i--;
            zzzl5.zzAm(i2).zzCu += i4;
            columnsCount = i2;
        }
    }

    private void zzR(zzZL5 zzzl5) {
        for (int i = 0; i < zzzl5.getColumnsCount(); i++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i);
            if (zzzl7ZzAm.zzYug.isFixed()) {
                int i2 = this.zzX4C;
                int i3 = zzzl7ZzAm.zzYuh;
                int i4 = this.zzX4z;
                int i5 = (i2 * i3) / i4;
                this.zzX4C = i2 - i5;
                this.zzX4z = i4 - i3;
                zzzl7ZzAm.zzCu += i5;
            }
        }
    }

    private void zzS(zzZL5 zzzl5) {
        for (int i = 0; i < zzzl5.getColumnsCount(); i++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i);
            if (zzzl7ZzAm.zzYug.zzYmB()) {
                int iZzYmE = zzzl7ZzAm.zzYug.zzYmE() * this.zzX4C;
                int i2 = this.zzX4y;
                int i3 = iZzYmE / i2;
                this.zzX4C -= i3;
                int iZzYmE2 = i2 - zzzl7ZzAm.zzYug.zzYmE();
                this.zzX4y = iZzYmE2;
                zzzl7ZzAm.zzCu += i3;
                if (this.zzX4C == 0 || iZzYmE2 == 0) {
                    return;
                }
            }
        }
    }

    private void zzT(zzZL5 zzzl5) {
        int i = this.zzX4A;
        this.zzX4C += this.zzX4B;
        for (int i2 = 0; i2 < zzzl5.getColumnsCount(); i2++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i2);
            if (zzzl7ZzAm.zzYug.isAuto() && i != 0) {
                int iMax = Math.max(zzzl7ZzAm.zzCu, (this.zzX4C * zzzl7ZzAm.zzYuh) / i);
                this.zzX4C -= iMax;
                i -= zzzl7ZzAm.zzYup;
                zzzl7ZzAm.zzCu = iMax;
            }
        }
    }

    private void zzU(zzZL5 zzzl5) {
        for (int i = 0; i < zzzl5.getColumnsCount(); i++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i);
            if (zzzl7ZzAm.zzYug.isFixed()) {
                int iZzYmD = zzzl7ZzAm.zzYug.zzYmD();
                int i2 = zzzl7ZzAm.zzCu;
                if (iZzYmD > i2) {
                    this.zzX4C = (i2 - zzzl7ZzAm.zzYug.zzYmD()) + this.zzX4C;
                    zzzl7ZzAm.zzCu = zzzl7ZzAm.zzYug.zzYmD();
                }
            }
        }
    }

    private void zzY(zzZL5 zzzl5, int i) {
        int i2 = i - zzzl5.zzYuf;
        for (int i3 = 0; i3 < zzzl5.getColumnsCount(); i3++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i3);
            if (zzzl7ZzAm.zzYug.zzYmB()) {
                int iMax = Math.max(zzzl7ZzAm.zzYui, (int) ((zzzl7ZzAm.zzYug.getValue() * ((double) i2)) / 100.0d));
                this.zzX4C = (zzzl7ZzAm.zzCu - iMax) + this.zzX4C;
                zzzl7ZzAm.zzCu = iMax;
            }
        }
    }

    public final void zzZ(zzZL5 zzzl5, boolean z, int i) {
        zzZ(zzzl5, i);
        if (this.zzX4C > 0 && this.zzX5b > 0) {
            zzY(zzzl5, i);
        }
        if (this.zzX4C > 0) {
            zzU(zzzl5);
        }
        if (this.zzX4C > 0 && this.zzX5d > 0) {
            zzT(zzzl5);
        }
        if (this.zzX4C > 0 && z && 5000 > this.zzX4y) {
            zzS(zzzl5);
        }
        if (this.zzX4C > 0 && this.zzX5c > 0) {
            zzR(zzzl5);
        }
        if (this.zzX4C > 0) {
            zzQ(zzzl5);
        }
        if (this.zzX4C < 0) {
            zzP(zzzl5);
        }
        if (this.zzX4C < 0) {
            zzO(zzzl5);
        }
        if (this.zzX4C < 0) {
            zzN(zzzl5);
        }
    }

    private void zzZ(zzZL5 zzzl5, int i) {
        this.zzX4C = i - zzzl5.zzYuf;
        this.zzX5d = 0;
        this.zzX5c = 0;
        this.zzX5b = 0;
        this.zzX4B = 0;
        this.zzX4A = 0;
        this.zzX4z = 0;
        this.zzX4y = 0;
        for (int i2 = 0; i2 < zzzl5.getColumnsCount(); i2++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i2);
            zzzl7ZzAm.zzYuh = Math.max(zzzl7ZzAm.zzYuh, zzzl7ZzAm.zzYui);
            int i3 = zzzl7ZzAm.zzYui;
            zzzl7ZzAm.zzCu = i3;
            this.zzX4C -= i3;
            int type = zzzl7ZzAm.zzYug.getType();
            if (type == 1) {
                this.zzX5d++;
                this.zzX4B += zzzl7ZzAm.zzYui;
                this.zzX4A += zzzl7ZzAm.zzYuh;
            } else if (type == 2) {
                this.zzX5b++;
                this.zzX4y = zzzl7ZzAm.zzYug.zzYmE() + this.zzX4y;
            } else if (type == 3) {
                this.zzX5c++;
                this.zzX4z += zzzl7ZzAm.zzYuh;
            }
        }
    }
}
