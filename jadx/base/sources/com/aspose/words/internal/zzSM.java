package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzSM extends zzYR {
    public zzSM(zzZG zzzg, zz6I zz6i) {
        super(zzzg, zz6i);
    }

    @Override // com.aspose.words.internal.zzYR
    public final void zzZ(ArrayList<zzZG> arrayList, zzZG zzzg) throws Exception {
        (zzzg.zzZ2().getDashStyle() != 0 ? new zzSQ() : new zzSO()).zzY(arrayList, zzzg);
        if (zzYt()) {
            for (int size = arrayList.size(); size < arrayList.size(); size++) {
                arrayList.set(size, zzZVE.zzF(arrayList.get(size)));
            }
        }
    }
}
