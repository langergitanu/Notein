package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFF extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\shplid", "\\shpleft", "\\shpright", "\\shptop", "\\shpbottom", "\\shpbxcolumn", "\\shpbxmargin", "\\shpbxpage", "\\shpbxignore", "\\shpbymargin", "\\shpbypara", "\\shpbypage", "\\shpbyignore", "\\shpz", "\\shpfblwtxt", "\\shpwr", "\\shpwrk", "\\shplockanchor", "\\defshp");
    private zzYFC zzXsh;
    private boolean zzXtD;
    private boolean zzXuN;
    private int zzYbm;
    private ShapeBase zzZBi;
    private int zzZz3;
    private int zzw9;
    private int zzwa;

    public zzYFF(zzYFT zzyft, ShapeBase shapeBase, boolean z) {
        super(zzyft);
        this.zzZBi = shapeBase;
        this.zzXtD = z;
        this.zzwa = 0;
        this.zzw9 = 0;
        this.zzZz3 = 0;
        this.zzYbm = 0;
    }

    private void zzH(zzYET zzyet) throws Exception {
        int iZzC7 = zzYFG.zzC7(zzyet.getName());
        if (iZzC7 != Integer.MIN_VALUE) {
            this.zzZBi.setRelativeHorizontalPosition(iZzC7);
            return;
        }
        int iZzC6 = zzYFG.zzC6(zzyet.getName());
        if (iZzC6 != Integer.MIN_VALUE) {
            this.zzZBi.setRelativeVerticalPosition(iZzC6);
        }
    }

    private void zzYhX() {
        if (this.zzZBi.isTopLevel()) {
            zzZT3.zzZ(this.zzZBi, this.zzwa, this.zzZz3, this.zzw9, this.zzYbm);
        }
        zzYFC zzyfc = this.zzXsh;
        if (zzyfc == null) {
            return;
        }
        zzyfc.zzYfS();
        if (this.zzZBi.isGroup()) {
            this.zzZBi.zzXj(com.aspose.words.internal.zzZPZ.zzZm(this.zzXsh.zzYfH(), this.zzXsh.zzYfG()));
            this.zzZBi.zzXI(com.aspose.words.internal.zzZPX.zzZm(this.zzXsh.zzYfF(), this.zzXsh.zzYfE()));
        }
        if (!this.zzZBi.isTopLevel()) {
            zzZT3.zzY(this.zzZBi, this.zzXsh.zzYfD(), this.zzXsh.zzYfC(), this.zzXsh.zzYfB(), this.zzXsh.zzYfA());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXsh.zzYfy())) {
            if (this.zzXsh.zzYfz()) {
                this.zzZBi.zzYvW().zzQ(4104, this.zzXsh.zzYfy());
            } else {
                this.zzZBi.zzYvW().zzQ(EditingLanguage.GERMAN_LUXEMBOURG, this.zzXsh.zzYfy());
            }
        }
        zzZTF.zzX(this.zzZBi.zzYvW());
        if (!this.zzZBi.isSignatureLine() || this.zzZBi.zzYvW().contains(FieldType.FIELD_CITATION)) {
            return;
        }
        this.zzZBi.setShapeAttr(FieldType.FIELD_CITATION, Boolean.TRUE);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if (this.zzXuN && !this.zzZBi.zzZid()) {
            super.zzT(zzyet);
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                if (!this.zzZBi.zzZid()) {
                    this.zzZBi.setId(zzyet.zzYeT());
                }
                break;
            case 1:
                this.zzwa = zzyet.zzYeT();
                break;
            case 2:
                this.zzZz3 = zzyet.zzYeT();
                break;
            case 3:
                this.zzw9 = zzyet.zzYeT();
                break;
            case 4:
                this.zzYbm = zzyet.zzYeT();
                break;
            case 5:
                this.zzZBi.zzYvW().zzQ(912, 2);
                break;
            case 6:
                this.zzZBi.zzYvW().zzQ(912, 0);
                break;
            case 7:
                this.zzZBi.zzYvW().zzQ(912, 1);
                break;
            case 8:
                this.zzZBi.zzYvW().remove(912);
                break;
            case 9:
                this.zzZBi.zzYvW().zzQ(914, 0);
                break;
            case 10:
                this.zzZBi.zzYvW().zzQ(914, 2);
                break;
            case 11:
                this.zzZBi.zzYvW().zzQ(914, 1);
                break;
            case 12:
                this.zzZBi.zzYvW().remove(914);
                break;
            case 13:
                this.zzZBi.setZOrder(zzyet.zzYeT());
                break;
            case 14:
            case 18:
                break;
            case 15:
                if (this.zzZBi.getWrapType() != 0) {
                    this.zzZBi.setWrapType(zzyet.zzYeT());
                }
                break;
            case 16:
                this.zzZBi.setWrapSide(zzyet.zzYeT());
                break;
            case 17:
                this.zzZBi.setAnchorLocked(true);
                break;
            default:
                zzH(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        if (zzYiN().getType() == 99 && this.zzZBi.zzY9Y() != null) {
            return;
        }
        super.zzY(zzyet);
    }

    public final void zzYfY() {
        this.zzXtD = false;
        zzYiM().zzYhI();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        int type = zzYiN().getType();
        if (type != 89 && type != 90) {
            if (type == 99) {
                zzYiM().zzYhG();
                this.zzXuN = false;
                return;
            } else if (type != 104) {
                super.zzYjb();
                return;
            }
        }
        zzYhX();
        if ((this.zzZBi.zzZid() && zzYiN().getType() == 104) || !this.zzXtD || this.zzZBi == getDocument().getBackgroundShape() || this.zzZBi.zzZtk()) {
            return;
        }
        zzYiM().zzYhI();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (this.zzXw4.zzYgr()) {
            this.zzZBi.zzQT(true);
        }
        if (zzYiN().getType() != 99) {
            super.zzZ(zzyet);
            return;
        }
        zzYiM().zzYhH();
        zzYiQ();
        this.zzXuN = true;
        if (this.zzZBi.zzYvW().contains(EditingLanguage.LULE_SAMI_NORWAY)) {
            return;
        }
        this.zzZBi.setShapeType(1);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        int type = zzyhp.getType();
        if (type != 91) {
            if (type == 92) {
                if (this.zzXsh == null) {
                    this.zzXsh = new zzYFC(this.zzXw4, this.zzZBi);
                }
                return this.zzXsh;
            }
            if (type != 99) {
                if (type != 106) {
                    return super.zzZ(zzyhp);
                }
                if (this.zzZBi.getShapeType() != 202) {
                    return new zzYG7(this.zzXw4, (Shape) this.zzZBi);
                }
                return new zzYG7(this.zzXw4);
            }
        }
        return this;
    }
}
