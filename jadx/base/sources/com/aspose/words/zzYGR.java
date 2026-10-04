package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGR extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\dpx", "\\dpy", "\\dpxsize", "\\dpysize", "\\dodhgt", "\\dplinesolid", "\\dplinedado", "\\dplinedadodo", "\\dplinedash", "\\dplinedot", "\\dpfillpat", "\\dplinecor", "\\dplinecog", "\\dplinecob", "\\dpfillbgcr", "\\dpfillbgcg", "\\dpfillbgcb", "\\dplinew", "\\dplinehollow", "\\dpline", "\\dprect", "\\dproundr", "\\dpellipse", "\\dptxbx");
    private int zzXJi;
    private int zzXJj;
    private int zzXJk;
    private boolean zzXuN;
    private int zzXuO;
    private int zzXuP;
    private int zzXuQ;
    private double zzXuR;
    private double zzXuS;
    private boolean zzXuT;
    private ShapeBase zzZBi;
    private double zzZqb;
    private double zzZqh;

    public zzYGR(zzYFT zzyft, ShapeBase shapeBase) {
        super(zzyft);
        this.zzZBi = shapeBase;
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
        zzYhY();
        this.zzZBi.zzYvW().zzQ(448, com.aspose.words.internal.zzPV.zzS(this.zzXJk, this.zzXJj, this.zzXJi));
        if (this.zzZBi.zzYvW().zzVE(443) && ((Boolean) this.zzZBi.zzYvW().get(443)).booleanValue()) {
            this.zzZBi.zzYvW().zzQ(385, com.aspose.words.internal.zzPV.zzS(this.zzXuQ, this.zzXuP, this.zzXuO));
        }
    }

    private void zzYhY() {
        double d = this.zzXuR;
        if (d < 0.0d) {
            this.zzZBi.setTop(this.zzZqh + d);
            this.zzZBi.zzWe(-this.zzXuR);
            this.zzZBi.zzYvW().zzQ(4096, 2);
        } else {
            this.zzZBi.setTop(this.zzZqh);
            this.zzZBi.zzWe(this.zzXuR);
        }
        double d2 = this.zzXuS;
        if (d2 < 0.0d) {
            this.zzZBi.setLeft(this.zzZqb + d2);
            this.zzZBi.zzWf(-this.zzXuS);
            this.zzZBi.zzYvW().zzQ(4096, 1);
        } else {
            this.zzZBi.setLeft(this.zzZqb);
            this.zzZBi.zzWf(this.zzXuS);
        }
        if (this.zzXuS >= 0.0d || this.zzXuR >= 0.0d) {
            return;
        }
        this.zzZBi.zzYvW().zzQ(4096, 3);
    }

    private void zzYhZ() {
        this.zzZBi.zzYvW().zzQ(443, Boolean.FALSE);
        this.zzZBi.zzYvW().zzQ(954, Boolean.TRUE);
    }

    private void zzYi0() {
        this.zzZBi.zzYvW().zzQ(443, Boolean.FALSE);
        this.zzZBi.zzYvW().zzQ(129, 0);
        this.zzZBi.zzYvW().zzQ(131, 0);
        this.zzZBi.zzYvW().zzQ(130, 0);
        this.zzZBi.zzYvW().zzQ(132, 0);
    }

    private static boolean zzoH(int i) {
        return i <= -24577 || i >= 31682 || (((short) i) & 8192) == 0;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if (this.zzXuN) {
            super.zzT(zzyet);
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                this.zzZqb = ((double) zzyet.zzYeT()) / 20.0d;
                break;
            case 1:
                this.zzZqh = ((double) zzyet.zzYeT()) / 20.0d;
                break;
            case 2:
                this.zzXuS = ((double) zzyet.zzYeT()) / 20.0d;
                break;
            case 3:
                this.zzXuR = ((double) zzyet.zzYeT()) / 20.0d;
                break;
            case 4:
                this.zzZBi.setZOrder(zzyet.zzYeT());
                ShapeBase shapeBase = this.zzZBi;
                shapeBase.setBehindText(zzoH(shapeBase.getZOrder()));
                break;
            case 5:
                this.zzZBi.zzYvW().zzQ(462, 0);
                break;
            case 6:
                this.zzZBi.zzYvW().zzQ(462, 3);
                break;
            case 7:
                this.zzZBi.zzYvW().zzQ(462, 4);
                break;
            case 8:
                this.zzZBi.zzYvW().zzQ(462, 1);
                break;
            case 9:
                this.zzZBi.zzYvW().zzQ(462, 5);
                break;
            case 10:
                this.zzZBi.zzYvW().zzQ(443, Boolean.TRUE);
                break;
            case 11:
                this.zzXJk = zzyet.zzYeT();
                break;
            case 12:
                this.zzXJj = zzyet.zzYeT();
                break;
            case 13:
                this.zzXJi = zzyet.zzYeT();
                break;
            case 14:
                this.zzXuQ = zzyet.zzYeT();
                break;
            case 15:
                this.zzXuP = zzyet.zzYeT();
                break;
            case 16:
                this.zzXuO = zzyet.zzYeT();
                break;
            case 17:
                this.zzZBi.zzYvW().zzQ(459, Integer.valueOf(com.aspose.words.internal.zzSA.zzYC(zzyet.zzYeT())));
                break;
            case 18:
                this.zzZBi.zzYvW().zzQ(508, Boolean.FALSE);
                break;
            case 19:
                this.zzZBi.zzYvW().zzQ(EditingLanguage.LULE_SAMI_NORWAY, 20);
                this.zzXuT = true;
                break;
            case 20:
                this.zzZBi.zzYvW().zzQ(EditingLanguage.LULE_SAMI_NORWAY, 1);
                this.zzXuT = true;
                break;
            case 21:
                this.zzZBi.zzYvW().zzQ(EditingLanguage.LULE_SAMI_NORWAY, 2);
                this.zzXuT = true;
                break;
            case 22:
                this.zzZBi.zzYvW().zzQ(EditingLanguage.LULE_SAMI_NORWAY, 3);
                this.zzXuT = true;
                break;
            case 23:
                this.zzZBi.zzYvW().zzQ(EditingLanguage.LULE_SAMI_NORWAY, 202);
                this.zzXuT = true;
                break;
            default:
                zzH(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        if (zzYiN().getType() == 102 && this.zzZBi.zzY9Y() != null) {
            return;
        }
        super.zzY(zzyet);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        int type = zzYiN().getType();
        if (type != 101) {
            if (type != 102) {
                super.zzYjb();
                return;
            } else {
                zzYiM().zzYhG();
                this.zzXuN = false;
                return;
            }
        }
        if (this.zzZBi.isTopLevel() && this.zzXuT) {
            zzYhX();
        }
        zzYiM().zzYhI();
        if (this.zzXuT) {
            return;
        }
        this.zzZBi.remove();
        this.zzXw4.zzT(1, "Legacy drawing object is not supported.");
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYiN().getType() != 102) {
            zzYhZ();
            return;
        }
        zzYiM().zzYhj().zzYfj();
        zzYiQ();
        zzYi0();
        if (!this.zzZBi.zzYvW().contains(EditingLanguage.LULE_SAMI_NORWAY)) {
            this.zzZBi.setShapeType(202);
        }
        this.zzXuN = true;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        return zzyhp.getType() != 102 ? super.zzZ(zzyhp) : this;
    }
}
