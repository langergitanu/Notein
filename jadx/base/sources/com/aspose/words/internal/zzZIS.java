package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZIS {
    static short[] zzZJe;
    static byte[] zzZJf;
    static byte[] zzZJg;
    static byte[] zzZJh;
    protected int zzZJi;
    boolean zzZJj;
    int zzZJk;
    int zzZJl;
    int zzZJm;
    boolean zzZJn;
    boolean zzZJo;
    int[] zzZJp;
    int zzZJq;
    zzZIR zzZJr;
    protected int zzZJs;
    protected int zzZJt;

    public zzZIS(int i, int[] iArr, zzZIR zzzir, boolean z, boolean z2, int i2, int i3) {
        this.zzZJs = 3;
        zzZIR.zzPE(1000);
        this.zzZJq = 5;
        this.zzZJo = true;
        this.zzZJn = false;
        this.zzZJm = -1;
        this.zzZJl = -1;
        this.zzZJj = true;
        this.zzZJr = zzzir;
        this.zzZJq = zzzir.getType();
        int iZzd4 = zzzir.zzd4();
        this.zzZJl = iZzd4;
        int i4 = iZzd4 + (z ? 1 : 0);
        this.zzZJm = i4;
        this.zzZJo = z;
        if (iArr.length < i4) {
            throw new IllegalArgumentException("Number of color/alpha components should be " + this.zzZJm + " but length of bits array is " + iArr.length);
        }
        if (i2 <= 0 || i2 > 3) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "Unknown transparency: "));
        }
        if (z) {
            this.zzZJn = z2;
            this.zzZJs = i2;
        } else {
            this.zzZJn = false;
            this.zzZJs = 1;
        }
        this.zzZJp = (int[]) iArr.clone();
        this.zzZJt = i;
        if (i <= 0) {
            throw new IllegalArgumentException("Number of pixel bits must be > 0");
        }
        this.zzZJk = 0;
        for (int i5 : iArr) {
            if (i5 < 0) {
                throw new IllegalArgumentException("Number of bits must be >= 0");
            }
            if (this.zzZJk < i5) {
                this.zzZJk = i5;
            }
        }
        if (this.zzZJk == 0) {
            throw new IllegalArgumentException("There must be at least one component with > 0 pixel bits.");
        }
        if (zzzir.getType() != 5) {
            this.zzZJj = false;
        }
        this.zzZJi = i3;
    }

    public static int zzPF(int i) {
        if (i <= 8) {
            return 0;
        }
        if (i <= 16) {
            return 1;
        }
        return i <= 32 ? 3 : 32;
    }

    public static boolean zzX(zzZIG zzzig) {
        return zzzig == zzZIR.zzZJc;
    }

    public static byte[] zzY(zzZIG zzzig) {
        if (zzX(zzzig)) {
            return zzd6();
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] zzZ(zzZIG zzzig) {
        if (zzX(zzzig)) {
            return zzd8();
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] zzd6() {
        if (zzZJh == null) {
            zzZJh = new byte[256];
            for (int i = 0; i <= 255; i++) {
                float f = i / 255.0f;
                zzZJh[i] = (byte) Math.round((f <= 0.0031308f ? f * 12.92f : (((float) Math.pow(f, 0.4166666666666667d)) * 1.055f) - 0.055f) * 255.0f);
            }
        }
        return zzZJh;
    }

    public static byte[] zzd7() {
        if (zzZJg == null) {
            zzZJg = new byte[256];
            for (int i = 0; i <= 255; i++) {
                float f = i / 255.0f;
                zzZJg[i] = (byte) Math.round((f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4d)) * 255.0f);
            }
        }
        return zzZJg;
    }

    public static byte[] zzd8() {
        if (zzZJf == null) {
            zzZJf = new byte[65536];
            for (int i = 0; i <= 65535; i++) {
                float f = i / 65535.0f;
                zzZJf[i] = (byte) Math.round((f <= 0.0031308f ? f * 12.92f : (((float) Math.pow(f, 0.4166666666666667d)) * 1.055f) - 0.055f) * 255.0f);
            }
        }
        return zzZJf;
    }

    public static short[] zzd9() {
        if (zzZJe == null) {
            zzZJe = new short[256];
            for (int i = 0; i <= 255; i++) {
                float f = i / 255.0f;
                zzZJe[i] = (short) Math.round((f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4d)) * 65535.0f);
            }
        }
        return zzZJe;
    }

    public final boolean hasAlpha() {
        return this.zzZJo;
    }

    public abstract int zz0(int i);

    public final float[] zzI(int[] iArr) {
        if (this.zzZJr == null) {
            throw new UnsupportedOperationException("This method is not supported by this color model.");
        }
        if (this.zzZJp == null) {
            throw new UnsupportedOperationException("This method is not supported.  Unable to determine #bits per component.");
        }
        int length = iArr.length;
        int i = this.zzZJm;
        if (length < i) {
            throw new IllegalArgumentException("Incorrect number of components.  Expecting " + this.zzZJm);
        }
        float[] fArr = new float[i];
        int i2 = 0;
        if (!this.zzZJo || !this.zzZJn) {
            while (i2 < this.zzZJm) {
                fArr[i2] = iArr[i2] / ((1 << this.zzZJp[i2]) - 1);
                i2++;
            }
            return fArr;
        }
        int i3 = this.zzZJl;
        float f = iArr[i3] / ((1 << r0[i3]) - 1);
        if (f != 0.0f) {
            while (i2 < this.zzZJl) {
                fArr[i2] = iArr[i2] / (((1 << this.zzZJp[i2]) - 1) * f);
                i2++;
            }
        } else {
            while (i2 < this.zzZJl) {
                fArr[i2] = 0.0f;
                i2++;
            }
        }
        fArr[this.zzZJl] = f;
        return fArr;
    }

    public int zzPG(int i) {
        return zzZY(i) | (zzZX(i) << 24) | (zz0(i) << 16) | (zzZZ(i) << 8);
    }

    public zzZIA zzYR(int i, int i2) {
        throw new UnsupportedOperationException("This method is not supported by this color model");
    }

    public int zzZN(Object obj) {
        return zzZO(obj) | (zzZR(obj) << 24) | (zzZQ(obj) << 16) | (zzZP(obj) << 8);
    }

    public int zzZO(Object obj) {
        int i;
        int length;
        int i2 = this.zzZJi;
        if (i2 == 0) {
            byte[] bArr = (byte[]) obj;
            i = bArr[0] & 255;
            length = bArr.length;
        } else if (i2 == 1) {
            short[] sArr = (short[]) obj;
            i = sArr[0] & 65535;
            length = sArr.length;
        } else {
            if (i2 != 3) {
                throw new UnsupportedOperationException("This method has not been implemented for transferType " + this.zzZJi);
            }
            int[] iArr = (int[]) obj;
            i = iArr[0];
            length = iArr.length;
        }
        if (length == 1) {
            return zzZY(i);
        }
        throw new UnsupportedOperationException("This method is not supported by this color model");
    }

    public int zzZP(Object obj) {
        int i;
        int length;
        int i2 = this.zzZJi;
        if (i2 == 0) {
            byte[] bArr = (byte[]) obj;
            i = bArr[0] & 255;
            length = bArr.length;
        } else if (i2 == 1) {
            short[] sArr = (short[]) obj;
            i = sArr[0] & 65535;
            length = sArr.length;
        } else {
            if (i2 != 3) {
                throw new UnsupportedOperationException("This method has not been implemented for transferType " + this.zzZJi);
            }
            int[] iArr = (int[]) obj;
            i = iArr[0];
            length = iArr.length;
        }
        if (length == 1) {
            return zzZZ(i);
        }
        throw new UnsupportedOperationException("This method is not supported by this color model");
    }

    public int zzZQ(Object obj) {
        int i;
        int length;
        int i2 = this.zzZJi;
        if (i2 == 0) {
            byte[] bArr = (byte[]) obj;
            i = bArr[0] & 255;
            length = bArr.length;
        } else if (i2 == 1) {
            short[] sArr = (short[]) obj;
            i = sArr[0] & 65535;
            length = sArr.length;
        } else {
            if (i2 != 3) {
                throw new UnsupportedOperationException("This method has not been implemented for transferType " + this.zzZJi);
            }
            int[] iArr = (int[]) obj;
            i = iArr[0];
            length = iArr.length;
        }
        if (length == 1) {
            return zz0(i);
        }
        throw new UnsupportedOperationException("This method is not supported by this color model");
    }

    public int zzZR(Object obj) {
        int i;
        int length;
        int i2 = this.zzZJi;
        if (i2 == 0) {
            byte[] bArr = (byte[]) obj;
            i = bArr[0] & 255;
            length = bArr.length;
        } else if (i2 == 1) {
            short[] sArr = (short[]) obj;
            i = sArr[0] & 65535;
            length = sArr.length;
        } else {
            if (i2 != 3) {
                throw new UnsupportedOperationException("This method has not been implemented for transferType " + this.zzZJi);
            }
            int[] iArr = (int[]) obj;
            i = iArr[0];
            length = iArr.length;
        }
        if (length == 1) {
            return zzZX(i);
        }
        throw new UnsupportedOperationException("This method is not supported by this color model");
    }

    public abstract int zzZX(int i);

    public abstract int zzZY(int i);

    public abstract int zzZZ(int i);

    public final zzZIR zzd5() {
        return this.zzZJr;
    }

    public static boolean zzZ(zzZIR zzzir) {
        return zzzir == zzZIR.zzZJb;
    }
}
