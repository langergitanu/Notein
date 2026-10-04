package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVV extends zzV6 {
    private boolean zzT2;
    public static zzVV zzT1 = new zzVV(true);
    public static zzVV zzT0 = new zzVV(false);

    private zzVV(boolean z) {
        this.zzT2 = z;
    }

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 0;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (zzwh.zzUK() == null) {
            return;
        }
        boolean z = this.zzT2;
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 1;
            double doubleValue = arrayList.get(i).getDoubleValue();
            if (z) {
                zzwh.zzUK().zzX(doubleValue, 0.0d);
            } else {
                zzwh.zzUK().zzX(0.0d, doubleValue);
            }
            z = !z;
            i = i2;
        }
    }
}
