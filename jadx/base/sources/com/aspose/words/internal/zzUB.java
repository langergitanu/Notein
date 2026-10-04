package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzUB extends zzUC {
    private static int[] zzRQ = {2122337, 2122345, 2122357, 2122849, 2122853, 2123621, 2123873, 2124140, 2124641, 2124655, 2125153, 2125676, 2126689, 2126945, 2127461, 2128225, 6365282, 6384416, 6384737, 6384993, 6385184, 6385405, 6386208, 6386273, 6386429, 6386685, 6388065, 6449522, 6578464, 6579488, 6580512, 6627426, 6627435, 6644841, 6647328, 6648352, 6648425, 6648681, 6909029, 6909472, 6909545, 6910496, 7102830, 7102834, 7103776, 7103858, 7217249, 7217250, 7217259, 7234657, 7234661, 7234848, 7235872, 7235950, 7273760, 7498094, 7535982, 7759136, 7954720, 7958386, 16608800, 16608868, 16609021, 16642301};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.TURKISH;
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        String str = zzuu.zzUc() ? "windows-1254" : "ISO-8859-9";
        int iZzZ = zzU0.zzZ(zzuu, zzRQ, zzUC.zzRU);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(iZzZ, str, TranslateLanguage.TURKISH);
    }
}
