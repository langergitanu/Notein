package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ36 extends zzZ3E {
    private int zzUG;
    private int zzVN;
    private int zzY8k;
    private boolean zzY8l;
    private int zzY99;
    private boolean zzYQ;
    private zzZ34 zzYat;
    private zzZ3C zzYau;
    private boolean zzsy;
    private static zzZ3C zzYaj = new zzZ3C(null, true);
    private static zzZ34 zzYai = zzZ34.zzY7E;
    private static int zzY9c = ((Integer) zzY6G.zzOt(4010)).intValue();
    private static int zzY8P = ((Integer) zzY6G.zzOt(4340)).intValue() * 50;
    private static boolean zzY8j = ((Boolean) zzY6G.zzOt(4360)).booleanValue();
    private static boolean zzY8i = ((Boolean) zzY6G.zzOt(4040)).booleanValue();
    private static int zzY8h = 0;

    public zzZ36(zzX6 zzx6) {
        super(zzx6);
        this.zzYau = zzYaj;
        this.zzYat = zzYai;
        this.zzUG = zzY9c;
        this.zzY99 = zzY8P;
        this.zzY8l = zzY8j;
        this.zzsy = zzY8i;
        this.zzVN = 0;
        this.zzY8k = zzY8h;
    }

    public static zzZ36 zzZ(zzZ36 zzz36) {
        if (zzz36.zzZoP() == null || zzz36.isCached()) {
            return zzz36;
        }
        zzZ36 zzz362 = (zzZ36) com.aspose.words.internal.zzQW.zzZ((Map<zzZ36, TValue>) zzz36.zzZoP().zzZAI, zzz36);
        if (zzz362 != null) {
            return zzz362;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz36.zzZoP().zzZAI, zzz36, zzz36);
        return zzz36;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj) || hashCode() != obj.hashCode()) {
            return false;
        }
        zzZ36 zzz36 = (zzZ36) obj;
        return this.zzY8k == zzz36.zzY8k && this.zzVN == zzz36.zzVN && this.zzsy == zzz36.zzsy && zzYLA() == zzz36.zzYLA() && this.zzY99 == zzz36.zzY99 && this.zzUG == zzz36.zzUG && com.aspose.words.internal.zzZKO.equals(zzYMV(), zzz36.zzYMV()) && com.aspose.words.internal.zzZKO.equals(zzYMW(), zzz36.zzYMW()) && this.zzYQ == zzz36.zzYQ;
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getHeightRule() {
        return this.zzY8k;
    }

    public final boolean isHidden() {
        return this.zzYQ;
    }

    public final void setAlignment(int i) {
        zzYN6();
        this.zzUG = i;
    }

    public final void setHeight(int i) {
        zzYN6();
        this.zzVN = i;
    }

    public final void setHeightRule(int i) {
        zzYN6();
        this.zzY8k = i;
    }

    public final boolean zzBz() {
        return this.zzsy;
    }

    public final void zzTS(boolean z) {
        zzYN6();
        this.zzY8l = z;
    }

    public final void zzTT(boolean z) {
        zzYN6();
        this.zzsy = z;
    }

    public final void zzX(zzZ3C zzz3c) {
        zzYN6();
        this.zzYau = zzz3c;
    }

    public final void zzY(zzZ34 zzz34) {
        zzYN6();
        this.zzYat = zzz34;
    }

    public final boolean zzYLA() {
        return this.zzY8l && !this.zzsy;
    }

    public final int zzYM7() {
        return this.zzY99;
    }

    public final zzZ3C zzYMV() {
        if (this.zzYau == null) {
            this.zzYau = new zzZ3C(zzZoP(), false);
        }
        return this.zzYau;
    }

    public final zzZ34 zzYMW() {
        if (this.zzYat == null) {
            this.zzYat = new zzZ34(zzZoP(), false);
        }
        return this.zzYat;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzwB(this.zzY8k);
        zzwB(this.zzVN);
        zzUC(this.zzsy);
        zzUC(zzYLA());
        zzwB(this.zzY99);
        zzwB(this.zzUG);
        zzUC(this.zzYQ);
        zzZp(zzYMV());
        zzZp(zzYMW());
    }

    public final void zzwa(int i) {
        zzYN6();
        this.zzY99 = i;
    }

    public final void isHidden(boolean z) {
        zzYN6();
        this.zzYQ = z;
    }
}
