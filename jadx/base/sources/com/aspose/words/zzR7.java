package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzR7 extends zzND {
    private zzYBI[] zzZrT;

    public zzR7() {
        super("border", false);
    }

    @Override // com.aspose.words.zzM6
    public final zzMP zzZ(zzPS zzps) {
        return null;
    }

    @Override // com.aspose.words.zzM6
    public final zzYBI[] zzZXv() {
        zzYBI[] zzybiArr = this.zzZrT;
        if (zzybiArr != null) {
            return zzybiArr;
        }
        zzYBI[] zzybiArr2 = {new zzYBI("border-top-style", true), new zzYBI("border-right-style", true), new zzYBI("border-bottom-style", true), new zzYBI("border-left-style", true), new zzYBI("border-top-width", false), new zzYBI("border-right-width", false), new zzYBI("border-bottom-width", false), new zzYBI("border-left-width", false), new zzYBI("border-top-color", false), new zzYBI("border-right-color", false), new zzYBI("border-bottom-color", false), new zzYBI("border-left-color", false)};
        this.zzZrT = zzybiArr2;
        return zzybiArr2;
    }

    @Override // com.aspose.words.zzM6
    public final void zzZ(zzPR zzpr) {
        zzPT zzptZzSx = zzpr.zzSx("border-top");
        zzPT zzptZzSx2 = zzpr.zzSx("border-right");
        zzPT zzptZzSx3 = zzpr.zzSx("border-bottom");
        zzPT zzptZzSx4 = zzpr.zzSx("border-left");
        if (zzptZzSx != null && zzptZzSx2 != null && zzptZzSx3 != null && zzptZzSx4 != null && zzptZzSx.zzZWj().zzX(zzptZzSx2.zzZWj()) && zzptZzSx.zzZWj().zzX(zzptZzSx3.zzZWj()) && zzptZzSx.zzZWj().zzX(zzptZzSx4.zzZWj()) && zzptZzSx.zzZWi() == zzptZzSx2.zzZWi() && zzptZzSx.zzZWi() == zzptZzSx3.zzZWi() && zzptZzSx.zzZWi() == zzptZzSx4.zzZWi()) {
            zzpr.remove(zzptZzSx.zzZWo());
            zzpr.remove(zzptZzSx2.zzZWo());
            zzpr.remove(zzptZzSx3.zzZWo());
            zzpr.remove(zzptZzSx4.zzZWo());
            zzpr.zzV(new zzM3(getName(), new zzRC((zzRC) zzptZzSx.zzZWj()), zzptZzSx.zzZWi()));
        }
    }

    @Override // com.aspose.words.zzND, com.aspose.words.zzM6
    public final zzPS zzZ(zzL2 zzl2, boolean z, boolean z2) {
        if (zzl2.getCount() == 0) {
            return null;
        }
        zzPR zzpr = new zzPR();
        zzL2 zzl22 = new zzL2(zzl2);
        zzPS zzpsZzZ = zzZ(zzMR.zzSj("border-top-style"), zzMR.zzSj("border-right-style"), zzMR.zzSj("border-bottom-style"), zzMR.zzSj("border-left-style"), zzl22, z, z2);
        if (zzpsZzZ.getCount() != 0) {
            zzpr.zzO(zzpsZzZ);
        }
        zzPS zzpsZzZ2 = zzZ(zzMR.zzSj("border-top-width"), zzMR.zzSj("border-right-width"), zzMR.zzSj("border-bottom-width"), zzMR.zzSj("border-left-width"), zzl22, z, false);
        if (zzpsZzZ2.getCount() != 0) {
            zzpr.zzO(zzpsZzZ2);
        }
        zzPS zzpsZzZ3 = zzZ(zzMR.zzSj("border-top-color"), zzMR.zzSj("border-right-color"), zzMR.zzSj("border-bottom-color"), zzMR.zzSj("border-left-color"), zzl22, z, z2);
        if (zzpsZzZ3.getCount() != 0) {
            zzpr.zzO(zzpsZzZ3);
        }
        if (zzl22.getCount() == 0) {
            return zzpr.zzZWe();
        }
        return null;
    }

    private static zzPS zzZ(zzOP zzop, zzOP zzop2, zzOP zzop3, zzOP zzop4, zzL2 zzl2, boolean z, boolean z2) {
        zzPR zzpr = new zzPR();
        int i = 0;
        int i2 = 0;
        while (i2 < zzl2.getCount()) {
            RefInt refInt = new RefInt(0);
            zzOP zzop5 = zzop;
            zzL2 zzl22 = zzl2;
            boolean z3 = z;
            boolean z4 = z2;
            zzPT zzptZzZ = zzop5.zzZ(zzl22, i2, z3, z4, refInt);
            if (zzptZzZ != null) {
                zzL2 zzl23 = new zzL2();
                for (int i3 = refInt.get(); i3 != 0; i3--) {
                    zzl23.zzI(zzl22.zzMl(i2));
                    zzl22.removeAt(i2);
                }
                zzpr.zzV(zzptZzZ);
                zzOP[] zzopArr = {zzop2, zzop3, zzop4};
                while (i < 3) {
                    zzpr.zzO(zzopArr[i].zzY(zzl23, z3, z4));
                    i++;
                }
                return zzpr.zzZWe();
            }
            i2++;
            zzop = zzop5;
            zzl2 = zzl22;
            z = z3;
            z2 = z4;
        }
        boolean z5 = z;
        zzOP[] zzopArr2 = {zzop, zzop2, zzop3, zzop4};
        while (i < 4) {
            zzPT zzptZzYc = zzopArr2[i].zzYc(z5);
            if (zzptZzYc != null) {
                zzpr.zzV(zzptZzYc);
            }
            i++;
        }
        return zzpr.zzZWe();
    }
}
