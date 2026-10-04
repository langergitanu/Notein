package com.aspose.words;

import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes6.dex */
final class zzMM extends zzM5 {
    private static zzMA zzZrQ = new zzMA(0, 0, 1);
    private String mName;
    private int zzZp6;

    public zzMM(int i, String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZp6 = i;
        this.mName = str;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        return true;
    }

    @Override // com.aspose.words.zzMD
    public final int zzZWt() {
        return this.zzZp6;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZWv() {
        return true;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return this.mName;
    }

    @Override // com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return zzZrQ;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        int i = this.zzZp6;
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO((i == 1 || i == 2 || i == 3 || i == 4) ? C18241k5.f55433h : "::");
        sbOooO0OO.append(this.mName);
        return sbOooO0OO.toString();
    }
}
