package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18293o1;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUX {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("oMath", "oMathParaPr", "jc", "acc", "bar", "borderBox", "box", "d", "eqArr", "f", "func", "groupChr", "limLow", "limUpp", "m", "nary", "oMathPara", "phant", "rad", "sPre", "sSub", "sSubSup", "sSup", "argPr", "ctrlPr", "e", "fPr", "den", "num", C18437z2.f56754h, "funcPr", "fName", "lim", "limUppPr", "limLowPr", TranslateLanguage.MARATHI, "mPr", "baseJc", "cGp", "cGpRule", "cSp", "mcs", "plcHide", "rSp", "rSpRule", "mc", "mcPr", C18293o1.f55803f, "mcJc", "naryPr", "sub", "sup", "chr", "grow", "limLoc", "subHide", "supHide", "deg", "radPr", "degHide", "sPrePr", "sSubPr", "sSubSupPr", "sSupPr", "alnScr", "argSz", "pos", "hideBot", "hideLeft", "hideRight", "hideTop", "strikeBLTR", "strikeH", "strikeTLBR", "strikeV", "aln", "brk", "diff", "noBreak", "opEmu", "begChr", "endChr", "sepChr", "shp", "maxDist", "objDist", "vertJc", "show", "transp", "zeroAsc", "zeroDesc", "zeroWid");

    private static void zzE(ArrayList<Integer> arrayList, int i) {
        int iIndexOf = arrayList.indexOf(Integer.valueOf(i));
        if (iIndexOf > 0) {
            arrayList.remove(iIndexOf);
            arrayList.add(0, Integer.valueOf(i));
        }
    }

    private static int zzG(zzYU4 zzyu4, zzYO3 zzyo3) {
        return zzZXP.zzX(zzyu4.zzV("val", null), zzyo3);
    }

    private static boolean zzHE(String str) {
        return str != null && zzZ0I.zzYm(str.charAt(0));
    }

    private static void zzS(zzZ9Z zzz9z) throws Exception {
        zzYZZ zzyzz = new zzYZZ();
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        zzz9z.zzZ(zzyzz, zzzabZzZsG);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("rad")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 25) {
                zzX(zzz9z);
            } else if (iZzTP == 57) {
                zzZ(zzz9z, new zzZ0H(7), "deg", true);
            } else if (iZzTP != 58) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ(zzz9z, zzyzz, zzzabZzZsG);
            }
        }
        zzz9z.zzZsH();
    }

    private static void zzT(zzZ9Z zzz9z) throws Exception {
        zzZ04 zzz04 = new zzZ04();
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        zzz9z.zzZ(zzz04, zzzabZzZsG);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("nary")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 25) {
                switch (iZzTP) {
                    case 49:
                        zzZ(zzz9z, zzz04, zzzabZzZsG);
                        break;
                    case 50:
                        zzZ(zzz9z, new zzZ0H(24), "sub", true);
                        break;
                    case 51:
                        zzZ(zzz9z, new zzZ0H(25), "sup", true);
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzX(zzz9z);
            }
        }
        zzz9z.zzZsH();
    }

    private static void zzU(zzZ9Z zzz9z) throws Exception {
        zzZ07 zzz07 = new zzZ07();
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        zzz9z.zzZ(zzz07, zzzabZzZsG);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("m")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 35) {
                zzZ(zzz9z, zzz07.zzYEI());
            } else if (iZzTP != 36) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ(zzz9z, zzz07, zzzabZzZsG);
            }
        }
        zzz9z.zzZsH();
    }

    private static void zzV(zzZ9Z zzz9z) throws Exception {
        zzZ0A zzz0a = new zzZ0A();
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        zzz9z.zzZ(zzz0a, zzzabZzZsG);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("func")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 25) {
                zzX(zzz9z);
            } else if (iZzTP == 30) {
                zzZ(zzz9z, zzzabZzZsG, "funcPr");
            } else if (iZzTP != 31) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ(zzz9z, new zzZ0H(14), "fName", true);
            }
        }
        zzz9z.zzZsH();
    }

    private static void zzW(zzZ9Z zzz9z) throws Exception {
        zzZ0B zzz0b = new zzZ0B();
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        zzz9z.zzZ(zzz0b, zzzabZzZsG);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("f")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 26:
                    zzZ(zzz9z, zzz0b, zzzabZzZsG);
                    break;
                case 27:
                    zzZ(zzz9z, new zzZ0H(11), "den", true);
                    break;
                case 28:
                    zzZ(zzz9z, new zzZ0H(12), "num", true);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
        zzz9z.zzZsH();
    }

    private static void zzX(zzZ9Z zzz9z) throws Exception {
        zzZ(zzz9z, new zzZ0H(8), "e", true);
    }

    public static void zzY(zzZ9Z zzz9z) throws Exception {
        zzZ(zzz9z, new zzZ03(), "oMath", true);
    }

    public static void zzZ(zzZ9Z zzz9z) throws Exception {
        zzZ02 zzz02 = new zzZ02();
        zzz9z.zzZ(zzz02);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ("oMathPara")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzY(zzz9z);
            } else if (iZzTP != 1) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ(zzyu4ZzZsD, zzz02);
            }
        }
        zzz9z.zzZsH();
    }

    private static String zzZm(String str, int i) {
        try {
            zzKB zzkb = new zzKB();
            zzZUN zzzun = new zzZUN();
            String strZzZn = com.aspose.words.internal.zzZO0.zzZ(65001, zzzun, zzkb).zzZn(com.aspose.words.internal.zzZO0.zzZ(i, zzzun, zzkb).getBytes(str));
            if (!zzkb.isError()) {
                if (!zzzun.isError()) {
                    return strZzZn;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static int zzx(zzYU4 zzyu4) {
        int iZzYyE = zzyu4.zzYyE();
        if (iZzYyE < 0) {
            return 0;
        }
        if (iZzYyE > 4) {
            return 4;
        }
        return iZzYyE;
    }

    private static int zzy(zzYU4 zzyu4) {
        int iZzYyE = zzyu4.zzYyE();
        if (iZzYyE <= 0) {
            return 1;
        }
        if (iZzYyE > 255) {
            return 255;
        }
        return iZzYyE;
    }

    public static zzZ0V zzz(zzYU4 zzyu4) {
        zzZ0V zzz0v = new zzZ0V();
        String strZzV = zzyu4.zzV("alnAt", null);
        zzz0v.setAlignment(com.aspose.words.internal.zzZYD.zzXk(strZzV) ? com.aspose.words.internal.zzJB.zzZv(strZzV) : 0);
        return zzz0v;
    }

    private static void zzX(zzZ9Z zzz9z, zzZ0N zzz0n) {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("mc")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 46) {
                zzyu4ZzZsD.zzk();
            } else {
                zzW(zzz9z, zzz0n);
            }
        }
    }

    private static void zzY(zzZ9Z zzz9z, zzZ0J zzz0j, String str) throws Exception {
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        zzz9z.zzZ(zzz0j, zzzabZzZsG);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 25) {
                switch (iZzTP) {
                    case 32:
                        zzZ(zzz9z, new zzZ0H(16), "lim", true);
                        break;
                    case 33:
                        zzZ(zzz9z, zzzabZzZsG, "limUppPr");
                        break;
                    case 34:
                        zzZ(zzz9z, zzzabZzZsG, "limLowPr");
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzX(zzz9z);
            }
        }
        zzz9z.zzZsH();
    }

    private static void zzX(zzZ9Z zzz9z, zzZ0J zzz0j, String str) throws Exception {
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        zzz9z.zzZ(zzz0j, zzzabZzZsG);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 25) {
                zzX(zzz9z);
            } else if (iZzTP != 50) {
                if (iZzTP != 51) {
                    switch (iZzTP) {
                        case 60:
                            zzZ(zzz9z, zzzabZzZsG, "sPrePr");
                            break;
                        case 61:
                            zzZ(zzz9z, zzzabZzZsG, "sSubPr");
                            break;
                        case 62:
                            if (zzz0j.getMathObjectType() == 28) {
                                zzZ(zzz9z, (zzYZY) zzz0j, zzzabZzZsG);
                            } else {
                                zzyu4ZzZsD.zzk();
                            }
                            break;
                        case 63:
                            zzZ(zzz9z, zzzabZzZsG, "sSupPr");
                            break;
                        default:
                            zzyu4ZzZsD.zzk();
                            break;
                    }
                } else if (zzz0j.getMathObjectType() == 27) {
                    zzyu4ZzZsD.zzk();
                } else {
                    zzZ(zzz9z, new zzZ0H(25), "sup", true);
                }
            } else if (zzz0j.getMathObjectType() == 29) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ(zzz9z, new zzZ0H(24), "sub", true);
            }
        }
        zzz9z.zzZsH();
    }

    private static void zzZ(zzYU4 zzyu4, zzZ02 zzz02) {
        while (zzyu4.zzQ("oMathParaPr")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 2) {
                zzyu4.zzk();
            } else {
                zzz02.setJustification(zzZXP.zzNb(zzyu4.zzV("val", null)));
            }
        }
    }

    private static void zzW(zzZ9Z zzz9z, zzZ0N zzz0n) {
        zzZ0O zzz0o = new zzZ0O();
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        int iZzy = 1;
        while (zzyu4ZzZsD.zzQ("mcPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 47) {
                iZzy = zzy(zzyu4ZzZsD);
            } else if (iZzTP != 48) {
                zzyu4ZzZsD.zzk();
            } else {
                zzz0o.setHorizontalAlignment(zzY8T.zzHz(zzyu4ZzZsD.zzV("val", null)));
            }
        }
        zzz0n.zzZ(zzz0o, iZzy);
    }

    private static void zzY(zzZ9Z zzz9z, zzZ0N zzz0n) {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("mcs")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 45) {
                zzyu4ZzZsD.zzk();
            } else {
                zzX(zzz9z, zzz0n);
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0J zzz0j, String str, boolean z) throws Exception {
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        if (z) {
            zzz9z.zzZ(zzz0j, zzzabZzZsG);
        }
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 0) {
                switch (iZzTP) {
                    case 3:
                        zzZ(zzz9z, new zzZ0I(), "acc");
                        continue;
                    case 4:
                        zzZ(zzz9z, new zzZ0F(), "bar");
                        continue;
                    case 5:
                        zzZ(zzz9z, new zzZ0E(), "borderBox");
                        continue;
                    case 6:
                        zzZ(zzz9z, new zzZ0D(), "box");
                        continue;
                    case 7:
                        zzZ(zzz9z, new zzZ0C(), "d");
                        continue;
                    case 8:
                        zzZ(zzz9z, new zzZ0G(), "eqArr");
                        continue;
                    case 9:
                        zzW(zzz9z);
                        continue;
                    case 10:
                        zzV(zzz9z);
                        continue;
                    case 11:
                        zzZ(zzz9z, new zzZ09(), "groupChr");
                        continue;
                    case 12:
                        zzY(zzz9z, new zzZ08(), "limLow");
                        continue;
                    case 13:
                        zzY(zzz9z, new zzYZV(), "limUpp");
                        continue;
                    case 14:
                        zzU(zzz9z);
                        continue;
                    case 15:
                        zzT(zzz9z);
                        continue;
                    case 16:
                        break;
                    case 17:
                        zzZ(zzz9z, new zzZ01(), "phant");
                        continue;
                    case 18:
                        zzS(zzz9z);
                        continue;
                    case 19:
                        zzX(zzz9z, new zzZ00(), "sPre");
                        continue;
                    case 20:
                        zzX(zzz9z, new zzYZX(), "sSub");
                        continue;
                    case 21:
                        zzX(zzz9z, new zzYZY(), "sSubSup");
                        continue;
                    case 22:
                        zzX(zzz9z, new zzYZW(), "sSup");
                        continue;
                    case 23:
                        zzZ(zzz9z, zzz0j);
                        continue;
                    case 24:
                        zzz9z.zzZ(zzzabZzZsG);
                        continue;
                    default:
                        zzz9z.zzZsF();
                        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(zzz9z.zzZsE().zzYz7().getLastChild(), Run.class);
                        if (run != null) {
                            zzY(run.getText(), zzz9z.zzZsE());
                        } else {
                            continue;
                        }
                        break;
                }
            }
            zzZ(zzz9z, zzz0j, str, false);
        }
        if (z) {
            zzz9z.zzZsH();
        }
    }

    private static void zzY(String str, zzYVB zzyvb) {
        if (str.length() < 2) {
            return;
        }
        zzZ(str, false, zzyvb);
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0J zzz0j, String str) throws Exception {
        zzZAB zzzabZzZsG = zzz9z.zzZsG();
        zzz9z.zzZ(zzz0j, zzzabZzZsG);
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ(str)) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 25) {
                zzZ(zzz9z, zzz0j, zzzabZzZsG);
            } else {
                zzX(zzz9z);
            }
        }
        zzz9z.zzZsH();
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0J zzz0j, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        if (zzz0j.getMathObjectType() == 2 && "accPr".equals(zzyu4ZzZsD.getLocalName())) {
            zzZ(zzz9z, (zzZ0I) zzz0j, zzzab);
            return;
        }
        if (zzz0j.getMathObjectType() == 3 && "barPr".equals(zzyu4ZzZsD.getLocalName())) {
            zzZ(zzz9z, (zzZ0F) zzz0j, zzzab);
            return;
        }
        if (zzz0j.getMathObjectType() == 4 && "borderBoxPr".equals(zzyu4ZzZsD.getLocalName())) {
            zzZ(zzz9z, (zzZ0E) zzz0j, zzzab);
            return;
        }
        if (zzz0j.getMathObjectType() == 5 && "boxPr".equals(zzyu4ZzZsD.getLocalName())) {
            zzZ(zzz9z, (zzZ0D) zzz0j, zzzab);
            return;
        }
        if (zzz0j.getMathObjectType() == 6 && "dPr".equals(zzyu4ZzZsD.getLocalName())) {
            zzZ(zzz9z, (zzZ0C) zzz0j, zzzab);
            return;
        }
        if (zzz0j.getMathObjectType() == 9 && "eqArrPr".equals(zzyu4ZzZsD.getLocalName())) {
            zzZ(zzz9z, (zzZ0G) zzz0j, zzzab);
            return;
        }
        if (zzz0j.getMathObjectType() == 15 && "groupChrPr".equals(zzyu4ZzZsD.getLocalName())) {
            zzZ(zzz9z, (zzZ09) zzz0j, zzzab);
        } else if (zzz0j.getMathObjectType() == 22 && "phantPr".equals(zzyu4ZzZsD.getLocalName())) {
            zzZ(zzz9z, (zzZ01) zzz0j, zzzab);
        } else {
            zzyu4ZzZsD.zzk();
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0B zzz0b, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("fPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzz9z.zzZ(zzzab);
            } else if (iZzTP != 29) {
                zzyu4ZzZsD.zzk();
            } else {
                zzz0b.zzux(zzZXP.zzN5(zzyu4ZzZsD.zzV("val", null)));
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0N zzz0n) throws Exception {
        zzz9z.zzZ(new zzZ06());
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        int i = 0;
        while (zzyu4ZzZsD.zzQ(TranslateLanguage.MARATHI)) {
            i++;
            if ("e".equals(zzyu4ZzZsD.getLocalName())) {
                zzX(zzz9z);
            } else {
                zzyu4ZzZsD.zzk();
            }
        }
        if (i > zzz0n.getCount()) {
            zzz0n.zzZ(new zzZ0O(), i - zzz0n.getCount());
        }
        zzz9z.zzZsH();
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ07 zzz07, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("mPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 24) {
                switch (iZzTP) {
                    case 37:
                        zzz07.zzuB(zzG(zzyu4ZzZsD, zzz9z.zzZsE().zzZqn()));
                        break;
                    case 38:
                        zzz07.zzuv(zzyu4ZzZsD.zzYyE());
                        break;
                    case 39:
                        zzz07.zzuu(zzx(zzyu4ZzZsD));
                        break;
                    case 40:
                        zzz07.zzut(zzyu4ZzZsD.zzYyE());
                        break;
                    case 41:
                        zzY(zzz9z, zzz07.zzYEI());
                        break;
                    case 42:
                        zzz07.zzT2(zzyu4ZzZsD.zzYyD());
                        break;
                    case 43:
                        zzz07.zzuz(zzyu4ZzZsD.zzYyE());
                        break;
                    case 44:
                        zzz07.zzuA(zzx(zzyu4ZzZsD));
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzz9z.zzZ(zzzab);
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ04 zzz04, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("naryPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 24) {
                switch (iZzTP) {
                    case 52:
                        zzz04.setCharacter(zzZ(zzz9z, false));
                        break;
                    case 53:
                        zzz04.zzT3(zzyu4ZzZsD.zzYyD());
                        break;
                    case 54:
                        zzz04.zzus(zzZXP.zzN4(zzyu4ZzZsD.zzV("val", null)));
                        break;
                    case 55:
                        zzz04.zzT0(zzyu4ZzZsD.zzYyD());
                        break;
                    case 56:
                        zzz04.zzSZ(zzyu4ZzZsD.zzYyD());
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzz9z.zzZ(zzzab);
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzYZZ zzyzz, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("radPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzz9z.zzZ(zzzab);
            } else if (iZzTP != 59) {
                zzyu4ZzZsD.zzk();
            } else {
                zzyzz.zzST(zzyu4ZzZsD.zzYyD());
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzYZY zzyzy, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("sSubSupPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzz9z.zzZ(zzzab);
            } else if (iZzTP != 64) {
                zzyu4ZzZsD.zzk();
            } else {
                zzyzy.zzSS(zzyu4ZzZsD.zzYyD());
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0J zzz0j) {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        int iZzYyE = 0;
        while (zzyu4ZzZsD.zzQ("argPr")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 65) {
                zzyu4ZzZsD.zzk();
            } else {
                iZzYyE = zzyu4ZzZsD.zzYyE();
            }
        }
        if (iZzYyE == 0 || !(zzz0j instanceof zzZ0H)) {
            return;
        }
        ((zzZ0H) zzz0j).zzuC(iZzYyE);
    }

    private static void zzZ(zzZ9Z zzz9z, zzZAB zzzab, String str) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ(str)) {
            if ("ctrlPr".equals(zzyu4ZzZsD.getLocalName())) {
                zzz9z.zzZ(zzzab);
            } else {
                zzyu4ZzZsD.zzk();
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0I zzz0i, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("accPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzz9z.zzZ(zzzab);
            } else if (iZzTP != 52) {
                zzyu4ZzZsD.zzk();
            } else {
                zzz0i.setCharacter(zzZ(zzz9z, true));
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0F zzz0f, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("barPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzz9z.zzZ(zzzab);
            } else if (iZzTP != 66) {
                zzyu4ZzZsD.zzk();
            } else {
                zzz0f.setPosition(zzZXP.zzN8(zzyu4ZzZsD.zzV("val", null)));
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0E zzz0e, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("borderBoxPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 24) {
                switch (iZzTP) {
                    case 67:
                        zzz0e.zzTf(zzyu4ZzZsD.zzYyD());
                        break;
                    case 68:
                        zzz0e.zzTd(zzyu4ZzZsD.zzYyD());
                        break;
                    case 69:
                        zzz0e.zzTc(zzyu4ZzZsD.zzYyD());
                        break;
                    case 70:
                        zzz0e.zzTe(zzyu4ZzZsD.zzYyD());
                        break;
                    case 71:
                        zzz0e.zzTb(zzyu4ZzZsD.zzYyD());
                        break;
                    case 72:
                        zzz0e.zzTa(zzyu4ZzZsD.zzYyD());
                        break;
                    case 73:
                        zzz0e.zzT8(zzyu4ZzZsD.zzYyD());
                        break;
                    case 74:
                        zzz0e.zzT9(zzyu4ZzZsD.zzYyD());
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzz9z.zzZ(zzzab);
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0D zzz0d, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("boxPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 24) {
                switch (iZzTP) {
                    case 75:
                        zzz0d.zzT7(zzyu4ZzZsD.zzYyD());
                        break;
                    case 76:
                        zzz0d.zzZ(zzz(zzyu4ZzZsD));
                        break;
                    case 77:
                        zzz0d.zzT6(zzyu4ZzZsD.zzYyD());
                        break;
                    case 78:
                        zzz0d.zzT5(zzyu4ZzZsD.zzYyD());
                        break;
                    case 79:
                        zzz0d.zzT4(zzyu4ZzZsD.zzYyD());
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzz9z.zzZ(zzzab);
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0C zzz0c, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("dPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzz9z.zzZ(zzzab);
            } else if (iZzTP != 53) {
                switch (iZzTP) {
                    case 80:
                        zzz0c.zzYj(zzZ(zzz9z, false));
                        break;
                    case 81:
                        zzz0c.zzYi(zzZ(zzz9z, false));
                        break;
                    case 82:
                        zzz0c.zzYh(zzZ(zzz9z, false));
                        break;
                    case 83:
                        zzz0c.zzuy(zzZXP.zzN7(zzyu4ZzZsD.zzV("val", null)));
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzz0c.zzT3(zzyu4ZzZsD.zzYyD());
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ0G zzz0g, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("eqArrPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzz9z.zzZ(zzzab);
            } else if (iZzTP == 37) {
                zzz0g.zzuB(zzG(zzyu4ZzZsD, zzz9z.zzZsE().zzZqn()));
            } else if (iZzTP == 43) {
                zzz0g.zzuz(zzyu4ZzZsD.zzYyE());
            } else if (iZzTP == 44) {
                zzz0g.zzuA(zzx(zzyu4ZzZsD));
            } else if (iZzTP == 84) {
                zzz0g.zzTh(zzyu4ZzZsD.zzYyD());
            } else if (iZzTP != 85) {
                zzyu4ZzZsD.zzk();
            } else {
                zzz0g.zzTg(zzyu4ZzZsD.zzYyD());
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ09 zzz09, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("groupChrPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 24) {
                zzz9z.zzZ(zzzab);
            } else if (iZzTP == 52) {
                zzz09.setCharacter(zzZ(zzz9z, false));
            } else if (iZzTP == 66) {
                zzz09.setPosition(zzZXP.zzN8(zzyu4ZzZsD.zzV("val", null)));
            } else if (iZzTP != 86) {
                zzyu4ZzZsD.zzk();
            } else {
                zzz09.zzuw(zzZXP.zzN6(zzyu4ZzZsD.zzV("val", null)));
            }
        }
    }

    private static void zzZ(zzZ9Z zzz9z, zzZ01 zzz01, zzZAB zzzab) throws Exception {
        zzYU4 zzyu4ZzZsD = zzz9z.zzZsD();
        while (zzyu4ZzZsD.zzQ("phantPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 24) {
                switch (iZzTP) {
                    case 87:
                        zzz01.zzSY(zzyu4ZzZsD.zzYyD());
                        break;
                    case 88:
                        zzz01.zzSX(zzyu4ZzZsD.zzYyD());
                        break;
                    case 89:
                        zzz01.zzSW(zzyu4ZzZsD.zzYyD());
                        break;
                    case 90:
                        zzz01.zzSV(zzyu4ZzZsD.zzYyD());
                        break;
                    case 91:
                        zzz01.zzSU(zzyu4ZzZsD.zzYyD());
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                zzz9z.zzZ(zzzab);
            }
        }
    }

    private static char zzZ(zzZ9Z zzz9z, boolean z) {
        String strZzV = zzz9z.zzZsD().zzV("val", null);
        if (strZzV.length() > 1) {
            strZzV = zzZ(strZzV, z, zzz9z.zzZsE());
        }
        if (strZzV.length() > 0) {
            return strZzV.charAt(0);
        }
        return (char) 0;
    }

    private static String zzZ(String str, boolean z, zzYVB zzyvb) {
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new int[]{1252, 1250, 1251, 1253, 1254, 1255, 1256, 1257, 1258, 874});
        zzE(arrayList, com.aspose.words.internal.zzZO0.zzhV().getCodePage());
        if (zzyvb.zzYyY() != null) {
            zzE(arrayList, zzyvb.zzYyY().getCodePage());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            String strZzZm = zzZm(str, iIntValue);
            if (!com.aspose.words.internal.zzZKN.zzU3(strZzZm)) {
                if (zzyvb.zzYyY() != null && (!z || !zzHE(strZzZm))) {
                    return strZzZm;
                }
                zzyvb.zzL(com.aspose.words.internal.zzZO0.zzQz(iIntValue));
                return strZzZm;
            }
        }
        return str;
    }
}
