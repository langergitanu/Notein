package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.fonts.FontManager;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1F {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("defaultFonts", "font", "ascii", "fareast", "h-ansi", TranslateLanguage.CZECH, "altName", "panose-1", "charset", "family", "notTrueType", "pitch", "sig", "usb-0", "usb-1", "usb-2", "usb-3", "csb-0", "csb-1");

    private static void zzY(zzYU4 zzyu4, DocumentBase documentBase) {
        zzYEF zzyefZzY37 = documentBase.getStyles().zzY37();
        int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
        if (iZzTP == 2) {
            zzYU3.zzZ(zzyefZzY37, 230, zzyu4.getValue(), false);
            return;
        }
        if (iZzTP == 3) {
            zzYU3.zzZ(zzyefZzY37, 235, zzyu4.getValue(), false);
        } else if (iZzTP == 4) {
            zzYU3.zzZ(zzyefZzY37, 240, zzyu4.getValue(), false);
        } else {
            if (iZzTP != 5) {
                return;
            }
            zzYU3.zzZ(zzyefZzY37, 270, zzyu4.getValue(), false);
        }
    }

    public static void zzZ(zzY12 zzy12) {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        if (zzy12.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
            return;
        }
        DocumentBase document = zzy12.getDocument();
        while (zzyu4ZzZsD.zzQ(FontManager.REMOTE_FONT_DIR)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzZ(zzyu4ZzZsD, zzy12.getDocument());
            } else if (iZzTP != 1) {
                zzyu4ZzZsD.zzk();
            } else {
                document.getFontInfos().zzW(zzu(zzyu4ZzZsD));
            }
        }
    }

    private static FontInfo zzu(zzYU4 zzyu4) {
        FontInfo fontInfo = new FontInfo(zzyu4.zzV("name", ""));
        while (zzyu4.zzQ("font")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 6:
                    fontInfo.setAltName(zzyu4.zzV("val", null));
                    break;
                case 7:
                    fontInfo.setPanose(zzYU3.zzGS(zzyu4.zzV("val", null)));
                    break;
                case 8:
                    fontInfo.setCharset(zzYU3.zzGU(zzyu4.zzV("val", null)));
                    break;
                case 9:
                    fontInfo.setFamily(zzY1K.zzyL(zzyu4.zzV("val", null)));
                    break;
                case 10:
                    fontInfo.isTrueType(!zzyu4.zzYyD());
                    break;
                case 11:
                    fontInfo.setPitch(zzY8T.zzAU(zzyu4.zzV("val", null)));
                    break;
                case 12:
                    fontInfo.zzYe(new byte[24]);
                    while (zzyu4.zzi()) {
                        zzZ(zzyu4, fontInfo);
                    }
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
        return fontInfo;
    }

    public static void zzZ(zzYU4 zzyu4, DocumentBase documentBase) {
        while (zzyu4.zzi()) {
            zzY(zzyu4, documentBase);
        }
    }

    private static void zzZ(zzYU4 zzyu4, FontInfo fontInfo) {
        int i;
        String value = zzyu4.getValue();
        byte[] bArrZzZ74 = fontInfo.zzZ74();
        switch (zzUR.zzTP(zzyu4.getLocalName())) {
            case 13:
                i = 0;
                break;
            case 14:
                i = 4;
                break;
            case 15:
                i = 8;
                break;
            case 16:
                i = 12;
                break;
            case 17:
                i = 16;
                break;
            case 18:
                i = 20;
                break;
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + zzyu4.getLocalName());
        }
        zzYU3.zzX(value, bArrZzZ74, i);
    }
}
