package com.aspose.words;

import com.orion.notein.richeditor.fonts.FontManager;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXI {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("font", "altName", "panose1", "charset", "family", "notTrueType", "pitch", "sig", "embedRegular", "embedBold", "embedItalic", "embedBoldItalic", "usb0", "usb1", "usb2", "usb3", "csb0", "csb1");

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ;
        if (zzzxt.zzYyZ().zzZrB() || (zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkT())) == null) {
            return;
        }
        FontInfoCollection fontInfos = zzzxt.getDocument().getFontInfos();
        while (zzzw1ZzNJ.zzQ(FontManager.REMOTE_FONT_DIR)) {
            if (zzUR.zzTP(zzzw1ZzNJ.getLocalName()) != 0) {
                zzzw1ZzNJ.zzk();
            } else {
                fontInfos.zzW(zzZQ(zzzxt));
            }
        }
        zzzxt.zzZmi();
    }

    private static void zzZ(zzZXT zzzxt, zzYU4 zzyu4, FontInfo fontInfo, int i) {
        String strZzV = zzyu4.zzV("id", null);
        String strZzV2 = zzyu4.zzV("fontKey", null);
        boolean zZzX = zzyu4.zzX("subsetted", false);
        byte[] bArrZzNN = zzzxt.zzNN(strZzV);
        if (strZzV2 != null) {
            zzZXJ.zzT(bArrZzNN, strZzV2);
        }
        fontInfo.zzW(zzzxt.zzY0(bArrZzNN), 1, i, zZzX);
    }

    private static FontInfo zzZQ(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        FontInfo fontInfo = new FontInfo(zzyu4ZzZsD.zzV("name", ""));
        while (zzyu4ZzZsD.zzQ("font")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 1:
                    fontInfo.setAltName(zzyu4ZzZsD.zzV("val", null));
                    break;
                case 2:
                    String strZzV = zzyu4ZzZsD.zzV("val", null);
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                        fontInfo.setPanose(zzYU3.zzGS(strZzV));
                    }
                    break;
                case 3:
                    String strZzV2 = zzyu4ZzZsD.zzV("val", null);
                    if (!com.aspose.words.internal.zzZYD.zzXk(strZzV2)) {
                        String strZzV3 = zzyu4ZzZsD.zzV("characterSet", "");
                        if (com.aspose.words.internal.zzZYD.zzXk(strZzV3)) {
                            fontInfo.zzLo(strZzV3);
                            zzzxt.zzZqn().zzYrc();
                        }
                    } else {
                        fontInfo.setCharset(zzYU3.zzGU(strZzV2.replace("x", "")));
                    }
                    break;
                case 4:
                    fontInfo.setFamily(zzZXP.zzNl(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 5:
                    fontInfo.isTrueType(!zzyu4ZzZsD.zzYyD());
                    break;
                case 6:
                    fontInfo.setPitch(zzY8T.zzAU(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 7:
                    fontInfo.zzYe(new byte[24]);
                    while (zzyu4ZzZsD.zzi()) {
                        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                            case 12:
                                zzYU3.zzX(zzyu4ZzZsD.getValue(), fontInfo.zzZ74(), 0);
                                break;
                            case 13:
                                zzYU3.zzX(zzyu4ZzZsD.getValue(), fontInfo.zzZ74(), 4);
                                break;
                            case 14:
                                zzYU3.zzX(zzyu4ZzZsD.getValue(), fontInfo.zzZ74(), 8);
                                break;
                            case 15:
                                zzYU3.zzX(zzyu4ZzZsD.getValue(), fontInfo.zzZ74(), 12);
                                break;
                            case 16:
                                zzYU3.zzX(zzyu4ZzZsD.getValue(), fontInfo.zzZ74(), 16);
                                break;
                            case 17:
                                zzYU3.zzX(zzyu4ZzZsD.getValue(), fontInfo.zzZ74(), 20);
                                break;
                            default:
                                zzyu4ZzZsD.getLocalName();
                                break;
                        }
                    }
                    break;
                case 8:
                    zzZ(zzzxt, zzyu4ZzZsD, fontInfo, 0);
                    break;
                case 9:
                    zzZ(zzzxt, zzyu4ZzZsD, fontInfo, 1);
                    break;
                case 10:
                    zzZ(zzzxt, zzyu4ZzZsD, fontInfo, 2);
                    break;
                case 11:
                    zzZ(zzzxt, zzyu4ZzZsD, fontInfo, 3);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
        return fontInfo;
    }
}
