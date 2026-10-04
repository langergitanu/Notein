package com.aspose.words;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGE {
    private static void zzY(OfficeMath officeMath, zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzCC("\\*\\moMathPara");
        zzZ0J zzz0jZzZsL = officeMath.zzZsL();
        if (zzz0jZzZsL.getCount() > 0) {
            zzyhzZzYfW.zzCC("\\moMathParaPr");
            zzZ(zzz0jZzZsL, zzyhzZzYfW);
            zzyhzZzYfW.zzYj3();
        }
    }

    public static void zzZ(OfficeMath officeMath, zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        switch (officeMath.zzZsL().getMathObjectType()) {
            case 0:
                zzyhzZzYfW.zzCC("\\*\\moMath");
                return;
            case 1:
                zzY(officeMath, zzyem);
                return;
            case 2:
                zzZ(officeMath, zzyem, "\\macc");
                return;
            case 3:
                zzZ(officeMath, zzyem, "\\mbar");
                return;
            case 4:
                zzZ(officeMath, zzyem, "\\mborderBox");
                return;
            case 5:
                zzZ(officeMath, zzyem, "\\mbox");
                return;
            case 6:
                zzZ(officeMath, zzyem, "\\md");
                return;
            case 7:
                zzY(officeMath, zzyem, "\\mdeg");
                return;
            case 8:
                zzY(officeMath, zzyem, "\\me");
                return;
            case 9:
                zzZ(officeMath, zzyem, "\\meqArr");
                return;
            case 10:
                zzZ(officeMath, zzyem, "\\mf");
                return;
            case 11:
                zzY(officeMath, zzyem, "\\mden");
                return;
            case 12:
                zzY(officeMath, zzyem, "\\mnum");
                return;
            case 13:
                zzZ(officeMath, zzyem, "\\mfunc");
                return;
            case 14:
                zzY(officeMath, zzyem, "\\mfName");
                return;
            case 15:
                zzZ(officeMath, zzyem, "\\mgroupChr");
                return;
            case 16:
                zzY(officeMath, zzyem, "\\mlim");
                return;
            case 17:
                zzZ(officeMath, zzyem, "\\mlimLow");
                return;
            case 18:
                zzZ(officeMath, zzyem, "\\mlimUpp");
                return;
            case 19:
                zzZ(officeMath, zzyem, "\\mm");
                return;
            case 20:
                zzyhzZzYfW.zzCC("\\mmr");
                return;
            case 21:
                zzZ(officeMath, zzyem, "\\mnary");
                return;
            case 22:
                zzZ(officeMath, zzyem, "\\mphant");
                return;
            case 23:
                zzZ(officeMath, zzyem, "\\mrad");
                return;
            case 24:
                zzY(officeMath, zzyem, "\\msub");
                return;
            case 25:
                zzY(officeMath, zzyem, "\\msup");
                return;
            case 26:
                zzZ(officeMath, zzyem, "\\msPre");
                return;
            case 27:
                zzZ(officeMath, zzyem, "\\msSub");
                return;
            case 28:
                zzZ(officeMath, zzyem, "\\msSubSup");
                return;
            case 29:
                zzZ(officeMath, zzyem, "\\msSup");
                return;
            default:
                throw new IllegalStateException("Please report exception.");
        }
    }

    private static boolean zzy(zzYEF zzyef) {
        return zzyef.getCount() != 0;
    }

    private static boolean zzY(zzZ0J zzz0j) {
        return zzz0j.getMathObjectType() == 19 && ((zzZ07) zzz0j).zzYEI().getCount() != 0;
    }

    private static void zzY(OfficeMath officeMath, zzYEM zzyem, String str) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzCC(str);
        zzZ(officeMath.zzZYh(), zzyem);
        int iZzYF2 = ((zzZ0H) officeMath.zzZsL()).zzYF2();
        if (iZzYF2 != 0) {
            zzyhzZzYfW.zzCC("\\margPr");
            zzyhzZzYfW.zzZ4("\\margSz", iZzYF2);
            zzyhzZzYfW.zzYj3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, java.lang.String] */
    private static void zzZ(OfficeMath officeMath, zzYEM zzyem, String str) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzCC(str);
        zzZ0J zzz0jZzZsL = officeMath.zzZsL();
        zzYEF zzyefZzZYh = officeMath.zzZYh();
        if (zzz0jZzZsL.getCount() > 0 || zzy(zzyefZzZYh) || zzY(zzz0jZzZsL)) {
            zzyhzZzYfW.zzCC(Bundle.getInt(str));
            zzZ(zzz0jZzZsL, zzyhzZzYfW);
            if (zzY(zzz0jZzZsL)) {
                zzZ(((zzZ07) officeMath.zzZsL()).zzYEI(), zzyhzZzYfW);
            }
            zzZ(zzyefZzZYh, zzyem);
            zzyhzZzYfW.zzYj3();
        }
    }

    private static void zzZ(zzZ0N zzz0n, zzYHZ zzyhz) throws Exception {
        zzZ0O zzz0oZzuI;
        zzyhz.zzCC("\\mmcs");
        int i = 0;
        while (true) {
            int i2 = 1;
            while (i < zzz0n.getCount()) {
                zzz0oZzuI = zzz0n.zzuI(i);
                i++;
                zzZ0O zzz0oZzuI2 = i < zzz0n.getCount() ? zzz0n.zzuI(i) : null;
                if (zzz0oZzuI2 == null || zzz0oZzuI.getHorizontalAlignment() != zzz0oZzuI2.getHorizontalAlignment() || i2 > 64) {
                    break;
                } else if (zzz0oZzuI.getHorizontalAlignment() == zzz0oZzuI2.getHorizontalAlignment()) {
                    i2++;
                }
            }
            zzyhz.zzYj3();
            return;
            zzZ(zzz0oZzuI, i2, zzyhz);
        }
    }

    private static void zzZ(zzZ0O zzz0o, int i, zzYHZ zzyhz) throws Exception {
        zzyhz.zzCC("\\mmc");
        zzyhz.zzCC("\\mmcPr");
        zzyhz.zzZ4("\\mcount", i);
        zzyhz.zzY6("\\mmcJc", zzY8T.zztc(zzz0o.getHorizontalAlignment()));
        zzyhz.zzYj3();
        zzyhz.zzYj3();
    }

    private static void zzZ(zzZS zzzs, zzYHZ zzyhz) throws Exception {
        for (int i = 0; i < zzzs.getCount(); i++) {
            int iZzT3 = zzzs.zzT3(i);
            Object objZzVY = zzzs.zzVY(i);
            switch (iZzT3) {
                case 15010:
                    zzyhz.zzZ5("\\mjc", ((Integer) objZzVY).intValue());
                    break;
                case 15030:
                case 15290:
                    zzyhz.zzY6("\\mpos", zzZXP.zzEW(((Integer) objZzVY).intValue()));
                    break;
                case 15040:
                case 15045:
                case 15280:
                    zzZ(zzyhz, "\\mchr", ((Character) objZzVY).charValue());
                    break;
                case 15050:
                    zzZ("\\mhideBot", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15060:
                    zzZ("\\mhideTop", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15070:
                    zzZ("\\mhideLeft", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15080:
                    zzZ("\\mhideRight", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15090:
                    zzZ("\\mstrikeBLTR", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15100:
                    zzZ("\\mstrikeH", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15110:
                    zzZ("\\mstrikeTLBR", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15120:
                    zzZ("\\mstrikeV", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15130:
                    zzZ("\\mopEmu", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15140:
                    zzyhz.zz7("\\maln", ((Boolean) objZzVY).booleanValue());
                    break;
                case 15150:
                    zzZ((zzZ0V) objZzVY, zzyhz);
                    break;
                case 15160:
                    zzZ("\\mnoBreak", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15170:
                    zzZ("\\mdiff", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15180:
                    zzZ(zzyhz, "\\mbegChr", ((Character) objZzVY).charValue());
                    break;
                case 15190:
                    zzZ(zzyhz, "\\mendChr", ((Character) objZzVY).charValue());
                    break;
                case 15200:
                    zzZ(zzyhz, "\\msepChr", ((Character) objZzVY).charValue());
                    break;
                case 15210:
                    zzZ("\\mgrow", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15220:
                    zzyhz.zzY6("\\mshp", zzZXP.zzEV(((Integer) objZzVY).intValue()));
                    break;
                case 15230:
                    zzyhz.zzY6("\\mbaseJc", zzYEO.zznp(((Integer) objZzVY).intValue()));
                    break;
                case 15240:
                    zzZ("\\mmaxDist", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15250:
                    zzZ("\\mobjDist", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15260:
                    zzyhz.zzZ4("\\mrSp", ((Integer) objZzVY).intValue());
                    break;
                case 15270:
                    zzyhz.zzZ4("\\mrSpRule", ((Integer) objZzVY).intValue());
                    break;
                case 15300:
                    int iIntValue = ((Integer) objZzVY).intValue();
                    if (iIntValue != 1) {
                        zzyhz.zzY6("\\mvertJc", zzZXP.zzEU(iIntValue));
                    }
                    break;
                case 15310:
                    zzZ("\\mshow", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15320:
                    zzZ("\\mtransp", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15330:
                    zzZ("\\mzeroAsc", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15340:
                    zzZ("\\mzeroDesc", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15450:
                    zzZ("\\mzeroWid", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15460:
                    zzyhz.zzY6("\\mtype", zzZXP.zzET(((Integer) objZzVY).intValue()));
                    break;
                case 15470:
                    zzZ("\\mplcHide", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15480:
                    zzyhz.zzZ4("\\mcSp", ((Integer) objZzVY).intValue());
                    break;
                case 15490:
                    zzyhz.zzZ4("\\mcGpRule", ((Integer) objZzVY).intValue());
                    break;
                case 15500:
                    zzyhz.zzZ4("\\mcGp", ((Integer) objZzVY).intValue());
                    break;
                case 15510:
                    zzyhz.zzY6("\\mlimLoc", zzZXP.zzES(((Integer) objZzVY).intValue()));
                    break;
                case 15520:
                    zzZ("\\msubHide", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15530:
                    zzZ("\\msupHide", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15540:
                    zzZ("\\mdegHide", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
                case 15550:
                    zzZ("\\malnScr", ((Boolean) objZzVY).booleanValue(), zzyhz);
                    break;
            }
        }
    }

    public static void zzZ(zzZ0V zzz0v, zzYHZ zzyhz) throws Exception {
        zzyhz.zzZ4("\\mbrk", zzz0v.getAlignment());
    }

    private static void zzZ(zzYEF zzyef, zzYEM zzyem) throws Exception {
        if (zzy(zzyef)) {
            zzYHZ zzyhzZzYfW = zzyem.zzYfW();
            zzyhzZzYfW.zzCC("\\mctrlPr");
            zzyem.zzYel().zzw(zzyef);
            zzyhzZzYfW.zzYj3();
        }
    }

    private static void zzZ(zzYHZ zzyhz, String str, char c) throws Exception {
        String string = c != 0 ? Character.toString(c) : "";
        zzyhz.zzCC(str);
        zzyhz.zzYV(string);
        zzyhz.zzYj3();
    }

    private static void zzZ(String str, boolean z, zzYHZ zzyhz) throws Exception {
        zzyhz.zzY6(str, z ? "on" : "off");
    }
}
