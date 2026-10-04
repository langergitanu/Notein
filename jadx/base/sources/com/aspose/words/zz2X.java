package com.aspose.words;

import androidx.core.text.util.LocalePreferences;

/* JADX INFO: loaded from: classes6.dex */
final class zz2X extends zz40 {
    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zz40.zzZ(LocalePreferences.FirstDayOfWeek.SATURDAY, str, getValue(), zzzyd);
    }

    @Override // com.aspose.words.zz40
    public final zz40 zzZR0() {
        return new zz2X();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 23;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        zzip.zzZR(getValue());
        return new com.aspose.words.internal.zzPV(zzpv.zzPD(), zzip.zzGx());
    }
}
