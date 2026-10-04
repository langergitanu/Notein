package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZZA {
    static boolean zzZD5 = false;
    private zzZOC zzYU3;
    private zzZO2 zzYU4;
    private zzZO3 zzYU5;
    private zzZOH zzYU6;
    private zzZO8 zzYU7;
    private zzZO8 zzYU8;
    private zzZOG zzYU9;
    private zzZOI zzYUa;
    private zzZO4 zzYUb;
    private zzZO4 zzYUc;
    private zzZOB zzYUd;
    private zzZOE zzYUe;
    private zzZO6 zzYUf;
    private zzZO7 zzYUg;
    private zzZO5 zzYUh;
    private zzU0 zzYUi;
    private zzZRA zzYUj;
    private com.aspose.words.internal.zzZOX zzYUk;
    private com.aspose.words.internal.zzZOX zzYUl;
    private com.aspose.words.internal.zzZO0 zzYUm;
    private com.aspose.words.internal.zzZOX zzYUn;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzKD zzZjS;

    public zzZZA(com.aspose.words.internal.zzKD zzkd, String str, IWarningCallback iWarningCallback) throws Exception {
        zzZ(zzkd, str, 0, iWarningCallback);
    }

    private void zzZ(com.aspose.words.internal.zzKD zzkd, String str, int i, IWarningCallback iWarningCallback) throws Exception {
        com.aspose.words.internal.zzZOX zzzox;
        if (zzkd == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fs");
        }
        this.zzZjS = zzkd;
        this.zzZG0 = iWarningCallback;
        zzZRA zzzra = new zzZRA(new com.aspose.words.internal.zzZOX(zzkd.zzIf().zzYs("WordDocument"), zzZZ7.zzWB(true)), iWarningCallback, i);
        this.zzYUj = zzzra;
        if (zzzra.zzZgY()) {
            throw new UnsupportedFileFormatException("This document is in the pre-Word6.0 format and it is not currently supported.");
        }
        zzZRA zzzra2 = this.zzYUj;
        if (zzzra2.zzYHs) {
            if (!zzzra2.zzYHl) {
                new zzYK7().zzZ(this.zzZjS, this.zzYUj.zzZgZ(), str);
            } else {
                if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
                    throw new IncorrectPasswordException("The document password is not set.");
                }
                com.aspose.words.internal.zzKD zzkd2 = this.zzZjS;
                zzZRA zzzra3 = this.zzYUj;
                zzXYP.zzZ(zzkd2, zzzra3.zzYHj, zzzra3.zzZgZ(), str);
            }
        }
        this.zzYUn = new com.aspose.words.internal.zzZOX(this.zzZjS.zzIf().zzYs("WordDocument"), zzZZ7.zzWB(true));
        this.zzYUm = zzZrg();
        this.zzYUj.zzM(this.zzYUn, i);
        if (zzZRA.zzDL(this.zzYUj.zzYHB)) {
            zzzox = this.zzYUn;
            this.zzYUl = zzzox;
        } else {
            this.zzYUl = new com.aspose.words.internal.zzZOX(this.zzZjS.zzIf().zzYs(this.zzYUj.zzZgZ()), com.aspose.words.internal.zzZO0.zzhU());
            com.aspose.words.internal.zzZOR zzzorZzYu = this.zzZjS.zzIf().zzYu("Data");
            zzzox = zzzorZzYu != null ? new com.aspose.words.internal.zzZOX(zzzorZzYu, com.aspose.words.internal.zzZO0.zzhU()) : null;
        }
        this.zzYUk = zzzox;
        this.zzYUi = new zzU0(this.zzYUj, this.zzYUl, true);
        this.zzYUh = new zzZO5(this.zzYUj, this.zzYUn, this.zzYUl);
        zzZrf();
        zzZre();
        this.zzYUe = new zzZOE(this.zzYUj, this.zzYUl);
        this.zzYUd = new zzZOB(this.zzYUj, this.zzYUl, this.zzYUh.getItemCount());
        this.zzYUc = new zzZO4(0, this.zzYUj, this.zzYUl);
        this.zzYUb = new zzZO4(2, this.zzYUj, this.zzYUl);
        this.zzYUa = new zzZOI(this.zzYUj, this.zzYUl);
        this.zzYU9 = new zzZOG(this.zzYUj, this.zzYUl);
        this.zzYU8 = new zzZO8(0, this.zzYUj, this.zzYUl);
        this.zzYU7 = new zzZO8(1, this.zzYUj, this.zzYUl);
        this.zzYU6 = new zzZOH(this.zzYUj, this.zzYUl);
        this.zzYU5 = new zzZO3(this.zzYUj, this.zzYUl, iWarningCallback);
        this.zzYU4 = new zzZO2(this.zzYUj, this.zzYUl);
        this.zzYU3 = new zzZOC(this.zzYUj, this.zzYUl);
    }

    private void zzZre() throws Exception {
        this.zzYUf = new zzZO6();
        zzYN zzyn = new zzYN(this.zzYUj.zzYHB);
        zzyn.zzZ(this.zzYUl, this.zzYUj.zzYGE.zzXAt);
        for (int i = 0; i < zzyn.getItemCount(); i++) {
            this.zzYUn.zzq().zzU(zzyn.zzP0(i), 0);
            if (this.zzYUn.zzq().getPosition() > this.zzYUn.zzq().getLength()) {
                zzY1Z.zzZ(this.zzZG0, 1, 10, "Invalid PlcfBteChpx structure, character properties are lost.");
                return;
            }
            new zzXC(this.zzYUn).zzZ(this.zzYUf);
        }
    }

    private void zzZrf() throws Exception {
        this.zzYUg = new zzZO7();
        zzYN zzyn = new zzYN(this.zzYUj.zzYHB);
        zzyn.zzZ(this.zzYUl, this.zzYUj.zzYGE.zzXAs);
        for (int i = 0; i < zzyn.getItemCount(); i++) {
            this.zzYUn.zzq().zzU(zzyn.zzP0(i), 0);
            if (this.zzYUn.zzq().getPosition() > this.zzYUn.zzq().getLength()) {
                zzY1Z.zzZ(this.zzZG0, 1, 10, "Invalid PlcfBtePapx structure, paragraph properties are lost.");
                return;
            }
            new zzYNG(this.zzYUn, this.zzYUj.zzYHB).zzZ(this.zzYUg);
        }
    }

    private com.aspose.words.internal.zzZO0 zzZrg() {
        return zzZRA.zzDL(this.zzYUj.zzYHB) ? com.aspose.words.internal.zzZO0.zzQz(com.aspose.words.internal.zzT8.zzYS(this.zzYUj.zzYHz)) : zzZZ7.zzWB(false);
    }

    public final void zzE(int i, String str) throws Exception {
        zzZ(this.zzZjS, str, i, null);
    }

    public final zzZO4 zzGf(int i) {
        if (i == 0) {
            return this.zzYUc;
        }
        if (i == 2) {
            return this.zzYUb;
        }
        throw new IllegalStateException("Unexpected subdocument type.");
    }

    public final void zzT(com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzYUm = zzzo0;
    }

    public final com.aspose.words.internal.zzKD zzZrA() {
        return this.zzZjS;
    }

    public final com.aspose.words.internal.zzZO0 zzZrh() {
        return this.zzYUm;
    }

    public final zzZOC zzZri() {
        return this.zzYU3;
    }

    public final zzZO2 zzZrj() {
        return this.zzYU4;
    }

    public final zzZO3 zzZrk() {
        return this.zzYU5;
    }

    public final zzZO6 zzZrl() {
        return this.zzYUf;
    }

    public final zzZO7 zzZrm() {
        return this.zzYUg;
    }

    public final zzZO5 zzZrn() {
        return this.zzYUh;
    }

    public final zzZOH zzZro() {
        return this.zzYU6;
    }

    public final zzZO8 zzZrp() {
        return this.zzYU7;
    }

    public final zzZO8 zzZrq() {
        return this.zzYU8;
    }

    public final zzZOG zzZrr() {
        return this.zzYU9;
    }

    public final zzZOI zzZrs() {
        return this.zzYUa;
    }

    public final zzZOB zzZrt() {
        return this.zzYUd;
    }

    public final zzZOE zzZru() {
        return this.zzYUe;
    }

    public final zzU0 zzZrv() {
        return this.zzYUi;
    }

    public final zzZRA zzZrw() {
        return this.zzYUj;
    }

    public final com.aspose.words.internal.zzZOX zzZrx() {
        return this.zzYUk;
    }

    public final com.aspose.words.internal.zzZOX zzZry() {
        return this.zzYUl;
    }

    public final com.aspose.words.internal.zzZOX zzZrz() {
        return this.zzYUn;
    }
}
