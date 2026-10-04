package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzJ3 {
    public static zzJ3 zzZ(zzJ6 zzj6, zz8X zz8x) {
        return !"conn".equals(zz8x.getType()) ? new zzJ0(zz8x) : zzj6.zzZRS() ? new zzJ2(zzj6) : new zzJ1();
    }

    public abstract void zzZ(zz2O zz2o);

    public abstract boolean zzZRS();
}
