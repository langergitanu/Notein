package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZJ implements com.aspose.words.internal.zzHH {
    private boolean zzY01;
    private com.aspose.words.internal.zzHH zzY02;
    private zzZ2H zzY4Z;

    public zzYZJ(zzZ2H zzz2h, com.aspose.words.internal.zzHH zzhh) {
        this.zzY4Z = zzz2h;
        this.zzY02 = zzhh;
    }

    @Override // com.aspose.words.internal.zzHH
    public final int zzZ(ArrayList<com.aspose.words.internal.zzY4> arrayList, String str) throws Exception {
        if (arrayList.size() != 0) {
            if (this.zzY01) {
                return this.zzY02.zzZ(arrayList, str);
            }
            return 0;
        }
        int iZzYJt = this.zzY4Z.zzYJt();
        boolean z = iZzYJt == -1;
        this.zzY01 = z;
        return z ? this.zzY02.zzZ(arrayList, str) : iZzYJt;
    }
}
