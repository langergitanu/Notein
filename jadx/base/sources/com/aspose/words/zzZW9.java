package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW9 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("themeElements", "extLst", "objectDefaults", "custClrLst", "extraClrSchemeLst", "spDef", "lnDef", "txDef", "spPr", "bodyPr", "lstStyle", "style", "fontScheme", "clrScheme", "fmtScheme", "bgFillStyleLst", "fillStyleLst", "lnStyleLst", "effectStyleLst", "effectLst", "scene3d", "sp3d", "effectDag", "accent1", "accent2", "accent3", "accent4", "accent5", "accent6", "dk1", "dk2", "folHlink", "hlink", "lt1", "lt2", "majorFont", "minorFont", TranslateLanguage.CZECH, "ea", "latin", "font", "charset", "panose", "pitchFamily", "typeface", "script");
    private zzZXT zzZfi;

    private zzZW9(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    private static zzBW zzH(zzYU4 zzyu4, zzYO3 zzyo3) {
        if (zzyu4.zzQ(zzyu4.getLocalName())) {
            return zzBR.zzW(zzyu4, zzyo3);
        }
        return null;
    }

    private void zzT(Theme theme) {
        theme.zzAh(this.zzZfi.zzZsD().zzV("name", ""));
        while (this.zzZfi.zzZsD().zzQ("fontScheme")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 1) {
                if (iZzTP == 35) {
                    theme.zzY(zzZkb());
                } else if (iZzTP != 36) {
                    zz39.zzK(this.zzZfi.zzZsD());
                } else {
                    theme.zzX(zzZkb());
                }
            } else if (!this.zzZfi.zzZsD().zzc()) {
                zz39.zzL(this.zzZfi.zzZsD());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzU(Theme theme) {
        zzBW zzbwZzH;
        theme.zzXVE().setName(this.zzZfi.zzZsD().zzV("name", ""));
        while (this.zzZfi.zzZsD().zzQ("clrScheme")) {
            String localName = this.zzZfi.zzZsD().getLocalName();
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 1) {
                switch (iZzTP) {
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        zzbwZzH = zzH(this.zzZfi.zzZsD(), this.zzZfi.zzZqn());
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
                if (zzbwZzH == null) {
                    theme.zzXVE().zzZ(zzbwZzH, zzY5L.zzAg(localName));
                }
            } else if (!this.zzZfi.zzZsD().zzc()) {
                zz39.zzL(this.zzZfi.zzZsD());
            }
            zzbwZzH = null;
            if (zzbwZzH == null) {
            }
        }
    }

    private void zzV(Theme theme) throws Exception {
        theme.zzXVD().setName(this.zzZfi.zzZsD().zzV("name", ""));
        while (this.zzZfi.zzZsD().zzQ("fmtScheme")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 15:
                    zzZ(theme.zzXVD());
                    break;
                case 16:
                    zzY(theme.zzXVD());
                    break;
                case 17:
                    zzX(theme.zzXVD());
                    break;
                case 18:
                    zzW(theme.zzXVD());
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
    }

    private void zzW(Theme theme) throws Exception {
        String localName = this.zzZfi.zzZsD().getLocalName();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 1) {
                switch (iZzTP) {
                    case 12:
                        zzT(theme);
                        break;
                    case 13:
                        zzU(theme);
                        break;
                    case 14:
                        zzV(theme);
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
            } else if (!this.zzZfi.zzZsD().zzc()) {
                zz39.zzL(this.zzZfi.zzZsD());
            }
        }
    }

    public static Theme zzX(zzZXU zzzxu) throws Exception {
        Theme theme = new Theme();
        theme.zzZ(zzzxu.getDocument().zzZpV().zzYVe);
        new zzZW9(zzzxu).zzX(theme);
        zzzxu.zzZmi();
        return theme;
    }

    private void zzY(zzZMH zzzmh) throws Exception {
        while (this.zzZfi.zzZsD().zzQ("fillStyleLst")) {
            zz7X zz7xZzc = zz7V.zzc(this.zzZfi);
            if (zz7xZzc != null) {
                zzzmh.zzT(zz7xZzc);
            }
        }
    }

    public static void zzZ(zzZXU zzzxu) throws Exception {
        zzZW1 zzzw1ZzNJ;
        if (zzzxu.zzYyZ().zzZrB() || (zzzw1ZzNJ = zzzxu.zzNJ(zzzxu.zzZmp().zzZkO())) == null) {
            return;
        }
        Theme theme = new Theme();
        zzzxu.getDocument().zzY(theme);
        theme.zzZ(zzzxu.getDocument().zzZpV().zzYVe);
        theme.zzX(zzzw1ZzNJ.zzZmN(), zzzw1ZzNJ.getNamespaceURI());
        Iterator<com.aspose.words.internal.zz75> it = zzzw1ZzNJ.zzZmN().zzxn().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxu, theme);
        }
        new zzZW9(zzzxu).zzX(theme);
        zzzxu.zzZmi();
    }

    public static Theme zzZB(zzZXT zzzxt) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzzxt.zzZ(((zzZW1) zzzxt.zzZsD()).zzZmN(), zzzxt.zzZmp().zzZkN());
        if (zz77VarZzZ == null) {
            return null;
        }
        zzZW1 zzzw1 = new zzZW1(zz77VarZzZ.zzxm(), zzzxt.zzYyZ().getWarningCallback(), 2, zzzxt.zzZqn());
        zzzxt.zzZ(zzzw1);
        Theme theme = new Theme();
        theme.zzZ(zzzxt.getDocument().zzZpV().zzYVe);
        theme.zzX(zzzw1.zzZmN(), zzzw1.getNamespaceURI());
        Iterator<com.aspose.words.internal.zz75> it = zzzw1.zzZmN().zzxn().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxt, theme);
        }
        new zzZW9(zzzxt).zzW(theme);
        zzzxt.zzZmi();
        return theme;
    }

    private FontInfo zzZka() {
        FontInfo fontInfo = new FontInfo();
        while (this.zzZfi.zzZsD().zzi()) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 41:
                    fontInfo.setCharset(this.zzZfi.zzZsD().zzb());
                    break;
                case 42:
                    fontInfo.setPanose(zzYU3.zzGS(this.zzZfi.zzZsD().getValue()));
                    break;
                case 43:
                    fontInfo.setPitch(this.zzZfi.zzZsD().zzb());
                    break;
                case 44:
                    fontInfo.setName(this.zzZfi.zzZsD().getValue());
                    break;
                default:
                    zz39.zzI(this.zzZfi.zzZsD());
                    break;
            }
        }
        return fontInfo;
    }

    private ThemeFonts zzZkb() {
        ThemeFonts themeFonts = new ThemeFonts();
        String localName = this.zzZfi.zzZsD().getLocalName();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 1) {
                switch (iZzTP) {
                    case 37:
                        themeFonts.zzX31 = zzZka();
                        break;
                    case 38:
                        themeFonts.zzX30 = zzZka();
                        break;
                    case 39:
                        themeFonts.zzX2Z = zzZka();
                        break;
                    case 40:
                        zzZ(themeFonts);
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
            } else if (!this.zzZfi.zzZsD().zzc()) {
                zz39.zzL(this.zzZfi.zzZsD());
            }
        }
        return themeFonts;
    }

    private zzK2 zzZkc() throws Exception {
        zzK2 zzk2 = new zzK2();
        String localName = this.zzZfi.zzZsD().getLocalName();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 1) {
                switch (iZzTP) {
                    case 8:
                        zzk2.zzZ(new zzK1());
                        zz51.zzZ(this.zzZfi, zzk2.zzZTm());
                        break;
                    case 9:
                        zzk2.zzZ(new zz10());
                        zz0I.zzZ(this.zzZfi, zzk2.zzZTl(), this.zzZfi.zzZqn());
                        break;
                    case 10:
                        zzk2.zzZ(new zz0N());
                        zz0I.zzZ(this.zzZfi, zzk2.zzZTk());
                        break;
                    case 11:
                        zzk2.zzZ(zz1J.zzQ(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
            } else if (!this.zzZfi.zzZsD().zzc()) {
                zz39.zzL(this.zzZfi.zzZsD());
            }
        }
        return zzk2;
    }

    private zzY5G zzZkd() throws Exception {
        if (this.zzZfi.zzZsD().zzc()) {
            return null;
        }
        zzY5G zzy5g = new zzY5G();
        String localName = this.zzZfi.zzZsD().getLocalName();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 1) {
                if (iZzTP == 5) {
                    zzy5g.zzZ(zzZkc());
                } else if (iZzTP == 6) {
                    zzy5g.zzY(zzZkc());
                } else if (iZzTP != 7) {
                    zz39.zzK(this.zzZfi.zzZsD());
                } else {
                    zzy5g.zzX(zzZkc());
                }
            } else if (!this.zzZfi.zzZsD().zzc()) {
                zz39.zzL(this.zzZfi.zzZsD());
            }
        }
        return zzy5g;
    }

    private void zzX(Theme theme) throws Exception {
        theme.setName(this.zzZfi.zzZsD().zzV("name", ""));
        while (this.zzZfi.zzZsD().zzQ("theme")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 0) {
                zzW(theme);
            } else if (iZzTP == 1) {
                theme.setExtensions(zz81.zzd(this.zzZfi));
            } else if (iZzTP == 2) {
                theme.zzZ(zzZkd());
            } else if (iZzTP != 3 && iZzTP != 4) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                this.zzZfi.zzZsD().zzk();
            }
        }
    }

    private static void zzZ(com.aspose.words.internal.zz75 zz75Var, zzZXT zzzxt, Theme theme) {
        zzZW1 zzzw1 = (zzZW1) com.aspose.words.internal.zzZKW.zzZ(zzzxt.zzZsD(), zzZW1.class);
        if (zz75Var.isExternal() || zzzw1 == null) {
            return;
        }
        String strZzZ = zzzw1.zzZmN().zzZ(zz75Var);
        com.aspose.words.internal.zz77 zz77VarZzYe = zzzxt.zzYe(strZzZ);
        if (zz77VarZzYe != null) {
            theme.zzZEZ().put(zz75Var.getId(), zz77VarZzYe);
        } else {
            zzzxt.zzZ(1, 9, com.aspose.words.internal.zzZKN.format("Theme part '{0}' is missing.", strZzZ));
        }
    }

    private void zzW(zzZMH zzzmh) throws Exception {
        while (this.zzZfi.zzZsD().zzQ("effectStyleLst")) {
            zzZV0 zzzv0 = new zzZV0();
            zzZ(zzzv0);
            zzzmh.zzY(zzzv0);
        }
    }

    private void zzX(zzZMH zzzmh) throws Exception {
        while (this.zzZfi.zzZsD().zzQ("lnStyleLst")) {
            zz4G zz4gZz4 = zz4C.zz4(this.zzZfi);
            if (zz4gZz4 != null) {
                zzzmh.zzO(zz4gZz4);
            }
        }
    }

    private void zzZ(zzZMH zzzmh) throws Exception {
        while (this.zzZfi.zzZsD().zzQ("bgFillStyleLst")) {
            zz7X zz7xZzc = zz7V.zzc(this.zzZfi);
            if (zz7xZzc != null) {
                zzzmh.zzU(zz7xZzc);
            }
        }
    }

    private void zzZ(zzZV0 zzzv0) throws Exception {
        while (this.zzZfi.zzZsD().zzQ("effectStyle")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 19:
                    zzzv0.zzZ(zz2E.zzZ(this.zzZfi, true, false));
                    break;
                case 20:
                    zzZXT zzzxt = this.zzZfi;
                    zzzv0.zzZ(zz2R.zzZ(zzzxt, true, zzzxt.zzZqn()));
                    break;
                case 21:
                    zzZXT zzzxt2 = this.zzZfi;
                    zzzv0.zzZ(zz2R.zzY(zzzxt2, true, zzzxt2.zzZqn()));
                    break;
                case 22:
                    zzzv0.zzZ(zz2E.zzZ(this.zzZfi, true, true));
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
    }

    private void zzZ(ThemeFonts themeFonts) {
        String value = null;
        String value2 = null;
        while (this.zzZfi.zzZsD().zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 44) {
                value2 = this.zzZfi.zzZsD().getValue();
            } else if (iZzTP != 45) {
                zz39.zzI(this.zzZfi.zzZsD());
            } else {
                value = this.zzZfi.zzZsD().getValue();
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            zzY5F zzy5f = new zzY5F(value, value2);
            themeFonts.zzXVu().put(zzy5f.getScript(), zzy5f);
        }
    }
}
