package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRZ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("font-family", "name", "font-family-generic", "font-pitch", "panose-1", "font-charset", "font-adornments", "accent-height", "alphabetic", "ascent", "bbox", "cap-height", "descent", "font-size", "font-stretch", "font-style", "font-variant", "font-weight", "hanging", "ideographic", "mathematical", "overline-position", "overline-thickness", "slope", "stemh", "stemv", "strikethrough-position", "strikethrough-thickness", "underline-position", "underline-thickness", "unicode-range", "units-per-em", "v-alphabetic", "v-hanging", "v-ideographic", "v-mathematical", "widths", "x-height");

    private static String zzW(zzYQ9 zzyq9) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(zzyq9.getValue().replace("'", ""), ',');
        if (strArrZzR.length > 0) {
            return com.aspose.words.internal.zzZKN.zzS(strArrZzR[0], ControlChar.SPACE_CHAR);
        }
        return null;
    }

    public static void zzZ(zzYQ7 zzyq7, zzZ3Z zzz3z) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("font-face-decls")) {
            if (zzz3z != null) {
                zzz3z.zzYX(zzyq9ZzYuT.zz5());
            }
            if ("font-face".equals(zzyq9ZzYuT.getLocalName())) {
                zzt(zzyq7);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static void zzs(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("font-face")) {
            if ("definition-src".equals(zzyq9ZzYuT.getLocalName()) || "font-face-src".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, true, "style:font-face");
            } else {
                zzyq7.zzYuT().zzk();
            }
        }
    }

    private static void zzt(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String str = null;
        String strZzW = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int i = 0;
            if (!zzyq9ZzYuT.zzi()) {
                zzs(zzyq7);
                if (str == null) {
                    return;
                }
                if (!zzyq7.zzYuA().containsKey(str)) {
                    com.aspose.words.internal.zzZQF.zzY(zzyq7.zzYuA(), str, strZzW);
                }
                if (com.aspose.words.internal.zzZYD.zzXk(strZzW)) {
                    str = strZzW;
                }
                FontInfo fontInfo = new FontInfo(str);
                if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
                    fontInfo.setFamily(zzYS3.zzFe(str2));
                }
                if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
                    fontInfo.setPitch(zzYS3.zzFd(str3));
                }
                if ("x-symbol".equals(str4)) {
                    fontInfo.setCharset(2);
                }
                if (com.aspose.words.internal.zzZYD.zzXk(str5)) {
                    byte[] bArr = new byte[10];
                    String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str5, ControlChar.SPACE_CHAR);
                    int length = strArrZzR.length;
                    int i2 = 0;
                    while (i < length) {
                        bArr[i2] = Byte.parseByte(strArrZzR[i]);
                        i++;
                        i2++;
                    }
                    fontInfo.setPanose(bArr);
                }
                zzyq7.getDocument().getFontInfos().zzW(fontInfo);
                return;
            }
            String value = zzyq9ZzYuT.getValue();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    strZzW = zzW(zzyq9ZzYuT);
                    break;
                case 1:
                    str = value;
                    break;
                case 2:
                    str2 = value;
                    break;
                case 3:
                    str3 = value;
                    break;
                case 4:
                    str5 = value;
                    break;
                case 5:
                    zzyq7.zzZ(256, false, "style:font-face");
                    str4 = value;
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    zzyq7.zzZ(256, false, "style:font-face");
                    break;
                default:
                    zzyq7.zzYi("font-face", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }
}
