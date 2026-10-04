package com.aspose.words;

import OooOoO.C20509OooO0oo;
import com.aspose.words.internal.C22244OooO0o0;

/* JADX INFO: loaded from: classes6.dex */
final class zzDV extends zzDZ {
    public zzDV(zzZCR zzzcr, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) {
        super(zzzcr.zzZPt(), zzzcr.zzZPs(), zzdi, zzzq4, z);
    }

    private float getRadius() {
        return (zzZKC() > zzZKB() ? zzZKB() : zzZKC()) / 2.0f;
    }

    private void zzXJ(boolean z) throws Exception {
        zzGG zzggZz41 = this.zzZbw.zz41();
        zzCF[] zzcfArrZzZOV = z ? zzggZz41.zzZOV() : zzggZz41.zzZOU();
        ChartAxis chartAxis = this.zzZbw;
        zzD9 zzd9ZzaQ = (z ? chartAxis.zz4j() : chartAxis.zz4i()).zzaQ();
        for (zzCF zzcf : zzcfArrZzZOV) {
            long[] jArr = new long[this.zzZgP.zz41().zzZOV().length];
            for (int i = 0; i < this.zzZgP.zz41().zzZOV().length; i++) {
                jArr[i] = zzZ(this.zzZgP.zz41().zzZOV()[i].getValue(), zzcf.getValue(), true);
            }
            zzZ(jArr, zzd9ZzaQ, z);
        }
    }

    private float zzZJk() throws Exception {
        return 360.0f / ((float) this.zzZgP.zz41().zzZOT());
    }

    private float zzZJl() throws Exception {
        return getRadius() / ((float) this.zzZbw.zz41().zzZOT());
    }

    private int zzZJm() throws Exception {
        return zzDG.zzZ(zzZJn(), this.zzZbw.zzaR(), this.zzZyQ);
    }

    private float zzZJn() throws Exception {
        return getRadius() / (this.zzZbw.zz41().zzZOV().length - 1);
    }

    private void zzZJo() throws Exception {
        float fZz3N = this.zzZgP.zz3N() + this.zzZgP.zz3P();
        this.zzZby = fZz3N;
        for (zzCF zzcf : this.zzZgP.zz41().zzZOV()) {
            float value = ((float) (zzcf.getValue() - this.zzZgP.zz41().zzZOR())) * zzZJk();
            double dZzZL = com.aspose.words.internal.zzAN.zzZL(value);
            float fZz3N2 = this.zzZgP.zz3N() + zzCA.zzZ(zzcf, this.zzZyQ.zzZQB(), this.zzZgP.zzaR(), this.zzZgP.zzaQ(), this.zzZyQ).zzZGm().getWidth();
            if (com.aspose.words.internal.zzAN.zzf(value) || com.aspose.words.internal.zzAN.zzS(value, 180.0f)) {
                float f = fZz3N2 / 2.0f;
                this.zzZbA = Math.max(this.zzZbA, f - getRadius());
                this.zzZbz = Math.max(this.zzZbz, f - getRadius());
            }
            float radius = fZz3N2 - (getRadius() - (((float) Math.abs(Math.sin(dZzZL))) * getRadius()));
            if (value > 0.0f && value < 180.0f) {
                this.zzZbz = Math.max(this.zzZbz, radius);
            } else if (value > 180.0f && value < 360.0f) {
                this.zzZbA = Math.max(this.zzZbA, radius);
            }
            this.zzZbx = Math.max(this.zzZbx, fZz3N - ((((float) Math.cos(dZzZL)) * getRadius()) + getRadius()));
        }
    }

    private void zzZJp() {
        float fZzp = com.aspose.words.internal.zzSA.zzp(6.5d);
        this.zzZbA = fZzp;
        this.zzZbz = fZzp;
        this.zzZby = fZzp;
        this.zzZbx = fZzp;
    }

