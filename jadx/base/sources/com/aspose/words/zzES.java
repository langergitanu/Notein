package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;

/* JADX INFO: loaded from: classes6.dex */
final class zzES {
    private static boolean zzT(long j, long j2, long j3) {
        int i = (int) j2;
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(com.aspose.words.internal.zzAN.zzZK(Math.atan2(com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2), Float.intBitsToFloat((int) j) - Float.intBitsToFloat(i)) - Math.atan2(com.aspose.words.internal.zzZPY.zzYC(j3) - com.aspose.words.internal.zzZPY.zzYC(j2), Float.intBitsToFloat((int) j3) - Float.intBitsToFloat(i))));
        if (dZzZJ > 180.0d) {
            dZzZJ = 360.0d - dZzZJ;
        }
        return dZzZJ < 90.0d;
    }

    private static void zzX(zzFR zzfr) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZNl;
        boolean z = zzfr.zzZQO() == 9;
        float fZzO = com.aspose.words.internal.zzJ6.zzO(zzfr.zzZNd(), zzfr.zzPW()) / 2.0f;
        if (z) {
            float f = -fZzO;
            zzzq4ZzZNl = com.aspose.words.internal.zzZQ4.zzX(zzfr.zzZNl(), f, f);
        } else {
            zzzq4ZzZNl = zzfr.zzZNl();
        }
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4ZzZNl, 0.0d, zzfr.zzZNi());
        long jZzPW = zzq5.zzPW();
        long[] jArrZzZ = zzZ(jZzPW, zzfr);
        if (z) {
            float fZzO2 = com.aspose.words.internal.zzJ6.zzO(zzq5.zzPT(), zzfr.zzZNd());
            long[] jArrZzz = com.aspose.words.internal.zzJ6.zzz(zzfr.zzZNk());
            long jZzB = com.aspose.words.internal.zzJ6.zzB(zzfr.zzZNl());
            float width = zzfr.zzZNl().getWidth() / 2.0f;
            float height = zzfr.zzZNl().getHeight() / 2.0f;
            if (zz3N.zzZ(jArrZzz[0], jZzB, zzfr.zzZS3(), zzfr.zzZNj(), width, height, fZzO2) || zz3N.zzZ(jArrZzz[1], jZzB, zzfr.zzZS3(), zzfr.zzZNj(), width, height, fZzO2) || zz3N.zzZ(jArrZzz[2], jZzB, zzfr.zzZS3(), zzfr.zzZNj(), width, height, fZzO2) || zz3N.zzZ(jArrZzz[3], jZzB, zzfr.zzZS3(), zzfr.zzZNj(), width, height, fZzO2)) {
                return;
            }
        } else if (zzZ(zzq5, jZzPW, jArrZzZ[1]) > 90.0d) {
            return;
        }
        zzZ(zzfr, jArrZzZ);
    }

    private static void zzY(zzFR zzfr) throws Exception {
        zzZ(zzfr, zzZ(zzfr.zzZNc(), zzfr));
    }

    public static void zzZ(zzFR zzfr) throws Exception {
        int iZzZQO = zzfr.zzZQO();
        if (iZzZQO == 7 || iZzZQO == 8 || iZzZQO == 9 || iZzZQO == 12) {
            zzX(zzfr);
        } else {
            zzY(zzfr);
        }
    }

    private static long[] zzZ(long j, zzFR zzfr) throws Exception {
        float fIntBitsToFloat;
        float fZzZGA = zzfr.zzZNf().zz3u() != null ? zzfr.zzZNf().zz3u().zzZGA() : Float.NaN;
        if (Float.isNaN(fZzZGA)) {
            fZzZGA = zzDG.zzX(zzfr.zzZNf().zzaR(), zzfr.zzZNg());
        }
        if (!zzfr.zzZP9() || zzfr.zzZNe()) {
            fZzZGA = zzfr.zzZNk().getHeight() / 2.0f;
        }
        float fZzZo = zzfr.zzZNk().zzZo() + fZzZGA;
        float f = zzfr.zzZNg().zzZIC().zzZdM / 2.0f;
        long jZzG = com.aspose.words.internal.zzZPY.zzG(zzfr.zzZNk().zzZm() - f, fZzZo);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(zzfr.zzZNk().zzkw() + f, fZzZo);
        boolean z = com.aspose.words.internal.zzJ6.zzO(j, jZzG) < com.aspose.words.internal.zzJ6.zzO(j, jZzG2);
        if (z) {
            fIntBitsToFloat = Float.intBitsToFloat((int) jZzG);
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) jZzG2);
        }
        long jZzG3 = com.aspose.words.internal.zzZPY.zzG((z ? -f : f) + fIntBitsToFloat, com.aspose.words.internal.zzZPY.zzYC(jZzG));
        if (!z) {
            f = -f;
        }
        long jZzG4 = com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat + f, com.aspose.words.internal.zzZPY.zzYC(jZzG));
        if (!zzT(j, jZzG3, jZzG4)) {
            return new long[]{j, jZzG3, jZzG4};
        }
        long jZzG5 = com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(zzfr.zzZNk(), 2.0f, zzfr.zzZNk().zzZm()), zzfr.zzZNk().zzZo());
        long jZzG6 = com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(zzfr.zzZNk(), 2.0f, zzfr.zzZNk().zzZm()), zzfr.zzZNk().zzZn());
        if (com.aspose.words.internal.zzJ6.zzO(j, jZzG5) > com.aspose.words.internal.zzJ6.zzO(j, jZzG6)) {
            jZzG5 = jZzG6;
        }
        return new long[]{j, jZzG5};
    }

    private static void zzZ(zzFR zzfr, long... jArr) throws Exception {
        if (jArr.length < 2) {
            return;
        }
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(jArr, false, false);
        zzDG.zzZ(zzzgZzZ, zzfr.zzZNf().zz3r(), (zzE3) null, zzfr.zzZNg().zzZIC().zzZMC(), zzfr.zzZNf().getIndex());
        zzfr.zzZNg().zzKy(21).zzX(zzzgZzZ);
    }

    private static double zzZ(com.aspose.words.internal.zzQ5 zzq5, long j, long j2) {
        int i = (int) j;
        return com.aspose.words.internal.zzAN.zzZK(Math.abs(Math.atan2(com.aspose.words.internal.zzZPY.zzYC(zzq5.zzPT()) - com.aspose.words.internal.zzZPY.zzYC(j), Float.intBitsToFloat((int) zzq5.zzPT()) - Float.intBitsToFloat(i)) - Math.atan2(com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2), Float.intBitsToFloat(i) - Float.intBitsToFloat((int) j2))));
    }
}
