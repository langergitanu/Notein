package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzNR implements zzF9, zzFA, zzFB, zzFD, zzFF, zzFG {
    private zzN2 zzFc;
    private boolean zzFd;
    private zzN3 zzFe;
    private boolean zzYS;
    private zzPM zzYX;
    private zzPY zzYr;
    private String zzZi;

    public zzNR(String str, zzN3 zzn3, zzPY zzpy, zzPM zzpm, boolean z, boolean z2) {
        this.zzZi = str;
        this.zzFe = zzn3;
        this.zzYr = zzpy;
        this.zzYX = zzpm;
        this.zzFd = z;
        this.zzYS = z2;
        this.zzFc = new zzN2(zzn3.zzK8());
    }

    private static int zzXw(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    private int zzXx(int i) {
        if (i == 0) {
            return this.zzFe.zzK5() ? 2 : 0;
        }
        if (i != 1) {
            return (i == 2 && !this.zzFe.zzK5()) ? 2 : 0;
        }
        return 1;
    }

    @Override // com.aspose.words.internal.zzFB
    public final int getAlignment() {
        return zzXw(this.zzFe.zzKc());
    }

    @Override // com.aspose.words.internal.zzFB
    public final double getLeftMargin() {
        return this.zzYX.zzPg() * this.zzFe.zzKa();
    }

    @Override // com.aspose.words.internal.zzFB
    public final double getRightMargin() {
        return this.zzYX.zzPg() * this.zzFe.zzK9() * 0.81f;
    }

    @Override // com.aspose.words.internal.zzFA
    public final String getText() {
        return this.zzZi;
    }

    @Override // com.aspose.words.internal.zzF9
    public final boolean zzM8() {
        return this.zzFd;
    }

    @Override // com.aspose.words.internal.zzF9
    public final zzHC zzM9() {
        return this.zzFc;
    }

    @Override // com.aspose.words.internal.zzFC
    public final zzF9 zzMa() {
        return this;
    }

    @Override // com.aspose.words.internal.zzFB
    public final zzGJ zzMb() {
        return new zz1B(0.0d);
    }

    @Override // com.aspose.words.internal.zzFB
    public final zzGJ zzMc() {
        return new zz1B(0.0d);
    }

    @Override // com.aspose.words.internal.zzFB
    public final zzGJ zzMd() {
        return new zz1B(1.0d);
    }

    @Override // com.aspose.words.internal.zzFD
    public final zzFB zzMe() {
        return this;
    }

    @Override // com.aspose.words.internal.zzFD
    public final ArrayList<zzFC> zzMf() {
        ArrayList<zzFC> arrayList = new ArrayList<>(1);
        zzZQG.zzZ((ArrayList<zzNR>) arrayList, this);
        return arrayList;
    }

    @Override // com.aspose.words.internal.zzFF
    public final int zzMg() {
        return zzXx(this.zzFe.zzKb());
    }

    @Override // com.aspose.words.internal.zzFG
    public final zzFF zzMh() {
        return this;
    }

    @Override // com.aspose.words.internal.zzFG
    public final ArrayList<zzFD> zzMi() {
        ArrayList<zzFD> arrayList = new ArrayList<>(1);
        zzZQG.zzZ((ArrayList<zzNR>) arrayList, this);
        return arrayList;
    }

    @Override // com.aspose.words.internal.zzF9
    public final zzPV zzZq() {
        return zzPV.zzHZ;
    }

    @Override // com.aspose.words.internal.zzF9
    public final zzPM zzZr() {
        return this.zzYX;
    }

    @Override // com.aspose.words.internal.zzF9
    public final zzPV zzZt() {
        zzPY zzpy = this.zzYr;
        return zzpy instanceof zzOI ? ((zzOI) zzpy).zzZy() : zzPV.zzKa;
    }

    @Override // com.aspose.words.internal.zzFB
    public final boolean zzZz() {
        return this.zzYS;
    }
}
