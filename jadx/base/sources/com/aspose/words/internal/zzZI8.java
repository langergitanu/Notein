package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZI8 extends zzZIA {
    private int zzZI2;
    private int[] zzZI3;
    private int[] zzZI4;
    private int[] zzZI5;
    private int zzZIS;

    public zzZI8(int i, int i2, int i3, int[] iArr) {
        this(i, i2, i3, i2, iArr);
        if (i != 0 && i != 1 && i != 3) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Unsupported data type "));
        }
    }

    private long zzcL() {
        return ((this.height - 1) * this.zzZIS) + this.width;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final zzZIA zzH(int[] iArr) {
        if (iArr.length > this.zzZKw) {
            throw new RuntimeException(C21023OooO0Oo.OooO0OO(" bands", this.zzZKw, new StringBuilder("There are only ")));
        }
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = this.zzZI5[iArr[i]];
        }
        return new zzZI8(this.zzZIP, this.width, this.height, this.zzZIS, iArr2);
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzPD(int i) {
        return this.zzZI3[i];
    }

    public final int zzYQ(int i, int i2) {
        return (i2 * this.zzZIS) + i;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final void zzZ(int i, int i2, int i3, int i4, zzZIO zzzio) {
        if (i < 0 || i2 < 0 || i >= this.width || i2 >= this.height) {
            throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
        }
        int iZzPC = zzzio.zzPC((this.zzZIS * i2) + i);
        int i5 = this.zzZI5[i3];
        zzzio.zzq(0, (i2 * this.zzZIS) + i, ((i4 << this.zzZI4[i3]) & i5) | (iZzPC & (~i5)));
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int[] zzcY() {
        return (int[]) this.zzZI3.clone();
    }

    @Override // com.aspose.words.internal.zzZIA
    public final zzZIO zzd0() {
        int iZzcL = (int) zzcL();
        int i = this.zzZIP;
        if (i == 0) {
            return new zzZIN(iZzcL);
        }
        if (i == 1) {
            return new zzZII(iZzcL);
        }
        if (i != 3) {
            return null;
        }
        return new zzZIK(iZzcL);
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzd1() {
        return 1;
    }

    public final int zzlP() {
        return this.zzZIS;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzZ(int i, int i2, int i3, zzZIO zzzio) {
        if (i >= 0 && i2 >= 0 && i < this.width && i2 < this.height) {
            return (zzzio.zzPC((i2 * this.zzZIS) + i) & this.zzZI5[i3]) >>> this.zzZI4[i3];
        }
        throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
    }

    private zzZI8(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        super(i, i2, i3, iArr.length);
        if (i != 0 && i != 1 && i != 3) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Unsupported data type "));
        }
        this.zzZIP = i;
        this.zzZI5 = (int[]) iArr.clone();
        this.zzZIS = i4;
        int i6 = this.zzZKw;
        this.zzZI4 = new int[i6];
        this.zzZI3 = new int[i6];
        int iZzPB = (int) ((1 << zzZIO.zzPB(i)) - 1);
        this.zzZI2 = 0;
        for (int i7 = 0; i7 < this.zzZKw; i7++) {
            int[] iArr2 = this.zzZI5;
            int i8 = iArr2[i7] & iZzPB;
            iArr2[i7] = i8;
            int i9 = 0;
            if (i8 != 0) {
                while ((i8 & 1) == 0) {
                    i8 >>>= 1;
                    i9++;
                }
                i5 = 0;
                while ((i8 & 1) == 1) {
                    i8 >>>= 1;
                    i5++;
                }
                if (i8 != 0) {
                    throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" must be contiguous", iArr[i7], new StringBuilder("Mask ")));
                }
            } else {
                i5 = 0;
            }
            this.zzZI4[i7] = i9;
            this.zzZI3[i7] = i5;
            if (i5 > this.zzZI2) {
                this.zzZI2 = i5;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZIA
    public final Object zzZ(int i, int i2, Object obj, zzZIO zzzio) {
        byte[] bArr;
        short[] sArr;
        int[] iArr;
        if (i >= 0 && i2 >= 0 && i < this.width && i2 < this.height) {
            int iZzcO = zzcO();
            if (iZzcO == 0) {
                if (obj == null) {
                    bArr = new byte[1];
                } else {
                    bArr = (byte[]) obj;
                }
                bArr[0] = (byte) zzzio.zzPC((i2 * this.zzZIS) + i);
                return bArr;
            }
            if (iZzcO == 1) {
                if (obj == null) {
                    sArr = new short[1];
                } else {
                    sArr = (short[]) obj;
                }
                sArr[0] = (short) zzzio.zzPC((i2 * this.zzZIS) + i);
                return sArr;
            }
            if (iZzcO != 3) {
                return obj;
            }
            if (obj == null) {
                iArr = new int[1];
            } else {
                iArr = (int[]) obj;
            }
            iArr[0] = zzzio.zzPC((i2 * this.zzZIS) + i);
            return iArr;
        }
        throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
    }
}
