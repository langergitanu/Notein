package com.aspose.words;

import com.aspose.words.ref.RefInt;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
final class zzQ2 extends zzOP {
    public zzQ2() {
        super(FirebaseAnalytics.Param.CONTENT, false, new zzMP(new zzL2(zzL4.zzZnb)));
    }

    @Override // com.aspose.words.zzOP
    public final zzPT zzZ(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt) {
        refInt.set(0);
        return null;
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzL2 zzl2, boolean z) {
        return new zzMP(zzl2);
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzMP zzmp, zzQK zzqk) {
        if (zzqk.zzZWD()) {
            return (zzmp.getCount() == 1 && zzmp.zzMl(0).zzP(zzL4.zzZnb)) ? new zzMP(new zzL2(zzL4.zzZno)) : zzmp;
        }
        return new zzMP(new zzL2(zzL4.zzZnb));
    }
}
