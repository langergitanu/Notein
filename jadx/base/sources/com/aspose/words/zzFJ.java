package com.aspose.words;

import com.aspose.slides.OooOOOO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFJ {
    private float zzZdS;
    private float zzZdT;
    private float zzZdU;
    private int zzZdV;
    private float zzZdW;
    private ChartAxis zzZdX;
    private com.aspose.words.internal.zzZQ4 zzZgO;
    private boolean zzZgQ;
    private zzDI zzZyQ;
    private zzDT zzZyT;
    private float zzwo;
    private ArrayList<zzFM> zzZEU = new ArrayList<>();
    private ArrayList<zzFM> zzZdY = new ArrayList<>();

    public zzFJ(zzDT zzdt, ChartAxis chartAxis, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) throws Exception {
        this.zzZyT = zzdt;
        this.zzZyQ = zzdi;
        this.zzZgO = zzzq4;
        this.zzZgQ = z;
        this.zzZdX = chartAxis;
        this.zzZdW = zzDG.zzX(zzdt.getDataTable().zzaR(), this.zzZyQ);
        this.zzZdV = zzH(chartAxis.zz41().zzZOV());
        zzZN2();
    }

    private static int zzH(zzCF[] zzcfArr) {
        int i = 0;
        for (zzCF zzcf : zzcfArr) {
            if (zzcf.getValueType() != 0) {
                i++;
            }
        }
        return i;
    }

    private float zzY(boolean z, float f, float f2) throws Exception {
        float height = this.zzZgO.getHeight();
        float fZzp = com.aspose.words.internal.zzSA.zzp(1.0d);
        if (!this.zzZgQ) {
            float f3 = this.zzwo + ((!z || this.zzZdX.isDate()) ? 76200.0f - fZzp : 0.0f);
            if (z) {
                fZzp = 0.0f;
            }
            f = f3 + fZzp;
        } else if (!z) {
            f = -(f2 + fZzp);
        }
        return height - f;
    }

    private zzCF[] zzZMZ() throws Exception {
        return this.zzZdX.zz41().zzZOV();
    }

    private float zzZN0() {
        return OooOOOO.OooO00o(this.zzZdW, 4.0f, 2.0f, this.zzZdS);
    }

    private void zzZN2() throws Exception {
        float f;
        float f2;
        HashMap map = new HashMap();
        float fZzY = zzEN.zzY(this.zzZyT.getDataTable().zzaR(), this.zzZyQ);
        double dZzZsA = this.zzZyT.getDataTable().zzaR().zzZHj().zzZvS().zzZsA();
        float fMax = 0.0f;
        if (this.zzZyT.getDataTable().hasLegendKeys()) {
            Iterator<zzGK> it = this.zzZyT.zzZJe().iterator();
            float f3 = 0.0f;
            while (it.hasNext()) {
                zzGK next = it.next();
                float fMax2 = f3;
                for (ChartSeries chartSeries : next.zzZPj()) {
                    zzGK zzgk = next;
                    zzEO zzeoZzZ = zzEN.zzZ(zzgk, chartSeries.getIndex(), chartSeries.zz2H(), fZzY, dZzZsA, this.zzZyQ);
                    fMax = Math.max(fMax, zzeoZzZ.getWidth());
                    fMax2 = Math.max(fMax2, zzeoZzZ.getHeight());
                    map.put(chartSeries, zzeoZzZ);
                    next = zzgk;
                }
                f3 = fMax2;
            }
            f = fMax;
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) / 3.0f;
        int count = 0;
        for (zzGK zzgk2 : this.zzZyT.zzZJe()) {
            int count2 = zzgk2.zzZQj() ? zzgk2.zzZPj().getCount() - 1 : 0;
            int i = count2;
            for (ChartSeries chartSeries2 : zzgk2.zzZPj()) {
                zzEQ zzeqZzZ = zzEQ.zzZ(chartSeries2.getName(), new zzCV(this.zzZyT.getDataTable().zzaR(), new zzD9(), this.zzZyQ.zzZIC().zzZMQ().zzZM7(), this.zzZyQ.zzZIC().zzZMQ().zzZM4(), this.zzZyQ.zzZIC().zzZMH(), fIntBitsToFloat), this.zzZyT.getDataTable().hasLegendKeys() ? (zzEO) com.aspose.words.internal.zzQW.zzZ(map, chartSeries2) : null, this.zzZdW, this.zzZyQ);
                zzeqZzZ.zzZ(f, f2, this.zzZdW * 0.45f, 0.0f, this.zzZyQ);
                zzFM zzfmZzZ = zzFM.zzZ(this, chartSeries2, zzeqZzZ, count + i);
                if (zzgk2.zzZQj()) {
                    this.zzZEU.add(count, zzfmZzZ);
                    i--;
                } else {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzZEU, zzfmZzZ);
                    i++;
                }
                this.zzZdU = Math.max(this.zzZdU, Float.intBitsToFloat((int) zzeqZzZ.getSize()) + this.zzZyQ.zzZIC().zzZdM);
            }
            count += zzgk2.zzZPj().getCount();
        }
    }

    private void zzZm(float f) throws Exception {
        for (zzFM zzfm : this.zzZEU) {
            zzfm.zzZ(f, zzZMZ(), this.zzZdX.getReverseOrder());
            this.zzwo = ((this.zzZdW / 4.0f) * 2.0f) + zzfm.getHeight() + this.zzwo;
        }
    }

    private void zzZn(float f) throws Exception {
        int iMax = 1;
        for (zzCF zzcf : zzZMZ()) {
            iMax = Math.max(iMax, zzcf.zzZLd());
        }
        for (int i = 0; i < iMax; i++) {
            int length = zzZMZ().length;
            zzCF[] zzcfArr = new zzCF[length];
            for (int i2 = 0; i2 < length; i2++) {
                zzcfArr[i2] = zzZMZ()[i2].zzKK(i);
            }
            zzFM zzfmZzZ = zzFM.zzZ(this, i);
            zzfmZzZ.zzZ(f, zzcfArr, this.zzZdX.getReverseOrder());
            this.zzZdS = ((this.zzZdW / 4.0f) * 2.0f) + zzfmZzZ.getHeight() + this.zzZdS;
            com.aspose.words.internal.zzZQG.zzZ(this.zzZdY, zzfmZzZ);
        }
        this.zzZdS -= (this.zzZdW / 4.0f) * 2.0f;
        this.zzwo += zzZN0();
    }

    private float zzy(float f, float f2) {
        float width = this.zzZgO.getWidth();
        if (!this.zzZgQ) {
            f = Math.max(f, zzZN1());
        }
        return (width - (f + f2)) / this.zzZdV;
    }

    public final float getHeight() {
        return this.zzwo;
    }

    public final void zzZ(boolean z, float f, float f2) throws Exception {
        float fZzZ;
        boolean z2 = this.zzZyQ.zzZIq() == 2;
        boolean z3 = this.zzZdX.isDate() || !z;
        if (this.zzZgQ) {
            f2 = 0.0f;
            fZzZ = 0.0f;
        } else {
            if (!z && !z2) {
                f2 = 76200.0f;
            }
            fZzZ = zzZ(z3, z, f);
        }
        float fZzy = zzy(f2, fZzZ);
        this.zzZdT = fZzy;
        zzZn(fZzy);
        zzZm(fZzy);
    }

    public final float zzZN1() {
        return this.zzZdU - this.zzZyQ.zzZIt();
    }

    private void zzY(float f, com.aspose.words.internal.zzG zzg) throws Exception {
        float fZzZN0 = zzZN0();
        for (zzFM zzfm : this.zzZEU) {
            com.aspose.words.internal.zzG zzgZzz = zzfm.zzz(f, this.zzZdU);
            zzZ(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, this.zzZdU, OooOOOO.OooO00o(this.zzZdW, 4.0f, 2.0f, zzfm.getHeight())), zzfm.getIndex(), 0, 1, zzgZzz);
            zzZ(f, zzfm.getHeight(), zzfm.getIndex(), zzgZzz);
            zzgZzz.zzW(new com.aspose.words.internal.zzP9());
            zzgZzz.zzZO().zzY(0.0f, fZzZN0, 0);
            zzg.zzX((com.aspose.words.internal.zzZL) zzgZzz);
            fZzZN0 += ((this.zzZdW / 4.0f) * 2.0f) + zzfm.getHeight();
        }
    }

    public final com.aspose.words.internal.zzG zzZ(float f, float f2, float f3, boolean z, float f4) throws Exception {
        float fZzy = this.zzZgQ ? zzy(f, f2) : this.zzZdT;
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzZ(fZzy, zzg);
        zzY(fZzy, zzg);
        float fZzY = zzY(z, f3, f4);
        float f5 = (z || this.zzZgQ) ? f - this.zzZdU : 76200.0f;
        zzg.zzW(new com.aspose.words.internal.zzP9());
        zzg.zzZO().zzY(f5, fZzY, 0);
        return zzg;
    }

    private float zzZ(boolean z, boolean z2, float f) {
        return (!z || this.zzZyQ.zzZIq() == 2) ? f : (this.zzZgO.zzkw() - Float.intBitsToFloat((int) this.zzZyQ.zzZIz())) + this.zzZyQ.zzZIr() + com.aspose.words.internal.zzSA.zzYB(10) + (z2 ? 0.0f : 76200.0f);
    }

    private String zzY(float f, zzCF zzcf) throws Exception {
        String stringValue = zzcf.getStringValue();
        if (zzcf.getValueType() == 2) {
            zzE7 zze7 = (zzE7) zzcf;
            if (zzEW.zzRu(zze7.getFormatCode())) {
                float fZzZ = zzDG.zzZ(stringValue, this.zzZyT.getDataTable().zzaR(), this.zzZyQ);
                for (int i = 9; fZzZ > f && i >= 0; i--) {
                    stringValue = com.aspose.words.internal.zzJB.zzX(zze7.getValue(), i);
                    fZzZ = zzDG.zzZ(stringValue, this.zzZyT.getDataTable().zzaR(), this.zzZyQ);
                }
            }
        }
        return stringValue;
    }

    private void zzZ(float f, com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        float height = 0.0f;
        for (zzFM zzfm : this.zzZdY) {
            com.aspose.words.internal.zzG zzgZzz = zzfm.zzz(f, this.zzZdU);
            zzgZzz.zzW(new com.aspose.words.internal.zzP9());
            zzgZzz.zzZO().zzY(0.0f, height, 0);
            zzg.zzX((com.aspose.words.internal.zzZL) zzgZzz);
            height += ((this.zzZdW / 4.0f) * 2.0f) + zzfm.getHeight();
        }
        zzZ(f, this.zzZdS, 0, zzg2);
        zzg.zzX((com.aspose.words.internal.zzZL) zzg2);
    }

    public final zzCK zzZ(float f, zzCF zzcf) throws Exception {
        float fZzZ;
        if (zzcf == null) {
            return zzCK.zzZGo();
        }
        String strZzY = zzY(f, zzcf);
        if (zzcf.getValueType() == 2 && !zzcf.isDate()) {
            fZzZ = zzDG.zzY(strZzY, this.zzZyT.getDataTable().zzaR(), this.zzZyQ);
        } else {
            fZzZ = zzCA.zzZ(strZzY, this.zzZyT.getDataTable().zzaR(), this.zzZyQ, f);
        }
        return zzCK.zzZ(zzDG.zzRk(strZzY), new zzCV(this.zzZyT.getDataTable().zzaR(), this.zzZyT.getDataTable().zzaQ(), this.zzZyQ.zzZIC().zzZMQ().zzZM7(), this.zzZyQ.zzZIC().zzZMQ().zzZM3(), this.zzZyQ.zzZIC().zzZMH(), Math.max(f - com.aspose.words.internal.zzSA.zzYB(2), fZzZ)), this.zzZyQ, false);
    }

    private void zzZ(float f, float f2, int i, com.aspose.words.internal.zzG zzg) throws Exception {
        int i2;
        com.aspose.words.internal.zzG zzg2;
        float f3 = this.zzZdU;
        int i3 = 0;
        int i4 = 0;
        while (i3 < zzZMZ().length) {
            if (zzZMZ()[i3].getValueType() != 0) {
                i2 = i;
                zzg2 = zzg;
                zzZ(new com.aspose.words.internal.zzZQ4(f3, 0.0f, f, OooOOOO.OooO00o(this.zzZdW, 4.0f, 2.0f, f2)), i2, i4, this.zzZdV, zzg2);
                f3 += f;
                i4++;
            } else {
                i2 = i;
                zzg2 = zzg;
            }
            i3++;
            i = i2;
            zzg = zzg2;
        }
    }

    private void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, int i, int i2, int i3, com.aspose.words.internal.zzG zzg) throws Exception {
        boolean z = i == 0;
        boolean z2 = i == this.zzZEU.size() - 1;
        boolean z3 = i2 == 0;
        boolean z4 = i2 == i3 + (-1);
        boolean z5 = (this.zzZyT.getDataTable().hasOutlineBorder() && z3) || (this.zzZyT.getDataTable().hasVerticalBorder() && !z3);
        boolean z6 = this.zzZyT.getDataTable().hasOutlineBorder() && z4;
        boolean z7 = (this.zzZyT.getDataTable().hasOutlineBorder() && z) || (this.zzZyT.getDataTable().hasHorizontalBorder() && !z);
        boolean z8 = this.zzZyT.getDataTable().hasOutlineBorder() && z2;
        if (z5) {
            zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()), zzg);
        }
        if (z6) {
            zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()), zzg);
        }
        if (z7) {
            zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()), zzg);
        }
        if (z8) {
            zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), zzg);
        }
    }

    private void zzZ(long j, long j2, com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(j, j2);
        zzzgZzZ.zzX(zzDG.zzZ(this.zzZyT.getDataTable().zzaQ(), this.zzZyQ.zzZIC().zzZMF(), 0));
        zzg.zzX(zzzgZzZ);
    }
}
