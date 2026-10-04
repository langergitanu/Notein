package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzA5 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("ptLst", "cxnLst", "whole", TranslateLanguage.BULGARIAN, "extLst", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "effectLst", "effectDag", "ln", "cxn", TranslateLanguage.PORTUGUESE, "AlternateContent", "Choice", "Fallback", "spPr", "t", "prSet", "presAssocID", "presName", "presStyleLbl", "presStyleIdx", "presStyleCnt", "loTypeId", "loCatId", "qsTypeId", "qsCatId", "csTypeId", "csCatId", "coherent3DOff", "phldrT", "phldr", "custAng", "custFlipVert", "custFlipHor", "custSzX", "custSzY", "custScaleX", "custScaleY", "custT", "custLinFactX", "custLinFactY", "custLinFactNeighborX", "custLinFactNeighborY", "custRadScaleRad", "custRadScaleInc", "presLayoutVars", "style");
    private zzZXT zzZfi;

    private zzA5(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    private void zzM(zz93 zz93Var) throws Exception {
        zz93Var.zzZ(zz9Z.zzQr(this.zzZfi.zzZsD().zzV("modelId", "")));
        zz93Var.setType(zz9Z.zzQp(this.zzZfi.zzZsD().zzV(C18437z2.f56754h, "node")));
        zz93Var.zzO(zz9Z.zzQr(this.zzZfi.zzZsD().zzV("cxnId", "0")));
        while (this.zzZfi.zzZsD().zzQ(TranslateLanguage.PORTUGUESE)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 4) {
                switch (iZzTP) {
                    case 19:
                        zz93Var.zzZ(new zz1U(this.zzZfi.getDocument()));
                        zz51.zzZ(this.zzZfi, zz93Var.zzZCY());
                        break;
                    case 20:
                        zz93Var.zzX(new zz11());
                        zz0I.zzZ(this.zzZfi, zz93Var.zzZCZ(), "t");
                        break;
                    case 21:
                        zz93Var.zzZ(zzZEc());
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
            } else {
                zz93Var.setExtensions(zz81.zzd(this.zzZfi));
            }
        }
    }

    private void zzN(zz93 zz93Var) throws Exception {
        while (this.zzZfi.zzZsD().zzT(false)) {
            com.aspose.words.internal.zzZQF.zzY(zz93Var.zzZCV(), com.aspose.words.internal.zzZYD.zzXk(this.zzZfi.zzZsD().getPrefix()) ? com.aspose.words.internal.zzZKN.format("{0}:{1}", this.zzZfi.zzZsD().getPrefix(), this.zzZfi.zzZsD().getLocalName()) : this.zzZfi.zzZsD().getLocalName(), this.zzZfi.zzZsD().getValue());
        }
        this.zzZfi.zzZsD().zzj();
        while (this.zzZfi.zzZsD().zzQ("Choice")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 15) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzM(zz93Var);
            }
        }
    }

    private void zzO(zz93 zz93Var) throws Exception {
        zz93Var.zzI(new zz93());
        while (this.zzZfi.zzZsD().zzQ("Fallback")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 15) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzM(zz93Var.zzZCW());
            }
        }
    }

    private int zzQx(String str) {
        return com.aspose.words.internal.zzAN.zzZG(zz3W.zzXy(zz3W.zzZ(str, this.zzZfi.zzZqn())));
    }

    private zz3E zzZEc() {
        zz3E zz3e = new zz3E();
        while (this.zzZfi.zzZsD().zzi()) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 22:
                    zz3e.zzZwi().zzL(0, zz9Z.zzQr(this.zzZfi.zzZsD().getValue()));
                    break;
                case 23:
                    zz3e.zzZwi().zzL(1, this.zzZfi.zzZsD().getValue());
                    break;
                case 24:
                    zz3e.zzZwi().zzL(2, this.zzZfi.zzZsD().getValue());
                    break;
                case 25:
                    zz3e.zzZwi().zzL(3, Integer.valueOf(this.zzZfi.zzZsD().zzb()));
                    break;
                case 26:
                    zz3e.zzZwi().zzL(4, Integer.valueOf(this.zzZfi.zzZsD().zzb()));
                    break;
                case 27:
                    zz3e.zzZwi().zzL(5, this.zzZfi.zzZsD().getValue());
                    break;
                case 28:
                    zz3e.zzZwi().zzL(6, this.zzZfi.zzZsD().getValue());
                    break;
                case 29:
                    zz3e.zzZwi().zzL(7, this.zzZfi.zzZsD().getValue());
                    break;
                case 30:
                    zz3e.zzZwi().zzL(8, this.zzZfi.zzZsD().getValue());
                    break;
                case 31:
                    zz3e.zzZwi().zzL(9, this.zzZfi.zzZsD().getValue());
                    break;
                case 32:
                    zz3e.zzZwi().zzL(10, this.zzZfi.zzZsD().getValue());
                    break;
                case 33:
                    zz3e.zzZwi().zzL(11, Boolean.valueOf(this.zzZfi.zzZsD().zz8()));
                    break;
                case 34:
                    zz3e.zzZwi().zzL(12, this.zzZfi.zzZsD().getValue());
                    break;
                case 35:
                    zz3e.zzZwi().zzL(13, Boolean.valueOf(this.zzZfi.zzZsD().zz8()));
                    break;
                case 36:
                    zz3e.zzZwi().zzL(14, Integer.valueOf(this.zzZfi.zzZsD().zzb()));
                    break;
                case 37:
                    zz3e.zzZwi().zzL(15, Boolean.valueOf(this.zzZfi.zzZsD().zz8()));
                    break;
                case 38:
                    zz3e.zzZwi().zzL(16, Boolean.valueOf(this.zzZfi.zzZsD().zz8()));
                    break;
                case 39:
                    zz3e.zzZwi().zzL(17, Integer.valueOf(this.zzZfi.zzZsD().zzb()));
                    break;
                case 40:
                    zz3e.zzZwi().zzL(18, Integer.valueOf(this.zzZfi.zzZsD().zzb()));
                    break;
                case 41:
                    zz3e.zzZwi().zzL(19, Integer.valueOf(zzQx(this.zzZfi.zzZsD().getValue())));
                    break;
                case 42:
                    zz3e.zzZwi().zzL(20, Integer.valueOf(zzQx(this.zzZfi.zzZsD().getValue())));
                    break;
                case 43:
                    zz3e.zzZwi().zzL(21, Boolean.valueOf(this.zzZfi.zzZsD().zz8()));
                    break;
                case 44:
                    zz3e.zzZwi().zzL(22, Integer.valueOf(zzQx(this.zzZfi.zzZsD().getValue())));
                    break;
                case 45:
                    zz3e.zzZwi().zzL(23, Integer.valueOf(zzQx(this.zzZfi.zzZsD().getValue())));
                    break;
                case 46:
                    zz3e.zzZwi().zzL(24, Integer.valueOf(zzQx(this.zzZfi.zzZsD().getValue())));
                    break;
                case 47:
                    zz3e.zzZwi().zzL(25, Integer.valueOf(zzQx(this.zzZfi.zzZsD().getValue())));
                    break;
                case 48:
                    zz3e.zzZwi().zzL(26, Integer.valueOf(zzQx(this.zzZfi.zzZsD().getValue())));
                    break;
                case 49:
                    zz3e.zzZwi().zzL(27, Integer.valueOf(zzQx(this.zzZfi.zzZsD().getValue())));
                    break;
                default:
                    zz39.zzI(this.zzZfi.zzZsD());
                    break;
            }
        }
        while (this.zzZfi.zzZsD().zzQ("prSet")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 50) {
                zz3e.zzW(zzAP.zzO(this.zzZfi.zzZsD()));
            } else if (iZzTP != 51) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zz3e.zzZ(zz1J.zzQ(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
            }
        }
        return zz3e;
    }

    private zz93 zzZEd() throws Exception {
        zz93 zz93Var = new zz93();
        zzM(zz93Var);
        return zz93Var;
    }

    private zz93 zzZEe() throws Exception {
        zz93 zz93Var = new zz93();
        while (this.zzZfi.zzZsD().zzT(false)) {
            com.aspose.words.internal.zzZQF.zzY(zz93Var.zzZCU(), com.aspose.words.internal.zzZYD.zzXk(this.zzZfi.zzZsD().getPrefix()) ? com.aspose.words.internal.zzZKN.format("{0}:{1}", this.zzZfi.zzZsD().getPrefix(), this.zzZfi.zzZsD().getLocalName()) : this.zzZfi.zzZsD().getLocalName(), this.zzZfi.zzZsD().getValue());
        }
        this.zzZfi.zzZsD().zzj();
        while (this.zzZfi.zzZsD().zzQ("AlternateContent")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 17) {
                zzN(zz93Var);
            } else if (iZzTP != 18) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzO(zz93Var);
            }
        }
        return zz93Var;
    }

    private zz93[] zzZEf() throws Exception {
        ArrayList arrayList = new ArrayList();
        while (this.zzZfi.zzZsD().zzQ("ptLst")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 15) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz93>) arrayList, zzZEd());
            } else if (iZzTP != 16) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz93>) arrayList, zzZEe());
            }
        }
        return (zz93[]) arrayList.toArray(new zz93[0]);
    }

    private zzAN zzZEg() {
        zzAN zzan = new zzAN();
        zzan.zzZ(zz9Z.zzQr(this.zzZfi.zzZsD().zzV("modelId", "")));
        zzan.setType(zz9Z.zzQq(this.zzZfi.zzZsD().zzV(C18437z2.f56754h, "parOf")));
        zzan.zzX(zz9Z.zzQr(this.zzZfi.zzZsD().zzV("srcId", "")));
        zzan.zzY(zz9Z.zzQr(this.zzZfi.zzZsD().zzV("destId", "")));
        zzan.zzJn(this.zzZfi.zzZsD().zzX("srcOrd", 0));
        zzan.zzJo(this.zzZfi.zzZsD().zzX("destOrd", 0));
        zzan.zzW(zz9Z.zzQr(this.zzZfi.zzZsD().zzV("parTransId", "0")));
        zzan.zzV(zz9Z.zzQr(this.zzZfi.zzZsD().zzV("sibTransId", "0")));
        zzan.zzQy(this.zzZfi.zzZsD().zzV("presId", ""));
        return zzan;
    }

    private zzAN[] zzZEh() {
        ArrayList arrayList = new ArrayList();
        while (this.zzZfi.zzZsD().zzQ("cxnLst")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 14) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzAN>) arrayList, zzZEg());
            }
        }
        return (zzAN[]) arrayList.toArray(new zzAN[0]);
    }

    private zz8L zzZEi() throws Exception {
        zz8L zz8l = new zz8L();
        while (this.zzZfi.zzZsD().zzQ("whole")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 11:
                    zz8l.zzZ(zz2E.zzZ(this.zzZfi, false, false));
                    break;
                case 12:
                    zz8l.zzZ(zz2E.zzZ(this.zzZfi, false, true));
                    break;
                case 13:
                    zz8l.setOutline(zz4C.zz4(this.zzZfi));
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
        return zz8l;
    }

    private zzAU zzZEj() throws Exception {
        zzAU zzau = new zzAU();
        while (this.zzZfi.zzZsD().zzQ(TranslateLanguage.BULGARIAN)) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    zzau.setFill(zz7V.zzc(this.zzZfi));
                    break;
                case 11:
                    zzau.zzZ(zz2E.zzZ(this.zzZfi, false, false));
                    break;
                case 12:
                    zzau.zzZ(zz2E.zzZ(this.zzZfi, false, true));
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
        return zzau;
    }

    public static zzAM zzv(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        if (!"dataModel".equals(zzyu4ZzZsD.getLocalName())) {
            return null;
        }
        zzA5 zza5 = new zzA5(zzzxt);
        zzAM zzam = new zzAM();
        while (zzyu4ZzZsD.zzQ("dataModel")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzam.zzZ(zza5.zzZEf());
            } else if (iZzTP == 1) {
                zzam.zzZ(zza5.zzZEh());
            } else if (iZzTP == 2) {
                zzam.zzZ(zza5.zzZEi());
            } else if (iZzTP == 3) {
                zzam.zzZ(zza5.zzZEj());
            } else if (iZzTP != 4) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzam.setExtensions(zz81.zzd(zzzxt));
            }
        }
        return zzam;
    }
}
