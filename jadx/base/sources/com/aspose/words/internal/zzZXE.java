package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZXE extends zzZXD {
    private boolean zz9U;

    public zzZXE(zzZXH zzzxh, float f, boolean z, boolean z2, boolean z3) {
        super(zzzxh, f, z, z2, z3);
        this.zz9U = zzZYD.zzi(zzp8().zzPh(), "Courier New");
    }

    @Override // com.aspose.words.internal.zzZXD
    public final float zzV(int i, float f) {
        if (this.zz9U && zzS7.zzYv(i)) {
            return 0.0f;
        }
        int iZzSF = zzp8().zzSF(i);
        return zzp7() ? zzZXD.zzZ(iZzSF, zzp8().zzpO(), f) : zzp8().zzJ(iZzSF, f);
    }
}
