package com.aspose.words.internal;

import com.aspose.words.Cluster;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJ extends zz6 {
    private boolean zzYB;
    private zzZU zzYC;
    private zz7 zzYz;
    private zzZQC<zz7> zzYA = new zzZQC<>();
    private float[] zzYy = new float[6];
    private float[] zzYx = new float[6];

    private zzZJ(boolean z) {
        this.zzYB = z;
    }

    private void zzS(zzZL zzzl) {
        zzW(null);
        zzZ4().zzX(zzzl.zz1());
    }

    private static boolean zzT(zzG zzg) {
        if (zzg.getCount() == 0 && zzg.zzZM() == null) {
            return true;
        }
        if (zzg.zzZK()) {
            return false;
        }
        return zzg.zzZN() == null && zzg.zzZM() == null && !(zzg.zzZO() != null && !zzg.zzZO().isIdentity()) && !zzg.zzZL();
    }

    private void zzU(zz7 zz7Var) {
        zzW(null);
        zz7 zz7VarZzP = zz7Var.zzP(false);
        if (this.zzYz == null) {
            this.zzYz = zz7VarZzP;
        }
        if (this.zzYA.size() > 0) {
            zzZ4().zzX(zz7VarZzP);
        }
        this.zzYA.push(zz7VarZzP);
    }

    private static boolean zzV(zzZU zzzu, zzZU zzzu2) {
        return zzzu.zzZz() == zzzu2.zzZz() && zzzu.zzZr() == zzzu2.zzZr() && zzPV.zzZ(zzzu.zzZy(), zzzu2.zzZy()) && zzAN.zzS(zzzu.zzZk(), zzzu2.zzZk());
    }

    private boolean zzW(zzZU zzzu, zzZU zzzu2) {
        return zzV(zzzu, zzzu2) && zzzu.zzZl() == zzzu2.zzZl() && zzzu.zzZN() == zzzu2.zzZN() && (zzzu.zzZh() == null || zzzu.zzZh().length == 0) == (zzzu2.zzZh() == null || zzzu2.zzZh().length == 0) && zzZ(zzzu.zzZO(), zzzu2.zzZO());
    }

    private static boolean zzX(zzZU zzzu) {
        return zzZKN.zzS(zzzu.getText(), "  ", zzZOF.ORDINAL$4894b8c8);
    }

    public static zz7 zzZ(zzZL zzzl, boolean z) throws Exception {
        zzZJ zzzj = new zzZJ(z);
        zzzl.zzZ(zzzj);
        return zzzj.zzYz;
    }

    private zz7 zzZ4() {
        return this.zzYA.peek();
    }

    private void zzZI() {
        zzW(null);
        boolean z = (zzZ4() instanceof zzG) && ((zzG) zzZ4()).zzZM() != null;
        if (zzZ4().getCount() == 0 && !z && zzZ4().zzZ5() != null) {
            zzZ4().zzZ5().removeAt(zzZ4().zzZ5().zzW((zzZL) zzZ4()));
        }
        this.zzYA.pop();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzZH zzzh) {
        zzZI();
    }

    private static boolean zzX(zzZU zzzu, zzZU zzzu2) {
        return (zzzu.zzZz() ? zzAN.zzQ((double) Float.intBitsToFloat((int) zzzu.zzZT()), (double) (Float.intBitsToFloat((int) zzzu2.getSize()) + Float.intBitsToFloat((int) zzzu2.zzZT())), 0.01d) : zzAN.zzQ((double) (Float.intBitsToFloat((int) zzzu.getSize()) + Float.intBitsToFloat((int) zzzu.zzZT())), (double) Float.intBitsToFloat((int) zzzu2.zzZT()), 0.01d)) && zzAN.zzQ((double) zzZPY.zzYC(zzzu.zzZT()), (double) zzZPY.zzYC(zzzu2.zzZT()), 0.01d);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzJ zzj) {
        zzZI();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzZN zzzn) {
        zzZI();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        if (zzT(zzg)) {
            return;
        }
        zzZI();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZH zzzh) {
        zzU(zzzh);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzJ zzj) {
        zzU(zzj);
    }

    private boolean zzY(zzZU zzzu, zzZU zzzu2) {
        if (zzzu.isHidden() || zzzu2.isHidden() || (zzzu instanceof zzB) || (zzzu2 instanceof zzB)) {
            return false;
        }
        boolean z = zzW(zzzu, zzzu2) && zzX(zzzu, zzzu2);
        return (z && this.zzYB) ? zzX(zzzu) == zzX(zzzu2) : z;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZN zzzn) {
        zzU(zzzn);
    }

    private void zzW(zzZU zzzu) {
        if (this.zzYC != null) {
            zzZ4().zzX(this.zzYC);
        }
        this.zzYC = zzzu;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) {
        if (zzT(zzg)) {
            return;
        }
        zzU(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) {
        zzS(zzzp);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) {
        zzS(zzzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzI zzi) {
        zzS(zzi);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZI zzzi) {
        zzS(zzzi);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zz9 zz9Var) {
        zzS(zz9Var);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzC zzc) {
        zzS(zzc);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZC zzzc) {
        zzS(zzzc);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZB zzzb) {
        zzS(zzzb);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzN zzn) {
        zzS(zzn);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) {
        zzZU zzzu2 = this.zzYC;
        if (zzzu2 != null && zzY(zzzu2, zzzu)) {
            this.zzYC = zzZ(this.zzYC, zzzu);
        } else {
            zzW(zzzu);
        }
    }

    private static zzZU zzZ(zzZU zzzu, zzZU zzzu2) {
        StringBuilder sb = new StringBuilder();
        zzZNH.zzU(sb, zzzu.getText());
        zzZNH.zzU(sb, zzzu2.getText());
        String string = sb.toString();
        long jZzZT = zzzu.zzZz() ? zzzu2.zzZT() : zzzu.zzZT();
        zzZU zzzu3 = new zzZU(zzzu.zzZr(), zzzu.zzZy(), zzzu.zzZq(), jZzZT, string, zzZPW.zzG(Float.intBitsToFloat((int) zzzu2.getSize()) + Float.intBitsToFloat((int) zzzu.getSize()), zzZPW.zzYz(zzzu.getSize())), zzzu.zzZk(), zzzu.zzZz(), (Cluster[]) zzZ1.zzZ(zzzu.zzZh(), zzzu2.zzZh(), new Cluster[zzZ1.zzZ(zzzu.zzZh(), zzzu2.zzZh())]));
        zzzu3.zzZ(zzzu.zzZN() != null ? zzzu.zzZN().zzO8() : null);
        zzzu3.zzW(zzzu.zzZO() != null ? zzzu.zzZO().zzOh() : null);
        return zzzu3;
    }

    private boolean zzZ(zzP9 zzp9, zzP9 zzp92) {
        if (zzP9.zzO(zzp9) && zzP9.zzO(zzp92)) {
            return true;
        }
        if (!zzAN.zzZD(zzp9.zzOq()) && !zzAN.zzZD(zzp92.zzOq())) {
            zzp9.zzX(this.zzYy);
            zzp92.zzX(this.zzYx);
            boolean zZzS = zzAN.zzS(this.zzYy[0], this.zzYx[0]);
            boolean zZzS2 = zzAN.zzS(this.zzYy[1], this.zzYx[1]);
            boolean zZzS3 = zzAN.zzS(this.zzYy[2], this.zzYx[2]);
            boolean z = zzAN.zzf(this.zzYy[3]) && zzAN.zzf(this.zzYx[3]);
            boolean zZzS4 = zzAN.zzS(this.zzYy[5], this.zzYx[5]);
            if (zZzS && zZzS2 && zZzS3 && z && zZzS4) {
                return true;
            }
        }
        return false;
    }
}
