package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzUG extends zzUH {
    private static int[] zzRR = {2154989, 2154992, 2155497, 2155753, 2156016, 2156320, 2157281, 2157797, 2158049, 2158368, 2158817, 2158831, 2158833, 2159604, 2159605, 2159847, 2159855, 14672160, 14754017, 14754036, 14805280, 14806304, 14807292, 14807584, 14936545, 15067424, 15069728, 15147252, 15199520, 15200800, 15278324, 15327520, 15330014, 15331872, 15393257, 15393268, 15525152, 15540449, 15540453, 15540464, 15589664, 15725088, 15725856, 15790069, 15790575, 15793184, 15868129, 15868133, 15868138, 15868144, 15868148, 15983904, 15984416, 15987951, 16048416, 16048617, 16050157, 16050162, 16050666, 16052000, 16052213, 16054765, 16379168, 16706848};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.GREEK;
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        String str = zzuu.zzUc() ? "windows-1253" : "ISO-8859-7";
        int iZzZ = zzU0.zzZ(zzuu, zzRR, zzUH.zzRU);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(iZzZ, str, TranslateLanguage.GREEK);
    }
}
