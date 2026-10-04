package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVU extends zzVC {
    private boolean zzSZ;
    public static zzVU zzSY = new zzVU(true);
    public static zzVU zzSX = new zzVU(false);

    private zzVU(boolean z) {
        this.zzSZ = z;
    }

    @Override // com.aspose.words.internal.zzV6
    public final int zzUz() {
        return 1;
    }

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (zzwh.zzUK() == null) {
            return;
        }
        double doubleValue = arrayList.get(0).getDoubleValue();
        if (this.zzSZ) {
            zzwh.zzUK().zzY(doubleValue, 0.0d);
        } else {
            zzwh.zzUK().zzY(0.0d, doubleValue);
        }
    }
}
