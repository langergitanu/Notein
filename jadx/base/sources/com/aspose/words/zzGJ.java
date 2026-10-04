package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzGJ {
    private com.aspose.words.internal.zzP9 zzZfJ;
    private com.aspose.words.internal.zzP9 zzZfK;
    private zzDI zzZyQ;
    private ChartSeries zzZyw;

    public zzGJ(zzZCP zzzcp, ChartSeries chartSeries, zzDI zzdi, int i, int i2) {
        this.zzZyw = chartSeries;
        this.zzZyQ = zzdi;
        this.zzZfK = zzzcp.zzY6(i, i2);
        this.zzZfJ = zzzcp.zzKG(i2);
    }

    public static float[] zzH(long[] jArr) {
        int length = jArr.length - 1;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (1.0f - ((float) Math.sin(Math.atan2(com.aspose.words.internal.zzZPY.zzYC(jArr[i]) - com.aspose.words.internal.zzZPY.zzYC(jArr[r4]), Float.intBitsToFloat((int) jArr[i]) - Float.intBitsToFloat((int) jArr[r4]))))) * 50.0f;
        }
        return fArr;
    }

    public static com.aspose.words.internal.zzPY zzX(com.aspose.words.internal.zzPY zzpy, boolean z, com.aspose.words.internal.zzZQ4 zzzq4) {
        if (zzpy == null) {
            return null;
        }
        if (zzpy.zzPH() != 0) {
            return zzpy;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        if (!z) {
            zzp9.zzZ(90.0f, com.aspose.words.internal.zzZPY.zzG((zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f, (zzzq4.zzZn() + zzzq4.zzZo()) / 2.0f), 0);
        }
        com.aspose.words.internal.zzPA zzpa = new com.aspose.words.internal.zzPA(zzp9.zzO(zzzq4));
        zzpa.zzY(zzk(((com.aspose.words.internal.zzOI) zzpy).zzZy()));
        zzpa.zzL(zzp9);
        return zzpa;
    }

    private static boolean zzZH(com.aspose.words.internal.zzZQ4 zzzq4) {
        if (com.aspose.words.internal.zzZPW.zzYF(zzzq4.getSize())) {
            return false;
        }
        return com.aspose.words.internal.zzAN.zzf(zzzq4.getWidth()) || com.aspose.words.internal.zzAN.zzf(zzzq4.getHeight());
    }

    private zzF2 zzZP2() {
        return this.zzZyQ.zzZIC().zzZMJ();
    }

    private static com.aspose.words.internal.zzPI[] zzk(com.aspose.words.internal.zzPV zzpv) {
        zz2P zz2p = new zz2P(0.25d);
        zz2P zz2p2 = new zz2P(0.6d);
        return new com.aspose.words.internal.zzPI[]{new com.aspose.words.internal.zzPI(zz2p.zzl(zzpv), 0.0f), new com.aspose.words.internal.zzPI(zz2p2.zzl(zzpv), 0.1f), new com.aspose.words.internal.zzPI(zzpv, 0.5f), new com.aspose.words.internal.zzPI(zz2p2.zzl(zzpv), 0.9f), new com.aspose.words.internal.zzPI(zz2p.zzl(zzpv), 1.0f)};
    }

    public final long[] zzI(long[] jArr) {
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        this.zzZfJ.zzZ(jArr2);
        return jArr2;
    }

    public final long[] zzJ(long[] jArr) {
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        this.zzZfK.zzZ(jArr2);
        return jArr2;
    }

    public final void zzR(com.aspose.words.internal.zzZQ4 zzzq4, int i) throws Exception {
        if (com.aspose.words.internal.zzAN.zzf(zzzq4.getWidth()) || com.aspose.words.internal.zzAN.zzf(zzzq4.getHeight())) {
            return;
        }
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zzZ(new com.aspose.words.internal.zzQ5(zzzq4));
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        zzDG.zzZ(zzzg, this.zzZyw.zzNM(i), zzZP2(), this.zzZyw.getIndex());
        zzzg.zzY(zzZ(zzzg.zzZ1(), 50.0f));
        this.zzZyQ.zzsD().zzX(zzzg);
    }

    public final void zzY(long[] jArr, boolean z, int i, float f) throws Exception {
        zzZ(jArr, z, i, f, this.zzZyQ.zzsD());
    }

    public final long zzY2(long j) {
        return this.zzZfJ.zzR(j);
    }

    public final long zzY3(long j) {
        return this.zzZfK.zzR(j);
    }

    public final com.aspose.words.internal.zzZG zzZ(long[] jArr, boolean z, int i, float f) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(jArr, z, true);
        zzDG.zzZ(zzzgZzZ, this.zzZyw.zzNM(i), zzZP2(), this.zzZyw.getIndex());
        zzzgZzZ.zzY(zzZ(zzzgZzZ.zzZ1(), f));
        zzDG.zzB(zzzgZzZ);
        return zzzgZzZ;
    }

    public final com.aspose.words.internal.zzZQ4 zzZI(com.aspose.words.internal.zzZQ4 zzzq4) {
        return this.zzZfJ.zzO(zzzq4);
    }

    public final com.aspose.words.internal.zzZQ4 zzZJ(com.aspose.words.internal.zzZQ4 zzzq4) {
        return this.zzZfK.zzO(zzzq4);
    }

    public final void zzZ(long[] jArr, boolean z, int i, float f, com.aspose.words.internal.zzG zzg) throws Exception {
        zzg.zzX(zzZ(jArr, z, i, f));
    }

    public final void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, int i, boolean z) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzT = com.aspose.words.internal.zzZQ4.zzT(zzzq4, zzzq42);
        if (com.aspose.words.internal.zzAN.zzf(zzzq4ZzT.getWidth()) || com.aspose.words.internal.zzAN.zzf(zzzq4ZzT.getHeight())) {
            return;
        }
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        if (!zzZH(zzzq4) && !zzZH(zzzq42)) {
            float f = z ? -90.0f : -180.0f;
            com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
            com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4, f, 180.0d);
            com.aspose.words.internal.zzQ5 zzq52 = new com.aspose.words.internal.zzQ5(zzzq42, f + 180.0f, 180.0d);
            if (!com.aspose.words.internal.zzZPW.zzYF(zzq5.getSize())) {
                zzp5.zzZ(zzq5);
            }
            zzp5.zzR(com.aspose.words.internal.zzZPW.zzYF(zzq5.getSize()) ? zzq5.zzPT() : zzq5.zzPW(), com.aspose.words.internal.zzZPW.zzYF(zzq52.getSize()) ? zzq52.zzPT() : zzq52.zzPX());
            if (!com.aspose.words.internal.zzZPW.zzYF(zzq52.getSize())) {
                zzp5.zzZ(zzq52);
            }
            zzp5.zze(true);
            com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        } else {
            com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), com.aspose.words.internal.zzP5.zzK(zzzq4ZzT));
        }
        zzDG.zzZ(zzzg, this.zzZyw.zzNM(i), zzZP2(), this.zzZyw.getIndex());
        zzzg.zzY(zzX(zzzg.zzZ1(), !z, zzzq4ZzT));
        this.zzZyQ.zzsD().zzX(zzzg);
    }

    public static com.aspose.words.internal.zzPY zzZ(com.aspose.words.internal.zzPY zzpy, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzD3<byte[]> zzd3) throws Exception {
        if (zzpy == null || zzpy.zzPH() != 0) {
            return zzpy;
        }
        byte[] bArrZzZ = zzZ(((com.aspose.words.internal.zzOI) zzpy).zzZy(), zzd3);
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArrZzZ);
        com.aspose.words.internal.zzOH zzoh = new com.aspose.words.internal.zzOH(bArrZzZ, 4);
        zzoh.zzL(com.aspose.words.internal.zzP9.zzZ(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzegZzZT.getWidth(), zzegZzZT.getHeight()), com.aspose.words.internal.zzSA.zzS(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4.getWidth(), zzzq4.getHeight()))));
        zzoh.zzNb().zzY(zzzq4.zzZm(), zzzq4.zzZo(), 1);
        return zzoh;
    }

    private static byte[] zzZ(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzD3<byte[]> zzd3) throws Exception {
        int argb = zzpv.toArgb();
        if (zzd3.get(argb) == null) {
            com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.3dBubble.jpg", Document.class);
            try {
                com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(com.aspose.words.internal.zzZYQ.zzZX(zzzopZzW));
                try {
                    com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(zzxn);
                    zzei.zzDT().zzZ(new com.aspose.words.internal.zzPT(new float[][]{new float[]{zzpv.zzPC() / 127.0f, 0.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, zzpv.zzPB() / 127.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, zzpv.zzPA() / 127.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, zzpv.zzPD() / 255.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f}}));
                    zzei.zzDU();
                    zzd3.set(argb, zzei.getImageBytes());
                } finally {
                    zzxn.dispose();
                }
            } finally {
                if (zzzopZzW != null) {
                    zzzopZzW.close();
                }
            }
        }
        return zzd3.get(argb);
    }

    public static com.aspose.words.internal.zzPY zzZ(com.aspose.words.internal.zzPY zzpy, float f) {
        if (zzpy == null) {
            return null;
        }
        return zzpy.zzPH() == 0 ? new com.aspose.words.internal.zzOI(new zz2P(f / 100.0f).zzl(((com.aspose.words.internal.zzOI) zzpy).zzZy())) : zzpy;
    }
}
