package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZMB {
    protected DocumentBase zzYKc;
    private Forms2OleControl zzYvR;
    protected com.aspose.words.internal.zzG zzYvS = new com.aspose.words.internal.zzG();

    public zzZMB(DocumentBase documentBase, Forms2OleControl forms2OleControl) {
        this.zzYvR = forms2OleControl;
        this.zzYKc = documentBase;
    }

    private void zz4(com.aspose.words.internal.zzPV zzpv) {
        if (this.zzYvR.zzZ6i() == 1) {
            return;
        }
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzZ67());
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(zzpv));
        this.zzYvS.zzX(zzzgZzW);
    }

    public static com.aspose.words.internal.zzG zzZ(DocumentBase documentBase, Forms2OleControl forms2OleControl) throws Exception {
        zzZMB zzzm4;
        switch (forms2OleControl.getType()) {
            case 0:
                zzzm4 = new zzZM4(documentBase, (zzYNN) forms2OleControl);
                break;
            case 1:
                zzzm4 = new zzZM6(documentBase, (zzZ78) forms2OleControl);
                break;
            case 2:
                zzzm4 = new zzZM1(documentBase, (TextBoxControl) forms2OleControl);
                break;
            case 3:
                zzzm4 = new zzZMA(documentBase, (zzVY) forms2OleControl);
                break;
            case 4:
                zzzm4 = new zzZM0(documentBase, (zzY50) forms2OleControl);
                break;
            case 5:
                zzzm4 = new zzZM2(documentBase, (zzY9N) forms2OleControl);
                break;
            case 6:
                zzzm4 = new zzZM9(documentBase, (zzUX) forms2OleControl);
                break;
            case 7:
            case 8:
            case 9:
            case 13:
            default:
                return null;
            case 10:
                zzzm4 = new zzZM8(documentBase, (zzUW) forms2OleControl);
                break;
            case 11:
                zzzm4 = new zzZM7(documentBase, (zzZ8M) forms2OleControl);
                break;
            case 12:
                zzzm4 = new zzZM3(documentBase, (zzYDU) forms2OleControl);
                break;
            case 14:
                zzzm4 = new zzZM5(documentBase, (zzZ4L) forms2OleControl);
                break;
        }
        zzzm4.zzZ68();
        zzzm4.zzYvS.zzZ(com.aspose.words.internal.zzP8.zzM(zzzm4.zzZ67()));
        return zzzm4.zzYvS;
    }

    public final void zzX(int i, com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzYR(this.zzYvR.getBackColor())));
        this.zzYvS.zzX(zzzgZzW);
        this.zzYvS.zzX(zzZMC.zzZm(zzzq4));
        com.aspose.words.internal.zzPV zzpvZzYR = com.aspose.words.internal.zzPV.zzYR(this.zzYvR.getForeColor());
        if (i == 0) {
            this.zzYvS.zzX(zzZMC.zzW(zzzq4, zzpvZzYR));
            return;
        }
        if (i == 1) {
            this.zzYvS.zzX(zzZMC.zzV(zzzq4, zzpvZzYR));
        } else if (i == 2) {
            this.zzYvS.zzX(zzZMC.zzY(zzzq4, zzpvZzYR));
        } else {
            if (i != 3) {
                return;
            }
            this.zzYvS.zzX(zzZMC.zzX(zzzq4, zzpvZzYR));
        }
    }

    public final float zzZ62() {
        int iZzZ6f = this.zzYvR.zzZ6f();
        if (iZzZ6f == 1 || iZzZ6f == 2 || iZzZ6f == 3 || iZzZ6f == 6) {
            return 1.4f;
        }
        return this.zzYvR.zzZ6g() == 0 ? 0.0f : 0.7f;
    }

    public final com.aspose.words.internal.zzZQ4 zzZ63() {
        float fZzZ62 = zzZ62();
        return com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + fZzZ62, zzZ67().zzZo() + fZzZ62, zzZ67().zzkw() - fZzZ62, zzZ67().zzZn() - fZzZ62);
    }

    public final void zzZ64() {
        com.aspose.words.internal.zzG zzg;
        com.aspose.words.internal.zzZL zzzlZzZm;
        int iZzZ6f = this.zzYvR.zzZ6f();
        if (iZzZ6f == 1) {
            zzg = this.zzYvS;
            zzzlZzZm = zzZMC.zzZm(zzZ67());
        } else if (iZzZ6f == 2) {
            zzg = this.zzYvS;
            zzzlZzZm = zzZMC.zzZl(zzZ67());
        } else if (iZzZ6f == 3) {
            zzg = this.zzYvS;
            zzzlZzZm = zzZMC.zzZn(zzZ67());
        } else if (iZzZ6f != 6) {
            zzg = this.zzYvS;
            zzzlZzZm = this.zzYvR.zzZ6g() == 0 ? new com.aspose.words.internal.zzG() : zzZMC.zzZ(zzZ67(), 0.7f, com.aspose.words.internal.zzPV.zzYR(this.zzYvR.zzZ6h()));
        } else {
            zzg = this.zzYvS;
            zzzlZzZm = zzZMC.zzZo(zzZ67());
        }
        zzg.zzX(zzzlZzZm);
    }

    public final void zzZ65() {
        zz4(com.aspose.words.internal.zzPS.zzY(com.aspose.words.internal.zzPV.zzX(128, com.aspose.words.internal.zzZQ1.zz0(this.zzYvR.getBackColor()) & 255, com.aspose.words.internal.zzZQ1.zzZZ(this.zzYvR.getBackColor()) & 255, com.aspose.words.internal.zzZQ1.zzZY(this.zzYvR.getBackColor()) & 255), com.aspose.words.internal.zzPV.zzI5));
    }

    public final void zzZ66() {
        zz4(com.aspose.words.internal.zzPV.zzYR(this.zzYvR.getBackColor()));
    }

    public final com.aspose.words.internal.zzZQ4 zzZ67() {
        return new com.aspose.words.internal.zzZQ4((float) this.zzYvR.getLeft(), (float) this.zzYvR.getTop(), (float) this.zzYvR.getWidth(), (float) this.zzYvR.getHeight());
    }

    public abstract void zzZ68() throws Exception;
}
