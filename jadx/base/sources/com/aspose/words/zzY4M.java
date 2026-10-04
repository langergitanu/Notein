package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4M {
    private static zzY4K[] zzX1B = {new zz4(), new zz3(), new zzZ3G(), new zzY3S(), new zzZ3F(), new zzY3R(), new zzZ3I(), new zzY3U(), new zzZ3H(), new zzY3T(), new zzZY(), new zzKK(), new zzT2(), new zzXL()};
    private static char zzX1C = ' ';

    public static zzY4N zzZ(String str, TxtLoadOptions txtLoadOptions) {
        if (!txtLoadOptions.getAutoNumberingDetection()) {
            return null;
        }
        com.aspose.words.internal.zzZKN.zzS(str, " ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
        zzX1B[0].setDetectNumberingWithWhitespaces(txtLoadOptions.getDetectNumberingWithWhitespaces());
        for (zzY4K zzy4k : zzX1B) {
            zzY4L zzy4lZzTD = zzy4k.zzTD(str);
            if (zzy4lZzTD != null && zzy4lZzTD.zzXUB().length <= 8 && zzZ(zzy4k, zzy4lZzTD)) {
                return new zzY4N(zzy4k, zzy4lZzTD.zzXUB(), zzy4lZzTD.getText());
            }
        }
        return null;
    }

    private static boolean zzZ(zzY4K zzy4k, zzY4L zzy4l) {
        char lowerCase = Character.toLowerCase(zzy4l.getText().charAt(0));
        boolean z = true;
        if (zzy4k.getNumberStyle() == 2 || zzy4k.getNumberStyle() == 1) {
            char[] cArr = zzY4P.zzX1U;
            if (com.aspose.words.internal.zzZKV.zzZ(cArr, lowerCase, 0, cArr.length) != -1) {
                z = ((char) (lowerCase + 65535)) != zzX1C;
            }
        }
        if (z) {
            zzX1C = lowerCase;
        }
        return z;
    }
}
