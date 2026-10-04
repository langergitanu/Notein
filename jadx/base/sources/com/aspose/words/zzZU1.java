package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZU1 extends zzZTQ {
    private byte[] zzVg;
    private int zzYKB;
    private int zzYKC;
    private int zzYWE;

    public zzZU1(int i, int i2) {
        super(i, i2);
    }

    private static boolean zzEn(int i) {
        return i >= 0 && i <= 127;
    }

    public static zzYM2 zzEo(int i) {
        if ((Integer.MIN_VALUE & i) != 0) {
            int i2 = Integer.MAX_VALUE & i;
            if (zzEn(i2)) {
                return new zzYM2(i2, true);
            }
        }
        return new zzYM2(i, false);
    }

    private static zzYM2 zzX(com.aspose.words.internal.zzZOX zzzox, boolean z) throws Exception {
        return new zzYM2(zzzox.zzXc(), z);
    }

    public static int zzZ(zzYM2 zzym2) {
        int value = zzym2.getValue();
        return (zzym2.zzYnC() && zzEn(value)) ? Integer.MIN_VALUE | value : value;
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzC(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (zzZiF() == 0) {
            return;
        }
        this.zzYKC = zzzox.zzX9() & 65535;
        this.zzYKB = zzzox.zzX9() & 65535;
        int iZzX9 = zzzox.zzX9() & 65535;
        this.zzYWE = iZzX9;
        if (iZzX9 == 65520) {
            this.zzYWE = 4;
        }
        this.zzVg = zzzox.zzn(this.zzYKC * this.zzYWE);
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzS(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzK((short) this.zzYKC);
        zzzow.zzK((short) this.zzYKB);
        zzzow.zzK((short) this.zzYWE);
        zzzow.writeBytes(this.zzVg);
    }

    public final int[] zzZiN() throws Exception {
        if (this.zzYKC == 0) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
            int i = this.zzYKC;
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = zzzox.zzXc();
            }
            return iArr;
        } finally {
            zzzor.close();
        }
    }

    public final zzYM6[] zzZiO() throws Exception {
        if (this.zzYKC == 0) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
            int i = this.zzYKC;
            zzYM6[] zzym6Arr = new zzYM6[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzym6Arr[i2] = zzZTF.zzE8(zzzox.zzX9() & 65535);
            }
            return zzym6Arr;
        } finally {
            zzzor.close();
        }
    }

    public final zzZLU[] zzZiP() throws Exception {
        if (this.zzYKC == 0) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
            int i = this.zzYKC;
            zzZLU[] zzzluArr = new zzZLU[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzZLU zzzlu = new zzZLU();
                zzzlu.zzYvt = zzzox.readByte() & 255;
                zzzlu.zzZjA = zzzox.readByte() & 255;
                zzzlu.zzYvs = zzzox.zzXa();
                zzzlu.zzYvr = zzzox.zzXa();
                zzzlu.zzYvq = zzzox.zzXa();
                zzzluArr[i2] = zzzlu;
            }
            return zzzluArr;
        } finally {
            zzzor.close();
        }
    }

    public final zzYM4[] zzZiQ() throws Exception {
        if (this.zzYWE == 0) {
            return new zzYM4[0];
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            zzYM4[] zzym4Arr = new zzYM4[this.zzYKC];
            for (int i = 0; i < this.zzYKC; i++) {
                com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
                zzYM4 zzym4 = new zzYM4();
                zzym4.zzXFj = zzEo(zzzox.zzXc());
                zzym4.zzXFi = zzEo(zzzox.zzXc());
                zzym4.zzXFh = zzEo(zzzox.zzXc());
                zzym4.zzXFg = zzEo(zzzox.zzXc());
                zzym4Arr[i] = zzym4;
            }
            return zzym4Arr;
        } finally {
            zzzor.close();
        }
    }

    public final zzZL3[] zzZiR() throws Exception {
        if (this.zzYKC == 0) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
            int i = this.zzYKC;
            zzZL3[] zzzl3Arr = new zzZL3[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzZL3 zzzl3 = new zzZL3();
                int iZzXc = zzzox.zzXc();
                boolean z = true;
                zzzl3.zzYu8 = (iZzXc & 8192) != 0;
                zzzl3.zzYu7 = (iZzXc & 32) != 0;
                zzzl3.zzYu6 = (iZzXc & 16) != 0;
                zzzl3.zzYu5 = (iZzXc & 8) != 0;
                zzzl3.zzYu4 = (iZzXc & 4) != 0;
                zzzl3.zzYu2 = (iZzXc & 2) != 0;
                zzzl3.zzYu3 = (iZzXc & 1) != 0;
                zzzl3.zzYu1 = new zzZL1(zzX(zzzox, true).getValue());
                zzzl3.zzYu0 = new zzZL1(zzX(zzzox, true).getValue());
                zzzl3.zzYtZ = zzX(zzzox, (iZzXc & 2048) != 0);
                zzzl3.zzYtY = zzX(zzzox, (iZzXc & 4096) != 0);
                zzzl3.zzYtX = zzX(zzzox, (iZzXc & 128) != 0);
                zzzl3.zzYtW = zzX(zzzox, (iZzXc & 256) != 0);
                zzzl3.zzYtV = zzX(zzzox, (iZzXc & 512) != 0);
                if ((iZzXc & 1024) == 0) {
                    z = false;
                }
                zzzl3.zzYtU = zzX(zzzox, z);
                zzzl3Arr[i2] = zzzl3;
            }
            return zzzl3Arr;
        } finally {
            zzzor.close();
        }
    }

    public final zzYM5[] zzZiS() throws Exception {
        if (this.zzYKC == 0) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
            int i = this.zzYKC;
            zzYM5[] zzym5Arr = new zzYM5[i];
            int i2 = this.zzYWE;
            int i3 = 0;
            if (i2 == 4) {
                while (i3 < i) {
                    zzym5Arr[i3] = new zzYM5(zzzox.zzX9() & 65535, 65535 & zzzox.zzX9());
                    i3++;
                }
            } else {
                if (i2 != 8) {
                    throw new IllegalStateException("Unknown format for shape path.");
                }
                while (i3 < i) {
                    zzym5Arr[i3] = new zzYM5(zzEo(zzzox.zzXc()), zzEo(zzzox.zzXc()));
                    i3++;
                }
            }
            zzzor.close();
            return zzym5Arr;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    public final zzJW[] zzZiT() throws Exception {
        if (this.zzYKC == 0) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
            int i = this.zzYKC;
            zzJW[] zzjwArr = new zzJW[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzJW zzjw = new zzJW();
                zzjw.zzZj2 = zzzox.zzXc();
                zzjw.zzZj1 = zzzox.zzXc();
                zzjw.zzZj0 = zzzox.zzXc();
                zzjwArr[i2] = zzjw;
            }
            return zzjwArr;
        } finally {
            zzzor.close();
        }
    }

    public final zzZLE[] zzZiU() throws Exception {
        if (this.zzYKC == 0) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
            int i = this.zzYKC;
            zzZLE[] zzzleArr = new zzZLE[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzZLE zzzle = new zzZLE();
                zzzle.zzYuy = zzY0E.zzhI(zzzox.zzXc());
                zzzle.zzZfb = zzzox.zzXc();
                zzzleArr[i2] = zzzle;
            }
            return zzzleArr;
        } finally {
            zzzor.close();
        }
    }

    private zzZU1(int i, int i2, int i3) {
        super(i, (i2 * i3) + 6);
        this.zzYKC = i2;
        this.zzYKB = i2;
        this.zzYWE = i3;
        this.zzVg = new byte[i3 * i2];
    }

    public zzZU1(int i, zzZLE[] zzzleArr) throws Exception {
        this(i, zzzleArr.length, 8);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
            for (int i2 = 0; i2 < zzzleArr.length; i2++) {
                zzzow.zzl(zzY0E.zzZD(zzzleArr[i2].zzYuy));
                zzzow.zzl(zzzleArr[i2].zzZfb);
            }
        } finally {
            zzzor.close();
        }
    }

    public zzZU1(int i, zzJW[] zzjwArr) throws Exception {
        this(i, zzjwArr.length, 12);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
            for (int i2 = 0; i2 < zzjwArr.length; i2++) {
                zzzow.zzl(zzjwArr[i2].zzZj2);
                zzzow.zzl(zzjwArr[i2].zzZj1);
                zzzow.zzl(zzjwArr[i2].zzZj0);
            }
        } finally {
            zzzor.close();
        }
    }

    public zzZU1(int i, zzYM5[] zzym5Arr) throws Exception {
        this(i, zzym5Arr.length, 8);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
            for (int i2 = 0; i2 < zzym5Arr.length; i2++) {
                zzzow.zzl(zzZ(zzym5Arr[i2].zzYnG()));
                zzzow.zzl(zzZ(zzym5Arr[i2].zzYnF()));
            }
        } finally {
            zzzor.close();
        }
    }

    public zzZU1(int i, zzZLU[] zzzluArr) throws Exception {
        this(i, zzzluArr.length, 8);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
            for (int i2 = 0; i2 < zzzluArr.length; i2++) {
                zzzow.writeByte((byte) zzzluArr[i2].zzYvt);
                zzzow.writeByte((byte) zzzluArr[i2].zzZjA);
                zzzow.zzK((short) zzzluArr[i2].zzYvs);
                zzzow.zzK((short) zzzluArr[i2].zzYvr);
                zzzow.zzK((short) zzzluArr[i2].zzYvq);
            }
        } finally {
            zzzor.close();
        }
    }

    public zzZU1(int i, zzZL3[] zzzl3Arr) throws Exception {
        this(i, zzzl3Arr.length, 36);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
            for (int i2 = 0; i2 < zzzl3Arr.length; i2++) {
                zzzow.zzl(zzzl3Arr[i2].getFlags());
                zzzow.zzl(zzzl3Arr[i2].zzYu1.zzZ51());
                zzzow.zzl(zzzl3Arr[i2].zzYu0.zzZ51());
                zzzow.zzl(zzzl3Arr[i2].zzYtZ.getValue());
                zzzow.zzl(zzzl3Arr[i2].zzYtY.getValue());
                zzzow.zzl(zzzl3Arr[i2].zzYtX.getValue());
                zzzow.zzl(zzzl3Arr[i2].zzYtW.getValue());
                zzzow.zzl(zzzl3Arr[i2].zzYtV.getValue());
                zzzow.zzl(zzzl3Arr[i2].zzYtU.getValue());
            }
        } finally {
            zzzor.close();
        }
    }

    public zzZU1(int i, zzYM4[] zzym4Arr) throws Exception {
        this(i, zzym4Arr.length, 16);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
            for (zzYM4 zzym4 : zzym4Arr) {
                zzzow.zzl(zzZ(zzym4.zzXFj));
                zzzow.zzl(zzZ(zzym4.zzXFi));
                zzzow.zzl(zzZ(zzym4.zzXFh));
                zzzow.zzl(zzZ(zzym4.zzXFg));
            }
        } finally {
            zzzor.close();
        }
    }

    public zzZU1(int i, int[] iArr) throws Exception {
        this(i, iArr.length, 4);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
            for (int i2 : iArr) {
                zzzow.zzl(i2);
            }
        } finally {
            zzzor.close();
        }
    }

    public zzZU1(int i, zzYM6[] zzym6Arr) throws Exception {
        this(i, zzym6Arr.length, 2);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(this.zzVg);
        try {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
            for (zzYM6 zzym6 : zzym6Arr) {
                zzzow.zzJ((short) zzZTF.zzZ(zzym6));
            }
        } finally {
            zzzor.close();
        }
    }
}
