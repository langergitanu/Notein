package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zz51 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("xfrm", "blipFill", "gradFill", "grpFill", "noFill", "pattFill", "solidFill", "effectLst", "effectDag", "scene3d", "extLst", "bwMode", "custGeom", "prstGeom", "ln", "sp3d", "cNvCxnSpPr", "cNvGraphicFramePr", "cNvGrpSpPr", "cNvPicPr", "cNvSpPr", "cNvContentPartPr", "cNvPr", "cxnSpLocks", "graphicFrameLocks", "grpSpLocks", "picLocks", "spLocks", "cpLocks", "stCxn", "endCxn", "cNvCnPr", "cNvFrPr", "hlinkClick", "hlinkHover", "noAdjustHandles", "noChangeArrowheads", "noChangeAspect", "noChangeShapeType", "noEditPoints", "noGrp", "noUngrp", "noMove", "noResize", "noRot", "noSelect", "noCrop", "noTextEdit", "noDrilldown");

    public static zz4T zz5(zzZXT zzzxt) throws Exception {
        zz4T zz4t = new zz4T();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zz4t.setDescription(zzyu4ZzZsD.zzV("descr", ""));
        zz4t.setName(zzyu4ZzZsD.zzV("name", ""));
        zz4t.setTitle(zzyu4ZzZsD.zzV(NoteMeta.PROPERTY_TITLE, ""));
        zz4t.setHidden(zzyu4ZzZsD.zzX("hidden", false));
        zz4t.setId(zzyu4ZzZsD.zzX("id", 0));
        while (zzyu4ZzZsD.zzQ("cNvPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 10) {
                zz4t.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 33) {
                zz4t.zzZ(zz6O.zz7(zzzxt));
            } else if (iZzTP != 34) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zz39.zzL(zzyu4ZzZsD);
            }
        }
        return zz4t;
    }

    public static zzC3 zz6(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzC3 zzc3ZzOt = zzOt(zzyu4ZzZsD.getLocalName());
        if (zzc3ZzOt.zzZFM() == 4) {
            ((zzBX) zzc3ZzOt).zzXt(zzyu4ZzZsD.zzX("txBox", false));
        }
        if (zzc3ZzOt.zzZFM() == 3) {
            ((zzBY) zzc3ZzOt).zzXu(zzyu4ZzZsD.zzX("preferRelativeResize", true));
        }
        if (zzc3ZzOt.zzZFM() == 5) {
            ((zzC1) zzc3ZzOt).zzXv(zzyu4ZzZsD.zzX("isComment", true));
        }
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 10) {
                switch (iZzTP) {
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        zzZ(zzc3ZzOt.zzZFL(), zzzxt);
                        break;
                    case 29:
                        ((zzC2) zzc3ZzOt).zzY(zzM(zzyu4ZzZsD));
                        break;
                    case 30:
                        ((zzC2) zzc3ZzOt).zzZ(zzM(zzyu4ZzZsD));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzc3ZzOt.setExtensions(zz81.zzd(zzzxt));
            }
        }
        return zzc3ZzOt;
    }

    private static zzBH zzM(zzYU4 zzyu4) {
        zzBH zzbh = new zzBH();
        zzbh.setId(zzyu4.zzO("id"));
        zzbh.setIndex(zzyu4.zzO("idx"));
        zzyu4.zzj();
        zzyu4.zzYyH();
        return zzbh;
    }

    private static zzC3 zzOt(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 31) {
            if (iZzTP != 32) {
                switch (iZzTP) {
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        return new zzBZ();
                    case 19:
                        return new zzBY();
                    case 20:
                        return new zzBX();
                    case 21:
                        return new zzC1();
                    default:
                        throw new IllegalArgumentException("Unexpected connector properties type.");
                }
            }
            return new zzC0();
        }
        return new zzC2();
    }

    public static void zzZ(zzZXT zzzxt, zzBK zzbk) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        if (zzbk.zzZHY() == 9 || zzbk.zzZHY() == 3) {
            ((zz6Z) zzbk).zzLV(zz84.zzPo(zzyu4ZzZsD.zzV("bwMode", "auto")));
        }
        while (zzyu4ZzZsD.zzQ("grpSpPr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    zzbk.zzZ(zz06.zzL(zzyu4ZzZsD, zzyo3ZzZqn));
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zzbk.setFill(zz7V.zzc(zzzxt));
                    break;
                case 7:
                    zzbk.zzZ(zz2E.zzZ(zzzxt, false, false));
                    break;
                case 8:
                    zzbk.zzZ(zz2E.zzZ(zzzxt, false, true));
                    break;
                case 9:
                    zzbk.zzZ(zz2R.zzX(zzzxt, zzyo3ZzZqn));
                    break;
                case 10:
                    zzbk.setExtensions(zz81.zzd(zzzxt));
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zzZC0 zzzc0) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 11) {
                zz39.zzI(zzyu4ZzZsD);
            } else {
                zzzc0.zzLV(zz84.zzPo(zzyu4ZzZsD.getValue()));
            }
        }
        while (zzyu4ZzZsD.zzQ("spPr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    zzzc0.zzZ(zz06.zzK(zzyu4ZzZsD, zzyo3ZzZqn));
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ((zzZCL) zzzc0).setFill(zz7V.zzc(zzzxt));
                    break;
                case 7:
                    zzzc0.zzZ(zz2E.zzZ(zzzxt, false, false));
                    break;
                case 8:
                    zzzc0.zzZ(zz2E.zzZ(zzzxt, false, true));
                    break;
                case 9:
                    zzzc0.zzZ(zz2R.zzX(zzzxt, zzyo3ZzZqn));
                    break;
                case 10:
                    zzzc0.zzR(zz81.zzd(zzzxt));
                    break;
                case 11:
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
                case 12:
                    zzzc0.zzZ(zz7G.zzS(zzyu4ZzZsD, zzyo3ZzZqn));
                    break;
                case 13:
                    zzzc0.zzZ(zz7G.zzS(zzyu4ZzZsD, zzyo3ZzZqn));
                    break;
                case 14:
                    ((zzZCL) zzzc0).setOutline(zz4C.zz4(zzzxt));
                    break;
                case 15:
                    zzzc0.zzZ(zz2R.zzW(zzzxt, zzyo3ZzZqn));
                    break;
            }
        }
    }

    public static void zzZ(zz4S zz4s, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    zz4s.zzZ(zz6(zzzxt));
                    break;
                case 22:
                    zz4s.zzY(zz5(zzzxt));
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
    }

    private static void zzZ(zz5G zz5g, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzZ(zz5g, zzyu4ZzZsD);
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 10) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zz5g.setExtensions(zz81.zzd(zzzxt));
            }
        }
    }

    private static void zzZ(zz5G zz5g, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 35:
                    zz5g.zza(7, zzyu4.zz8());
                    break;
                case 36:
                    zz5g.zza(8, zzyu4.zz8());
                    break;
                case 37:
                    zz5g.zza(3, zzyu4.zz8());
                    break;
                case 38:
                    zz5g.zza(9, zzyu4.zz8());
                    break;
                case 39:
                    zz5g.zza(6, zzyu4.zz8());
                    break;
                case 40:
                    zz5g.zza(0, zzyu4.zz8());
                    break;
                case 41:
                    zz5g.zza(11, zzyu4.zz8());
                    break;
                case 42:
                    zz5g.zza(4, zzyu4.zz8());
                    break;
                case 43:
                    zz5g.zza(5, zzyu4.zz8());
                    break;
                case 44:
                    zz5g.zza(2, zzyu4.zz8());
                    break;
                case 45:
                    zz5g.zza(1, zzyu4.zz8());
                    break;
                case 46:
                    zz5g.zza(12, zzyu4.zz8());
                    break;
                case 47:
                    zz5g.zza(13, zzyu4.zz8());
                    break;
                case 48:
                    zz5g.zza(10, zzyu4.zz8());
                    break;
                default:
                    zz39.zzI(zzyu4);
                    break;
            }
        }
    }
}
