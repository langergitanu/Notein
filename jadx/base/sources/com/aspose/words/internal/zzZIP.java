package com.aspose.words.internal;

import Oooo0.C20856OooooOo;
import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
public class zzZIP extends zzZIA {
    protected int zzZIR;
    protected int zzZIS;
    protected int zzZIT;
    protected int[] zzZIU;
    protected int[] zzZIV;
    protected int zzZKw;

    private zzZIP(int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        super(i, i2, i3, iArr2.length);
        this.zzZKw = 1;
        this.zzZIT = 1;
        this.zzZIP = i;
        this.zzZIR = i4;
        this.zzZIS = i5;
        this.zzZIV = (int[]) iArr2.clone();
        int[] iArr3 = (int[]) iArr.clone();
        this.zzZIU = iArr3;
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel stride must be >= 0");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Scanline stride must be >= 0");
        }
        if (i < 0 || i > 5) {
            throw new IllegalArgumentException("Unsupported dataType.");
        }
        int i6 = iArr3[0];
        if (i6 < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i6, "Index of bank 0 is less than 0 (", ")"));
        }
        int i7 = 1;
        while (true) {
            int[] iArr4 = this.zzZIU;
            if (i7 >= iArr4.length) {
                this.zzZIT = i6 + 1;
                int[] iArr5 = this.zzZIV;
                this.zzZKw = iArr5.length;
                if (iArr5.length != iArr4.length) {
                    throw new IllegalArgumentException("Length of bandOffsets must equal length of bankIndices.");
                }
                return;
            }
            int i8 = iArr4[i7];
            if (i8 > i6) {
                i6 = i8;
            } else if (i8 < 0) {
                throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Index of bank ", i7, " is less than 0 (", ")", i6));
            }
            i7++;
        }
    }

    private int zzcZ() {
        int iMax = this.zzZIV[0];
        int i = 1;
        while (true) {
            int[] iArr = this.zzZIV;
            if (i >= iArr.length) {
                break;
            }
            iMax = Math.max(iMax, iArr[i]);
            i++;
        }
        if (iMax < 0 || iMax > 2147483646) {
            throw new IllegalArgumentException("Invalid band offset");
        }
        int i2 = this.zzZIR;
        if (i2 >= 0) {
            int i3 = this.width;
            if (i2 <= Integer.MAX_VALUE / i3) {
                int i4 = this.zzZIS;
                if (i4 >= 0) {
                    int i5 = this.height;
                    if (i4 <= Integer.MAX_VALUE / i5) {
                        int i6 = iMax + 1;
                        int i7 = (i3 - 1) * i2;
                        if (i7 > Integer.MAX_VALUE - i6) {
                            throw new IllegalArgumentException("Invalid pixel stride");
                        }
                        int i8 = i6 + i7;
                        int i9 = (i5 - 1) * i4;
                        if (i9 <= Integer.MAX_VALUE - i8) {
                            return i8 + i9;
                        }
                        throw new IllegalArgumentException("Invalid scan stride");
                    }
                }
                throw new IllegalArgumentException("Invalid scanline stride");
            }
        }
        throw new IllegalArgumentException("Invalid pixel stride");
    }

    public final int getPixelStride() {
        return this.zzZIR;
    }

    @Override // com.aspose.words.internal.zzZIA
    public zzZIA zzH(int[] iArr) {
        if (iArr.length > this.zzZIU.length) {
            throw new RuntimeException(C21023OooO0Oo.OooO0OO(" bands", this.zzZIU.length, new StringBuilder("There are only ")));
        }
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = this.zzZIU[iArr[i]];
            iArr3[i] = this.zzZIV[iArr[i]];
        }
        return new zzZIP(this.zzZIP, this.width, this.height, this.zzZIR, this.zzZIS, iArr2, iArr3);
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzPD(int i) {
        return zzZIO.zzPB(this.zzZIP);
    }

    public final int zzYQ(int i, int i2) {
        return (i * this.zzZIR) + (i2 * this.zzZIS) + this.zzZIV[0];
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzZ(int i, int i2, int i3, zzZIO zzzio) {
        if (i < 0 || i2 < 0 || i >= this.width || i2 >= this.height) {
            throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
        }
        return zzzio.zzYP(this.zzZIU[i3], (i * this.zzZIR) + (i2 * this.zzZIS) + this.zzZIV[i3]);
    }

    public final int[] zzcW() {
        return this.zzZIU;
    }

    public final int[] zzcX() {
        return this.zzZIV;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int[] zzcY() {
        int[] iArr = new int[this.zzZKw];
        int iZzPB = zzZIO.zzPB(this.zzZIP);
        for (int i = 0; i < this.zzZKw; i++) {
            iArr[i] = iZzPB;
        }
        return iArr;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final zzZIO zzd0() {
        int iZzcZ = zzcZ();
        int i = this.zzZIP;
        if (i == 0) {
            return new zzZIN(iZzcZ, this.zzZIT);
        }
        if (i == 1) {
            return new zzZII(iZzcZ, this.zzZIT);
        }
        if (i == 2) {
            return new zzZIJ(iZzcZ, this.zzZIT);
        }
        if (i == 3) {
            return new zzZIK(iZzcZ, this.zzZIT);
        }
        if (i == 4) {
            return new zzZIL(iZzcZ, this.zzZIT);
        }
        if (i != 5) {
            return null;
        }
        return new zzZIM(iZzcZ, this.zzZIT);
    }

    @Override // com.aspose.words.internal.zzZIA
    public final int zzd1() {
        return zzcN();
    }

    public final int zzlP() {
        return this.zzZIS;
    }

    @Override // com.aspose.words.internal.zzZIA
    public final void zzZ(int i, int i2, int i3, int i4, zzZIO zzzio) {
        if (i >= 0 && i2 >= 0 && i < this.width && i2 < this.height) {
            zzzio.zzq(this.zzZIU[i3], (i * this.zzZIR) + (i2 * this.zzZIS) + this.zzZIV[i3], i4);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
    }

    @Override // com.aspose.words.internal.zzZIA
    public final Object zzZ(int i, int i2, Object obj, zzZIO zzzio) {
        byte[] bArr;
        short[] sArr;
        int[] iArr;
        float[] fArr;
        double[] dArr;
        if (i >= 0 && i2 >= 0 && i < this.width && i2 < this.height) {
            int iZzcO = zzcO();
            int iZzcN = zzcN();
            int i3 = (i * this.zzZIR) + (i2 * this.zzZIS);
            int i4 = 0;
            if (iZzcO == 0) {
                if (obj == null) {
                    bArr = new byte[iZzcN];
                } else {
                    bArr = (byte[]) obj;
                }
                while (i4 < iZzcN) {
                    bArr[i4] = (byte) zzzio.zzYP(this.zzZIU[i4], this.zzZIV[i4] + i3);
                    i4++;
                }
                return bArr;
            }
            if (iZzcO == 1 || iZzcO == 2) {
                if (obj == null) {
                    sArr = new short[iZzcN];
                } else {
                    sArr = (short[]) obj;
                }
                while (i4 < iZzcN) {
                    sArr[i4] = (short) zzzio.zzYP(this.zzZIU[i4], this.zzZIV[i4] + i3);
                    i4++;
                }
                return sArr;
            }
            if (iZzcO == 3) {
                if (obj == null) {
                    iArr = new int[iZzcN];
                } else {
                    iArr = (int[]) obj;
                }
                while (i4 < iZzcN) {
                    iArr[i4] = zzzio.zzYP(this.zzZIU[i4], this.zzZIV[i4] + i3);
                    i4++;
                }
                return iArr;
            }
            if (iZzcO == 4) {
                if (obj == null) {
                    fArr = new float[iZzcN];
                } else {
                    fArr = (float[]) obj;
                }
                while (i4 < iZzcN) {
                    fArr[i4] = zzzio.zzYP(this.zzZIU[i4], this.zzZIV[i4] + i3);
                    i4++;
                }
                return fArr;
            }
            if (iZzcO != 5) {
                return obj;
            }
            if (obj == null) {
                dArr = new double[iZzcN];
            } else {
                dArr = (double[]) obj;
            }
            while (i4 < iZzcN) {
                dArr[i4] = zzzio.zzYP(this.zzZIU[i4], this.zzZIV[i4] + i3);
                i4++;
            }
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Coordinate out of bounds!");
    }

    public zzZIP(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super(i, i2, i3, iArr.length);
        this.zzZKw = 1;
        this.zzZIT = 1;
        this.zzZIP = i;
        this.zzZIR = i4;
        this.zzZIS = i5;
        int[] iArr2 = (int[]) iArr.clone();
        this.zzZIV = iArr2;
        int length = iArr2.length;
        this.zzZKw = length;
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel stride must be >= 0");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Scanline stride must be >= 0");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Must have at least one band.");
        }
        if (i >= 0 && i <= 5) {
            this.zzZIU = new int[length];
            for (int i6 = 0; i6 < this.zzZKw; i6++) {
                this.zzZIU[i6] = 0;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported dataType.");
    }
}
