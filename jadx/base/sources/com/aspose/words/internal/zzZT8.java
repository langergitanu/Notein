package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZT8 extends zzZT7 {
    private byte[] zz6O;

    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        int iZzXa = zzmY().zzXa() & 65535;
        this.zz6O = zzmY().zzn(iZzXa);
        if (zzAN.zzZP(iZzXa)) {
            zzmY().zzX6();
        }
        zzY(zzmY().zzN1());
    }

    @Override // com.aspose.words.internal.zzZT7
    public final zz8N zzZ(zzPM zzpm, zz9O zz9o, float f, zzGQ zzgq, zzF8 zzf8) throws Exception {
        return zz8L.zzZ(zz9o.zzZn(this.zz6O), false, false, null, f, zzpm, zzgq, zzf8);
    }
}
