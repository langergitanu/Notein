package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYS {
    private zzZ6T zzZDt;

    public abstract void zzYU(boolean z);

    public void zzZ(zzY9C zzy9c) {
    }

    public zzWV zza4() {
        if (zza9() != null) {
            return (zzWV) zza9().zzxY(16);
        }
        return null;
    }

    public zzYIC zza5() {
        if (zza9() != null) {
            return (zzYIC) zza9().zzxY(8);
        }
        return null;
    }

    public zzY6N zza6() {
        if (zza9() != null) {
            return (zzY6N) zza9().zzxY(4);
        }
        return null;
    }

    public final zzZ3A zza7() {
        return (zzZ3A) zzab().zzZp0().zzYTt();
    }

    public zzZ6R zza8() {
        return zzab().zza8();
    }

    public zzZ6T zza9() {
        return this.zzZDt;
    }

    public zzY9C zzaa() {
        return null;
    }

    public zzZYW zzab() {
        if (zzaa() == null) {
            return null;
        }
        return zzaa().zzab();
    }

    public abstract boolean zzac();

    public void zzZ(Object obj, zzYZC zzyzc) {
        if (zza9() != null) {
            zza9().zzZ(obj, zzyzc);
        }
    }

    public void zzZ(zzYZC zzyzc) throws Exception {
        throw new UnsupportedOperationException("Async message not handled.");
    }

    public void zzZ(zzZ6T zzz6t) {
        this.zzZDt = zzz6t;
    }

    public void zzZ(zzZ6R zzz6r) {
        zzab().zzZ(zzz6r);
    }

    public static void zzZ(zzYS zzys, int i) throws Exception {
        if (zzys == null || zzys.zzab() == null) {
            return;
        }
        zzys.zzab().zzY(zzys, i);
    }
}
