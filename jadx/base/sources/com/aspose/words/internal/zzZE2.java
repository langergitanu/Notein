package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE2 {
    protected int zzVf;
    protected zzZE3 zzWJc;
    protected zzZE3 zzWJd;
    protected int zzWJe;
    protected int zzWJf;
    protected zzZE3[] zzWJg;

    public zzZE2() {
        this((byte) 0);
    }

    private void rehash() {
        zzZE3[] zzze3Arr = this.zzWJg;
        int length = zzze3Arr.length << 2;
        this.zzWJg = new zzZE3[length];
        this.zzWJe = length - 1;
        this.zzWJf <<= 2;
        int i = 0;
        for (zzZE3 zzze3 : zzze3Arr) {
            while (zzze3 != null) {
                i++;
                int iZzx2 = zzx2(zzze3.getId()) & this.zzWJe;
                zzZE3 zzze3ZzXLF = zzze3.zzXLF();
                zzze3.zzY(this.zzWJg[iZzx2]);
                this.zzWJg[iZzx2] = zzze3;
                zzze3 = zzze3ZzXLF;
            }
        }
        if (i != this.zzVf) {
            zzZE1.zzx1("on rehash(): had " + this.zzVf + " entries; now have " + i + ".");
        }
    }

    private static int zzx2(String str) {
        int iCharAt = str.charAt(0);
        int length = str.length();
        for (int i = 1; i < length; i++) {
            iCharAt = (iCharAt * 31) + str.charAt(i);
        }
        return iCharAt;
    }

    public final zzZE3 zzXLE() {
        return this.zzWJd;
    }

    public final zzZE3 zzY(char[] cArr, int i, int i2, int i3, zzZQY zzzqy, zzZDZ zzzdz, zzZDZ zzzdz2) {
        zzZE3 zzze3ZzXLG;
        int i4 = this.zzWJe & i3;
        zzZE3 zzze3ZzXLF = this.zzWJg[i4];
        while (zzze3ZzXLF != null && !zzze3ZzXLF.zzP(cArr, i, i2)) {
            zzze3ZzXLF = zzze3ZzXLF.zzXLF();
        }
        if (zzze3ZzXLF == null) {
            if (this.zzVf >= this.zzWJf) {
                rehash();
                i4 = this.zzWJe & i3;
            }
            this.zzVf++;
            zzZE3 zzze3 = new zzZE3(new String(cArr, i, i2), zzzqy, true, zzzdz, zzzdz2);
            zzze3.zzY(this.zzWJg[i4]);
            this.zzWJg[i4] = zzze3;
            return zzze3;
        }
        if (!zzze3ZzXLF.isDefined()) {
            zzze3ZzXLF.zzZ(zzzqy);
            if (zzze3ZzXLF == this.zzWJd) {
                do {
                    zzze3ZzXLG = this.zzWJd.zzXLG();
                    this.zzWJd = zzze3ZzXLG;
                    if (zzze3ZzXLG == null) {
                        break;
                    }
                } while (zzze3ZzXLG.isDefined());
                if (this.zzWJd == null) {
                    this.zzWJc = null;
                }
            }
        }
        return zzze3ZzXLF;
    }

    public final zzZE3 zzZ(char[] cArr, int i, int i2, int i3, zzZQY zzzqy, zzZDZ zzzdz, zzZDZ zzzdz2) {
        int i4 = this.zzWJe & i3;
        for (zzZE3 zzze3ZzXLF = this.zzWJg[i4]; zzze3ZzXLF != null; zzze3ZzXLF = zzze3ZzXLF.zzXLF()) {
            if (zzze3ZzXLF.zzP(cArr, i, i2)) {
                return zzze3ZzXLF;
            }
        }
        if (this.zzVf >= this.zzWJf) {
            rehash();
            i4 = this.zzWJe & i3;
        }
        this.zzVf++;
        zzZE3 zzze3 = new zzZE3(new String(cArr, i, i2), zzzqy, false, zzzdz, zzzdz2);
        zzze3.zzY(this.zzWJg[i4]);
        this.zzWJg[i4] = zzze3;
        if (this.zzWJd == null) {
            this.zzWJc = zzze3;
            this.zzWJd = zzze3;
            return zzze3;
        }
        this.zzWJc.zzZ(zzze3);
        this.zzWJc = zzze3;
        return zzze3;
    }

    private zzZE2(byte b) {
        this.zzWJg = new zzZE3[128];
        this.zzWJe = 127;
        this.zzVf = 0;
        this.zzWJf = 102;
        this.zzWJc = null;
        this.zzWJd = null;
    }
}
