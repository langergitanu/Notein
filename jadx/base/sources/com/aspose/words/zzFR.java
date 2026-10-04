package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;
import com.aspose.words.internal.C22244OooO0o0;
import com.aspose.words.ref.RefPointF;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFR {
    private long zzKj;
    private double zzKt;
    private double zzKu;
    private boolean zzZe7;
    private float zzZe8;
    private int zzZe9;
    private boolean zzZea;
    private boolean zzZeb;
    private long zzZed;
    private com.aspose.words.internal.zzZQ4 zzZee;
    private com.aspose.words.internal.zzZQ4 zzZef;
    private com.aspose.words.internal.zzG zzZeh;
    private ChartDataLabel zzZei;
    private zzFS zzZej;
    private double zzZeg = Double.NaN;
    private long zzZec = 0;

    private zzFR(zzFS zzfs, ChartDataLabel chartDataLabel, int i, com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, long j, long j2, double d, double d2, boolean z) {
        this.zzZei = chartDataLabel;
        this.zzZeh = zzg;
        this.zzZef = zzzq4;
        this.zzZej = zzfs;
        this.zzZee = zzzq42;
        this.zzZed = j;
        this.zzKj = j2;
        this.zzKu = d;
        this.zzKt = d2;
        this.zzZe9 = i;
        this.zzZe7 = z;
    }

    private void zzA(long j, int i) {
        com.aspose.words.internal.zzP9 zzp9ZzB = zzB(j, i);
        this.zzZeh.zzZO().zzZ(zzp9ZzB, 0);
        this.zzZef = zzp9ZzB.zzO(this.zzZef);
    }

    private void zzC(com.aspose.words.internal.zzG zzg) {
        com.aspose.words.internal.zzG zzg2 = this.zzZeh;
        if (zzg2 == null || zzg == null) {
            return;
        }
        zzg.zzX((com.aspose.words.internal.zzZL) zzg2);
    }

    private void zzLg(int i) {
        if (this.zzZei.zz3z() != 0) {
            i = this.zzZei.zz3z();
        }
        if (i == 1) {
            zzA(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) this.zzZed), this.zzZee.zzZn()), 4);
            return;
        }
        if (i == 3) {
            zzA(this.zzZed, 0);
            return;
        }
        if (i == 6) {
            zzA(com.aspose.words.internal.zzZPY.zzG(this.zzZee.zzZm(), com.aspose.words.internal.zzZPY.zzYC(this.zzZed)), 1);
        } else if (i != 9) {
            zzA(com.aspose.words.internal.zzZPY.zzG(this.zzZee.zzkw(), com.aspose.words.internal.zzZPY.zzYC(this.zzZed)), 2);
        } else {
            zzA(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) this.zzZed), this.zzZee.zzZo()), 3);
        }
    }

    private static int zzU(int i, boolean z, boolean z2) {
        if (i == 3) {
            return 0;
        }
        if (i == 4) {
            return z ? 3 : 2;
        }
        if (i == 5) {
            return z ? 4 : 1;
        }
        if (z2) {
            return 0;
        }
        return z ? 3 : 2;
    }

    private static zzCL zzV(ChartDataLabel chartDataLabel) {
        if (chartDataLabel.zzaR().zzZHh().hasInsets()) {
            return chartDataLabel.zzaR();
        }
        zzCL zzclZzZGr = chartDataLabel.zzaR().zzZGr();
        zzclZzZGr.zzZHh().zzGO(38100);
        zzclZzZGr.zzZHh().zzGQ(19050);
        zzclZzZGr.zzZHh().zzGP(38100);
        zzclZzZGr.zzZHh().zzGR(19050);
        return zzclZzZGr;
    }

    private static zzCM zzW(ChartDataLabel chartDataLabel) {
        if (!chartDataLabel.zz3t() || chartDataLabel.zz3u() == null || chartDataLabel.zz3u().zzZGu() || chartDataLabel.zz3u().zzZGw() == null) {
            return chartDataLabel.zz3u();
        }
        zzCM zzcmZzZGB = chartDataLabel.zz3u().zzZGB();
        zzcmZzZGB.zzZGw().zzW(new zz10());
        for (zz4A zz4a : zzcmZzZGB.zzZGw().zzMi()) {
            zz4a.zzZxp().zzX(new zz30());
            Iterator<zz47> it = zz4a.zzMf().iterator();
            while (it.hasNext()) {
                it.next().zzZx5().zzU(zz4a.zzZxp().zzZHc());
            }
        }
        return zzcmZzZGB;
    }

    private static boolean zzX(zzGK zzgk) {
        return zzgk.zzZQO() == 10 && !zzgk.zzZQj();
    }

    private void zzY(com.aspose.words.internal.zzP9 zzp9) {
        com.aspose.words.internal.zzG zzg = this.zzZeh;
        if (zzg != null) {
            if (zzg.zzZO() == null) {
                com.aspose.words.internal.OooO0O0.OooO00o(this.zzZeh);
            }
            this.zzZeh.zzZO().zzZ(zzp9, 0);
            this.zzZef = zzp9.zzO(this.zzZef);
        }
    }

    private long zzY1(long j) {
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ((this.zzKt / 2.0d) + this.zzKu);
        if (dZzZJ <= 0.0d || dZzZJ >= 180.0d || com.aspose.words.internal.zzAN.zzf(this.zzZe8)) {
            return j;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(0.0f, -this.zzZe8, 0);
        return zzp9.zzR(j);
    }

    public static zzFR zzZ(zzFS zzfs, int i, ChartSeries chartSeries, com.aspose.words.internal.zzZQ4 zzzq4, long j, long j2, long j3) throws Exception {
        return zzZ(zzfs, chartSeries, i, zzzq4, j, j2, j3);
    }

    private long zzZNn() {
        RefPointF refPointF = new RefPointF(0L);
        RefPointF refPointF2 = new RefPointF(0L);
        boolean zZzZ = zzG6.zzZ(this, refPointF, refPointF2);
        long j = refPointF.get();
        long j2 = refPointF2.get();
        if (zZzZ) {
            return zzY1(j);
        }
        this.zzZea = true;
        return j2;
    }

    private long zzZNo() {
        float fZzp = com.aspose.words.internal.zzSA.zzp(4.5d);
        long jZzPW = new com.aspose.words.internal.zzQ5(com.aspose.words.internal.zzZQ4.zzX(this.zzZee, fZzp, fZzp), 0.0d, zzZNi()).zzPW();
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(zzZNi() + 90.0d);
        return C22243OooO0Oo.OooO00o(zzY(dZzZJ, this.zzZef.getHeight()), Float.intBitsToFloat((int) jZzPW) + zzZ(dZzZJ, this.zzZef.getWidth()), jZzPW);
    }

    private long zzZNp() {
        if (!com.aspose.words.internal.zzAN.zzZD(this.zzKu) || !com.aspose.words.internal.zzAN.zzZD(this.zzKt) || this.zzZe9 != 12) {
            return zzY1(new com.aspose.words.internal.zzQ5(com.aspose.words.internal.zzZQ4.zzX(this.zzZee, (-this.zzZef.getWidth()) / 2.0f, (-this.zzZef.getHeight()) / 2.0f), 0.0d, zzZNi()).zzPW());
        }
        return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) this.zzZed), (this.zzZef.getHeight() / 2.0f) + com.aspose.words.internal.zzZPY.zzYC(this.zzZed));
    }

    private long zzZNq() {
        return zzY1(com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) this.zzKj) + Float.intBitsToFloat((int) this.zzZed)) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(this.zzKj) + com.aspose.words.internal.zzZPY.zzYC(this.zzZed)) / 2.0f));
    }

    private boolean zzZNr() {
        float f = this.zzZej.zzZNx().zzZIC().zzZdM;
        float fZzZo = this.zzZee.zzZo();
        float fZzZn = this.zzZee.zzZn();
        float fZzZm = this.zzZee.zzZm();
        float fZzkw = this.zzZee.zzkw();
        if (!this.zzZej.zz3I().zzZP3()) {
            fZzZo += this.zzZee.getHeight() / 2.0f;
            fZzZm = C22244OooO0o0.OooO00o(this.zzZee, 2.0f, fZzZm);
            fZzZn = fZzZo;
            fZzkw = fZzZm;
        }
        return this.zzZef.zzZn() + f > fZzZo && this.zzZef.zzZo() - f < fZzZn && this.zzZef.zzkw() + f > fZzZm && this.zzZef.zzZm() - f < fZzkw;
    }

    private void zzZNt() {
        long jZzG;
        float fZzp = com.aspose.words.internal.zzSA.zzp(2.25d);
        com.aspose.words.internal.zzZQ4 zzzq4ZzX = com.aspose.words.internal.zzZQ4.zzX(this.zzZee, fZzp, fZzp);
        int iZz3z = this.zzZei.zz3z();
        int i = 1;
        if (iZz3z == 1) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(this.zzZee, 2.0f, this.zzZee.getX()), zzzq4ZzX.zzZn());
            i = 4;
        } else if (iZz3z == 6) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(zzzq4ZzX.zzZm(), (this.zzZee.getHeight() / 2.0f) + this.zzZee.getY());
        } else if (iZz3z == 8) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(zzzq4ZzX.zzkw(), (this.zzZee.getHeight() / 2.0f) + this.zzZee.getY());
            i = 2;
        } else if (iZz3z != 9) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(this.zzZee, 2.0f, this.zzZee.getX()), (this.zzZee.getHeight() / 2.0f) + this.zzZee.getY());
            i = 0;
        } else {
            jZzG = com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(this.zzZee, 2.0f, this.zzZee.getX()), zzzq4ZzX.zzZo());
            i = 3;
        }
        zzA(jZzG, i);
    }

    private void zzZNu() {
        float fZzYB = com.aspose.words.internal.zzSA.zzYB(15);
        long j = this.zzKj;
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZed) - Float.intBitsToFloat((int) j);
        float f = fIntBitsToFloat > 0.0f ? 1.0f : -1.0f;
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(this.zzZed) - com.aspose.words.internal.zzZPY.zzYC(j);
        float f2 = fZzYC > 0.0f ? 1.0f : -1.0f;
        float fSqrt = (float) Math.sqrt((fZzYC * fZzYC) + (fIntBitsToFloat * fIntBitsToFloat));
        zzA(C22243OooO0Oo.OooO00o(fZzYB * (fZzYC / fSqrt) * f2 * f2, Float.intBitsToFloat((int) this.zzZed) + ((fIntBitsToFloat / fSqrt) * f * fZzYB * f), this.zzZed), 0);
    }

    private void zzZNv() {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(this.zzZej.zz44().getX(), this.zzZej.zz44().getY(), 0);
        com.aspose.words.internal.zzZQ4 zzzq4ZzO = zzp9.zzO(this.zzZef);
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0L, this.zzZej.zzZNx().zzZIz());
        float fZzZm = zzzq4ZzO.zzZm() - zzzq4.zzZm();
        float fZzkw = zzzq4ZzO.zzkw() - zzzq4.zzkw();
        float fZzZo = zzzq4ZzO.zzZo() - zzzq4.zzZo();
        float fZzZn = zzzq4ZzO.zzZn() - zzzq4.zzZn();
        if (fZzZm < 0.0f) {
            translate(-fZzZm, 0.0f);
        }
        if (fZzkw > 0.0f) {
            translate(-fZzkw, 0.0f);
        }
        if (fZzZo < 0.0f) {
            translate(0.0f, -fZzZo);
        }
        if (fZzZn > 0.0f) {
            translate(0.0f, -fZzZn);
        }
    }

    public final void translate(float f, float f2) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(f, f2, 0);
        zzY(zzp9);
    }

    public final com.aspose.words.internal.zzP9 zzB(long j, int i) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(j), 0);
        if (i == 0) {
            zzp9.zzY((-this.zzZef.getWidth()) / 2.0f, (-this.zzZef.getHeight()) / 2.0f, 0);
            return zzp9;
        }
        if (i == 1) {
            zzp9.zzY(-(this.zzZef.getWidth() + com.aspose.words.internal.zzSA.zzYB(3)), (-this.zzZef.getHeight()) / 2.0f, 0);
            return zzp9;
        }
        if (i == 2) {
            zzp9.zzY(com.aspose.words.internal.zzSA.zzYB(3), (-this.zzZef.getHeight()) / 2.0f, 0);
            return zzp9;
        }
        if (i == 3) {
            zzp9.zzY((-this.zzZef.getWidth()) / 2.0f, -(this.zzZef.getHeight() + com.aspose.words.internal.zzSA.zzYB(3)), 0);
            return zzp9;
        }
        if (i != 4) {
            return zzp9;
        }
        zzp9.zzY((-this.zzZef.getWidth()) / 2.0f, com.aspose.words.internal.zzSA.zzYB(3), 0);
        return zzp9;
    }

    public final long zzPT() {
        return com.aspose.words.internal.zzJ6.zzB(this.zzZee);
    }

    public final long zzPW() {
        return this.zzKj;
    }

    public final long zzZNc() {
        return this.zzZec;
    }

    public final long zzZNd() {
        return this.zzZed;
    }

    public final boolean zzZNe() {
        return this.zzZe7;
    }

    public final ChartDataLabel zzZNf() {
        return this.zzZei;
    }

    public final zzDI zzZNg() {
        return this.zzZej.zzZNx();
    }

    public final boolean zzZNh() {
        return this.zzZea;
    }

    public final double zzZNi() {
        if (Double.isNaN(this.zzZeg)) {
            this.zzZeg = zz3N.zzY(this.zzKu, this.zzKt, this.zzZee);
        }
        return this.zzZeg;
    }

    public final double zzZNj() {
        return this.zzKt;
    }

    public final com.aspose.words.internal.zzZQ4 zzZNk() {
        return this.zzZef;
    }

    public final com.aspose.words.internal.zzZQ4 zzZNl() {
        return this.zzZee;
    }

    public final void zzZNm() {
        this.zzZeb = true;
    }

    public final void zzZNs() throws Exception {
        if (this.zzZei.getShowLeaderLines()) {
            if (this.zzZei.getShowCategoryName() || this.zzZei.getShowValue() || this.zzZei.getShowSeriesName() || this.zzZei.getShowPercentage() || this.zzZei.getShowDataLabelsRange() || (this.zzZe9 == 15 && this.zzZei.getShowBubbleSize())) {
                if (this.zzZei.zz3x() || (zzZP9() && this.zzZeb)) {
                    if (!zzZNr() || zzZP9()) {
                        zzZNv();
                        zzES.zzZ(this);
                    }
                }
            }
        }
    }

    public final void zzZNw() {
        zzZNv();
        zzC(this.zzZej.zzZNx().zzKy(21));
    }

    public final boolean zzZP9() {
        int i = this.zzZe9;
        return i == 7 || i == 8 || i == 9 || i == 12;
    }

    public final int zzZQO() {
        return this.zzZe9;
    }

    public final double zzZS3() {
        return this.zzKu;
    }

    public static zzFR zzZ(zzFS zzfs, int i, ChartSeries chartSeries, zzG3 zzg3) throws Exception {
        return zzZ(zzfs, chartSeries, i, new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) zzg3.zzYK()) - (zzg3.getSize() / 2.0f), com.aspose.words.internal.zzZPY.zzYC(zzg3.zzYK()) - (zzg3.getSize() / 2.0f), zzg3.getSize(), zzg3.getSize()), zzg3.zzYK(), zzg3.zzYK(), zzg3.zzYK());
    }

    private void zzV(zzGK zzgk) {
        long jZzZNq;
        boolean z = zzgk.zzZQO() == 9;
        if (this.zzZei.zz3w()) {
            jZzZNq = z ? zzZNq() : zzZNo();
        } else {
            int iZz3z = z ? 3 : this.zzZei.zz3z();
            if (iZz3z == 3) {
                jZzZNq = zzZNq();
            } else if (iZz3z == 5) {
                jZzZNq = zzZNp();
            } else if (iZz3z != 7) {
                this.zzZej.zzZNx().zzZIB().zzI().zzZ(2, 2, "Best Fit position of data labels is not fully supported, labels might be rendered on incorrect positions.");
                jZzZNq = zzZNn();
            } else {
                jZzZNq = zzZNo();
            }
        }
        zzA(jZzZNq, 0);
    }

    private void zzW(zzGK zzgk) {
        int iZzZQO = zzgk.zzZQO();
        if (iZzZQO != 15) {
            switch (iZzZQO) {
                case 0:
                case 1:
                    zzLg(3);
                    break;
                case 2:
                case 3:
                case 4:
                case 6:
                    zzLg(8);
                    break;
                case 5:
                    zzZNu();
                    break;
                case 7:
                case 8:
                case 9:
                case 12:
                    zzV(zzgk);
                    break;
                case 10:
                case 11:
                    zzZ((zzH8) zzgk);
                    break;
            }
        } else {
            zzZNt();
        }
        if (this.zzZei.zz3w()) {
            zzZNv();
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(this.zzZej.zzZNx(), this.zzZei);
            translate(zzzq4ZzZ.getX(), zzzq4ZzZ.getY() * ((!this.zzZei.zz3I().zzZP3() || this.zzZee.getHeight() >= 0.0f) ? 1.0f : -1.0f));
        }
    }

    private static float zzY(double d, float f) {
        if ((d > 75.0d && d < 125.0d) || (d > 265.0d && d < 285.0d)) {
            return 0.0f;
        }
        if ((com.aspose.words.internal.zzAN.zzJ(d, 0.0d) && d < 90.0d) || (d > 270.0d && com.aspose.words.internal.zzAN.zzK(d, 360.0d))) {
            return (-f) / 2.0f;
        }
        if (d <= 90.0d || d >= 270.0d) {
            return 0.0f;
        }
        return f / 2.0f;
    }

    public static zzFR zzZ(zzFS zzfs, int i, ChartSeries chartSeries, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, float f, double d, double d2) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzO;
        float f2;
        double d3 = d2 / 2.0d;
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(d + d3);
        if (dZzZJ <= 0.0d || dZzZJ >= 180.0d || com.aspose.words.internal.zzAN.zzf(f)) {
            zzzq4ZzO = zzzq4;
            f2 = f;
        } else {
            com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
            f2 = f;
            zzp9.zzY(0.0f, f2, 0);
            zzzq4ZzO = zzp9.zzO(zzzq4);
        }
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4ZzO, d, d3);
        com.aspose.words.internal.zzZQ4 zzzq43 = zzzq4ZzO;
        long jZzPT = zzq5.zzPT();
        long jZzPW = zzq5.zzPW();
        if (!zzzq42.isEmpty()) {
            jZzPT = new com.aspose.words.internal.zzQ5(zzzq42, d, d3).zzPW();
        }
        return zzZ(zzfs, chartSeries, i, zz3N.zzX(zzzq43, dZzZJ), jZzPT, jZzPW, 0L, d, d2, f2);
    }

    public static zzFR[] zzZ(zzFS zzfs, ChartSeries chartSeries, long[] jArr) throws Exception {
        return zzZ(zzfs, chartSeries, jArr, (long[]) null, (long[]) null, (zzCF[]) null, (zzCF[]) null);
    }

    public static zzFR[] zzZ(zzFS zzfs, ChartSeries chartSeries, long[] jArr, long[] jArr2) throws Exception {
        return zzZ(zzfs, chartSeries, jArr, (long[]) null, jArr2, (zzCF[]) null, (zzCF[]) null);
    }

    public static zzFR[] zzZ(zzFS zzfs, ChartSeries chartSeries, long[] jArr, long[] jArr2, zzCF[] zzcfArr, zzCF[] zzcfArr2) throws Exception {
        return zzZ(zzfs, chartSeries, jArr, (long[]) null, jArr2, zzcfArr, zzcfArr2);
    }

    private static zzFR[] zzZ(zzFS zzfs, ChartSeries chartSeries, long[] jArr, long[] jArr2, long[] jArr3, zzCF[] zzcfArr, zzCF[] zzcfArr2) throws Exception {
        ChartSeries chartSeries2 = chartSeries;
        zzFR[] zzfrArr = new zzFR[jArr.length];
        long[] jArr4 = jArr3 == null ? jArr : jArr3;
        long[] jArr5 = jArr2 == null ? jArr : jArr2;
        int i = 0;
        while (i < jArr.length) {
            zzCF zzcfZzNN = zzcfArr == null ? chartSeries2.zzNN(i) : zzcfArr[i];
            if (zzcfZzNN != null) {
                if ((zzcfArr2 == null ? chartSeries2.zz2y().zzL0(zzcfZzNN.getIndex()) : zzcfArr2[i]) != null) {
                    zzfrArr[i] = zzZ(zzfs, chartSeries2, zzcfZzNN.getIndex(), chartSeries2.zzNM(chartSeries2.zzW(zzcfZzNN)).getMarker().zzYh(jArr[i]), jArr[i], jArr5[i], jArr4[i]);
                }
            }
            i++;
            chartSeries2 = chartSeries;
        }
        return zzfrArr;
    }

    public static zzFR[] zzZ(zzFS zzfs, ChartSeries chartSeries, long[] jArr, long j) throws Exception {
        long[] jArr2 = new long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            jArr2[i] = j;
        }
        return zzZ(zzfs, chartSeries, jArr, jArr2, (long[]) null, (zzCF[]) null, (zzCF[]) null);
    }

    private static zzFR zzZ(zzFS zzfs, ChartSeries chartSeries, int i, com.aspose.words.internal.zzZQ4 zzzq4, long j, long j2, long j3) throws Exception {
        return zzZ(zzfs, chartSeries, i, zzzq4, j, j2, j3, 0.0d, 0.0d, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzFR zzZ(zzFS zzfs, ChartSeries chartSeries, int i, com.aspose.words.internal.zzZQ4 zzzq4, long j, long j2, long j3, double d, double d2, float f) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq42;
        zzDI zzdiZzZNx = zzfs.zzZNx();
        ChartDataLabel chartDataLabelZzZ = zzZ(zzfs.zz3I(), chartSeries, i);
        if (chartDataLabelZzZ == null || chartDataLabelZzZ.isHidden() || !chartDataLabelZzZ.isVisible()) {
            return null;
        }
        if (!zzdiZzZNx.zzY0(zzfs.zz3I().zzZP3() ? zzZ((zzH8) chartSeries.zz3I(), chartDataLabelZzZ, zzzq4, j2, j) : j2) && !zzfs.zz3I().getChartSpace().zzZHX().zzZLW()) {
            return null;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        zzCK zzckZzZ = zzZ(chartDataLabelZzZ, zzdiZzZNx);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzdiZzZNx, chartDataLabelZzZ, zzckZzZ);
        zzg.zzX((com.aspose.words.internal.zzZL) zzckZzZ.zzZGn());
        if (chartDataLabelZzZ.getShowLegendKey()) {
            com.aspose.words.internal.zzH zzh = new com.aspose.words.internal.zzH();
            zzEO zzeoZzZ = zzZ(chartSeries.zz3I(), chartSeries, i, chartDataLabelZzZ, zzdiZzZNx);
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ2 = zzh.zzZ((com.aspose.words.internal.zzZL) zzeoZzZ.zzZLK());
            float fZzp = com.aspose.words.internal.zzSA.zzp(chartSeries.zz3I().zzZP4() ? 0.5d : 1.0d);
            float fZzp2 = com.aspose.words.internal.zzSA.zzp(chartSeries.zz3I().zzZP4() ? 7.0d : 1.0d);
            float fZzkw = zzzq4ZzZ2.zzkw() + fZzp2 + fZzp;
            zzckZzZ.zzZGn().zzZO().zzY(fZzkw, 0.0f, 0);
            zzg.zzX((com.aspose.words.internal.zzZL) zzeoZzZ.zzZLK());
            zzeoZzZ.zzZLK().zzW(new com.aspose.words.internal.zzP9());
            zzeoZzZ.zzZLK().zzZO().zzY(fZzp2, zzzq4ZzZ.getY() + (((zzDG.zzS(chartDataLabelZzZ.zzaR(), zzdiZzZNx) / 2.0f) + 19050.0f) - (zzeoZzZ.getHeight() / 2.0f)), 0);
            zzzq42 = chartSeries.zz3I().zzZP4() ? new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), zzzq4ZzZ.getWidth() + fZzkw, zzzq4ZzZ.getHeight()) : zzzq4ZzZ;
        }
        zzFR zzfr = new zzFR(zzfs, chartDataLabelZzZ, chartSeries.zz3I().zzZQO(), zzg, zzzq42, zzzq4, j, j2, d, d2, zzckZzZ.zzZGl());
        zzfr.zzZec = j3;
        zzfr.zzZe8 = f;
        zzfr.translate(-zzzq42.getX(), -zzzq42.getY());
        zzfr.zzW(zzfs.zz3I());
        return zzfr;
    }

    private static ChartDataLabel zzZ(zzGK zzgk, ChartSeries chartSeries, int i) {
        ChartDataLabel chartDataLabel;
        zzCF zzcfZzL0 = chartSeries.zz2z().zzL0(i);
        boolean zZzX = zzX(zzgk);
        boolean zZzX2 = zzX(zzgk);
        if (zzZ(zzcfZzL0, zZzX || zzgk.zzZPa() || zzgk.zzZQO() == 2)) {
            return null;
        }
        int iZzW = chartSeries.zzW(zzcfZzL0);
        if (chartSeries.getDataLabels().zzO5(iZzW)) {
            chartDataLabel = chartSeries.getDataLabels().get(iZzW);
        } else if (chartSeries.getDataLabels().zz3n()) {
            chartDataLabel = new ChartDataLabel(chartSeries.getDataLabels().zz3q(), chartSeries);
        } else if (zzgk.getDataLabels().zzO5(iZzW)) {
            chartDataLabel = zzgk.getDataLabels().get(iZzW);
        } else {
            chartDataLabel = zzgk.getDataLabels().zz3n() ? new ChartDataLabel(zzgk.getDataLabels().zz3q(), chartSeries) : null;
        }
        if (chartDataLabel != null) {
            chartDataLabel.setIndex(iZzW);
            chartDataLabel.zzO7(zzcfZzL0.getIndex());
            if (zzZ(chartSeries.zz2y().zzZMv().zzKv(chartDataLabel.zz3o()), zZzX2)) {
                return null;
            }
            chartDataLabel.zzY(chartSeries);
        }
        return chartDataLabel;
    }

    private static boolean zzZ(zzCF zzcf, boolean z) {
        if (zzcf != null) {
            return ("#N/A".equals(zzcf.getStringValue()) || Double.isNaN(zzcf.getValue())) && !z;
        }
        return true;
    }

    private static zzCK zzZ(ChartDataLabel chartDataLabel, zzDI zzdi) throws Exception {
        zz30 zz30VarZzZM7;
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = com.aspose.words.internal.zzZQ4.zz2T;
        float fZzZQB = zzdi.zzZQB() - (zzdi.zzZIC().zzZdM * 2.0f);
        if (chartDataLabel.zz3v()) {
            zzzq4ZzZ = zzZ(zzdi, chartDataLabel);
            fZzZQB = zzzq4ZzZ.getWidth();
        }
        com.aspose.words.internal.zzZQ4 zzzq4 = zzzq4ZzZ;
        float f = fZzZQB;
        zzCL zzclZzV = zzV(chartDataLabel);
        if (!chartDataLabel.zz3t() && !chartDataLabel.zz3u().zzZGu()) {
            zz30VarZzZM7 = new zz30();
        } else {
            zz30VarZzZM7 = zzdi.zzZIC().zzZMQ().zzZM7();
        }
        return zzCK.zzZ(zzW(chartDataLabel), new zzCV(zzclZzV, chartDataLabel.zzaQ(), zz30VarZzZM7, zzdi.zzZIC().zzZMQ().zzZM3(), zzdi.zzZIC().zzZMM(), f), zzdi, zzzq4, zzclZzV.zzZHh().zzZtD(), zzclZzV.zzZHh().zzZtE(), zzclZzV.zzZHh().zzZtF(), zzclZzV.zzZHh().zzZtG());
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzDI zzdi, ChartDataLabel chartDataLabel) {
        return zzDG.zzZ(new com.aspose.words.internal.zzZQ4(0L, zzdi.zzZIz()), chartDataLabel.zz3y(), zzdi);
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzDI zzdi, ChartDataLabel chartDataLabel, zzCK zzck) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZGm = zzck.zzZGm();
        if (chartDataLabel.zz3I().zzZP9() && !zzck.zzZGl() && !chartDataLabel.getShowLegendKey()) {
            zzzq4ZzZGm = com.aspose.words.internal.zzZQ4.zzX(zzzq4ZzZGm, -38100.0f, -19050.0f);
        }
        if (!chartDataLabel.zz3v()) {
            return zzzq4ZzZGm;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzdi, chartDataLabel);
        return new com.aspose.words.internal.zzZQ4(zzck.zzZGm().getX() - ((zzzq4ZzZ.getWidth() - zzck.zzZGm().getWidth()) / 2.0f), zzck.zzZGm().getY() - ((zzzq4ZzZ.getHeight() - zzck.zzZGm().getHeight()) / 2.0f), zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight());
    }

    private static zzEO zzZ(zzGK zzgk, ChartSeries chartSeries, int i, ChartDataLabel chartDataLabel, zzDI zzdi) throws Exception {
        ChartDataPoint chartDataPointZzNM = (zzgk.zz45().zzZJf().size() == 1 && zzgk.zzZPj().getCount() == 1) ? chartSeries.zzNM(i) : chartSeries.zz2H();
        float fZzY = zzEN.zzY(chartDataLabel.zzaR(), zzdi);
        double dZzZsA = chartDataLabel.zzaR().zzZHj().zzZvS().zzZsA();
        ChartLegend legend = zzgk.zz45().zzZJc().zzZLZ().zzZHX().getLegend();
        if (legend != null) {
            ChartLegendEntry chartLegendEntryZzNS = legend.zzNS(chartSeries.getIndex());
            dZzZsA = (chartLegendEntryZzNS != null ? chartLegendEntryZzNS.zzaR() : legend.zzaR()).zzZHj().zzZvS().zzZsA();
        }
        double d = dZzZsA;
        int iZzZQO = zzgk.zzZQO();
        if (iZzZQO != 4 && iZzZQO != 12 && iZzZQO != 7 && iZzZQO != 8 && iZzZQO != 9) {
            i = chartSeries.getIndex();
        }
        return zzEN.zzZ(zzgk, i, chartDataPointZzNM, fZzY, d, zzdi);
    }

    private void zzZ(zzH8 zzh8) {
        long jZzG;
        boolean z = zzh8.zzZQl() == 1;
        boolean zZzZQj = zzh8.zzZQj();
        long jZzZ = zzZ(zzh8, this.zzZei, this.zzZee, this.zzKj, this.zzZed);
        int iZz3z = this.zzZei.zz3x() ? 7 : this.zzZei.zz3z();
        int iZzU = zzU(iZz3z, z, zZzZQj);
        if (iZz3z != 3) {
            iZzU = zzZ(this.zzZed, this.zzKj, z, iZzU);
        }
        int i = iZzU;
        int i2 = i;
        if (!zzZ(jZzZ, i, z, zZzZQj)) {
            jZzG = jZzZ;
        } else if (z) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzZ), this.zzZee.zzZn());
            i2 = this.zzZee.getHeight() < 0.0f ? 4 : 3;
        } else {
            jZzG = com.aspose.words.internal.zzZPY.zzG(this.zzZee.zzZm(), com.aspose.words.internal.zzZPY.zzYC(jZzZ));
            i2 = this.zzZee.getWidth() >= 0.0f ? 2 : 1;
        }
        zzA(jZzG, i2);
    }

    private static long zzZ(zzH8 zzh8, ChartDataLabel chartDataLabel, com.aspose.words.internal.zzZQ4 zzzq4, long j, long j2) {
        boolean z = zzh8.zzZQl() == 1;
        boolean zZzZQj = zzh8.zzZQj();
        float fOooO00o = C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.getX());
        float height = (zzzq4.getHeight() / 2.0f) + zzzq4.getY();
        int iZz3z = chartDataLabel.zz3x() ? 7 : chartDataLabel.zz3z();
        if (iZz3z == 3) {
            return com.aspose.words.internal.zzZPY.zzG(fOooO00o, height);
        }
        if (iZz3z == 4) {
            if (z) {
                return com.aspose.words.internal.zzZPY.zzG(fOooO00o, com.aspose.words.internal.zzZPY.zzYC(j2));
            }
            return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j2), height);
        }
        if (iZz3z == 5) {
            if (z) {
                return com.aspose.words.internal.zzZPY.zzG(fOooO00o, com.aspose.words.internal.zzZPY.zzYC(j));
            }
            return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j), height);
        }
        if (!zZzZQj && !z) {
            fOooO00o = Float.intBitsToFloat((int) j);
        }
        if (!zZzZQj && z) {
            height = com.aspose.words.internal.zzZPY.zzYC(j);
        }
        return com.aspose.words.internal.zzZPY.zzG(fOooO00o, height);
    }

    private boolean zzZ(long j, int i, boolean z, boolean z2) {
        if (z2 || this.zzZei.zz3z() == 7) {
            return false;
        }
        if ((com.aspose.words.internal.zzAN.zzf(this.zzZee.getHeight()) && z) || (com.aspose.words.internal.zzAN.zzf(this.zzZee.getWidth()) && !z)) {
            return true;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzO = zzB(j, i).zzO(this.zzZef);
        com.aspose.words.internal.zzZQ4 zzzq4ZzU = com.aspose.words.internal.zzZQ4.zzU(this.zzZee, zzzq4ZzO);
        if (zzzq4ZzU.isEmpty()) {
            return false;
        }
        return z ? zzzq4ZzU.getHeight() < zzzq4ZzO.getHeight() : zzzq4ZzU.getWidth() < zzzq4ZzO.getWidth();
    }

    private static int zzZ(long j, long j2, boolean z, int i) {
        if ((z && com.aspose.words.internal.zzZPY.zzYC(j) < com.aspose.words.internal.zzZPY.zzYC(j2)) || (!z && Float.intBitsToFloat((int) j) > Float.intBitsToFloat((int) j2))) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 3;
            }
        }
        return i;
    }

    private static float zzZ(double d, float f) {
        if ((!com.aspose.words.internal.zzAN.zzJ(d, 0.0d) || d >= 10.0d) && d <= 350.0d && (d <= 165.0d || d >= 195.0d)) {
            if (d > 0.0d && d < 180.0d) {
                return f / 2.0f;
            }
            if (d > 180.0d && d < 360.0d) {
                return (-f) / 2.0f;
            }
        }
        return 0.0f;
    }
}
