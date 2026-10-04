package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ30 extends zzZ3E {
    static zzZ39 zzY7C;
    private String zzLr;
    private int zzY6A;
    private boolean zzY6B;
    private int zzY6C;
    private int zzY6D;
    private boolean zzY6z;
    private zzZ39 zzY8U;
    private int zzY99;
    private boolean zzYS;
    private com.aspose.words.internal.zzDB zzYyi;
    private PreferredWidth zzZzD;
    private static PreferredWidth zzYae = (PreferredWidth) zzY6G.zzOt(4230);
    private static int zzY8P = ((Integer) zzY6G.zzOt(4340)).intValue();
    private static boolean zzY6y = ((Boolean) zzY6G.zzOt(4240)).booleanValue();
    private static boolean zzY6w = ((Boolean) zzY6G.zzOt(4380)).booleanValue();
    private static String zzY6v = "";
    private static int zzY6x = -1;

    static {
        zzZ39 zzz39 = new zzZ39(null, false);
        zzY7C = zzz39;
        zzz39.setAllowOverlap(((Boolean) zzY6G.zzOt(4350)).booleanValue());
        zzY7C.setLeft(((Integer) zzY6G.zzOt(4170)).intValue() * 50);
        zzY7C.setTop(((Integer) zzY6G.zzOt(4190)).intValue() * 50);
        zzY7C.zzwe(((Integer) zzY6G.zzOt(4150)).intValue());
        zzY7C.setHorizontalAlignment(((Integer) zzY6G.zzOt(4180)).intValue());
        zzY7C.zzwd(((Integer) zzY6G.zzOt(4160)).intValue());
        zzY7C.setVerticalAlignment(((Integer) zzY6G.zzOt(4200)).intValue());
        zzY7C.zzwi(((Integer) zzY6G.zzOt(4210)).intValue() * 50);
        zzY7C.zzwh(((Integer) zzY6G.zzOt(4220)).intValue() * 50);
        zzY7C.zzwg(((Integer) zzY6G.zzOt(4270)).intValue() * 50);
        zzY7C.zzwf(((Integer) zzY6G.zzOt(4280)).intValue() * 50);
        zzY7C.zzYN9();
    }

    public zzZ30(zzX6 zzx6) {
        super(zzx6);
        this.zzZzD = zzYae;
        this.zzY99 = zzY8P;
        this.zzY6B = zzY6y;
        this.zzY6A = zzY6x;
        this.zzYS = zzY6w;
        this.zzLr = zzY6v;
        this.zzY8U = zzY7C;
    }

    public static zzZ30 zzZ(zzZ30 zzz30) {
        if (zzz30.zzZoP() == null || zzz30.isCached()) {
            return zzz30;
        }
        zzZ30 zzz302 = (zzZ30) com.aspose.words.internal.zzQW.zzZ((Map<zzZ30, TValue>) zzz30.zzZoP().zzZAJ, zzz30);
        if (zzz302 != null) {
            return zzz302;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz30.zzZoP().zzZAJ, zzz30, zzz30);
        return zzz30;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ30 zzz30 = (zzZ30) obj;
        return this.zzY99 == zzz30.zzY99 && this.zzY6B == zzz30.zzY6B && this.zzYS == zzz30.zzYS && com.aspose.words.internal.zzZKN.equals(this.zzLr, zzz30.zzLr) && this.zzY6z == zzz30.zzY6z && this.zzY6D == zzz30.zzY6D && this.zzY6C == zzz30.zzY6C && com.aspose.words.internal.zzZKO.equals(this.zzY8U, zzz30.zzY8U) && com.aspose.words.internal.zzZKO.equals(this.zzZzD, zzz30.zzZzD) && com.aspose.words.internal.zzZKO.equals(this.zzYyi, zzz30.zzYyi) && this.zzY6A == zzz30.zzY6A;
    }

    public final String getDescription() {
        return this.zzLr;
    }

    public final boolean isFloating() {
        zzZ39 zzz39 = this.zzY8U;
        return zzz39 != null && zzz39.isFloating();
    }

    public final void setDescription(String str) {
        zzYN6();
        this.zzLr = str;
    }

    public final void zzTN(boolean z) {
        zzYN6();
        this.zzYS = z;
    }

    public final void zzTw(boolean z) {
        zzYN6();
        this.zzY6z = z;
    }

    public final void zzTx(boolean z) {
        zzYN6();
        this.zzY6B = z;
    }

    public final void zzV(PreferredWidth preferredWidth) {
        zzYN6();
        this.zzZzD = preferredWidth;
    }

    public final void zzW(zzZ39 zzz39) {
        zzYN6();
        this.zzY8U = zzz39;
    }

    public final com.aspose.words.internal.zzDB zzYKo() {
        return this.zzYyi;
    }

    public final boolean zzYKp() {
        return this.zzY6z;
    }

    public final zzZ39 zzYKq() {
        zzZ39 zzz39 = new zzZ39(zzZoP(), false);
        zzz39.setAllowOverlap(zzY7C.getAllowOverlap());
        zzz39.setLeft(zzY7C.getLeft());
        zzz39.setTop(zzY7C.getTop());
        zzz39.zzwe(zzY7C.zzYMf());
        zzz39.setHorizontalAlignment(zzY7C.getHorizontalAlignment());
        zzz39.zzwd(zzY7C.zzYMd());
        zzz39.setVerticalAlignment(zzY7C.getVerticalAlignment());
        zzz39.zzwi(zzY7C.zzYMk());
        zzz39.zzwh(zzY7C.zzYMj());
        zzz39.zzwg(zzY7C.zzYMi());
        zzz39.zzwf(zzY7C.zzYMh());
        return zzz39;
    }

    public final int zzYKr() {
        return this.zzY6C;
    }

    public final int zzYKs() {
        return this.zzY6D;
    }

    public final int zzYKt() {
        if (zzYKu()) {
            return this.zzY6A;
        }
        return 0;
    }

    public final boolean zzYKu() {
        return this.zzY6A >= 0;
    }

    public final boolean zzYKv() {
        return this.zzY6B;
    }

    public final zzZ39 zzYLJ() {
        return this.zzY8U;
    }

    public final int zzYM7() {
        return this.zzY99;
    }

    public final PreferredWidth zzYMZ() {
        return this.zzZzD;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzwB(this.zzY99);
        zzUC(this.zzY6B);
        zzUC(this.zzYS);
        zzZp(this.zzLr);
        zzUC(this.zzY6z);
        zzwB(this.zzY6D);
        zzwB(this.zzY6C);
        zzZp(this.zzY8U);
        zzZp(this.zzZzD);
        zzZp(this.zzYyi);
        zzwB(this.zzY6A);
    }

    public final boolean zzZz() {
        return this.zzYS;
    }

    public final void zzvl(int i) {
        zzYN6();
        this.zzY6C = i;
    }

    public final void zzvm(int i) {
        zzYN6();
        this.zzY6D = i;
    }

    public final void zzvn(int i) {
        zzYN6();
        this.zzY6A = i;
    }

    public final void zzwa(int i) {
        zzYN6();
        this.zzY99 = i;
    }

    public final void zzV(com.aspose.words.internal.zzDB zzdb) {
        zzYN6();
        this.zzYyi = zzdb;
    }
}
