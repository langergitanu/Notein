package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzUE extends zzUF {
    private static int[] zzRR = {2154725, 2154727, 2154729, 2154746, 2154985, 2154990, 2155744, 2155749, 2155753, 2155758, 2155762, 2155769, 2155770, 2157792, 2157796, 2158304, 2159340, 2161132, 14744096, 14950624, 14950625, 14950628, 14950636, 14950638, 14950649, 15001056, 15065120, 15068448, 15068960, 15071264, 15071776, 15278308, 15328288, 15328762, 15329773, 15330592, 15331104, 15333408, 15333920, 15474912, 15474916, 15523872, 15524896, 15540448, 15540449, 15540452, 15540460, 15540462, 15540473, 15655968, 15671524, 15787040, 15788320, 15788525, 15920160, 16261348, 16312813, 16378912, 16392416, 16392417, 16392420, 16392428, 16392430, 16392441};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.HEBREW;
    }

    @Override // com.aspose.words.internal.zzUF, com.aspose.words.internal.zzU1
    public final String getName() {
        return "ISO-8859-8-I";
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        String str = zzuu.zzUc() ? "windows-1255" : "ISO-8859-8-I";
        int iZzZ = zzU0.zzZ(zzuu, zzRR, zzUF.zzRU);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(iZzZ, str, TranslateLanguage.HEBREW);
    }
}
