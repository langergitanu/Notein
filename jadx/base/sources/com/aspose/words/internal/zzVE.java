package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVE extends zzVC {
    public static zzVE zzSD = new zzVE();

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 2;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (zzwh.zzUK() == null) {
            return;
        }
        zzwh.zzUK().zzY(arrayList.get(0).getDoubleValue(), arrayList.get(1).getDoubleValue());
    }
}
