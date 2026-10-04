package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH9 {
    private static boolean zzCl(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (' ' > str.charAt(i) || str.charAt(i) >= 128) {
                return false;
            }
        }
        return true;
    }

    private static void zzW(zzYHZ zzyhz, FontInfo fontInfo) throws Exception {
        zzZUW zzzuwZzMF;
        byte[] data;
        if (fontInfo.zzZ77()) {
            zzyhz.zzCC("\\*\\fontemb");
            zzyhz.zzCD("\\ftruetype");
            for (zzZUW zzzuw : fontInfo.zzZ78()) {
                if (zzzuw != null && (zzzuwZzMF = zzzuw.zzMF(fontInfo.getName())) != null && (data = zzzuwZzMF.getData()) != null) {
                    int iZz9 = com.aspose.words.internal.zzKU.zz9(data);
                    zzyhz.zzE(data, 0, iZz9);
                    zzyhz.zzE(data, iZz9, data.length);
                }
            }
            zzyhz.zzYj3();
        }
    }

    private static void zzX(zzYHZ zzyhz, FontInfo fontInfo) throws Exception {
        if (fontInfo.getPanose() != null) {
            zzyhz.zzCC("\\*\\panose");
            zzyhz.zzXQ(fontInfo.getPanose());
            zzyhz.zzYj3();
        }
    }

    private static void zzY(zzYHZ zzyhz, FontInfo fontInfo) throws Exception {
        int pitch = fontInfo.getPitch();
        if (pitch == 1) {
            zzyhz.zzCD("\\fprq1");
        } else {
            if (pitch != 2) {
                return;
            }
            zzyhz.zzCD("\\fprq2");
        }
    }

    public static void zzZ(zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzYj9();
        zzyhzZzYfW.zzZ(com.aspose.words.internal.zzZO0.zzQz(1252));
        zzyhzZzYfW.zzCC("\\fonttbl");
        FontInfoCollection fontInfos = zzyem.getFontInfos();
        for (int i = 0; i < fontInfos.getCount(); i++) {
            zzZ(zzyhzZzYfW, i, fontInfos.get(i), 0);
        }
        for (Integer num : zzyem.zzYea()) {
            int iIntValue = num.intValue();
            zzZ(zzyhzZzYfW, zzyem.zznk(iIntValue), zzyem.zzYeb().get(num.intValue()), iIntValue);
        }
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzFg();
    }

    private static void zzZ(zzYHZ zzyhz, int i, FontInfo fontInfo, int i2) throws Exception {
        zzyhz.zzFg();
        zzyhz.zzYj5();
        zzyhz.zzCD(zzYEW.zznJ(i2));
        zzyhz.zzZ5("\\f", i);
        zzZ(zzyhz, fontInfo);
        int iZzt = com.aspose.words.internal.zzT8.zzt(fontInfo.getCharset(), 1252);
        int charset = (iZzt == 932 || !zzCl(fontInfo.getName())) ? fontInfo.getCharset() : 0;
        if (fontInfo.getCharset() == 2 || com.aspose.words.internal.zzJF.zzZK(fontInfo.getName())) {
            charset = 2;
        }
        zzyhz.zzZ5("\\fcharset", charset);
        zzY(zzyhz, fontInfo);
        zzX(zzyhz, fontInfo);
        zzW(zzyhz, fontInfo);
        String name = fontInfo.getName();
        String altName = fontInfo.getAltName();
        if (!zzCl(fontInfo.getName()) && zzCl(fontInfo.getAltName())) {
            altName = fontInfo.getName();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(altName)) {
            zzyhz.zzL("\\*\\falt", altName, 1);
        }
        zzyhz.zzZ(com.aspose.words.internal.zzZO0.zzQz(iZzt));
        zzyhz.zzZ3(name, 3);
        zzyhz.zzYj8();
        zzyhz.zzYj4();
    }

    private static void zzZ(zzYHZ zzyhz, FontInfo fontInfo) throws Exception {
        int family = fontInfo.getFamily();
        if (family == 1) {
            zzyhz.zzCD("\\froman");
            return;
        }
        if (family == 2) {
            zzyhz.zzCD("\\fswiss");
            return;
        }
        if (family == 3) {
            zzyhz.zzCD("\\fmodern");
            return;
        }
        if (family == 4) {
            zzyhz.zzCD("\\fscript");
        } else if (family != 5) {
            zzyhz.zzCD("\\fnil");
        } else {
            zzyhz.zzCD("\\fdecor");
        }
    }
}
