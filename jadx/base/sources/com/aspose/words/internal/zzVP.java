package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzVP extends zzWE {
    public static zzVP zzSQ = new zzVP();

    @Override // com.aspose.words.internal.zzWE, com.aspose.words.internal.zzWG
    public final void zzZ(zzWH zzwh) {
        int intValue = zzwh.zzUH().getIntValue();
        if (intValue < 0) {
            intValue = 0;
        }
        if (intValue >= zzwh.zzUO()) {
            return;
        }
        int i = intValue + 1;
        zzWF[] zzwfArr = new zzWF[i];
        for (int i2 = 0; i2 < i; i2++) {
            zzwfArr[i2] = zzwh.zzUH();
        }
        for (int i3 = intValue; i3 >= 0; i3--) {
            zzwh.zzZ(zzwfArr[i3]);
        }
        zzwh.zzZ(zzwfArr[intValue]);
    }
}
