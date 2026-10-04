package com.aspose.words;

import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0M {
    private boolean zzWUr;
    private List zzWUs;
    private zzZ4J zzWUt;
    private DocumentBase zzZG3;

    public zzY0M(DocumentBase documentBase) {
        this.zzZG3 = documentBase;
    }

    private void zzW(zzYMX zzymx, boolean z, boolean z2) {
        Style styleZzZ8;
        Object obj = zzymx.get(1642);
        if (obj == null) {
            if (z2) {
                return;
            }
            this.zzWUr = true;
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue != 12) {
            zzL zzl = (zzL) zzymx.get(1641);
            if (zzl != null) {
                zzZ(zzl, zzymx, iIntValue);
                return;
            }
            return;
        }
        if (!z && zzymx.contains(1000) && !zzymx.contains(1160) && (styleZzZ8 = this.zzZG3.getStyles().zzZ8(((Integer) zzymx.get(1000)).intValue(), false)) != null && styleZzZ8.zzZYj().zzYM7() != 0) {
            zzymx.zzwa(styleZzZ8.zzZYj().zzYM7());
        }
        zzymx.zzQ(EditingLanguage.KASHMIRI_ARABIC, 0);
        zzymx.zzQ(EditingLanguage.GALICIAN, 12);
    }

    private void zzXSc() {
        if (this.zzWUt != null) {
            return;
        }
        DocumentBase documentBase = this.zzZG3;
        zzZ4J zzz4j = new zzZ4J(documentBase, documentBase.getLists().zzYP3(), 0, 0);
        this.zzZG3.getLists().zzZ(zzz4j);
        ListLevel listLevel = zzz4j.zzYOP().get(0);
        listLevel.setNumberStyle(23);
        listLevel.setNumberFormat(C18358t1.g.f56183c);
        listLevel.setStartAt(0);
        this.zzWUt = zzz4j;
    }

    private static String zzY(zzL zzl, int i) {
        zzK zzk = zzl.zzZGr;
        if (i == 11) {
            return com.aspose.words.internal.zzZKN.format((zzk.zzZGj & 255) == 255 ? "{0}" : "{0}\u0000", Character.valueOf(com.aspose.words.internal.zzJF.zzE((char) (zzl.zzZGn[0] & 255))));
        }
        if ((zzk.zzZGj & 255) == 255) {
            return "";
        }
        int iZzhS = zzhS(i);
        String strZzR = com.aspose.words.internal.zzZO0.zzhX().zzR(zzl.zzZGn, 0, zzk.zzZGi & 255);
        String strZzR2 = com.aspose.words.internal.zzZO0.zzhX().zzR(zzl.zzZGn, zzk.zzZGi & 255, zzk.zzZGh & 255);
        return (zzyC(strZzR) && zzyC(strZzR2)) ? com.aspose.words.internal.zzZKN.format("{0}{1}{2}", strZzR, Character.valueOf((char) iZzhS), strZzR2) : "\u0000.";
    }

    private boolean zzZ(zzL zzl, int i) {
        List list;
        if (this.zzWUr || (list = this.zzWUs) == null || list.zzYPa().zzYOR() != zzhR(i)) {
            return true;
        }
        if (zzhR(i) != 0) {
            return false;
        }
        int iZzhS = zzhS(i);
        int i2 = i == 11 ? 23 : zzl.zzZGr.zzZGj & 255;
        ListLevel listLevel = (i != 11 || this.zzWUs.zzYPb().getCount() <= 0) ? this.zzWUs.getListLevels().get(iZzhS) : this.zzWUs.zzYPb().zzwW(0).getListLevel();
        return (listLevel.getNumberStyle() == i2 && com.aspose.words.internal.zzZKN.equals(listLevel.getNumberFormat(), zzY(zzl, i)) && !zzl.zzZGq) ? false : true;
    }

    private static int zzhR(int i) {
        return (i == 10 || i == 11) ? 0 : 1;
    }

    private static int zzhS(int i) {
        if (i == 11 || i == 10) {
            return 0;
        }
        return i - 1;
    }

    private static boolean zzyC(String str) {
        return !"\u0000".equals(str);
    }

    public final void zz4(Style style) {
        zzW(style.zzZYj(), true, false);
    }

    public final void zzXU(Paragraph paragraph) {
        zzW(paragraph.zzZYj(), false, paragraph.getParentTable() != null);
    }

    private void zzZ(zzL zzl, zzYMX zzymx, int i) {
        List listZzxt = this.zzWUs;
        if (i == 0) {
            return;
        }
        if (zzZ(zzl, i)) {
            this.zzWUr = false;
            if (i == 11) {
                zzXSc();
                List list = new List(this.zzWUt, this.zzZG3.getLists().zzYP2());
                this.zzZG3.getLists().zzQ(list);
                zzZ4B zzz4b = new zzZ4B(this.zzZG3, 0);
                list.zzYPb().zzZ(zzz4b);
                zzz4b.zzYbW = true;
                listZzxt = list;
            } else {
                listZzxt = this.zzZG3.getLists().zzxt(i < 10 ? 1 : 0);
            }
            this.zzWUs = listZzxt;
        }
        zzZ(zzymx, zzl, i);
        zzymx.zzxC(listZzxt.getListId());
        zzymx.zzrM(zzhS(i));
    }

    private void zzZ(zzYMX zzymx, zzL zzl, int i) {
        zzK zzk = zzl.zzZGr;
        int iZzhS = zzhS(i);
        List list = this.zzWUs;
        ListLevel listLevel = i == 11 ? list.zzYPb().zzwW(0).getListLevel() : list.getListLevels().get(iZzhS);
        if (!zzl.zzZGr.zzZGc) {
            listLevel.setNumberStyle(i == 11 ? 23 : zzk.zzZGj & 255);
        }
        String strZzB6 = this.zzZG3.getFontInfos().zzB6(zzl.zzZGr.zzZGf);
        listLevel.zzZYh().zzQ(230, zzU1.zzSP(strZzB6));
        listLevel.zzZYh().zzQ(240, zzU1.zzSP(strZzB6));
        if (zzl.zzZGr.zzZGc && iZzhS > 0) {
            int i2 = iZzhS - 1;
            ListLevel listLevel2 = this.zzWUs.zzYPa().zzYOP().get(i2);
            if (!com.aspose.words.internal.zzZYD.zzXk(listLevel2.getNumberFormat())) {
                listLevel2.setNumberFormat(com.aspose.words.internal.zzZKN.format("{0}", Character.valueOf((char) i2)));
                listLevel2.setStartAt(zzl.zzZGr.zzZGd);
            }
            if (listLevel.getNumberStyle() != 255) {
                listLevel.setNumberFormat(com.aspose.words.internal.zzZKN.format("{0}{1}", listLevel2.getNumberFormat(), zzY(zzl, i)));
            }
        } else {
            listLevel.setNumberFormat(zzY(zzl, i));
        }
        listLevel.setStartAt(zzk.zzZGd);
        listLevel.zzUI(true);
        listLevel.zzx1(zzk.zzZGk);
        listLevel.zzx0(zzk.zzZGl);
        if (i == 11) {
            listLevel.zzZYj().zzQ(1160, zzymx.zzPj(1160));
            zzymx.remove(1160);
            zzymx.remove(EditingLanguage.CENTRAL_KURDISH_IRAQ);
        } else {
            listLevel.zzZYj().zzQ(1160, Integer.valueOf((iZzhS + 1) * zzk.zzZGl));
        }
        if (zzk.zzZGb) {
            listLevel.zzZYj().zzQ(EditingLanguage.CENTRAL_KURDISH_IRAQ, Integer.valueOf(-zzk.zzZGl));
        }
    }
}
