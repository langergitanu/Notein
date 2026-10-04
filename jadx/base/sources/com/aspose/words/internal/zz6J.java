package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6J {
    private static boolean zzL(zzZG zzzg) {
        if (zzzg.zzZ2() == null || zzzg.zzZ2().getAlignment() == 1 || !zzJ6.zzT(zzzg.zzZ2().zzNG())) {
            return false;
        }
        return (zzzg.zzZ2().getDashStyle() == 2 && zzzg.zzZ2().zzNJ() == 2) ? false : true;
    }

    public static zzYR zzZ(zzZG zzzg, zz6I zz6i) {
        if (zzzg.zzZ2() != null && !zz6i.zzwQ()) {
            if (zzL(zzzg)) {
                return new zzSM(zzzg, zz6i);
            }
            if (zzzg.zzZ2().getDashStyle() != 0) {
                return new zzRF(zzzg, zz6i);
            }
        }
        return new zzZYW(zzzg, zz6i);
    }
}
