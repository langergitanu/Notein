package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz9 extends zzB {
    private zzZVX zzZFA;
    private zzZBP zzZFB;
    private com.aspose.words.internal.zzQ8 zzZFC;
    private zzZVW zzZFD;
    private com.aspose.words.internal.zzPV zzZFy;
    private int zzZFz;

    public zz9(float f, float f2, int i, com.aspose.words.internal.zzPV zzpv) {
        super(f, f2);
        this.zzZFC = new com.aspose.words.internal.zzQ8();
        this.zzZFz = i;
        this.zzZFy = zzpv;
    }

    private static void zzT(com.aspose.words.internal.zzQG zzqg) {
        com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(0);
        com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD(zzqdZzYi.getCount() / 2, zzqdZzYi.isClosed());
        for (int i = 0; i < zzqdZzYi.getCount(); i += 2) {
            zzqd.zzZ(zzqdZzYi.zzYi(i));
        }
        zzqg.zzQw().set(0, zzqd);
    }

    private boolean zzU(com.aspose.words.internal.zzQG zzqg) {
        int i;
        return (zzqg.getCount() > 1 || zzqg.zzYi(0).getCount() < 300 || (i = this.zzZFz) == 53 || i == 99 || i == 101 || i == 131) ? false : true;
    }

    private static void zzW(com.aspose.words.internal.zzQG[] zzqgArr) {
        for (com.aspose.words.internal.zzQG zzqg : zzqgArr) {
            for (int i = 0; i < zzqg.getCount(); i++) {
                com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(i);
                if (zzqdZzYi.getCount() == 6 && zzqdZzYi.zzYi(2).zzQb() == zzqdZzYi.zzYi(5).zzQb() && zzqdZzYi.zzYi(2).zzYm() == zzqdZzYi.zzYi(5).zzYm()) {
                    zzqg.removeAt(0);
                    com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD();
                    zzqd.zzZ(zzqdZzYi.zzYi(0));
                    zzqd.zzZ(zzqdZzYi.zzYi(1));
                    zzqd.zzZ(zzqdZzYi.zzYi(2));
                    zzqd.zzQp();
                    zzqg.zzZ(zzqd);
                    com.aspose.words.internal.zzQD zzqd2 = new com.aspose.words.internal.zzQD();
                    zzqd2.zzZ(zzqdZzYi.zzYi(3));
                    zzqd2.zzZ(zzqdZzYi.zzYi(4));
                    zzqd2.zzZ(zzqdZzYi.zzYi(5));
                    zzqd2.zzQp();
                    zzqg.zzZ(zzqd2);
                }
            }
        }
    }

    private static com.aspose.words.internal.zzOU zzX(com.aspose.words.internal.zzQG[] zzqgArr) {
        if (zzqgArr.length <= 1 || zzqgArr.length % 2 != 0) {
            return null;
        }
        boolean z = true;
        for (int i = 1; i < zzqgArr.length && z; i += 2) {
            if (zzqgArr[i].zzZ1() != null || zzqgArr[i].zzZ2() == null) {
                z = false;
            }
        }
        if (z) {
            return zzqgArr[1].zzZ2();
        }
        return null;
    }

    private void zzY(com.aspose.words.internal.zzQG[] zzqgArr) {
        zzZVX zzzvx = this.zzZFA;
        int iZzV = zzzvx != null ? zzzvx.zzV(zzqgArr) : 0;
        zzZBP zzzbp = this.zzZFB;
        this.zzZFC = new com.aspose.words.internal.zzQ8(zzqgArr.length, zzqgArr.length, zzzbp != null ? zzzbp.zzV(zzqgArr) : 0, iZzV);
    }

    public final void zzZ(zzZVW zzzvw) {
        this.zzZFD = zzzvw;
    }

    public final com.aspose.words.internal.zzQ8 zzbE() {
        com.aspose.words.internal.zzQG[] zzqgArrZzQ9 = zzQ9();
        if (zzqgArrZzQ9.length == 0) {
            return this.zzZFC;
        }
        com.aspose.words.internal.zzQG zzqg = zzqgArrZzQ9[0];
        if (zzU(zzqg)) {
            zzT(zzqg);
        }
        zzY(zzqgArrZzQ9);
        if (this.zzZFz == 125) {
            zzW(zzqgArrZzQ9);
        }
        com.aspose.words.internal.zzOI zzoi = !com.aspose.words.internal.zzPV.zzZ(this.zzZFy, com.aspose.words.internal.zzPV.zzHZ) ? new com.aspose.words.internal.zzOI(this.zzZFy) : null;
        com.aspose.words.internal.zzOU zzouZzX = zzX(zzqgArrZzQ9);
        zzZBP zzzbp = this.zzZFB;
        if (zzzbp != null) {
            if (zzqgArrZzQ9.length <= 1 || this.zzZFz == 106) {
                com.aspose.words.internal.zzQ8 zzq8 = this.zzZFC;
                zzq8.zzZ(zzzbp.zzZ(zzqgArrZzQ9, this.zzZFJ, zzouZzX, zzoi, zzq8.zzQ7().length));
            } else {
                com.aspose.words.internal.zzQ8 zzq82 = this.zzZFC;
                zzq82.zzZ(zzzbp.zzZ(new com.aspose.words.internal.zzQG[]{zzqgArrZzQ9[0]}, this.zzZFJ, zzouZzX, zzoi, zzq82.zzQ6()));
            }
        }
        if (this.zzZFD != null) {
            this.zzZFC.zzZ(zzZVW.zzZ(zzqgArrZzQ9, this.zzZFK + this.zzZFJ));
        }
        zzZVX zzzvx = this.zzZFA;
        if (zzzvx != null) {
            com.aspose.words.internal.zzQ8 zzq83 = this.zzZFC;
            zzq83.zzZ(zzzvx.zzZ(zzqgArrZzQ9, zzq83.zzQ5()));
        } else {
            this.zzZFC.zzZ(zzqgArrZzQ9);
        }
        return this.zzZFC;
    }

    public final void zzZ(zzZBP zzzbp) {
        this.zzZFB = zzzbp;
    }

    public final void zzZ(zzZVX zzzvx) {
        this.zzZFA = zzzvx;
    }
}
