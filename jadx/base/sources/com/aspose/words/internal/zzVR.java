package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVR extends zzV6 {
    private boolean zzT2;
    public static zzVR zzST = new zzVR(true);
    public static zzVR zzSS = new zzVR(false);

    private zzVR(boolean z) {
        this.zzT2 = z;
    }

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 4;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (zzwh.zzUK() == null) {
            return;
        }
        boolean z = this.zzT2;
        int i = 0;
        while (i + 3 < arrayList.size()) {
            int i2 = i + 1;
            double doubleValue = arrayList.get(i).getDoubleValue();
            double doubleValue2 = 0.0d;
            double d = z ? doubleValue : 0.0d;
            double d2 = z ? 0.0d : doubleValue;
            double doubleValue3 = arrayList.get(i2).getDoubleValue();
            double doubleValue4 = arrayList.get(i + 2).getDoubleValue();
            int i3 = i + 4;
            double doubleValue5 = arrayList.get(i + 3).getDoubleValue();
            if (i3 == arrayList.size() - 1) {
                i += 5;
                doubleValue2 = arrayList.get(i3).getDoubleValue();
            } else {
                i = i3;
            }
            if (z) {
                doubleValue5 = doubleValue2;
            }
            zzwh.zzUK().zzZ(d, d2, doubleValue3, doubleValue4, doubleValue5, z ? doubleValue5 : doubleValue2);
            z = !z;
        }
    }
}
