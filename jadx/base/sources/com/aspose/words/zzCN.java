package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzCN {
    private zzZCP zzZ9B;
    private long[] zzZ9w;
    private zzDI zzZyQ;
    private zzGK zzZyX;

    private zzCN(zzGK zzgk, zzZCP zzzcp, zzDI zzdi) {
        this.zzZyX = zzgk;
        this.zzZ9B = zzzcp;
        this.zzZyQ = zzdi;
    }

    private static boolean zzL(zzGK zzgk) {
        if (zzgk.zz3R() || zzgk.zzZQj()) {
            return false;
        }
        int iZzZQO = zzgk.zzZQO();
        return iZzZQO == 0 || iZzZQO == 2 || iZzZQO == 4 || iZzZQO == 6 || iZzZQO == 10 || iZzZQO == 15;
    }

    private void zzX(zzCR zzcr) throws Exception {
        long[] jArr = this.zzZ9w;
        zzZ(jArr[0], jArr[jArr.length - 1], zzcr.zzaQ());
    }

    private void zzY(zzCR zzcr, int i) throws Exception {
        int iZzZGS = zzcr.zzZGS();
        if (iZzZGS >= zzcr.zzNu().getCount()) {
            return;
        }
        int i2 = 0;
        if (this.zzZyX.zzZQO() == 10) {
            zzH8 zzh8 = (zzH8) this.zzZyX;
            int count = zzh8.zzZPj().getCount();
            float fZzl = this.zzZ9B.zzl(count, zzh8.getGapWidth(), zzh8.zzZQk());
            float f = count * fZzl;
            float fZzZ = zzH7.zzZ(fZzl, count, i, zzh8.zzZQk(), zzh8.zzZPt().getReverseOrder());
            com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
            if (zzZGC()) {
                zzp9.zzY(0.0f, -((fZzl / 2.0f) + (fZzZ - (f / 2.0f))), 0);
            } else {
                zzp9.zzY((fZzl / 2.0f) + (fZzZ - (f / 2.0f)), 0.0f, 0);
            }
            zzp9.zzZ(this.zzZ9w);
        }
        int length = this.zzZ9w.length - (iZzZGS - 1);
        long[] jArr = new long[length];
        for (int i3 = 0; i3 < length; i3++) {
            float fIntBitsToFloat = 0.0f;
            float fZzYC = 0.0f;
            for (int i4 = 0; i4 < iZzZGS; i4++) {
                long j = this.zzZ9w[i3 + i4];
                fIntBitsToFloat = zzZGC() ? Float.intBitsToFloat((int) j) + fIntBitsToFloat : Float.intBitsToFloat((int) j);
                fZzYC = zzZGC() ? com.aspose.words.internal.zzZPY.zzYC(j) : com.aspose.words.internal.zzZPY.zzYC(j) + fZzYC;
            }
            if (zzZGC()) {
                fIntBitsToFloat /= iZzZGS;
            }
            if (!zzZGC()) {
                fZzYC /= iZzZGS;
            }
            jArr[i3] = com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC);
        }
        while (i2 < length - 1) {
            long j2 = jArr[i2];
            i2++;
            zzZ(j2, jArr[i2], zzcr.zzaQ());
        }
    }

    public static void zzZ(zzGK zzgk, zzZCP zzzcp, zzDI zzdi) throws Exception {
        if (zzL(zzgk)) {
            new zzCN(zzgk, zzzcp, zzdi).zzZGD();
        }
    }

    private boolean zzZGC() {
        return this.zzZyX.zzZQO() == 10 && ((Integer) this.zzZyX.zzZPg().zzLv(15)).intValue() == 0;
    }

    private void zzZGD() throws Exception {
        for (int i = 0; i < this.zzZyX.zzZPj().getCount(); i++) {
            ChartSeries chartSeries = this.zzZyX.zzZPj().get(i);
            if (chartSeries.zz2t().size() != 0) {
                Iterator<zzCR> it = chartSeries.zz2t().iterator();
                while (it.hasNext()) {
                    zzZ(it.next(), i);
                }
            }
        }
    }

    public static void zzZ(zzGK zzgk, zzEM zzem, zzDI zzdi) throws Exception {
        if (zzL(zzgk)) {
            for (ChartSeries chartSeries : zzgk.zzZPj()) {
                if (chartSeries.zz2t().size() != 0) {
                    for (zzCR zzcr : chartSeries.zz2t()) {
                        zzem.zzZ(zzEN.zzZ(zzcr.zzaQ(), zzem.zzZLC(), zzem.zzZLz(), zzdi), zzZ(zzcr, chartSeries.getName()));
                    }
                }
            }
        }
    }

    private static String zzZ(zzCR zzcr, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(zzcr.getName())) {
            return zzcr.getName();
        }
        int iZzZGQ = zzcr.zzZGQ();
        if (iZzZGQ == 0) {
            return com.aspose.words.internal.zzZKN.format("Expon. ({0})", str);
        }
        if (iZzZGQ == 1) {
            return com.aspose.words.internal.zzZKN.format("Linear ({0})", str);
        }
        if (iZzZGQ == 2) {
            return com.aspose.words.internal.zzZKN.format("Log. ({0})", str);
        }
        if (iZzZGQ == 3) {
            return com.aspose.words.internal.zzZKN.format("{0} per. Mov. Avg. ({1})", Integer.valueOf(zzcr.zzZGS()), str);
        }
        if (iZzZGQ == 4) {
            return com.aspose.words.internal.zzZKN.format("Poly. ({0})", str);
        }
        if (iZzZGQ == 5) {
            return com.aspose.words.internal.zzZKN.format("Power ({0})", str);
        }
        throw new IllegalArgumentException("Unexpected TrendlineType");
    }

    private void zzY(zzCR zzcr) throws Exception {
        zzZ(this.zzZ9w, zzcr.zzaQ());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzCR zzcr, int i) throws Exception {
        if (zzcr.isValid()) {
            this.zzZ9w = zzZ(zzcr.zzNu(), zzcr);
            int iZzZGQ = zzcr.zzZGQ();
            if (iZzZGQ == 0) {
                zzY(zzcr);
            } else if (iZzZGQ == 1) {
                zzX(zzcr);
            } else if (iZzZGQ != 2) {
                if (iZzZGQ == 3) {
                    zzY(zzcr, i);
                } else {
                    if (iZzZGQ != 4 && iZzZGQ != 5) {
                        throw new IllegalArgumentException("Unexpected TrendlineType");
                    }
                    zzY(zzcr);
                }
            }
            if ((!zzcr.zzZGW() && !zzcr.zzZGV()) || zzcr.zzZGN().isDate() || zzcr.zzZGQ() == 3) {
                return;
            }
            long[] jArr = this.zzZ9w;
            new zzCP(zzcr, this.zzZyQ, jArr[jArr.length - 1], this.zzZ9B).zzZNw();
        }
    }

    private long[] zzZ(com.aspose.words.internal.zz0Q zz0q, zzCR zzcr) throws Exception {
        int count = zz0q.getCount();
        long[] jArr = new long[count];
        boolean zIsDate = zzcr.zzZGN().isDate();
        int i = 0;
        boolean z = false;
        while (i < count) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) zz0q.get(i));
            if (zIsDate) {
                int i2 = (int) fIntBitsToFloat;
                float f = fIntBitsToFloat - i2;
                double value = zzcr.zzZGN().zzL0(i2 - 1).getValue();
                if (f > 0.0f) {
                    value += (zzcr.zzZGN().zzL0(i2).getValue() - value) * ((double) f);
                }
                fIntBitsToFloat = (float) value;
                z = com.aspose.words.internal.zzAN.zzf(fIntBitsToFloat - ((float) ((int) fIntBitsToFloat))) && (i == 0 || i == count + (-1));
            }
            boolean z2 = z;
            jArr[i] = this.zzZ9B.zzZ(fIntBitsToFloat, com.aspose.words.internal.zzZPY.zzYC(zz0q.get(i)), z2);
            i++;
            z = z2;
        }
        return jArr;
    }

    private void zzZ(long[] jArr, zzD9 zzd9) throws Exception {
        long[] jArrZzX = zzEK.zzX(jArr, true);
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), com.aspose.words.internal.zzP5.zzY(jArrZzX));
        zzzg.zzX(zzDG.zzZ(zzd9.getOutline(), (zzGK) null, this.zzZyQ.zzZIC().zzZMC(), 0));
        this.zzZyQ.zzKy(24).zzX(zzzg);
    }

    private void zzZ(long j, long j2, zzD9 zzd9) throws Exception {
        this.zzZyQ.zzKy(24).zzX(zzZ(j, j2, zzd9, this.zzZyQ));
    }

    private static com.aspose.words.internal.zzZG zzZ(long j, long j2, zzD9 zzd9, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(j, j2);
        zzzgZzZ.zzX(zzDG.zzZ(zzd9.getOutline(), (zzGK) null, zzdi.zzZIC().zzZMC(), 0));
        return zzzgZzZ;
    }
}
