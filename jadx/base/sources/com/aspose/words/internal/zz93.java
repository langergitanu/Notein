package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz93 extends zz94 {
    @Override // com.aspose.words.internal.zz94
    public final zzPA zzZ(long j, long j2, zzPV zzpv, zzPV zzpv2) {
        zzZQ4 zzzq4ZzX = zzZQ4.zzX(Float.intBitsToFloat((int) j), zzZPY.zzYC(j), Float.intBitsToFloat((int) j2), zzZPY.zzYC(j2));
        zzPV zzpv3 = zzzq4ZzX.getWidth() > 0.0f ? zzpv : zzpv2;
        if (zzzq4ZzX.getWidth() > 0.0f) {
            zzpv = zzpv2;
        }
        return new zzPA(zzAN.zzv(zzzq4ZzX), zzpv3, zzpv);
    }

    @Override // com.aspose.words.internal.zz94
    public final zzP9 zzp(zzZQ4 zzzq4) {
        return new zzP9();
    }
}
