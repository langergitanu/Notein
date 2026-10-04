package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYW extends zzYR {
    public zzZYW(zzZG zzzg, zz6I zz6i) {
        super(zzzg, zz6i);
    }

    @Override // com.aspose.words.internal.zzYR
    public final boolean zzV(zzZG zzzg) {
        return (zzYu().zzwN() || zzYu().zzwQ()) && super.zzV(zzzg);
    }

    @Override // com.aspose.words.internal.zzYR
    public final zzZG zzX(zzZG zzzg) throws Exception {
        return (zzYu().zzwN() || zzYu().zzwQ()) ? super.zzX(zzzg) : zzzg;
    }

    @Override // com.aspose.words.internal.zzYR
    public final void zzZ(ArrayList<zzZG> arrayList, zzZG zzzg) throws Exception {
        if (zzYt()) {
            zzzg = zzZVE.zzF(zzzg);
        }
        zzZQG.zzZ(arrayList, zzzg);
    }
}
