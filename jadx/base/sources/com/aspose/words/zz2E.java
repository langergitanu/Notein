package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zz2E extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("name", C18437z2.f56754h, "blur", "fillOverlay", "glow", "innerShdw", "shadow", "outerShdw", "prstShdw", "reflection", "softEdge", "blipFill", "gradFill", "grpFill", "pattFill", "noFill", "solidFill", "blurRad", "dist", "dir", "sx", "sy", "kx", "ky", "algn", "rotWithShape", "prst", "stA", "stPos", "endA", "endPos", "fadeDir", TranslateLanguage.TAGALOG, "t", TranslateLanguage.TURKISH, "l", "ctr", "r", "bl", "b", "br", "none");
    private zzZXT zzZfi;

    private zz2E(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    public static zz2F zz3(zzZXT zzzxt) throws Exception {
        zz2E zz2e = new zz2E(zzzxt);
        switch (zzUR.zzTP(zzzxt.zzZsD().getLocalName())) {
            case 2:
                return zz2e.zzZv7();
            case 3:
                return zz2e.zzZv6();
            case 4:
                return zz2e.zzZv5();
            case 5:
                return zz2e.zzZv4();
            case 6:
            case 7:
                return zz2e.zzZv3();
            case 8:
                return zz2e.zzZv2();
            case 9:
                return zz2e.zzZv1();
            case 10:
                return zz2e.zzZv0();
            default:
                zz39.zzK(zzzxt.zzZsD());
                return null;
        }
    }

    private static int zzOm(String str) {
        switch (zzUR.zzTP(str)) {
            case 33:
                return 1;
            case 34:
                return 2;
            case 35:
                return 3;
            case 36:
                return 4;
            case 37:
                return 5;
            case 38:
                return 6;
            case 39:
                return 7;
            case 40:
                return 8;
            case 41:
                return 9;
            default:
                return 0;
        }
    }

    private static double zzXr(double d) {
        if (d > 2.0d) {
            return 0.0d;
        }
        return d;
    }

    public static zz2C zzZ(zzZXT zzzxt, boolean z, boolean z2) throws Exception {
        zz2C zz2c = new zz2C(z, z2);
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zz2c.zzOl(zzyu4ZzZsD.getValue());
            } else if (iZzTP != 1) {
                zz39.zzI(zzyu4ZzZsD);
            } else {
                zz2c.zzH0(zz84.zzOK(zzyu4ZzZsD.getValue()));
            }
        }
        while (zzyu4ZzZsD.zzQ(localName)) {
            zz2F zz2fZz3 = zz3(zzzxt);
            if (zz2fZz3 != null) {
                zz2c.zzZ(zz2fZz3);
            }
        }
        return zz2c;
    }

    private zz1M zzZv0() {
        zz1M zz1m = new zz1M();
        zz1m.zzYL(this.zzZfi.zzZsD().zzZ("rad", 0.0d));
        return zz1m;
    }

    private zz2F zzZv1() {
        zz1R zz1r = new zz1R();
        while (this.zzZfi.zzZsD().zzi()) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 17:
                    zz1r.zzXp(zzm(this.zzZfi.zzZsD().zz9(), 1270000.0d));
                    break;
                case 18:
                    zz1r.zzXo(zzm(this.zzZfi.zzZsD().zz9(), 1270000.0d));
                    break;
                case 19:
                    zz1r.zzQ(new zzHK(this.zzZfi.zzZsD().zz9()));
                    break;
                case 20:
                    zz1r.zzXn(zzXr(zz3W.zzZ(this.zzZfi.zzZsD().getValue(), this.zzZfi.zzZqn())));
                    break;
                case 21:
                    zz1r.zzXm(zzXr(zz3W.zzZ(this.zzZfi.zzZsD().getValue(), this.zzZfi.zzZqn())));
                    break;
                case 22:
                    zz1r.zzP(new zzHK(this.zzZfi.zzZsD().zz9()));
                    break;
                case 23:
                    zz1r.zzO(new zzHK(this.zzZfi.zzZsD().zz9()));
                    break;
                case 24:
                    zz1r.setAlignment(zzOm(this.zzZfi.zzZsD().getValue()));
                    break;
                case 25:
                    zz1r.zzY6(this.zzZfi.zzZsD().zz8());
                    break;
                case 26:
                default:
                    zz39.zzI(this.zzZfi.zzZsD());
                    break;
                case 27:
                    zz1r.zzXk(zz3W.zzZ(this.zzZfi.zzZsD().getValue(), this.zzZfi.zzZqn()));
                    break;
                case 28:
                    zz1r.zzXi(zz3W.zzZ(this.zzZfi.zzZsD().getValue(), this.zzZfi.zzZqn()));
                    break;
                case 29:
                    zz1r.zzXl(zz3W.zzZ(this.zzZfi.zzZsD().getValue(), this.zzZfi.zzZqn()));
                    break;
                case 30:
                    zz1r.zzXj(zz3W.zzZ(this.zzZfi.zzZsD().getValue(), this.zzZfi.zzZqn()));
                    break;
                case 31:
                    zz1r.zzN(new zzHK(this.zzZfi.zzZsD().zz9()));
                    break;
            }
        }
        this.zzZfi.zzZsD().zzj();
        return zz1r;
    }

    private zz1W zzZv2() {
        zz1W zz1w = new zz1W();
        while (this.zzZfi.zzZsD().zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 18) {
                zz1w.zzXo(zzm(this.zzZfi.zzZsD().zz9(), 2540000.0d));
            } else if (iZzTP == 19) {
                zz1w.zzQ(new zzHK(this.zzZfi.zzZsD().zz9()));
            } else if (iZzTP != 26) {
                zz39.zzI(this.zzZfi.zzZsD());
            } else {
                zz1w.zzGW(zz84.zzOU(this.zzZfi.zzZsD().getValue()));
            }
        }
        this.zzZfi.zzZsD().zzj();
        zz1w.zzZ(zzBR.zzX(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
        return zz1w;
    }

    private zz21 zzZv3() {
        zz21 zz21Var = new zz21();
        while (this.zzZfi.zzZsD().zzi()) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 17:
                    zz21Var.zzXp(zzm(this.zzZfi.zzZsD().zz9(), 1270000.0d));
                    break;
                case 18:
                    zz21Var.zzXo(zzm(this.zzZfi.zzZsD().zz9(), 2540000.0d));
                    break;
                case 19:
                    zz21Var.zzQ(new zzHK(this.zzZfi.zzZsD().zz9()));
                    break;
                case 20:
                    zz21Var.zzXn(zzXr(zz3W.zzZ(this.zzZfi.zzZsD().getValue(), this.zzZfi.zzZqn())));
                    break;
                case 21:
                    zz21Var.zzXm(zzXr(zz3W.zzZ(this.zzZfi.zzZsD().getValue(), this.zzZfi.zzZqn())));
                    break;
                case 22:
                    zz21Var.zzP(new zzHK(this.zzZfi.zzZsD().zz9()));
                    break;
                case 23:
                    zz21Var.zzO(new zzHK(this.zzZfi.zzZsD().zz9()));
                    break;
                case 24:
                    zz21Var.setAlignment(zzOm(this.zzZfi.zzZsD().getValue()));
                    break;
                case 25:
                    zz21Var.zzY6(this.zzZfi.zzZsD().zz8());
                    break;
                default:
                    zz39.zzI(this.zzZfi.zzZsD());
                    break;
            }
        }
        this.zzZfi.zzZsD().zzj();
        zzBW zzbwZzX = zzBR.zzX(this.zzZfi.zzZsD(), this.zzZfi.zzZqn());
        if (zzbwZzX == null) {
            zzbwZzX = zzBW.zzZ8e;
        }
        zz21Var.zzZ(zzbwZzX);
        return zz21Var;
    }

    private zz2F zzZv4() {
        zz25 zz25Var = new zz25();
        while (this.zzZfi.zzZsD().zzi()) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 17:
                    zz25Var.zzXp(zzm(this.zzZfi.zzZsD().zz9(), 1270000.0d));
                    break;
                case 18:
                    zz25Var.zzXo(zzm(this.zzZfi.zzZsD().zz9(), 2540000.0d));
                    break;
                case 19:
                    zz25Var.zzQ(new zzHK(this.zzZfi.zzZsD().zz9()));
                    break;
                default:
                    zz39.zzI(this.zzZfi.zzZsD());
                    break;
            }
        }
        this.zzZfi.zzZsD().zzj();
        zz25Var.zzZ(zzBR.zzX(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
        return zz25Var;
    }

    private zz27 zzZv5() {
        zz27 zz27Var = new zz27();
        zz27Var.zzYL(zzm(this.zzZfi.zzZsD().zzZ("rad", 0.0d), 1905000.0d));
        this.zzZfi.zzZsD().zzj();
        zz27Var.zzZ(zzBR.zzX(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
        return zz27Var;
    }

    private zz29 zzZv6() throws Exception {
        zz29 zz29Var = new zz29();
        zz29Var.zzIb(zz84.zzOW(this.zzZfi.zzZsD().zzV("blend", "")));
        while (this.zzZfi.zzZsD().zzQ("fillOverlay")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    zz29Var.setFill(zz7V.zzc(this.zzZfi));
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
        return zz29Var;
    }

    private zz2I zzZv7() {
        zz2I zz2i = new zz2I();
        zz2i.zzYL(com.aspose.words.internal.zzSA.zzYz((int) this.zzZfi.zzZsD().zzZ("rad", 0.0d)));
        zz2i.zzY5(this.zzZfi.zzZsD().zzX("grow", true));
        return zz2i;
    }

    private static double zzm(double d, double d2) {
        if (d < 0.0d) {
            d *= -1.0d;
        }
        return d > d2 ? d2 : d;
    }
}
