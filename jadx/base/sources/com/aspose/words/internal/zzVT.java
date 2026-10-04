package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVT extends zzV6 {
    private boolean zzSZ;
    public static zzVT zzSW = new zzVT(true);
    public static zzVT zzSV = new zzVT(false);

    private zzVT(boolean z) {
        this.zzSZ = z;
    }

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 4;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        double doubleValue;
        if (zzwh.zzUK() == null) {
            return;
        }
        int i = 1;
        if (arrayList.size() % 2 == 1) {
            doubleValue = arrayList.get(0).getDoubleValue();
        } else {
            i = 0;
            doubleValue = 0.0d;
        }
        while (i + 3 < arrayList.size()) {
            int i2 = i + 1;
            double doubleValue2 = arrayList.get(i).getDoubleValue();
            boolean z = this.zzSZ;
            double d = z ? doubleValue2 : doubleValue;
            double d2 = z ? doubleValue : doubleValue2;
            double doubleValue3 = arrayList.get(i2).getDoubleValue();
            int i3 = i + 3;
            double doubleValue4 = arrayList.get(i + 2).getDoubleValue();
            i += 4;
            double doubleValue5 = arrayList.get(i3).getDoubleValue();
            boolean z2 = this.zzSZ;
            zzwh.zzUK().zzZ(d, d2, doubleValue3, doubleValue4, z2 ? doubleValue5 : 0.0d, z2 ? 0.0d : doubleValue5);
            doubleValue = 0.0d;
        }
    }
}
