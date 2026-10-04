package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2Z extends zzZ3E {
    static zzZ2Z zzY6r;
    private zz2N zzY6s;
    private zz27 zzY6t;
    private zz21 zzY6u;
    private boolean zzYXD;
    private zz1R zzYYC;
    private zz2S zzZ5i;
    private zz4G zzZje;
    private zz7X zzZjf;

    static {
        zzZ2Z zzz2z = new zzZ2Z(null);
        zzY6r = zzz2z;
        zzz2z.zzYN9();
    }

    private zzZ2Z(zzX6 zzx6) {
        super(zzx6);
    }

    private void setFill(zz7X zz7x) {
        zzYN6();
        this.zzZjf = zz7x;
    }

    private void setOutline(zz4G zz4g) {
        zzYN6();
        this.zzZje = zz4g;
    }

    private void zzTv(boolean z) {
        zzYN6();
        this.zzYXD = z;
    }

    private void zzW(zz2N zz2n) {
        zzYN6();
        this.zzY6s = zz2n;
    }

    private void zzX(zz2S zz2s) {
        zzYN6();
        this.zzZ5i = zz2s;
    }

    private static zzZ2Z zzY(zzZ2Z zzz2z) {
        if (zzz2z.zzZoP() == null || zzz2z.isCached()) {
            return zzz2z;
        }
        zzZ2Z zzz2z2 = (zzZ2Z) com.aspose.words.internal.zzQW.zzZ((Map<zzZ2Z, TValue>) zzz2z.zzZoP().zzZAx, zzz2z);
        if (zzz2z2 != null) {
            return zzz2z2;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz2z.zzZoP().zzZAx, zzz2z, zzz2z);
        return zzz2z;
    }

    private void zzZ(zz21 zz21Var) {
        zzYN6();
        this.zzY6u = zz21Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ2Z zzz2z = (zzZ2Z) obj;
        return com.aspose.words.internal.zzZKO.equals(this.zzZje, zzz2z.zzZje) && com.aspose.words.internal.zzZKO.equals(this.zzZjf, zzz2z.zzZjf) && com.aspose.words.internal.zzZKO.equals(this.zzY6u, zzz2z.zzY6u) && com.aspose.words.internal.zzZKO.equals(this.zzY6t, zzz2z.zzY6t) && com.aspose.words.internal.zzZKO.equals(this.zzYYC, zzz2z.zzYYC) && com.aspose.words.internal.zzZKO.equals(this.zzZ5i, zzz2z.zzZ5i) && com.aspose.words.internal.zzZKO.equals(this.zzY6s, zzz2z.zzY6s) && this.zzYXD == zzz2z.zzYXD;
    }

    public final zz7X getFill() {
        return this.zzZjf;
    }

    public final zz4G getOutline() {
        return this.zzZje;
    }

    public final boolean zzYKj() {
        return (this.zzZje == null && this.zzZjf == null && this.zzY6u == null && this.zzY6t == null && this.zzYYC == null) ? false : true;
    }

    public final boolean zzYKk() {
        return this.zzYXD;
    }

    public final zz2N zzYKl() {
        return this.zzY6s;
    }

    public final zz1R zzYKm() {
        return this.zzYYC;
    }

    public final zz21 zzYKn() {
        return this.zzY6u;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzZp(this.zzZje);
        zzZp(this.zzZjf);
        zzZp(this.zzY6u);
        zzZp(this.zzY6t);
        zzZp(this.zzYYC);
        zzZp(this.zzZ5i);
        zzZp(this.zzY6s);
        zzUC(this.zzYXD);
    }

    public final zz2S zzZCu() {
        return this.zzZ5i;
    }

    public final zz27 zzZuO() {
        return this.zzY6t;
    }

    private void zzZ(zz27 zz27Var) {
        zzYN6();
        this.zzY6t = zz27Var;
    }

    private void zzZ(zz1R zz1r) {
        zzYN6();
        this.zzYYC = zz1r;
    }

    public static zzZ2Z zzZ(zzX6 zzx6, zz4G zz4g, zz7X zz7x, zz21 zz21Var, zz27 zz27Var, zz1R zz1r, zz2S zz2s, zz2N zz2n, boolean z) {
        if (zz4g == null && zz7x == null && zz21Var == null && zz27Var == null && zz1r == null && zz2s == null && zz2n == null) {
            return zzY6r;
        }
        zzZ2Z zzz2z = new zzZ2Z(zzx6);
        zzz2z.setOutline(zz4g);
        zzz2z.setFill(zz7x);
        zzz2z.zzZ(zz21Var);
        zzz2z.zzZ(zz27Var);
        zzz2z.zzZ(zz1r);
        zzz2z.zzX(zz2s);
        zzz2z.zzW(zz2n);
        zzz2z.zzTv(z);
        return zzY(zzz2z);
    }
}
