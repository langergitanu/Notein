package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE8 {
    private int[] zzXpQ;
    private int zzXpR;
    private boolean[] zzXpS;
    private String[] zzXpT;

    public zzYE8(String[] strArr) {
        this.zzXpT = strArr;
        int i = 0;
        while (true) {
            String[] strArr2 = this.zzXpT;
            if (i >= strArr2.length) {
                this.zzXpQ = new int[strArr2.length];
                zzYdq();
                return;
            } else {
                if (strArr2[i].length() == 0) {
                    this.zzXpT[i] = "\u0000";
                }
                i++;
            }
        }
    }

    private void zzYdq() {
        int i = 0;
        int length = 0;
        while (true) {
            String[] strArr = this.zzXpT;
            if (i >= strArr.length) {
                this.zzXpR = length;
                return;
            } else {
                length += strArr[i].length();
                this.zzXpQ[i] = length - 1;
                i++;
            }
        }
    }

    private char zzn1(int i) {
        int iZzn3 = zzn3(i);
        return this.zzXpT[iZzn3].charAt(i - (iZzn3 > 0 ? this.zzXpQ[iZzn3 - 1] + 1 : 0));
    }

    public final char get(int i) {
        return zzn1(i);
    }

    public final int getLength() {
        return this.zzXpR;
    }

    public final int getRunCount() {
        return this.zzXpT.length;
    }

    public final void zzV(String str, int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.zzXpT;
            if (i >= strArr.length - 1) {
                break;
            }
            int i3 = iArr[i];
            if (i3 != 0) {
                this.zzXpT[i] = C22241OooO0Oo.OooO00o(i3, i2, i2, i2, str);
                i2 = iArr[i];
            } else {
                if (strArr.length == 2) {
                    strArr[1] = "\u0000";
                    break;
                }
                strArr[i] = "\u0000";
            }
            i++;
        }
        this.zzXpT[i] = str.substring(i2);
        zzYdq();
    }

    public final String zzn2(int i) {
        String str = this.zzXpT[i];
        return "\u0000".equals(str) ? "" : str;
    }

    public final int zzn3(int i) {
        int[] iArr = this.zzXpQ;
        int iZzZ = com.aspose.words.internal.zzZ1.zzZ(iArr, iArr.length, i);
        return iZzZ >= 0 ? iZzZ : -(iZzZ + 1);
    }

    public final boolean zzn4(int i) {
        if (this.zzXpS == null) {
            return false;
        }
        int iZzn3 = zzn3(i);
        return i - (iZzn3 > 0 ? this.zzXpQ[iZzn3 + (-1)] + 1 : 0) == 0 && this.zzXpS[iZzn3];
    }

    public zzYE8(String[] strArr, boolean[] zArr) {
        this(strArr);
        this.zzXpS = zArr;
    }
}
