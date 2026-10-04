package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ37 extends zzZ3E {
    private static boolean zzY8A;
    private static boolean zzY8B;
    private static boolean zzY8C;
    private static boolean zzY8D;
    private static boolean zzY8E;
    private static boolean zzY8F;
    private static int zzY8G;
    private static int zzY8H;
    private static int zzY8I;
    private static int zzY8J;
    private static int zzY8K;
    private static int zzY8L;
    private static int zzY8M;
    private static int zzY8N;
    private static int zzY8O;
    private static int zzY8P;
    private static int zzY8Q;
    static zzZ39 zzY8m;
    private static zzZ38 zzY8n;
    private static zzZ31 zzY8o;
    private static int zzY8p;
    private static int zzY8q;
    private static int zzY8r;
    private static boolean zzY8s;
    private static boolean zzY8t;
    private static boolean zzY8u;
    private static boolean zzY8v;
    private static boolean zzY8w;
    private static boolean zzY8x;
    private static boolean zzY8y;
    private static boolean zzY8z;
    private static int zzY9c;
    private static zzZ34 zzYai;
    private static zzZ3C zzYaj;
    private int zzBb;
    private int zzUG;
    private int zzY8R;
    private zzZ38 zzY8S;
    private zzZ31 zzY8T;
    private zzZ39 zzY8U;
    private int zzY8V;
    private int zzY8W;
    private int zzY8X;
    private int zzY8Y;
    private int zzY8Z;
    private int zzY90;
    private int zzY91;
    private int zzY92;
    private int zzY93;
    private int zzY94;
    private int zzY95;
    private int zzY96;
    private int zzY97;
    private int zzY98;
    private int zzY99;
    private int zzY9a;
    private zzZ34 zzYat;
    private zzZ3C zzYau;
    private int zzsA;

    static {
        int iIntValue = ((Integer) zzYMX.zzOt(1175)).intValue();
        zzY8Q = iIntValue;
        if (iIntValue != 0) {
            zzY8t = true;
        } else {
            zzY8Q = ((Integer) zzYMX.zzOt(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue() * 50;
        }
        zzY8P = ((Integer) zzYMX.zzOt(1160)).intValue() * 50;
        zzY8O = ((Integer) zzYMX.zzOt(EditingLanguage.BRETON)).intValue() * 50;
        zzY8N = ((Integer) zzYMX.zzOt(1592)).intValue() * 50;
        zzY8M = ((Integer) zzYMX.zzOt(1593)).intValue() * 50;
        zzY8L = ((zzZ52) zzYMX.zzOt(1650)).getValue() * 50;
        zzY8K = ((zzZ52) zzYMX.zzOt(1650)).zzZ4A();
        zzY8J = ((Integer) zzYMX.zzOt(1200)).intValue() * 50;
        zzY8I = ((Integer) zzYMX.zzOt(1205)).intValue() * 50;
        zzY8H = ((Integer) zzYMX.zzOt(1220)).intValue() * 50;
        zzY8G = ((Integer) zzYMX.zzOt(1225)).intValue() * 50;
        zzY8E = ((Boolean) zzYMX.zzOt(EditingLanguage.ITALIAN_ITALY)).booleanValue();
        zzY8D = ((Boolean) zzYMX.zzOt(1050)).booleanValue();
        zzY8C = ((Boolean) zzYMX.zzOt(EditingLanguage.SLOVENIAN)).booleanValue();
        zzY8B = ((Boolean) zzYMX.zzOt(1470)).booleanValue();
        zzY8A = ((Boolean) zzYMX.zzOt(1022)).booleanValue();
        zzY8z = ((Boolean) zzYMX.zzOt(EditingLanguage.SORBIAN)).booleanValue();
        zzY8y = ((Boolean) zzYMX.zzOt(EditingLanguage.TURKMEN)).booleanValue();
        zzY8x = ((Boolean) zzYMX.zzOt(EditingLanguage.FAEROESE)).booleanValue();
        zzY8w = ((Boolean) zzYMX.zzOt(1240)).booleanValue();
        zzY8v = ((Boolean) zzYMX.zzOt(1250)).booleanValue();
        zzY8q = ((Integer) zzYMX.zzOt(1510)).intValue();
        zzY8u = ((Boolean) zzYMX.zzOt(1560)).booleanValue();
        zzY8s = ((Boolean) zzYMX.zzOt(1270)).booleanValue();
        zzY8r = ((Integer) zzYMX.zzOt(1000)).intValue();
        zzY9c = ((Integer) zzYMX.zzOt(PointerIconCompat.TYPE_GRAB)).intValue();
        zzY8F = ((Boolean) zzYMX.zzOt(EditingLanguage.YORUBA)).booleanValue();
        zzY8p = ((Integer) zzYMX.zzOt(1280)).intValue();
        zzYai = new zzZ34(null, true);
        zzYaj = new zzZ3C(null, true);
        zzY8o = new zzZ31(null, true);
        zzY8n = new zzZ38(null, true);
        zzZ39 zzz39 = new zzZ39(null, false);
        zzY8m = zzz39;
        zzz39.setOrientation(((Integer) zzYMX.zzOt(1480)).intValue());
        zzY8m.setWidth(((Integer) zzYMX.zzOt(1310)).intValue() * 50);
        zzZKP zzzkp = (zzZKP) zzYMX.zzOt(1430);
        zzY8m.setHeight(zzZ39.zzWN(zzzkp.getValue(), zzzkp.zzZ4A()));
        zzY8m.setWrapType(((Integer) zzYMX.zzOt(1340)).intValue());
        zzY8m.setLeft(((Integer) zzYMX.zzOt(1292)).intValue() * 50);
        zzY8m.setTop(((Integer) zzYMX.zzOt(1302)).intValue() * 50);
        zzY8m.zzwe(((Integer) zzYMX.zzOt(1320)).intValue());
        zzY8m.setHorizontalAlignment(((Integer) zzYMX.zzOt(1290)).intValue());
        zzY8m.zzwd(((Integer) zzYMX.zzOt(1330)).intValue());
        zzY8m.setVerticalAlignment(((Integer) zzYMX.zzOt(1300)).intValue());
        zzY8m.zzwi(((Integer) zzYMX.zzOt(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).intValue() * 50);
        zzY8m.zzwh(((Integer) zzYMX.zzOt(1490)).intValue() * 50);
        zzZ39 zzz392 = zzY8m;
        zzz392.zzwg(zzz392.zzYMk());
        zzZ39 zzz393 = zzY8m;
        zzz393.zzwf(zzz393.zzYMj());
        zzY8m.setAllowOverlap(true ^ ((Boolean) zzYMX.zzOt(1660)).booleanValue());
        zzY8m.zzYN9();
    }

    public zzZ37(zzX6 zzx6) {
        super(zzx6);
        this.zzY9a = zzY8Q;
        this.zzY99 = zzY8P;
        this.zzY98 = zzY8O;
        this.zzY97 = zzY8N;
        this.zzY96 = zzY8M;
        this.zzBb = zzY8L;
        this.zzY95 = zzY8K;
        this.zzY94 = zzY8J;
        this.zzY93 = zzY8I;
        this.zzY92 = zzY8H;
        this.zzY91 = zzY8G;
        this.zzY90 = zzY8r;
        this.zzY8Z = 0;
        this.zzY8Y = -1;
        this.zzY8X = -1;
        this.zzY8W = -1;
        this.zzUG = zzY9c;
        this.zzY8V = zzY8q;
        this.zzsA = zzY8p;
        this.zzYat = zzYai;
        this.zzYau = zzYaj;
        this.zzY8U = zzY8m;
        this.zzY8T = zzY8o;
        this.zzY8S = zzY8n;
        this.zzY8R = zzYLB();
    }

    private void zzT(boolean z, int i) {
        if (z) {
            this.zzY8R |= i;
        } else {
            this.zzY8R &= (int) (~i);
        }
    }

    private static int zzYLB() {
        int i = zzY8F ? 2 : 0;
        if (zzY8E) {
            i |= 4;
        }
        if (zzY8D) {
            i |= 8;
        }
        if (zzY8C) {
            i |= 16;
        }
        if (zzY8B) {
            i |= 32;
        }
        if (zzY8A) {
            i |= 64;
        }
        if (zzY8z) {
            i |= 128;
        }
        if (zzY8y) {
            i |= 256;
        }
        if (zzY8x) {
            i |= 512;
        }
        if (zzY8w) {
            i |= 1024;
        }
        if (zzY8v) {
            i |= 2048;
        }
        if (zzY8u) {
            i |= 4096;
        }
        int i2 = i | 8192;
        if (zzY8t) {
            i2 = 73728 | i;
        }
        return zzY8s ? 2097152 | i2 : i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ37 zzz37 = (zzZ37) obj;
        return this.zzY9a == zzz37.zzY9a && this.zzY99 == zzz37.zzY99 && this.zzY98 == zzz37.zzY98 && this.zzY94 == zzz37.zzY94 && this.zzY93 == zzz37.zzY93 && this.zzY92 == zzz37.zzY92 && this.zzY91 == zzz37.zzY91 && this.zzY97 == zzz37.zzY97 && this.zzY96 == zzz37.zzY96 && this.zzBb == zzz37.zzBb && this.zzUG == zzz37.zzUG && this.zzY95 == zzz37.zzY95 && this.zzY90 == zzz37.zzY90 && zzYLQ() == zzz37.zzYLQ() && this.zzY8X == zzz37.zzY8X && this.zzY8W == zzz37.zzY8W && this.zzsA == zzz37.zzsA && this.zzY8V == zzz37.zzY8V && com.aspose.words.internal.zzZKO.equals(zzYMW(), zzz37.zzYMW()) && com.aspose.words.internal.zzZKO.equals(zzYMV(), zzz37.zzYMV()) && com.aspose.words.internal.zzZKO.equals(zzTV(true), zzz37.zzTV(true)) && com.aspose.words.internal.zzZKO.equals(zzYLI(), zzz37.zzYLI()) && com.aspose.words.internal.zzZKO.equals(zzYLL(), zzz37.zzYLL()) && this.zzY8Z == zzz37.zzY8Z && this.zzY8R == zzz37.zzY8R;
    }

    public final boolean getAddSpaceBetweenFarEastAndAlpha() {
        return (this.zzY8R & 1024) != 0;
    }

    public final boolean getAddSpaceBetweenFarEastAndDigit() {
        return (this.zzY8R & 2048) != 0;
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    public final int getBaselineAlignment() {
        return this.zzY8V;
    }

    public final int getLineSpacingRule() {
        return this.zzY95;
    }

    public final int getOutlineLevel() {
        return this.zzsA;
    }

    public final boolean getSnapToGrid() {
        return (this.zzY8R & 8192) != 0;
    }

    public final boolean getSuppressAutoHyphens() {
        return (this.zzY8R & 1048576) != 0;
    }

    public final boolean getWordWrap() {
        return (this.zzY8R & 512) != 0;
    }

    public final boolean isList() {
        zzZ38 zzz38 = this.zzY8S;
        return (zzz38 == null || zzz38.getId() == 0) ? false : true;
    }

    public final void setAddSpaceBetweenFarEastAndAlpha(boolean z) {
        zzYN6();
        zzT(z, 1024);
    }

    public final void setAddSpaceBetweenFarEastAndDigit(boolean z) {
        zzYN6();
        zzT(z, 2048);
    }

    public final void setAlignment(int i) {
        zzYN6();
        this.zzUG = i;
    }

    public final void setBaselineAlignment(int i) {
        zzYN6();
        this.zzY8V = i;
    }

    public final void setLineSpacingRule(int i) {
        zzYN6();
        this.zzY95 = i;
    }

    public final void setOutlineLevel(int i) {
        zzYN6();
        this.zzsA = i;
    }

    public final void setSnapToGrid(boolean z) {
        zzYN6();
        zzT(z, 8192);
    }

    public final void setSuppressAutoHyphens(boolean z) {
        zzYN6();
        zzT(z, 1048576);
    }

    public final void setWordWrap(boolean z) {
        zzYN6();
        zzT(z, 512);
    }

    public final int zzHT() {
        return this.zzBb;
    }

    public final void zzTU(boolean z) {
        zzYN6();
        zzT(z, 16384);
    }

    public final zzZ39 zzTV(boolean z) {
        if (this.zzY8U == null && z) {
            zzZ39 zzz39 = new zzZ39(zzZoP(), false);
            this.zzY8U = zzz39;
            zzz39.setOrientation(zzY8m.getOrientation());
            this.zzY8U.setWidth(zzY8m.getWidth());
            this.zzY8U.setHeight(zzY8m.getHeight());
            this.zzY8U.setWrapType(zzY8m.getWrapType());
            this.zzY8U.setLeft(zzY8m.getLeft());
            this.zzY8U.setTop(zzY8m.getTop());
            this.zzY8U.zzwe(zzY8m.zzYMf());
            this.zzY8U.setHorizontalAlignment(zzY8m.getHorizontalAlignment());
            this.zzY8U.zzwd(zzY8m.zzYMd());
            this.zzY8U.setVerticalAlignment(zzY8m.getVerticalAlignment());
            this.zzY8U.zzwi(zzY8m.zzYMk());
            this.zzY8U.zzwh(zzY8m.zzYMj());
            this.zzY8U.zzwg(zzY8m.zzYMi());
            this.zzY8U.zzwf(zzY8m.zzYMh());
        }
        return this.zzY8U;
    }

    public final void zzTW(boolean z) {
        zzYN6();
        zzT(z, 4096);
    }

    public final void zzTX(boolean z) {
        zzYN6();
        zzT(z, 256);
    }

    public final void zzTY(boolean z) {
        zzYN6();
        zzT(z, 128);
    }

    public final void zzTZ(boolean z) {
        zzYN6();
        zzT(z, 2);
    }

    public final void zzU0(boolean z) {
        zzYN6();
        zzT(z, 64);
    }

    public final void zzU1(boolean z) {
        zzYN6();
        zzT(z, 32);
    }

    public final void zzU2(boolean z) {
        zzYN6();
        zzT(z, 16);
    }

    public final void zzU3(boolean z) {
        zzYN6();
        zzT(z, 8);
    }

    public final void zzU4(boolean z) {
        zzYN6();
        zzT(z, 4);
    }

    public final void zzU5(boolean z) {
        zzYN6();
        zzT(z, 2097152);
    }

    public final void zzU6(boolean z) {
        zzYN6();
        zzT(z, 262144);
    }

    public final void zzU7(boolean z) {
        zzYN6();
        zzT(z, 131072);
    }

    public final void zzU8(boolean z) {
        zzYN6();
        zzT(z, 65536);
    }

    public final void zzW(zzZ39 zzz39) {
        zzYN6();
        this.zzY8U = zzz39;
    }

    public final void zzX(zzZ3C zzz3c) {
        zzYN6();
        this.zzYau = zzz3c;
    }

    public final void zzY(zzZ38 zzz38) {
        zzYN6();
        this.zzY8S = zzz38;
    }

    public final int zzYLC() {
        return this.zzY8Z;
    }

    public final boolean zzYLD() {
        return (this.zzY8R & 16384) != 0;
    }

    public final void zzYLE() {
        zzYN6();
        zzT(true, 524288);
    }

    public final boolean zzYLF() {
        return (this.zzY8R & 524288) != 0;
    }

    public final boolean zzYLG() {
        return (this.zzY8R & 256) != 0;
    }

    public final boolean zzYLH() {
        return (this.zzY8R & 128) != 0;
    }

    public final zzZ31 zzYLI() {
        if (this.zzY8T == null) {
            this.zzY8T = new zzZ31(zzZoP(), false);
        }
        return this.zzY8T;
    }

    public final zzZ39 zzYLJ() {
        return zzTV(true);
    }

    public final boolean zzYLK() {
        return (this.zzY8R & 2) != 0;
    }

    public final zzZ38 zzYLL() {
        if (this.zzY8S == null) {
            this.zzY8S = new zzZ38(zzZoP(), false);
        }
        return this.zzY8S;
    }

    public final int zzYLM() {
        return this.zzY8W;
    }

    public final boolean zzYLN() {
        return this.zzY8W != -1;
    }

    public final int zzYLO() {
        return this.zzY8X;
    }

    public final boolean zzYLP() {
        return this.zzY8X != -1;
    }

    public final int zzYLQ() {
        int i = this.zzY8Y;
        return i == -1 ? this.zzY90 : i;
    }

    public final int zzYLR() {
        return this.zzY90;
    }

    public final boolean zzYLS() {
        return (this.zzY8R & 64) != 0;
    }

    public final boolean zzYLT() {
        return zzYLW() || zzYLX() || zzYLU();
    }

    public final boolean zzYLU() {
        return (this.zzY8R & 32) != 0;
    }

    public final boolean zzYLV() {
        return (this.zzY8R & 16) != 0;
    }

    public final boolean zzYLW() {
        return (this.zzY8R & 8) != 0;
    }

    public final boolean zzYLX() {
        return (this.zzY8R & 4) != 0;
    }

    public final boolean zzYLY() {
        return (this.zzY8R & 2097152) != 0;
    }

    public final int zzYLZ() {
        return this.zzY91;
    }

    public final int zzYM0() {
        return this.zzY92;
    }

    public final int zzYM1() {
        return this.zzY93;
    }

    public final int zzYM2() {
        return this.zzY94;
    }

    public final int zzYM3() {
        return this.zzY96;
    }

    public final int zzYM4() {
        return this.zzY98;
    }

    public final boolean zzYM5() {
        return (this.zzY8R & 262144) != 0;
    }

    public final int zzYM6() {
        return this.zzY97;
    }

    public final int zzYM7() {
        return this.zzY99;
    }

    public final boolean zzYM8() {
        return (this.zzY8R & 131072) != 0;
    }

    public final boolean zzYM9() {
        return (this.zzY8R & 65536) != 0;
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

    public final int zzYMa() {
        return this.zzY9a;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzwB(this.zzY9a);
        zzwB(this.zzY99);
        zzwB(this.zzY98);
        zzwB(this.zzY94);
        zzwB(this.zzY93);
        zzwB(this.zzY92);
        zzwB(this.zzY91);
        zzwB(this.zzY97);
        zzwB(this.zzY96);
        zzwB(this.zzBb);
        zzwB(this.zzUG);
        zzwB(this.zzY95);
        zzwB(this.zzY90);
        zzwB(zzYLQ());
        zzwB(this.zzY8W);
        zzwB(this.zzY8X);
        zzwB(this.zzsA);
        zzwB(this.zzY8V);
        zzZp(zzYMW());
        zzZp(zzYMV());
        zzZp(zzTV(true));
        zzZp(zzYLI());
        zzZp(zzYLL());
        zzwB(this.zzY8R);
        zzwB(this.zzY8Z);
    }

    public final boolean zzYSg() {
        return (this.zzY8R & 4096) != 0;
    }

    public final void zzZ(zzZ31 zzz31) {
        zzYN6();
        this.zzY8T = zzz31;
    }

    public final void zzvX(int i) {
        zzYN6();
        this.zzY8Z = i;
    }

    public final void zzvY(int i) {
        zzYN6();
        this.zzY8W = i;
    }

    public final void zzvZ(int i) {
        zzYN6();
        this.zzY8X = i;
    }

    public final void zzw0(int i) {
        zzYN6();
        if (i == this.zzY90) {
            i = -1;
        }
        this.zzY8Y = i;
    }

    public final void zzw1(int i) {
        zzYN6();
        this.zzY90 = i;
    }

    public final void zzw2(int i) {
        zzYN6();
        this.zzY91 = i;
    }

    public final void zzw3(int i) {
        zzYN6();
        this.zzY92 = i;
    }

    public final void zzw4(int i) {
        zzYN6();
        this.zzY93 = i;
    }

    public final void zzw5(int i) {
        zzYN6();
        this.zzY94 = i;
    }

    public final void zzw6(int i) {
        zzYN6();
        this.zzBb = i;
    }

    public final void zzw7(int i) {
        zzYN6();
        this.zzY96 = i;
    }

    public final void zzw8(int i) {
        zzYN6();
        this.zzY98 = i;
    }

    public final void zzw9(int i) {
        zzYN6();
        this.zzY97 = i;
    }

    public final void zzwa(int i) {
        zzYN6();
        this.zzY99 = i;
    }

    public final void zzwb(int i) {
        zzYN6();
        this.zzY9a = i;
    }

    public static zzZ37 zzZ(zzZ37 zzz37) {
        if (zzz37 != null) {
            zzZ37 zzz372 = new zzZ37(zzz37.zzZoP());
            zzz372.zzwb(zzz37.zzY9a);
            zzz372.zzwa(zzz37.zzY99);
            zzz372.zzw8(zzz37.zzY98);
            zzz372.zzw9(zzz37.zzY97);
            zzz372.zzw7(zzz37.zzY96);
            zzz372.zzw5(zzz37.zzY94);
            zzz372.zzw4(zzz37.zzY93);
            zzz372.zzw3(zzz37.zzY92);
            zzz372.zzw2(zzz37.zzY91);
            zzz372.zzw6(zzz37.zzBb);
            zzz372.setAlignment(zzz37.zzUG);
            zzz372.setLineSpacingRule(zzz37.zzY95);
            zzz372.zzw1(zzz37.zzY90);
            zzz372.zzw0(zzz37.zzYLQ());
            zzz372.zzvY(zzz37.zzY8W);
            zzz372.zzvZ(zzz37.zzY8X);
            zzz372.setOutlineLevel(zzz37.zzsA);
            zzz372.zzY8R = zzz37.zzY8R;
            zzz372.zzY(zzz37.zzYMW());
            zzz372.zzX(zzz37.zzYMV());
            zzz372.zzW(zzz37.zzTV(true));
            zzz372.zzZ(zzz37.zzYLI());
            zzz372.zzY(zzz37.zzYLL());
            return zzz372;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: pr");
    }

    public final void zzY(zzZ34 zzz34) {
        zzYN6();
        this.zzYat = zzz34;
    }

    public static zzZ37 zzY(zzZ37 zzz37) {
        if (zzz37 == null) {
            zzz37 = new zzZ37(null);
        }
        if (zzz37.zzZoP() == null || zzz37.isCached()) {
            return zzz37;
        }
        zzZ37 zzz372 = (zzZ37) com.aspose.words.internal.zzQW.zzZ((Map<zzZ37, TValue>) zzz37.zzZoP().zzZAG, zzz37);
        if (zzz372 != null) {
            return zzz372;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz37.zzZoP().zzZAG, zzz37, zzz37);
        return zzz37;
    }
}
