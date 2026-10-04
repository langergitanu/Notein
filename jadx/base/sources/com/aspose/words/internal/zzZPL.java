package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPL {
    private int len;
    private String value;
    private zzZP0 zzZZR;
    private static char[] zzZZQ = {ControlChar.SPACE_CHAR, ControlChar.NON_BREAKING_SPACE_CHAR};
    private static int zzZZP = 8;
    static int[][] zzZZO = {new int[]{0, 20, 34, 1, 3, 18, 20, 6, 6, 16, 17, 0, 11, 11, 20, 0, 0, 20}, new int[]{20, 21, 20, 2, 5, 20, 24, 8, 9, 10, 20, 1, 12, 13, 32, 1, 1, 20}, new int[]{21, 22, 34, 22, 20, 18, 25, 25, 20, 20, 17, 2, 38, 20, 38, 2, 2, 20}, new int[]{20, 21, 20, 4, 5, 20, 24, 7, 9, 20, 20, 3, 12, 13, 32, 20, 3, 20}, new int[]{21, 22, 34, 22, 20, 18, 25, 25, 20, 26, 17, 4, 38, 20, 38, 20, 4, 20}, new int[]{20, 22, 22, 22, 20, 20, 25, 25, 20, 26, 20, 5, 38, 20, 38, 20, 5, 20}, new int[]{20, 23, 20, 7, 9, 20, 20, 20, 20, 20, 20, 6, 14, 15, 33, 20, 6, 20}, new int[]{23, 25, 25, 25, 20, 18, 20, 20, 20, 26, 17, 7, 31, 20, 31, 20, 7, 20}, new int[]{24, 25, 25, 25, 20, 18, 20, 20, 20, 26, 17, 8, 31, 20, 31, 20, 8, 20}, new int[]{20, 25, 20, 25, 20, 20, 20, 20, 20, 20, 20, 9, 31, 20, 31, 20, 9, 20}, new int[]{28, 29, 29, 29, 20, 18, 20, 20, 20, 10, 17, 10, 20, 20, 20, 20, 10, 20}, new int[]{20, 32, 20, 12, 13, 20, 33, 14, 15, 14, 20, 11, 20, 20, 20, 20, 11, 20}, new int[]{32, 30, 30, 30, 20, 20, 31, 31, 20, 20, 20, 12, 20, 20, 20, 20, 12, 20}, new int[]{20, 30, 30, 30, 20, 20, 31, 31, 20, 20, 20, 12, 20, 20, 20, 20, 12, 20}, new int[]{33, 31, 31, 31, 20, 20, 20, 20, 20, 20, 20, 14, 20, 20, 20, 20, 14, 20}, new int[]{20, 31, 31, 31, 20, 20, 20, 20, 20, 20, 20, 14, 20, 20, 20, 20, 14, 20}, new int[]{26, 27, 34, 18, 20, 18, 20, 20, 20, 16, 17, 16, 20, 20, 20, 20, 16, 20}, new int[]{37, 37, 37, 18, 3, 20, 20, 20, 20, 16, 17, 17, 20, 20, 20, 17, 17, 20}, new int[]{20, 35, 35, 35, 20, 19, 24, 8, 20, 20, 17, 20, 20, 20, 20, 18, 18, 35}, new int[]{20, 36, 36, 36, 20, 20, 20, 20, 20, 20, 17, 19, 20, 20, 20, 19, 19, 36}};
    static int zzZZN = 0;
    static int zzZZM = 1;
    static int zzZZL = 2;
    static int zzZZK = 3;
    static int zzZZJ = 4;
    static int zzZZI = 5;
    static int zzZZH = 6;
    static int zzZZG = 7;
    static int zzZZF = -1;
    private int index = -1;
    private char zzZZS = 0;

    public static class zzT {
        private int type;
        private int value;

        public final void setType(int i) {
            this.type = i;
        }

        public final void setValue(int i) {
            this.value = i;
        }
    }

    public static class zzU {
        private int type;
        private char zzZZl;
        private int zzZZm;
    }

    public static class zzV {
        private static int zzZZB;
        private static boolean zzZZn;
        private static boolean zzZZo;
        private static boolean zzZZp;
        private static boolean zzZZq;
        private static boolean zzZZr;
        private static zzZPU zzZZw;
        private static int zzZZz;

        public static void zzR2(int i) {
            zzZZz = i;
        }

        public static void zzZ(zzZPU zzzpu) {
            zzZZw = zzzpu;
        }

        public static void zzZ6(boolean z) {
            zzZZo = z;
        }

        public static void zzZ7(boolean z) {
            zzZZp = z;
        }

        public static void zzjf() {
            zzZZn = true;
        }

        public static boolean zzjg() {
            return zzZZn;
        }

        public static boolean zzjh() {
            return zzZZo;
        }

        public static boolean zzji() {
            return zzZZp;
        }

        public static void zzjj() {
            zzZZq = true;
        }

        public static boolean zzjk() {
            return zzZZq;
        }

        public static void zzjl() {
            zzZZr = true;
        }

        public static boolean zzjm() {
            return zzZZr;
        }

        public static zzZPU zzjs() {
            return zzZZw;
        }

        public static int zzjw() {
            return zzZZz;
        }

        public static int zzkS() {
            return zzZZB;
        }

        public static void zzra() {
            zzZZB = -1;
            zzZZz = -1;
            zzZZq = false;
        }
    }

    public static class zzW {
        private int zzZZs;
        private int zzZZt;
        private int zzZZu;

        public final int zzjn() {
            return this.zzZZs;
        }

        public final void zzjo() {
            this.zzZZt = 256;
        }

        public final int zzjp() {
            return this.zzZZt;
        }

        public final int zzjq() {
            return this.zzZZu;
        }
    }

    public static class zzX {
        private int flags;
        private int zzMi;
        private int zzMj;
        private int zzMk;
        private int zzMl;
        private int zzMm;
        private int zzMn;
        private int zzZZA;
        private zzZQ9 zzZZv;
        private zzZPU zzZZw;
        private zzZNF zzZZx;
        private double zzZZy;

        public static /* synthetic */ int zzX(zzX zzx, int i) {
            int i2 = i | zzx.flags;
            zzx.flags = i2;
            return i2;
        }

        public final int getDay() {
            return this.zzMl;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getHour() {
            return this.zzMk;
        }

        public final int getMinute() {
            return this.zzMj;
        }

        public final int getMonth() {
            return this.zzMm;
        }

        public final int getSecond() {
            return this.zzMi;
        }

        public final int getYear() {
            return this.zzMn;
        }

        public final void setDay(int i) {
            this.zzMl = i;
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setHour(int i) {
            this.zzMk = i;
        }

        public final void setMinute(int i) {
            this.zzMj = i;
        }

        public final void setMonth(int i) {
            this.zzMm = i;
        }

        public final void setSecond(int i) {
            this.zzMi = i;
        }

        public final String toString() {
            return "hour=" + this.zzMk + " min=" + this.zzMj + " sec=" + this.zzMi + " year=" + this.zzMn + " month=" + this.zzMm + " day=" + this.zzMl;
        }

        public final void zzD(zzZQ9 zzzq9) {
            this.zzZZv = zzzq9;
        }

        public final void zzQZ(int i) {
            this.zzZZA = i;
        }

        public final int zzR3(int i) {
            this.zzMn = i;
            return i;
        }

        public final void zzZf(double d) {
            this.zzZZy = d;
        }

        public final zzZQ9 zzjr() {
            return this.zzZZv;
        }

        public final zzZPU zzjs() {
            return this.zzZZw;
        }

        public final zzZNF zzjt() {
            return this.zzZZx;
        }

        public final int zzju() {
            return this.zzZZA;
        }

        public final double zzjv() {
            return this.zzZZy;
        }

        public final void zzra() {
            this.zzMn = -1;
            this.zzMm = -1;
            this.zzMl = -1;
            this.zzZZy = -1.0d;
            this.zzZZA = -1;
        }

        public final void zzD(int i, int i2, int i3) {
            this.zzMn = i;
            this.zzMm = i2;
            this.zzMl = i3;
        }

        public final void zzX(zzZNF zzznf) {
            this.zzZZx = zzznf;
        }

        public final void zzZ(zzZPU zzzpu) {
            this.zzZZw = zzzpu;
        }
    }

    public static class zzY {
        private int month;
        private int year;
        private int zzZZA;
        private int zzZZB;
        private int zzZZC;
        private int[] zzZZD;
        private double zzZZy;
        private int zzZZz;

        public final int getMonth() {
            return this.month;
        }

        public final int getYear() {
            return this.year;
        }

        public final void zzO(int[] iArr) {
            this.month = -1;
            this.year = -1;
            this.zzZZB = -1;
            this.zzZZA = -1;
            this.zzZZz = -1;
            this.zzZZy = -1.0d;
            this.zzZZD = iArr;
        }

        public final int zzR0(int i) {
            return this.zzZZD[i];
        }

        public final void zzR1(int i) {
            int[] iArr = this.zzZZD;
            int i2 = this.zzZZC;
            this.zzZZC = i2 + 1;
            iArr[i2] = i;
        }

        public final void zzR2(int i) {
            this.zzZZz = i;
        }

        public final int zzR3(int i) {
            this.year = i;
            return i;
        }

        public final int zzR4(int i) {
            this.month = i;
            return i;
        }

        public final double zzjv() {
            return this.zzZZy;
        }

        public final int zzjw() {
            return this.zzZZz;
        }

        public final void zzjx() {
            this.zzZZC = 0;
        }

        public final int zzjy() {
            return this.zzZZC;
        }

        public final int zzkS() {
            return this.zzZZB;
        }
    }

    public static class zzZ {
        private static int index;
        private static int length;
        private static int type;
        private static int value;
        private static String zzZZE;

        public static int getLength() {
            return length;
        }

        public static int getType() {
            return type;
        }

        public static int getValue() {
            return value;
        }

        public static /* synthetic */ int zzjB() {
            int i = length;
            length = i + 1;
            return i;
        }

        public static /* synthetic */ int zzjE() {
            length = 0;
            return 0;
        }

        public static char zzjF() {
            return zzZZE.charAt(index);
        }
    }

    public zzZPL(String str, zzZP0 zzzp0) {
        this.zzZZR = zzzp0;
        this.value = str;
        this.len = str.length();
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean zzV(zzZPL zzzpl) {
        char cCharAt = zzzpl.value.charAt(zzzpl.index);
        if (cCharAt == '#') {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < zzzpl.len; i++) {
                char cCharAt2 = zzzpl.value.charAt(i);
                if (cCharAt2 == '#') {
                    if (!z2) {
                        z2 = true;
                    } else {
                        if (z) {
                            return false;
                        }
                        z = true;
                    }
                } else if (cCharAt2 == 0) {
                    if (!z) {
                        return false;
                    }
                } else if (!zzZKU.zzG(cCharAt2) && (!z2 || z)) {
                    return false;
                }
            }
            if (!z) {
                return false;
            }
            zzzpl.zzjR();
            return true;
        }
        if (cCharAt != 0) {
            return false;
        }
        int i2 = zzzpl.index;
        while (true) {
            int i3 = zzzpl.len;
            if (i2 >= i3) {
                zzzpl.index = i3;
                return true;
            }
            if (zzzpl.value.charAt(i2) != 0) {
                return false;
            }
            i2++;
        }
    }

    private zzT zzW(zzZP0 zzzp0) {
        zzT zzt = new zzT();
        if (this.index >= this.len) {
            zzt.type = 6;
            return zzt;
        }
        zzt.type = 11;
        zzZ(zzt, zzzp0);
        return zzt;
    }

    private void zzZ(zzT zzt, zzZP0 zzzp0) {
        char cCharAt;
        while (!isDigit(this.zzZZS)) {
            if (!Character.isWhitespace(this.zzZZS)) {
                zzzp0.zzZ(255, zzt, this);
                return;
            }
            do {
                int i = this.index + 1;
                this.index = i;
                if (i >= this.len) {
                    zzt.type = 6;
                    return;
                } else {
                    cCharAt = this.value.charAt(i);
                    this.zzZZS = cCharAt;
                }
            } while (Character.isWhitespace(cCharAt));
        }
        zzt.value = this.zzZZS - '0';
        int i2 = this.index;
        while (true) {
            int i3 = this.index + 1;
            this.index = i3;
            if (i3 >= this.len) {
                break;
            }
            char cCharAt2 = this.value.charAt(i3);
            this.zzZZS = cCharAt2;
            int i4 = cCharAt2 - '0';
            if (i4 < 0 || i4 > 9) {
                break;
            } else {
                zzt.value = (zzt.value * 10) + i4;
            }
        }
        int i5 = this.index;
        if (i5 - i2 > zzZZP) {
            zzt.type = 1;
            zzt.value = -1;
        } else if (i5 - i2 < 3) {
            zzt.type = 1;
        } else {
            zzt.type = 2;
        }
    }

    private boolean zzjJ() {
        char cCharAt;
        if (this.index >= this.len) {
            return false;
        }
        if (!Character.isWhitespace(this.zzZZS)) {
            return true;
        }
        do {
            int i = this.index + 1;
            this.index = i;
            if (i >= this.len) {
                return false;
            }
            cCharAt = this.value.charAt(i);
            this.zzZZS = cCharAt;
        } while (Character.isWhitespace(cCharAt));
        return true;
    }

    private zzU zzjK() {
        zzU zzu = new zzU();
        zzu.zzZZm = this.index;
        zzu.zzZZl = this.zzZZS;
        if (!zzjJ()) {
            zzu.type = 512;
            return zzu;
        }
        if (isDigit(this.zzZZS)) {
            zzu.type = ViewUtils.EDGE_TO_EDGE_FLAGS;
            return zzu;
        }
        zzT zzt = new zzT();
        boolean zZzZ = this.zzZZR.zzZ(65280, zzt, this);
        zzu.type = zzt.type;
        if (!zZzZ) {
            zzu.type = ViewUtils.EDGE_TO_EDGE_FLAGS;
        }
        return zzu;
    }

    private boolean zzw(String str, int i) {
        int i2 = i - this.index;
        if (i2 != str.length()) {
            return false;
        }
        int i3 = this.index;
        return i2 + i3 <= this.len && zzZ(this.value, i3, str, 0) == 0;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getRepeatCount() {
        char cCharAt = this.value.charAt(this.index);
        int i = this.index;
        do {
            i++;
            if (i >= this.len) {
                break;
            }
        } while (this.value.charAt(i) == cCharAt);
        int i2 = i - this.index;
        this.index = i - 1;
        return i2;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final char zzFI() {
        return this.zzZZS;
    }

    public final int zzK(String str, boolean z) {
        int i;
        int length = this.value.length() - this.index;
        int length2 = str.length();
        int i2 = 0;
        if (length2 > length || zzZ(this.value, this.index, str, 0) != 0) {
            int i3 = this.index;
            int iZzZ = zzZKN.zzZ(str, zzZZQ, 0);
            if (iZzZ == -1) {
                return -1;
            }
            do {
                int i4 = iZzZ - i2;
                if (i3 >= this.value.length() - i4) {
                    return -1;
                }
                if (i4 == 0) {
                    length2--;
                } else {
                    int i5 = i4 + i3;
                    if (!zzZKU.zzG(this.value.charAt(i5)) || zzZ(this.value, i3, str, i2) != 0) {
                        return -1;
                    }
                    i3 = i5 + 1;
                }
                i2 = iZzZ + 1;
                while (i3 < this.value.length() && zzZKU.zzG(this.value.charAt(i3))) {
                    i3++;
                    length2++;
                }
                iZzZ = zzZKN.zzZ(str, zzZZQ, i2);
            } while (iZzZ >= 0);
            if (i2 < str.length()) {
                if (i3 > this.value.length() - (str.length() - i2) || zzZ(this.value, i3, str, i2) != 0) {
                    return -1;
                }
            }
        }
        if (z && (i = this.index + length2) < this.value.length() && Character.isLetter(this.value.charAt(i))) {
            return -1;
        }
        return length2;
    }

    public final boolean zzR8(int i) {
        int i2 = this.index + i;
        this.index = i2;
        if (i2 >= this.len) {
            return false;
        }
        this.zzZZS = this.value.charAt(i2);
        return true;
    }

    public final boolean zzVt(String str) {
        return zzw(str, str.length() + this.index);
    }

    public final boolean zzZX(char c) {
        int i = this.index + 1;
        this.index = i;
        if (i >= this.len) {
            return false;
        }
        if (this.value.charAt(i) == c) {
            this.zzZZS = c;
            return true;
        }
        this.index--;
        return false;
    }

    public final void zzZY(char c) {
        this.zzZZS = c;
    }

    public final void zzjG() {
        if (this.len <= 2) {
            return;
        }
        int i = 0;
        char cCharAt = this.value.charAt(0);
        if (cCharAt == '\'' || cCharAt == '\"') {
            while (true) {
                int i2 = i + 1;
                if (i2 >= this.len || !zzZKU.zzG(this.value.charAt(i2))) {
                    break;
                } else {
                    i = i2;
                }
            }
            if (i != 0) {
                String strZzT = zzZKN.zzT(this.value, 1, i);
                this.value = strZzT;
                this.len = strZzT.length();
            }
        }
    }

    public final void zzjH() {
        int i = this.len;
        int i2 = i - 1;
        if (i2 <= 1) {
            return;
        }
        char cCharAt = this.value.charAt(i2);
        if ((cCharAt == '\'' || cCharAt == '\"') && zzZKU.zzG(this.value.charAt(i - 2))) {
            int i3 = i - 2;
            while (i3 > 0 && zzZKU.zzG(this.value.charAt(i3 - 1))) {
                i3--;
            }
            String str = this.value;
            String strZzT = zzZKN.zzT(str, i3, (str.length() - 1) - i3);
            this.value = strZzT;
            this.len = strZzT.length();
        }
    }

    public final void zzjI() {
        int i = this.len - 1;
        while (i >= 0 && zzZKU.zzG(this.value.charAt(i))) {
            i--;
        }
        String strSubstring = this.value.substring(0, i + 1);
        this.value = strSubstring;
        this.len = strSubstring.length();
    }

    public final void zzjL() {
        int i = zzZ.index + zzZ.length;
        this.index = i;
        if (i < this.len) {
            this.zzZZS = this.value.charAt(i);
        }
    }

    public final zzZ zzjM() {
        zzZ zzz = new zzZ();
        int unused = zzZ.index = this.index;
        String unused2 = zzZ.zzZZE = this.value;
        int unused3 = zzZ.value = 0;
        zzZ.zzjE();
        while (this.index + zzZ.length < this.len) {
            char cCharAt = this.value.charAt(this.index + zzZ.length);
            int i = (cCharAt < '0' || cCharAt > '9') ? 4 : 2;
            if (zzZ.length != 0) {
                if (zzZ.type != i) {
                    break;
                }
            } else {
                int unused4 = zzZ.type = i;
            }
            zzZ.zzjB();
            if (i != 2) {
                break;
            }
            if (zzZ.length > 8) {
                int unused5 = zzZ.type = 1;
                return zzz;
            }
            int unused6 = zzZ.value = (zzZ.value * 10) + (cCharAt - '0');
        }
        if (zzZ.length == 0) {
            int unused7 = zzZ.type = 3;
        }
        return zzz;
    }

    public final int zzjN() {
        return this.value.charAt(this.index) - '0';
    }

    public final boolean zzjO() {
        int i = this.index + 1;
        this.index = i;
        if (i >= this.len) {
            return false;
        }
        return isDigit(this.value.charAt(i));
    }

    public final int zzjP() {
        return this.value.charAt(this.index);
    }

    public final void zzjQ() {
        while (true) {
            int i = this.index;
            if (i + 1 >= this.len || !zzZKU.zzG(this.value.charAt(i + 1))) {
                return;
            } else {
                this.index++;
            }
        }
    }

    public final boolean zzjR() {
        int i = this.index + 1;
        this.index = i;
        if (i >= this.len) {
            return false;
        }
        this.zzZZS = this.value.charAt(i);
        return true;
    }

    public final int zzjS() {
        return this.len;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0255 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzZ(int i, zzZPL zzzpl, zzW zzw, zzY zzy, zzX zzx, zzZP0 zzzp0) {
        int i2;
        zzZNF zzznfZzX;
        int i3;
        zzw.zzZZu = 18;
        zzT zztZzW = zzzpl.zzW(zzzp0);
        switch (zztZzW.type) {
            case 1:
            case 2:
                if (zzy.zzZZC == 3 || zztZzW.value == -1) {
                    return false;
                }
                if (i == 19 && (i3 = zzzpl.index) < zzzpl.len - 1 && zzzpl.value.charAt(i3) == '.') {
                    zzy.zzZZy = zzZPM.zzW(zzzpl);
                }
                if ((i == 19 || i == 18) && (i2 = zzzpl.index) < zzzpl.len - 1) {
                    char cCharAt = zzzpl.value.charAt(i2);
                    int i4 = 0;
                    while (zzZKU.zzG(cCharAt)) {
                        int i5 = zzzpl.index;
                        if (i5 + i4 < zzzpl.len - 1) {
                            i4++;
                            cCharAt = zzzpl.value.charAt(i5 + i4);
                        } else if (cCharAt != '+' || cCharAt == '-') {
                            zzzpl.index += i4;
                            zzX.zzX(zzx, 256);
                            zzznfZzX = zzZPM.zzX(zzzpl);
                            if (zzznfZzX != null) {
                                return false;
                            }
                            zzx.zzZZx = zzznfZzX;
                        }
                    }
                    if (cCharAt != '+') {
                        zzzpl.index += i4;
                        zzX.zzX(zzx, 256);
                        zzznfZzX = zzZPM.zzX(zzzpl);
                        if (zzznfZzX != null) {
                        }
                    }
                }
                zzw.zzZZs = zztZzW.value;
                if (zztZzW.type == 2) {
                    zzy.year = zztZzW.value;
                    zzU zzuZzjK = zzzpl.zzjK();
                    switch (zzuZzjK.type) {
                        case 512:
                            zzw.zzZZu = 14;
                            break;
                        case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                            zzw.zzZZu = 12;
                            break;
                        case 1024:
                        case 1280:
                            zzy.zzZZz = zzuZzjK.type == 1024 ? 0 : 1;
                            zzw.zzZZu = 12;
                            break;
                        case TableStyleOptions.DEFAULT_2003 /* 1536 */:
                            zzw.zzZZu = 13;
                            break;
                        case 2048:
                        case 2304:
                        case 2560:
                            zzw.zzZZu = 9;
                            zzw.zzZZt = zzuZzjK.type;
                            break;
                        case 2816:
                        case 3072:
                        case 3328:
                            zzw.zzZZu = 10;
                            zzw.zzZZt = zzuZzjK.type;
                            break;
                        case 3840:
                            int[] iArr = zzZZO[i];
                            if (iArr[13] == 20 && iArr[12] > 20) {
                                zzzpl.index = zzuZzjK.zzZZm;
                                zzzpl.zzZZS = zzuZzjK.zzZZl;
                                zzw.zzZZu = 12;
                            } else {
                                zzw.zzZZu = 13;
                            }
                            break;
                    }
                    return false;
                }
                zzU zzuZzjK2 = zzzpl.zzjK();
                switch (zzuZzjK2.type) {
                    case 512:
                        zzw.zzZZu = 1;
                        zzy.zzR1(zzw.zzZZs);
                        break;
                    case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                        zzw.zzZZu = 3;
                        zzy.zzR1(zzw.zzZZs);
                        break;
                    case 1024:
                    case 1280:
                        zzw.zzZZu = 2;
                        zzy.zzZZz = zzuZzjK2.type == 1024 ? 0 : 1;
                        zzy.zzR1(zzw.zzZZs);
                        if ((i == 19 || i == 18) && !zzZ(zzzpl, zzx)) {
                        }
                        break;
                    case TableStyleOptions.DEFAULT_2003 /* 1536 */:
                        zzw.zzZZu = 4;
                        zzy.zzR1(zzw.zzZZs);
                        break;
                    case 1792:
                        zzw.zzZZu = 5;
                        zzy.zzR1(zzw.zzZZs);
                        break;
                    case 2048:
                        zzw.zzZZs = zzZPM.zzR9(zztZzW.value);
                        zzw.zzZZu = 9;
                        zzw.zzZZt = zzuZzjK2.type;
                        break;
                    case 2304:
                    case 2560:
                        zzw.zzZZu = 9;
                        zzw.zzZZt = zzuZzjK2.type;
                        break;
                    case 2816:
                    case 3072:
                    case 3328:
                        zzw.zzZZu = 10;
                        zzw.zzZZt = zzuZzjK2.type;
                        break;
                    case 3584:
                        zzw.zzZZu = 19;
                        zzy.zzR1(zzw.zzZZs);
                        break;
                    case 3840:
                        int[] iArr2 = zzZZO[i];
                        if (iArr2[4] == 20 && iArr2[3] > 20) {
                            zzzpl.index = zzuZzjK2.zzZZm;
                            zzzpl.zzZZS = zzuZzjK2.zzZZl;
                            zzw.zzZZu = 3;
                        } else {
                            zzw.zzZZu = 4;
                        }
                        zzy.zzR1(zzw.zzZZs);
                        break;
                }
                return false;
            case 3:
            case 4:
                zzy.zzZZz = zztZzW.value;
                return true;
            case 5:
                zzU zzuZzjK3 = zzzpl.zzjK();
                if (zzuZzjK3.type > 768) {
                    int i6 = zzuZzjK3.type;
                    if (i6 == 1536) {
                        zzw.zzZZu = 8;
                        zzy.month = zztZzW.value;
                        return true;
                    }
                    if (i6 != 3840) {
                        return false;
                    }
                    int[] iArr3 = zzZZO[i];
                    if (iArr3[8] == 20 && iArr3[7] > 20) {
                        zzzpl.index = zzuZzjK3.zzZZm;
                        zzzpl.zzZZS = zzuZzjK3.zzZZl;
                        zzw.zzZZu = 7;
                    } else {
                        zzw.zzZZu = 8;
                    }
                    zzy.month = zztZzW.value;
                    return true;
                }
                int i7 = zzuZzjK3.type;
                if (i7 == 512) {
                    zzw.zzZZu = 6;
                    zzy.month = zztZzW.value;
                    return true;
                }
                if (i7 != 768) {
                    return false;
                }
                zzw.zzZZu = 7;
                zzy.month = zztZzW.value;
                return true;
            case 6:
                zzw.zzZZu = 0;
                return true;
            case 7:
                if (zzy.zzZZB != -1) {
                    return false;
                }
                zzy.zzZZB = zztZzW.value;
                zzw.zzZZu = 11;
                return true;
            case 8:
                zzw.zzZZu = 15;
                zzX.zzX(zzx, 256);
                zzx.zzZZx = new zzZNF(0L);
                zzX.zzX(zzx, 512);
                return true;
            case 9:
                zzx.zzZZA = zzw.zzZZs;
                zzw.zzZZu = 16;
                return true;
            case 10:
            default:
                return true;
            case 11:
                if (!Character.isLetter(zzzpl.zzZZS)) {
                    char c = zzzpl.zzZZS;
                    if (c == '-' || c == '+') {
                        int i8 = zzzpl.index;
                        zzZNF zzznfZzX2 = zzZPM.zzX(zzzpl);
                        zzx.zzZZx = zzznfZzX2;
                        if (zzznfZzX2 != null) {
                            zzX.zzX(zzx, 256);
                            return true;
                        }
                        zzzpl.index = i8;
                    }
                    if (zzV(zzzpl)) {
                        return true;
                    }
                }
                return false;
            case 12:
                if (zztZzW.value < 100) {
                    zzw.zzZZs = zztZzW.value;
                    zzy.zzR1(zzw.zzZZs);
                    zzU zzuZzjK4 = zzzpl.zzjK();
                    int i9 = zzuZzjK4.type;
                    if (i9 == 512) {
                        zzw.zzZZu = 1;
                        return true;
                    }
                    if (i9 == 768 || i9 == 1536) {
                        zzw.zzZZu = 4;
                        return true;
                    }
                    if (i9 != 3840) {
                        return false;
                    }
                    int[] iArr4 = zzZZO[i];
                    if (iArr4[4] == 20 && iArr4[3] > 20) {
                        zzzpl.index = zzuZzjK4.zzZZm;
                        zzzpl.zzZZS = zzuZzjK4.zzZZl;
                        zzw.zzZZu = 3;
                    } else {
                        zzw.zzZZu = 4;
                    }
                    return true;
                }
                if (zzy.year != -1) {
                    return false;
                }
                zzy.year = zztZzW.value;
                zzU zzuZzjK5 = zzzpl.zzjK();
                int i10 = zzuZzjK5.type;
                if (i10 == 512) {
                    zzw.zzZZu = 14;
                    return true;
                }
                if (i10 == 768) {
                    zzw.zzZZu = 12;
                    return true;
                }
                if (i10 != 3840 || zzZZO[i][12] <= 20) {
                    return false;
                }
                zzzpl.index = zzuZzjK5.zzZZm;
                zzzpl.zzZZS = zzuZzjK5.zzZZl;
                zzw.zzZZu = 12;
                return true;
            case 13:
                zzx.zzZZw = new zzZPB();
                zzZP0.zziJ();
                if (zzx.zzZZA == -1) {
                    return false;
                }
                zzx.zzZZA = zztZzW.value;
                zzw.zzZZu = 16;
                return true;
            case 14:
                zzx.zzZZw = new zzZP6();
                zzZP0.zziI();
                if (zzx.zzZZA == -1) {
                    return false;
                }
                zzx.zzZZA = zztZzW.value;
                zzw.zzZZu = 16;
                return true;
        }
    }

    private static boolean zzZ(zzZPL zzzpl, zzX zzx) {
        int i = zzzpl.index;
        if (i < zzzpl.len - 1) {
            char cCharAt = zzzpl.value.charAt(i);
            int i2 = 0;
            while (zzZKU.zzG(cCharAt)) {
                int i3 = zzzpl.index;
                if (i3 + i2 >= zzzpl.len - 1) {
                    break;
                }
                i2++;
                cCharAt = zzzpl.value.charAt(i3 + i2);
            }
            if (cCharAt == '+' || cCharAt == '-') {
                zzzpl.index += i2;
                zzZNF zzznfZzX = zzZPM.zzX(zzzpl);
                zzx.zzZZx = zzznfZzX;
                if (zzznfZzX == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int zzZ(String str, int i, String str2, int i2) {
        int iMin = Math.min(str.length(), str2.length());
        int length = i + iMin;
        if (length > str.length()) {
            length = str.length();
        }
        int length2 = iMin + i2;
        if (length2 > str2.length()) {
            length2 = str2.length();
        }
        return str.substring(i, length).compareToIgnoreCase(str2.substring(i2, length2));
    }
}
