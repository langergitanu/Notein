package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz92 extends zz94 {
    @Override // com.aspose.words.internal.zz94
    public final zzPA zzZ(long j, long j2, zzPV zzpv, zzPV zzpv2) {
        zzZQ4 zzzq4ZzX = zzZQ4.zzX(Float.intBitsToFloat((int) j), zzZPY.zzYC(j), Float.intBitsToFloat((int) j2), zzZPY.zzYC(j2));
        zzPV zzpv3 = zzzq4ZzX.getHeight() > 0.0f ? zzpv : zzpv2;
        if (zzzq4ZzX.getHeight() > 0.0f) {
            zzpv = zzpv2;
        }
        return new zzPA(zzAN.zzv(zzzq4ZzX), zzpv3, zzpv);
    }

    @Override // com.aspose.words.internal.zz94
    public final zzP9 zzp(zzZQ4 zzzq4) {
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(-Float.intBitsToFloat((int) zzzq4.zzZE()), -zzZPY.zzYC(zzzq4.zzZE()), 1);
        zzp9.zzX(90.0f, 1);
        zzp9.zzY(zzzq4.getHeight(), 0.0f, 1);
        zzp9.zzZ(zzzq4.getWidth() / zzzq4.getHeight(), zzzq4.getHeight() / zzzq4.getWidth(), 1);
        zzp9.zzY(Float.intBitsToFloat((int) zzzq4.zzZE()), zzZPY.zzYC(zzzq4.zzZE()), 1);
        return zzp9;
    }
}
