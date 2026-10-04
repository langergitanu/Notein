package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import com.aspose.slides.C22226Oooo0oo;

/* JADX INFO: loaded from: classes5.dex */
public class zzZIC extends zzZIS {
    float[] zzZI8;
    int[] zzZI9;
    int[] zzZIa;

    public zzZIC(zzZIR zzzir, int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        super(32, zzO(i2, i3, i4, i5), zzzir, i5 != 0, z, i6, i7);
        if (zzzir.getType() != 5) {
            throw new IllegalArgumentException("ColorSpace must be TYPE_RGB.");
        }
        int i8 = this.zzZJm;
        this.zzZIa = new int[i8];
        this.zzZI9 = new int[i8];
        this.zzZI8 = new float[i8];
        zzW(i2, 0, "red");
        zzW(i3, 1, "green");
        zzW(i4, 2, "blue");
        if (i5 != 0) {
            zzW(i5, 3, "alpha");
            if (this.zzZJp[3] == 1) {
                this.zzZJs = 2;
            }
        }
    }

    private static final int[] zzO(int i, int i2, int i3, int i4) {
        int[] iArr = new int[(i4 == 0 ? 0 : 1) + 3];
        iArr[0] = zzPx(i);
        iArr[1] = zzPx(i2);
        int iZzPx = zzPx(i3);
        iArr[2] = iZzPx;
        if (iArr[0] < 0) {
            throw new IllegalArgumentException(androidx.core.graphics.OooO0O0.OooO00o(i, new StringBuilder("Noncontiguous red mask (")));
        }
        if (iArr[1] < 0) {
            throw new IllegalArgumentException(androidx.core.graphics.OooO0O0.OooO00o(i2, new StringBuilder("Noncontiguous green mask (")));
        }
        if (iZzPx < 0) {
            throw new IllegalArgumentException(androidx.core.graphics.OooO0O0.OooO00o(i3, new StringBuilder("Noncontiguous blue mask (")));
        }
        if (i4 != 0) {
            int iZzPx2 = zzPx(i4);
            iArr[3] = iZzPx2;
            if (iZzPx2 < 0) {
                throw new IllegalArgumentException(androidx.core.graphics.OooO0O0.OooO00o(i4, new StringBuilder("Noncontiguous alpha mask (")));
            }
        }
        return iArr;
    }

    private static final int zzPx(int i) {
        int i2 = 0;
        if (i != 0) {
            while ((i & 1) == 0) {
                i >>>= 1;
            }
            while ((i & 1) == 1) {
                i >>>= 1;
                i2++;
            }
        }
        if (i != 0) {
            return -1;
        }
        return i2;
    }

    private void zzW(int i, int i2, String str) {
        int i3 = this.zzZJp[i2];
        this.zzZIa[i2] = i;
        int i4 = 0;
        if (i != 0) {
            while ((i & 1) == 0) {
                i >>>= 1;
                i4++;
            }
        }
        if (i4 + i3 > this.zzZJt) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " mask ");
            sbOooO0OO.append(Integer.toHexString(this.zzZIa[i2]));
            sbOooO0OO.append(" overflows pixel (expecting ");
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" bits", this.zzZJt, sbOooO0OO));
        }
        this.zzZI9[i2] = i4;
        if (i3 == 0) {
            this.zzZI8[i2] = 256.0f;
        } else {
            this.zzZI8[i2] = 255.0f / ((1 << i3) - 1);
        }
    }

    @Override // com.aspose.words.internal.zzZIS
    public int zz0(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZIS
    public final zzZIA zzYR(int i, int i2) {
        return new zzZI8(this.zzZJi, i, i2, this.zzZIa);
    }

    @Override // com.aspose.words.internal.zzZIS
    public int zzZX(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZIS
    public int zzZY(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZIS
    public int zzZZ(int i) {
        throw new UnsupportedOperationException();
    }
}
