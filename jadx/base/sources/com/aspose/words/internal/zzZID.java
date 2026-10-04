package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZID extends zzZIA {
    int zzZIS;
    int zzZIb;
    int zzZIc;
    int zzZId;
    int zzZIe;
    int zzZIf;

    public zzZID(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, ((zzZIO.zzPB(i) + (i2 * i4)) - 1) / zzZIO.zzPB(i));
        if (i != 0 && i != 1 && i != 3) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Unsupported data type "));
        }
    }

    @Override // com.aspose.words.internal.zzZIA
    public final zzZIA zzH(int[] iArr) {
        if (iArr == null || iArr.length == 1) {
            return zzYR(this.width, this.height);
        }
        throw new RuntimeException("MultiPixelPackedSampleModel has only one band.");
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzPD(int i) {
        return this.zzZIf;
    }

    public final int zzYQ(int i, int i2) {
        return (((i * this.zzZIf) + this.zzZIb) / this.zzZIc) + (i2 * this.zzZIS);
    }

    @Override // com.aspose.words.internal.zzZIA
    public final zzZIA zzYR(int i, int i2) {
        return new zzZID(this.zzZIP, i, i2, this.zzZIf);
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzZ(int i, int i2, int i3, zzZIO zzzio) {
        if (i < 0 || i2 < 0 || i >= this.width || i2 >= this.height || i3 != 0) {
            throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
        }
        int i4 = (i * this.zzZIf) + this.zzZIb;
        int iZzPC = zzzio.zzPC((i4 / this.zzZIc) + (i2 * this.zzZIS));
        int i5 = this.zzZIc;
        return (iZzPC >> ((i5 - (i4 & (i5 - 1))) - this.zzZIf)) & this.zzZIe;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzcO() {
        int i = this.zzZIf;
        if (i > 16) {
            return 3;
        }
        return i > 8 ? 1 : 0;
    }

    public final int zzcP() {
        return this.zzZIb;
    }

    public final int zzcQ() {
        return this.zzZIf;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int[] zzcY() {
        return new int[]{this.zzZIf};
    }

    @Override // com.aspose.words.internal.zzZIA
    public final zzZIO zzd0() {
        int i = this.zzZIS * this.height;
        int i2 = this.zzZIP;
        if (i2 == 0) {
            return new zzZIN(((this.zzZIb + 7) / 8) + i);
        }
        if (i2 == 1) {
            return new zzZII(((this.zzZIb + 15) / 16) + i);
        }
        if (i2 != 3) {
            return null;
        }
        return new zzZIK(((this.zzZIb + 31) / 32) + i);
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzd1() {
        return 1;
    }

    public final int zzlP() {
        return this.zzZIS;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final void zzZ(int i, int i2, int i3, int i4, zzZIO zzzio) {
        if (i >= 0 && i2 >= 0 && i < this.width && i2 < this.height && i3 == 0) {
            int i5 = this.zzZIb;
            int i6 = this.zzZIf;
            int i7 = (i * i6) + i5;
            int i8 = i2 * this.zzZIS;
            int i9 = this.zzZIc;
            int i10 = (i7 / i9) + i8;
            int i11 = (i9 - (i7 & (i9 - 1))) - i6;
            int iZzPC = zzzio.zzPC(i10);
            int i12 = this.zzZIe;
            zzzio.zzq(0, i10, (iZzPC & (~(i12 << i11))) | ((i12 & i4) << i11));
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
    }

    private zzZID(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, 1);
        if (i != 0 && i != 1 && i != 3) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Unsupported data type "));
        }
        this.zzZIP = i;
        this.zzZIf = i4;
        this.zzZIS = i5;
        this.zzZIb = 0;
        int iZzPB = zzZIO.zzPB(i);
        this.zzZIc = iZzPB;
        int i6 = iZzPB / i4;
        this.zzZId = i6;
        if (i6 * i4 == iZzPB) {
            this.zzZIe = (1 << i4) - 1;
            return;
        }
        throw new RuntimeException("MultiPixelPackedSampleModel does not allow pixels to span data element boundaries");
    }

    @Override // com.aspose.words.internal.zzZIA
    public final Object zzZ(int i, int i2, Object obj, zzZIO zzzio) {
        byte[] bArr;
        short[] sArr;
        int[] iArr;
        if (i >= 0 && i2 >= 0 && i < this.width && i2 < this.height) {
            int iZzcO = zzcO();
            int i3 = this.zzZIb;
            int i4 = this.zzZIf;
            int i5 = (i * i4) + i3;
            int i6 = this.zzZIc;
            int i7 = (i6 - ((i6 - 1) & i5)) - i4;
            if (iZzcO == 0) {
                if (obj == null) {
                    bArr = new byte[1];
                } else {
                    bArr = (byte[]) obj;
                }
                bArr[0] = (byte) ((zzzio.zzPC((i5 / i6) + (i2 * this.zzZIS)) >> i7) & this.zzZIe);
                return bArr;
            }
            if (iZzcO == 1) {
                if (obj == null) {
                    sArr = new short[1];
                } else {
                    sArr = (short[]) obj;
                }
                sArr[0] = (short) ((zzzio.zzPC((i5 / i6) + (i2 * this.zzZIS)) >> i7) & this.zzZIe);
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
            iArr[0] = (zzzio.zzPC((i5 / i6) + (i2 * this.zzZIS)) >> i7) & this.zzZIe;
            return iArr;
        }
        throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
    }
}
