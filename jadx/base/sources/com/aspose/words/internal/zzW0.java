package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzW0 extends zzV6 {
    public static zzW0 zzT7 = new zzW0();

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 13;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (zzwh.zzUK() == null) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            double doubleValue = arrayList.get(i).getDoubleValue();
            double doubleValue2 = arrayList.get(i + 1).getDoubleValue();
            double doubleValue3 = arrayList.get(i + 2).getDoubleValue();
            double doubleValue4 = arrayList.get(i + 3).getDoubleValue();
            int i3 = i + 5;
            double doubleValue5 = arrayList.get(i + 4).getDoubleValue();
            i += 6;
            zzwh.zzUK().zzZ(doubleValue, doubleValue2, doubleValue3, doubleValue4, doubleValue5, arrayList.get(i3).getDoubleValue());
        }
    }
}
