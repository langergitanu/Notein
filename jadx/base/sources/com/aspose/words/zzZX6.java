package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX6 {
    private static boolean zzY(zzZ0J zzz0j) {
        return zzz0j.getMathObjectType() == 19 && ((zzZ07) zzz0j).zzYEI().getCount() != 0;
    }

    public static void zzZ(zzZ0J zzz0j, zzZAB zzzab, zzZ9W zzz9w) throws Exception {
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzYyK();
        switch (zzz0j.getMathObjectType()) {
            case 0:
                zzyu6ZzZm2.zzY("m:oMath");
                return;
            case 1:
                zzZ(zzz0j, zzz9w);
                return;
            case 2:
                zzZ(zzz0j, zzzab, zzz9w, "m:acc");
                return;
            case 3:
                zzZ(zzz0j, zzzab, zzz9w, "m:bar");
                return;
            case 4:
                zzZ(zzz0j, zzzab, zzz9w, "m:borderBox");
                return;
            case 5:
                zzZ(zzz0j, zzzab, zzz9w, "m:box");
                return;
            case 6:
                zzZ(zzz0j, zzzab, zzz9w, "m:d");
                return;
            case 7:
                zzY(zzz0j, zzzab, zzz9w, "m:deg");
                return;
            case 8:
                zzY(zzz0j, zzzab, zzz9w, "m:e");
                return;
            case 9:
                zzZ(zzz0j, zzzab, zzz9w, "m:eqArr");
                return;
            case 10:
                zzZ(zzz0j, zzzab, zzz9w, "m:f");
                return;
            case 11:
                zzY(zzz0j, zzzab, zzz9w, "m:den");
                return;
            case 12:
                zzY(zzz0j, zzzab, zzz9w, "m:num");
                return;
            case 13:
                zzZ(zzz0j, zzzab, zzz9w, "m:func");
                return;
            case 14:
                zzY(zzz0j, zzzab, zzz9w, "m:fName");
                return;
            case 15:
                zzZ(zzz0j, zzzab, zzz9w, "m:groupChr");
                return;
            case 16:
                zzY(zzz0j, zzzab, zzz9w, "m:lim");
                return;
            case 17:
                zzZ(zzz0j, zzzab, zzz9w, "m:limLow");
                return;
            case 18:
                zzZ(zzz0j, zzzab, zzz9w, "m:limUpp");
                return;
            case 19:
                zzZ(zzz0j, zzzab, zzz9w, "m:m");
                return;
            case 20:
                zzyu6ZzZm2.zzY("m:mr");
                return;
            case 21:
                zzZ(zzz0j, zzzab, zzz9w, "m:nary");
                return;
            case 22:
                zzZ(zzz0j, zzzab, zzz9w, "m:phant");
                return;
            case 23:
                zzZ(zzz0j, zzzab, zzz9w, "m:rad");
                return;
            case 24:
                zzY(zzz0j, zzzab, zzz9w, "m:sub");
                return;
            case 25:
                zzY(zzz0j, zzzab, zzz9w, "m:sup");
                return;
            case 26:
                zzZ(zzz0j, zzzab, zzz9w, "m:sPre");
                return;
            case 27:
                zzZ(zzz0j, zzzab, zzz9w, "m:sSub");
                return;
            case 28:
                zzZ(zzz0j, zzzab, zzz9w, "m:sSubSup");
                return;
            case 29:
                zzZ(zzz0j, zzzab, zzz9w, "m:sSup");
                return;
            default:
                throw new IllegalStateException("Please report exception.");
        }
    }

    private static void zzY(zzZ0J zzz0j, zzZAB zzzab, zzZ9W zzz9w, String str) throws Exception {
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzY(str);
        zzZ(zzzab, zzz9w);
        int iZzYF2 = ((zzZ0H) zzz0j).zzYF2();
        if (iZzYF2 != 0) {
            zzyu6ZzZm2.zzY("m:argPr");
            zzyu6ZzZm2.zzZl("m:argSz", iZzYF2);
            zzyu6ZzZm2.zzp();
        }
    }

    private static boolean zzY(zzZAB zzzab) {
        return zzzab.getCount() != 0;
    }

    private static void zzZ(zzZ0J zzz0j, zzZ9W zzz9w) {
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzY("m:oMathPara");
        if (zzz0j.getCount() > 0) {
            zzyu6ZzZm2.zzY("m:oMathParaPr");
            zzZ((zzZS) zzz0j, zzz9w);
            zzyu6ZzZm2.zzp();
        }
    }

    private static void zzZ(zzZ0J zzz0j, zzZAB zzzab, zzZ9W zzz9w, String str) throws Exception {
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzY(str);
        if (zzz0j.getCount() > 0 || zzY(zzzab) || zzY(zzz0j)) {
            zzyu6ZzZm2.zzY(str + "Pr");
            zzZ((zzZS) zzz0j, zzz9w);
            if (zzY(zzz0j)) {
                zzZ(((zzZ07) zzz0j).zzYEI(), zzyu6ZzZm2);
            }
            zzZ(zzzab, zzz9w);
            zzyu6ZzZm2.zzp();
        }
    }

    private static void zzZ(zzZ0N zzz0n, zzYU6 zzyu6) {
        zzZ0O zzz0oZzuI;
        zzyu6.zzY("m:mcs");
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
            zzyu6.zzp();
            return;
            zzZ(zzz0oZzuI, i2, zzyu6);
        }
    }

    private static void zzZ(zzZ0O zzz0o, int i, zzYU6 zzyu6) {
        zzyu6.zzY("m:mc");
        zzyu6.zzY("m:mcPr");
        zzyu6.zzZl("m:count", i);
        zzyu6.zzYz("m:mcJc", zzY8T.zztc(zzz0o.getHorizontalAlignment()));
        zzyu6.zzp();
        zzyu6.zzp();
    }

    private static void zzZ(zzZS zzzs, zzZ9W zzz9w) {
        for (int i = 0; i < zzzs.getCount(); i++) {
            zzZ(zzzs.zzT3(i), zzzs.zzVY(i), zzz9w);
        }
    }

    private static void zzZ(int i, Object obj, zzZ9W zzz9w) {
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        boolean z = true;
        switch (i) {
            case 15010:
                zzyu6ZzZm2.zzYz("m:jc", zzZXP.zzEZ(((Integer) obj).intValue()));
                break;
            case 15030:
            case 15290:
                zzyu6ZzZm2.zzYz("m:pos", zzZXP.zzEW(((Integer) obj).intValue()));
                break;
            case 15040:
            case 15045:
            case 15280:
                zzZ(zzyu6ZzZm2, "m:chr", ((Character) obj).charValue());
                break;
            case 15050:
                zzyu6ZzZm2.zzQ("m:hideBot", (Boolean) obj);
                break;
            case 15060:
                zzyu6ZzZm2.zzQ("m:hideTop", (Boolean) obj);
                break;
            case 15070:
                zzyu6ZzZm2.zzQ("m:hideLeft", (Boolean) obj);
                break;
            case 15080:
                zzyu6ZzZm2.zzQ("m:hideRight", (Boolean) obj);
                break;
            case 15090:
                zzyu6ZzZm2.zzQ("m:strikeBLTR", (Boolean) obj);
                break;
            case 15100:
                zzyu6ZzZm2.zzQ("m:strikeH", (Boolean) obj);
                break;
            case 15110:
                zzyu6ZzZm2.zzQ("m:strikeTLBR", (Boolean) obj);
                break;
            case 15120:
                zzyu6ZzZm2.zzQ("m:strikeV", (Boolean) obj);
                break;
            case 15130:
                zzyu6ZzZm2.zzQ("m:opEmu", (Boolean) obj);
                break;
            case 15140:
                zzyu6ZzZm2.zzQ("m:aln", (Boolean) obj);
                break;
            case 15150:
                zzZ((zzZ0V) obj, zzyu6ZzZm2);
                break;
            case 15160:
                zzyu6ZzZm2.zzQ("m:noBreak", (Boolean) obj);
                break;
            case 15170:
                zzyu6ZzZm2.zzQ("m:diff", (Boolean) obj);
                break;
            case 15180:
                zzZ(zzyu6ZzZm2, "m:begChr", ((Character) obj).charValue());
                break;
            case 15190:
                zzZ(zzyu6ZzZm2, "m:endChr", ((Character) obj).charValue());
                break;
            case 15200:
                zzZ(zzyu6ZzZm2, "m:sepChr", ((Character) obj).charValue());
                break;
            case 15210:
                zzyu6ZzZm2.zzQ("m:grow", (Boolean) obj);
                break;
            case 15220:
                zzyu6ZzZm2.zzYz("m:shp", zzZXP.zzEV(((Integer) obj).intValue()));
                break;
            case 15230:
                if (zzz9w.zzZmh() && zzz9w.getCompliance() == 0) {
                    z = false;
                }
                zzyu6ZzZm2.zzYz("m:baseJc", zzZXP.zz2(((Integer) obj).intValue(), z));
                break;
            case 15240:
                zzyu6ZzZm2.zzQ("m:maxDist", (Boolean) obj);
                break;
            case 15250:
                zzyu6ZzZm2.zzQ("m:objDist", (Boolean) obj);
                break;
            case 15260:
                zzyu6ZzZm2.zzQ("m:rSp", (Integer) obj);
                break;
            case 15270:
                zzyu6ZzZm2.zzQ("m:rSpRule", (Integer) obj);
                break;
            case 15300:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != 1) {
                    zzyu6ZzZm2.zzYz("m:vertJc", zzZXP.zzEU(iIntValue));
                } else {
                    zzyu6ZzZm2.zzZ("m:vertJc", (String) null);
                }
                break;
            case 15310:
                zzyu6ZzZm2.zzQ("m:show", (Boolean) obj);
                break;
            case 15320:
                zzyu6ZzZm2.zzQ("m:transp", (Boolean) obj);
                break;
            case 15330:
                zzyu6ZzZm2.zzQ("m:zeroAsc", (Boolean) obj);
                break;
            case 15340:
                zzyu6ZzZm2.zzQ("m:zeroDesc", (Boolean) obj);
                break;
            case 15450:
                zzyu6ZzZm2.zzQ("m:zeroWid", (Boolean) obj);
                break;
            case 15460:
                zzyu6ZzZm2.zzYz("m:type", zzZXP.zzET(((Integer) obj).intValue()));
                break;
            case 15470:
                zzyu6ZzZm2.zzQ("m:plcHide", (Boolean) obj);
                break;
            case 15480:
                zzyu6ZzZm2.zzQ("m:cSp", (Integer) obj);
                break;
            case 15490:
                zzyu6ZzZm2.zzQ("m:cGpRule", (Integer) obj);
                break;
            case 15500:
                zzyu6ZzZm2.zzQ("m:cGp", (Integer) obj);
                break;
            case 15510:
                zzyu6ZzZm2.zzYz("m:limLoc", zzZXP.zzES(((Integer) obj).intValue()));
                break;
            case 15520:
                zzyu6ZzZm2.zzQ("m:subHide", (Boolean) obj);
                break;
            case 15530:
                zzyu6ZzZm2.zzQ("m:supHide", (Boolean) obj);
                break;
            case 15540:
                zzyu6ZzZm2.zzQ("m:degHide", (Boolean) obj);
                break;
            case 15550:
                zzyu6ZzZm2.zzQ("m:alnScr", (Boolean) obj);
                break;
        }
    }

    public static void zzZ(zzZ0V zzz0v, zzYU6 zzyu6) {
        if (zzz0v.zzYFO()) {
            zzyu6.zzZ("m:brk", (String) null);
        } else {
            zzyu6.zzX("m:brk", "m:alnAt", Integer.toString(zzz0v.getAlignment()));
        }
    }

    private static void zzZ(zzZAB zzzab, zzZ9W zzz9w) throws Exception {
        if (zzY(zzzab)) {
            zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
            zzyu6ZzZm2.zzY("m:ctrlPr");
            if (zzzab.zzZw0()) {
                zz0F.zzZ("a:rPr", (zz30) zzzab, (zzZXR) zzz9w);
            } else {
                zzYEF zzyef = (zzYEF) zzzab;
                if (!zzyef.zzYrV() && !zzyef.zzYrW()) {
                    zzZWR.zzZkh().zzZ(zzyef, null, false, zzz9w);
                } else {
                    if (zzyef.zzYrV()) {
                        zzyu6ZzZm2.zzZ(zzyef.getInsertRevision(), zzz9w.zzZpW());
                        zzZWR.zzZkh().zzZ(zzyef, null, false, zzz9w);
                        zzyu6ZzZm2.zzZmP();
                    }
                    if (zzyef.zzYrW()) {
                        zzyu6ZzZm2.zzZ(zzyef.getDeleteRevision(), zzz9w.zzZpW());
                        zzZWR.zzZkh().zzZ(zzyef, null, false, zzz9w);
                        zzyu6ZzZm2.zzZmP();
                    }
                }
            }
            zzyu6ZzZm2.zzo();
        }
    }

    public static void zzZ(zzYU6 zzyu6) {
        zzyu6.zzp();
        zzyu6.zzYyJ();
    }

    private static void zzZ(zzYU6 zzyu6, String str, char c) {
        String string = c != 0 ? Character.toString(c) : "";
        zzyu6.zzY(str);
        zzyu6.zzX("m:val", string);
        zzyu6.zzo();
    }
}
