package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG9 implements zzZAR {
    private ArrayList<zzZAR> zzYnY = new ArrayList<>();

    @Override // com.aspose.words.zzZAR
    public final void zzY(zzZGA zzzga) {
        Iterator<zzZAR> it = this.zzYnY.iterator();
        while (it.hasNext()) {
            it.next().zzY(zzzga);
        }
    }

    @Override // com.aspose.words.zzZAR
    public final boolean zzZ(zzZGA zzzga) {
        Iterator<zzZAR> it = this.zzYnY.iterator();
        while (it.hasNext()) {
            if (!it.next().zzZ(zzzga)) {
                return false;
            }
        }
        return true;
    }

    public final void zzZ(zzZAR zzzar) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYnY, zzzar);
    }
}
