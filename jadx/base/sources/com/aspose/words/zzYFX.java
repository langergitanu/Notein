package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFX {
    private com.aspose.words.internal.zzEG zzM;
    private byte[] zzP;
    private int zzXtG;
    private int zzXtH;
    private int zzXtI;
    private int zzXtJ;
    private int zzXtK;
    private int zzXtL;
    private boolean zzXtM;
    private zzYEM zzXwl;
    private ShapeBase zzZBi;
    private BorderCollection zzZCb;
    private int zzwi;

    private zzYFX(zzYEM zzyem) {
        this.zzXwl = zzyem;
    }

    private void zzA(int i, int i2, int i3, int i4) throws Exception {
        zzYHZ zzyhzZzYfW = this.zzXwl.zzYfW();
        zzyhzZzYfW.zzZ5("\\picw", zzoq(i));
        zzyhzZzYfW.zzZ5("\\pich", zzoq(i2));
        zzyhzZzYfW.zzZ5("\\picwgoal", i);
        zzyhzZzYfW.zzZ5("\\pichgoal", i2);
        zzyhzZzYfW.zzZ5("\\picscalex", i3);
        zzyhzZzYfW.zzZ5("\\picscaley", i4);
    }

    private void zzB(int i, int i2, int i3, int i4) throws Exception {
        zzYHZ zzyhzZzYfW = this.zzXwl.zzYfW();
        zzyhzZzYfW.zzZ5("\\piccropl", i);
        zzyhzZzYfW.zzZ5("\\piccropr", i2);
        zzyhzZzYfW.zzZ5("\\piccropt", i3);
        zzyhzZzYfW.zzZ5("\\piccropb", i4);
    }

    private static int zzXO(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    private void zzXP(byte[] bArr) throws Exception {
        this.zzP = bArr;
        this.zzwi = com.aspose.words.internal.zzEF.zzZU(bArr);
        this.zzM = com.aspose.words.internal.zzEF.zzZT(this.zzP);
    }

    private boolean zzXn(long j) {
        int i;
        int i2;
        return this.zzwi == 2 || (i = (int) j) > 6553 || (i2 = (int) (j >>> 32)) > 6553 || i < 10 || i2 < 10;
    }

    private void zzYgS() throws Exception {
        zzl(1, "\\brdrl");
        zzl(2, "\\brdrr");
        zzl(3, "\\brdrt");
        zzl(0, "\\brdrb");
    }

    private void zzYgT() throws Exception {
        int i = this.zzwi;
        if (i == 5 || i == 6 || i == 8 || i == 9 || i == 11) {
            com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(this.zzP);
            try {
                com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
                zzxn.zzZ(zzzor, 7);
                this.zzP = zzzor.zzWy();
                this.zzwi = 7;
            } finally {
                zzxn.dispose();
            }
        }
    }

    public static zzYFX zzZ(zzYEM zzyem, ShapeBase shapeBase) throws Exception {
        zzYFX zzyfx = new zzYFX(zzyem, shapeBase);
        zzyfx.zzXtM = true;
        int i = zzyfx.zzXtK;
        zzyfx.zzXtH = -i;
        zzyfx.zzXtG = i;
        return zzyfx;
    }

    private void zzf(double d, double d2) throws Exception {
        zzB(com.aspose.words.internal.zzAN.zzZG(((double) this.zzXtJ) * d), com.aspose.words.internal.zzAN.zzZG(d * ((double) this.zzXtI)), com.aspose.words.internal.zzAN.zzZG(((double) this.zzXtH) * d2), com.aspose.words.internal.zzAN.zzZG(d2 * ((double) this.zzXtG)));
    }

    private void zzg(double d, double d2) throws Exception {
        zzA(com.aspose.words.internal.zzAN.zzZG(((double) this.zzM.zzDO()) * d), com.aspose.words.internal.zzAN.zzZG(((double) this.zzM.zzDN()) * d2), 100, 100);
        zzf(d, d2);
    }

    private void zzl(int i, String str) throws Exception {
        Border byBorderType = this.zzZCb.getByBorderType(i);
        if (byBorderType.isVisible()) {
            this.zzXwl.zzYfW().zzCD(str);
            zzYI0.zzY(this.zzXwl, byBorderType);
        }
    }

    private void zzop(int i) throws Exception {
        if (i == 2) {
            this.zzXwl.zzYfW().zzCD("\\emfblip");
            return;
        }
        if (i == 3) {
            this.zzXwl.zzYfW().zzCD("\\wmetafile8");
            return;
        }
        if (i == 4) {
            this.zzXwl.zzYfW().zzCD("\\macpict");
        } else if (i == 5) {
            this.zzXwl.zzYfW().zzCD("\\jpegblip");
        } else {
            if (i != 6) {
                return;
            }
            this.zzXwl.zzYfW().zzCD("\\pngblip");
        }
    }

    private static int zzoq(int i) {
        return com.aspose.words.internal.zzAN.zzZG((((double) i) / 56.69291338582678d) * 100.0d);
    }

    public final void zzX(boolean z, boolean z2, int i) throws Exception {
        zzYHZ zzyhzZzYfW = this.zzXwl.zzYfW();
        zzyhzZzYfW.zzCC("\\pict");
        boolean z3 = false;
        if (z && this.zzZBi != null) {
            zzyhzZzYfW.zzCC("\\*\\picprop");
            zzYFD zzyfd = new zzYFD(this.zzXwl);
            if (this.zzXtM) {
                zzyfd.zzZ2(this.zzZBi);
            } else {
                zzyfd.zzW(this.zzZBi, false);
            }
            zzyhzZzYfW.zzYj3();
        }
        if (z2) {
            zzYgT();
        }
        if (this.zzwi == 7) {
            this.zzP = com.aspose.words.internal.zzEF.zzZv(this.zzP);
            this.zzwi = 3;
        }
        if (this.zzZCb != null) {
            zzYgS();
        }
        ShapeBase shapeBase = this.zzZBi;
        if (shapeBase != null && shapeBase.isWordArt()) {
            z3 = true;
        }
        zzyhzZzYfW.zz7("\\defshp", z3);
        if (this.zzP != null) {
            zzop(this.zzwi);
            int iZzDO = this.zzM.zzDO() > 0 ? this.zzM.zzDO() : this.zzXtL;
            int iZzDN = this.zzM.zzDN() > 0 ? this.zzM.zzDN() : this.zzXtK;
            if (zzXn(zzZ(iZzDO, iZzDN, this.zzXtJ, this.zzXtI, this.zzXtH, this.zzXtG))) {
                zzg(((double) this.zzXtL) / ((double) ((iZzDO - this.zzXtJ) - this.zzXtI)), ((double) this.zzXtK) / ((double) ((iZzDN - this.zzXtH) - this.zzXtG)));
            } else {
                int i2 = this.zzXtJ;
                int i3 = this.zzXtI;
                int i4 = this.zzXtH;
                int i5 = this.zzXtG;
                while (true) {
                    if (iZzDO <= 31680 && iZzDN <= 31680) {
                        break;
                    }
                    iZzDO /= 2;
                    iZzDN /= 2;
                    i2 /= 2;
                    i3 /= 2;
                    i4 /= 2;
                    i5 /= 2;
                }
                long jZzZ = zzZ(iZzDO, iZzDN, i2, i3, i4, i5);
                zzA(iZzDO, iZzDN, (int) jZzZ, (int) (jZzZ >>> 32));
                zzB(i2, i3, i4, i5);
            }
            byte[] bArrZzWw = com.aspose.words.internal.zzIL.zz3(this.zzP).zzWw();
            zzyhzZzYfW.zzZ5("\\bliptag", i != 255 ? i : zzXO(bArrZzWw));
            if (this.zzwi == 3) {
                zzyhzZzYfW.zzZ5("\\blipupi", (int) this.zzM.getHorizontalResolution());
            }
            zzyhzZzYfW.zzCC("\\*\\blipuid");
            zzyhzZzYfW.zzXQ(bArrZzWw);
            zzyhzZzYfW.zzYj3();
            zzyhzZzYfW.zzXQ(com.aspose.words.internal.zzEF.zzZw(this.zzP));
        } else if (this.zzXtL <= 0 || this.zzXtK <= 0) {
            zzop(5);
        } else {
            zzop(3);
            zzyhzZzYfW.zzZ5("\\picwgoal", this.zzXtL);
            zzyhzZzYfW.zzZ5("\\pichgoal", this.zzXtK);
            zzyhzZzYfW.zzXQ(com.aspose.words.internal.zzEF.zz7(this.zzXtL, this.zzXtK));
        }
        zzyhzZzYfW.zzYj3();
    }

    public zzYFX(zzYEM zzyem, ShapeBase shapeBase) throws Exception {
        this(zzyem);
        this.zzZBi = shapeBase;
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (shape != null && shape.zzZjT()) {
            ImageData imageData = shape.getImageData();
            zzXP(imageData.getImageBytes());
            this.zzZCb = imageData.getBorders();
            this.zzXtJ = com.aspose.words.internal.zzAN.zzZG(imageData.getCropLeft() * ((double) this.zzM.zzDO()));
            this.zzXtI = com.aspose.words.internal.zzAN.zzZG(imageData.getCropRight() * ((double) this.zzM.zzDO()));
            this.zzXtH = com.aspose.words.internal.zzAN.zzZG(imageData.getCropTop() * ((double) this.zzM.zzDN()));
            this.zzXtG = com.aspose.words.internal.zzAN.zzZG(imageData.getCropBottom() * ((double) this.zzM.zzDN()));
        }
        long size = this.zzZBi.zzYzG().getSize();
        this.zzXtL = com.aspose.words.internal.zzSA.zzr(Float.intBitsToFloat((int) size));
        this.zzXtK = com.aspose.words.internal.zzSA.zzr(com.aspose.words.internal.zzZPW.zzYz(size));
    }

    private long zzZ(double d, double d2, int i, int i2, int i3, int i4) {
        return com.aspose.words.internal.zzZPX.zzZm(com.aspose.words.internal.zzAN.zzZG((((double) this.zzXtL) / ((d - ((double) i)) - ((double) i2))) * 100.0d), com.aspose.words.internal.zzAN.zzZG((((double) this.zzXtK) / ((d2 - ((double) i3)) - ((double) i4))) * 100.0d));
    }

    public zzYFX(zzYEM zzyem, byte[] bArr) throws Exception {
        this(zzyem);
        zzXP(bArr);
        this.zzXtL = this.zzM.zzDO();
        this.zzXtK = this.zzM.zzDN();
    }
}
