package com.aspose.words.internal;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGK extends zzZGJ {
    BitSet zzWO3;
    boolean zzWO4;
    protected BitSet zzWO5;
    protected zzZG6[] zzWO6;
    protected zzZE2 zzWO7;
    protected boolean zzWO8;

    public zzZGK(zzZGN zzzgn, zzYFC zzyfc, boolean z, Map<zzZDZ, zzZGZ> map, Map<String, zzZG3> map2) {
        super(zzzgn, zzyfc, z, map, map2);
        this.zzWO8 = false;
        this.zzWO7 = null;
        this.zzWO5 = null;
        this.zzWO4 = false;
        this.zzWO6 = new zzZG6[16];
    }

    private void zzXOv() throws zzZQS {
        zzZE3 zzze3ZzXLE;
        zzZE2 zzze2 = this.zzWO7;
        if (zzze2 == null || (zzze3ZzXLE = zzze2.zzXLE()) == null) {
            return;
        }
        zzZ("Undefined id '" + zzze3ZzXLE.getId() + "': referenced from element <" + zzze3ZzXLE.zzXOu() + ">, attribute '" + zzze3ZzXLE.zzXLH() + "'", zzze3ZzXLE.zzlj());
    }

    @Override // com.aspose.words.internal.zzYF6
    public final String zzP(String str, String str2, String str3, String str4) throws zzZQS {
        int iZzXOT;
        zzZH1 zzzh1 = this.zzWNS.get(this.zzWNP.zzXw(str3, str));
        if (zzzh1 == null) {
            zzZGZ zzzgz = this.zzWNV;
            if (zzzgz != null) {
                zzW(zzZH9.zzWP7, zzzgz.toString(), this.zzWNP.toString());
            }
            return str4;
        }
        int i = this.zzWZQ;
        this.zzWZQ = i + 1;
        zzZH1[] zzzh1Arr = this.zzWNR;
        if (i >= zzzh1Arr.length) {
            this.zzWNR = (zzZH1[]) zzZE5.zzYH(zzzh1Arr);
        }
        this.zzWNR[i] = zzzh1;
        if (this.zzWO5 != null && (iZzXOT = zzzh1.zzXOT()) >= 0) {
            this.zzWO5.set(iZzXOT);
        }
        String strZzZ = zzzh1.zzZ(this, str4, this.zzWNW);
        if (this.zzWO4 && zzzh1.isFixed()) {
            if (strZzZ != null) {
                str4 = strZzZ;
            }
            String strZzZ2 = zzzh1.zzZ(this.zzWNZ, this);
            if (!str4.equals(strZzZ2)) {
                zzy4("Value of attribute \"" + zzzh1 + "\" (element <" + this.zzWNV + ">) not \"" + strZzZ2 + "\" as expected, but \"" + str4 + "\"");
            }
        }
        return strZzZ;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final void zzP7(boolean z) throws zzZQS {
        zzXOv();
    }

    @Override // com.aspose.words.internal.zzZGJ
    public final zzZE2 zzXOw() {
        if (this.zzWO7 == null) {
            this.zzWO7 = new zzZE2();
        }
        return this.zzWO7;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final int zzXOx() throws zzZQS {
        zzZGZ zzzgz = this.zzWNV;
        if (zzzgz == null) {
            return 4;
        }
        BitSet bitSet = this.zzWO5;
        if (bitSet != null) {
            int iZzXOL = zzzgz.zzXOL();
            for (int iNextClearBit = bitSet.nextClearBit(0); iNextClearBit < iZzXOL; iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1)) {
                zzZH1 zzzh1 = zzzgz.zzWOw.get(iNextClearBit);
                if (zzzh1.zzXOR()) {
                    zzW("Required attribute \"{0}\" missing from element <{1}>", zzzh1, zzzgz);
                } else {
                    zzZ(zzzh1);
                }
            }
        }
        return zzzgz.zzWOy;
    }

    @Override // com.aspose.words.internal.zzZGJ
    public final boolean zzXOz() {
        return true;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final String zzZ(String str, String str2, String str3, char[] cArr, int i, int i2) throws zzZQS {
        int iZzXOT;
        zzZH1 zzzh1 = this.zzWNS.get(this.zzWNP.zzXw(str3, str));
        if (zzzh1 == null) {
            zzZGZ zzzgz = this.zzWNV;
            if (zzzgz != null) {
                zzW(zzZH9.zzWP7, zzzgz.toString(), this.zzWNP.toString());
            }
            return new String(cArr, i, i2);
        }
        int i3 = this.zzWZQ;
        this.zzWZQ = i3 + 1;
        zzZH1[] zzzh1Arr = this.zzWNR;
        if (i3 >= zzzh1Arr.length) {
            this.zzWNR = (zzZH1[]) zzZE5.zzYH(zzzh1Arr);
        }
        this.zzWNR[i3] = zzzh1;
        if (this.zzWO5 != null && (iZzXOT = zzzh1.zzXOT()) >= 0) {
            this.zzWO5.set(iZzXOT);
        }
        String strZzZ = zzzh1.zzZ(this, cArr, i, i2, this.zzWNW);
        if (this.zzWO4 && zzzh1.isFixed()) {
            String strZzZ2 = zzzh1.zzZ(this.zzWNZ, this);
            if (!(strZzZ == null ? zzZDX.zzX(strZzZ2, cArr, i, i2 - i) : strZzZ2.equals(strZzZ))) {
                zzy4("Value of #FIXED attribute \"" + zzzh1 + "\" (element <" + this.zzWNV + ">) not \"" + strZzZ2 + "\" as expected, but \"" + (strZzZ == null ? new String(cArr, i, i2) : strZzZ) + "\"");
            }
        }
        return strZzZ;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final int zzj(String str, String str2, String str3) throws zzZQS {
        String strZzXOZ;
        int i = this.zzWNT;
        int i2 = i - 1;
        if (i2 < 0) {
            return 1;
        }
        this.zzWNT = i2;
        zzZGZ[] zzzgzArr = this.zzWNU;
        zzZGZ zzzgz = zzzgzArr[i2];
        zzzgzArr[i2] = null;
        zzZG6[] zzzg6Arr = this.zzWO6;
        zzZG6 zzzg6 = zzzg6Arr[i2];
        zzzg6Arr[i2] = null;
        if (zzzg6 != null && (strZzXOZ = zzzg6.zzXOZ()) != null) {
            zzy4("Validation error, element </" + zzzgz + ">: " + strZzXOZ);
        }
        if (i2 <= 0) {
            return 1;
        }
        return this.zzWNU[i - 2].zzWOy;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final void zzk(String str, String str2, String str3) throws zzZQS {
        String strZzZ;
        this.zzWNP.zzXw(str3, str);
        zzZGZ zzzgz = this.zzWNY.get(this.zzWNP);
        int i = this.zzWNT;
        this.zzWNT = i + 1;
        zzZGZ[] zzzgzArr = this.zzWNU;
        if (i >= zzzgzArr.length) {
            this.zzWNU = (zzZGZ[]) zzZE5.zzYH(zzzgzArr);
            this.zzWO6 = (zzZG6[]) zzZE5.zzYH(this.zzWO6);
        }
        zzZGZ[] zzzgzArr2 = this.zzWNU;
        this.zzWNV = zzzgz;
        zzzgzArr2[i] = zzzgz;
        if (zzzgz == null || !zzzgz.isDefined()) {
            zzK(zzZH9.zzWPb, this.zzWNP.toString());
        }
        zzZG6 zzzg6 = i > 0 ? this.zzWO6[i - 1] : null;
        if (zzzg6 != null && zzzgz != null && (strZzZ = zzzg6.zzZ(zzzgz.zzWOF)) != null) {
            int iIndexOf = strZzZ.indexOf("$END");
            String string = this.zzWNU[i - 1].toString();
            if (iIndexOf >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(strZzZ.substring(0, iIndexOf));
                sb.append("</");
                sb.append(string);
                sb.append(">");
                strZzZ = androidx.concurrent.futures.OooO0O0.OooO00o(strZzZ, iIndexOf + 4, sb);
            }
            zzy4("Validation error, encountered element <" + zzzgz.zzWOF + "> as a child of <" + string + ">: " + strZzZ);
        }
        this.zzWZQ = 0;
        this.zzWNQ = -2;
        if (zzzgz == null) {
            this.zzWO6[i] = null;
            this.zzWNS = zzZGJ.zzWO2;
            this.zzWO4 = false;
            this.zzWO5 = null;
            return;
        }
        this.zzWO6[i] = zzzgz.zzXOJ();
        HashMap<zzZDZ, zzZH1> map = zzzgz.zzWOx;
        this.zzWNS = map;
        if (map == null) {
            this.zzWNS = zzZGJ.zzWO2;
        }
        this.zzWO4 = zzzgz.zzWOv;
        int iZzXOL = zzzgz.zzXOL();
        if (iZzXOL == 0) {
            this.zzWO5 = null;
            return;
        }
        BitSet bitSet = this.zzWO3;
        if (bitSet == null) {
            bitSet = new BitSet(iZzXOL);
            this.zzWO3 = bitSet;
        } else {
            bitSet.clear();
        }
        this.zzWO5 = bitSet;
    }
}
