package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLS {
    static boolean zzZD5 = false;
    private int zzXEA;
    private int zzXEB;
    private int zzXEC;
    private byte[] zzXED;
    private int zzXEE;
    private int zzXEF;
    private int zzXEG;
    private int zzXEH;
    int zzXEI;
    int zzXEJ;
    int zzXEK;
    private int zzXEm;
    private int zzXEn;
    private int zzXEo;
    private int zzXEp;
    private int zzXEq;
    private int zzXEr;
    private boolean zzXEs;
    private boolean zzXEt;
    private boolean zzXEu;
    private boolean zzXEv;
    private int zzXEw;
    private int zzXEx;
    private int zzXEy;
    private int zzXEz;
    private Border zzXRG;
    private Border zzXRH;
    private Border zzXRI;
    private Border zzXRJ;

    public static class zzY {
        int zzXEE;
        int zzXEc;
        int zzXEd;
        int zzXEe;

        public zzY(byte[] bArr) throws Exception {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr));
            this.zzXEE = zzzox.zzXc();
            this.zzXEe = zzzox.zzXc();
            this.zzXEd = zzzox.zzXa();
            this.zzXEc = zzzox.zzXc();
        }
    }

    public static class zzZ {
        int zzXEf;
        int zzXEg;
        int zzXEh;
        int zzXEi;
        int zzXEj;
        int zzXEk;
        int zzXEl;

        public zzZ(byte[] bArr) throws Exception {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr));
            this.zzXEl = zzzox.zzX9() & 65535;
            this.zzXEk = zzzox.zzX9() & 65535;
            this.zzXEj = zzzox.zzX9() & 65535;
            this.zzXEi = zzzox.zzX9() & 65535;
            this.zzXEh = zzzox.zzX9() & 65535;
            this.zzXEg = zzzox.zzX9() & 65535;
            this.zzXEf = zzzox.zzX9() & 65535;
        }
    }

    public zzYLS() {
        this.zzXRJ = new Border();
        this.zzXRI = new Border();
        this.zzXRH = new Border();
        this.zzXRG = new Border();
        this.zzXEJ = 68;
        this.zzXEn = 1000;
        this.zzXEm = 1000;
    }

    private static double zzWn(double d) {
        if (d > 31680.0d) {
            return 15.0d;
        }
        return d;
    }

    private static double zzWo(double d) {
        double d2 = d % 360.0d;
        return d2 < 0.0d ? d2 + 360.0d : d2;
    }

    private zzZ zzYnp() throws Exception {
        int i = this.zzXEI;
        if (i == 0 || i == 8 || i == 94 || i == 102) {
            return null;
        }
        if (i == 99) {
            return new zzZ(this.zzXED);
        }
        if (i == 100) {
            return null;
        }
        throw new IllegalStateException("Unknown picture data format.");
    }

    private zzY zzYnq() throws Exception {
        int i = this.zzXEI;
        if (i == 0 || i == 8) {
            return null;
        }
        if (i != 94 && i != 102) {
            if (i == 99) {
                return null;
            }
            if (i != 100) {
                throw new IllegalStateException("Unknown picture data format.");
            }
        }
        return new zzY(this.zzXED);
    }

    public static long zzZ(long j, double d) {
        int iZzWo = (int) zzWo(d);
        return (iZzWo == 90 || iZzWo == 270) ? com.aspose.words.internal.zzZPW.zzG(com.aspose.words.internal.zzZPW.zzYz(j), Float.intBitsToFloat((int) j)) : j;
    }

    public final boolean isValid() {
        return (this.zzXEC == 0 && this.zzXEB == 0) ? false : true;
    }

    public final void zzZ7(ShapeBase shapeBase) {
        long jZzZ = zzZ(com.aspose.words.internal.zzZPW.zzG(this.zzXEC, this.zzXEB), shapeBase.getRotation());
        double dIntBitsToFloat = this.zzXEC == 0 ? this.zzXEn : (Float.intBitsToFloat((int) jZzZ) / ((this.zzXEC - this.zzXEA) - this.zzXEy)) * 1000.0f;
        double dZzYz = this.zzXEB == 0 ? this.zzXEm : (com.aspose.words.internal.zzZPW.zzYz(jZzZ) / ((this.zzXEB - this.zzXEz) - this.zzXEx)) * 1000.0f;
        double d = com.aspose.words.internal.zzAN.zzZD(dIntBitsToFloat) ? 1.0d : ((double) this.zzXEn) / dIntBitsToFloat;
        double d2 = com.aspose.words.internal.zzAN.zzZD(dZzYz) ? 1.0d : ((double) this.zzXEm) / dZzYz;
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            d = 1.0d;
        }
        double d3 = com.aspose.words.internal.zzAN.zzZD(d2) ? 1.0d : d2;
        int iZzWo = (int) zzWo(shapeBase.getRotation());
        boolean z = iZzWo == 90 || iZzWo == 270;
        double dZzWn = zzWn(((double) this.zzXEC) * (z ? d3 : d));
        double d4 = this.zzXEB;
        if (!z) {
            d = d3;
        }
        shapeBase.zzWe(zzWn(d4 * d) / 20.0d);
        shapeBase.zzWf(dZzWn / 20.0d);
        shapeBase.zzYa3();
        zzZ(this.zzXRI, shapeBase, 4107, 924);
        zzZ(this.zzXRJ, shapeBase, EditingLanguage.SPANISH_GUATEMALA, 923);
        zzZ(this.zzXRG, shapeBase, 4109, 926);
        zzZ(this.zzXRH, shapeBase, EditingLanguage.FRENCH_SWITZERLAND, 925);
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(this.zzXEK);
        zzzow.zzJ((short) this.zzXEJ);
        zzzow.zzJ((short) this.zzXEI);
        zzzow.zzJ((short) this.zzXEH);
        zzzow.zzJ((short) this.zzXEG);
        zzzow.zzJ((short) this.zzXEF);
        zzzow.zzk(this.zzXEE);
        zzzow.zzk(0);
        zzzow.zzJ((short) 0);
        zzzow.zzk(0);
        zzzow.zzJ((short) this.zzXEC);
        zzzow.zzJ((short) this.zzXEB);
        zzzow.zzJ((short) this.zzXEn);
        zzzow.zzJ((short) this.zzXEm);
        zzzow.zzK((short) this.zzXEA);
        zzzow.zzK((short) this.zzXEz);
        zzzow.zzK((short) this.zzXEy);
        zzzow.zzK((short) this.zzXEx);
        zzzow.zzJ((short) (this.zzXEw | (this.zzXEv ? 16 : 0) | (this.zzXEu ? 32 : 0) | (this.zzXEt ? 64 : 0) | (this.zzXEs ? 128 : 0) | (this.zzXEr << 8)));
        zzXY.zzZ(this.zzXRJ, zzzow, false);
        zzXY.zzZ(this.zzXRI, zzzow, false);
        zzXY.zzZ(this.zzXRH, zzzow, false);
        zzXY.zzZ(this.zzXRG, zzzow, false);
        zzzow.zzK((short) this.zzXEq);
        zzzow.zzK((short) this.zzXEp);
        zzzow.zzK((short) this.zzXEo);
    }

    public zzYLS(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this();
        this.zzXEK = zzzox.zzXc();
        this.zzXEJ = zzzox.zzX9() & 65535;
        this.zzXEI = zzzox.zzX9() & 65535;
        this.zzXEH = zzzox.zzX9() & 65535;
        this.zzXEG = zzzox.zzX9() & 65535;
        this.zzXEF = zzzox.zzX9() & 65535;
        this.zzXED = zzzox.zzn(14);
        this.zzXEC = zzzox.zzX9() & 65535;
        this.zzXEB = zzzox.zzX9() & 65535;
        this.zzXEn = zzzox.zzX9() & 65535;
        this.zzXEm = zzzox.zzX9() & 65535;
        this.zzXEA = zzzox.zzXa();
        this.zzXEz = zzzox.zzXa();
        this.zzXEy = zzzox.zzXa();
        this.zzXEx = zzzox.zzXa();
        short sZzX9 = zzzox.zzX9();
        int i = 65535 & sZzX9;
        this.zzXEw = sZzX9 & 15;
        this.zzXEv = (sZzX9 & 16) != 0;
        this.zzXEu = (sZzX9 & 32) != 0;
        this.zzXEt = (sZzX9 & 64) != 0;
        this.zzXEs = (sZzX9 & 128) != 0;
        this.zzXEr = (sZzX9 & 65280) >> 8;
        if (this.zzXEJ == 58) {
            zzXY.zzY(zzzox, this.zzXRJ);
            zzXY.zzY(zzzox, this.zzXRI);
            zzXY.zzY(zzzox, this.zzXRH);
            zzXY.zzY(zzzox, this.zzXRG);
        } else {
            zzXY.zzX(zzzox, this.zzXRJ);
            zzXY.zzX(zzzox, this.zzXRI);
            zzXY.zzX(zzzox, this.zzXRH);
            zzXY.zzX(zzzox, this.zzXRG);
        }
        this.zzXEq = zzzox.zzXa();
        this.zzXEp = zzzox.zzXa();
        this.zzXEo = zzzox.zzXa();
        if (zzZD5) {
            StringBuilder sb = new StringBuilder();
            com.aspose.words.internal.zzZNH.zzU(sb, "\nRead PICF:");
            com.aspose.words.internal.zzZNH.zzZ(sb, "\n mfpMm:{0}, mfpXExt:{1}, mfpYExt:{2}, mfpHMF:{3}", Integer.valueOf(this.zzXEI), Integer.valueOf(this.zzXEH), Integer.valueOf(this.zzXEG), Integer.valueOf(this.zzXEF));
            if (this.zzXEI == 100) {
                zzY zzyZzYnq = zzYnq();
                com.aspose.words.internal.zzZNH.zzZ(sb, "\n grf:{0}, padding1:{1}, mmPM:{2}, padding2:{3}", Integer.valueOf(zzyZzYnq.zzXEE), Integer.valueOf(zzyZzYnq.zzXEe), Integer.valueOf(zzyZzYnq.zzXEd), Integer.valueOf(zzyZzYnq.zzXEc));
            }
            if (this.zzXEI == 99) {
                zzZ zzzZzYnp = zzYnp();
                com.aspose.words.internal.zzZNH.zzZ(sb, "\n bmType:{0}, bmWidth:{1}, bmHeight:{2}, bmWidthBytes:{3}, bmPlanes:{4}, bmBitsPixel:{5}, bmBits:{6}", Integer.valueOf(zzzZzYnp.zzXEl), Integer.valueOf(zzzZzYnp.zzXEk), Integer.valueOf(zzzZzYnp.zzXEj), Integer.valueOf(zzzZzYnp.zzXEi), Integer.valueOf(zzzZzYnp.zzXEh), Integer.valueOf(zzzZzYnp.zzXEg), Integer.valueOf(zzzZzYnp.zzXEf));
            }
            com.aspose.words.internal.zzZNH.zzZ(sb, "\n flags:{0}", Integer.valueOf(i));
            com.aspose.words.internal.zzZNH.zzZ(sb, "\n dxaGoal:{0}, dyaGoal:{1}, mx:{2}, my:{3}", Integer.valueOf(this.zzXEC), Integer.valueOf(this.zzXEB), Integer.valueOf(this.zzXEn), Integer.valueOf(this.zzXEm));
            com.aspose.words.internal.zzZNH.zzZ(sb, "\n dxaCropLeft:{0}, dyaCropTop:{1}, dxaCropRight:{2}, dyaCropBottom:{3}", Integer.valueOf(this.zzXEA), Integer.valueOf(this.zzXEz), Integer.valueOf(this.zzXEy), Integer.valueOf(this.zzXEx));
            com.aspose.words.internal.zzZNH.zzZ(sb, "\n dxaOrigin:{0}, dyaOrigin:{1}, cProps:{2}", Integer.valueOf(this.zzXEq), Integer.valueOf(this.zzXEp), Integer.valueOf(this.zzXEo));
        }
    }

    private static void zzZ(Border border, ShapeBase shapeBase, int i, int i2) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        if (zzyc3ZzYvW.zzVE(i2)) {
            border.zzm((com.aspose.words.internal.zzPV) zzyc3ZzYvW.zzPk(i2));
            zzyc3ZzYvW.remove(i2);
        }
        zzyc3ZzYvW.zzQ(i, border);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzYLS(ShapeBase shapeBase) throws Exception {
        this();
        if (shapeBase.isHorizontalRule()) {
            this.zzXEI = 100;
            this.zzXEE = shapeBase.getShapeType() == 75 ? 12 : 14;
        } else if (shapeBase.isWordArt()) {
            this.zzXEI = 100;
            this.zzXEE = 6;
        } else {
            int shapeType = shapeBase.getShapeType();
            if (shapeType == -2) {
                this.zzXEI = 100;
                this.zzXEE = 10;
            } else if (shapeType == 75) {
                this.zzXEI = ((Shape) shapeBase).getImageData().isLinkOnly() ? 102 : 100;
                this.zzXEE = 8;
            } else if (shapeType != 201) {
                this.zzXEI = 100;
                this.zzXEE = 2;
            }
        }
        if (shapeBase.isTopLevel()) {
            this.zzXEC = com.aspose.words.internal.zzSA.zzr(shapeBase.getWidth());
            this.zzXEB = com.aspose.words.internal.zzSA.zzr(shapeBase.getHeight());
        } else {
            this.zzXEC = (int) shapeBase.getWidth();
            this.zzXEB = (int) shapeBase.getHeight();
        }
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        this.zzXRJ = (Border) zzyc3ZzYvW.zzPj(EditingLanguage.SPANISH_GUATEMALA);
        this.zzXRI = (Border) zzyc3ZzYvW.zzPj(4107);
        this.zzXRH = (Border) zzyc3ZzYvW.zzPj(EditingLanguage.FRENCH_SWITZERLAND);
        this.zzXRG = (Border) zzyc3ZzYvW.zzPj(4109);
        long jZzZ = zzZ(shapeBase.getSize(), shapeBase.getRotation());
        this.zzXEn = (int) com.aspose.words.internal.zzZKQ.zzZa((((double) Float.intBitsToFloat((int) jZzZ)) / shapeBase.getWidth()) * 1000.0d);
        this.zzXEm = (int) com.aspose.words.internal.zzZKQ.zzZa((((double) com.aspose.words.internal.zzZPW.zzYz(jZzZ)) / shapeBase.getHeight()) * 1000.0d);
    }
}
