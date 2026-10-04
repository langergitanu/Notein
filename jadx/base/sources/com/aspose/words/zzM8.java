package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzM8 extends zzM6 {
    private String zzZoA;
    private String zzZoB;
    private String zzZoC;
    private String zzZoz;
    private zzYBI[] zzZrT;

    public zzM8(String str, String str2, String str3, String str4, String str5) {
        super(str, false);
        com.aspose.words.internal.zzZYD.zzXk(str2);
        com.aspose.words.internal.zzZYD.zzXk(str3);
        com.aspose.words.internal.zzZYD.zzXk(str4);
        com.aspose.words.internal.zzZYD.zzXk(str5);
        com.aspose.words.internal.zzZYD.zzXm(str2);
        com.aspose.words.internal.zzZYD.zzXm(str3);
        com.aspose.words.internal.zzZYD.zzXm(str4);
        com.aspose.words.internal.zzZYD.zzXm(str5);
        this.zzZoC = str2;
        this.zzZoB = str3;
        this.zzZoA = str4;
        this.zzZoz = str5;
    }

    @Override // com.aspose.words.zzM6
    public final zzMP zzZ(zzPS zzps) {
        zzps.getCount();
        return new zzM7(zzps.zzSx(this.zzZoC).zzZWj(), zzps.zzSx(this.zzZoB).zzZWj(), zzps.zzSx(this.zzZoA).zzZWj(), zzps.zzSx(this.zzZoz).zzZWj());
    }

    @Override // com.aspose.words.zzM6
    public final zzYBI[] zzZXv() {
        zzYBI[] zzybiArr = this.zzZrT;
        if (zzybiArr != null) {
            return zzybiArr;
        }
        zzYBI[] zzybiArr2 = {new zzYBI(this.zzZoC, true), new zzYBI(this.zzZoB, true), new zzYBI(this.zzZoA, true), new zzYBI(this.zzZoz, true)};
        this.zzZrT = zzybiArr2;
        return zzybiArr2;
    }

    @Override // com.aspose.words.zzM6
    public final zzPS zzZ(zzL2 zzl2, boolean z, boolean z2) {
        if (zzl2.getCount() == 0 || zzl2.getCount() > 4) {
            return null;
        }
        zzPR zzpr = new zzPR();
        zzYBI[] zzybiArrZzZXv = zzZXv();
        zzL2 zzl22 = new zzL2(zzl2);
        if (zzl22.getCount() == 1) {
            zzl22.zzI(zzl22.zzMl(0));
        }
        if (zzl22.getCount() == 2) {
            zzl22.zzI(zzl22.zzMl(0));
        }
        if (zzl22.getCount() == 3) {
            zzl22.zzI(zzl22.zzMl(1));
        }
        int i = 0;
        while (i < 4) {
            RefInt refInt = new RefInt(0);
            boolean z3 = z;
            boolean z4 = z2;
            zzPS zzpsZzY = zzybiArrZzZXv[i].zzY(zzl22, i, z3, z4, refInt);
            refInt.get();
            if (zzpsZzY == null) {
                return null;
            }
            zzpr.zzO(zzpsZzY);
            i++;
            z = z3;
            z2 = z4;
        }
        return zzpr.zzZWe();
    }
}
