package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVW extends zzV6 {
    public static zzVW zzT3 = new zzVW();

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 9;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (zzwh.zzUK() == null) {
            return;
        }
        double doubleValue = arrayList.get(0).getDoubleValue();
        double doubleValue2 = arrayList.get(1).getDoubleValue();
        double doubleValue3 = arrayList.get(2).getDoubleValue();
        double doubleValue4 = arrayList.get(3).getDoubleValue();
        double doubleValue5 = arrayList.get(4).getDoubleValue();
        double doubleValue6 = arrayList.get(5).getDoubleValue();
        double doubleValue7 = arrayList.get(6).getDoubleValue();
        double doubleValue8 = arrayList.get(7).getDoubleValue();
        double doubleValue9 = arrayList.get(8).getDoubleValue();
        zzwh.zzUK().zzZ(doubleValue, doubleValue2, doubleValue3, doubleValue4, doubleValue5, 0.0d);
        zzwh.zzUK().zzZ(doubleValue6, 0.0d, doubleValue7, doubleValue8, doubleValue9, ((-doubleValue2) - doubleValue4) - doubleValue8);
    }
}
