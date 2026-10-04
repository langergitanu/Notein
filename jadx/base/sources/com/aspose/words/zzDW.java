package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzDW implements zzZCP {
    private float zzZbA;
    private float zzZbb;
    private float zzZbx;
    private float zzZby;
    private float zzZbz;
    private com.aspose.words.internal.zzZQ4 zzZgO;
    private boolean zzZgQ;
    private zzEY zzZy4;
    private zzDI zzZyQ;
    private float zzZbd = Float.NaN;
    private float zzZbc = Float.NaN;

    public zzDW(zzEY zzey, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) {
        this.zzZy4 = zzey;
        this.zzZyQ = zzdi;
        if (zzey.zzZLQ() != null && !this.zzZy4.zzZLQ().zzZFT()) {
            this.zzZyQ.zzZIB().zzI().zzZ(1, 2, "Perspective view of 3D charts is not supported.");
        }
        this.zzZgO = zzzq4;
        this.zzZbb = com.aspose.words.internal.zzSA.zzYB(this.zzZy4.zzZLQ() == null ? 5 : 10);
        this.zzZgQ = z;
    }

    private void zzZ6(float f) {
        zzU(f, f, f, f);
    }

    private int zzZJF() {
        if (this.zzZy4.zzZLQ() == null) {
            return 0;
        }
        return this.zzZy4.zzZLQ().zzZJF();
    }

    private void zzZJq() {
        this.zzZbd = Float.NaN;
        this.zzZbc = Float.NaN;
    }

    private void zzZJr() {
        float fZzZKC = zzZKC() / 2.0f;
        float fZzZKB = zzZKB() / 2.0f;
        if (zzZJF() == 0) {
            float fMin = Math.min(fZzZKB, fZzZKC);
            this.zzZbd = fMin;
            this.zzZbc = fMin;
        } else {
            float fMax = Math.max(fZzZKB, fZzZKC) * ((float) Math.sin(com.aspose.words.internal.zzAN.zzZL(zzZJF())));
            float fMin2 = Math.min(fZzZKB, fMax);
            this.zzZbd = fMin2;
            this.zzZbc = (fMin2 / fMax) * fZzZKC;
        }
        if (this.zzZy4.zz45().zzZJa()) {
            float f = fZzZKC - this.zzZbc;
            this.zzZbA += f;
            this.zzZbz += f;
            float f2 = fZzZKB - this.zzZbd;
            this.zzZby += f2;
            this.zzZbx += f2;
        }
    }

    private void zzZJs() {
        ChartSeries chartSeriesZzZPk;
        Iterator<zzGK> it = this.zzZy4.zz45().zzZJf().iterator();
        while (it.hasNext() && (chartSeriesZzZPk = it.next().zzZPk()) != null && chartSeriesZzZPk.getDataLabels().getCount() != 0) {
            int iIntValue = ((Integer) chartSeriesZzZPk.getDataLabels().zz3q().zzLv(2)).intValue();
            if (iIntValue == 7 || iIntValue == 2 || iIntValue == 0) {
                float fMin = ((Math.min(zzZKB(), zzZKB()) * 0.0632f) + com.aspose.words.internal.zzSA.zzYB(7)) * (this.zzZy4.zzZLQ() == null ? 1.0f : 1.6f);
                zzU(fMin, fMin, fMin, fMin);
                return;
            }
        }
    }

    private void zzZJt() {
        if (this.zzZgQ) {
            return;
        }
        if (this.zzZy4.zz45().zzZJf().size() > 1 && !this.zzZy4.zz45().zzZJa()) {
            float fZzYB = com.aspose.words.internal.zzSA.zzYB(33);
            float fZzYB2 = com.aspose.words.internal.zzSA.zzYB(23);
            zzU(fZzYB, fZzYB, fZzYB2, fZzYB2);
        }
        zzZJs();
    }

    private void zzZKH() {
        if (!this.zzZgQ) {
            zzZ6(this.zzZbb);
        }
        zzZJt();
        zzZJr();
        this.zzZbx += zzZKs();
        this.zzZby -= zzZKs();
        zzZJq();
    }

    @Override // com.aspose.words.zzZCP
    public final com.aspose.words.internal.zzZQ4 zz44() {
        return this.zzZgO;
    }

    @Override // com.aspose.words.zzZCP
    public final int[] zzJ(ChartSeries chartSeries) {
        throw new UnsupportedOperationException("Getting segment indices is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final long[] zzK(ChartSeries chartSeries) {
        throw new UnsupportedOperationException("Getting points is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final com.aspose.words.internal.zzP9 zzKG(int i) {
        throw new UnsupportedOperationException("Getting rear offset matrix is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final void zzU(float f, float f2, float f3, float f4) {
        this.zzZbA = Math.max(this.zzZbA, f);
        this.zzZbz = Math.max(this.zzZbz, f2);
        this.zzZby = Math.max(this.zzZby, f3);
        this.zzZbx = Math.max(this.zzZbx, f4);
    }

    @Override // com.aspose.words.zzZCP
    public final com.aspose.words.internal.zzP9 zzY6(int i, int i2) {
        throw new UnsupportedOperationException("Getting front offset matrix is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final long zzZ(double d, double d2, boolean z) {
        throw new UnsupportedOperationException("Getting points is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZK8() {
        throw new UnsupportedOperationException("Z axis is not available for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZK9() {
        throw new UnsupportedOperationException("Z axis is not available for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKA() {
        return this.zzZbA;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKB() {
        return this.zzZgO.getHeight() - (this.zzZby + this.zzZbx);
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKC() {
        return this.zzZgO.getWidth() - (this.zzZbA + this.zzZbz);
    }

    @Override // com.aspose.words.zzZCP
    public final com.aspose.words.internal.zzZQ4 zzZKD() {
        return com.aspose.words.internal.zzZQ4.zz2T;
    }

    @Override // com.aspose.words.zzZCP
    public final void zzZKL() {
    }

    @Override // com.aspose.words.zzZCP
    public final void zzZKQ() {
    }

    @Override // com.aspose.words.zzZCP
    public final void zzZKR() {
    }

    @Override // com.aspose.words.zzZCP
    public final zzCF[] zzZKa() {
        throw new UnsupportedOperationException("Getting OrdinateRange is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final int zzZKb() {
        throw new UnsupportedOperationException("Getting OrdinateOrientation is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final int zzZKc() {
        return 3;
    }

    @Override // com.aspose.words.zzZCP
    public final long zzZKr() {
        return com.aspose.words.internal.zzZPY.zzG((zzZKC() / 2.0f) + this.zzZbA, (zzZKB() / 2.0f) + this.zzZby);
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKs() {
        if (this.zzZy4.zzZLQ() == null) {
            return 0.0f;
        }
        return ((zzZKC() * ((float) Math.cos(com.aspose.words.internal.zzAN.zzZL(zzZJF())))) * this.zzZy4.zzZLQ().zzZFV()) / 1000.0f;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKt() {
        if (Float.isNaN(this.zzZbc)) {
            zzZJr();
        }
        return this.zzZbc;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKu() {
        if (Float.isNaN(this.zzZbd)) {
            zzZJr();
        }
        return this.zzZbd;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKx() {
        return this.zzZbx;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKy() {
        return this.zzZby;
    }

    @Override // com.aspose.words.zzZCP
    public final float zzZKz() {
        return this.zzZbz;
    }

    @Override // com.aspose.words.zzZCP
    public final zzC9 zzZLQ() {
        return this.zzZy4.zzZLQ();
    }

    @Override // com.aspose.words.zzZCP
    public final float zzl(int i, int i2, int i3) {
        throw new UnsupportedOperationException("Getting bar width is not supported for this type of plane.");
    }

    @Override // com.aspose.words.zzZCP
    public final void zzra() {
        zzZKH();
    }

    @Override // com.aspose.words.zzZCP
    public final long zzt(double d, double d2) {
        throw new UnsupportedOperationException("Getting points is not supported for this type of plane.");
    }
}
