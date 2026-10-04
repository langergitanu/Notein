package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDV {
    protected int zzVf;
    protected boolean zzWJ3;
    protected int zzWJ4;
    protected zzZ[] zzWJ5;
    protected String[] zzWJ6;
    protected boolean zzWJ7;
    protected int zzWJe;
    protected int zzWJf;

    public static final class zzZ {
        private final zzZ zzWJ2;
        private final String zzZbX;

        public zzZ(String str, zzZ zzz) {
            this.zzZbX = str;
            this.zzWJ2 = zzz;
        }

        public final String getSymbol() {
            return this.zzZbX;
        }

        public final String zzL(char[] cArr, int i, int i2) {
            String str = this.zzZbX;
            zzZ zzz = this.zzWJ2;
            while (true) {
                if (str.length() == i2) {
                    int i3 = 0;
                    while (str.charAt(i3) == cArr[i + i3] && (i3 = i3 + 1) < i2) {
                    }
                    if (i3 == i2) {
                        return str;
                    }
                }
                if (zzz == null) {
                    return null;
                }
                str = zzz.zzZbX;
                zzz = zzz.zzWJ2;
            }
        }

        public final zzZ zzXLu() {
            return this.zzWJ2;
        }

        public final String zzwU(String str) {
            String str2 = this.zzZbX;
            zzZ zzz = this.zzWJ2;
            while (!str2.equals(str)) {
                if (zzz == null) {
                    return null;
                }
                str2 = zzz.zzZbX;
                zzz = zzz.zzWJ2;
            }
            return str2;
        }
    }

    public zzZDV() {
        this((byte) 0);
    }

    private void rehash() {
        String[] strArr = this.zzWJ6;
        int length = strArr.length;
        int i = length + length;
        zzZ[] zzzArr = this.zzWJ5;
        this.zzWJ6 = new String[i];
        this.zzWJ5 = new zzZ[i >> 1];
        this.zzWJe = i - 1;
        int i2 = this.zzWJf;
        this.zzWJf = i2 + i2;
        int i3 = 0;
        for (String str : strArr) {
            if (str != null) {
                i3++;
                int iZzx2 = zzx2(str) & this.zzWJe;
                String[] strArr2 = this.zzWJ6;
                if (strArr2[iZzx2] == null) {
                    strArr2[iZzx2] = str;
                } else {
                    int i4 = iZzx2 >> 1;
                    zzZ[] zzzArr2 = this.zzWJ5;
                    zzzArr2[i4] = new zzZ(str, zzzArr2[i4]);
                }
            }
        }
        int i5 = length >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (zzZ zzzZzXLu = zzzArr[i6]; zzzZzXLu != null; zzzZzXLu = zzzZzXLu.zzXLu()) {
                i3++;
                String symbol = zzzZzXLu.getSymbol();
                int iZzx22 = zzx2(symbol) & this.zzWJe;
                String[] strArr3 = this.zzWJ6;
                if (strArr3[iZzx22] == null) {
                    strArr3[iZzx22] = symbol;
                } else {
                    int i7 = iZzx22 >> 1;
                    zzZ[] zzzArr3 = this.zzWJ5;
                    zzzArr3[i7] = new zzZ(symbol, zzzArr3[i7]);
                }
            }
        }
        if (i3 == this.zzVf) {
            return;
        }
        throw new IllegalStateException("Internal error on SymbolTable.rehash(): had " + this.zzVf + " entries; now have " + i3 + ".");
    }

    private static int zzM(char[] cArr, int i, int i2) {
        int i3 = 1;
        int i4 = cArr[i];
        while (i3 < i2) {
            int i5 = (i4 * 31) + cArr[i + i3];
            i3++;
            i4 = i5;
        }
        return i4;
    }

    private void zzXLv() {
        String[] strArr = this.zzWJ6;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        this.zzWJ6 = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, length);
        zzZ[] zzzArr = this.zzWJ5;
        int length2 = zzzArr.length;
        zzZ[] zzzArr2 = new zzZ[length2];
        this.zzWJ5 = zzzArr2;
        System.arraycopy(zzzArr, 0, zzzArr2, 0, length2);
    }

    private static int zzx2(String str) {
        int iCharAt = str.charAt(0);
        int length = str.length();
        for (int i = 1; i < length; i++) {
            iCharAt = (iCharAt * 31) + str.charAt(i);
        }
        return iCharAt;
    }

    public final boolean isDirty() {
        return this.zzWJ3;
    }

    public final int size() {
        return this.zzVf;
    }

    public final int version() {
        return this.zzWJ4;
    }

    public final boolean zzW(zzZDV zzzdv) {
        return this.zzWJ4 == zzzdv.zzWJ4 + 1;
    }

    public final String zzX(char[] cArr, int i, int i2, int i3) {
        String strZzL;
        if (i2 <= 0) {
            return "";
        }
        int iZzM = i3 & this.zzWJe;
        String str = this.zzWJ6[iZzM];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4] && (i4 = i4 + 1) < i2) {
                }
                if (i4 == i2) {
                    return str;
                }
            }
            zzZ zzz = this.zzWJ5[iZzM >> 1];
            if (zzz != null && (strZzL = zzz.zzL(cArr, i, i2)) != null) {
                return strZzL;
            }
        }
        if (this.zzVf >= this.zzWJf) {
            rehash();
            iZzM = zzM(cArr, i, i2) & this.zzWJe;
        } else if (!this.zzWJ3) {
            zzXLv();
            this.zzWJ3 = true;
        }
        this.zzVf++;
        String str2 = new String(cArr, i, i2);
        if (this.zzWJ7) {
            str2 = str2.intern();
        }
        String[] strArr = this.zzWJ6;
        if (strArr[iZzM] == null) {
            strArr[iZzM] = str2;
            return str2;
        }
        int i5 = iZzM >> 1;
        zzZ[] zzzArr = this.zzWJ5;
        zzzArr[i5] = new zzZ(str2, zzzArr[i5]);
        return str2;
    }

    public final void zzXLw() {
        this.zzWJ7 = true;
    }

    public final zzZDV zzXLx() {
        boolean z;
        String[] strArr;
        zzZ[] zzzArr;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            z = this.zzWJ7;
            strArr = this.zzWJ6;
            zzzArr = this.zzWJ5;
            i = this.zzVf;
            i2 = this.zzWJf;
            i3 = this.zzWJe;
            i4 = this.zzWJ4 + 1;
        }
        return new zzZDV(z, strArr, zzzArr, i, i2, i3, i4);
    }

    public final String zzwV(String str) {
        String strZzwU;
        int length = str.length();
        if (length <= 0) {
            return "";
        }
        int iZzx2 = zzx2(str) & this.zzWJe;
        String str2 = this.zzWJ6[iZzx2];
        if (str2 != null) {
            if (str2.length() == length) {
                int i = 0;
                while (i < length && str2.charAt(i) == str.charAt(i)) {
                    i++;
                }
                if (i == length) {
                    return str2;
                }
            }
            zzZ zzz = this.zzWJ5[iZzx2 >> 1];
            if (zzz != null && (strZzwU = zzz.zzwU(str)) != null) {
                return strZzwU;
            }
        }
        if (this.zzVf >= this.zzWJf) {
            rehash();
            iZzx2 = this.zzWJe & zzx2(str);
        } else if (!this.zzWJ3) {
            zzXLv();
            this.zzWJ3 = true;
        }
        this.zzVf++;
        if (this.zzWJ7) {
            str = str.intern();
        }
        String[] strArr = this.zzWJ6;
        if (strArr[iZzx2] == null) {
            strArr[iZzx2] = str;
            return str;
        }
        int i2 = iZzx2 >> 1;
        zzZ[] zzzArr = this.zzWJ5;
        zzzArr[i2] = new zzZ(str, zzzArr[i2]);
        return str;
    }

    private zzZDV(byte b) {
        this(true);
    }

    public zzZDV(boolean z) {
        this(true, 128);
    }

    private zzZDV(boolean z, int i) {
        this.zzWJ7 = z;
        this.zzWJ4 = 1;
        this.zzWJ3 = true;
        int i2 = 4;
        while (i2 < 128) {
            i2 += i2;
        }
        this.zzWJ6 = new String[i2];
        this.zzWJ5 = new zzZ[i2 >> 1];
        this.zzWJe = i2 - 1;
        this.zzVf = 0;
        this.zzWJf = (int) (((double) (i2 * 0.75f)) + 0.5d);
    }

    private zzZDV(boolean z, String[] strArr, zzZ[] zzzArr, int i, int i2, int i3, int i4) {
        this.zzWJ7 = z;
        this.zzWJ6 = strArr;
        this.zzWJ5 = zzzArr;
        this.zzVf = i;
        this.zzWJf = i2;
        this.zzWJe = i3;
        this.zzWJ4 = i4;
        this.zzWJ3 = false;
    }

    public final synchronized void zzX(zzZDV zzzdv) {
        int i = zzzdv.zzVf;
        if (i <= this.zzVf) {
            return;
        }
        this.zzWJ6 = zzzdv.zzWJ6;
        this.zzWJ5 = zzzdv.zzWJ5;
        this.zzVf = i;
        this.zzWJf = zzzdv.zzWJf;
        this.zzWJe = zzzdv.zzWJe;
        this.zzWJ4++;
        this.zzWJ3 = false;
        zzzdv.zzWJ3 = false;
    }
}
