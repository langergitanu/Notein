package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYF {
    private com.aspose.words.internal.zzZO0 zzMW;
    private ArrayList<zzYYG> zzXYh;

    public zzYYF(com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzMW = zzzo0;
        ArrayList<zzYYG> arrayList = new ArrayList<>();
        this.zzXYh = arrayList;
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYYG());
    }

    public final int zzHN(String str) throws Exception {
        zzYYG zzyyg = new zzYYG();
        byte[] bytes = this.zzMW.getBytes(str);
        zzyyg.zzYCU().writeBytes(zzY3N.zzjh(bytes.length));
        zzyyg.zzYCU().writeBytes(bytes);
        zzYYG zzyyg2 = (zzYYG) C21505OooO0Oo.OooO00o(1, this.zzXYh);
        if (zzyyg2.getLength() + zzyyg.getLength() > 64512) {
            zzyyg2.zzYCV();
            com.aspose.words.internal.zzZQG.zzZ(this.zzXYh, new zzYYG());
            zzyyg2 = (zzYYG) C21505OooO0Oo.OooO00o(1, this.zzXYh);
        }
        int size = ((this.zzXYh.size() - 1) * 65536) + zzyyg2.getLength();
        zzyyg.zzY(zzyyg2);
        return size;
    }

    public final ArrayList<zzYYG> zzYCT() {
        return this.zzXYh;
    }
}