    private void zzZKp() {
        if (com.aspose.words.internal.zzAN.zzR(getRadius(), 0.0f)) {
            this.zzZbA = 0.0f;
            this.zzZbz = 0.0f;
            this.zzZby = 0.0f;
            this.zzZbx = 0.0f;
        }
        float fOooO0O0 = C20509OooO0oo.OooO0O0(getRadius(), 2.0f, this.zzZgO.getWidth(), 2.0f);
        float fOooO0O02 = C20509OooO0oo.OooO0O0(getRadius(), 2.0f, this.zzZgO.getHeight(), 2.0f);
        if (this.zzZbA < fOooO0O0 && this.zzZbz < fOooO0O0) {
            this.zzZbA = fOooO0O0;
            this.zzZbz = fOooO0O0;
        }
        if (this.zzZby >= fOooO0O02 || this.zzZbx >= fOooO0O02) {
            return;
        }
        this.zzZby = fOooO0O02;
        this.zzZbx = fOooO0O02;
    }

    private long zzs(double d, double d2) throws Exception {
        double dZzZOR = d - this.zzZgP.zz41().zzZOR();
        double dZzZOR2 = d2 - this.zzZbw.zz41().zzZOR();
        if (!com.aspose.words.internal.zzAN.zzZD(dZzZOR2) && !zzDG.zzZ(this.zzZbw, dZzZOR2)) {
            float fZzZJk = ((float) dZzZOR) * zzZJk();
            float fZzZ = zzDZ.zzZ(dZzZOR2, zzZJl(), this.zzZbw);
            long jZzZKr = zzZKr();
            float fIntBitsToFloat = Float.intBitsToFloat((int) jZzZKr) - fZzZ;
            float fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzZKr) - fZzZ;
            float f = fZzZ * 2.0f;
            return new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(fIntBitsToFloat, fZzYC, f, f), -90.0d, fZzZJk).zzPW();
        }
        return zzZKr();
    }

    @Override // com.aspose.words.zzDZ
    public final void zzX(zzCF zzcf, boolean z) throws Exception {
        if ("#N/A".equals(zzcf.getStringValue())) {
            return;
        }
        zzCK zzckZzZ = zzZ(z ? this.zzZbw : this.zzZgP, zzcf);
        long jZzZ = zzZ(zzcf, z, zzckZzZ);
        zzckZzZ.zzZGn().zzZO().zzY(Float.intBitsToFloat((int) jZzZ), com.aspose.words.internal.zzZPY.zzYC(jZzZ), 0);
        this.zzZyQ.zzKy(21).zzX((com.aspose.words.internal.zzZL) zzckZzZ.zzZGn());
    }

    @Override // com.aspose.words.zzDZ, com.aspose.words.zzZCP
    public final long zzZ(double d, double d2, boolean z) throws Exception {
        boolean z2 = this.zzZbv;
        double d3 = z2 ? d : d2;
        if (z2) {
            d = d2;
        }
        if (Double.isNaN(d3)) {
            d3 = 0.0d;
        }
        if (Double.isNaN(d)) {
            d = 0.0d;
        }
        return zzs(d3, d);
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZK8() {
        throw new UnsupportedOperationException("Z axis is not available for polar plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZK9() {
        throw new UnsupportedOperationException("Z axis is not available for polar plane.");
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKF() throws Exception {
        if (zzZQD()) {
            if (Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) < zz44().zzkw()) {
                this.zzZbz = (Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) / 2.0f) - getRadius();
            }
        } else {
            if (this.zzZgP.getHidden()) {
                zzZJp();
            } else {
                zzZJo();
            }
            zzZKp();
        }
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKI() throws Exception {
        if (this.zzZbw.zz4i() != null) {
            zzXJ(false);
        }
        if (this.zzZbw.zz4j() != null) {
            zzXJ(true);
        }
    }

    @Override // com.aspose.words.zzDZ
    public final void zzZKJ() {
    }

    @Override // com.aspose.words.zzDZ
    public final com.aspose.words.internal.zzG zzZKM() throws Exception {
        com.aspose.words.internal.zzG zzgZzKy = this.zzZyQ.zzKy(3);
        long jZzZKr = zzZKr();
        double dZzZOS = this.zzZbw.zz41().zzZOS();
        for (zzCF zzcf : this.zzZgP.zz41().zzZOV()) {
            zzZ(jZzZKr, zzs(zzcf.getValue(), dZzZOS), this.zzZbw.zzZ2(), zzgZzKy, this.zzZbw.zzaQ());
        }
        for (int i = 0; i < this.zzZbw.zz41().zzZOV().length; i++) {
            if (i % zzZJm() == 0) {
                zzY(this.zzZbw.zz41().zzZOV()[i], true);
            }
        }
        return zzgZzKy;
    }

    @Override // com.aspose.words.zzDZ
    public final com.aspose.words.internal.zzG zzZKN() throws Exception {
        for (zzCF zzcf : this.zzZgP.zz41().zzZOV()) {
            zzY(zzcf, false);
        }
        return this.zzZyQ.zzKy(3);
    }

    @Override // com.aspose.words.zzZCP
    public final zzCF[] zzZKa() throws Exception {
        return this.zzZbw.zz41().zzZOV();
    }

    @Override // com.aspose.words.zzZCP
    public final int zzZKb() {
        return this.zzZbw.getScaling().getOrientation();
    }

    @Override // com.aspose.words.zzZCP
    public final int zzZKc() {
        return 2;
    }

    @Override // com.aspose.words.zzZCP
    public final long zzZKr() {
        return com.aspose.words.internal.zzZPY.zzG((zzZKC() / 2.0f) + this.zzZbA, (zzZKB() / 2.0f) + this.zzZby);
    }

    @Override // com.aspose.words.zzZCP
    public final float zzl(int i, int i2, int i3) {
        throw new UnsupportedOperationException("Getting bar width is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final void zzra() throws Exception {
        zzZKH();
    }

    private long zzZ(zzCF zzcf, boolean z, zzCK zzck) throws Exception {
        long jZzs = zzs(z ? this.zzZgP.zz41().zzZOS() : zzcf.getValue(), z ? zzcf.getValue() : this.zzZbw.zz41().zzZOS());
        if (z) {
            return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzs) - (this.zzZbw.zz3N() + zzck.zzZGm().getWidth()), com.aspose.words.internal.zzZPY.zzYC(jZzs) - (zzck.zzZGm().getHeight() / 2.0f));
        }
        float value = ((float) (zzcf.getValue() - this.zzZgP.zz41().zzZOR())) * zzZJk();
        if (com.aspose.words.internal.zzAN.zzf(value)) {
            return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzs) - (zzck.zzZGm().getWidth() / 2.0f), com.aspose.words.internal.zzZPY.zzYC(jZzs) - (this.zzZgP.zz3N() + zzck.zzZGm().getHeight()));
        }
        if (value > 0.0f && value < 180.0f) {
            return com.aspose.words.internal.zzZPY.zzG(this.zzZgP.zz3N() + Float.intBitsToFloat((int) jZzs), com.aspose.words.internal.zzZPY.zzYC(jZzs) - (zzck.zzZGm().getHeight() / 2.0f));
        }
        if (com.aspose.words.internal.zzAN.zzS(value, 180.0f)) {
            return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzs) - (zzck.zzZGm().getWidth() / 2.0f), this.zzZgP.zz3N() + com.aspose.words.internal.zzZPY.zzYC(jZzs));
        }
        return (value <= 180.0f || value >= 360.0f) ? jZzs : com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) jZzs) - zzck.zzZGm().getWidth()) - this.zzZgP.zz3N(), com.aspose.words.internal.zzZPY.zzYC(jZzs) - (zzck.zzZGm().getHeight() / 2.0f));
    }

    private zzCK zzZ(ChartAxis chartAxis, zzCF zzcf) throws Exception {
        float fZzZQB;
        if (zzZQD()) {
            fZzZQB = (C22244OooO0o0.OooO00o(zz44(), 2.0f, zz44().zzZm()) - getRadius()) + this.zzZyQ.zzZIC().zzZdM;
        } else {
            fZzZQB = this.zzZyQ.zzZQB();
        }
        float f = fZzZQB;
        if (!zzZQD()) {
            return zzCA.zzZ(zzcf, f, chartAxis.zzaR(), chartAxis.zzaQ(), this.zzZyQ);
        }
        return zzCA.zzY(zzcf, f, 0.0f, 22, chartAxis.zzaR(), chartAxis.zzaQ(), this.zzZyQ, true);
    }
}
