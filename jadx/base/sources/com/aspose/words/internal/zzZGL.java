package com.aspose.words.internal;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGL extends zzZGJ {
    BitSet zzWO9;
    protected boolean zzWOa;
    protected BitSet zzWOb;
    protected boolean zzWOc;

    public zzZGL(zzZGN zzzgn, zzYFC zzyfc, boolean z, Map<zzZDZ, zzZGZ> map, Map<String, zzZG3> map2) {
        super(zzzgn, zzyfc, z, map, map2);
        this.zzWOc = false;
        this.zzWOb = null;
        this.zzWOa = false;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final String zzP(String str, String str2, String str3, String str4) throws zzZQS {
        int iZzXOT;
        zzZH1 zzzh1 = this.zzWNS.get(this.zzWNP.zzXw(str3, str));
        int i = this.zzWZQ;
        this.zzWZQ = i + 1;
        zzZH1[] zzzh1Arr = this.zzWNR;
        if (i >= zzzh1Arr.length) {
            this.zzWNR = (zzZH1[]) zzZE5.zzYH(zzzh1Arr);
        }
        this.zzWNR[i] = zzzh1;
        if (zzzh1 == null || !this.zzWOc || (iZzXOT = zzzh1.zzXOT()) < 0) {
            return null;
        }
        this.zzWOb.set(iZzXOT);
        return null;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final void zzP7(boolean z) {
    }

    @Override // com.aspose.words.internal.zzZGJ
    public final zzZE2 zzXOw() {
        zzZE1.zzx1(null);
        return null;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final int zzXOx() throws zzZQS {
        zzZGZ zzzgz = this.zzWNV;
        if (this.zzWOc) {
            BitSet bitSet = this.zzWOb;
            int iZzXOL = zzzgz.zzXOL();
            for (int iNextClearBit = bitSet.nextClearBit(0); iNextClearBit < iZzXOL; iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1)) {
                zzZH1 zzzh1 = zzzgz.zzWOw.get(iNextClearBit);
                if (zzzh1.zzXOP()) {
                    zzZ(zzzh1);
                }
            }
        }
        if (zzzgz == null) {
            return 4;
        }
        return zzzgz.zzXOM();
    }

    @Override // com.aspose.words.internal.zzZGJ
    public final void zzXOy() {
    }

    @Override // com.aspose.words.internal.zzZGJ
    public final boolean zzXOz() {
        return false;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final String zzZ(String str, String str2, String str3, char[] cArr, int i, int i2) throws zzZQS {
        int iZzXOT;
        zzZH1 zzzh1 = this.zzWNS.get(this.zzWNP.zzXw(str3, str));
        int i3 = this.zzWZQ;
        this.zzWZQ = i3 + 1;
        zzZH1[] zzzh1Arr = this.zzWNR;
        if (i3 >= zzzh1Arr.length) {
            this.zzWNR = (zzZH1[]) zzZE5.zzYH(zzzh1Arr);
        }
        this.zzWNR[i3] = zzzh1;
        if (zzzh1 == null) {
            return null;
        }
        if (this.zzWOc && (iZzXOT = zzzh1.zzXOT()) >= 0) {
            this.zzWOb.set(iZzXOT);
        }
        if (this.zzWOa) {
            return zzzh1.zzU(cArr, i, i2);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final int zzj(String str, String str2, String str3) throws zzZQS {
        zzZGZ zzzgz;
        int i = this.zzWNT;
        int i2 = i - 1;
        this.zzWNT = i2;
        zzZGZ[] zzzgzArr = this.zzWNU;
        zzzgzArr[i2] = null;
        if (i2 > 0 && (zzzgz = zzzgzArr[i - 2]) != null) {
            return zzzgz.zzXOM();
        }
        return 4;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final void zzk(String str, String str2, String str3) throws zzZQS {
        this.zzWNP.zzXw(str3, str);
        zzZGZ zzzgz = this.zzWNY.get(this.zzWNP);
        int i = this.zzWNT;
        this.zzWNT = i + 1;
        zzZGZ[] zzzgzArr = this.zzWNU;
        if (i >= zzzgzArr.length) {
            this.zzWNU = (zzZGZ[]) zzZE5.zzYH(zzzgzArr);
        }
        zzZGZ[] zzzgzArr2 = this.zzWNU;
        this.zzWNV = zzzgz;
        zzzgzArr2[i] = zzzgz;
        this.zzWZQ = 0;
        this.zzWNQ = -2;
        if (zzzgz == null) {
            this.zzWNS = zzZGJ.zzWO2;
            this.zzWOc = false;
            this.zzWOb = null;
            this.zzWOa = false;
            return;
        }
        HashMap<zzZDZ, zzZH1> map = zzzgz.zzWOx;
        this.zzWNS = map;
        if (map == null) {
            this.zzWNS = zzZGJ.zzWO2;
            this.zzWOc = false;
            this.zzWOb = null;
            this.zzWOa = false;
            return;
        }
        this.zzWOa = this.zzWNW || zzzgz.zzWOt;
        boolean z = zzzgz.zzWOu;
        this.zzWOc = z;
        if (!z) {
            this.zzWOb = null;
            return;
        }
        int iZzXOL = zzzgz.zzXOL();
        BitSet bitSet = this.zzWO9;
        if (bitSet == null) {
            bitSet = new BitSet(iZzXOL);
            this.zzWO9 = bitSet;
        } else {
            bitSet.clear();
        }
        this.zzWOb = bitSet;
    }
}
