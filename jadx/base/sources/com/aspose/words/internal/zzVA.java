package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzVA extends zzWE {
    public static zzVA zzSA = new zzVA();

    @Override // com.aspose.words.internal.zzWE, com.aspose.words.internal.zzWG
    public final void zzZ(zzWH zzwh) {
        int intValue = zzwh.zzUH().getIntValue();
        int intValue2 = zzwh.zzUH().getIntValue();
        if (intValue2 < 0 || intValue2 > zzwh.zzUO()) {
            return;
        }
        zzWF[] zzwfArr = new zzWF[intValue2];
        for (int i = 0; i < intValue2; i++) {
            zzwfArr[i] = zzwh.zzUH();
        }
        int i2 = intValue - 1;
        for (int i3 = 0; i3 < intValue2; i3++) {
            zzwh.zzZ(zzwfArr[i2 % intValue2]);
            i2 += intValue > 0 ? 1 : -1;
        }
    }
}
