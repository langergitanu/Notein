package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz7V extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("gradFill", "noFill", "solidFill", "blipFill", "grpFill", "pattFill", "bgClr", "fgClr", "gsLst", "lin", "path", "tileRect", "fillToRect", "gs", "blip", "srcRect", "stretch", "tile", "fillRect", "extLst", "biLevel", "clrChange", "grayscl", "lum", "duotone", "blur", "alphaBiLevel", "alphaCeiling", "alphaFloor", "alphaInv", "alphaMod", "alphaModFix", "alphaRepl", "clrRepl", "fillOverlay", "hsl", "tint");
    private zzZXT zzZfi;

    private zz7V(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    public static zzH1 zz9(zzZXT zzzxt) throws Exception {
        zzH1 zzh1 = new zzH1();
        zzh1.zzLD(zzN(zzzxt.zzZsD()));
        zzh1.zzY(zzzxt.getDocument());
        String strZzV = zzzxt.zzZsD().zzV("embed", "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            zzh1.zzYt(zzzxt.zzNO(strZzV));
        }
        String strZzV2 = zzzxt.zzZsD().zzV("link", "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV2)) {
            zzh1.zzRE(zzzxt.zzY9(strZzV2));
        }
        zzZ(zzh1, zzzxt);
        return zzh1;
    }

    private static int zzN(zzYU4 zzyu4) {
        return zz84.zzOX(zzyu4.zzV("cstate", ""));
    }

    private static void zzZ(zzH1 zzh1, zzZXT zzzxt) throws Exception {
        ArrayList<zz8E> arrayList = new ArrayList<>();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 19:
                    zzh1.setExtensions(zz81.zzd(zzzxt));
                    break;
                case 20:
                    arrayList.add(zz8B.zzh(zzzxt));
                    break;
                case 21:
                    arrayList.add(zz8B.zzg(zzzxt));
                    break;
                case 22:
                    arrayList.add(zz8B.zzZC8());
                    break;
                case 23:
                    arrayList.add(zz8B.zzf(zzzxt));
                    break;
                case 24:
                    arrayList.add(zz8B.zze(zzzxt));
                    break;
                case 25:
                    arrayList.add(zz8B.zzi(zzzxt));
                    break;
                case 26:
                    arrayList.add(zz8B.zzj(zzzxt));
                    break;
                case 27:
                    arrayList.add(new zzHT());
                    break;
                case 28:
                    arrayList.add(new zzHS());
                    break;
                case 29:
                    arrayList.add(zz8B.zzk(zzzxt));
                    break;
                case 30:
                    arrayList.add(zz8B.zzl(zzzxt));
                    break;
                case 31:
                    arrayList.add(zz8B.zzm(zzzxt));
                    break;
                case 32:
                    arrayList.add(zz8B.zzn(zzzxt));
                    break;
                case 33:
                    arrayList.add(zz8B.zzo(zzzxt));
                    break;
                case 34:
                    arrayList.add(zz8B.zzp(zzzxt));
                    break;
                case 35:
                    arrayList.add(zz8B.zzq(zzzxt));
                    break;
                case 36:
                    arrayList.add(zz8B.zzr(zzzxt));
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
        zzh1.zzi(arrayList);
    }

    private int zzZB4() {
        return zz84.zzOZ(this.zzZfi.zzZsD().zzV("prst", ""));
    }

    private zzGZ zzZB5() {
        zzGZ zzgz = new zzGZ();
        while (this.zzZfi.zzZsD().zzQ("stretch")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 18) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzgz.zzY(zzZBe());
            }
        }
        return zzgz;
    }

    private int zzZB6() {
        return zz84.zzOY(this.zzZfi.zzZsD().zzV("algn", ""));
    }

    private zzGY zzZB7() {
        zzGY zzgy = new zzGY();
        zzgy.setAlignment(zzZB6());
        zzgy.zzLB(zzZB9());
        zzgy.zzYP(zz3W.zzZ(this.zzZfi.zzZsD().zzV("sx", ""), 1.0d, this.zzZfi.zzZqn()));
        zzgy.zzYO(zz3W.zzZ(this.zzZfi.zzZsD().zzV("sy", ""), 1.0d, this.zzZfi.zzZqn()));
        zzgy.zzYN(this.zzZfi.zzZsD().zzS("tx", this.zzZfi.zzZqn()));
        zzgy.zzYM(this.zzZfi.zzZsD().zzS("ty", this.zzZfi.zzZqn()));
        return zzgy;
    }

    private zzH0 zzZB8() throws Exception {
        zzH0 zzh0 = new zzH0();
        zzh0.zzLC(this.zzZfi.zzZsD().zzO("dpi"));
        zzh0.zzY6(this.zzZfi.zzZsD().zzX("rotWithShape", true));
        while (this.zzZfi.zzZsD().zzQ("blipFill")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 14:
                    zzh0.zzY(zz9(this.zzZfi));
                    break;
                case 15:
                    zzh0.zzZ(zzZBe());
                    break;
                case 16:
                    zzh0.zzZ(zzZB5());
                    break;
                case 17:
                    zzh0.zzZ(zzZB7());
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
        return zzh0;
    }

    private int zzZB9() {
        return zz84.zzPe(this.zzZfi.zzZsD().zzV("flip", ""));
    }

    private zz7B zzZBa() {
        zz7B zz7b = new zz7B();
        zz7b.setPosition(zz3W.zzZ(this.zzZfi.zzZsD().zzV("pos", ""), this.zzZfi.zzZqn()));
        zz7b.zzZ(zzBR.zzX(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
        return zz7b;
    }

    private ArrayList<zz7B> zzZBb() {
        ArrayList<zz7B> arrayList = new ArrayList<>();
        while (this.zzZfi.zzZsD().zzQ("gsLst")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 13) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zz7B zz7bZzZBa = zzZBa();
                zz7bZzZBa.zzI7(arrayList.size());
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zz7bZzZBa);
            }
        }
        return arrayList;
    }

    private zz5S zzZBc() {
        zz5S zz5s = new zz5S();
        zz5s.zzU(new zzHK(this.zzZfi.zzZsD().zzZ("ang", 0.0d)));
        zz5s.zzX0(this.zzZfi.zzZsD().zzX("scaled", false));
        return zz5s;
    }

    private int zzZBd() {
        return zz84.zzPd(this.zzZfi.zzZsD().zzV("path", ""));
    }

    private zz3Z zzZBe() {
        zz3Z zz3z = new zz3Z();
        zz3z.zzXH(zz3W.zzZ(this.zzZfi.zzZsD().zzV("b", ""), this.zzZfi.zzZqn()));
        zz3z.zzXG(zz3W.zzZ(this.zzZfi.zzZsD().zzV("t", ""), this.zzZfi.zzZqn()));
        zz3z.zzXF(zz3W.zzZ(this.zzZfi.zzZsD().zzV("l", ""), this.zzZfi.zzZqn()));
        zz3z.zzXE(zz3W.zzZ(this.zzZfi.zzZsD().zzV("r", ""), this.zzZfi.zzZqn()));
        return zz3z;
    }

    private zz44 zzZBf() {
        zz44 zz44Var = new zz44();
        zz44Var.zzHg(zzZBd());
        while (this.zzZfi.zzZsD().zzQ("path")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 12) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zz44Var.zzW(zzZBe());
            }
        }
        return zz44Var;
    }

    private zz7C zzZBg() {
        zz7C zz7c = new zz7C();
        zz7c.zzLB(zzZB9());
        zz7c.zzY6(this.zzZfi.zzZsD().zzX("rotWithShape", true));
        zzZ(zz7c);
        return zz7c;
    }

    private zz41 zzZBh() {
        zz41 zz41Var = new zz41();
        zz41Var.zzHf(zzZB4());
        while (this.zzZfi.zzZsD().zzQ("pattFill")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 6) {
                zz41Var.zzN(zzBR.zzX(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
            } else if (iZzTP != 7) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zz41Var.zzM(zzBR.zzX(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
            }
        }
        return zz41Var;
    }

    private zz1C zzZBi() {
        zzBW zzbwZzX = zzBR.zzX(this.zzZfi.zzZsD(), this.zzZfi.zzZqn());
        if (zzbwZzX == null) {
            return null;
        }
        zz1C zz1c = new zz1C();
        zz1c.zzZ(zzbwZzX);
        return zz1c;
    }

    private zz7X zzZBj() throws Exception {
        int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
        if (iZzTP == 0) {
            return zzZBg();
        }
        if (iZzTP == 1) {
            return new zz54();
        }
        if (iZzTP == 2) {
            return zzZBi();
        }
        if (iZzTP == 3) {
            return zzZB8();
        }
        if (iZzTP == 4) {
            return new zz70();
        }
        if (iZzTP == 5) {
            return zzZBh();
        }
        zz39.zzK(this.zzZfi.zzZsD());
        return null;
    }

    private zz7X zzZBk() {
        int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
        if (iZzTP == 0) {
            return zzZBg();
        }
        if (iZzTP == 1) {
            return new zz54();
        }
        if (iZzTP == 2) {
            return zzZBi();
        }
        zz39.zzK(this.zzZfi.zzZsD());
        return null;
    }

    public static zz7X zza(zzZXT zzzxt) {
        return new zz7V(zzzxt).zzZBk();
    }

    public static zz7X zzb(zzZXT zzzxt) {
        zz7V zz7v = new zz7V(zzzxt);
        String localName = zzzxt.zzZsD().getLocalName();
        while (zzzxt.zzZsD().zzQ(localName)) {
            zz7X zz7xZzZBk = zz7v.zzZBk();
            if (zz7xZzZBk != null) {
                return zz7xZzZBk;
            }
        }
        return null;
    }

    public static zz7X zzc(zzZXT zzzxt) throws Exception {
        return new zz7V(zzzxt).zzZBj();
    }

    private void zzZ(zz7C zz7c) {
        while (this.zzZfi.zzZsD().zzQ("gradFill")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 8:
                    zz7c.zz2(zzZBb());
                    break;
                case 9:
                    zz7c.zzZ(zzZBc());
                    break;
                case 10:
                    zz7c.zzZ(zzZBf());
                    break;
                case 11:
                    zz7c.zzX(zzZBe());
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
    }
}
