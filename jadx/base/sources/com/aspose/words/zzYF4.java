package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF4 extends zzYHQ implements zzZ9H {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\sbasedon", "\\snext", "\\slink", "\\sautoupd", "\\shidden", "\\ssemihidden", "\\sqformat", "\\spriority", "\\sunhideused", "\\slocked", "\\spersonal", "\\scompose", "\\sreply", "\\styrsid");
    private zzYU8 zzXrN;
    private com.aspose.words.internal.zzIM<Integer> zzXrO;
    private int zzXrP;
    private zzYU7 zzXrQ;
    private zzYI1 zzXvo;
    private zzYEZ zzXvp;
    private zzYHX zzXvq;
    private zzYG4 zzXvr;
    private zzYFN zzXw5;
    private Style zzYDw;

    public zzYF4(zzYFT zzyft) {
        super(zzyft);
        this.zzXrO = new com.aspose.words.internal.zzIM<>();
        this.zzXw5 = new zzYFN(zzyft, this);
        this.zzXvr = new zzYG4(zzyft, this);
        this.zzXvq = new zzYHX(zzyft);
        this.zzXvp = new zzYEZ(zzyft);
        this.zzXvo = new zzYI1(zzyft);
        this.zzXrQ = new zzYU7();
    }

    private void zz3(zzYET zzyet) throws Exception {
        if (this.zzXvr.zzX(zzyet) || this.zzXw5.zzX(zzyet) || this.zzXvp.zzX(zzyet)) {
            return;
        }
        if (zzYHY.zzCz(zzyet.getName()) != Integer.MIN_VALUE) {
            zzO(zzyet);
        } else {
            if (this.zzXvq.zzX(zzyet) || this.zzXvo.zzX(zzyet)) {
                return;
            }
            zzO(zzyet);
        }
    }

    private void zzS(String str, String[] strArr) {
        if (com.aspose.words.internal.zzZYD.zzXk(str) && this.zzYDw != null) {
            Style styleZz0 = getDocument().getStyles().zz0(str, false);
            if (styleZz0 != null && zzYfp() == 0 && styleZz0.getStyleIdentifier() != 4094) {
                int iZzZ7j = styleZz0.zzZ7j();
                getDocument().getStyles().zzs(styleZz0);
                this.zzYDw.zzZc(iZzZ7j, false);
            }
            zzYEO.zzG(this.zzYDw.zzZYj());
            zzZNS.zzZ(this.zzYDw.zzZYj());
            this.zzYDw.zzZYh().remove(400);
            if (zzYfp() == 0) {
                if (!this.zzXrO.contains(Integer.valueOf(this.zzXrP)) && getDocument().getStyles().zzY2Z()) {
                    zzYUC.zzZ(str, getDocument().getStyles(), false, true, false, this.zzYDw);
                    this.zzXw4.zzH(Integer.valueOf(this.zzXrP), this.zzYDw.zzZ7j());
                    getDocument().getStyles().zzZ(this.zzYDw, strArr);
                    this.zzXrO.add(Integer.valueOf(this.zzXrP));
                    com.aspose.words.internal.zzZQG.zzZ(this.zzXrQ, this.zzXrN);
                    this.zzXrN = null;
                }
            } else if (zzYfq() != null && styleZz0 != null && styleZz0.getType() == 3) {
                zzZ(zzYfq(), (TableStyle) styleZz0);
            }
            this.zzYDw = null;
        }
    }

    private void zzVV(int i, int i2) {
        this.zzXrP = i2;
        Style styleZzl6 = Style.zzl6(i);
        this.zzYDw = styleZzl6;
        styleZzl6.setPriority(99);
        this.zzXrN = new zzYU8(this.zzYDw);
    }

    private int zzYfp() {
        if (zzYfq() != null) {
            return this.zzXvp.zzYfp();
        }
        return 0;
    }

    public final zzWP zz6G() {
        if (zzYfq() != null) {
            return zzYfq().zz6G();
        }
        return null;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if (this.zzYDw == null) {
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                this.zzXrN.zzXSz = Integer.valueOf(zzyet.zzYeT());
                break;
            case 1:
                this.zzXrN.zzXSy = Integer.valueOf(zzyet.zzYeT());
                break;
            case 2:
                this.zzXrN.zzXSx = Integer.valueOf(zzyet.zzYeT());
                break;
            case 3:
                this.zzYDw.setAutomaticallyUpdate(true);
                break;
            case 4:
                this.zzYDw.setHidden(true);
                break;
            case 5:
                this.zzYDw.setSemiHidden(true);
                break;
            case 6:
                this.zzYDw.isQuickStyle(true);
                break;
            case 7:
                this.zzYDw.setPriority(zzyet.zzYeT());
                break;
            case 8:
                this.zzYDw.setUnhideWhenUsed(true);
                break;
            case 9:
                this.zzYDw.setLocked(true);
                break;
            case 10:
                this.zzYDw.zzQg(true);
                break;
            case 11:
                this.zzYDw.zzQi(true);
                break;
            case 12:
                this.zzYDw.zzQh(true);
                break;
            case 13:
                this.zzYDw.zzl2(zzyet.zzYeT());
                break;
            default:
                zz3(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        if (zzyet.zzYeW()) {
            return;
        }
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(zzyet.zzYeX(), ',');
        for (int i = 0; i < strArrZzR.length; i++) {
            strArrZzR[i] = com.aspose.words.internal.zzZKN.zzTX(strArrZzR[i]);
        }
        int length = strArrZzR.length - 1;
        String[] strArr = new String[length];
        com.aspose.words.internal.zzZKV.zzZ(strArrZzR, 1, strArr, 0, length);
        zzS(strArrZzR[0], strArr);
    }

    public final TableStyle zzYfq() {
        return (TableStyle) com.aspose.words.internal.zzZKW.zzZ(this.zzYDw, TableStyle.class);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYiO() {
        if (zzYiN().getType() != 28 || this.zzYDw == null) {
            return;
        }
        zzS("Normal", null);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYiP() {
        if (zzYiN().getType() != 28 || this.zzXrO.contains(0)) {
            return;
        }
        zzVV(1, 0);
        this.zzXrO.clear();
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() == 28) {
            this.zzXrQ.zzZ(this.zzXw4);
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        switch (zzYiN().getType()) {
            case 29:
                zzVV(1, zzyet.zzYeT());
                break;
            case 30:
                zzVV(2, zzyet.zzYeT());
                break;
            case 31:
                zzVV(3, zzyet.zzYeT());
                break;
        }
    }

    public final zzY6G zzZYf() {
        if (zzYfq() != null) {
            return zzYfq().zzZYf();
        }
        return null;
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYEF zzZYh() {
        return this.zzYDw.zzZYh();
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYMX zzZYj() {
        return this.zzYDw.zzZYj();
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        switch (zzyhp.getType()) {
            case 29:
            case 30:
            case 31:
                return this;
            default:
                return null;
        }
    }

    private void zzZ(TableStyle tableStyle, TableStyle tableStyle2) {
        ConditionalStyle conditionalStyle = new ConditionalStyle(zzYfp());
        conditionalStyle.zzZ((zzYEF) tableStyle.zzZYh().zzbn());
        conditionalStyle.zzZ((zzYMX) tableStyle.zzZYj().zzbn());
        conditionalStyle.zzZ((zzWP) tableStyle.zz6G().zzbn());
        conditionalStyle.zzY((zzY6G) tableStyle.zzZYd().zzbn());
        conditionalStyle.zzZ((zzY6G) tableStyle.zzZYf().zzbn());
        tableStyle2.zzX(conditionalStyle);
    }
}
