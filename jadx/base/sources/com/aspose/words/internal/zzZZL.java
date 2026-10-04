package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataRow;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZL extends zzYU {
    static zzZZL zzd3 = new zzZZL();

    private zzZZL() {
        super(Iterable.class);
    }

    @Override // com.aspose.words.internal.zzYU
    public final Object zzV(Object obj) {
        return ((zzZZM) obj).zzrF();
    }

    @Override // com.aspose.words.internal.zzYU
    public final DataRow zzY(Object obj) {
        return ((zzZZM) obj).zzrG();
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final boolean zzZ(Class cls) {
        return cls == zzZZM.class;
    }
}
