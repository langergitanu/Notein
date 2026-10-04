package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class zzV6 extends zzWE {
    public int zzUz() {
        return 0;
    }

    public void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
    }

    @Override // com.aspose.words.internal.zzWE, com.aspose.words.internal.zzWG
    public void zzZ(zzWH zzwh) {
        ArrayList<zzWF> arrayListZzUG = zzwh.zzUG();
        if (arrayListZzUG.size() < zzUz()) {
            zzwh.zzUI();
        } else {
            zzZ(zzwh, arrayListZzUG);
        }
    }
}
