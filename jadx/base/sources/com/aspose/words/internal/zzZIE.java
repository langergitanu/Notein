package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIE extends zzZIS {
    private boolean zzZIg;
    private int zzZIh;
    private int zzZIi;
    private int zzZIj;
    private int[] zzZIk;
    private static int[] zzZIm = {8, 8, 8};
    private static int[] zzZIl = {8, 8, 8, 8};

    private zzZIE(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(i, zzZIm, zzZIR.zzPE(1000), false, false, 1, zzZIS.zzPF(i));
        this.zzZIh = -1;
        if (i <= 0 || i > 16) {
            throw new IllegalArgumentException("Number of bits must be between 1 and 16.");
        }
        zzZ(i2, bArr, bArr2, bArr3, null);
        zzcR();
    }

    private void zzPy(int i) {
        if (this.zzZJs != i) {
            this.zzZJs = i;
            if (i == 1) {
                this.zzZJo = false;
                this.zzZJm = 3;
                this.zzZJp = zzZIm;
            } else {
                this.zzZJo = true;
                this.zzZJm = 4;
                this.zzZJp = zzZIl;
            }
        }
    }

    private static int zzYI(int i, int i2) {
        return Math.max(Math.max(1 << i, i2), 256);
    }

    private void zzZ(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (i <= 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Map size (", ") must be >= 1"));
        }
        this.zzZIj = i;
        this.zzZIk = new int[zzYI(this.zzZJt, i)];
        boolean z = true;
        int i2 = 1;
        int i3 = 255;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = bArr[i4] & 255;
            int i6 = bArr2[i4] & 255;
            int i7 = bArr3[i4] & 255;
            z = z && i5 == i6 && i6 == i7;
            if (bArr4 != null && (i3 = bArr4[i4] & 255) != 255) {
                if (i3 == 0) {
                    if (i2 == 1) {
                        i2 = 2;
                    }
                    if (this.zzZIh < 0) {
                        this.zzZIh = i4;
                    }
                } else {
                    i2 = 3;
                }
                z = false;
            }
            this.zzZIk[i4] = (i5 << 16) | (i3 << 24) | (i6 << 8) | i7;
        }
        this.zzZIg = z;
        zzPy(i2);
    }

    private final void zzcR() {
        int i = this.zzZJt;
        if (i == 3) {
            i = 4;
        } else if (i > 4 && i < 8) {
            i = 8;
        }
        this.zzZIi = (1 << i) - 1;
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zz0(int i) {
        return (this.zzZIk[i & this.zzZIi] >> 16) & 255;
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzPG(int i) {
        return this.zzZIk[i & this.zzZIi];
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZX(int i) {
        return (this.zzZIk[i & this.zzZIi] >> 24) & 255;
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZY(int i) {
        return this.zzZIk[i & this.zzZIi] & 255;
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZZ(int i) {
        return (this.zzZIk[i & this.zzZIi] >> 8) & 255;
    }

    public zzZIE(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(i, i2, bArr, bArr2, bArr3, null);
    }
}
