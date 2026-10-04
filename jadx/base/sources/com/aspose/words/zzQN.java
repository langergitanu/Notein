package com.aspose.words;

import android.os.Bundle;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzQN {
    private zzOJ zzZqV;
    private zzOJ zzZqW;
    private zzOJ zzZqX;
    private zzOJ zzZqY;
    private boolean zzZqZ;
    private boolean zzZr1;
    private boolean zzZr2;
    private int zzZr3;
    private com.aspose.words.internal.zzZQC<zzQR> zzZr0 = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzQP> zzU4 = new com.aspose.words.internal.zzZQC<>();

    public zzQN(int i, boolean z, boolean z2) {
        zzOJ zzoj = zzOJ.zzZpP;
        this.zzZqY = zzoj;
        this.zzZqX = zzoj;
        this.zzZqW = zzoj;
        this.zzZqV = zzoj;
        this.zzZr3 = i;
        this.zzZr2 = z;
        this.zzZr1 = z2;
        zzQR zzqr = new zzQR();
        this.zzZr0.push(zzqr);
        this.zzU4.push(new zzQP(zzqr, true));
    }

    private static boolean zzMw(int i) {
        if (i == 9 || i == 10 || i == 15) {
            return true;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    private zzOJ zzT(int i, int i2, boolean z) {
        double d;
        boolean zZzZWV = i2 == 2;
        Iterator<zzQR> it = this.zzZr0.iterator();
        int i3 = -1;
        boolean z2 = true;
        double value = 0.0d;
        double value2 = 0.0d;
        double d2 = 0.0d;
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                d = 0.0d;
                break;
            }
            zzQR next = it.next();
            i3++;
            d = 0.0d;
            if (i3 >= i) {
                zzQO zzqoZzMz = next.zzMz(i2);
                if (zzqoZzMz.zzZWX().zzZVX()) {
                    if (!com.aspose.words.internal.zzAN.zzZD(zzqoZzMz.zzZWX().getValue())) {
                        z2 = false;
                    }
                    z3 = true;
                }
                if (zzqoZzMz.zzZWX().getValue() > 0.0d && zzqoZzMz.zzZWX().getValue() > value) {
                    value = zzqoZzMz.zzZWX().getValue();
                } else if (zzqoZzMz.zzZWX().getValue() < 0.0d && zzqoZzMz.zzZWX().getValue() < value2) {
                    value2 = zzqoZzMz.zzZWX().getValue();
                }
                if (zzqoZzMz.zzZWW() == 2) {
                    zZzZWV = zzqoZzMz.zzZWV();
                    break;
                }
                if (zzqoZzMz.zzZWW() != 1) {
                    z2 = true;
                    d2 = value + value2 + d2;
                    value = 0.0d;
                    value2 = 0.0d;
                }
            }
        }
        boolean z4 = z3;
        if (zZzZWV && z2) {
            value = d;
            value2 = value;
        }
        double d3 = d2 + value + value2;
        return new zzOJ((z || d3 >= d) ? d3 : d, z4);
    }

    private static zzQR zzW(zzZAS zzzas, zzPS zzps) {
        return new zzQR(zzQO.zzZ(new zzOJ(zzY("padding-left", "border-left-width", zzps), zzZ("padding-left", zzps)), 0, false), zzQO.zzZ(new zzOJ(zzY("padding-right", "border-right-width", zzps), zzZ("padding-right", zzps)), 0, false), zzQO.zzZ(zzOJ.zzZpP, 2, false), zzQO.zzZ(zzOJ.zzZpP, 2, true), zzzas.zzZXd(), zzzas.zzZXc(), true, true, true);
    }

    private zzQR zzX(zzZAS zzzas, zzPS zzps) {
        return new zzQR(zzQO.zzZ(new zzOJ(zzX("margin-left", zzps), true), 0, false), zzQO.zzZ(new zzOJ(zzX("margin-right", zzps), true), 0, false), zzQO.zzZ(new zzOJ(zzX("margin-top", zzps), !com.aspose.words.internal.zzAN.zzZD(r1)), zzZWI().zzZXg(), true), zzQO.zzZ(new zzOJ(zzX("margin-bottom", zzps), !com.aspose.words.internal.zzAN.zzZD(r0)), zzZWI().zzZXf(), true), zzzas.zzZXd(), zzzas.zzZXc(), true, zzZWI().zzZXb(), false);
    }

    private zzQR zzY(zzZAS zzzas, zzPS zzps) {
        return new zzQR(zzQO.zzZ(new zzOJ(zzX("margin-left", zzps), true), 2, false), zzQO.zzZ(new zzOJ(zzX("margin-right", zzps), true), 2, false), zzQO.zzZ(new zzOJ(zzX("margin-top", zzps), !com.aspose.words.internal.zzAN.zzZD(r8)), 2, true), zzQO.zzZ(new zzOJ(zzX("margin-bottom", zzps), !com.aspose.words.internal.zzAN.zzZD(r0)), 2, true), zzzas.zzZXd(), zzzas.zzZXc(), true, zzZWI().zzZXb(), true);
    }

    private zzQP zzZWH() {
        this.zzU4.size();
        return this.zzU4.peek();
    }

    private zzQR zzZWI() {
        this.zzZr0.size();
        return this.zzZr0.peek();
    }

    private void zzZWJ() {
        if (zzZWI().zzZXa() && zzZWI().zzZXf() == 2) {
            this.zzZqV = zzOJ.zzZpP;
        } else {
            this.zzZqV = zzT(0, 3, false);
        }
        zzZWH().zzYZ(this.zzZqV.getValue());
    }

    private void zzZWK() {
        if (zzZWI().zzZXa() && zzZWI().zzZXg() == 2) {
            this.zzZqW = zzOJ.zzZpP;
            return;
        }
        this.zzZqW = zzT(0, 2, false);
        if (zzZWH().zzZX1() == 1) {
            this.zzZqW = new zzOJ(Math.max(this.zzZqW.getValue() - zzZWH().zzZX0(), 0.0d), this.zzZqW.zzZVX());
        } else if (zzZWH().zzZX1() == 2) {
            this.zzZqW = new zzOJ(0.0d, this.zzZqW.zzZVX());
        }
    }

    private void zzZWL() {
        this.zzZqX = zzT(0, 1, true);
    }

    private void zzZWM() {
        this.zzZqY = zzT(0, 0, true);
    }

    private void zzZWN() {
        if (this.zzZqZ) {
            zzZWM();
            zzZWL();
            zzZWK();
            zzZWJ();
            this.zzZqZ = false;
        }
    }

    public final void zzZ(zzZAS zzzas, zzPS zzps, int i, int i2, boolean z) {
        if (zzZWI().zzZXd()) {
            zzZWI().zzMB(2);
        }
        if ("body".equals(zzzas.zzZTQ())) {
            zzZWI().zzMB(1);
        }
        if (zzzas.zzZ2H() && !zzZWI().zzZXc()) {
            zzZWI().zzMA(zzZWI().zzZXe() ? 1 : 0);
        }
        String strZzZTQ = zzzas.zzZTQ();
        zzQR zzqrZzY = ("td".equals(strZzZTQ) || TranslateLanguage.THAI.equals(strZzZTQ)) ? zzY(zzzas) : i == 13 ? zzW(zzzas, zzps) : "table".equals(strZzZTQ) ? zzX(zzzas, zzps) : "caption".equals(strZzZTQ) ? zzY(zzzas, zzps) : ("ul".equals(strZzZTQ) || "ol".equals(strZzZTQ)) ? (i == 0 || i == 8 || i == 13 || i == 12 || i == 11 || i == 14) ? zzZ(zzzas, zzps, i) : zzZ(zzzas, zzps) : "li".equals(strZzZTQ) ? zzY(zzzas, zzps, i) : (("figure".equals(strZzZTQ) && this.zzZr1) || z) ? new zzQR() : zzMw(i) ? zzZ(zzzas, zzps) : zzZ(zzzas);
        zzZWH().zzZ(null);
        zzqrZzY.zzYh(!zzzas.zzZ2I() && i == 1);
        boolean zZzZ = zzZ(strZzZTQ, i, zzps);
        if (zzzas.zzZ2I() && !zZzZ && (zzzas.zzZ2O() != null || !"li".equals(zzzas.zzZTQ()) || i != 0 || i2 == 0)) {
            zzZWI().zzMB(2);
        }
        if (zzzas.zzZ2H()) {
            if ("li".equals(zzzas.zzZTQ()) && i2 == 0) {
                zzZWI().zzMB(2);
            } else {
                zzZWI().zzMA(1);
            }
        }
        if (zZzZ) {
            this.zzU4.push(new zzQP(zzqrZzY, zzX(zzps)));
        }
        if (zzzas.zzZ2J()) {
            zzqrZzY.zzMA(2);
        }
        this.zzZr0.push(zzqrZzY);
        this.zzZqZ = true;
    }

    public final void zzZP() {
        this.zzZr0.size();
        if (zzZWH().zzZX3() == zzZWI()) {
            boolean zZzZX2 = zzZWH().zzZX2();
            this.zzU4.pop();
            this.zzU4.size();
            zzZWH().zzMx(zZzZX2 ? 2 : 1);
        } else {
            zzZWH().zzMx(0);
        }
        zzZWH().zzZ0(zzZWH().zzZWZ());
        if (zzZWI().zzZX9()) {
            zzZWN();
            zzOJ zzoj = new zzOJ(Math.max(this.zzZqW.getValue(), this.zzZqV.getValue()), this.zzZqW.zzZVX() || this.zzZqV.zzZVX());
            if (zzZWH().zzZWY() == null) {
                zzZWH().zzZ(zzoj);
            } else {
                zzZWH().zzZ(new zzOJ(Math.max(zzZWH().zzZWY().getValue(), zzoj.getValue()), zzZWH().zzZWY().zzZVX() || zzoj.zzZVX()));
            }
        }
        this.zzZr0.pop();
        this.zzZqZ = true;
    }

    public final zzO0 zzZWO() {
        zzO0 zzo0 = new zzO0(zzZWQ().getValue(), zzZWR().getValue(), zzZWP().getValue(), zzZWS().getValue());
        zzo0.zzYg(zzZWQ().zzZVX());
        zzo0.zzYf(zzZWR().zzZVX());
        zzo0.zzYe(zzZWP().zzZVX());
        zzo0.zzYd(zzZWS().zzZVX());
        return zzo0;
    }

    public final zzOJ zzZWP() {
        zzZWN();
        return this.zzZqV;
    }

    public final zzOJ zzZWQ() {
        zzZWN();
        return this.zzZqW;
    }

    public final zzOJ zzZWR() {
        zzZWN();
        return this.zzZqX;
    }

    public final zzOJ zzZWS() {
        zzZWN();
        return this.zzZqY;
    }

    public final boolean zzZWT() {
        return zzT(1, 1, true).zzZVX();
    }

    public final boolean zzZWU() {
        return zzT(1, 0, true).zzZVX();
    }

    private static boolean zzW(zzZAS zzzas) {
        return ContextChain.TAG_PRODUCT.equals(zzzas.zzZTQ()) || "pre".equals(zzzas.zzZTQ()) || "listing".equals(zzzas.zzZTQ()) || "xmp".equals(zzzas.zzZTQ()) || "plaintext".equals(zzzas.zzZTQ());
    }

    private static double zzX(zzPS zzps, String str) {
        com.aspose.words.internal.zzZKN.zzU3(str);
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx != null) {
            return zzO5.zzZ(zzptZzSx.zzZWj());
        }
        return 0.0d;
    }

    private zzQR zzY(zzZAS zzzas) {
        zzQO zzqoZzZ = zzQO.zzZ(zzOJ.zzZpP, 2, true);
        zzQO zzqoZzZ2 = zzQO.zzZ(zzOJ.zzZpP, 2, false);
        return new zzQR(zzqoZzZ2, zzqoZzZ2, (this.zzZr3 == 2 || !zzzas.zzZ2I()) ? zzqoZzZ : zzqoZzZ2, zzqoZzZ, zzzas.zzZXd(), zzzas.zzZXc(), true, true, true);
    }

    private static double zzX(String str, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx != null) {
            return zzO5.zzZ(zzptZzSx.zzZWj());
        }
        return 0.0d;
    }

    private zzQR zzY(zzZAS zzzas, zzPS zzps, int i) {
        zzQR zzqrZzZ;
        if (zzMw(i)) {
            zzqrZzZ = zzZ(zzzas, zzps);
        } else {
            zzqrZzZ = zzZ(zzzas);
        }
        if (zzzas.zzZ2O() != null) {
            zzqrZzZ.zzMB(2);
        }
        return zzqrZzZ;
    }

    private double zzX(zzZAS zzzas) {
        if (this.zzZr2) {
            return zzZIZ.zzS(zzzas);
        }
        return 0.0d;
    }

    private static boolean zzX(zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("width");
        return zzptZzSx != null && zzptZzSx.zzZWj().zzP(new zzMU(100.0d));
    }

    private static boolean zzY(String str, zzPS zzps) {
        return zzps.zzSx(str) != null;
    }

    private static double zzY(String str, String str2, zzPS zzps) {
        return zzY(zzps, str) + zzZ(zzps, str2);
    }

    private static double zzY(zzPS zzps, String str) {
        com.aspose.words.internal.zzZKN.zzU3(str);
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx != null) {
            return zzNA.zzY(zzptZzSx.zzZWj());
        }
        return 0.0d;
    }

    private zzQR zzZ(zzZAS zzzas, zzPS zzps) {
        zzOJ zzoj = new zzOJ(zzZ("margin-left", "padding-left", "border-left", zzps), zzZ("margin-left", "padding-left", zzps));
        zzOJ zzoj2 = new zzOJ(zzZ("margin-right", "padding-right", "border-right", zzps), zzZ("margin-right", "padding-right", zzps));
        zzOJ zzoj3 = new zzOJ(zzZ("margin-top", zzzas, zzps), zzY("margin-top", zzps));
        zzOJ zzoj4 = new zzOJ(zzZ("margin-bottom", zzzas, zzps), zzY("margin-bottom", zzps));
        if (zzZWH().zzZWY() != null && zzZWH().zzZWY().getValue() > zzoj3.getValue()) {
            zzoj3 = zzZWH().zzZWY();
        }
        if (zzZWI().zzZXb() && !zzoj4.zzZVX() && !com.aspose.words.internal.zzAN.zzZD(zzoj4.getValue()) && zzzas.zzZ2I() && (!zzW(zzzas) || this.zzZr3 != 2 || zzZWI().zzZXf() == 2)) {
            zzoj4 = new zzOJ(zzoj4.getValue(), true);
        }
        zzPT zzptZzSx = zzps.zzSx("border-top-style");
        boolean z = (zzptZzSx == null || zzptZzSx.zzZWj().zzP(zzL4.zzZno) || zzptZzSx.zzZWj().zzP(zzL4.zzZly)) ? false : true;
        zzPT zzptZzSx2 = zzps.zzSx("border-bottom-style");
        boolean z2 = (zzptZzSx2 == null || zzptZzSx2.zzZWj().zzP(zzL4.zzZno) || zzptZzSx2.zzZWj().zzP(zzL4.zzZly)) ? false : true;
        zzQR zzqr = new zzQR(zzQO.zzZ(zzoj, 0, false), zzQO.zzZ(zzoj2, 0, false), zzQO.zzZ(zzoj3, zzZWI().zzZXg(), false), zzQO.zzZ(zzoj4, zzZWI().zzZXf(), false), zzzas.zzZXd(), zzzas.zzZXc(), !z2, zzZWI().zzZXb(), true);
        if (z) {
            zzqr.zzMB(0);
        }
        if (z2) {
            zzqr.zzMA(0);
        }
        return zzqr;
    }

    private zzQR zzZ(zzZAS zzzas) {
        return new zzQR(zzQO.zzZ(zzOJ.zzZpP, 0, false), zzQO.zzZ(zzOJ.zzZpP, 0, false), zzQO.zzZ(zzOJ.zzZpP, zzZWI().zzZXg(), false), zzQO.zzZ(zzOJ.zzZpP, zzZWI().zzZXf(), false), zzzas.zzZXd(), zzzas.zzZXc(), true, zzZWI().zzZXb(), true);
    }

    private zzQR zzZ(zzZAS zzzas, zzPS zzps, int i) {
        zzOJ zzoj;
        zzQO zzqoZzZ = zzQO.zzZ(zzOJ.zzZpP, 0, false);
        zzQO zzqoZzZ2 = zzQO.zzZ(zzOJ.zzZpP, 0, false);
        if (i == 0) {
            zzoj = new zzOJ(zzZ("margin-top", zzzas, zzps), zzY("margin-top", zzps));
        } else {
            zzoj = zzOJ.zzZpP;
        }
        return new zzQR(zzqoZzZ, zzqoZzZ2, zzQO.zzZ(zzoj, zzZWI().zzZXg(), false), zzQO.zzZ(zzOJ.zzZpP, zzZWI().zzZXf(), false), zzzas.zzZXd(), zzzas.zzZXc(), true, zzZWI().zzZXb(), true);
    }

    private static boolean zzZ(String str, String str2, zzPS zzps) {
        return zzZ(str, zzps) || zzZ(str2, zzps);
    }

    private static boolean zzZ(String str, zzPS zzps) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        return (zzps.zzSx(str) == null || zzps.zzSz(str)) ? false : true;
    }

    private static double zzZ(String str, String str2, String str3, zzPS zzps) {
        return zzX(zzps, str) + zzY(zzps, str2) + zzZ(zzps, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, java.lang.String] */
    private static double zzZ(zzPS zzps, String str) {
        zzPT zzptZzSx;
        com.aspose.words.internal.zzZKN.zzU3(str);
        zzPT zzptZzSx2 = zzps.zzSx(str + "-style");
        if (zzptZzSx2 == null || zzptZzSx2.zzZWj().zzP(zzL4.zzZno) || (zzptZzSx = zzps.zzSx(Bundle.getInt(str))) == null) {
            return 0.0d;
        }
        return zzL5.zzV(zzptZzSx.zzZWj());
    }

    private double zzZ(String str, zzZAS zzzas, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx != null) {
            return zzO5.zzZ(zzptZzSx.zzZWj());
        }
        return zzX(zzzas) * (this.zzZr1 ? 12.0d : zzL5.zzL(zzps));
    }

    private static boolean zzZ(String str, int i, zzPS zzps) {
        zzPT zzptZzSx;
        if (!"table".equals(str) || i != 5 || (zzptZzSx = zzps.zzSx("float")) == null) {
            return false;
        }
        zzMP zzmpZzZWj = zzptZzSx.zzZWj();
        return zzmpZzZWj.zzP(zzL4.zzZmH) || zzmpZzZWj.zzP(zzL4.zzZmG);
    }
}
