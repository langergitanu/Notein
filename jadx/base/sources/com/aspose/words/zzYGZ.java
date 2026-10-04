package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGZ {
    private static com.aspose.words.internal.zzZOR zzT(zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.flush();
        zzYEX zzyexZzYj1 = zzyhzZzYfW.zzYj1();
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzyhzZzYfW.zzZ(new zzYF6(zzzor));
        new zzYF3().zzZ(zzyem);
        new zzYGM().zzZ(zzyem);
        zzyhzZzYfW.flush();
        zzyhzZzYfW.zzZ(zzyexZzYj1);
        return zzzor;
    }

    private static void zzU(zzYEM zzyem) throws Exception {
        zzY5H zzy5h = zzyem.getDocument().zzZpV().zzYVe;
        zzZ(zzyem, zzy5h.zzX34, "\\themelang");
        zzZ(zzyem, zzy5h.zzX33, "\\themelangfe");
        zzZ(zzyem, zzy5h.zzX32, "\\themelangcs");
    }

    public static void zzZ(zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzCD("\\rtf1");
        zzyhzZzYfW.zzCD("\\ansi");
        zzyhzZzYfW.zzCD("\\ansicpg1252");
        zzyhzZzYfW.zzCD("\\uc0");
        StyleCollection styles = zzyem.getDocument().getStyles();
        zzYEF zzyefZzY37 = styles.zzY37();
        zzyhzZzYfW.zzZ5("\\stshfdbch", zzyem.zzZ(zzyefZzY37.zzYdR(), "MS Mincho"));
        zzyhzZzYfW.zzZ5("\\stshfloch", zzyem.zzT(zzyefZzY37.zzYdS()));
        zzyhzZzYfW.zzZ5("\\stshfhich", zzyem.zzT(zzyefZzY37.zzYdQ()));
        zzyhzZzYfW.zzZ5("\\stshfbi", zzyem.zzT(zzyefZzY37.zzYdP()));
        zzyhzZzYfW.zzZ5("\\deff", zzyem.zzT((zzU1) styles.zzY37().zzPj(230)));
        zzyhzZzYfW.zzCD("\\adeff0");
        if (zzyem.zzYeq()) {
            zzU(zzyem);
        }
        zzt(zzyem.getDocument());
        com.aspose.words.internal.zzZOR zzzorZzT = zzT(zzyem);
        zzYH9.zzZ(zzyem);
        zzYHT.zzZ(zzyem);
        zzYHD.zzZ(zzyem);
        zzyhzZzYfW.flush();
        zzyhzZzYfW.zzYj1().zzE(zzzorZzT);
        zzYHJ.zzV(zzyem);
        zzYFR.zzR(zzyem);
        zzYFR.zzQ(zzyem);
        if (zzyem.zzZqS().zzXoX) {
            zzYFZ.zzZ(zzyem);
        }
        if (zzyem.zzYen().getExportGeneratorName()) {
            zzyhzZzYfW.zzFg();
            zzyhzZzYfW.zzY4("\\*\\generator", "Aspose.Words for Android via Java 24.3.0");
            zzyhzZzYfW.zzFg();
        }
    }

    private static void zzt(DocumentBase documentBase) {
        documentBase.getFontInfos().zzLn(documentBase.zzZpV().zzYVd.zzYEt());
    }

    private static void zzZ(zzYEM zzyem, int i, String str) throws Exception {
        if (i != 1024) {
            zzyem.zzYfW().zzZ5(str, i);
        }
    }
}
