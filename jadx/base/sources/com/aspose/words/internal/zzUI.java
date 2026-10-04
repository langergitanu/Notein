package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzUI extends zzUJ {
    private int[] zzRQ = {2148324, 2148326, 2148551, 2152932, 2154986, 2155748, 2156006, 2156743, 13050055, 13091104, 13093408, 13095200, 13100064, 13100227, 13100231, 13100232, 13100234, 13100236, 13100237, 13100239, 13100243, 13100249, 13100258, 13100261, 13100264, 13100266, 13100320, 13100576, 13100746, 13115591, 13181127, 13181153, 13181156, 13181157, 13181160, 13246663, 13574343, 13617440, 13705415, 13748512, 13836487, 14229703, 14279913, 14805536, 14950599, 14993696, 15001888, 15002144, 15016135, 15058720, 15059232, 15066656, 15081671, 15147207, 15189792, 15255524, 15263264, 15278279, 15343815, 15343845, 15343848, 15386912, 15388960, 15394336};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.ARABIC;
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        int iZzZ = zzU0.zzZ(zzuu, this.zzRQ, zzUJ.zzRU);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(this, iZzZ);
    }
}
