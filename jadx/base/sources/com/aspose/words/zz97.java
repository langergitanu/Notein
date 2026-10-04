package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz97 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(NoteMeta.PROPERTY_TITLE, "desc", "catLst", "sampData", "styleData", "clrData", "layoutNode", "extLst", "dataModel", AbstractJwtRequest.ClaimNames.ALG, "shape", "presOf", "constrLst", "ruleLst", "varLst", "forEach", "choose", "param", "adjLst", "adj", "constr", "rule", "if", "else");
    private zzZXT zzZfi;

    private zz97(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    private double zzT(String str, double d) {
        String strZzV = this.zzZfi.zzZsD().zzV(str, null);
        if (strZzV == null) {
            return d;
        }
        int i = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzX(strZzV, "inf", i)) {
            return Double.POSITIVE_INFINITY;
        }
        if (com.aspose.words.internal.zzZKN.zzX(strZzV, "-inf", i)) {
            return Double.NEGATIVE_INFINITY;
        }
        if (com.aspose.words.internal.zzZKN.zzX(strZzV, "nan", i)) {
            return Double.NaN;
        }
        return com.aspose.words.internal.zzJB.zzZs(strZzV);
    }

    public static zz9L zzX(zzZXT zzzxt, String str) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        if (!"layoutDef".equals(zzyu4ZzZsD.getLocalName())) {
            return null;
        }
        zz97 zz97Var = new zz97(zzzxt);
        zz9L zz9l = new zz9L(str);
        zz9l.zzT6(zzyu4ZzZsD.zzV("uniqueId", ""));
        zz9l.zzQA(zzyu4ZzZsD.zzV("minVer", ""));
        zz9l.zzPI(zzyu4ZzZsD.zzV("defStyle", ""));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (zzyu4ZzZsD.zzQ("layoutDef")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8T>) arrayList, zzAP.zzQ(zzyu4ZzZsD));
                    break;
                case 1:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8T>) arrayList2, zzAP.zzQ(zzyu4ZzZsD));
                    break;
                case 2:
                    zz9l.zzZ(zzAP.zzP(zzyu4ZzZsD));
                    break;
                case 3:
                    zz9l.zzY(zz97Var.zzZDi());
                    break;
                case 4:
                    zz9l.zzW(zz97Var.zzZDi());
                    break;
                case 5:
                    zz9l.zzX(zz97Var.zzZDi());
                    break;
                case 6:
                    zz9l.zzZ(zz97Var.zzZDh());
                    break;
                case 7:
                    zz9l.setExtensions(zz81.zzd(zzzxt));
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
        zz9l.zzZ((zz8T[]) arrayList.toArray(new zz8T[0]));
        zz9l.zzY((zz8T[]) arrayList2.toArray(new zz8T[0]));
        return zz9l;
    }

    private void zzZ(zz6C zz6c) {
        zz6c.zzw(zz9Z.zzQl(this.zzZfi.zzZsD().zzV("axis", "none")));
        zz6c.zzv(zz9Z.zzQj(this.zzZfi.zzZsD().zzV("ptType", "all")));
        zz6c.zzX(zz9Z.zzQt(this.zzZfi.zzZsD().zzV("hideLastTrans", TelemetryEventStrings.Value.TRUE)));
        zz6c.zzu(zz9Z.zzQs(this.zzZfi.zzZsD().zzV("st", "1")));
        zz6c.zzt(zz9Z.zzQs(this.zzZfi.zzZsD().zzV("cnt", "0")));
        zz6c.zzs(zz9Z.zzQs(this.zzZfi.zzZsD().zzV("step", "1")));
    }

    private zz4H zzZD1() throws Exception {
        zz4H zz4h = new zz4H();
        zz4h.setName(this.zzZfi.zzZsD().zzV("name", ""));
        zz4h.zz4(new ArrayList<>());
        while (this.zzZfi.zzZsD().zzQ("else")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 6:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz99>) zz4h.zzAy(), zzZDh());
                    break;
                case 7:
                    zz4h.setExtensions(zz81.zzd(this.zzZfi));
                    break;
                case 8:
                case 14:
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
                case 9:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzJG>) zz4h.zzAy(), zzZDg());
                    break;
                case 10:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8X>) zz4h.zzAy(), zzZDe());
                    break;
                case 11:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz3J>) zz4h.zzAy(), zzZDb());
                    break;
                case 12:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBD>) zz4h.zzAy(), zzZDa());
                    break;
                case 13:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz4U>) zz4h.zzAy(), zzZD6());
                    break;
                case 15:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz7N>) zz4h.zzAy(), zzZD4());
                    break;
                case 16:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzC5>) zz4h.zzAy(), zzZD3());
                    break;
            }
        }
        return zz4h;
    }

    private zzZZV zzZD2() throws Exception {
        zzZZV zzzzv = new zzZZV();
        zzzzv.setName(this.zzZfi.zzZsD().zzV("name", ""));
        zzZ(zzzzv.zzZAS());
        zzzzv.zzGv(zz9Z.zzQ6(this.zzZfi.zzZsD().zzV("func", "")));
        zzzzv.zzGu(zz9Z.zzQ5(this.zzZfi.zzZsD().zzV("arg", "none")));
        zzzzv.zzJv(zz9Z.zzQ4(this.zzZfi.zzZsD().zzV("op", "")));
        zzzzv.setValue(this.zzZfi.zzZsD().zzV("val", ""));
        zzzzv.zz4(new ArrayList<>());
        while (this.zzZfi.zzZsD().zzQ("if")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 6:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz99>) zzzzv.zzAy(), zzZDh());
                    break;
                case 7:
                    zzzzv.setExtensions(zz81.zzd(this.zzZfi));
                    break;
                case 8:
                case 14:
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
                case 9:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzJG>) zzzzv.zzAy(), zzZDg());
                    break;
                case 10:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8X>) zzzzv.zzAy(), zzZDe());
                    break;
                case 11:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz3J>) zzzzv.zzAy(), zzZDb());
                    break;
                case 12:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBD>) zzzzv.zzAy(), zzZDa());
                    break;
                case 13:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz4U>) zzzzv.zzAy(), zzZD6());
                    break;
                case 15:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz7N>) zzzzv.zzAy(), zzZD4());
                    break;
                case 16:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzC5>) zzzzv.zzAy(), zzZD3());
                    break;
            }
        }
        return zzzzv;
    }

    private zzC5 zzZD3() throws Exception {
        zzC5 zzc5 = new zzC5();
        zzc5.setName(this.zzZfi.zzZsD().zzV("name", ""));
        zzc5.zzc(new ArrayList<>());
        while (this.zzZfi.zzZsD().zzQ("choose")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 22) {
                com.aspose.words.internal.zzZQG.zzZ(zzc5.zzZFQ(), zzZD2());
            } else if (iZzTP != 23) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzc5.zzZ(zzZD1());
            }
        }
        return zzc5;
    }

    private zz7N zzZD4() throws Exception {
        zz7N zz7n = new zz7N();
        zz7n.setName(this.zzZfi.zzZsD().zzV("name", ""));
        zz7n.zzOF(this.zzZfi.zzZsD().zzV("ref", ""));
        zzZ(zz7n.zzZAS());
        zz7n.zz4(new ArrayList<>());
        while (this.zzZfi.zzZsD().zzQ("forEach")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 6:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz99>) zz7n.zzAy(), zzZDh());
                    break;
                case 7:
                    zz7n.setExtensions(zz81.zzd(this.zzZfi));
                    break;
                case 8:
                case 14:
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
                case 9:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzJG>) zz7n.zzAy(), zzZDg());
                    break;
                case 10:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8X>) zz7n.zzAy(), zzZDe());
                    break;
                case 11:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz3J>) zz7n.zzAy(), zzZDb());
                    break;
                case 12:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBD>) zz7n.zzAy(), zzZDa());
                    break;
                case 13:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz4U>) zz7n.zzAy(), zzZD6());
                    break;
                case 15:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz7N>) zz7n.zzAy(), zzZD4());
                    break;
                case 16:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzC5>) zz7n.zzAy(), zzZD3());
                    break;
            }
        }
        return zz7n;
    }

    private zz4V zzZD5() {
        zz4V zz4v = new zz4V();
        zz4v.setValue(zzT("val", Double.NaN));
        zz4v.zzXZ(zzT("fact", Double.NaN));
        zz4v.zzZN(zzT("max", Double.NaN));
        zz4v.zzZ(zzZD7());
        return zz4v;
    }

    private zz4U zzZD6() {
        zz4U zz4u = new zz4U();
        zz4u.zz9(new ArrayList<>());
        while (this.zzZfi.zzZsD().zzQ("ruleLst")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 21) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                com.aspose.words.internal.zzZQG.zzZ(zz4u.zzl9(), zzZD5());
            }
        }
        return zz4u;
    }

    private zzBE zzZD7() {
        return new zzBE(zz9Z.zzPO(this.zzZfi.zzZsD().zzV(C18437z2.f56754h, "")), zz9Z.zzQh(this.zzZfi.zzZsD().zzV("for", "self")), this.zzZfi.zzZsD().zzV("forName", ""), zz9Z.zzQk(this.zzZfi.zzZsD().zzV("ptType", "all")));
    }

    private zzBE zzZD8() {
        return new zzBE(zz9Z.zzPO(this.zzZfi.zzZsD().zzV("refType", "none")), zz9Z.zzQh(this.zzZfi.zzZsD().zzV("refFor", "self")), this.zzZfi.zzZsD().zzV("refForName", ""), zz9Z.zzQk(this.zzZfi.zzZsD().zzV("refPtType", "all")));
    }

    private zzBF zzZD9() {
        zzBF zzbf = new zzBF();
        zzbf.zzJv(zz9Z.zzQi(this.zzZfi.zzZsD().zzV("op", "none")));
        zzbf.setValue(zzT("val", 0.0d));
        zzbf.zzXZ(zzT("fact", 1.0d));
        zzbf.zzZ(zzZD7());
        zzbf.zzY(zzZD8());
        return zzbf;
    }

    private zzBD zzZDa() {
        zzBD zzbd = new zzBD();
        zzbd.zz9(new ArrayList<>());
        while (this.zzZfi.zzZsD().zzQ("constrLst")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 20) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                com.aspose.words.internal.zzZQG.zzZ(zzbd.zzl9(), zzZD9());
            }
        }
        return zzbd;
    }

    private zz3J zzZDb() {
        zz3J zz3j = new zz3J();
        zzZ(zz3j.zzZAS());
        return zz3j;
    }

    private zz2M zzZDc() {
        zz2M zz2m = new zz2M();
        zz2m.zzH2(this.zzZfi.zzZsD().zzX("idx", 0));
        zz2m.setValue(this.zzZfi.zzZsD().zzZ("val", 0.0d));
        return zz2m;
    }

    private zz2M[] zzZDd() {
        ArrayList arrayList = new ArrayList();
        while (this.zzZfi.zzZsD().zzQ("adjLst")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 19) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz2M>) arrayList, zzZDc());
            }
        }
        return (zz2M[]) arrayList.toArray(new zz2M[0]);
    }

    private zz8X zzZDe() throws Exception {
        zz8X zz8x = new zz8X();
        zz8x.zzPy(this.zzZfi.zzZsD().zzV(C18437z2.f56754h, "none"));
        zz8x.zzX(zzHK.zzYR(this.zzZfi.zzZsD().zzZ("rot", 0.0d)));
        zz8x.setZOrder(this.zzZfi.zzZsD().zzX("zOrderOff", 0));
        zz8x.zzXm(this.zzZfi.zzZsD().zzX("hideGeom", false));
        zz8x.zzXl(this.zzZfi.zzZsD().zzX("lkTxEntry", false));
        zz8x.zzXk(this.zzZfi.zzZsD().zzX("blipPhldr", false));
        zz8x.zzPx(this.zzZfi.zzZsD().zzV("blip", ""));
        if (com.aspose.words.internal.zzZYD.zzXk(zz8x.zzZCB())) {
            zz8x.zzYs(this.zzZfi.zzNO(zz8x.zzZCB()));
        }
        while (this.zzZfi.zzZsD().zzQ("shape")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 7) {
                zz8x.setExtensions(zz81.zzd(this.zzZfi));
            } else if (iZzTP != 18) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zz8x.zzZ(zzZDd());
            }
        }
        return zz8x;
    }

    private zz46 zzZDf() {
        zz46 zz46Var = new zz46();
        zz46Var.zzPy(this.zzZfi.zzZsD().zzV(C18437z2.f56754h, ""));
        zz46Var.setValue(this.zzZfi.zzZsD().zzV("val", ""));
        return zz46Var;
    }

    private zzJG zzZDg() throws Exception {
        zzJG zzjg = new zzJG();
        zzjg.setType(zz9Z.zzQn(this.zzZfi.zzZsD().zzV(C18437z2.f56754h, "")));
        zzjg.zzLI(this.zzZfi.zzZsD().zzX("rev", 0));
        while (this.zzZfi.zzZsD().zzQ(AbstractJwtRequest.ClaimNames.ALG)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 7) {
                zzjg.setExtensions(zz81.zzd(this.zzZfi));
            } else if (iZzTP != 17) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zz46 zz46VarZzZDf = zzZDf();
                if (!zzjg.zzZSm().containsKey(zz46VarZzZDf.getType())) {
                    zzjg.zzZSm().zzB(zz46VarZzZDf.getType(), zz46VarZzZDf.getValue());
                }
            }
        }
        return zzjg;
    }

    private zz99 zzZDh() throws Exception {
        zz99 zz99Var = new zz99();
        zz99Var.setName(this.zzZfi.zzZsD().zzV("name", ""));
        zz99Var.zzPG(this.zzZfi.zzZsD().zzV("styleLbl", ""));
        zz99Var.zzIX(zz9Z.zzQo(this.zzZfi.zzZsD().zzV("chOrder", "b")));
        zz99Var.zzPF(this.zzZfi.zzZsD().zzV("moveWith", ""));
        zz99Var.zz4(new ArrayList<>());
        while (this.zzZfi.zzZsD().zzQ("layoutNode")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 6:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz99>) zz99Var.zzAy(), zzZDh());
                    break;
                case 7:
                    zz99Var.setExtensions(zz81.zzd(this.zzZfi));
                    break;
                case 8:
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
                case 9:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzJG>) zz99Var.zzAy(), zzZDg());
                    break;
                case 10:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8X>) zz99Var.zzAy(), zzZDe());
                    break;
                case 11:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz3J>) zz99Var.zzAy(), zzZDb());
                    break;
                case 12:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBD>) zz99Var.zzAy(), zzZDa());
                    break;
                case 13:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz4U>) zz99Var.zzAy(), zzZD6());
                    break;
                case 14:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz60>) zz99Var.zzAy(), zzAP.zzO(this.zzZfi.zzZsD()));
                    break;
                case 15:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz7N>) zz99Var.zzAy(), zzZD4());
                    break;
                case 16:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzC5>) zz99Var.zzAy(), zzZD3());
                    break;
            }
        }
        return zz99Var;
    }

    private zzAM zzZDi() throws Exception {
        String localName = this.zzZfi.zzZsD().getLocalName();
        boolean zZzN = com.aspose.words.internal.zzO.zzN(this.zzZfi.zzZsD().zzV("useDef", ""));
        this.zzZfi.zzZsD().zzj();
        zzAM zzamZzv = null;
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 8) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzamZzv = zzA5.zzv(this.zzZfi);
            }
        }
        if (zzamZzv != null) {
            zzamZzv.zzXr(zZzN);
        }
        return zzamZzv;
    }
}
