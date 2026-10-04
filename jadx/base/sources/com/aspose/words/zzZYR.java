package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYR implements Cloneable {
    private int zzYQS;
    private boolean zzYQT;
    private boolean zzYQU;
    private boolean zzYQV;
    private boolean zzZaV;
    private static int[] zzYQQ = {57840, 7439, 52380, 33984, 4364, 3600, 61902, 12606, 6258, 57657, 54287, 34041, 10252, 43370, 20163};
    private static int[][] zzYQP = {new int[]{44796, 19929, 39858, 10053, 20106, 40212, 10761}, new int[]{31585, 63170, 64933, 60267, 50935, 40399, 11199}, new int[]{17763, 35526, 1453, 2906, 5812, 11624, 23248}, new int[]{885, 1770, 3540, 7080, 14160, 28320, 56640}, new int[]{55369, 41139, 20807, 41614, 21821, 43642, 17621}, new int[]{28485, 56970, 44341, 19019, 38038, 14605, 29210}, new int[]{60195, 50791, 40175, 10751, 21502, 43004, 24537}, new int[]{18387, 36774, 3949, 7898, 15796, 31592, 63184}, new int[]{47201, 24803, 49606, 37805, 14203, 28406, 56812}, new int[]{17824, 35648, 1697, 3394, 6788, 13576, 27152}, new int[]{43601, 17539, 35078, 557, EditingLanguage.SYRIAC, 2228, 4456}, new int[]{30388, 60776, 51953, 34243, 7079, 14158, 28316}, new int[]{14128, 28256, 56512, 43425, 17251, 34502, 7597}, new int[]{13105, 26210, 52420, 35241, 883, 1766, 3532}, new int[]{4129, 8258, 16516, 33032, 4657, 9314, 18628}};
    private int zzYQW = -1;
    private zzYMB zzYQR = new zzYMB();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzO0(String str) {
        int iZzXT = 0;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return 0;
        }
        if (str.length() > 15) {
            str = str.substring(0, 15);
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            byte bCharAt = (byte) (65535 & ((short) str.charAt(i)));
            if (bCharAt == 0) {
                bCharAt = (byte) 0;
            }
            bArr[i] = bCharAt;
        }
        int i2 = length - 1;
        int i3 = zzYQQ[i2];
        for (int i4 = 0; i4 < length; i4++) {
            int[] iArr = zzYQP[(15 - length) + i4];
            byte b = bArr[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                if ((b & 1) != 0) {
                    i3 ^= iArr[i5];
                }
                b = (byte) (b >>> 1);
            }
        }
        while (i2 >= 0) {
            iZzXT = zzXT(iZzXT, bArr[i2] & 255);
            i2--;
        }
        return (i3 << 16) | ((zzXT(iZzXT, length) ^ 52811) & 65535);
    }

    private static int zzXT(int i, int i2) {
        return (((i << 1) & 32767) | ((i >> 14) & 1)) ^ i2;
    }

    public final void protect(int i, String str) {
        zzFF(i);
        this.zzYQS = zzO0(str);
        this.zzYQR.zzXFz = null;
    }

    public final boolean validatePassword(String str) {
        int iZzO0 = zzO0(str);
        zzYMB zzymb = new zzYMB();
        if (!this.zzYQR.isEmpty()) {
            zzymb.zzZ(iZzO0, this.zzYQR);
        }
        if (this.zzYQS == iZzO0 || !(this.zzYQR.isEmpty() || zzymb.isEmpty() || !com.aspose.words.internal.zzXC.zzZ(com.aspose.words.internal.zzIL.zz3(this.zzYQR.zzXFz), com.aspose.words.internal.zzIL.zz3(zzymb.zzXFz)))) {
            return true;
        }
        if (!this.zzYQR.isEmpty()) {
            zzymb.zzZ(str, this.zzYQR);
        }
        return (this.zzYQR.isEmpty() || zzymb.isEmpty() || !com.aspose.words.internal.zzXC.zzZ(com.aspose.words.internal.zzIL.zz3(this.zzYQR.zzXFz), com.aspose.words.internal.zzIL.zz3(zzymb.zzXFz))) ? false : true;
    }

    public final void zzFE(int i) {
        this.zzYQS = i;
    }

    public final void zzFF(int i) {
        this.zzYQW = i;
        this.zzYQV = i != -1;
    }

    public final void zzFG(int i) {
        this.zzYQW = i;
    }

    public final void zzFH(int i) {
        zzFF(i);
        if (this.zzYQW != -1 && this.zzYQS == 0 && this.zzYQR.isEmpty()) {
            this.zzYQS = 1454256641;
            this.zzYQR.zzXFz = null;
        }
    }

    public final void zzWt(boolean z) {
        this.zzYQT = z;
    }

    public final void zzWu(boolean z) {
        this.zzYQU = z;
    }

    public final void zzWv(boolean z) {
        this.zzYQV = z;
    }

    public final void zzXG(boolean z) {
        this.zzZaV = z;
    }

    public final boolean zzZIN() {
        return this.zzZaV;
    }

    public final zzYMB zzZo8() {
        return this.zzYQR;
    }

    public final int zzZo9() {
        return this.zzYQS;
    }

    public final boolean zzZoa() {
        return this.zzYQT;
    }

    public final boolean zzZob() {
        return this.zzYQU;
    }

    public final int zzZoc() {
        if (this.zzYQV) {
            return this.zzYQW;
        }
        return -1;
    }

    public final boolean zzZod() {
        return this.zzYQV;
    }

    public final int zzZoe() {
        return this.zzYQW;
    }

    public final void zzZof() {
        if (this.zzYQS == 0 || !this.zzYQR.isEmpty()) {
            return;
        }
        zzYMB zzymb = this.zzYQR;
        zzymb.zzZ(this.zzYQS, zzymb);
    }

    public final zzZYR zzZog() {
        zzZYR zzzyr = (zzZYR) memberwiseClone();
        zzzyr.zzYQR = this.zzYQR.zzYnT();
        return zzzyr;
    }
}
