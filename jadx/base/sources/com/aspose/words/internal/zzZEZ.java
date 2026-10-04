package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEZ {
    protected static final zzZE0 zzWLH = zzZE0.zzXLD();
    protected int zzWLA;
    protected zzZF0[] zzWLC;
    protected int zzWLD;
    protected zzZF0[] zzWLE;
    final String zzWLF;
    final String zzWLG;
    protected int zzWLv;
    protected int zzWLw;
    protected int zzWQg;
    protected int zzWQh;
    protected int zzWZQ;
    protected int zzZPE;
    protected boolean zzWLB = false;
    protected zzZDT zzWLz = null;
    private final zzZDT zzWLy = new zzZDT(6);
    protected int[] zzWLx = null;

    public zzZEZ(zzZHC zzzhc, boolean z) {
        this.zzWLA = zzzhc.zzXPL() ? -1 : -2;
        if (z) {
            this.zzWLG = "xml";
            this.zzWLF = "id";
        } else {
            this.zzWLG = null;
            this.zzWLF = "xml:id";
        }
        this.zzWQh = zzzhc.zzXPF();
        this.zzWQg = zzzhc.zzXPE();
    }

    private void zzXN0() {
        this.zzWLv = 4;
        this.zzWLw = 4;
        int[] iArr = this.zzWLx;
        if (iArr == null || iArr.length < 4) {
            this.zzWLx = new int[4 + 1];
        }
        int[] iArr2 = this.zzWLx;
        iArr2[3] = 0;
        iArr2[2] = 0;
        iArr2[1] = 0;
        iArr2[0] = 0;
        zzXN1();
    }

    private void zzXN1() {
        if (this.zzWLE == null) {
            this.zzWLE = new zzZF0[8];
        }
        if (this.zzWLz == null) {
            this.zzWLz = new zzZDT(12);
        }
    }

    private void zzgC(int i) {
        throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" attributes", this.zzWZQ, OooO0O0.OooO0o.OooO0OO(i, "Invalid index ", "; current element has only ")));
    }

    private int zzgD(int i) {
        return i < this.zzWZQ ? this.zzWLE[i].zzWLJ : this.zzWLz.zzXLe();
    }

    public final int getCount() {
        return this.zzWZQ;
    }

    public final String getLocalName(int i) {
        if (i < 0 || i >= this.zzWZQ) {
            zzgC(i);
        }
        return this.zzWLE[i].zzZnu;
    }

    public final String getURI(int i) {
        if (i < 0 || i >= this.zzWZQ) {
            zzgC(i);
        }
        return this.zzWLE[i].zzWLK;
    }

    public final String getValue(int i) {
        if (i < 0 || i >= this.zzWZQ) {
            zzgC(i);
        }
        String strZzXLg = this.zzWLz.zzXLg();
        zzZF0[] zzzf0Arr = this.zzWLE;
        zzZF0 zzzf0 = zzzf0Arr[i];
        int i2 = i + 1;
        return i2 < this.zzWZQ ? zzzf0.zzYT(strZzXLg, zzzf0Arr[i2].zzWLJ) : zzzf0.getValue(strZzXLg);
    }

    public final void reset() {
        if (this.zzZPE > 0) {
            this.zzWLy.reset();
            this.zzWLB = false;
            this.zzZPE = 0;
        }
        if (this.zzWZQ > 0) {
            this.zzWLz.reset();
            this.zzWZQ = 0;
            if (this.zzWLA >= 0) {
                this.zzWLA = -1;
            }
        }
    }

    public final int zzN(String str, String str2, String str3, String str4) throws zzZQS {
        zzZEZ zzzez;
        String str5;
        String str6;
        int i = this.zzWZQ;
        if (i <= 0) {
            zzXN0();
        }
        int iHashCode = str.hashCode();
        if (str2 != null && str2.length() > 0) {
            iHashCode ^= str2.hashCode();
        }
        int i2 = iHashCode;
        int i3 = this.zzWLw;
        int i4 = (i3 - 1) & i2;
        int[] iArr = this.zzWLx;
        int i5 = iArr[i4];
        if (i5 == 0) {
            iArr[i4] = i + 1;
            zzzez = this;
            str5 = str;
            str6 = str2;
        } else {
            int i6 = i5 - 1;
            int i7 = this.zzWLv;
            zzzez = this;
            str5 = str;
            str6 = str2;
            int[] iArrZzZ = zzzez.zzZ(str6, str5, iArr, i6, i7, i2, i3);
            if (iArrZzZ == null) {
                return -1;
            }
            iArrZzZ[i7 + 1] = i;
            zzzez.zzWLx = iArrZzZ;
            zzzez.zzWLv = i7 + 2;
        }
        zzXN(str3, str5);
        zzZF0 zzzf0 = zzzez.zzWLE[zzzez.zzWZQ - 1];
        zzzf0.zzWLK = str6;
        zzzf0.setValue(str4);
        return zzzez.zzWZQ - 1;
    }

    public final String zzRR(int i) {
        if (i < 0 || i >= this.zzWZQ) {
            zzgC(i);
        }
        return this.zzWLE[i].zzZpC;
    }

    public final zzZDT zzXN(String str, String str2) throws zzZQS {
        if (this.zzWZQ == 0) {
            if (this.zzWLE == null) {
                zzXN1();
            }
            this.zzWLE[0] = new zzZF0(str, str2, 0);
        } else {
            int iZzXLe = this.zzWLz.zzXLe();
            int i = this.zzWZQ;
            zzZF0[] zzzf0Arr = this.zzWLE;
            if (i >= zzzf0Arr.length) {
                if (i + this.zzZPE >= this.zzWQh) {
                    throw new zzZQS(C21023OooO0Oo.OooO0OO(") exceeded", this.zzWQh, new StringBuilder("Attribute limit (")));
                }
                this.zzWLE = (zzZF0[]) zzZE5.zzYH(zzzf0Arr);
            }
            zzZF0[] zzzf0Arr2 = this.zzWLE;
            int i2 = this.zzWZQ;
            zzZF0 zzzf0 = zzzf0Arr2[i2];
            if (zzzf0 == null) {
                zzzf0Arr2[i2] = new zzZF0(str, str2, iZzXLe);
            } else {
                zzzf0.zzK(str, str2, iZzXLe);
            }
        }
        int i3 = this.zzWZQ;
        this.zzWZQ = i3 + 1;
        if (str2 == this.zzWLF && str == this.zzWLG && this.zzWLA != -2) {
            this.zzWLA = i3;
        }
        return this.zzWLz;
    }

    public final zzZDT zzXN2() throws zzZQS {
        if (this.zzWLB) {
            return null;
        }
        this.zzWLB = true;
        return zzxL(null);
    }

    public final int zzXN3() {
        return this.zzZPE;
    }

    public final zzZF0 zzYV(int i, boolean z) {
        zzZF0 zzzf0 = this.zzWLC[i];
        String strZzXLg = this.zzWLy.zzXLg();
        int i2 = this.zzZPE;
        if (i2 != 0) {
            int i3 = i + 1;
            strZzXLg = i3 < i2 ? zzzf0.zzYT(strZzXLg, this.zzWLC[i3].zzWLJ) : zzzf0.getValue(strZzXLg);
        }
        if (z && strZzXLg.length() > 0) {
            strZzXLg = zzWLH.zzx0(strZzXLg);
        }
        zzzf0.zzWLK = strZzXLg;
        return zzzf0;
    }

    public final void zzZ(int i, zzYF6 zzyf6) throws zzZQS {
        zzZF0 zzzf0 = this.zzWLE[i];
        String strZzZ = zzyf6.zzZ(zzzf0.zzZnu, zzzf0.zzWLK, zzzf0.zzZpC, this.zzWLz.zzXLf(), zzgD(i), zzgD(i + 1));
        if (strZzZ != null) {
            zzzf0.setValue(strZzZ);
        }
    }

    public final zzZR1 zzgE(int i) {
        if (i < 0 || i >= this.zzWZQ) {
            zzgC(i);
        }
        return this.zzWLE[i].zzXN4();
    }

    public final void zzgF(int i) {
        String strZzO = zzZDX.zzO(this.zzWLz.zzXLf(), zzgD(i), zzgD(i + 1));
        if (strZzO != null) {
            this.zzWLE[i].setValue(strZzO);
        }
    }

    public final zzZDT zzxL(String str) throws zzZQS {
        int i = this.zzZPE;
        if (i == 0) {
            if (this.zzWLC == null) {
                this.zzWLC = new zzZF0[6];
            }
            this.zzWLC[0] = new zzZF0(null, str, 0);
        } else {
            if (str != null) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (str == this.zzWLC[i2].zzZnu) {
                        return null;
                    }
                }
            }
            zzZF0[] zzzf0Arr = this.zzWLC;
            if (i >= zzzf0Arr.length) {
                if (this.zzWZQ + this.zzZPE >= this.zzWQh) {
                    throw new zzZQS(C21023OooO0Oo.OooO0OO(") exceeded", this.zzWQh, new StringBuilder("Attribute limit (")));
                }
                this.zzWLC = (zzZF0[]) zzZE5.zzYH(zzzf0Arr);
            }
            int iZzXLe = this.zzWLy.zzXLe();
            zzZF0[] zzzf0Arr2 = this.zzWLC;
            zzZF0 zzzf0 = zzzf0Arr2[i];
            if (zzzf0 == null) {
                zzzf0Arr2[i] = new zzZF0(null, str, iZzXLe);
            } else {
                zzzf0.zzK(null, str, iZzXLe);
            }
        }
        this.zzZPE++;
        return this.zzWLy;
    }

    public final int zzZ(zzZEV zzzev, zzZDW zzzdw) throws zzZQS {
        int i = this.zzWZQ;
        this.zzWLD = i;
        if (i <= 0) {
            this.zzWLv = 0;
            this.zzWLw = 0;
            return this.zzWLA;
        }
        for (int i2 = 0; i2 < i; i2++) {
            zzZF0 zzzf0 = this.zzWLE[i2];
            String str = zzzf0.zzZpC;
            if (str != null) {
                if (str == "xml") {
                    zzzf0.zzWLK = "http://www.w3.org/XML/1998/namespace";
                } else {
                    String strZzwX = zzzdw.zzwX(str);
                    if (strZzwX == null) {
                        zzzev.zzV(zzZH9.zzWPp, str, zzzf0.zzZnu);
                    }
                    zzzf0.zzWLK = strZzwX;
                }
            }
        }
        int[] iArr = this.zzWLx;
        int i3 = 4;
        while (i3 < (i >> 2) + i) {
            i3 += i3;
        }
        this.zzWLw = i3;
        int i4 = (i3 >> 4) + i3;
        if (iArr != null && iArr.length >= i4) {
            Arrays.fill(iArr, 0, i3, 0);
        } else {
            iArr = new int[i4];
        }
        int i5 = i3 - 1;
        int[] iArr2 = iArr;
        int i6 = i3;
        for (int i7 = 0; i7 < i; i7++) {
            zzZF0 zzzf02 = this.zzWLE[i7];
            String str2 = zzzf02.zzZnu;
            int iHashCode = str2.hashCode();
            String str3 = zzzf02.zzWLK;
            if (str3 != null) {
                iHashCode ^= str3.hashCode();
            }
            int i8 = iHashCode;
            int i9 = i8 & i5;
            int i10 = iArr2[i9];
            if (i10 == 0) {
                iArr2[i9] = i7 + 1;
            } else {
                int i11 = i10 - 1;
                int[] iArrZzZ = zzZ(str3, str2, iArr2, i11, i6, i8, i3);
                if (iArrZzZ == null) {
                    zzZ(zzzev, i11);
                } else {
                    iArrZzZ[i6 + 1] = i7;
                    i6 += 2;
                }
                iArr2 = iArrZzZ;
            }
        }
        this.zzWLv = i6;
        this.zzWLx = iArr2;
        return this.zzWLA;
    }

    public final String getValue(String str, String str2) {
        int i = this.zzWLw;
        if (i == 0) {
            return null;
        }
        int iHashCode = str2.hashCode();
        if (str != null) {
            if (str.length() == 0) {
                str = null;
            } else {
                iHashCode ^= str.hashCode();
            }
        }
        int i2 = this.zzWLx[(i - 1) & iHashCode];
        if (i2 == 0) {
            return null;
        }
        int i3 = i2 - 1;
        if (this.zzWLE[i3].zzXO(str, str2)) {
            return getValue(i3);
        }
        int i4 = this.zzWLv;
        while (i < i4) {
            int[] iArr = this.zzWLx;
            if (iArr[i] == iHashCode) {
                int i5 = iArr[i + 1];
                if (this.zzWLE[i5].zzXO(str, str2)) {
                    return getValue(i5);
                }
            }
            i += 2;
        }
        return null;
    }

    private int[] zzZ(String str, String str2, int[] iArr, int i, int i2, int i3, int i4) {
        String str3;
        String str4;
        zzZF0 zzzf0 = this.zzWLE[i];
        if (zzzf0.zzZnu == str2 && ((str4 = zzzf0.zzWLK) == str || (str4 != null && str4.equals(str)))) {
            return null;
        }
        if (i2 + 1 >= iArr.length) {
            iArr = zzZE5.zzZW(iArr);
        }
        while (i4 < i2) {
            if (iArr[i4] == i3) {
                zzZF0 zzzf02 = this.zzWLE[iArr[i4 + 1]];
                if (zzzf02.zzZnu == str2 && ((str3 = zzzf02.zzWLK) == str || (str3 != null && str3.equals(str)))) {
                    return null;
                }
            }
            i4 += 2;
        }
        iArr[i2] = i3;
        return iArr;
    }

    private void zzZ(zzZEV zzzev, int i) throws zzZQS {
        zzzev.zzxJ("Duplicate attribute '" + zzgE(i) + "'.");
    }
}
