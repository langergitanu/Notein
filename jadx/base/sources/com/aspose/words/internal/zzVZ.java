package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVZ extends zzV6 {
    public static zzVZ zzT6 = new zzVZ();

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 11;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        double d;
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
        double doubleValue10 = arrayList.get(9).getDoubleValue();
        double doubleValue11 = arrayList.get(10).getDoubleValue();
        double d2 = doubleValue + doubleValue3 + doubleValue5 + doubleValue7 + doubleValue9;
        double d3 = doubleValue2 + doubleValue4 + doubleValue6 + doubleValue8 + doubleValue10;
        if (Math.abs(d2) > Math.abs(d3)) {
            d = doubleValue11;
            doubleValue11 = -d3;
        } else {
            d = -d2;
        }
        zzwh.zzUK().zzZ(doubleValue, doubleValue2, doubleValue3, doubleValue4, doubleValue5, doubleValue6);
        zzwh.zzUK().zzZ(doubleValue7, doubleValue8, doubleValue9, doubleValue10, d, doubleValue11);
    }
}
