package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzFY {
    public static void zzZ(zzG1 zzg1, zzZXR zzzxr) throws Exception {
        if (zzg1 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("cs:colorStyle");
        zzzydZzZlV.zz0("xmlns:cs", "http://schemas.microsoft.com/office/drawing/2012/chartStyle");
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, zzzxr.getCompliance() == 2));
        zzzydZzZlV.zz0("meth", zzg1.getMethod());
        zzzydZzZlV.zz0("id", zzg1.getId());
        if (zzg1.zzZO0() != null) {
            for (zzBW zzbw : zzg1.zzZO0()) {
                zzBN.zzW("a", zzbw, zzzxr);
            }
        }
        if (zzg1.zzZNZ() != null) {
            for (zzFZ zzfz : zzg1.zzZNZ()) {
                zzZ(zzfz, zzzxr);
            }
        }
        zz7Z.zzZ(TranslateLanguage.CZECH, zzg1.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.flush();
    }

    private static void zzZ(zzFZ zzfz, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("cs:variation");
        zzBS.zzZ("a", zzfz.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }
}
