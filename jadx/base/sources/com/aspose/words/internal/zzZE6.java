package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE6 {
    int zzWJs;
    String[] zzWJt;
    final int zzWJu;

    private zzZE6(int i, String[] strArr) {
        this.zzWJs = i;
        this.zzWJu = i;
        this.zzWJt = strArr;
    }

    private int zzXLM() {
        return (this.zzWJs - this.zzWJu) >> 1;
    }

    public static zzZE6 zzXLO() {
        String[] strArr = new String[32];
        strArr[0] = "xml";
        strArr[1] = "http://www.w3.org/XML/1998/namespace";
        strArr[2] = "xmlns";
        strArr[3] = "http://www.w3.org/2000/xmlns/";
        return new zzZE6(4, strArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(zzZE6.class.toString());
        sb.append("; ");
        sb.append(this.zzWJs >> 1);
        sb.append(" entries; of which ");
        return C21023OooO0Oo.OooO0OO(" local]", zzXLM(), sb);
    }

    public final zzZE6 zzXLN() {
        return new zzZE6(this.zzWJs, this.zzWJt);
    }

    public final String zzXx(String str, String str2) {
        String[] strArrZzZ = this.zzWJt;
        int iHashCode = str.hashCode();
        int i = this.zzWJs;
        for (int i2 = this.zzWJu; i2 < i; i2 += 2) {
            String str3 = strArrZzZ[i2];
            if (str3 == str || (str3.hashCode() == iHashCode && str3.equals(str))) {
                int i3 = i2 + 1;
                String str4 = strArrZzZ[i3];
                strArrZzZ[i3] = str2;
                return str4;
            }
        }
        if (this.zzWJs >= strArrZzZ.length) {
            strArrZzZ = zzZE5.zzZ(strArrZzZ, strArrZzZ.length);
            this.zzWJt = strArrZzZ;
        }
        int i4 = this.zzWJs;
        int i5 = i4 + 1;
        this.zzWJs = i5;
        strArrZzZ[i4] = str;
        this.zzWJs = i4 + 2;
        strArrZzZ[i5] = str2;
        return null;
    }

    public final String zzZ(String str, zzZR2 zzzr2, String str2, int[] iArr) {
        String strIntern;
        String[] strArrZzZ = this.zzWJt;
        int i = iArr[0];
        while (true) {
            strIntern = (str + i).intern();
            i++;
            int iHashCode = strIntern.hashCode();
            int i2 = this.zzWJs + (-2);
            while (true) {
                if (i2 >= 0) {
                    String str3 = strArrZzZ[i2];
                    if (str3 == strIntern || (str3.hashCode() == iHashCode && str3.equals(strIntern))) {
                        break;
                    }
                    i2 -= 2;
                } else if (zzzr2 == null || zzzr2.getNamespaceURI(strIntern) == null) {
                    break;
                }
            }
        }
        iArr[0] = i;
        if (this.zzWJs >= strArrZzZ.length) {
            strArrZzZ = zzZE5.zzZ(strArrZzZ, strArrZzZ.length);
            this.zzWJt = strArrZzZ;
        }
        int i3 = this.zzWJs;
        int i4 = i3 + 1;
        this.zzWJs = i4;
        strArrZzZ[i3] = strIntern;
        this.zzWJs = i3 + 2;
        strArrZzZ[i4] = str2;
        return strIntern;
    }

    public final String zzx3(String str) {
        String[] strArr = this.zzWJt;
        int iHashCode = str.hashCode();
        for (int i = this.zzWJs - 1; i > 0; i -= 2) {
            String str2 = strArr[i];
            if (str2 == str || (str2.hashCode() == iHashCode && str2.equals(str))) {
                String str3 = strArr[i - 1];
                if (i < this.zzWJu) {
                    int iHashCode2 = str3.hashCode();
                    int i2 = this.zzWJs;
                    for (int i3 = i + 1; i3 < i2; i3 += 2) {
                        String str4 = strArr[i3];
                        if (str4 == str3 || (str4.hashCode() == iHashCode2 && str4.equals(str3))) {
                            break;
                        }
                    }
                }
                return str3;
            }
        }
        return null;
    }

    public final String zzx4(String str) {
        String[] strArr = this.zzWJt;
        int iHashCode = str.hashCode();
        for (int i = this.zzWJs - 2; i >= 0; i -= 2) {
            String str2 = strArr[i];
            if (str2 == str || (str2.hashCode() == iHashCode && str2.equals(str))) {
                return strArr[i + 1];
            }
        }
        return null;
    }
}
