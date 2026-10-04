package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVF extends zzV6 {
    public static zzVF zzSE = new zzVF();

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 2;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (zzwh.zzUK() == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= arrayList.size()) {
                return;
            }
            double doubleValue = arrayList.get(i).getDoubleValue();
            i += 2;
            zzwh.zzUK().zzX(doubleValue, arrayList.get(i2).getDoubleValue());
        }
    }
}
