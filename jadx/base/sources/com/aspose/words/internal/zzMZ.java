package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzMZ implements zzG8 {
    private boolean zzDX;
    private zzM2 zzFI;

    private zzMZ(zz8T zz8t) {
        this.zzFI = new zzM2(zz8t, this);
    }

    public static boolean zzZ(zz8T zz8t) throws Exception {
        zzMZ zzmz = new zzMZ(zz8t);
        zzmz.zzFI.play();
        return zzmz.zzDX;
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        if (this.zzFI.zzJA().getType() == 95) {
            zz8U zz8u = new zz8U(true);
            zz8u.zzS(this.zzFI.zzJz());
            if (zz8u.zzz3()) {
                this.zzDX = true;
            }
        }
        return true;
    }
}
