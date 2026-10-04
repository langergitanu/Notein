package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzUK extends zzUL {
    private static int[] zzRR = {2150944, 2151134, 2151646, 2152400, 2152480, 2153168, 2153182, 2153936, 2153941, 2154193, 2154462, 2154464, 2154704, 2154974, 2154978, 2155230, 2156514, 2158050, 13688280, 13689580, 13884960, 14015468, 14015960, 14016994, 14017056, 14164191, 14210336, 14211104, 14216992, 14407133, 14407712, 14413021, 14536736, 14538016, 14538965, 14538991, 14540320, 14540498, 14557394, 14557407, 14557409, 14602784, 14602960, 14603230, 14604576, 14605292, 14605344, 14606818, 14671579, 14672085, 14672088, 14672094, 14733522, 14734804, 14803664, 14803666, 14803672, 14806816, 14865883, 14868000, 14868192, 14871584, 15196894, 15459616};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.RUSSIAN;
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        int iZzZ = zzU0.zzZ(zzuu, zzRR, zzUL.zzRU);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(this, iZzZ);
    }
}
