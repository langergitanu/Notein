package com.aspose.words.internal;

import Oooo0.C20856OooooOo;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZIA {
    protected int height;
    protected int width;
    protected int zzZIP;
    protected int zzZKw;

    public zzZIA(int i, int i2, int i3, int i4) {
        long j = ((long) i2) * ((long) i3);
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Width (", i2, ") and height (", ") must be > 0", i3));
        }
        if (j >= 2147483647L) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Dimensions (width=", i2, " height=", ") are too large", i3));
        }
        if (i < 0 || (i > 5 && i != 32)) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Unsupported dataType: "));
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException("Number of bands must be > 0");
        }
        this.zzZIP = i;
        this.width = i2;
        this.height = i3;
        this.zzZKw = i4;
    }

    private double zzX(int i, int i2, int i3, zzZIO zzzio) {
        return zzZ(i, i2, i3, zzzio);
    }

    public final int getDataType() {
        return this.zzZIP;
    }

    public abstract zzZIA zzH(int[] iArr);

    public abstract int zzPD(int i);

    public final void zzY(int i, int i2, int i3, int[] iArr, zzZIO zzzio) {
        int i4;
        int i5;
        int i6 = i + i3;
        int i7 = i2 + 1;
        if (i < 0 || i >= (i4 = this.width) || i3 > i4 || i6 < 0 || i6 > i4 || i2 < 0 || i2 >= (i5 = this.height) || i5 <= 0 || i7 < 0 || i7 > i5) {
            throw new ArrayIndexOutOfBoundsException("Invalid coordinates.");
        }
        int i8 = 0;
        for (int i9 = i2; i9 < i7; i9++) {
            for (int i10 = i; i10 < i6; i10++) {
                int i11 = 0;
                while (i11 < this.zzZKw) {
                    zzZ(i10, i9, i11, iArr[i8], zzzio);
                    i11++;
                    i8++;
                }
            }
        }
    }

    public zzZIA zzYR(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public abstract int zzZ(int i, int i2, int i3, zzZIO zzzio);

    public abstract Object zzZ(int i, int i2, Object obj, zzZIO zzzio);

    public abstract void zzZ(int i, int i2, int i3, int i4, zzZIO zzzio);

    public final int[] zzZ(int i, int i2, int i3, int[] iArr, zzZIO zzzio) {
        int i4;
        int i5;
        int i6 = i + i3;
        int i7 = i2 + 1;
        if (i < 0 || i >= (i4 = this.width) || i3 > i4 || i6 < 0 || i6 > i4 || i2 < 0 || i2 >= (i5 = this.height) || i5 <= 0 || i7 < 0 || i7 > i5) {
            throw new ArrayIndexOutOfBoundsException("Invalid coordinates.");
        }
        if (iArr == null) {
            iArr = new int[this.zzZKw * i3];
        }
        int i8 = 0;
        while (i2 < i7) {
            for (int i9 = i; i9 < i6; i9++) {
                int i10 = 0;
                while (i10 < this.zzZKw) {
                    iArr[i8] = zzZ(i9, i2, i10, zzzio);
                    i10++;
                    i8++;
                }
            }
            i2++;
        }
        return iArr;
    }

    public final int zzcN() {
        return this.zzZKw;
    }

    public int zzcO() {
        return this.zzZIP;
    }

    public abstract int[] zzcY();

    public abstract zzZIO zzd0();

    public abstract int zzd1();

    private float zzY(int i, int i2, int i3, zzZIO zzzio) {
        return zzZ(i, i2, i3, zzzio);
    }

    public final void zzY(int i, int i2, int i3, double[] dArr, zzZIO zzzio) {
        int i4;
        int i5;
        int i6 = i + i3;
        int i7 = i2 + 1;
        if (i < 0 || i >= (i4 = this.width) || i3 > i4 || i6 < 0 || i6 > i4 || i2 < 0 || i2 >= (i5 = this.height) || i5 <= 0 || i7 < 0 || i7 > i5) {
            throw new ArrayIndexOutOfBoundsException("Invalid coordinates.");
        }
        int i8 = 0;
        for (int i9 = i2; i9 < i7; i9++) {
            for (int i10 = i; i10 < i6; i10++) {
                int i11 = 0;
                while (i11 < this.zzZKw) {
                    zzZ(i10, i9, i11, dArr[i8], zzzio);
                    i11++;
                    i8++;
                }
            }
        }
    }

    public final double[] zzZ(int i, int i2, int i3, double[] dArr, zzZIO zzzio) {
        int i4;
        int i5;
        int i6 = i + i3;
        int i7 = i2 + 1;
        if (i < 0 || i >= (i4 = this.width) || i3 > i4 || i6 < 0 || i6 > i4 || i2 < 0 || i2 >= (i5 = this.height) || i5 <= 0 || i7 < 0 || i7 > i5) {
            throw new ArrayIndexOutOfBoundsException("Invalid coordinates.");
        }
        if (dArr == null) {
            dArr = new double[this.zzZKw * i3];
        }
        int i8 = 0;
        while (i2 < i7) {
            for (int i9 = i; i9 < i6; i9++) {
                int i10 = 0;
                while (i10 < this.zzZKw) {
                    dArr[i8] = zzX(i9, i2, i10, zzzio);
                    i10++;
                    i8++;
                }
            }
            i2++;
        }
        return dArr;
    }

    public final void zzY(int i, int i2, int i3, float[] fArr, zzZIO zzzio) {
        int i4;
        int i5;
        int i6 = i + i3;
        int i7 = i2 + 1;
        if (i < 0 || i >= (i4 = this.width) || i3 > i4 || i6 < 0 || i6 > i4 || i2 < 0 || i2 >= (i5 = this.height) || i5 <= 0 || i7 < 0 || i7 > i5) {
            throw new ArrayIndexOutOfBoundsException("Invalid coordinates.");
        }
        int i8 = 0;
        for (int i9 = i2; i9 < i7; i9++) {
            for (int i10 = i; i10 < i6; i10++) {
                int i11 = 0;
                while (i11 < this.zzZKw) {
                    zzZ(i10, i9, i11, fArr[i8], zzzio);
                    i11++;
                    i8++;
                }
            }
        }
    }

    public final float[] zzZ(int i, int i2, int i3, float[] fArr, zzZIO zzzio) {
        int i4;
        int i5;
        int i6 = i + i3;
        int i7 = i2 + 1;
        if (i < 0 || i >= (i4 = this.width) || i3 > i4 || i6 < 0 || i6 > i4 || i2 < 0 || i2 >= (i5 = this.height) || i5 <= 0 || i7 < 0 || i7 > i5) {
            throw new ArrayIndexOutOfBoundsException("Invalid coordinates.");
        }
        if (fArr == null) {
            fArr = new float[this.zzZKw * i3];
        }
        int i8 = 0;
        while (i2 < i7) {
            for (int i9 = i; i9 < i6; i9++) {
                int i10 = 0;
                while (i10 < this.zzZKw) {
                    fArr[i8] = zzY(i9, i2, i10, zzzio);
                    i10++;
                    i8++;
                }
            }
            i2++;
        }
        return fArr;
    }

    private void zzZ(int i, int i2, int i3, double d, zzZIO zzzio) {
        zzZ(i, i2, i3, (int) d, zzzio);
    }

    private void zzZ(int i, int i2, int i3, float f, zzZIO zzzio) {
        zzZ(i, i2, i3, (int) f, zzzio);
    }
}
