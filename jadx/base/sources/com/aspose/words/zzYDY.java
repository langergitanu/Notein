package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDY {
    private long zzEp;
    private com.aspose.words.internal.zzZY5 zzXot;
    private ImageSaveOptions zzYj3;
    private com.aspose.words.internal.zzZL zzZFE;
    private com.aspose.words.internal.zzH6 zzl7;

    private zzYDY(com.aspose.words.internal.zzZL zzzl, long j, com.aspose.words.internal.zzZY5 zzzy5, com.aspose.words.internal.zzH6 zzh6) {
        this(zzzl, j, new ImageSaveOptions(44), zzh6);
        this.zzXot = zzzy5;
    }

    private void zzYK(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzN8 zzn8 = new com.aspose.words.internal.zzN8(zzzop, this.zzEp, this.zzYj3.getHorizontalResolution(), this.zzYj3.getVerticalResolution());
        zzn8.zzKA();
        if (this.zzYj3.getUseAntiAliasing()) {
            zzn8.zzKx();
        }
        if (this.zzYj3.getUseHighQualityRendering()) {
            zzn8.zzKw();
        }
        if (this.zzYj3.zzYVN()) {
            zzn8.zzG(this.zzYj3.zzYVS());
        }
        zzn8.zzR(this.zzYj3.getScale());
        this.zzZFE.zzZ(zzn8);
        zzn8.zzKy();
    }

    private void zzYL(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzZH zzzh = new com.aspose.words.internal.zzZH(Float.intBitsToFloat((int) this.zzEp), com.aspose.words.internal.zzZPW.zzYz(this.zzEp));
        zzzh.zzX(this.zzZFE);
        com.aspose.words.internal.zzZY5 zzzy5ZzY = this.zzXot;
        if (zzzy5ZzY == null) {
            zzzy5ZzY = this.zzYj3.zzY(this.zzl7);
        }
        com.aspose.words.internal.zzZY3 zzzy3 = new com.aspose.words.internal.zzZY3(zzzop, zzzy5ZzY, null, com.aspose.words.internal.zzZO0.zzhV());
        zzzy3.startDocument();
        zzzy3.zzO(zzzh);
        zzzy3.endDocument();
    }

    private void zzYM(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzKT zzkt = new com.aspose.words.internal.zzKT(zzzop, this.zzEp, this.zzYj3.zzX(this.zzl7));
        zzkt.startDocument();
        zzkt.zzO(this.zzZFE);
        zzkt.endDocument();
    }

    private void zzYN(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        int saveFormat = this.zzYj3.getSaveFormat();
        if (saveFormat == 44) {
            zzYL(zzzop);
            return;
        }
        switch (saveFormat) {
            case 100:
                com.aspose.words.internal.zzXN zzxnZzYd2 = zzYd2();
                try {
                    int iZzYVP = this.zzYj3.zzYVP();
                    int iZzYVO = this.zzYj3.zzYVO();
                    byte thresholdForFloydSteinbergDithering = this.zzYj3.getThresholdForFloydSteinbergDithering();
                    this.zzYj3.zzYVQ();
                    zzxnZzYd2.zzZ(zzzop, iZzYVP, iZzYVO, thresholdForFloydSteinbergDithering);
                    return;
                } finally {
                }
            case 101:
                try {
                    zzYd2().zzV(zzzop);
                    return;
                } finally {
                }
            case 102:
                try {
                    zzYd2().zzU(zzzop);
                    return;
                } finally {
                }
            case 103:
                zzYK(zzzop);
                return;
            case 104:
                try {
                    zzYd2().zzY(zzzop, this.zzYj3.getJpegQuality());
                    return;
                } finally {
                }
            case 105:
                try {
                    zzYd2().zzW(zzzop);
                    return;
                } finally {
                }
            case 106:
                zzYM(zzzop);
                return;
            default:
                throw new IllegalStateException("Unexpected image save format requested.");
        }
    }

    private boolean zzYd1() {
        return (this.zzYj3.getPixelFormat() != 10 || this.zzYj3.getSaveFormat() == 100 || this.zzYj3.zzYVP() == 3 || this.zzYj3.zzYVP() == 4) ? false : true;
    }

    private com.aspose.words.internal.zzXN zzYd2() throws Exception {
        long jZzZ = com.aspose.words.internal.zzZPX.zzYF(this.zzYj3.zzYVU()) ? zzZ(this.zzEp, this.zzYj3.getScale(), this.zzYj3.getHorizontalResolution(), this.zzYj3.getVerticalResolution(), this.zzYj3.getSaveFormat()) : this.zzYj3.zzYVU();
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN((int) jZzZ, (int) (jZzZ >>> 32), this.zzYj3.getHorizontalResolution(), this.zzYj3.getVerticalResolution(), this.zzYj3.zzYVQ());
        com.aspose.words.internal.zzIY zziy = new com.aspose.words.internal.zzIY(zzxn);
        try {
            zzZ(zziy, jZzZ);
            zziy.dispose();
            zzxn.zzZ(new com.aspose.words.internal.zzEQ(this.zzYj3.zzYVR(), this.zzYj3.getImageBrightness(), this.zzYj3.getImageContrast()));
            if (!zzYd1()) {
                return zzxn;
            }
            com.aspose.words.internal.zzXN zzxn2 = new com.aspose.words.internal.zzXN(zzxn.zzDW());
            zzxn2.zzWI();
            return zzxn2;
        } catch (Throwable th) {
            zziy.dispose();
            throw th;
        }
    }

    public static void zzZ(com.aspose.words.internal.zzZL zzzl, long j, com.aspose.words.internal.zzZOP zzzop, ImageSaveOptions imageSaveOptions, com.aspose.words.internal.zzH6 zzh6) throws Exception {
        new zzYDY(zzzl, j, imageSaveOptions, zzh6).zzYN(zzzop);
    }

    private zzYDY(com.aspose.words.internal.zzZL zzzl, long j, ImageSaveOptions imageSaveOptions, com.aspose.words.internal.zzH6 zzh6) {
        this.zzZFE = zzzl;
        this.zzEp = j;
        this.zzYj3 = imageSaveOptions;
        this.zzl7 = zzh6;
    }

    public static void zzZ(com.aspose.words.internal.zzZL zzzl, long j, com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZY5 zzzy5, com.aspose.words.internal.zzH6 zzh6) throws Exception {
        new zzYDY(zzzl, j, zzzy5, zzh6).zzYN(zzzop);
    }

    public static com.aspose.words.internal.zzXN zzZ(com.aspose.words.internal.zzZL zzzl, long j, ImageSaveOptions imageSaveOptions, com.aspose.words.internal.zzH6 zzh6) throws Exception {
        return new zzYDY(zzzl, j, imageSaveOptions, zzh6).zzYd2();
    }

    public static long zzZ(long j, float f, float f2, float f3, int i) {
        if (i == 104) {
            return com.aspose.words.internal.zzSA.zzZ(j, f, f2, f3);
        }
        return com.aspose.words.internal.zzSA.zzY(j, f, f2, f3);
    }

    private void zzZ(com.aspose.words.internal.zzIY zziy, long j) throws Exception {
        com.aspose.words.internal.zzIY zziy2;
        com.aspose.words.internal.zzIY.zzGJ();
        if (this.zzYj3.getUseAntiAliasing()) {
            zziy.zzGF();
        }
        if (this.zzYj3.getUseHighQualityRendering()) {
            zziy.zzGI();
        }
        if (this.zzYj3.zzYVN()) {
            zziy.zzZ(this.zzYj3.zzYVS(), (int) j, (int) (j >>> 32));
        }
        float horizontalResolution = (float) ((((double) ((int) j)) / ((double) this.zzYj3.getHorizontalResolution())) * 72.0d);
        float verticalResolution = (float) ((((double) ((int) (j >>> 32))) / ((double) this.zzYj3.getVerticalResolution())) * 72.0d);
        if (com.aspose.words.internal.zzZPX.zzYF(this.zzYj3.zzYVU())) {
            zziy.zzR(this.zzYj3.getScale());
            zziy2 = zziy;
        } else {
            float scale = this.zzYj3.getScale();
            float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzEp);
            float fZzYz = com.aspose.words.internal.zzZPW.zzYz(this.zzEp);
            this.zzYj3.getHorizontalResolution();
            this.zzYj3.getVerticalResolution();
            zziy2 = zziy;
            zziy2.zzZ(fIntBitsToFloat, fZzYz, horizontalResolution, verticalResolution, scale);
        }
        new com.aspose.words.internal.zzJ8(this.zzl7.zzHq(), this.zzYj3.getMetafileRenderingOptions().zzZ(this.zzl7, this.zzYj3.getOptimizeOutput())).zzZ(this.zzZFE, zziy2);
    }
}
