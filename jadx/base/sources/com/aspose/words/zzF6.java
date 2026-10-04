package com.aspose.words;

import OooOoO.C20509OooO0oo;
import com.aspose.words.internal.C22243OooO0Oo;

/* JADX INFO: loaded from: classes6.dex */
final class zzF6 {
    private zzGK zzZyX;

    public zzF6(zzGK zzgk) {
        this.zzZyX = zzgk;
    }

    private void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzZCP zzzcp2;
        zzDI zzdi2;
        for (int i = 0; i < this.zzZyX.zzZPj().getCount(); i++) {
            ChartSeries chartSeries = this.zzZyX.zzZPj().get(i);
            long jZzZ = zzZ(zzzcp, i);
            zzdi.zzA(new com.aspose.words.internal.zzG());
            if (!com.aspose.words.internal.zzZPY.zzYF(jZzZ)) {
                com.aspose.words.internal.OooO0O0.OooO00o(zzdi.zzsD());
                zzdi.zzsD().zzZO().zzY(Float.intBitsToFloat((int) jZzZ), com.aspose.words.internal.zzZPY.zzYC(jZzZ), 0);
            }
            int i2 = 0;
            while (i2 < chartSeries.getValueCount()) {
                zzCF zzcfZzL0 = chartSeries.zz2z().zzL0(i2);
                zzCF zzcfZzL02 = chartSeries.zz2y().zzL0(i2);
                if (zzCF.zzR(zzcfZzL0) || zzCF.zzR(zzcfZzL02)) {
                    zzzcp2 = zzzcp;
                    zzdi2 = zzdi;
                } else {
                    if (chartSeries.zz2v() != null) {
                        zzzcp2 = zzzcp;
                        zzdi2 = zzdi;
                        zzZ(zzzcp2, chartSeries.zz2v(), zzdi2, zzcfZzL0, zzcfZzL02);
                    } else {
                        zzzcp2 = zzzcp;
                        zzdi2 = zzdi;
                    }
                    if (chartSeries.zz2u() != null) {
                        zzZ(zzzcp2, chartSeries.zz2u(), zzdi2, zzcfZzL0, zzcfZzL02);
                    }
                }
                i2++;
                zzzcp = zzzcp2;
                zzdi = zzdi2;
            }
            zzdi.zzZI();
        }
    }

    public final void zzW(zzZCP zzzcp, zzDI zzdi) throws Exception {
        if (zzzcp.zzZKc() != 1) {
            return;
        }
        zzdi.zzW(zzdi.zzKy(14));
        zzZ(zzzcp, zzdi);
        zzdi.zzZI();
    }

    private void zzZ(zzZCP zzzcp, zzF7 zzf7, zzDI zzdi, zzCF zzcf, zzCF zzcf2) throws Exception {
        zzZCP zzzcp2;
        zzCF zzcf3;
        zzCF zzcf4;
        long jZzt;
        zzF7 zzf72;
        zzDI zzdi2;
        if (zzf7.zzZMa()) {
            jZzt = zzZ(zzzcp, zzf7.zzZMl(), zzf7.zzZMd(), zzcf, zzcf2);
            zzzcp2 = zzzcp;
            zzcf4 = zzcf2;
            zzcf3 = zzcf;
        } else {
            zzzcp2 = zzzcp;
            zzcf3 = zzcf;
            zzcf4 = zzcf2;
            jZzt = zzzcp2.zzt(zzcf3.getValue(), zzcf4.getValue());
        }
        long j = jZzt;
        if (zzf7.zzZMc()) {
            zzf72 = zzf7;
            zzdi2 = zzdi;
            zzZ(zzzcp2, zzf72, zzdi2, j, zzcf3, zzcf4, zzf7.zzZMf().zzL0(zzcf3.getIndex()));
        } else {
            zzf72 = zzf7;
            zzdi2 = zzdi;
        }
        if (zzf72.zzZMb()) {
            zzZ(zzzcp2, zzf72, zzdi2, j, zzcf3, zzcf4, zzf72.zzZMe().zzL0(zzcf3.getIndex()));
        }
    }

    private long zzZ(zzZCP zzzcp, int i, zzCF zzcf, zzCF zzcf2, zzCF zzcf3) throws Exception {
        double value = zzcf2.getValue();
        double value2 = zzcf3.getValue();
        boolean zZzP = com.aspose.words.internal.zzAN.zzP(zzcf.getValue(), 0.0d, com.aspose.words.internal.zzAN.zzZz(zzcf.getValue()));
        zzZCR zzzcr = (zzZCR) com.aspose.words.internal.zzZKW.zzZ(this.zzZyX, zzZCR.class);
        if (i == 0) {
            value = (zzzcr.zzZPt().zz3K() && zZzP) ? zzcf2.getValue() : zzcf.getValue();
        } else {
            value2 = (zzzcr.zzZPs().zz3K() && zZzP) ? zzcf3.getValue() : zzcf.getValue();
        }
        return zzzcp.zzt(value, value2);
    }

    private long zzZ(zzZCP zzzcp, int i) throws Exception {
        if (!this.zzZyX.zzZP3() || this.zzZyX.zzZQj()) {
            return 0L;
        }
        zzH8 zzh8 = (zzH8) this.zzZyX;
        int count = zzh8.zzZPj().getCount();
        float fZzl = zzzcp.zzl(count, zzh8.getGapWidth(), zzh8.zzZQk());
        float fOooO0O0 = C20509OooO0oo.OooO0O0(fZzl, count, fZzl, 2.0f) + zzH7.zzZ(fZzl, count, i, zzh8.zzZQk(), zzh8.zzZPt().getReverseOrder());
        return zzh8.zzZQl() == 0 ? com.aspose.words.internal.zzZPY.zzG(0.0f, -fOooO0O0) : com.aspose.words.internal.zzZPY.zzG(fOooO0O0, 0.0f);
    }

    private void zzZ(zzZCP zzzcp, zzF7 zzf7, zzDI zzdi, long j, zzCF zzcf, zzCF zzcf2, zzCF zzcf3) throws Exception {
        float fIntBitsToFloat;
        float fZzYC;
        long jOooO00o;
        com.aspose.words.internal.zzZG zzzgZzZ;
        long jZzZ = zzZ(zzzcp, zzf7.zzZMl(), zzcf3, zzcf, zzcf2);
        if (zzf7.zzZMh()) {
            zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(j, jZzZ);
        } else {
            boolean zZzZ = zzZ(j, jZzZ, zzf7.zzZMl());
            float f = zzdi.zzZIC().zzZdM / 2.0f;
            com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
            if (zZzZ) {
                fIntBitsToFloat = Float.intBitsToFloat((int) jZzZ) - f;
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzZ);
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) jZzZ);
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzZ) - f;
            }
            long jZzG = com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC);
            if (zZzZ) {
                jOooO00o = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzZ) + f, com.aspose.words.internal.zzZPY.zzYC(jZzZ));
            } else {
                jOooO00o = C22243OooO0Oo.OooO00o(f, Float.intBitsToFloat((int) jZzZ), jZzZ);
            }
            com.aspose.words.internal.zzP5 zzp5ZzS = com.aspose.words.internal.zzP5.zzS(jZzG, jOooO00o);
            com.aspose.words.internal.zzP5 zzp5ZzS2 = com.aspose.words.internal.zzP5.zzS(j, jZzZ);
            com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5ZzS);
            com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5ZzS2);
            zzzgZzZ = zzzg;
        }
        zzDG.zzZ(zzzgZzZ, zzf7.zzaQ(), (zzE3) null, zzdi.zzZIC().zzZMC(), 0);
        zzdi.zzsD().zzX(zzzgZzZ);
    }

    private boolean zzZ(long j, long j2, int i) {
        boolean zZzS = com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2));
        if (zZzS && com.aspose.words.internal.zzAN.zzS(com.aspose.words.internal.zzZPY.zzYC(j), com.aspose.words.internal.zzZPY.zzYC(j2))) {
            return !(((zzZCR) com.aspose.words.internal.zzZKW.zzZ(this.zzZyX, zzZCR.class)).zzZPs().zz40() ^ (i == 1));
        }
        return zZzS;
    }
}
