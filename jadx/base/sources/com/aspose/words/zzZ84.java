package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ84 implements zzZBI {
    private zzYMX zzYis;
    private zzYMX zzYit;

    public zzZ84(zzYMX zzymx, zzYMX zzymx2) {
        this.zzYit = zzymx;
        this.zzYis = zzymx2;
    }

    @Override // com.aspose.words.zzZBI
    public final void zzZ(zzZS zzzs, int i, Object obj) {
        if (zzzs.zzVE(i)) {
            return;
        }
        if (i == 1160 && !this.zzYit.zzVE(i)) {
            if (((Integer) this.zzYis.zzPj(1160)).intValue() == 720) {
                zzzs.remove(i);
                return;
            }
            obj = 720;
        }
        zzzs.set(i, obj);
    }
}
