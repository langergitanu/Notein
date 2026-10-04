package com.aspose.words;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes6.dex */
final class zzCP {
    private long zzZ9A;
    private zzZCP zzZ9B;
    private com.aspose.words.internal.zzG zzZ9C;
    private zzCR zzZ9z;
    private com.aspose.words.internal.zzZQ4 zzZef;
    private zzDI zzZyQ;

    public zzCP(zzCR zzcr, zzDI zzdi, long j, zzZCP zzzcp) {
        this.zzZ9A = 0L;
        this.zzZ9z = zzcr;
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        this.zzZ9C = zzg;
        com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        this.zzZyQ = zzdi;
        this.zzZ9A = j;
        this.zzZ9B = zzzcp;
    }

    private void translate(float f, float f2) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(f, f2, 0);
        zzY(zzp9);
    }

    private void zzS(zzCM zzcm) {
        String strZzV;
        String strConcat;
        int length = this.zzZ9z.zzZGL().length;
        int i = length - 1;
        int i2 = length * 2;
        String[] strArr = new String[i2];
        double[] dArr = new double[i2];
        int i3 = i;
        int i4 = 0;
        while (i3 >= 0) {
            double d = this.zzZ9z.zzZGL()[i3][0];
            String str = d > 0.0d ? "+" : CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
            if (i3 == i) {
                strZzV = zzV(d, false);
                strConcat = "y = {1}x";
            } else {
                strZzV = zzV(Math.abs(d), false);
                strConcat = " {0} {1}".concat(i3 == 0 ? "" : "x");
            }
            strArr[i4] = com.aspose.words.internal.zzZKN.format(strConcat, str, strZzV);
            int i5 = i4 + 1;
            if (i3 > 1) {
                strArr[i5] = Integer.toString(i3);
                dArr[i5] = 3000.0d;
                i4 += 2;
            } else {
                i4 = i5;
            }
            i3--;
        }
        zzDG.zzZ(zzcm, strArr, dArr);
    }

    private void zzT(zzCM zzcm) {
        zzZ(zzcm, "y = {0}ln(x)", true);
    }

    private void zzU(zzCM zzcm) {
        zzZ(zzcm, "y = {0}x", "{0}");
    }

    private void zzV(zzCM zzcm) {
        zzZ(zzcm, "y = {0}e", "{0}x");
    }

    private void zzW(zzCM zzcm) {
        zzZ(zzcm, "y = {0}x", false);
    }

    private void zzX(zzCM zzcm) {
        int iZzZGQ = this.zzZ9z.zzZGQ();
        if (iZzZGQ == 0) {
            zzV(zzcm);
            return;
        }
        if (iZzZGQ == 1) {
            zzW(zzcm);
            return;
        }
        if (iZzZGQ == 2) {
            zzT(zzcm);
        } else if (iZzZGQ == 4) {
            zzS(zzcm);
        } else {
            if (iZzZGQ != 5) {
                return;
            }
            zzU(zzcm);
        }
    }

    private void zzY(com.aspose.words.internal.zzP9 zzp9) {
        com.aspose.words.internal.zzG zzg = this.zzZ9C;
        if (zzg == null) {
            return;
        }
        zzg.zzZO().zzZ(zzp9, 0);
        this.zzZef = zzp9.zzO(this.zzZef);
    }

    private static int zzY4(double d) {
        return Math.max(0, (int) Math.floor(Math.log10(Math.abs(d)))) + 1;
    }

    private double zzY5(double d) {
        double d2 = this.zzZ9z.zzZGL()[1][0];
        double d3 = this.zzZ9z.zzZGL()[0][0];
        int iZzZGQ = this.zzZ9z.zzZGQ();
        if (iZzZGQ != 0 && iZzZGQ != 1 && iZzZGQ != 2) {
            if (iZzZGQ == 4) {
                float fPow = 0.0f;
                for (int i = 0; i < this.zzZ9z.zzZGL().length; i++) {
                    fPow += (float) (Math.pow(d, i) * this.zzZ9z.zzZGL()[i][0]);
                }
                return fPow;
            }
            if (iZzZGQ != 5) {
                return Double.NaN;
            }
        }
        return (d2 * d) + d3;
    }

    private double zzY6(double d) {
        int iZzZGQ = this.zzZ9z.zzZGQ();
        if (iZzZGQ != 0) {
            if (iZzZGQ == 1 || iZzZGQ == 2 || iZzZGQ == 4) {
                return d;
            }
            if (iZzZGQ != 5) {
                return Double.NaN;
            }
        }
        return Math.log(d);
    }

    private double zzY7(double d) {
        int iZzZGQ = this.zzZ9z.zzZGQ();
        return (iZzZGQ == 2 || iZzZGQ == 5) ? Math.log(d) : d;
    }

    private float zzYX(float f) {
        return Math.min(f, (this.zzZ9B.zz44().getWidth() + (Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - this.zzZ9B.zz44().zzkw())) - this.zzZef.getWidth());
    }

    private void zzZ(zzCM zzcm, String str, String str2) {
        zzDG.zzZ(zzcm, new String[]{com.aspose.words.internal.zzZKN.format(str, zzV(Math.exp(this.zzZ9z.zzZGL()[0][0]), false)), com.aspose.words.internal.zzZKN.format(str2, zzV(this.zzZ9z.zzZGL()[1][0], true))}, new double[]{0.0d, 3000.0d});
    }

    private String zzZGF() {
        int iMin = Math.min(this.zzZ9z.zzZGK().zz2z().zzZMv().zzZIh(), this.zzZ9z.zzZGK().zz2y().zzZMv().zzZIh());
        double[] dArr = new double[iMin];
        double[] dArr2 = new double[iMin];
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        for (int i2 = 0; i2 < this.zzZ9z.zzZGK().getValueCount(); i2++) {
            zzCF zzcfZzL0 = this.zzZ9z.zzZGK().zz2z().zzL0(i2);
            zzCF zzcfZzL02 = this.zzZ9z.zzZGK().zz2y().zzL0(i2);
            if (!zzCF.zzR(zzcfZzL0) && !zzCF.zzR(zzcfZzL02)) {
                dArr[i] = zzY7(zzcfZzL0.getValue());
                double dZzY6 = zzY6(zzcfZzL02.getValue());
                dArr2[i] = dZzY6;
                d2 += dZzY6;
                i++;
            }
        }
        double d3 = d2 / ((double) i);
        double d4 = 0.0d;
        for (int i3 = 0; i3 < iMin; i3++) {
            double dZzY5 = dArr2[i3] - zzY5(dArr[i3]);
            d += dZzY5 * dZzY5;
            double d5 = dArr2[i3] - d3;
            d4 += d5 * d5;
        }
        return com.aspose.words.internal.zzZKN.format(zzV(1.0d - (d / d4), false), new Object[0]);
    }

    private zzCK zzZGG() throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = com.aspose.words.internal.zzZQ4.zz2T;
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZyQ.zzZIz());
        if (this.zzZ9z.zzZGR().zz3v()) {
            zzzq4ZzZ = zzZ(this.zzZyQ, this.zzZ9z.zzZGR());
            fIntBitsToFloat = zzzq4ZzZ.getWidth();
        }
        com.aspose.words.internal.zzZQ4 zzzq4 = zzzq4ZzZ;
        return zzCK.zzZ(zzZGH(), new zzCV(this.zzZ9z.zzZGR().zzaR(), this.zzZ9z.zzZGR().zzaQ(), this.zzZyQ.zzZIC().zzZMQ().zzZM7(), this.zzZyQ.zzZIC().zzZMQ().zzZM3(), this.zzZyQ.zzZIC().zzZMM(), fIntBitsToFloat), this.zzZyQ, zzzq4, 38100.0f, 38100.0f, 19050.0f, 19050.0f);
    }

    private zzCM zzZGH() {
        if (this.zzZ9z.zzZGR().zz3u() != null) {
            return this.zzZ9z.zzZGR().zz3u();
        }
        zzCM zzcmZzZIf = zzDG.zzZIf();
        if (this.zzZ9z.zzZGW()) {
            zzX(zzcmZzZIf);
        }
        if (this.zzZ9z.zzZGV()) {
            zzDG.zzZ(zzcmZzZIf, new String[]{"R", "2", com.aspose.words.internal.zzZKN.format(" = {0}", zzZGF())}, new double[]{0.0d, 30000.0d, 0.0d});
        }
        return zzcmZzZIf;
    }

    private long zzZGI() {
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZ9A);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(this.zzZ9A);
        float width = fIntBitsToFloat - (this.zzZef.getWidth() + com.aspose.words.internal.zzSA.zzYB(6));
        float height = fZzYC - (this.zzZef.getHeight() / 2.0f);
        float fZzYX = zzYX(width);
        float fMax = Math.max(height, this.zzZ9B.zzZKD().getY() + com.aspose.words.internal.zzSA.zzYB(6));
        if (this.zzZ9z.zzZGR().zz3w()) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(this.zzZyQ, this.zzZ9z.zzZGR());
            float x = zzzq4ZzZ.getX() + fZzYX;
            float y = zzzq4ZzZ.getY() + fMax;
            float fZzYX2 = zzYX(x);
            fMax = Math.max(-this.zzZ9B.zz44().zzZo(), y);
            fZzYX = fZzYX2;
        }
        return com.aspose.words.internal.zzZPY.zzG(fZzYX, fMax);
    }

    public final void zzZNw() throws Exception {
        zzCK zzckZzZGG = zzZGG();
        this.zzZ9C.zzX((com.aspose.words.internal.zzZL) zzckZzZGG.zzZGn());
        com.aspose.words.internal.zzG zzgZzKy = this.zzZyQ.zzKy(25);
        this.zzZef = zzckZzZGG.zzZGm();
        if (this.zzZ9z.zzZGR().zz3v()) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(this.zzZyQ, this.zzZ9z.zzZGR());
            this.zzZef = new com.aspose.words.internal.zzZQ4(zzckZzZGG.zzZGm().getX() - ((zzzq4ZzZ.getWidth() - zzckZzZGG.zzZGm().getWidth()) / 2.0f), zzckZzZGG.zzZGm().getY() - ((zzzq4ZzZ.getHeight() - zzckZzZGG.zzZGm().getHeight()) / 2.0f), zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight());
        }
        long jZzZGI = zzZGI();
        translate(Float.intBitsToFloat((int) jZzZGI), com.aspose.words.internal.zzZPY.zzYC(jZzZGI));
        com.aspose.words.internal.zzG zzg = this.zzZ9C;
        if (zzg == null || zzgZzKy == null) {
            return;
        }
        zzgZzKy.zzX((com.aspose.words.internal.zzZL) zzg);
    }

    private static String zzV(double d, boolean z) {
        int i = (d >= 0.0d || !z) ? 5 : 4;
        int iZzY4 = zzY4(d);
        return com.aspose.words.internal.zzJB.zzX(com.aspose.words.internal.zzZKQ.zzS(d, Math.max(0, i - iZzY4)), iZzY4 < 7 ? "" : "G1");
    }

    private void zzZ(zzCM zzcm, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        double d = this.zzZ9z.zzZGL()[1][0];
        double d2 = this.zzZ9z.zzZGL()[0][0];
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format(str, zzV(d, z)));
        if (!com.aspose.words.internal.zzAN.zzZD(d2)) {
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format(" {0} {1}", d2 > 0.0d ? "+" : CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, zzV(Math.abs(d2), false)));
        }
        zzDG.zzZ(zzcm, sb.toString());
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzDI zzdi, zzCQ zzcq) {
        return zzDG.zzZ(new com.aspose.words.internal.zzZQ4(0L, zzdi.zzZIz()), zzcq.zz3y(), zzdi);
    }
}
