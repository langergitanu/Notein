package com.aspose.words;

import OooOoO.C20509OooO0oo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzDX extends zzDY {
    private float zzZbe;
    private float zzZbf;
    private boolean zzZbg;
    private float zzZbh;
    private boolean zzZbi;
    protected float zzZbj;
    protected float zzZbk;
    private com.aspose.words.internal.zzP9 zzZbl;

    public zzDX(zzEY zzey, zzGK zzgk, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) throws Exception {
        super(zzey, zzgk, zzdi, zzzq4, z);
        if (zzZLQ().zzZFT()) {
            return;
        }
        this.zzZyQ.zzZIB().zzI().zzZ(1, 2, "Perspective view of 3D charts is not supported.");
    }

    private void zzB(com.aspose.words.internal.zzG zzg) {
        zzg.zzW(new com.aspose.words.internal.zzP9());
        zzg.zzZO().zzZ(zzZJI(), 0);
    }

    private zzCK zzI(ChartSeries chartSeries) throws Exception {
        return zzCK.zzZ(zzDG.zzRk(chartSeries.getName()), new zzCV(zzZJJ().zzaR(), zzZJJ().zzaQ(), this.zzZyQ.zzZIC().zzZMQ().zzZM7(), this.zzZyQ.zzZIC().zzZMQ().zzZM3(), this.zzZyQ.zzZIC().zzZMN(), zzZJK()), this.zzZyQ, false);
    }

    private void zzY(int i, long j, long j2) throws Exception {
        float fZz3N;
        long jZzG;
        if (zzZJy() && i < this.zzZyX.zzZPj().getCount() && i >= 0) {
            zzCK zzckZzI = zzI(this.zzZyX.zzZPj().get(i));
            if (zzZJz()) {
                fZz3N = zzZJJ().zz3N();
            } else {
                fZz3N = -(zzZJJ().zz3N() + zzckZzI.zzZGm().getWidth());
            }
            if (zzZJG()) {
                jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j) + fZz3N, com.aspose.words.internal.zzZPY.zzYC(j));
            } else {
                jZzG = com.aspose.words.internal.zzZPY.zzG(((Float.intBitsToFloat((int) j2) + Float.intBitsToFloat((int) j)) / 2.0f) + fZz3N, (com.aspose.words.internal.zzZPY.zzYC(j2) + com.aspose.words.internal.zzZPY.zzYC(j)) / 2.0f);
            }
            zzckZzI.zzZGn().zzZO().zzY(Float.intBitsToFloat((int) jZzG), com.aspose.words.internal.zzZPY.zzYC(jZzG) - (zzckZzI.zzZGm().getHeight() / 2.0f), 0);
            this.zzZyQ.zzKy(21).zzX((com.aspose.words.internal.zzZL) zzckZzI.zzZGn());
        }
    }

    private void zzZ(long j, long j2, long j3, long j4, zzD9 zzd9, zzE3 zze3, int i, boolean z) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = zzZ(j, j2, j3, j4, zzd9, zze3, z);
        zzzgZzZ.zzY(zzGJ.zzZ(zzzgZzZ.zzZ1(), i));
    }

    private void zzZ7(float f) {
        this.zzZbf = f;
        this.zzZbg = true;
    }

    private void zzZ8(float f) {
        float f2 = this.zzZbj;
        if (f2 <= 0.0f) {
            this.zzZbx -= (f * f2) * zzZJH();
        } else {
            this.zzZby = (f * f2 * zzZJH()) + this.zzZby;
        }
    }

    private void zzZ9(float f) {
        float f2 = this.zzZbk;
        if (f2 <= 0.0f) {
            this.zzZbA -= (f * f2) * zzZJH();
        } else {
            this.zzZbz = (f * f2 * zzZJH()) + this.zzZbz;
        }
    }

    private float zzZJA() throws Exception {
        float f = this.zzZbj;
        return f > 0.0f ? zzZKv() : Math.abs(f * zzZJH());
    }

    private float zzZJB() throws Exception {
        float f = this.zzZbj;
        return f < 0.0f ? zzZKv() : Math.abs(f * zzZJH());
    }

    private float zzZJC() {
        float f = this.zzZbk;
        return f < 0.0f ? zzZKw() : Math.abs(f * zzZJH());
    }

    private float zzZJD() {
        float f = this.zzZbk;
        return f > 0.0f ? zzZKw() : Math.abs(f * zzZJH());
    }

    private float zzZJE() {
        return ((zzZKB() * 3.0f) / 4.0f) / zzZJH();
    }

    private com.aspose.words.internal.zzP9 zzZJI() {
        if (this.zzZbl == null) {
            com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
            this.zzZbl = zzp9;
            zzp9.zzY(this.zzZbk * zzZJH(), (-this.zzZbj) * zzZJH(), 0);
        }
        return this.zzZbl;
    }

    private ChartAxis zzZJJ() {
        return ((zzZCQ) this.zzZyX).zzZQM();
    }

    private float zzZJK() {
        return (zzZQD() && zzZJu()) ? zzZJz() ? (Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - this.zzZgO.zzkw()) + this.zzZbz : this.zzZgO.zzZm() + this.zzZbA : this.zzZyQ.zzZQB();
    }

    private float zzZJL() throws Exception {
        Iterator<ChartSeries> it = this.zzZyX.zzZPj().iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(fMax, zzI(it.next()).zzZGm().getWidth());
        }
        return fMax;
    }

    private void zzZJM() throws Exception {
        this.zzZbA = Math.max(this.zzZbA, zzZJD());
        this.zzZbz = Math.max(this.zzZbz, zzZJC());
        this.zzZby = Math.max(this.zzZby, zzZJB());
        this.zzZbx = Math.max(this.zzZbx, zzZJA());
    }

    private void zzZJN() {
        if (zzZJu()) {
            float fZzZKC = (zzZKC() - this.zzZbe) / 2.0f;
            this.zzZbz += fZzZKC;
            this.zzZbA += fZzZKC;
        }
    }

    private float zzZJO() {
        return !this.zzZbv ? zzZKB() : (zzZQD() && zzZJu()) ? Math.max(zzZKC(), zzZKB() * 1.3f) : zzZKC();
    }

    private void zzZJR() throws Exception {
        long jZzs = this.zzZbv ? zzs(this.zzZgP.zz41().zzZOR(), this.zzZbw.zz41().zzZON()) : zzs(this.zzZgP.zz41().zzZON(), this.zzZbw.zz41().zzZOR());
        long jZzs2 = this.zzZbv ? zzs(this.zzZgP.zz41().zzZOS(), this.zzZbw.zz41().zzZON()) : zzs(this.zzZgP.zz41().zzZON(), this.zzZbw.zz41().zzZOS());
        zzZ(jZzs, jZzs2, zzZJI().zzR(jZzs2), zzZJI().zzR(jZzs), zzZLU().zzaQ(), zzZLU().zz3e(), 75, true);
    }

    private boolean zzZJu() {
        return this.zzZyX.zzZPb() == 1;
    }

    private float zzZJv() {
        if (!this.zzZbg) {
            this.zzZbf = 1.0f;
            this.zzZbg = true;
        }
        return this.zzZbf;
    }

    private float zzZJw() throws Exception {
        if (!this.zzZbi) {
            this.zzZbh = zzZJL();
            this.zzZbi = true;
        }
        return this.zzZbh;
    }

    private int zzZJx() throws Exception {
        return !zzZJJ().getTickLabels().isAutoSpacing() ? zzZJJ().getTickLabels().getSpacing() : zzDG.zzZ(Math.abs(this.zzZbj), zzZJJ().zzaR(), this.zzZyQ);
    }

    private boolean zzZJy() {
        return zzZJF() >= 0 && zzZJJ() != null && zzZJJ().zz4c() && !zzZJJ().getHidden();
    }

    private boolean zzZJz() {
        return zzZLQ().zzZFS() < 180;
    }

    private zzCW zzZLU() {
        return this.zzZy4.zzZLU() == null ? new zzCW() : this.zzZy4.zzZLU();
    }

    private void zzZa(float f) throws Exception {
        if (!zzZJy() || zzZQD()) {
            return;
        }
        if (zzZJz()) {
            this.zzZbz = (f * zzZJw()) + this.zzZbz;
        } else {
            this.zzZbA = (f * zzZJw()) + this.zzZbA;
        }
    }

    private void zzZb(float f) throws Exception {
        zzZ9(f);
        zzZa(f);
    }

    private void zzZc(float f) {
        float f2;
        float f3;
        if (this.zzZgP.zz3W()) {
            f2 = this.zzZbx;
            f3 = f2 - f;
        } else {
            f2 = this.zzZby;
            f3 = f - f2;
        }
        if (f2 < f) {
            this.zzZby += f3;
            this.zzZbx -= f3;
        }
    }

    @Override // com.aspose.words.zzDZ, com.aspose.words.zzZCP
    public final long[] zzK(ChartSeries chartSeries) throws Exception {
        long[] jArr = new long[chartSeries.getValueCount()];
        for (int i = 0; i < chartSeries.getValueCount(); i++) {
            zzCF zzcfZzL0 = chartSeries.zz2E().zzL0(i);
            zzCF zzcfZzL02 = chartSeries.zz2y().zzL0(i);
            if (zzcfZzL02 != null && !zzCF.zzR(zzcfZzL0)) {
                jArr[i] = zzZ(zzcfZzL0.getValue(), zzcfZzL02.getValue(), true);
            }
        }
        return jArr;
    }

    @Override // com.aspose.words.zzDZ, com.aspose.words.zzZCP
    public final com.aspose.words.internal.zzP9 zzKG(int i) {
        float f = (i / 100) + 1;
        float f2 = this.zzZbk / f;
        float f3 = this.zzZbj / f;
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(f2, -f3, 0);
        return zzp9;
    }

    @Override // com.aspose.words.zzDZ, com.aspose.words.zzZCP
    public final com.aspose.words.internal.zzP9 zzY6(int i, int i2) {
        int i3 = i2 / 100;
        float f = i2 / 200.0f;
        float f2 = this.zzZbk;
        float f3 = i3 + 1;
        float f4 = i;
        float f5 = (f2 * f4) + ((f2 / f3) * f);
        float f6 = this.zzZbj;
        float f7 = (f6 * f4) + ((f6 / f3) * f);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(f5, -f7, 0);
        return zzp9;
    }

    public int zzZJF() {
        return zzZLQ().zzZJF();
    }

    public boolean zzZJG() {
        return false;
    }

    public int zzZJH() {
        if (zzZJJ() == null) {
            return 1;
        }
        return this.zzZyX.zzZPj().getCount();
    }

    public void zzZJP() {
        float fZzZJO = zzZJO() / (zzZJu() ? zzZJH() : this.zzZyX.zzZPb());
        this.zzZbe = fZzZJO;
        zzZd(zzDG.zzZ(this.zzZyX, fZzZJO, zzZLQ().zzZFW()));
    }

    public void zzZJQ() throws Exception {
        if (com.aspose.words.internal.zzAN.zzR(this.zzZbw.zz41().zzZOP(), 1.0f) || zzZJJ() == null || zzZJH() == 0) {
            return;
        }
        zzZb(-1.0f);
        zzZ8(-1.0f);
        zzZJP();
        zzZb(1.0f);
        zzZ8(1.0f);
        if (zzZJu()) {
            zzZJN();
            return;
        }
        float fZzZKB = (zzZKB() - (this.zzZgO.getHeight() * (zzZJH() == 1 ? 0.33333334f : 0.5f))) / 2.0f;
        this.zzZby += fZzZKB;
        this.zzZbx += fZzZKB;
        zzZc(this.zzZgP.zz3N() + com.aspose.words.internal.zzZPW.zzYz(zzZJS()));
        if (com.aspose.words.internal.zzAN.zzR(this.zzZbx, 0.0f)) {
            this.zzZby += this.zzZbx;
            this.zzZbx = 0.0f;
            zzZJP();
        }
    }

    @Override // com.aspose.words.zzDY, com.aspose.words.zzZCP
    public final float zzZK8() {
        return this.zzZbj;
    }

    @Override // com.aspose.words.zzDY, com.aspose.words.zzZCP
    public final float zzZK9() {
        return this.zzZbk;
    }

    @Override // com.aspose.words.zzDZ, com.aspose.words.zzZCP
    public final com.aspose.words.internal.zzZQ4 zzZKD() {
        float f = this.zzZbk;
        float fZzZJH = f < 0.0f ? (f * zzZJH()) + this.zzZbA : this.zzZbA;
        float f2 = this.zzZbj;
        return new com.aspose.words.internal.zzZQ4(fZzZJH, f2 > 0.0f ? this.zzZby - (f2 * zzZJH()) : this.zzZby, (Math.abs(this.zzZbk) * zzZJH()) + zzZKC(), (Math.abs(this.zzZbj) * zzZJH()) + zzZKB());
    }

    @Override // com.aspose.words.zzDZ
    public void zzZKE() throws Exception {
        if (zzZJH() > 1) {
            float fOooO0O0 = C20509OooO0oo.OooO0O0(zzZKC(), zzZJv(), zzZKC(), 2.0f);
            this.zzZbz += fOooO0O0;
            this.zzZbA += fOooO0O0;
        }
        zzZJQ();
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKG() throws Exception {
        if (zzZJu()) {
            return;
        }
        super.zzZKG();
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKK() throws Exception {
        if (zzZJJ() == null || zzZJJ().getHidden()) {
            return;
        }
        double majorUnit = !zzZJJ().getMajorUnitIsAuto() ? zzZJJ().getMajorUnit() : 1.0d;
        double minorUnit = !zzZJJ().getMinorUnitIsAuto() ? zzZJJ().getMinorUnit() : majorUnit / 2.0d;
        if (zzZJJ().zz4i() != null) {
            zzZ(zzZJJ().zz4i().zzaQ(), minorUnit, false);
        }
        if (zzZJJ().zz4j() != null) {
            zzZ(zzZJJ().zz4j().zzaQ(), majorUnit, true);
        }
        super.zzZKK();
    }

    @Override // com.aspose.words.zzDY, com.aspose.words.zzDZ
    public final com.aspose.words.internal.zzG zzZKM() throws Exception {
        com.aspose.words.internal.zzG zzgZzZKM = super.zzZKM();
        if ((zzZLQ().zzZFS() >= 180 && this.zzZbw.zz4m() == 1) || (zzZLQ().zzZFS() < 180 && this.zzZbw.zz4m() == 2)) {
            com.aspose.words.internal.zzG zzgZzKy = this.zzZyQ.zzKy(22);
            zzB(zzgZzZKM);
            zzB(zzgZzKy);
        }
        return zzgZzZKM;
    }

    @Override // com.aspose.words.zzDY, com.aspose.words.zzDZ
    public final com.aspose.words.internal.zzG zzZKN() throws Exception {
        com.aspose.words.internal.zzG zzgZzZKN = super.zzZKN();
        if (zzZJF() < 0 && this.zzZgP.zz4m() == 0) {
            zzgZzZKN.clear();
            this.zzZyQ.zzKy(23).clear();
        }
        if (this.zzZgP.zz4m() == 3) {
            this.zzZyQ.zzKy(11).zzX(zzgZzZKN.zzN(0).zz1());
            com.aspose.words.internal.zzG zzgZzKy = this.zzZyQ.zzKy(23);
            zzB(zzgZzZKN);
            zzB(zzgZzKy);
        }
        return zzgZzZKN;
    }

    @Override // com.aspose.words.zzDY, com.aspose.words.zzDZ
    public final void zzZKO() throws Exception {
        if (this.zzZy4.zz45().getDataTable() == null) {
            return;
        }
        this.zzZyQ.zzKy(10).zzX((com.aspose.words.internal.zzZL) zzZKq());
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKP() throws Exception {
        float fZz3O;
        if (zzZJF() < 0 || zzZJJ() == null || zzZJJ().getHidden()) {
            return;
        }
        long jZzs = zzs(this.zzZgP.zz41().zzZOR(), this.zzZbw.zz41().zzZON());
        long jZzs2 = zzs(this.zzZgP.zz41().zzZOS(), this.zzZbw.zz41().zzZON());
        int i = (int) jZzs;
        int i2 = (int) jZzs2;
        long j = Float.intBitsToFloat(i) < Float.intBitsToFloat(i2) ? jZzs : jZzs2;
        if (Float.intBitsToFloat(i) <= Float.intBitsToFloat(i2)) {
            jZzs = jZzs2;
        }
        if (zzZJz()) {
            j = jZzs;
        }
        float f = zzZJz() ? -1.0f : 1.0f;
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(this.zzZbk, -this.zzZbj, 0);
        com.aspose.words.internal.zzG zzgZzKy = this.zzZyQ.zzKy(13);
        int i3 = 0;
        long j2 = j;
        long j3 = j2;
        while (i3 <= zzZJH()) {
            int i4 = (int) j2;
            float fIntBitsToFloat = Float.intBitsToFloat(i4);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i4);
            int majorTickMark = zzZJJ().getMajorTickMark();
            if (majorTickMark != 0) {
                fZz3O = majorTickMark != 1 ? fIntBitsToFloat - (this.zzZbw.zz3O() * f) : fIntBitsToFloat + (this.zzZbw.zz3O() * f);
            } else {
                fZz3O = fIntBitsToFloat + this.zzZbw.zz3O();
                fIntBitsToFloat2 -= this.zzZbw.zz3O();
            }
            long j4 = j2;
            zzZ(fZz3O, j4, fIntBitsToFloat2, zzgZzKy);
            long jZzR = zzp9.zzR(j4);
            int i5 = i3;
            zzZ(i5, j4, jZzR);
            i3 = i5 + 1;
            j3 = j4;
            j2 = jZzR;
            zzgZzKy = zzgZzKy;
            f = f;
        }
        zzZ(j, j3, zzZJJ().zzZ2(), zzgZzKy, new zzD9());
    }

    @Override // com.aspose.words.zzDZ, com.aspose.words.zzZCP
    public final void zzZKQ() throws Exception {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        zzDX zzdx = this;
        long jZzs = zzdx.zzs(zzdx.zzZgP.zz41().zzZOR(), zzdx.zzZbw.zz41().zzZOR());
        long jZzs2 = zzdx.zzs(zzdx.zzZgP.zz41().zzZOS(), zzdx.zzZbw.zz41().zzZOR());
        long jZzs3 = zzdx.zzs(zzdx.zzZgP.zz41().zzZOR(), zzdx.zzZbw.zz41().zzZOS());
        long jZzs4 = zzdx.zzs(zzdx.zzZgP.zz41().zzZOS(), zzdx.zzZbw.zz41().zzZOS());
        long jZzR = zzdx.zzZJI().zzR(jZzs);
        long jZzR2 = zzdx.zzZJI().zzR(jZzs2);
        long jZzR3 = zzdx.zzZJI().zzR(jZzs3);
        long jZzR4 = zzdx.zzZJI().zzR(jZzs4);
        if (zzdx.zzZy4.zzZLV() != null) {
            j = jZzs3;
            j2 = jZzR;
            j4 = jZzR3;
            j6 = jZzs4;
            zzdx.zzZ(j2, jZzR2, jZzR4, j4, zzdx.zzZy4.zzZLV().zzaQ(), zzdx.zzZy4.zzZLV().zz3e(), 100, false);
            j3 = jZzR2;
            j5 = jZzR4;
        } else {
            j = jZzs3;
            j2 = jZzR;
            j3 = jZzR2;
            j4 = jZzR3;
            j5 = jZzR4;
            j6 = jZzs4;
        }
        if (zzdx.zzZy4.zzZLT() != null) {
            j7 = j4;
            j8 = j2;
            j9 = jZzs;
            zzdx.zzZ(j9, j, j7, j8, zzdx.zzZy4.zzZLT().zzaQ(), zzdx.zzZy4.zzZLT().zz3e(), 50, true);
        } else {
            j7 = j4;
            j8 = j2;
            j9 = jZzs;
        }
        if (zzdx.zzZbv) {
            if (zzdx.zzZbw.getReverseOrder()) {
                long j10 = j7;
                long j11 = j;
                zzdx.zzZ(j11, j6, j5, j10, zzdx.zzZLU().zzaQ(), zzdx.zzZLU().zz3e(), 75, true);
                zzdx = this;
            } else {
                zzdx = this;
                zzdx.zzZ(j9, jZzs2, j3, j8, zzZLU().zzaQ(), zzZLU().zz3e(), 75, true);
            }
        }
        if (zzdx.zzZbv && com.aspose.words.internal.zzAN.zzL(zzdx.zzZbw.zz41().zzZON(), zzdx.zzZbw.zz41().zzZOR())) {
            return;
        }
        zzdx.zzZJR();
    }

    @Override // com.aspose.words.zzDY
    public final void zzZKk() throws Exception {
        super.zzZKk();
        if (zzZQD()) {
            this.zzZby = this.zzZyQ.zzZIC().zzZdM;
            this.zzZbx = this.zzZyQ.zzZIC().zzZdM;
        }
        zzZb(-1.0f);
        zzZJP();
        zzZb(1.0f);
        zzZ8(1.0f);
    }

    @Override // com.aspose.words.zzDY
    public final void zzZKl() throws Exception {
        super.zzZKl();
        zzZJP();
        zzZb(1.0f);
    }

    public final void zzZd(float f) {
        this.zzZbk = ((float) Math.sin(com.aspose.words.internal.zzAN.zzZL(zzZLQ().zzZFS()))) * f;
        this.zzZbj = f * ((float) Math.sin(com.aspose.words.internal.zzAN.zzZL(zzZJF())));
        if (Math.abs(zzZJE()) < Math.abs(this.zzZbj)) {
            zzZ7(zzZJE() / Math.abs(this.zzZbj));
            this.zzZbj *= zzZJv();
            this.zzZbk *= zzZJv();
        }
    }

    @Override // com.aspose.words.zzDY, com.aspose.words.zzZCP
    public final void zzra() throws Exception {
        super.zzra();
        zzZJM();
    }

    @Override // com.aspose.words.zzDY
    public final void zzZ(long j, long j2, zzD9 zzd9, boolean z, boolean z2) throws Exception {
        long[] jArr;
        long jZzR = zzZJI().zzR(j);
        long jZzR2 = zzZJI().zzR(j2);
        if (z2 && zzZLQ().zzZFS() > 180) {
            jArr = new long[]{jZzR, jZzR2, j2};
        } else {
            jArr = new long[]{j, jZzR, jZzR2};
        }
        zzZ(jArr, zzd9, z);
    }

    private void zzZ(float f, long j, float f2, com.aspose.words.internal.zzG zzg) throws Exception {
        if (zzZJJ().getMajorTickMark() == 3) {
            return;
        }
        zzZ(com.aspose.words.internal.zzZPY.zzG(f, com.aspose.words.internal.zzZPY.zzYC(j)), com.aspose.words.internal.zzZPY.zzG(f2, com.aspose.words.internal.zzZPY.zzYC(j)), zzZJJ().zzZ2(), zzg, zzZJJ().zzaQ());
    }

    private void zzZ(int i, long j, long j2) throws Exception {
        if (zzZJu() || i % zzZJx() == 0) {
            zzY(this.zzZyX.zzLy(i), j, j2);
        }
    }

    private void zzZ(zzD9 zzd9, double d, boolean z) throws Exception {
        zzDX zzdx = this;
        if (zzd9 == null) {
            return;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        float f = (float) d;
        zzp9.zzY(zzdx.zzZbk * f, (-zzdx.zzZbj) * f, 0);
        long jZzs = zzdx.zzs(zzdx.zzZgP.zz41().zzZOR(), zzdx.zzZbw.zz41().zzZON());
        long jZzs2 = zzdx.zzs(zzdx.zzZgP.zz41().zzZOS(), zzdx.zzZbw.zz41().zzZON());
        long jZzs3 = zzdx.zzs(zzdx.zzZgP.zz41().zzZON(), zzdx.zzZbw.zz41().zzZOR());
        long jZzs4 = zzdx.zzs(zzdx.zzZgP.zz41().zzZON(), zzdx.zzZbw.zz41().zzZOS());
        int iZzZJH = (int) (((double) zzdx.zzZJH()) / d);
        int i = 0;
        long j = jZzs2;
        while (true) {
            long j2 = jZzs;
            if (i > iZzZJH) {
                return;
            }
            zzdx.zzZ(j2, j, zzd9, z);
            long j3 = jZzs3;
            long j4 = jZzs4;
            zzdx.zzZ(j3, j4, zzd9, z);
            jZzs = zzp9.zzR(j2);
            long jZzR = zzp9.zzR(j);
            long jZzR2 = zzp9.zzR(j3);
            jZzs4 = zzp9.zzR(j4);
            i++;
            j = jZzR;
            jZzs3 = jZzR2;
            zzdx = this;
        }
    }

    private com.aspose.words.internal.zzZG zzZ(long j, long j2, long j3, long j4, zzD9 zzd9, zzE3 zze3, boolean z) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{j, j2, j3, j4}, false, true);
        if (z) {
            zzDG.zzZ(zzzgZzZ, zzd9, zze3, this.zzZyQ.zzZIC().zzZMI(), 0);
        } else {
            zzDG.zzZ(zzzgZzZ, zzd9, zze3, this.zzZyQ.zzZIC().zzZMx(), 0);
        }
        this.zzZyQ.zzKy(0).zzX(zzzgZzZ);
        return zzzgZzZ;
    }
}
