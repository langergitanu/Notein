package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzY9 {
    private boolean zzWA;
    private boolean zzWB;
    private boolean zzWC;
    private boolean zzWD;
    private boolean zzWE;
    private boolean zzWF;
    private int zzWG;
    private long[] zzWH;
    private static long[] zzWJ = new long[6];
    private static int[] zzWI = new int[6];

    public static class zzZ {
        private int zzWv;
        private int zzWw;
        private int zzWx;
        private int zzWy;
        private int zzWz;

        public zzZ(int i, int i2, int i3, int i4, int i5) {
            this.zzWz = i;
            this.zzWy = i2;
            this.zzWx = i3;
            this.zzWw = i4;
            this.zzWv = i5;
        }

        public final int getLimit() {
            return this.zzWy;
        }

        public final int getStart() {
            return this.zzWz;
        }

        public final int zzXA() {
            return this.zzWx;
        }

        public final int zzXy() {
            return this.zzWv;
        }

        public final int zzXz() {
            return this.zzWw;
        }
    }

    static {
        int[][] iArr = {new int[]{0, 16}, new int[]{16, 1}, new int[]{17, 7}, new int[]{24, 8}, new int[]{32, 1}, new int[]{33, 31}};
        for (int i = 0; i < 6; i++) {
            int[] iArr2 = iArr[i];
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = 64 - (i2 + i3);
            zzWJ[i] = ((1 << i3) - 1) << i4;
            zzWI[i] = i4;
        }
    }

    private zzY9(zzY2[] zzy2Arr, boolean z, boolean z2, boolean z3) {
        this.zzWF = z2;
        this.zzWE = z3;
        this.zzWD = z;
        this.zzWG = (z || z2) ? 1 : 0;
        zzZ(zzy2Arr, z2 && z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[PHI: r5
      0x0048: PHI (r5v11 int) = (r5v10 int), (r5v21 int) binds: [B:26:0x005c, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void apply() {
        int i;
        if (this.zzWC) {
            return;
        }
        int i2 = this.zzWG;
        zzD7 zzd7 = new zzD7();
        zzDB zzdb = new zzDB();
        int i3 = i2;
        int iZzCQ = 0;
        for (int i4 = 0; i4 < this.zzWH.length; i4++) {
            int iZzT = (int) zzT(i4, 2);
            if (iZzT == 17 || iZzT == 18) {
                zzV(i4, i2);
                if (i3 < 60) {
                    zzdb.add(i3);
                    zzd7.zzVF(iZzCQ);
                    i3 = (i3 + 1) | 1;
                    iZzCQ = iZzT == 17 ? 0 : 1;
                }
            } else if (iZzT == 15 || iZzT == 16) {
                zzV(i4, i2);
                if (i3 < 59) {
                    zzdb.add(i3);
                    zzd7.zzVF(iZzCQ);
                    i3 = (i3 | 1) + 1;
                    if (iZzT != 15) {
                        iZzCQ = 2;
                    }
                }
            }
            if (iZzT != 10) {
                if (zzZ(getChar(i4)) || iZzT == 9) {
                    zzV(i4, i2);
                    zzW(i4, 9);
                } else {
                    zzV(i4, i3);
                    if (iZzCQ == 2) {
                        zzW(i4, 0);
                    } else if (iZzCQ == 1) {
                        zzW(i4, 1);
                    }
                    i2 = i3;
                }
            }
            if (iZzT == 14 && zzdb.getCount() > 0) {
                i3 = zzdb.get(zzdb.getCount() - 1);
                zzdb.removeAt(zzdb.getCount() - 1);
                iZzCQ = zzd7.zzCQ();
            }
            if (iZzT == 10) {
                zzV(i4, this.zzWG);
                i3 = this.zzWG;
                zzdb.clear();
                zzd7.clear();
                iZzCQ = 0;
            }
        }
        ArrayList<zzZ> arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.zzWH.length; i5 = i) {
            int iZzT2 = (int) zzT(i5, 3);
            i = i5 + 1;
            while (i < this.zzWH.length && ((int) zzT(i, 3)) == iZzT2) {
                i++;
            }
            int iZzT3 = this.zzWG;
            int i6 = i5 - 1;
            while (true) {
                if (i6 < 0) {
                    break;
                }
                if (((int) zzT(i6, 2)) != 9) {
                    iZzT3 = (int) zzT(i6, 3);
                    break;
                }
                i6--;
            }
            int iZzT4 = this.zzWG;
            int i7 = i;
            while (true) {
                if (i7 >= this.zzWH.length) {
                    break;
                }
                if (((int) zzT(i7, 2)) != 9) {
                    iZzT4 = (int) zzT(i7, 3);
                    break;
                }
                i7++;
            }
            zzZQG.zzZ((ArrayList<zzZ>) arrayList, new zzZ(i5, i, zzs(Math.max(iZzT3, iZzT2)), zzs(Math.max(iZzT4, iZzT2)), iZzT2));
        }
        for (zzZ zzz : arrayList) {
            zzZ(zzz);
            zzY(zzz);
        }
        zzXF();
        zzXE();
        if (this.zzWF) {
            zzXD();
        }
        if (this.zzWE) {
            zzXC();
        }
        this.zzWC = true;
    }

    private char getChar(int i) {
        return (char) zzT(i, 0);
    }

    public static boolean zzK(String str) {
        for (int i = 0; i < str.length(); i++) {
            int iZzc = zzZVU.zzc(str.charAt(i));
            if (iZzc == 1 || iZzc == 2) {
                return true;
            }
            if (iZzc == 0) {
                return false;
            }
        }
        return false;
    }

    private long zzT(int i, int i2) {
        return (this.zzWH[i] & zzWJ[i2]) >>> zzWI[i2];
    }

    private void zzU(int i, int i2) {
        zzZ(i, 5, i2);
    }

    private void zzV(int i, int i2) {
        zzZ(i, 3, i2);
    }

    public static zzY3[] zzW(String str, boolean z) {
        return zzZ(new zzY2[]{new zzY2(str)}, z, false, false);
    }

    private zzY3[] zzXB() {
        StringBuilder sb;
        long j;
        StringBuilder sb2;
        int i = 0;
        if (!this.zzWC) {
            return new zzY3[0];
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = zzWJ;
        int i2 = 3;
        long j2 = jArr[3] | jArr[5] | jArr[1];
        StringBuilder sb3 = new StringBuilder();
        long j3 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long[] jArr2 = this.zzWH;
            if (i3 > jArr2.length) {
                break;
            }
            char c = i3 < jArr2.length ? getChar(i3) : (char) 65535;
            if (zzZ(c)) {
                sb = sb3;
                j = j2;
            } else {
                long[] jArr3 = this.zzWH;
                long j4 = i3 >= jArr3.length ? ~j3 : jArr3[i3] & j2;
                if (j4 != j3) {
                    if (sb3.length() > 0) {
                        sb2 = sb3;
                        j = j2;
                        zzY3 zzy3 = new zzY3(sb3.toString(), (int) zzT(i4, i2), (int) zzT(i4, 5));
                        zzy3.zzp((int) zzT(i4, 2));
                        if (zzw(i4)) {
                            zzy3.zzF(true);
                            zzy3.zzE(true);
                        }
                        zzZQG.zzZ((ArrayList<zzY3>) arrayList, zzy3);
                        i = 0;
                    } else {
                        sb2 = sb3;
                        j = j2;
                    }
                    sb = sb2;
                    sb.setLength(i);
                    i4 = i3;
                    j3 = j4;
                } else {
                    sb = sb3;
                    j = j2;
                }
                sb.append(c);
            }
            i3++;
            sb3 = sb;
            j2 = j;
            i2 = 3;
        }
        zzY3[] zzy3Arr = (zzY3[]) arrayList.toArray(new zzY3[i]);
        if (this.zzWE) {
            zzZ(zzy3Arr, this.zzWG);
        }
        return zzy3Arr;
    }

    private void zzXC() {
        char c;
        int iZzT;
        int i = 0;
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = -1;
        int i5 = 0;
        boolean z3 = false;
        while (true) {
            long[] jArr = this.zzWH;
            if (i >= jArr.length + 1) {
                return;
            }
            if (i < jArr.length) {
                c = getChar(i);
                iZzT = (int) zzT(i, 3);
            } else {
                c = 65535;
                iZzT = -1;
            }
            if (!zzZ(c)) {
                if (iZzT != i2) {
                    if (z && !z2) {
                        int iMax = Math.max(Math.min(i2, i4), Math.min(i2, iZzT));
                        int iMin = iMax >= 0 ? Math.min(iMax, i2) : i2;
                        if (iMin != i2) {
                            for (int i6 = 0; i6 < i3; i6++) {
                                zzV(i5 + i6, iMin);
                            }
                        }
                        if (iMin % 2 == 1 && z3) {
                            for (int i7 = 0; i7 < i3; i7++) {
                                zzZ(i5 + i7, 1, 1L);
                            }
                        }
                    }
                    i5 = i;
                    i4 = i2;
                    i2 = iZzT;
                    z = false;
                    i3 = 0;
                    z2 = false;
                    z3 = false;
                }
                i3++;
                if (i2 % 2 == 0) {
                    int iZzc = zzZVU.zzc(c);
                    if (iZzc == 3 || iZzc == 6) {
                        z = true;
                    } else if (zzY(c)) {
                        z3 = true;
                    } else if (c != ',' && c != '.' && c != ':' && c != 1548) {
                        z2 = true;
                    }
                }
            }
            i++;
        }
    }

    private void zzXD() {
        long[] jArr = new long[this.zzWH.length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            long[] jArr2 = this.zzWH;
            if (i >= jArr2.length + 1) {
                this.zzWH = jArr;
                return;
            }
            int iZzT = i < jArr2.length ? (int) zzT(i, 3) : -1;
            if (iZzT != i4) {
                if (i2 > 0) {
                    if (i4 % 2 == 1) {
                        zzZKV.zzZ(this.zzWH, i3, i2);
                        for (int i5 = i3; i5 < i3 + i2; i5++) {
                            char c = getChar(i5);
                            char cZzW = zzY7.zzW(c);
                            if (cZzW != c) {
                                zzZ(i5, cZzW);
                            }
                        }
                    }
                    long[] jArr3 = this.zzWH;
                    zzZKV.zzZ(jArr3, i3, jArr, jArr3.length - i, i2);
                }
                i2 = 0;
                i3 = i;
                i4 = iZzT;
            }
            i2++;
            i++;
        }
    }

    private void zzXE() {
        long[] jArr;
        int iZzT = this.zzWG;
        int i = 0;
        while (true) {
            jArr = this.zzWH;
            if (i >= jArr.length) {
                break;
            }
            int iZzc = zzZVU.zzc(getChar(i));
            if (iZzc == 10 || iZzc == 11) {
                zzV(i, this.zzWG);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    int iZzc2 = zzZVU.zzc(getChar(i2));
                    if (iZzc2 != 12 && iZzc2 != 9 && !zzZ(getChar(i2))) {
                        break;
                    }
                    zzV(i2, this.zzWG);
                }
            }
            if (zzZ(getChar(i)) || iZzc == 9) {
                zzV(i, iZzT);
            } else {
                iZzT = (int) zzT(i, 3);
            }
            i++;
        }
        for (int length = jArr.length - 1; length >= 0; length--) {
            int iZzc3 = zzZVU.zzc(getChar(length));
            if (iZzc3 != 12 && iZzc3 != 9 && !zzZ(getChar(length))) {
                return;
            }
            zzV(length, this.zzWG);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzXF() {
        for (int i = 0; i < this.zzWH.length; i++) {
            int iZzT = (int) zzT(i, 2);
            int iZzT2 = (int) zzT(i, 3);
            if (iZzT2 % 2 == 0) {
                if (iZzT == 1) {
                    zzV(i, iZzT2 + 1);
                } else if (iZzT == 6 || iZzT == 3) {
                    zzV(i, iZzT2 + 2);
                }
            } else if (iZzT == 0 || iZzT == 6 || iZzT == 3) {
            }
        }
    }

    private static boolean zzY(char c) {
        return c == '+' || c == '-' || c == '/';
    }

    private static boolean zzZ(char c) {
        return c == 8234 || c == 8235 || c == 8237 || c == 8238 || c == 8236;
    }

    private static int zzs(int i) {
        return i % 2 == 0 ? 0 : 1;
    }

    private static boolean zzt(int i) {
        return i == 12 || i == 13 || i == 10 || i == 11 || i == 9;
    }

    private static boolean zzu(int i) {
        return i == 4 || i == 5 || i == 7 || i == 9;
    }

    private boolean zzv(int i) {
        return zzT(i, 4) != 0;
    }

    private boolean zzw(int i) {
        return zzT(i, 1) != 0;
    }

    private static char zzx(int i) {
        if (i == 0) {
            return (char) 8234;
        }
        if (i == 1) {
            return (char) 8235;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: level");
    }

    private void zzW(int i, int i2) {
        zzZ(i, 2, i2);
    }

    private void zzY(int i, boolean z) {
        zzZ(i, 4, z ? 1L : 0L);
    }

    public static zzY3[] zzZ(zzY2[] zzy2Arr, boolean z, boolean z2, boolean z3) {
        zzY9 zzy9 = new zzY9(zzy2Arr, z, z2, z3);
        zzy9.apply();
        return zzy9.zzXB();
    }

    private void zzY(zzZ zzz) {
        int iZzT;
        int iZzT2;
        int start = zzz.getStart();
        while (start < zzz.getLimit()) {
            if (zzt((int) zzT(start, 2))) {
                int i = start;
                while (i < zzz.getLimit() && zzt((int) zzT(i, 2))) {
                    i++;
                }
                if (start == zzz.getStart()) {
                    iZzT = zzz.zzXA();
                } else {
                    iZzT = (int) zzT(start - 1, 2);
                    if (iZzT == 6 || iZzT == 3) {
                        iZzT = 1;
                    }
                }
                if (i == zzz.getLimit()) {
                    iZzT2 = zzz.zzXz();
                } else {
                    iZzT2 = (int) zzT(i, 2);
                    if (iZzT2 == 6 || iZzT2 == 3) {
                        iZzT2 = 1;
                    }
                }
                if (iZzT != iZzT2) {
                    iZzT = zzs(zzz.zzXy());
                }
                while (start < i) {
                    zzW(start, iZzT);
                    start++;
                }
                start = i;
            }
            start++;
        }
    }

    private void zzZ(zzY2[] zzy2Arr, boolean z) {
        zzY5 zzy5 = new zzY5();
        int length = 0;
        for (zzY2 zzy2 : zzy2Arr) {
            length = zzy2.getText().length() + length + zzZ(zzy5, zzy2.zzXh()).length;
            zzy5 = zzy2.zzXh();
        }
        this.zzWH = new long[length + zzZ(zzy5).length];
        zzY5 zzy52 = new zzY5();
        int i = 0;
        int i2 = 0;
        while (i < zzy2Arr.length) {
            int length2 = z ? (zzy2Arr.length - i) - 1 : i;
            zzY2 zzy22 = zzy2Arr[length2];
            for (char c : zzZ(zzy52, zzy22.zzXh())) {
                zzZ(i2, c, length2);
                i2++;
            }
            zzy52 = zzy22.zzXh();
            int i3 = i2;
            for (int i4 = 0; i4 < zzy22.getText().length(); i4++) {
                zzZ(i3, zzy22.getText().charAt(i4), length2, zzy22.zzXg(), zzy22.zzXf());
                i3++;
            }
            i++;
            i2 = i3;
        }
        for (char c2 : zzZ(zzy52)) {
            zzZ(i2, c2, zzy2Arr.length - 1);
            i2++;
        }
    }

    private static char[] zzZ(zzY5 zzy5, zzY5 zzy52) {
        int i = 0;
        int i2 = 0;
        while (i2 < zzy5.getLength() && i2 < zzy52.getLength() && zzy5.get(i2) == zzy52.get(i2)) {
            i2++;
        }
        char[] cArr = new char[(zzy52.getLength() - i2) + (zzy5.getLength() - i2)];
        for (int i3 = i2; i3 < zzy5.getLength(); i3++) {
            cArr[i] = 8236;
            i++;
        }
        while (i2 < zzy52.getLength()) {
            cArr[i] = zzx(zzy52.get(i2));
            i++;
            i2++;
        }
        return cArr;
    }

    private static char[] zzZ(zzY5 zzy5) {
        return zzZ(zzy5, new zzY5());
    }

    private void zzZ(int i, char c, int i2) {
        zzZ(i, c, i2, true, false);
    }

    private void zzZ(int i, char c, int i2, boolean z, boolean z2) {
        zzZ(i, c);
        int iZzc = zzZVU.zzc(c);
        if (this.zzWD && iZzc == 5 && z2) {
            iZzc = 13;
        }
        zzW(i, iZzc);
        zzV(i, 0);
        zzU(i, i2);
        zzY(i, z);
        if (iZzc == 2 || iZzc == 6) {
            this.zzWA = true;
        }
        if (iZzc == 8) {
            this.zzWB = true;
        }
    }

    private void zzZ(int i, char c) {
        zzZ(i, 0, c);
    }

    private void zzZ(int i, int i2, long j) {
        long[] jArr = this.zzWH;
        long j2 = jArr[i];
        long j3 = j << zzWI[i2];
        long j4 = zzWJ[i2];
        jArr[i] = (((j3 & j4) ^ j2) & j4) ^ j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3 A[LOOP:7: B:73:0x00dd->B:75:0x00e3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzZ zzz) {
        int iZzT;
        int iZzT2;
        if (this.zzWB) {
            int iZzXA = zzz.zzXA();
            for (int start = zzz.getStart(); start < zzz.getLimit(); start++) {
                int iZzT3 = (int) zzT(start, 2);
                if (iZzT3 == 8) {
                    zzW(start, iZzXA);
                } else if (iZzT3 != 9) {
                    iZzXA = iZzT3;
                }
            }
        }
        int i = 3;
        for (int start2 = zzz.getStart(); start2 < zzz.getLimit(); start2++) {
            int iZzT4 = (int) zzT(start2, 2);
            if (iZzT4 == 0 || iZzT4 == 1) {
                i = 3;
            } else if (iZzT4 == 2) {
                i = 6;
            } else if (iZzT4 == 3) {
                zzW(start2, i);
            }
        }
        if (this.zzWA) {
            for (int start3 = zzz.getStart(); start3 < zzz.getLimit(); start3++) {
                if (((int) zzT(start3, 2)) == 2) {
                    zzW(start3, 1);
                }
            }
        }
        for (int start4 = zzz.getStart() + 1; start4 < zzz.getLimit() - 1; start4++) {
            int iZzT5 = (int) zzT(start4, 2);
            if (iZzT5 == 4 || iZzT5 == 7) {
                int i2 = start4 - 1;
                while (i2 >= zzz.getStart() && ((int) zzT(i2, 2)) == 9) {
                    i2--;
                }
                if (i2 >= zzz.getStart() && ((iZzT2 = (int) zzT(i2, 2)) == 3 || (iZzT2 == 6 && iZzT5 == 7))) {
                    int i3 = start4 + 1;
                    while (i3 < zzz.getLimit() && ((int) zzT(i3, 2)) == 9) {
                        i3++;
                    }
                    if (i3 < zzz.getLimit() && ((int) zzT(i3, 2)) == iZzT2) {
                        if (this.zzWD && zzY(getChar(start4))) {
                            for (int i4 = i2; i4 <= i3; i4++) {
                                if (!zzv(i4)) {
                                    break;
                                }
                            }
                            while (true) {
                                i2++;
                                if (i2 > i3 - 1) {
                                    break;
                                }
                                zzW(i2, iZzT2);
                            }
                        } else {
                            while (true) {
                                i2++;
                                if (i2 > i3 - 1) {
                                    zzW(i2, iZzT2);
                                }
                            }
                        }
                    }
                }
            }
        }
        int start5 = zzz.getStart();
        while (start5 < zzz.getLimit()) {
            if (((int) zzT(start5, 2)) == 5 || ((int) zzT(start5, 2)) == 9) {
                boolean z = ((int) zzT(start5, 2)) == 9;
                int i5 = start5;
                while (i5 < zzz.getLimit() && (((int) zzT(i5, 2)) == 5 || ((int) zzT(i5, 2)) == 9)) {
                    if (((int) zzT(i5, 2)) != 9) {
                        z = false;
                    }
                    i5++;
                }
                if (!z) {
                    if (start5 == zzz.getStart()) {
                        iZzT = zzz.zzXA();
                    } else {
                        iZzT = (int) zzT(start5 - 1, 2);
                    }
                    if (iZzT != 3) {
                        if (i5 == zzz.getLimit()) {
                            iZzT = zzz.zzXz();
                        } else {
                            iZzT = (int) zzT(i5, 2);
                        }
                    }
                    if (iZzT == 3) {
                        while (start5 < i5) {
                            zzW(start5, 3);
                            start5++;
                        }
                    }
                }
                start5 = i5;
            }
            start5++;
        }
        for (int start6 = zzz.getStart(); start6 < zzz.getLimit(); start6++) {
            int iZzT6 = (int) zzT(start6, 2);
            if (zzu((int) zzT(start6, 2))) {
                boolean z2 = iZzT6 == 9;
                int i6 = start6 + 1;
                while (i6 < zzz.getLimit() && zzu((int) zzT(i6, 2))) {
                    if (((int) zzT(i6, 2)) != 9) {
                        z2 = false;
                    }
                    i6++;
                }
                if (!z2) {
                    for (int i7 = start6; i7 < i6; i7++) {
                        zzW(i7, 13);
                    }
                }
            }
        }
        int i8 = zzz.zzXA() == 0 ? 0 : 3;
        for (int start7 = zzz.getStart(); start7 < zzz.getLimit(); start7++) {
            int iZzT7 = (int) zzT(start7, 2);
            if (iZzT7 == 1) {
                i8 = 3;
            } else if (iZzT7 == 0) {
                i8 = 0;
            } else if (iZzT7 == 3) {
                zzW(start7, i8);
            }
        }
    }

    private static void zzZ(zzY3[] zzy3Arr, int i) {
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        for (zzY3 zzy3 : zzy3Arr) {
            iMin = Math.min(iMin, zzy3.getLevel());
            iMax = Math.max(iMax, zzy3.getLevel());
        }
        while (iMax > iMin) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 <= zzy3Arr.length; i4++) {
                if (i4 >= zzy3Arr.length || zzy3Arr[i4].getLevel() < iMax) {
                    zzZ(zzy3Arr, i2, i3);
                    i2 = i4;
                    i3 = 0;
                } else {
                    if (i3 == 0) {
                        i2 = i4;
                    }
                    i3++;
                }
            }
            iMax--;
        }
        if (iMin % 2 != i % 2) {
            zzZ(zzy3Arr, 0, zzy3Arr.length);
        }
    }

    private static void zzZ(zzY3[] zzy3Arr, int i, int i2) {
        if (i2 <= 1) {
            return;
        }
        zzY3[] zzy3Arr2 = new zzY3[i2];
        int i3 = i;
        int level = -1;
        int i4 = 0;
        for (int i5 = 0; i5 <= i2; i5++) {
            if (i5 >= i2 || zzy3Arr[i + i5].getLevel() % 2 != level) {
                int i6 = (i2 - (i3 - i)) - i4;
                if (i4 == 1) {
                    zzy3Arr2[i6] = zzy3Arr[i3];
                } else if (i4 > 1) {
                    zzZKV.zzZ(zzy3Arr, i3, zzy3Arr2, i6, i4);
                }
                i3 = i + i5;
                level = i3 < zzy3Arr.length ? zzy3Arr[i3].getLevel() % 2 : -1;
                i4 = 1;
            } else {
                i4++;
            }
        }
        zzZKV.zzZ(zzy3Arr2, 0, zzy3Arr, i, i2);
    }
}
