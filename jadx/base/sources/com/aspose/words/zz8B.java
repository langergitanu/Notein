package com.aspose.words;

import androidx.core.text.util.LocalePreferences;

/* JADX INFO: loaded from: classes6.dex */
final class zz8B extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("biLevel", "clrChange", "grayscl", "lum", "duotone", "blur", "alphaBiLevel", "alphaCeiling", "alphaFloor", "alphaInv", "alphaMod", "alphaModFix", "alphaRepl", "clrRepl", "fillOverlay", "hsl", "tint", "blipFill", "gradFill", "grpFill", "pattFill", "noFill", "solidFill", "cont", "clrFrom", "clrTo");

    private static double zzT(zzYU4 zzyu4, zzYO3 zzyo3) {
        return (zz3W.zzZ(zzyu4.zzV("bright", ""), zzyo3) + 1.0d) / 2.0d;
    }

    private static double zzU(zzYU4 zzyu4, zzYO3 zzyo3) {
        return (zz3W.zzZ(zzyu4.zzV("contrast", ""), zzyo3) + 1.0d) / 2.0d;
    }

    public static zz75 zzZC8() {
        return new zz75();
    }

    public static zz8G zze(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zz8G zz8g = new zz8G();
        String localName = zzyu4ZzZsD.getLocalName();
        if (zzyu4ZzZsD.zzQ(localName)) {
            zz8g.zzR(zzBR.zzW(zzyu4ZzZsD, zzyo3ZzZqn));
        }
        if (zzyu4ZzZsD.zzQ(localName)) {
            zz8g.zzQ(zzBR.zzW(zzyu4ZzZsD, zzyo3ZzZqn));
        }
        return zz8g;
    }

    public static zz5E zzf(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zz5E zz5e = new zz5E();
        zz5e.setBrightness(zzT(zzyu4ZzZsD, zzyo3ZzZqn));
        zz5e.setContrast(zzU(zzyu4ZzZsD, zzyo3ZzZqn));
        return zz5e;
    }

    public static zzBV zzg(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzBV zzbv = new zzBV();
        zzbv.zzXs(zzyu4ZzZsD.zzX("useA", true));
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzbv.zzT(zzBR.zzX(zzyu4ZzZsD, zzyo3ZzZqn));
            } else if (iZzTP != 25) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzbv.zzS(zzBR.zzX(zzyu4ZzZsD, zzyo3ZzZqn));
            }
        }
        return zzbv;
    }

    public static zzH3 zzh(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzH3 zzh3 = new zzH3();
        zzh3.zzYV(zz3W.zzZ(zzyu4ZzZsD.zzV("thresh", ""), zzyo3ZzZqn));
        return zzh3;
    }

    public static zzGU zzi(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzGU zzgu = new zzGU();
        zzgu.zzYL(zzyu4ZzZsD.zzZ("rad", 0.0d));
        zzgu.zzY5(zzyu4ZzZsD.zzX("grow", true));
        return zzgu;
    }

    public static zzHU zzj(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzHU zzhu = new zzHU();
        zzhu.zzYV(zz3W.zzZ(zzyu4ZzZsD.zzV("thresh", ""), zzyo3ZzZqn));
        return zzhu;
    }

    public static zzHR zzk(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzHR zzhr = new zzHR();
        zzhr.zzZ(zzBR.zzW(zzyu4ZzZsD, zzyo3ZzZqn));
        return zzhr;
    }

    public static zzHQ zzl(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzHQ zzhq = new zzHQ();
        while (zzyu4ZzZsD.zzQ("alphaMod")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 23) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                while (zzyu4ZzZsD.zzQ("cont")) {
                    zz8E zz8eZzs = zzs(zzzxt);
                    if (zz8eZzs != null) {
                        zzhq.zzZQW().add(zz8eZzs);
                    }
                }
            }
        }
        return zzhq;
    }

    public static zzHP zzm(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzHP zzhp = new zzHP();
        zzhp.zzYU(zz3W.zzZ(zzyu4ZzZsD.zzV("amt", ""), 1.0d, zzyo3ZzZqn));
        return zzhp;
    }

    public static zzHL zzn(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzHL zzhl = new zzHL();
        zzhl.zzYT(zz3W.zzZ(zzyu4ZzZsD.zzV("a", ""), zzyo3ZzZqn));
        return zzhl;
    }

    public static zzBQ zzo(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzBQ zzbq = new zzBQ();
        zzbq.zzZ(zzBR.zzW(zzyu4ZzZsD, zzyo3ZzZqn));
        return zzbq;
    }

    public static zz7W zzp(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zz7W zz7w = new zz7W();
        zz7w.zzIb(zz84.zzOW(zzyu4ZzZsD.zzV("blend", "")));
        while (zzyu4ZzZsD.zzQ("fillOverlay")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    zz7w.setFill(zz7V.zzc(zzzxt));
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
        return zz7w;
    }

    public static zz6I zzq(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zz6I zz6i = new zz6I();
        zz6i.zzW(new zzHK(zzyu4ZzZsD.zzZ("hue", 0.0d)));
        zz6i.zzXO(zz3W.zzZ(zzyu4ZzZsD.zzV("lum", ""), zzyo3ZzZqn));
        zz6i.zzXP(zz3W.zzZ(zzyu4ZzZsD.zzV(LocalePreferences.FirstDayOfWeek.SATURDAY, ""), zzyo3ZzZqn));
        return zz6i;
    }

    public static zz0B zzr(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zz0B zz0b = new zz0B();
        zz0b.zzYU(zz3W.zzZ(zzyu4ZzZsD.zzV("amt", ""), zzyo3ZzZqn));
        zz0b.zzZS(zz3W.zzZ(zzyu4ZzZsD.zzV("hue", ""), zzyo3ZzZqn));
        return zz0b;
    }

    private static zz8E zzs(zzZXT zzzxt) throws Exception {
        switch (zzUR.zzTP(zzzxt.zzZsD().getLocalName())) {
            case 0:
                return zzh(zzzxt);
            case 1:
                return zzg(zzzxt);
            case 2:
                return new zz75();
            case 3:
                return zzf(zzzxt);
            case 4:
                return zze(zzzxt);
            case 5:
                return zzi(zzzxt);
            case 6:
                return zzj(zzzxt);
            case 7:
                return new zzHT();
            case 8:
                return new zzHS();
            case 9:
                return zzk(zzzxt);
            case 10:
                return zzl(zzzxt);
            case 11:
                return zzm(zzzxt);
            case 12:
                return zzn(zzzxt);
            case 13:
                return zzo(zzzxt);
            case 14:
                return zzp(zzzxt);
            case 15:
                return zzq(zzzxt);
            case 16:
                return zzr(zzzxt);
            default:
                zz39.zzK(zzzxt.zzZsD());
                return null;
        }
    }
}
