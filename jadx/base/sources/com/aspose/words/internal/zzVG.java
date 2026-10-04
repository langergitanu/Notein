package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVG extends zzV6 {
    private boolean zzSH;
    public static zzVG zzSG = new zzVG(false);
    public static zzVG zzSF = new zzVG(true);

    private zzVG(boolean z) {
        this.zzSH = z;
    }

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 8;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (zzwh.zzUK() == null) {
            return;
        }
        int size = (arrayList.size() - 6) / 2;
        int i = 0;
        if (this.zzSH) {
            int i2 = 0;
            while (i < size) {
                int i3 = i2 + 1;
                double doubleValue = arrayList.get(i2).getDoubleValue();
                i2 += 2;
                zzwh.zzUK().zzX(doubleValue, arrayList.get(i3).getDoubleValue());
                i++;
            }
            i = i2;
        }
        while (i + 5 < arrayList.size()) {
            double doubleValue2 = arrayList.get(i).getDoubleValue();
            double doubleValue3 = arrayList.get(i + 1).getDoubleValue();
            double doubleValue4 = arrayList.get(i + 2).getDoubleValue();
            double doubleValue5 = arrayList.get(i + 3).getDoubleValue();
            int i4 = i + 5;
            double doubleValue6 = arrayList.get(i + 4).getDoubleValue();
            i += 6;
            zzwh.zzUK().zzZ(doubleValue2, doubleValue3, doubleValue4, doubleValue5, doubleValue6, arrayList.get(i4).getDoubleValue());
        }
        if (this.zzSH || size <= 0) {
            return;
        }
        zzwh.zzUK().zzX(arrayList.get(i).getDoubleValue(), arrayList.get(i + 1).getDoubleValue());
    }
}
