package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYE {
    private com.aspose.words.internal.zzZO0 zzMW;
    private ArrayList<zzYYC> zzXYg = new ArrayList<>();

    public zzYYE(com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzMW = zzzo0;
    }

    public final void zzX(com.aspose.words.internal.zzXZ zzxz) throws Exception {
        Iterator<zzYYC> it = this.zzXYg.iterator();
        int length = 12;
        while (it.hasNext()) {
            length += it.next().getLength();
        }
        zzxz.zzk(1163416648);
        zzxz.zzk(length);
        zzxz.zzk(this.zzXYg.size());
        Iterator<zzYYC> it2 = this.zzXYg.iterator();
        while (it2.hasNext()) {
            it2.next().zzX(zzxz);
        }
        zzYXM.zzQ(zzxz, length);
    }

    public final void zzq(int i, String str) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXYg, new zzYYC(i, this.zzMW.getBytes(str)));
    }
}
