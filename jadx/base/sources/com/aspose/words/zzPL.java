package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzPL {
    private boolean zzZqa;
    private double zzZqb;
    private boolean zzZqc;
    private double zzZqd;
    private boolean zzZqe;
    private double zzZqf;
    private boolean zzZqg;
    private double zzZqh;
    private String zzZqi;

    public zzPL(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZqi = str;
    }

    public final double getBottom() {
        return this.zzZqd;
    }

    public final double getLeft() {
        return this.zzZqb;
    }

    public final double getRight() {
        return this.zzZqf;
    }

    public final double getTop() {
        return this.zzZqh;
    }

    public final void setLeft(double d) {
        this.zzZqb = d;
        this.zzZqa = true;
    }

    public final void setTop(double d) {
        this.zzZqh = d;
        this.zzZqg = true;
    }

    public final void zzY(zzLU zzlu) {
        zzPS zzpsZzZWe = zzlu.zzZWe();
        double dZzSH = zzpsZzZWe.zzSH(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZqi, "top"));
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            setTop(dZzSH);
        }
        double dZzSH2 = zzpsZzZWe.zzSH(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZqi, "right"));
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH2)) {
            zzYY(dZzSH2);
        }
        double dZzSH3 = zzpsZzZWe.zzSH(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZqi, "bottom"));
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSH3)) {
            zzYX(dZzSH3);
        }
        double dZzSH4 = zzpsZzZWe.zzSH(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZqi, "left"));
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH4)) {
            return;
        }
        setLeft(dZzSH4);
    }

    public final void zzYX(double d) {
        this.zzZqd = d;
        this.zzZqc = true;
    }

    public final void zzYY(double d) {
        this.zzZqf = d;
        this.zzZqe = true;
    }

    public final void zzYd(boolean z) {
        this.zzZqa = z;
    }

    public final void zzYe(boolean z) {
        this.zzZqc = z;
    }

    public final void zzYf(boolean z) {
        this.zzZqe = z;
    }

    public final void zzYg(boolean z) {
        this.zzZqg = z;
    }

    public final void zzZ(zzLU zzlu) {
        if (this.zzZqg) {
            zzlu.zzZ(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZqi, "top"), this.zzZqh, 4);
        }
        if (this.zzZqe) {
            zzlu.zzZ(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZqi, "right"), this.zzZqf, 4);
        }
        if (this.zzZqc) {
            zzlu.zzZ(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZqi, "bottom"), this.zzZqd, 4);
        }
        if (this.zzZqa) {
            zzlu.zzZ(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZqi, "left"), this.zzZqb, 4);
        }
    }

    public final boolean zzZW4() {
        return this.zzZqg && this.zzZqe && this.zzZqc && this.zzZqa;
    }

    public final boolean zzZW5() {
        return this.zzZqa;
    }

    public final boolean zzZW6() {
        return this.zzZqc;
    }

    public final boolean zzZW7() {
        return this.zzZqe;
    }

    public final boolean zzZW8() {
        return this.zzZqg;
    }

    public abstract Object zzkm();

    public final zzPL zzm(int i, boolean z) {
        boolean z2;
        zzPL zzpl = (zzPL) zzkm();
        if (i != 0) {
            if (i == 1 || i == 2) {
                zzpl.setTop(this.zzZqf);
                zzpl.zzZqg = this.zzZqe;
                zzpl.zzYY(z ? this.zzZqh : this.zzZqd);
                zzpl.zzZqe = z ? this.zzZqg : this.zzZqc;
                zzpl.zzYX(this.zzZqb);
                zzpl.zzZqc = this.zzZqa;
                zzpl.setLeft(z ? this.zzZqd : this.zzZqh);
                z2 = z ? this.zzZqc : this.zzZqg;
                zzpl.zzZqa = z2;
            }
        } else if (z) {
            zzpl.zzYY(this.zzZqb);
            zzpl.zzZqe = this.zzZqa;
            zzpl.setLeft(this.zzZqf);
            z2 = this.zzZqe;
            zzpl.zzZqa = z2;
        }
        return zzpl;
    }

    public final zzPL zzn(int i, boolean z) {
        zzPL zzpl = (zzPL) zzkm();
        if (i != 0) {
            if (i == 1 || i == 2) {
                zzpl.setTop(z ? this.zzZqf : this.zzZqb);
                zzpl.zzZqg = z ? this.zzZqe : this.zzZqa;
                zzpl.zzYY(this.zzZqh);
                zzpl.zzZqe = this.zzZqg;
                zzpl.zzYX(z ? this.zzZqb : this.zzZqf);
                zzpl.zzZqc = z ? this.zzZqa : this.zzZqe;
                zzpl.setLeft(this.zzZqd);
                zzpl.zzZqa = this.zzZqc;
                return zzpl;
            }
        } else if (z) {
            zzpl.zzYY(this.zzZqb);
            zzpl.zzZqe = this.zzZqa;
            zzpl.setLeft(this.zzZqf);
            zzpl.zzZqa = this.zzZqe;
        }
        return zzpl;
    }

    public zzPL(zzPL zzpl) {
        this.zzZqi = zzpl.zzZqi;
        this.zzZqh = zzpl.zzZqh;
        this.zzZqg = zzpl.zzZqg;
        this.zzZqf = zzpl.zzZqf;
        this.zzZqe = zzpl.zzZqe;
        this.zzZqd = zzpl.zzZqd;
        this.zzZqc = zzpl.zzZqc;
        this.zzZqb = zzpl.zzZqb;
        this.zzZqa = zzpl.zzZqa;
    }
}
