package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJG {
    private int zzBF;
    private int zzBG;
    private int zzzV;
    private int zzzW;
    public static zzJG zzzU = new zzJG(0, 0, 0, 0);
    static int[] zzzT = {0, 127, 128, 255, 256, 383, 384, 591, 592, 687, 688, 767, ViewUtils.EDGE_TO_EDGE_FLAGS, 879, 880, 1023, 1024, 1279, 1280, 1327, 1328, 1423, 1424, 1535, TableStyleOptions.DEFAULT_2003, 1791, 1792, 1871, 1872, 1919, 1920, 1983, 1984, 2047, 2304, 2431, 2432, 2559, 2560, 2687, 2688, 2815, 2816, 2943, 2944, 3071, 3072, 3199, 3200, 3327, 3328, 3455, 3456, 3583, 3584, 3711, 3712, 3839, 3840, 4095, 4096, 4255, 4256, 4351, 4352, 4607, 4608, 4991, 4992, 5023, 5024, 5119, 5120, 5759, 5760, 5791, 5792, 5887, 5888, 5919, 5920, 5951, 5952, 5983, 5984, 6015, 6016, 6143, 6144, 6319, 6400, 6479, 6480, 6527, 6528, 6623, 6624, 6655, 6656, 6687, 6912, 7039, 7040, 7103, 7168, 7247, 7248, 7295, 7424, 7551, 7552, 7615, 7616, 7679, 7680, 7935, 7936, 8191, 8192, 8303, 8304, 8351, 8352, 8399, 8400, 8447, 8448, 8527, 8528, 8591, 8592, 8703, 8704, 8959, 8960, 9215, 9216, 9279, 9280, 9311, 9312, 9471, 9472, 9599, 9600, 9631, 9632, 9727, 9728, 9983, 9984, 10175, 10176, 10223, 10224, 10239, 10240, 10495, 10496, 10623, 10624, 10751, 10752, 11007, 11008, 11263, 11264, 11359, 11360, 11391, 11392, 11519, 11520, 11567, 11568, 11647, 11648, 11743, 11744, 11775, 11776, 11903, 11904, 12031, 12032, 12255, 12272, StyleIdentifier.NIL, 12288, 12351, 12352, 12447, 12448, 12543, 12544, 12591, 12592, 12687, 12688, 12703, 12704, 12735, 12736, 12783, 12784, 12799, 12800, 13055, 13056, 13311, 13312, 19903, 19904, 19967, 19968, 40959, 40960, 42127, 42128, 42191, 42240, 42559, 42560, 42655, 42752, 42783, 42784, 43007, 43008, 43055, 43072, 43135, 43136, 43231, 43264, 43311, 43312, 43359, 43520, 43615, 44032, 55215, 55296, 57343, 57344, 63743, 63744, 64255, 64256, 64335, 64336, 65023, 65024, 65039, 65040, 65055, 65056, 65071, 65072, 65103, 65104, 65135, 65136, 65279, 65280, 65519, 65520, 65535, 65536, 65663, 65664, 65791, 65792, 65855, 65856, 65935, 65936, 65999, 66000, 66047, 66176, 66207, 66208, 66271, 66304, 66351, 66352, 66383, 66432, 66463, 66464, 66527, 66560, 66639, 66640, 66687, 66688, 66735, 67584, 67647, 67840, 67871, 67872, 67903, 68096, 68191, 73728, 74751, 74752, 74879, 118784, 119039, 119040, 119295, 119296, 119375, 119552, 119647, 119648, 119679, 119808, 120831, 126976, 127023, 127024, 127135, 131072, 173791, 194560, 195103, 917504, 917631, 917760, 917999, 1044480, 1048573, 1048576, 1114109};
    static int[] zzzS = {0, 1, 2, 3, 4, 5, 6, 7, 9, 9, 10, 11, 13, 71, 13, 72, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 73, 24, 25, 70, 74, 26, 28, 75, 75, 76, 77, 78, 79, 84, 84, 84, 84, 80, 81, 93, 94, 95, 80, 96, 27, 112, 113, 114, 4, 4, 6, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 38, 37, 82, 37, 38, 38, 37, 97, 29, 8, 26, 98, 75, 9, 31, 59, 59, 59, 48, 49, 50, 51, 52, 59, 51, 61, 50, 54, 55, 59, 99, 59, 83, 83, 12, 9, 5, 29, 100, 53, 115, 116, 117, 118, 56, 57, 60, 61, 62, 63, 91, 65, 64, 65, 66, 67, 68, 69, 101, 101, 101, 102, 119, 120, 121, 121, 85, 86, 103, 104, 87, 105, 106, 107, 58, 121, 108, 110, 110, 88, 88, 88, 109, 111, 89, 122, 122, 59, 61, 92, 91, 90, 90};

    public zzJG(int i, int i2, int i3, int i4) {
        this.zzBG = i;
        this.zzBF = i2;
        this.zzzW = i3;
        this.zzzV = i4;
    }

    private static int zzWK(int i) {
        int[] iArr = zzzT;
        int iBinarySearch = zzZ1.binarySearch(iArr, 0, iArr.length, i);
        if (iBinarySearch >= 0) {
            return zzzS[iBinarySearch / 2];
        }
        if (iBinarySearch >= 0) {
            return -1;
        }
        int i2 = ~iBinarySearch;
        int[] iArr2 = zzzT;
        if (i2 >= iArr2.length) {
            return -1;
        }
        int i3 = i2 / 2;
        if (i2 % 2 != 0 || i2 <= 0 || iArr2[i2] - iArr2[i2 - 1] <= 1) {
            return zzzS[i3];
        }
        return -1;
    }

    private boolean zzY(zzJG zzjg) {
        return this.zzBG == zzjg.zzBG && this.zzBF == zzjg.zzBF && this.zzzW == zzjg.zzzW && this.zzzV == zzjg.zzzV;
    }

    public final boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzJG.class) {
            return false;
        }
        return zzY((zzJG) obj);
    }

    public final int hashCode() {
        return (((((((int) (((long) this.zzBG) & 4294967295L)) * 397) ^ ((int) (((long) this.zzBF) & 4294967295L))) * 397) ^ ((int) (((long) this.zzzW) & 4294967295L))) * 397) ^ ((int) (((long) this.zzzV) & 4294967295L));
    }

    public final boolean zzHj() {
        return zzWL(11) || zzWL(13);
    }

    public final int zzHk() {
        return this.zzzV;
    }

    public final int zzHl() {
        return this.zzzW;
    }

    public final int zzI9() {
        return this.zzBF;
    }

    public final int zzIa() {
        return this.zzBG;
    }

    public final boolean zzWL(int i) {
        int i2;
        if (i == -1) {
            return false;
        }
        if (i < 32) {
            i2 = this.zzBG;
        } else if (i < 64) {
            i -= 32;
            i2 = this.zzBF;
        } else if (i < 96) {
            i -= 64;
            i2 = this.zzzW;
        } else {
            i -= 96;
            i2 = this.zzzV;
        }
        long j = 4294967295L & ((long) ((int) (((long) (1 << i)) & 4294967295L)));
        return ((((long) i2) & 4294967295L) & j) == j;
    }

    public final boolean zzWM(int i) {
        return zzWL(zzWK(i));
    }

    public zzJG(byte[] bArr) {
        this.zzBG = zzZQK.zzA(bArr, 0);
        this.zzBF = zzZQK.zzA(bArr, 4);
        this.zzzW = zzZQK.zzA(bArr, 8);
        this.zzzV = zzZQK.zzA(bArr, 12);
    }
}
