package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzH6 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("x", "y", "cx", TranslateLanguage.WELSH, "l", "t", "r", "b", "noAdjustHandles", "noChangeArrowheads", "noChangeAspect", "noDrilldown", "noChangeShapeType", "noCrop", "noEditPoints", "noGrp", "noMove", "noResize", "noRot", "noSelect", "a", "extLst");

    public static long zzY(zzYU4 zzyu4, zzYO3 zzyo3) {
        int iZzZG = 0;
        int iZzZG2 = 0;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 2) {
                iZzZG = com.aspose.words.internal.zzAN.zzZG(zzyu4.zzQ(zzyo3));
            } else if (iZzTP != 3) {
                zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
            } else {
                iZzZG2 = com.aspose.words.internal.zzAN.zzZG(zzyu4.zzQ(zzyo3));
            }
        }
        return com.aspose.words.internal.zzZPX.zzZm(iZzZG, iZzZG2);
    }

    public static long zzZ(zzYU4 zzyu4, zzYO3 zzyo3) {
        int iZzZG = 0;
        int iZzZG2 = 0;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                iZzZG = com.aspose.words.internal.zzAN.zzZG(zzyu4.zzQ(zzyo3));
            } else if (iZzTP != 1) {
                zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
            } else {
                iZzZG2 = com.aspose.words.internal.zzAN.zzZG(zzyu4.zzQ(zzyo3));
            }
        }
        return com.aspose.words.internal.zzZPZ.zzZm(iZzZG, iZzZG2);
    }

    public static void zzZ(zzYU4 zzyu4, zzYC3 zzyc3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 8:
                    zzyc3.zzQ(126, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 9:
                    zzyc3.zzQ(4140, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 10:
                    zzyc3.zzQ(120, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 11:
                    zzyc3.zzQ(4142, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 12:
                    zzyc3.zzQ(828, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 13:
                    zzyc3.zzQ(123, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 14:
                    zzyc3.zzQ(124, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 15:
                    zzyc3.zzQ(127, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 16:
                    zzyc3.zzQ(121, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 17:
                    zzyc3.zzQ(4141, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 18:
                    zzyc3.zzQ(119, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 19:
                    zzyc3.zzQ(122, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 20:
                    break;
                default:
                    zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
                    break;
            }
        }
        zzyu4.zzj();
        String localName = zzyu4.getLocalName();
        while (zzyu4.zzQ(localName)) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 21) {
                zzyu4.getLocalName();
                zzyu4.zzk();
            }
        }
    }
}
