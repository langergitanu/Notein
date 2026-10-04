package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDU {
    private static final String[] zzWIR;
    private static final char[] zzWIS;
    private static final String[] zzWIT;
    private static final char[] zzWIU;
    private ArrayList<char[]> zzGU;
    private int zzS6;
    private char[] zzWIV;
    private String zzWIW;
    private int zzWIX;
    private char[] zzWIY;
    private int zzWIZ;
    private boolean zzWJ0 = false;
    private int zzWJ1;
    private char[] zzWLX;
    private final zzZHC zzWML;

    static {
        char[] charArray = "\n                                 ".toCharArray();
        zzWIU = charArray;
        zzWIT = new String[charArray.length];
        char[] charArray2 = "\n\t\t\t\t\t\t\t\t\t".toCharArray();
        zzWIS = charArray2;
        zzWIR = new String[charArray2.length];
    }

    private zzZDU(zzZHC zzzhc) {
        this.zzWML = zzzhc;
    }

    public static zzZDU zzX(zzZHC zzzhc) {
        return new zzZDU(zzzhc);
    }

    private char[] zzXLh() {
        int i;
        String str = this.zzWIW;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.zzWJ1;
        if (i2 >= 0) {
            int i3 = this.zzS6;
            if (i3 <= 0) {
                return zzZE5.zzXLL();
            }
            char[] cArr = new char[i3];
            System.arraycopy(this.zzWLX, i2, cArr, 0, i3);
            return cArr;
        }
        int size = size();
        if (size <= 0) {
            return zzZE5.zzXLL();
        }
        char[] cArr2 = new char[size];
        ArrayList<char[]> arrayList = this.zzGU;
        if (arrayList != null) {
            int size2 = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                char[] cArr3 = this.zzGU.get(i4);
                int length = cArr3.length;
                System.arraycopy(cArr3, 0, cArr2, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.zzWIY, 0, cArr2, i, this.zzWIX);
        return cArr2;
    }

    private final void zzXLq() {
        this.zzWJ0 = false;
        this.zzGU.clear();
        this.zzWIZ = 0;
        this.zzWIX = 0;
    }

    public static zzZDU zzXLt() {
        return new zzZDU(null);
    }

    private void zzgb(int i) {
        if (this.zzGU == null) {
            this.zzGU = new ArrayList<>();
        }
        char[] cArr = this.zzWIY;
        this.zzWJ0 = true;
        this.zzGU.add(cArr);
        int length = cArr.length;
        this.zzWIZ += length;
        char[] cArr2 = new char[Math.max(i, zzgd(length))];
        this.zzWIX = 0;
        this.zzWIY = cArr2;
    }

    private void zzgc(int i) {
        int i2 = this.zzS6;
        this.zzS6 = 0;
        char[] cArr = this.zzWLX;
        this.zzWLX = null;
        int i3 = this.zzWJ1;
        this.zzWJ1 = -1;
        int i4 = i + i2;
        char[] cArr2 = this.zzWIY;
        if (cArr2 == null || i4 > cArr2.length) {
            this.zzWIY = zzgf(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.zzWIY, 0, i2);
        }
        this.zzWIZ = 0;
        this.zzWIX = i2;
    }

    private static int zzgd(int i) {
        return Math.min(i + (i < 8000 ? i : i >> 1), 262144);
    }

    private final char[] zzgf(int i) {
        char[] cArrZzh6;
        int iMax = Math.max(i, 500);
        zzZHC zzzhc = this.zzWML;
        return (zzzhc == null || (cArrZzh6 = zzzhc.zzh6(iMax)) == null) ? new char[iMax] : cArrZzh6;
    }

    public final int size() {
        return this.zzWJ1 >= 0 ? this.zzS6 : this.zzWIZ + this.zzWIX;
    }

    public final String toString() {
        return zzXLp();
    }

    public final void zzI(char[] cArr, int i, int i2) {
        if (this.zzWJ1 >= 0) {
            zzgc(i2);
        }
        this.zzWIW = null;
        this.zzWIV = null;
        char[] cArr2 = this.zzWIY;
        int length = cArr2.length;
        int i3 = this.zzWIX;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.zzWIX += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        zzgb(i2);
        System.arraycopy(cArr, i, this.zzWIY, 0, i2);
        this.zzWIX = i2;
    }

    public final void zzJ(char[] cArr, int i, int i2) {
        this.zzWLX = null;
        this.zzWJ1 = -1;
        this.zzS6 = 0;
        this.zzWIW = null;
        this.zzWIV = null;
        if (this.zzWJ0) {
            zzXLq();
        } else {
            if (this.zzWIY == null) {
                this.zzWIY = zzgf(i2);
            }
            this.zzWIZ = 0;
            this.zzWIX = 0;
        }
        zzI(cArr, i, i2);
    }

    public final void zzK(char[] cArr, int i, int i2) {
        this.zzWLX = cArr;
        this.zzWJ1 = i;
        this.zzS6 = i2;
        this.zzWIW = null;
        this.zzWIV = null;
        if (this.zzWJ0) {
            zzXLq();
        }
    }

    public final void zzOR(boolean z) {
        if (this.zzWML == null || this.zzWIY == null) {
            return;
        }
        if (z) {
            zzXLs();
        } else {
            if (this.zzWJ1 < 0 && this.zzWIZ + this.zzWIX > 0) {
                return;
            }
            ArrayList<char[]> arrayList = this.zzGU;
            if (arrayList != null && arrayList.size() > 0) {
                this.zzGU.clear();
                this.zzWIZ = 0;
            }
        }
        char[] cArr = this.zzWIY;
        this.zzWIY = null;
        this.zzWML.zzO(cArr);
    }

    public final void zzR(int i, char c) {
        String strSubstring;
        this.zzWJ1 = 0;
        int i2 = i + 1;
        this.zzS6 = i2;
        if (c == '\t') {
            this.zzWLX = zzWIS;
            String[] strArr = zzWIR;
            strSubstring = strArr[i];
            if (strSubstring == null) {
                strSubstring = "\n\t\t\t\t\t\t\t\t\t".substring(0, i2);
                strArr[i] = strSubstring;
            }
        } else {
            this.zzWLX = zzWIU;
            String[] strArr2 = zzWIT;
            strSubstring = strArr2[i];
            if (strSubstring == null) {
                strSubstring = "\n                                 ".substring(0, i2);
                strArr2[i] = strSubstring;
            }
        }
        this.zzWIW = strSubstring;
        this.zzWIV = null;
        ArrayList<char[]> arrayList = this.zzGU;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.zzGU.clear();
        this.zzWIZ = 0;
        this.zzWIX = 0;
    }

    public final char[] zzXLi() {
        if (this.zzGU == null) {
            this.zzGU = new ArrayList<>();
        }
        this.zzWJ0 = true;
        this.zzGU.add(this.zzWIY);
        int length = this.zzWIY.length;
        this.zzWIZ += length;
        char[] cArr = new char[zzgd(length)];
        this.zzWIX = 0;
        this.zzWIY = cArr;
        return cArr;
    }

    public final int zzXLj() {
        return this.zzWIX;
    }

    public final char[] zzXLk() {
        if (this.zzWJ1 >= 0) {
            zzgc(1);
        } else {
            char[] cArr = this.zzWIY;
            if (cArr == null) {
                this.zzWIY = zzgf(0);
            } else if (this.zzWIX >= cArr.length) {
                zzgb(1);
            }
        }
        return this.zzWIY;
    }

    public final void zzXLl() {
        if (this.zzWJ1 >= 0) {
            zzgc(16);
        }
    }

    public final void zzXLm() throws zzZQS {
        if (this.zzWJ1 < 0) {
            zzXLp();
        }
    }

    public final void zzXLn() {
        ArrayList<char[]> arrayList;
        if (this.zzWIV != null || this.zzWJ1 >= 0 || (arrayList = this.zzGU) == null || arrayList.size() <= 0) {
            return;
        }
        zzXLo();
    }

    public final char[] zzXLo() {
        char[] cArr = this.zzWIV;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrZzXLh = zzXLh();
        this.zzWIV = cArrZzXLh;
        return cArrZzXLh;
    }

    public final String zzXLp() {
        if (this.zzWIW == null) {
            char[] cArr = this.zzWIV;
            if (cArr != null) {
                this.zzWIW = new String(cArr);
            } else {
                int i = this.zzWJ1;
                if (i >= 0) {
                    int i2 = this.zzS6;
                    if (i2 <= 0) {
                        this.zzWIW = "";
                        return "";
                    }
                    this.zzWIW = new String(this.zzWLX, i, i2);
                } else {
                    int i3 = this.zzWIZ;
                    int i4 = this.zzWIX;
                    if (i3 == 0) {
                        this.zzWIW = i4 != 0 ? new String(this.zzWIY, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.zzGU;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.zzGU.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.zzWIY, 0, this.zzWIX);
                        this.zzWIW = sb.toString();
                    }
                }
            }
        }
        return this.zzWIW;
    }

    public final void zzXLr() {
        zzXLs();
        if (this.zzWIY == null) {
            this.zzWIY = zzgf(0);
        }
    }

    public final void zzXLs() {
        this.zzWLX = null;
        this.zzWJ1 = -1;
        this.zzS6 = 0;
        this.zzWIW = null;
        this.zzWIV = null;
        if (this.zzWJ0) {
            zzXLq();
        }
        this.zzWIX = 0;
    }

    public final void zzge(int i) {
        this.zzWIX = i;
    }

    public final void zzq(char c) {
        if (this.zzWJ1 >= 0) {
            zzgc(16);
        }
        this.zzWIW = null;
        this.zzWIV = null;
        char[] cArr = this.zzWIY;
        if (this.zzWIX >= cArr.length) {
            zzgb(1);
            cArr = this.zzWIY;
        }
        int i = this.zzWIX;
        this.zzWIX = i + 1;
        cArr[i] = c;
    }

    public final boolean zzwT(String str) {
        int length = str.length();
        if (this.zzWJ1 >= 0) {
            if (this.zzS6 != length) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) != this.zzWLX[this.zzWJ1 + i]) {
                    return false;
                }
            }
            return true;
        }
        if (length != size()) {
            return false;
        }
        ArrayList<char[]> arrayList = this.zzGU;
        char[] cArrZzXLo = (arrayList == null || arrayList.size() == 0) ? this.zzWIY : zzXLo();
        for (int i2 = 0; i2 < length; i2++) {
            if (cArrZzXLo[i2] != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }
}
