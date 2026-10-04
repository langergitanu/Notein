package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzVC extends zzV6 {
    @Override // com.aspose.words.internal.zzV6, com.aspose.words.internal.zzWE, com.aspose.words.internal.zzWG
    public final void zzZ(zzWH zzwh) {
        ArrayList<zzWF> arrayListZzUG = zzwh.zzUG();
        if (zzwh.zzUM()) {
            if (zzZg(arrayListZzUG.size())) {
                arrayListZzUG.remove(0);
            }
            zzwh.zzu(false);
        }
        if (arrayListZzUG.size() < zzUz()) {
            zzwh.zzUI();
        } else {
            zzZ(zzwh, arrayListZzUG);
        }
    }

    public boolean zzZg(int i) {
        return i > zzUz();
    }
}
