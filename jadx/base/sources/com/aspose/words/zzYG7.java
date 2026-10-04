package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYG7 extends zzYHS implements zzZ9H {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\objocx", "\\objlink", "\\objautlink", "\\objw", "\\objh", "\\rsltbmp", "\\rslttxt", "\\rslthtml", "\\rsltrtf", "\\rsltpict", "\\objsetsize", "\\objalign", "\\objtransy", "\\objcropt", "\\objcropb", "\\objcropl", "\\objcropr", "\\objscalex", "\\objscaley", "\\rsltmerge");
    private boolean zzXu4;
    private boolean zzXu5;
    private zzYFN zzXw5;
    private Shape zzZ2R;

    public zzYG7(zzYFT zzyft) {
        super(zzyft);
        this.zzXu5 = true;
        this.zzXw5 = new zzYFN(zzyft, this);
    }

    private boolean zzG(zzYET zzyet) throws Exception {
        return this.zzXw5.zzX(zzyet);
    }

    private void zzYgZ() {
        if (zzYiN().getType() == 109 && this.zzZ2R.getOleFormat().zzZf9() == 0 && this.zzXu5) {
            zzYiM().zzYhI();
        }
    }

    private boolean zzYh0() {
        return this.zzXu4 || this.zzZ2R.getOleFormat() != null;
    }

    private void zzYh1() {
        this.zzZ2R.setShapeType(75);
        this.zzZ2R.zzYvW().remove(4116);
        this.zzZ2R.zzYvW().remove(4119);
        this.zzZ2R.zzYvW().remove(826);
        this.zzZ2R.zzYvW().remove(4118);
        this.zzZ2R.zzYvW().remove(4112);
        this.zzZ2R.zzYvW().remove(4114);
        this.zzZ2R.zzYvW().remove(4115);
        this.zzZ2R.zzYvW().remove(StyleIdentifier.PLAIN_TABLE_1);
    }

    private void zzYh2() throws Exception {
        if (this.zzZ2R.getOleFormat().isLink() || this.zzZ2R.getOleFormat().zzYrB() != null) {
            return;
        }
        zzYh1();
    }

    private void zzYh3() throws Exception {
        this.zzXu4 = false;
        int iZzZf9 = this.zzZ2R.getOleFormat().zzZf9();
        if (iZzZf9 == 0 || iZzZf9 == 1) {
            if (this.zzXu5 && (zzYiM().getContainer() instanceof ShapeBase)) {
                zzYiM().zzYhI();
                return;
            }
            return;
        }
        if (iZzZf9 != 2 && iZzZf9 != 3 && iZzZf9 != 4) {
            throw zzoC(this.zzZ2R.getOleFormat().zzZf9());
        }
        zzYiM().zzYhK();
    }

    private void zzYh4() throws Exception {
        this.zzXu4 = true;
        if (this.zzZ2R.getOleFormat().isLink() && !this.zzZ2R.zzYvW().contains(4118)) {
            this.zzZ2R.getOleFormat().zzqX(3);
        }
        int iZzZf9 = this.zzZ2R.getOleFormat().zzZf9();
        if (iZzZf9 == 0 || iZzZf9 == 1) {
            if (this.zzXu5) {
                zzYiM().zzZ4(this.zzZ2R);
            }
        } else {
            if (iZzZf9 != 2 && iZzZf9 != 3 && iZzZf9 != 4) {
                throw zzoC(this.zzZ2R.getOleFormat().zzZf9());
            }
            zzYiM().zzYhL();
            zzYiM().zzWI(new Run(getDocument(), com.aspose.words.internal.zzZKN.format("{0} ", zzZQU.zzW(this.zzZ2R.getOleFormat()).replace("\"", "")), zzYiL().zzYir()));
            zzYiM().zzZ((zzYOC) this.zzZ2R.getOleFormat().zzYrB());
        }
    }

    private void zzYh5() {
        if (this.zzXu5) {
            Shape shape = new Shape(getDocument());
            this.zzZ2R = shape;
            shape.setWrapType(0);
        }
        if (this.zzZ2R.zzZid()) {
            return;
        }
        this.zzZ2R.setShapeType(-2);
    }

    private void zzd(zzYET zzyet) throws Exception {
        zzZ4S zzz4sZzR;
        zzYOF zzyofZzj = zzYOF.zzj(new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(zzyet.zzYeZ()), com.aspose.words.internal.zzZO0.zzhX()));
        if (zzyofZzj == null) {
            return;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZ2R.getOleFormat().getProgId())) {
            this.zzZ2R.getOleFormat().setProgId(zzyofZzj.getClassName());
        }
        if (zzyofZzj.zzYrF() == 2) {
            zzYOG zzyog = (zzYOG) zzyofZzj;
            this.zzZ2R.getOleFormat().setSourceFullName(zzyog.zzYPo());
            this.zzZ2R.getOleFormat().setSourceItem(zzyog.zzYPn());
            return;
        }
        byte[] bArrZzYrG = ((zzYOH) zzyofZzj).zzYrG();
        com.aspose.words.internal.zzAA zzaaZzIf = com.aspose.words.internal.zzKD.zzQ(bArrZzYrG, 4) ? new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOR(bArrZzYrG)).zzIf() : zzYO6.zzS(this.zzZ2R.getOleFormat().getProgId(), bArrZzYrG);
        this.zzZ2R.getOleFormat().zzY(new zzYOC(this.zzXw4.zzYgx(), zzaaZzIf));
        if (!this.zzZ2R.getOleFormat().isLink() || (zzz4sZzR = zzZ4S.zzR(zzaaZzIf)) == null) {
            return;
        }
        this.zzZ2R.getOleFormat().setSourceFullName(zzz4sZzR.zzYPo());
        this.zzZ2R.getOleFormat().setSourceItem(zzz4sZzR.zzYPn());
    }

    private static IllegalStateException zzoC(int i) {
        return new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected OleLinkType value {0}.", i != 2 ? i != 5 ? "Default" : "Unicode" : "Html"));
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                this.zzZ2R.setShapeType(201);
                break;
            case 1:
                this.zzZ2R.getOleFormat().setSourceFullName(" ");
                break;
            case 2:
                this.zzZ2R.getOleFormat().setSourceFullName(" ");
                this.zzZ2R.getOleFormat().setAutoUpdate(true);
                break;
            case 3:
                this.zzZ2R.zzWf(((double) zzyet.zzYeT()) / 20.0d);
                break;
            case 4:
                this.zzZ2R.zzWe(((double) zzyet.zzYeT()) / 20.0d);
                break;
            case 5:
                this.zzZ2R.getOleFormat().zzqX(1);
                break;
            case 6:
                this.zzZ2R.getOleFormat().zzqX(4);
                break;
            case 7:
                this.zzZ2R.getOleFormat().zzqX(2);
                break;
            case 8:
                this.zzZ2R.getOleFormat().zzqX(3);
                break;
            case 9:
                this.zzZ2R.getOleFormat().zzqX(0);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                this.zzXw4.zzC0(zzyet.getName());
                break;
            default:
                if (zzYh0() && !zzG(zzyet)) {
                    super.zzT(zzyet);
                    break;
                }
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 107) {
            this.zzZ2R.getOleFormat().setProgId(zzyet.zzYR());
            return;
        }
        if (type == 108) {
            zzd(zzyet);
            return;
        }
        switch (type) {
            case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
            case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
            case StyleIdentifier.BOOK_TITLE /* 264 */:
                this.zzXw4.zzC0(zzYiN().getName());
                break;
            default:
                if (zzYh0()) {
                    zzYgZ();
                    super.zzY(zzyet);
                }
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        int type = zzYiN().getType();
        if (type == 106) {
            zzYh2();
        } else if (type != 109) {
            super.zzYjb();
        } else {
            zzYh3();
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 106) {
            zzYh5();
        } else if (type != 109) {
            super.zzZ(zzyet);
        } else {
            zzYh4();
        }
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYEF zzZYh() {
        return this.zzZ2R.zzZYh();
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYMX zzZYj() {
        return null;
    }

    public zzYG7(zzYFT zzyft, Shape shape) {
        super(zzyft);
        this.zzZ2R = shape;
        this.zzXu5 = false;
        this.zzXw5 = new zzYFN(zzyft, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[RETURN] */
    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        int type = zzyhp.getType();
        if (type != 103) {
            switch (type) {
                case 107:
                case 109:
                    return this;
                case 108:
                    if (zzYiN().getType() != 106) {
                        return null;
                    }
                    break;
                default:
                    switch (type) {
                        case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                        case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                        case StyleIdentifier.BOOK_TITLE /* 264 */:
                            break;
                        default:
                            return super.zzZ(zzyhp);
                    }
                    break;
            }
        } else {
            return new zzYFW(this.zzXw4, this.zzZ2R);
        }
    }
}
