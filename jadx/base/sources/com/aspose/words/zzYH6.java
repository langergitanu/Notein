package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH6 extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\fftype", "\\fftypetxt", "\\ffmaxlen", "\\ffownhelp", "\\ffownstat", "\\ffprot", "\\ffrecalc", "\\ffres", "\\ffsize", "\\ffhps", "\\ffdefres");
    private int zzXvu;
    private int zzXvv;
    private zzZMM zzYwl;
    private int zzuG;

    public zzYH6(zzYFT zzyft) {
        super(zzyft);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                this.zzXvv = zzyet.zzYeT();
                break;
            case 1:
                this.zzYwl.setTextInputType(zzyet.zzYeT());
                break;
            case 2:
                this.zzYwl.zzAY(zzyet.zzYeT());
                break;
            case 3:
                this.zzYwl.zzVD(true);
                break;
            case 4:
                this.zzYwl.zzVC(true);
                break;
            case 5:
                this.zzYwl.setEnabled(false);
                break;
            case 6:
                this.zzYwl.zzVE(true);
                break;
            case 7:
                this.zzXvu = zzyet.zzYeT();
                break;
            case 8:
                this.zzYwl.zzVB(zzyet.zzYeT() == 0);
                break;
            case 9:
                this.zzYwl.zzAX(zzyet.zzYeT());
                break;
            case 10:
                this.zzuG = zzyet.zzYeT();
                break;
            default:
                zzO(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        switch (zzYiN().getType()) {
            case 44:
                this.zzYwl.setName(zzyet.zzYR());
                break;
            case 45:
                this.zzYwl.setHelpText(zzyet.zzYR());
                break;
            case 46:
                this.zzYwl.setStatusText(zzyet.zzYR());
                break;
            case 47:
                this.zzYwl.setEntryMacro(zzyet.zzYR());
                break;
            case 48:
                this.zzYwl.setExitMacro(zzyet.zzYR());
                break;
            case 49:
                this.zzYwl.setTextInputDefault(zzyet.zzYR());
                break;
            case 50:
                this.zzYwl.setTextInputFormat(zzyet.zzYR());
                break;
            case 51:
                this.zzYwl.getDropDownItems().add(zzyet.zzYR());
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() != 43) {
            return;
        }
        int i = this.zzXvv;
        if (i == 1) {
            this.zzYwl.zzVA(this.zzuG != 0);
            int i2 = this.zzXvu;
            if (i2 != 25) {
                this.zzYwl.zzVz(i2 != 0);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        this.zzYwl.zzAW(this.zzuG);
        int i3 = this.zzXvu;
        if (i3 != 25) {
            this.zzYwl.zzAV(i3);
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        if (zzYiN().getType() != 43) {
            return;
        }
        this.zzYwl = new zzZMM();
        zzYiM().zzV(this.zzYwl);
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        switch (zzyhp.getType()) {
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                return this;
            default:
                return null;
        }
    }
}
