package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9M implements com.aspose.words.internal.zzH2 {
    private com.aspose.words.internal.zzP9 zzXbb;
    private float zzXbc;

    private zzY9M(float f, com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzXbc = C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.getX());
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        this.zzXbb = zzp9;
        zzp9.zzY(f - zzzq4.getWidth(), 0.0f, 1);
    }

    private long zzR(long j) {
        return Float.intBitsToFloat((int) j) > this.zzXbc ? this.zzXbb.zzR(j) : j;
    }

    public static void zzW(com.aspose.words.internal.zzZG zzzg, float f) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzzg);
        if (com.aspose.words.internal.zzAN.zzP(zzzq4ZzZ.getWidth(), f)) {
            return;
        }
        zzzg.zzZ0().zzY(new zzY9M(f, zzzq4ZzZ));
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(com.aspose.words.internal.zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzPZ zzpz) {
        zzpz.zzy(zzR(zzpz.zzPX()));
        zzpz.zzx(zzR(zzpz.zzPL()));
        zzpz.zzw(zzR(zzpz.zzPK()));
        zzpz.zzv(zzR(zzpz.zzPW()));
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzOS zzos) {
        for (int i = 0; i < zzos.zzNu().getCount(); i++) {
            zzos.zzNu().set(i, zzR(zzos.zzNu().get(i)));
        }
        return true;
    }
}
