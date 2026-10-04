package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGU extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\lsdstimax", "\\lsdlockeddef", "\\lsdsemihiddendef", "\\lsdunhideuseddef", "\\lsdqformatdef", "\\lsdprioritydef", "\\lsdsemihidden", "\\lsdunhideused", "\\lsdqformat", "\\lsdpriority", "\\lsdlocked");
    private boolean zzHc;
    private boolean zzXuU;
    private boolean zzYgR;
    private int zzYgS;
    private boolean zzYgT;

    public zzYGU(zzYFT zzyft) {
        super(zzyft);
    }

    private zzZ73 zzYi5() {
        return this.zzXw4.getDocument().getStyles().zzYi5();
    }

    private void zzYi6() {
        this.zzHc = zzYi5().zzYUf();
        this.zzXuU = zzYi5().zzYUe();
        this.zzYgT = zzYi5().zzYUd();
        this.zzYgS = zzYi5().zzYUc();
        this.zzYgR = zzYi5().zzYUb();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                zzYi5().zzy5(zzyet.zzYeT());
                break;
            case 1:
                zzYi5().zzV5(zzyet.zzYeY());
                break;
            case 2:
                zzYi5().zzV3(zzyet.zzYeY());
                break;
            case 3:
                zzYi5().zzV2(zzyet.zzYeY());
                break;
            case 4:
                zzYi5().zzV4(zzyet.zzYeY());
                break;
            case 5:
                zzYi5().zzy6(zzyet.zzYeT());
                break;
            case 6:
                this.zzYgT = zzyet.zzYeY();
                break;
            case 7:
                this.zzYgR = zzyet.zzYeY();
                break;
            case 8:
                this.zzXuU = zzyet.zzYeY();
                break;
            case 9:
                this.zzYgS = zzyet.zzYeT();
                break;
            case 10:
                this.zzHc = zzyet.zzYeY();
                break;
            default:
                super.zzT(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        if (zzYiN().getType() != 117) {
            super.zzY(zzyet);
            return;
        }
        int iZzAP = zzY8T.zzAP(com.aspose.words.internal.zzZKN.zzTX(zzyet.zzYeX()));
        if (iZzAP != 4094) {
            zzYi5().zzX(new zzZ74(iZzAP, this.zzHc, this.zzXuU, this.zzYgT, this.zzYgS, this.zzYgR));
        }
        zzYi6();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYiN().getType() != 117) {
            super.zzZ(zzyet);
        } else {
            zzYi6();
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        return zzyhp.getType() != 117 ? super.zzZ(zzyhp) : this;
    }
}
