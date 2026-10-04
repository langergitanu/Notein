package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI0 {
    public static void zzY(zzYEM zzyem, Border border) throws Exception {
        int iZzr;
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        if (border.zz8T()) {
            zzyhzZzYfW.zzZ5("\\brdrart", zzYEO.zzny(border.getLineStyle()));
            iZzr = zzYEO.zzWg(border.getLineWidth());
        } else {
            zzyhzZzYfW.zzCD(zzYGD.zzoF(border.getLineStyle()));
            iZzr = com.aspose.words.internal.zzSA.zzr(border.getLineWidth());
        }
        zzyhzZzYfW.zzZ5("\\brdrw", iZzr);
        zzyhzZzYfW.zzZ5("\\brdrcf", zzyem.zzZM(border.zz8Q()));
        zzyhzZzYfW.zzZ5("\\brsp", com.aspose.words.internal.zzSA.zzr(border.getDistanceFromText()));
        zzyhzZzYfW.zz7("\\brdrframe", border.zz8P());
        zzyhzZzYfW.zz7("\\brdrsh", border.getShadow());
    }

    public static void zzZ(zzYEM zzyem, Border border) throws Exception {
        if (border.isVisible()) {
            zzY(zzyem, border);
        }
    }
}
