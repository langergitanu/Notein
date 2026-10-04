package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3B extends zzZ3E {
    private static int zzYa9;
    private static int zzYaa;
    private static int zzYab;
    private static int zzYac;
    private static int zzYad;
    private static PreferredWidth zzYae;
    private static boolean zzYaf;
    private int mVerticalAlignment;
    private int zzYak;
    private int zzYal;
    private boolean zzYam;
    private int zzYan;
    private int zzYao;
    private int zzYap;
    private int zzYaq;
    private boolean zzYar;
    private boolean zzYas;
    private zzZ34 zzYat;
    private zzZ3C zzYau;
    private boolean zzYed;
    private PreferredWidth zzZzD;
    private int zzvP;
    private static zzZ3C zzYaj = new zzZ3C(null, true);
    private static zzZ34 zzYai = new zzZ34(null, true);
    private static int zzYah = ((Integer) zzWP.zzOt(3050)).intValue();
    private static boolean zzYag = ((Boolean) zzWP.zzOt(3180)).booleanValue();

    static {
        zzYaf = ((Integer) zzWP.zzOt(3030)).intValue() == 2;
        zzYae = (PreferredWidth) zzWP.zzOt(3020);
        zzYad = ((Integer) zzWP.zzOt(3060)).intValue();
        zzYac = ((Integer) zzWP.zzOt(3090)).intValue() * 50;
        zzYab = ((Integer) zzWP.zzOt(3070)).intValue() * 50;
        zzYaa = ((Integer) zzWP.zzOt(3100)).intValue() * 50;
        zzYa9 = ((Integer) zzWP.zzOt(3080)).intValue() * 50;
    }

    public zzZ3B(zzX6 zzx6) {
        super(zzx6);
        this.zzYau = zzYaj;
        this.zzYat = zzYai;
        this.zzvP = zzYah;
        this.zzYed = zzYag;
        this.zzYar = zzYaf;
        this.zzZzD = zzYae;
        this.mVerticalAlignment = zzYad;
        int i = zzYac;
        this.zzYaq = i;
        this.zzYap = zzYab;
        int i2 = zzYaa;
        this.zzYao = i2;
        this.zzYan = zzYa9;
        this.zzYal = i;
        this.zzYak = i2;
    }

    public static zzZ3B zzZ(zzZ3B zzz3b) {
        if (zzz3b == null) {
            zzz3b = new zzZ3B(null);
        }
        if (zzz3b.zzZoP() == null || zzz3b.isCached()) {
            return zzz3b;
        }
        zzZ3B zzz3b2 = (zzZ3B) com.aspose.words.internal.zzQW.zzZ((Map<zzZ3B, TValue>) zzz3b.zzZoP().zzZAH, zzz3b);
        if (zzz3b2 != null) {
            return zzz3b2;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz3b.zzZoP().zzZAH, zzz3b, zzz3b);
        return zzz3b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ3B zzz3b = (zzZ3B) obj;
        return this.mVerticalAlignment == zzz3b.mVerticalAlignment && this.zzYaq == zzz3b.zzYaq && this.zzYap == zzz3b.zzYap && this.zzYao == zzz3b.zzYao && this.zzYan == zzz3b.zzYan && this.zzYar == zzz3b.zzYar && this.zzYed == zzz3b.zzYed && this.zzYas == zzz3b.zzYas && this.zzvP == zzz3b.zzvP && this.zzYam == zzz3b.zzYam && com.aspose.words.internal.zzZKO.equals(this.zzZzD, zzz3b.zzZzD) && com.aspose.words.internal.zzZKO.equals(zzYMW(), zzz3b.zzYMW()) && com.aspose.words.internal.zzZKO.equals(zzYMV(), zzz3b.zzYMV()) && this.zzYak == zzz3b.zzYak && this.zzYal == zzz3b.zzYal;
    }

    public final int getBottomPadding() {
        return this.zzYan;
    }

    public final boolean getFitText() {
        return this.zzYas;
    }

    public final int getLeftPadding() {
        return this.zzYaq;
    }

    public final int getOrientation() {
        return this.zzvP;
    }

    public final int getRightPadding() {
        return this.zzYao;
    }

    public final int getTopPadding() {
        return this.zzYap;
    }

    public final int getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public final void setFitText(boolean z) {
        zzYN6();
        this.zzYas = z;
    }

    public final void setOrientation(int i) {
        zzYN6();
        this.zzvP = i;
    }

    public final void setVerticalAlignment(int i) {
        zzYN6();
        this.mVerticalAlignment = i;
    }

    public final void zzUv(boolean z) {
        zzYN6();
        this.zzYam = z;
    }

    public final void zzUw(boolean z) {
        zzYN6();
        this.zzYed = z;
    }

    public final void zzUx(boolean z) {
        zzYN6();
        this.zzYar = z;
    }

    public final void zzV(PreferredWidth preferredWidth) {
        zzYN6();
        this.zzZzD = preferredWidth;
    }

    public final void zzX(zzZ3C zzz3c) {
        zzYN6();
        this.zzYau = zzz3c;
    }

    public final void zzY(zzZ34 zzz34) {
        zzYN6();
        this.zzYat = zzz34;
    }

    public final boolean zzYMU() {
        return this.zzYam;
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

    public final boolean zzYMX() {
        return this.zzYed;
    }

    public final boolean zzYMY() {
        return this.zzYar;
    }

    public final PreferredWidth zzYMZ() {
        return this.zzZzD;
    }

    public final int zzYN0() {
        return this.zzYak;
    }

    public final int zzYN1() {
        return this.zzYal;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzwB(this.mVerticalAlignment);
        zzwB(this.zzYaq);
        zzwB(this.zzYap);
        zzwB(this.zzYao);
        zzwB(this.zzYan);
        zzUC(this.zzYar);
        zzUC(this.zzYed);
        zzUC(this.zzYas);
        zzwB(this.zzvP);
        zzUC(this.zzYam);
        zzZp(this.zzZzD);
        zzZp(zzYMW());
        zzZp(zzYMV());
        zzwB(this.zzYal);
        zzwB(this.zzYak);
    }

    public final void zzws(int i) {
        zzYN6();
        this.zzYan = i;
    }

    public final void zzwt(int i) {
        zzYN6();
        this.zzYak = i;
    }

    public final void zzwu(int i) {
        zzYN6();
        this.zzYao = i;
    }

    public final void zzwv(int i) {
        zzYN6();
        this.zzYap = i;
    }

    public final void zzww(int i) {
        zzYN6();
        this.zzYal = i;
    }

    public final void zzwx(int i) {
        zzYN6();
        this.zzYaq = i;
    }

    public static zzZ3B zzY(zzZ3B zzz3b) {
        if (zzz3b == null) {
            return new zzZ3B(null);
        }
        zzZ3B zzz3b2 = new zzZ3B(zzz3b.zzZoP());
        zzz3b2.setVerticalAlignment(zzz3b.mVerticalAlignment);
        zzz3b2.zzwx(zzz3b.zzYaq);
        zzz3b2.zzwv(zzz3b.zzYap);
        zzz3b2.zzwu(zzz3b.zzYao);
        zzz3b2.zzws(zzz3b.zzYan);
        zzz3b2.zzV(zzz3b.zzZzD);
        zzz3b2.zzUx(zzz3b.zzYar);
        zzz3b2.zzUw(zzz3b.zzYed);
        zzz3b2.setFitText(zzz3b.zzYas);
        zzz3b2.setOrientation(zzz3b.zzvP);
        zzz3b2.zzY(zzZ34.zzW(zzz3b.zzYMW()));
        zzz3b2.zzX(zzZ3C.zzY(zzz3b.zzYMV()));
        zzz3b2.zzww(zzz3b.zzYal);
        zzz3b2.zzwt(zzz3b.zzYak);
        zzz3b2.zzUv(zzz3b.zzYam);
        return zzz3b2;
    }
}
