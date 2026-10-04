package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzUD extends zzUF {
    private static int[] zzRR = {2154725, 2154732, 2155753, 2155756, 2155758, 2155760, 2157040, 2157810, 2157817, 2158053, 2158057, 2158565, 2158569, 2160869, 2160873, 2161376, 2161381, 2161385, 14688484, 14688492, 14688493, 14688506, 14738464, 14738916, 14740512, 14741024, 14754020, 14754029, 14754042, 14950628, 14950633, 14950636, 14950637, 14950639, 14950648, 14950650, 15002656, 15065120, 15066144, 15196192, 15327264, 15327520, 15328288, 15474916, 15474925, 15474938, 15528480, 15530272, 15591913, 15591920, 15591928, 15605988, 15605997, 15606010, 15655200, 15655968, 15918112, 16326884, 16326893, 16326906, 16376864, 16441376, 16442400, 16442857};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.HEBREW;
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        String str = zzuu.zzUc() ? "windows-1255" : "ISO-8859-8";
        int iZzZ = zzU0.zzZ(zzuu, zzRR, zzUF.zzRU);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(iZzZ, str, TranslateLanguage.HEBREW);
    }
}
