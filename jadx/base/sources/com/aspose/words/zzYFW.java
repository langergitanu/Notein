package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYFW extends zzYHQ {
    private int zzXtA;
    private boolean zzXtB;
    private boolean zzXtC;
    private boolean zzXtD;
    private boolean zzXtE;
    private int zzXtF;
    private int zzXtG;
    private int zzXtH;
    private int zzXtI;
    private int zzXtJ;
    private int zzXtp;
    private int zzXtq;
    private boolean zzXtr;
    private int zzXts;
    private int zzXtt;
    private int zzXtu;
    private int zzXtv;
    private int zzXtw;
    private int zzXtx;
    private int zzXty;
    private int zzXtz;
    private zzYI1 zzXvo;
    private Shape zzZ2R;
    private static int[] zzXto = {9};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\bin", "\\picw", "\\pich", "\\picwgoal", "\\picwGoal", "\\pichgoal", "\\pichGoal", "\\picscalex", "\\picscaley", "\\piccropl", "\\piccropr", "\\piccropt", "\\piccropb", "\\bliptag", "\\brdrl", "\\brdrr", "\\brdrt", "\\brdrb", "\\box", "\\wbitmap", "\\wbmbitspixel", "\\wbmplanes", "\\wbmwidthbytes");

    public zzYFW(zzYFT zzyft, Shape shape, int i) {
        super(zzyft);
        this.zzZ2R = shape;
        this.zzXtF = i;
        this.zzXtE = false;
        this.zzXvo = new zzYI1(zzyft);
        this.zzXtr = false;
        this.zzXtC = true;
    }

    private void setImageBytes(byte[] bArr) throws Exception {
        byte[] bArrZzyO;
        if (bArr.length == 0) {
            return;
        }
        int iZzZU = com.aspose.words.internal.zzEF.zzZU(bArr);
        this.zzXtq = iZzZU;
        if (iZzZU == 46) {
            bArr = zzZ8K.zzq(bArr, zzZ8K.zzY6(bArr) - 1);
        }
        byte[] bArrZzZz = bArr;
        if (this.zzXtB) {
            double d = 56692.913385826774d / ((double) this.zzXtv);
            int i = this.zzXtx;
            int i2 = (int) (d * ((double) i));
            double d2 = 56692.913385826774d / ((double) this.zzXtu);
            int i3 = this.zzXtw;
            bArrZzZz = com.aspose.words.internal.zzEF.zzZ(i, i3, i2, (int) (d2 * ((double) i3)), this.zzXtz, this.zzXtA, this.zzXty, bArrZzZz);
            if (bArrZzZz == null) {
                return;
            }
        } else if (zzXN(bArrZzZz)) {
            bArrZzZz = com.aspose.words.internal.zzEF.zzZz(bArrZzZz);
        } else if ((com.aspose.words.internal.zzEF.zzZI(bArrZzZz) || com.aspose.words.internal.zzEF.zzZF(bArrZzZz)) && (bArrZzyO = new com.aspose.words.internal.zz8T(bArrZzZz).zzyO()) != null) {
            this.zzXtr = true;
            bArrZzZz = bArrZzyO;
        }
        if (com.aspose.words.internal.zzEF.zzZK(bArrZzZz)) {
            bArrZzZz = com.aspose.words.internal.zzEF.zzZ(bArrZzZz, zzYgN());
        }
        if (!this.zzXtE) {
            this.zzZ2R.zzYvW().zzQ(this.zzXtF, bArrZzZz);
        } else {
            if (this.zzZ2R.isWordArt()) {
                return;
            }
            this.zzXtC = this.zzZ2R.getImageData().zzY7(bArrZzZz);
        }
    }

    private long zzVY(int i, int i2) throws Exception {
        double widthPoints = ((double) i) / 20.0d;
        double heightPoints = ((double) i2) / 20.0d;
        if (this.zzXtq == 3) {
            if (widthPoints > 1638.0d || heightPoints > 1638.0d) {
                widthPoints = ShapeBase.zzXn6;
                heightPoints = widthPoints;
            }
        } else if (this.zzXtv <= 0 || this.zzXtu <= 0) {
            while (true) {
                if (widthPoints <= 1638.0d && heightPoints <= 1638.0d) {
                    break;
                }
                widthPoints /= 2.0d;
                heightPoints /= 2.0d;
            }
        } else {
            if (heightPoints > 1638.0d) {
                heightPoints = this.zzZ2R.getImageData().getImageSize().getHeightPoints();
            }
            while (heightPoints > 1638.0d) {
                heightPoints /= 2.0d;
            }
            if (widthPoints > 1638.0d) {
                widthPoints = this.zzZ2R.getImageData().getImageSize().getWidthPoints();
            }
            while (widthPoints > 1638.0d) {
                widthPoints /= 2.0d;
            }
        }
        return com.aspose.words.internal.zzZPW.zzG((float) ((widthPoints * ((double) this.zzXtt)) / 100.0d), (float) ((heightPoints * ((double) this.zzXts)) / 100.0d));
    }

    private boolean zzXN(byte[] bArr) throws Exception {
        return this.zzXw4.zzYgi().getConvertMetafilesToPng() && com.aspose.words.internal.zzEF.zzZH(bArr);
    }

    private com.aspose.words.internal.zzEG zzYgN() {
        return (this.zzXtt > 100 || this.zzXts > 100) ? com.aspose.words.internal.zzEG.zzX(this.zzXtx, this.zzXtw, 2540.0d) : com.aspose.words.internal.zzEG.zzX(com.aspose.words.internal.zzSA.zzv(((double) this.zzXtx) / 100.0d), com.aspose.words.internal.zzSA.zzv(((double) this.zzXtw) / 100.0d), 96.0d);
    }

    private void zzYgO() throws Exception {
        if (this.zzZ2R.zzZjT()) {
            ImageSize imageSize = this.zzZ2R.getImageData().getImageSize();
            if (imageSize.isValid()) {
                int iZzDO = this.zzXtv;
                if (iZzDO == 0) {
                    iZzDO = imageSize.zzDO();
                }
                int iZzDN = this.zzXtu;
                if (iZzDN == 0) {
                    iZzDN = imageSize.zzDN();
                }
                if (this.zzXtJ != 0) {
                    this.zzZ2R.zzYvW().zzQ(StyleIdentifier.COLORFUL_LIST_ACCENT_6, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(((double) this.zzXtJ) / ((double) iZzDO))));
                }
                if (this.zzXtI != 0) {
                    this.zzZ2R.zzYvW().zzQ(StyleIdentifier.COLORFUL_GRID_ACCENT_6, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(((double) this.zzXtI) / ((double) iZzDO))));
                }
                if (this.zzXtH != 0) {
                    this.zzZ2R.zzYvW().zzQ(256, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(((double) this.zzXtH) / ((double) iZzDN))));
                }
                if (this.zzXtG != 0) {
                    this.zzZ2R.zzYvW().zzQ(257, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(((double) this.zzXtG) / ((double) iZzDN))));
                }
            }
        }
    }

    private boolean zzYgP() throws Exception {
        if (this.zzXtx <= 0 || this.zzXtw <= 0 || !this.zzZ2R.zzZjT()) {
            return false;
        }
        boolean z = false;
        for (int i : zzXto) {
            if (this.zzXtq == i) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzYgQ() throws Exception {
        int iZzDN;
        int iZzw = this.zzXtv;
        if (iZzw <= 0 || (iZzDN = this.zzXtu) <= 0) {
            if (zzYgP()) {
                iZzw = com.aspose.words.internal.zzSA.zzw(((double) this.zzXtx) / 100.0d);
                iZzDN = com.aspose.words.internal.zzSA.zzw(((double) this.zzXtw) / 100.0d);
            } else if (this.zzZ2R.zzZjT()) {
                ImageSize imageSize = this.zzZ2R.getImageData().getImageSize();
                if (imageSize.zzDO() <= 0 || imageSize.zzDN() <= 0) {
                    iZzw = 0;
                    iZzDN = 0;
                } else {
                    int iZzDO = imageSize.zzDO();
                    iZzDN = imageSize.zzDN();
                    iZzw = iZzDO;
                }
            }
        }
        if (zzYgR()) {
            if (this.zzXtt <= 0) {
                this.zzXtt = 100;
            }
            if (this.zzXts <= 0) {
                this.zzXts = 100;
            }
        }
        long jZzVY = zzVY((iZzw - this.zzXtJ) - this.zzXtI, (iZzDN - this.zzXtH) - this.zzXtG);
        if (this.zzZ2R.isTopLevel()) {
            jZzVY = zzYLS.zzZ(jZzVY, this.zzZ2R.getRotation());
        }
        this.zzZ2R.zzWf(Float.intBitsToFloat((int) jZzVY));
        this.zzZ2R.zzWe(com.aspose.words.internal.zzZPW.zzYz(jZzVY));
        this.zzZ2R.zzYa3();
    }

    private boolean zzYgR() {
        if (!this.zzXtr) {
            return true;
        }
        if (this.zzXtv <= 0 || this.zzXtu <= 0) {
            return this.zzXtx > 0 && this.zzXtw > 0;
        }
        return true;
    }

    private void zzoo(int i) {
        if (i <= 0 || i >= 255) {
            this.zzZ2R.zzYvW().zzQ(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA, 255);
        } else {
            this.zzZ2R.zzYvW().zzQ(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA, Integer.valueOf(i));
        }
    }

    public final Shape getShape() {
        return this.zzZ2R;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        ImageData imageData = this.zzZ2R.getImageData();
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                setImageBytes(zzyet.zzYf1());
                return;
            case 1:
                this.zzXtx = zzyet.zzYeT();
                return;
            case 2:
                this.zzXtw = zzyet.zzYeT();
                return;
            case 3:
            case 4:
                this.zzXtv = zzyet.zzYeT();
                return;
            case 5:
            case 6:
                this.zzXtu = zzyet.zzYeT();
                return;
            case 7:
                this.zzXtt = zzyet.zzYeT();
                return;
            case 8:
                this.zzXts = zzyet.zzYeT();
                return;
            case 9:
                this.zzXtJ = zzyet.zzYeT();
                return;
            case 10:
                this.zzXtI = zzyet.zzYeT();
                return;
            case 11:
                this.zzXtH = zzyet.zzYeT();
                return;
            case 12:
                this.zzXtG = zzyet.zzYeT();
                return;
            case 13:
                zzoo(zzyet.zzYeT());
                return;
            case 14:
                this.zzXw4.zzYgn().clear();
                this.zzXw4.zzYgn().add(imageData.getBorders().getByBorderType(1));
                return;
            case 15:
                this.zzXw4.zzYgn().clear();
                this.zzXw4.zzYgn().add(imageData.getBorders().getByBorderType(2));
                return;
            case 16:
                this.zzXw4.zzYgn().clear();
                this.zzXw4.zzYgn().add(imageData.getBorders().getByBorderType(3));
                return;
            case 17:
                this.zzXw4.zzYgn().clear();
                this.zzXw4.zzYgn().add(imageData.getBorders().getByBorderType(0));
                return;
            case 18:
                this.zzXw4.zzYgn().clear();
                this.zzXw4.zzYgn().add(imageData.getBorders().getByBorderType(1));
                this.zzXw4.zzYgn().add(imageData.getBorders().getByBorderType(2));
                this.zzXw4.zzYgn().add(imageData.getBorders().getByBorderType(3));
                this.zzXw4.zzYgn().add(imageData.getBorders().getByBorderType(0));
                return;
            case 19:
                if (zzyet.zzYeT() != 0) {
                    throw new IllegalStateException("Don't know how to handle bitmap type other than 0 here.");
                }
                this.zzXtB = true;
                return;
            case 20:
                this.zzXtA = zzyet.zzYeT();
                return;
            case 21:
                this.zzXtz = zzyet.zzYeT();
                return;
            case 22:
                this.zzXty = zzyet.zzYeT();
                return;
            default:
                if (this.zzXvo.zzX(zzyet)) {
                    return;
                }
                zzO(zzyet);
                return;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        if (zzYiN().getType() != 103) {
            return;
        }
        byte[] bArrZzYeZ = zzyet.zzYeZ();
        if (bArrZzYeZ.length != 0 || zzyet.zz0R() <= 0) {
            setImageBytes(bArrZzYeZ);
            return;
        }
        String strZzf = com.aspose.words.internal.zzZYD.zzf(zzyet.zzYR(), " ");
        Run run = com.aspose.words.internal.zzZYD.zzXk(strZzf) ? new Run(this.zzXw4.getDocument(), strZzf, (zzYEF) this.zzZ2R.zzZYh().zzbn()) : null;
        if (run != null && this.zzZ2R.isTopLevel() && this.zzZ2R.isInline()) {
            this.zzZ2R.zzYC(run);
        }
    }

    public final boolean zzYgM() {
        return !this.zzXtC;
    }

    @Override // com.aspose.words.zzYHQ
    public final boolean zzYiX() {
        return true;
    }

    @Override // com.aspose.words.zzYHQ
    public void zzYjb() throws Exception {
        if (zzYiN().getType() == 103 && this.zzXtE) {
            int i = this.zzXtp;
            if (i > 0) {
                this.zzXtp = i - 1;
                return;
            }
            zzYgQ();
            zzYgO();
            if (this.zzXtD) {
                zzYiM().zzYhI();
            }
            this.zzXtC = true;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type == 92) {
            return new zzYFA(this.zzXw4);
        }
        if (type == 100) {
            return this;
        }
        if (type != 103) {
            if (type != 104) {
                return null;
            }
            return this.zzXw4.zzYgo().zzYih().zzYiN().getType() == 94 ? new zzYFF(this.zzXw4, this.zzZ2R, false) : new zzYFF(this.zzXw4, this.zzZ2R, !this.zzXtD);
        }
        if (zzYiL().zzYiN().getType() != 100) {
            return null;
        }
        this.zzXtp++;
        return this;
    }

    public zzYFW(zzYFT zzyft, Shape shape) {
        this(zzyft, shape, false);
    }

    public zzYFW(zzYFT zzyft, Shape shape, boolean z) {
        super(zzyft);
        this.zzZ2R = shape;
        this.zzXtD = z;
        this.zzXtE = true;
        this.zzXvo = new zzYI1(zzyft);
        this.zzXtC = true;
    }
}
