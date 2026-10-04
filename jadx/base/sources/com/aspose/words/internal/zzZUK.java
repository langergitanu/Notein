package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZUK extends zzZUL {
    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        zzZh(zzZUL.zzZp(getDataSize(), 2368));
        zzUF(zzmY().zzXc());
        int iZzXa = zzmY().zzXa() & 65535;
        int iZzXa2 = 65535 & zzmY().zzXa();
        if (!zzJM()) {
            zzmY().zzXa();
        }
        zzT(zzmY().zzmZ());
        zzS(new zzZQ5(iZzXa2, iZzXa, zzJN().getWidth(), zzJN().getHeight()));
        zzYU(zzmY().zzq().getPosition());
    }

    @Override // com.aspose.words.internal.zzZUL
    public final boolean zzmU() {
        return false;
    }
}
