package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVX extends zzV6 {
    public static zzVX zzT4 = new zzVX();

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 7;
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
        zzwh.zzUK().zzZ(doubleValue, 0.0d, doubleValue2, doubleValue3, doubleValue4, 0.0d);
        zzwh.zzUK().zzZ(doubleValue5, 0.0d, doubleValue6, -doubleValue3, doubleValue7, 0.0d);
    }
}
