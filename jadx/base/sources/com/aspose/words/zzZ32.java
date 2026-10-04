package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ32 extends zzZ3E {
    private static int zzY6L;
    private static int zzY6M;
    private static int zzY6N;
    private static zzZNU zzY6O;
    private static int zzY6P;
    private static boolean zzY6Q;
    private static int zzY6R;
    private static int zzY6S;
    private static zzZ3D zzY6T;
    private static com.aspose.words.internal.zzPV zzY6U;
    private static com.aspose.words.internal.zzPV zzY6V;
    private static int zzY6W;
    private static int zzY6X;
    private static boolean zzY6Y;
    private static zzZ34 zzYai;
    private String mName;
    private int zzAr;
    private int zzVf;
    private zzZ2Z zzY7b;
    private zzZNU zzY7c;
    private Font[] zzY7d;
    private int zzY7e;
    private int zzY7f;
    private int zzY7g;
    private zzZ3D zzY7h;
    private int zzY7i;
    private com.aspose.words.internal.zzPV zzY7j;
    private int zzY7k;
    private int zzY7l;
    private int zzY7m;
    private int zzY7n;
    private int zzY7o;
    private com.aspose.words.internal.zzPV zzY7p;
    private int zzY7q;
    private int zzY7r;
    private int zzY7s;
    private String zzY7t;
    private com.aspose.words.internal.zzPM zzY7u;
    private int zzY8R;
    private int zzYQF;
    private int zzYQG;
    private zzZYZ zzYSF;
    private com.aspose.words.internal.zzPM zzYX;
    private zzZ34 zzYat;
    private String zzYxm;
    private int zzYyq;
    private int zzYyr;
    private com.aspose.words.internal.zzPV zzZf;
    private com.aspose.words.internal.zzPV zzZo7;
    private int zzp8;
    private static String zzY7a = zzYEF.zzYdx();
    private static final String zzY79 = null;
    private static int zzY78 = com.aspose.words.internal.zzSA.zzm(((Integer) zzYEF.zzOt(190)).intValue());
    private static int zzY77 = com.aspose.words.internal.zzSA.zzm(((Integer) zzYEF.zzOt(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4)).intValue());
    private static int zzY76 = ((Integer) zzYEF.zzOt(220)).intValue();
    private static int zzY75 = 0;
    private static int zzY74 = 0;
    private static com.aspose.words.internal.zzPV zzY73 = (com.aspose.words.internal.zzPV) zzYEF.zzOt(160);
    private static int zzY72 = 0;
    private static int zzY71 = 0;
    private static int zzY70 = 0;
    private static int zzY6Z = 0;

    static {
        zzY6Y = zzYEF.zzOt(StyleIdentifier.PLAIN_TABLE_2) == zzZU.zzZF6;
        zzY6X = -com.aspose.words.internal.zzSA.zzm(((Integer) zzYEF.zzOt(200)).intValue());
        zzY6W = ((Integer) zzYEF.zzOt(140)).intValue();
        zzY6V = (com.aspose.words.internal.zzPV) zzYEF.zzOt(450);
        zzY6U = (com.aspose.words.internal.zzPV) zzYEF.zzOt(20);
        zzYai = new zzZ34(null, true);
        zzY6T = zzZ3D.zzYaA;
        zzY6S = ((Integer) zzYEF.zzOt(StyleIdentifier.GRID_TABLE_4_ACCENT_2)).intValue();
        zzY6R = ((Integer) zzYEF.zzOt(150)).intValue() * 50;
        zzY6Q = zzYEF.zzOt(StyleIdentifier.LIST_TABLE_2_ACCENT_1) == zzZU.zzZF6;
        zzY6P = ((Integer) zzYEF.zzOt(45)).intValue();
        zzY6O = zzZNU.zzYyn;
        zzY6N = 0;
        zzY6M = 0;
        zzY6L = 0;
    }

    public zzZ32(zzX6 zzx6, zzZYZ zzzyz) {
        super(zzx6);
        this.mName = zzY7a;
        this.zzYxm = "";
        this.zzY7t = zzY79;
        this.zzVf = zzY78;
        this.zzY7s = zzY77;
        this.zzY7r = zzY76;
        this.zzAr = zzY75;
        this.zzY7q = zzY74;
        this.zzZf = zzY73;
        this.zzY7p = com.aspose.words.internal.zzPV.zzKa;
        this.zzY7o = zzY72;
        this.zzY7n = zzY71;
        this.zzY7m = zzY70;
        this.zzY7l = zzY6Z;
        this.zzp8 = zzY6X;
        this.zzY7k = zzY6W;
        this.zzZo7 = zzY6V;
        this.zzY7j = zzY6U;
        this.zzYyr = zzY6S;
        this.zzYyq = zzY6R;
        this.zzY7i = zzY6P;
        this.zzYat = zzYai;
        this.zzY7h = zzY6T;
        this.zzY7g = zzY6M;
        this.zzY7f = zzY6N;
        this.zzY7e = zzY6L;
        this.zzY7d = new Font[3];
        this.zzY7c = zzY6O;
        this.zzY8R = zzYKB();
        this.zzYSF = zzzyz;
    }

    private boolean isFormatRevision() {
        return (this.zzY8R & 512) != 0;
    }

    private void zzT(boolean z, int i) {
        if (z) {
            this.zzY8R |= i;
        } else {
            this.zzY8R &= ~i;
        }
    }

    public static zzZ32 zzX(zzZ32 zzz32) {
        if (zzz32 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: pr");
        }
        zzZ32 zzz322 = new zzZ32(zzz32.zzZoP(), zzz32.zzYSF);
        zzz322.setName(zzz32.mName);
        zzz322.setAltName(zzz32.zzYxm);
        zzz322.setSize(zzz32.zzVf);
        zzz322.zzvA(zzz32.zzY7s);
        zzz322.zzWN(zzz32.zzAr);
        zzz322.zzvy(zzz32.zzY7q);
        zzz322.zzvz(zzz32.zzY7r);
        zzz322.zzY(zzz32.zzZf);
        zzz322.zzZX(zzz32.zzY7p);
        zzz322.zzvx(zzz32.zzY7o);
        zzz322.zzvw(zzz32.zzY7n);
        zzz322.zzvv(zzz32.zzY7m);
        zzz322.zzvu(zzz32.zzY7l);
        zzz322.setPosition(zzz32.zzp8);
        zzz322.setUnderline(zzz32.zzY7k);
        zzz322.zzZW(zzz32.zzZo7);
        zzz322.zzZV(zzz32.zzY7j);
        zzz322.zzY(zzZ34.zzW(zzz32.zzYMW()));
        zzz322.zzV(zzZ3D.zzW(zzz32.zzYKO()));
        zzz322.setLocaleIdFarEast(zzz32.zzYQF);
        zzz322.setLocaleId(zzz32.zzYQG);
        zzz322.zzvt(zzz32.zzYyr);
        zzz322.setSpacing(zzz32.zzYyq);
        zzz322.zzY8R = zzz32.zzY8R;
        return zzz322;
    }

    private static int zzYKB() {
        int i = zzY6Y ? 128 : 0;
        return zzY6Q ? i | 4096 : i;
    }

    private int zzYKC() {
        return (!((zzZz() && zzYKQ()) || zzYKS()) || (zzYL2() & 2) == 0) ? zzYL2() : zzYL2() ^ 2;
    }

    private boolean zzYKH() {
        return (this.zzY8R & 32768) != 0;
    }

    private boolean zzYKQ() {
        return (this.zzY8R & 256) != 0;
    }

    private boolean zzYKS() {
        return (this.zzY8R & 131072) != 0;
    }

    private boolean zzp7() {
        return (this.zzY8R & 65536) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ32 zzz32 = (zzZ32) obj;
        String str = this.mName;
        String str2 = zzz32.mName;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzX(str, str2, i) && com.aspose.words.internal.zzZKN.zzX(this.zzYxm, zzz32.zzYxm, i) && com.aspose.words.internal.zzZKN.zzX(this.zzY7t, zzz32.zzY7t, i) && com.aspose.words.internal.zzPV.zzZ(this.zzZf, zzz32.zzZf) && com.aspose.words.internal.zzPV.zzZ(this.zzY7p, zzz32.zzY7p) && this.zzY7o == zzz32.zzY7o && this.zzY7n == zzz32.zzY7n && this.zzY7m == zzz32.zzY7m && this.zzY7l == zzz32.zzY7l && this.zzY8R == zzz32.zzY8R && this.zzp8 == zzz32.zzp8 && this.zzY7k == zzz32.zzY7k && com.aspose.words.internal.zzPV.zzZ(this.zzZo7, zzz32.zzZo7) && com.aspose.words.internal.zzPV.zzZ(this.zzY7j, zzz32.zzY7j) && this.zzYyr == zzz32.zzYyr && this.zzYyq == zzz32.zzYyq && this.zzY7i == zzz32.zzY7i && zzYKO().equals(zzz32.zzYKO()) && com.aspose.words.internal.zzZKO.equals(zzYMW(), zzz32.zzYMW()) && zzYL5() == zzz32.zzYL5() && this.zzY7r == zzz32.zzY7r && zzYL2() == zzz32.zzYL2() && this.zzYQF == zzz32.zzYQF && this.zzYQG == zzz32.zzYQG && this.zzY7g == zzz32.zzY7g && this.zzY7f == zzz32.zzY7f && this.zzY7e == zzz32.zzY7e && com.aspose.words.internal.zzZKO.equals(zzYKL(), zzz32.zzYKL()) && zzZNU.zzZ(this.zzY7c, zzz32.zzY7c);
    }

    public final String getAltName() {
        return this.zzYxm;
    }

    public final int getLocaleId() {
        return this.zzYQG;
    }

    public final int getLocaleIdFarEast() {
        return this.zzYQF;
    }

    public final String getName() {
        return this.mName;
    }

    public final int getPosition() {
        return this.zzp8;
    }

    public final int getSize() {
        return this.zzVf;
    }

    public final boolean getSnapToGrid() {
        return (this.zzY8R & 4096) != 0;
    }

    public final int getSpacing() {
        return this.zzYyq;
    }

    public final int getUnderline() {
        return this.zzY7k;
    }

    public final boolean isBold() {
        return (zzYL2() & 1) != 0;
    }

    public final boolean isDeleteRevision() {
        return (this.zzY8R & 4) != 0;
    }

    public final boolean isHidden() {
        return (this.zzY8R & 1) != 0;
    }

    public final boolean isInsertRevision() {
        return (this.zzY8R & 8) != 0;
    }

    public final boolean isItalic() {
        return (zzYL2() & 2) != 0;
    }

    public final boolean isMoveFromRevision() {
        return (this.zzY8R & 16) != 0;
    }

    public final boolean isMoveToRevision() {
        return (this.zzY8R & 32) != 0;
    }

    public final void setAltName(String str) {
        zzYN6();
        this.zzYxm = com.aspose.words.internal.zzJF.zzZJ(str);
    }

    public final void setLocaleId(int i) {
        zzYN6();
        this.zzYQG = i;
    }

    public final void setLocaleIdFarEast(int i) {
        zzYN6();
        this.zzYQF = i;
    }

    public final void setName(String str) {
        zzYN6();
        this.mName = com.aspose.words.internal.zzJF.zzZJ(str);
    }

    public final void setPosition(int i) {
        zzYN6();
        this.zzp8 = i;
    }

    public final void setSize(int i) {
        zzYN6();
        this.zzVf = i;
    }

    public final void setSnapToGrid(boolean z) {
        zzYN6();
        zzT(z, 4096);
    }

    public final void setSpacing(int i) {
        zzYN6();
        this.zzYyq = i;
    }

    public final void setUnderline(int i) {
        zzYN6();
        this.zzY7k = i;
    }

    public final boolean zz6c() {
        return (this.zzY8R & 1024) != 0;
    }

    public final void zzH(boolean z, boolean z2) {
        if (z && zzZ7e().isPrinterAvailable()) {
            zzT(true, 2048);
            zzT(z2, 32768);
        }
    }

    public final void zzIY(String str) {
        zzYN6();
        this.zzY7t = com.aspose.words.internal.zzJF.zzZJ(str);
        this.zzY7u = null;
    }

    public final void zzTA(boolean z) {
        if (!z || zzYKJ()) {
            return;
        }
        zzT(true, 65536);
    }

    public final void zzTB(boolean z) {
        zzYN6();
        zzT(z, 1024);
    }

    public final void zzTC(boolean z) {
        zzYN6();
        zzT(z, 256);
    }

    public final void zzTD(boolean z) {
        zzYN6();
        zzT(z, 128);
    }

    public final void zzTE(boolean z) {
        zzYN6();
        zzT(z, 32);
    }

    public final void zzTF(boolean z) {
        zzYN6();
        zzT(z, 16);
    }

    public final void zzTG(boolean z) {
        zzYN6();
        zzT(z, 512);
    }

    public final void zzTH(boolean z) {
        zzYN6();
        zzT(z, 8);
    }

    public final void zzTI(boolean z) {
        zzYN6();
        zzT(z, 4);
    }

    public final void zzTJ(boolean z) {
        zzYN6();
        zzT(z, 2);
    }

    public final void zzTN(boolean z) {
        zzYN6();
        zzT(z, 64);
    }

    public final void zzTy(boolean z) {
        zzYN6();
        zzT(z, 16384);
    }

    public final void zzTz(boolean z) {
        zzYN6();
        zzT(z, 8192);
    }

    public final void zzV(zzZ3D zzz3d) {
        zzYN6();
        this.zzY7h = zzz3d;
    }

    public final Font zzW(int i, byte b) {
        Font fontZzZ7o = Font.zzZ7o();
        fontZzZ7o.setName(this.mName);
        fontZzZ7o.setSize(this.zzVf / 1000.0f);
        fontZzZ7o.zzm(this.zzZf);
        fontZzZ7o.setBold(isBold());
        fontZzZ7o.setItalic(isItalic());
        fontZzZ7o.setHidden(isHidden());
        fontZzZ7o.setUnderline(this.zzY7k);
        fontZzZ7o.zz9(this.zzZo7);
        fontZzZ7o.setPosition(this.zzp8 / 1000.0f);
        fontZzZ7o.setAllCaps(this.zzY7o == 1);
        fontZzZ7o.setSmallCaps(this.zzY7o == 2);
        fontZzZ7o.setSuperscript(this.zzY7n == 1);
        fontZzZ7o.setSubscript(this.zzY7n == 2);
        fontZzZ7o.setStrikeThrough(this.zzY7l == 1);
        fontZzZ7o.setDoubleStrikeThrough(this.zzY7l == 2);
        fontZzZ7o.setEmboss(this.zzY7m == 1);
        fontZzZ7o.setEngrave(this.zzY7m == 2);
        int i2 = this.zzY7m;
        fontZzZ7o.setOutline(i2 == 4 || i2 == 12);
        int i3 = this.zzY7m;
        fontZzZ7o.setShadow(i3 == 8 || i3 == 12);
        fontZzZ7o.setScaling(i);
        fontZzZ7o.zzBm(this.zzYyq / 50);
        if (b != 0) {
            fontZzZ7o.zz8(this.zzY7j);
            fontZzZ7o.getShading().zzZJ(zzYMW().zzOL());
            fontZzZ7o.getShading().zzZK(zzYMW().zzOK());
            fontZzZ7o.getShading().setTexture(zzYMW().getTexture());
            if (b != 1) {
                fontZzZ7o.getBorder().setLineWidth(zzYKO().zzu4());
                fontZzZ7o.getBorder().zzOV(zzYKO().getLineStyle());
                fontZzZ7o.getBorder().zzm(zzYKO().zzZy());
                fontZzZ7o.getBorder().setDistanceFromText(zzYKO().zzZSd());
                fontZzZ7o.getBorder().setShadow(zzYKO().zzYN4());
                fontZzZ7o.getBorder().zzYO(zzYKO().isFrame());
                return fontZzZ7o;
            }
        }
        return fontZzZ7o;
    }

    public final void zzWN(int i) {
        zzYN6();
        this.zzAr = i;
    }

    public final void zzY(com.aspose.words.internal.zzPV zzpv) {
        zzYN6();
        this.zzZf = zzpv.zzPF();
    }

    public final int zzYKD() {
        return this.zzY7e;
    }

    public final int zzYKE() {
        return this.zzY7f;
    }

    public final int zzYKF() {
        return this.zzY7g;
    }

    public final boolean zzYKG() {
        return (this.zzY8R & 16384) != 0;
    }

    public final boolean zzYKI() {
        return (this.zzY8R & 2048) != 0;
    }

    public final boolean zzYKJ() {
        return (this.zzY8R & 8192) != 0;
    }

    public final zzZNU zzYKK() {
        return this.zzY7c;
    }

    public final zzZ2Z zzYKL() {
        zzZ2Z zzz2z = this.zzY7b;
        return zzz2z == null ? zzZ2Z.zzY6r : zzz2z;
    }

    public final int zzYKM() {
        int i;
        float f;
        float f2;
        int i2 = this.zzY7n;
        if (2 == i2) {
            f = this.zzVf;
            f2 = 0.15f;
        } else {
            if (1 != i2) {
                i = 0;
                return i + this.zzp8;
            }
            f = this.zzVf;
            f2 = -0.303f;
        }
        i = (int) (f * f2);
        return i + this.zzp8;
    }

    public final com.aspose.words.internal.zzPM zzYKN() {
        if (this.zzY7u == null && this.zzYSF != null) {
            float fZzYL5 = zzYL5() / 1000.0f;
            String str = this.zzY7t;
            if (str != null) {
                this.zzY7u = this.zzYSF.zzZ(str, fZzYL5, zzYL2(), zzYL2(), zzp7());
            }
            if (this.zzY7u == null) {
                this.zzY7u = this.zzYSF.zzZ(this.mName, fZzYL5, zzYL2(), zzYL2(), zzp7());
            }
            com.aspose.words.internal.zzPM zzpm = this.zzY7u;
            zzZ(zzpm, zzpm.zzPg());
        }
        return this.zzY7u;
    }

    public final zzZ3D zzYKO() {
        zzZ3D zzz3d = this.zzY7h;
        return zzz3d == null ? zzZ3D.zzYaA : zzz3d;
    }

    public final com.aspose.words.internal.zzPV zzYKP() {
        return this.zzY7j;
    }

    public final void zzYKR() {
        zzYN6();
        zzT(true, 131072);
    }

    public final boolean zzYKT() {
        return (this.zzY8R & 128) != 0;
    }

    public final boolean zzYKU() {
        return isDeleteRevision() || isInsertRevision() || isFormatRevision() || isMoveFromRevision() || isMoveToRevision();
    }

    public final boolean zzYKV() {
        return (this.zzY8R & 2) != 0;
    }

    public final int zzYKW() {
        return this.zzY7l;
    }

    public final int zzYKX() {
        return this.zzY7m;
    }

    public final int zzYKY() {
        return this.zzY7n;
    }

    public final boolean zzYKZ() {
        int i = this.zzY7o;
        return i == 2 || i == 1;
    }

    public final int zzYL0() {
        return this.zzY7o;
    }

    public final com.aspose.words.internal.zzPV zzYL1() {
        return this.zzY7p;
    }

    public final int zzYL2() {
        return (zzZz() || zzYKT()) ? this.zzY7q : this.zzAr;
    }

    public final boolean zzYL3() {
        int i = this.zzY7r;
        return i != 0 && i <= zzYL5();
    }

    public final int zzYL4() {
        return this.zzY7r;
    }

    public final int zzYL5() {
        return (zzZz() || zzYKT()) ? this.zzY7s : this.zzVf;
    }

    public final int zzYL6() {
        return this.zzY7s;
    }

    public final String zzYL7() {
        return this.zzY7t;
    }

    public final zzZ34 zzYMW() {
        zzZ34 zzz34 = this.zzYat;
        return zzz34 == null ? zzZ34.zzY7F : zzz34;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzZp(this.mName);
        zzZp(this.zzYxm);
        zzZp(this.zzY7t);
        zzZY(this.zzZf);
        zzZY(this.zzY7p);
        zzwB(this.zzY7o);
        zzwB(this.zzY7n);
        zzwB(this.zzY7m);
        zzwB(this.zzY7l);
        zzwB(this.zzp8);
        zzwB(this.zzY7k);
        zzZY(this.zzZo7);
        zzZY(this.zzY7j);
        zzwB(this.zzYyr);
        zzwB(this.zzYyq);
        zzwB(this.zzY7i);
        zzwB(zzYKO().hashCode());
        zzwB(zzYMW().hashCode());
        zzwB(this.zzYQF);
        zzwB(this.zzYQG);
        zzwB(this.zzY7r);
        zzwB(this.zzY7g);
        zzwB(this.zzY7f);
        zzwB(this.zzY7e);
        zzwB(this.zzY8R);
        zzwB(zzYL5());
        zzwB(zzYL2());
        zzZp(zzYKL());
        zzwB(this.zzY7c.hashCode());
    }

    public final void zzZ(zzZ2Z zzz2z) {
        zzYN6();
        this.zzY7b = zzz2z;
    }

    public final PrinterMetrics zzZ7e() {
        if (zzZoP().zzZAv == null) {
            zzZoP().zzZAv = new PrinterMetrics();
        }
        return zzZoP().zzZAv;
    }

    public final int zzZ9q() {
        return this.zzYyr;
    }

    public final int zzZUF() {
        return this.zzY7i;
    }

    public final com.aspose.words.internal.zzPV zzZUc() {
        return this.zzZo7;
    }

    public final void zzZV(com.aspose.words.internal.zzPV zzpv) {
        zzYN6();
        this.zzY7j = zzpv;
    }

    public final void zzZW(com.aspose.words.internal.zzPV zzpv) {
        zzYN6();
        this.zzZo7 = zzpv.zzPF();
    }

    public final void zzZX(com.aspose.words.internal.zzPV zzpv) {
        zzYN6();
        this.zzY7p = new com.aspose.words.internal.zzPV(255, zzpv);
    }

    public final com.aspose.words.internal.zzPM zzZr() {
        if (this.zzYX == null) {
            int i = this.zzY7o;
            boolean z = i == 2 || i == 3;
            int i2 = this.zzY7n;
            com.aspose.words.internal.zzPM zzpmZzZ = this.zzYSF.zzZ(this.mName, zzYL5() / 1000.0f, zzYL2(), zzYKC(), zz6c(), zzp7(), z, i2 == 1, i2 == 2);
            this.zzYX = zzpmZzZ;
            zzZ(zzpmZzZ, zzpmZzZ.zzPg());
        }
        return this.zzYX;
    }

    public final com.aspose.words.internal.zzPV zzZy() {
        return this.zzZf;
    }

    public final boolean zzZz() {
        return (this.zzY8R & 64) != 0;
    }

    public final Font zzp(byte b) {
        Font[] fontArr = this.zzY7d;
        Font font = fontArr[b];
        if (font != null) {
            return font;
        }
        Font fontZzW = zzW(this.zzYyr, b);
        fontArr[b] = fontZzW;
        return fontZzW;
    }

    public final void zzvA(int i) {
        zzYN6();
        this.zzY7s = i;
    }

    public final void zzvp(int i) {
        zzYN6();
        this.zzY7e = i;
    }

    public final void zzvq(int i) {
        zzYN6();
        this.zzY7f = i;
    }

    public final void zzvr(int i) {
        zzYN6();
        this.zzY7g = i;
    }

    public final void zzvs(int i) {
        zzYN6();
        this.zzY7i = i;
    }

    public final void zzvt(int i) {
        zzYN6();
        this.zzYyr = i;
    }

    public final void zzvu(int i) {
        zzYN6();
        this.zzY7l = i;
    }

    public final void zzvv(int i) {
        zzYN6();
        this.zzY7m = i;
    }

    public final void zzvw(int i) {
        zzYN6();
        this.zzY7n = i;
    }

    public final void zzvx(int i) {
        zzYN6();
        this.zzY7o = i;
    }

    public final void zzvy(int i) {
        zzYN6();
        this.zzY7q = i;
    }

    public final void zzvz(int i) {
        zzYN6();
        this.zzY7r = i;
    }

    public final void isHidden(boolean z) {
        zzYN6();
        zzT(z, 1);
    }

    private void zzZ(com.aspose.words.internal.zzPM zzpm, float f) {
        if (zzYKI() && zzZ7e().hasMetricsForFont(zzpm.zzPl().zzPh())) {
            zzpm.zzZ(zzZ7e().getPrinterFontMetrics(zzpm.zzPl().zzPh(), f, zzpm.zzPl().getStyle(), zzYKH()));
        }
    }

    public final void zzY(zzZ34 zzz34) {
        zzYN6();
        this.zzYat = zzz34;
    }

    public final boolean zzY(zzZ32 zzz32) {
        return zzz32 != null && com.aspose.words.internal.zzZKO.equals(zzYKL(), zzz32.zzYKL()) && com.aspose.words.internal.zzAN.zzS(zzZr().zzPg(), zzz32.zzZr().zzPg()) && com.aspose.words.internal.zzZKO.equals(zzZr().zzPl().zzpw(), zzz32.zzZr().zzPl().zzpw());
    }

    public final void zzY(zzZNU zzznu) {
        zzYN6();
        this.zzY7c = zzznu;
    }

    public static zzZ32 zzW(zzZ32 zzz32) {
        if (zzz32 != null) {
            if (zzz32.zzZoP() == null || zzz32.isCached()) {
                return zzz32;
            }
            zzZ32 zzz322 = (zzZ32) com.aspose.words.internal.zzQW.zzZ((Map<zzZ32, TValue>) zzz32.zzZoP().zzZAF, zzz32);
            if (zzz322 != null) {
                return zzz322;
            }
            com.aspose.words.internal.zzZQF.zzY(zzz32.zzZoP().zzZAF, zzz32, zzz32);
            return zzz32;
        }
        throw new IllegalArgumentException("src");
    }
}
