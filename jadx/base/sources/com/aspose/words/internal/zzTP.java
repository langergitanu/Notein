package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzTP implements zzH0 {
    private boolean zzRk;
    private zzC1 zzRl;
    private zzKO zzi;

    private zzTP(zzKO zzko, zzC1 zzc1, boolean z) {
        this.zzi = zzko;
        this.zzRl = zzc1;
        this.zzRk = z;
    }

    public static zzH0 zzQ(zzKO zzko) {
        return zzZ(zzko, null, false);
    }

    public static zzH0 zzT(zzKO zzko, zzKO zzko2) {
        return zzZ(zzko, zzko2, false);
    }

    public static zzH0 zzU(zzKO zzko, zzKO zzko2) {
        return zzZ(zzko, zzko2, true);
    }

    private static zzH0 zzZ(zzKO zzko, zzKO zzko2, boolean z) {
        Iterable.class.isAssignableFrom(zzko.getType());
        zzC1 zzc1 = null;
        if (zzko2 != null) {
            zzC1 zzc1ZzO = zzC0.zzO(zzko2);
            if (zzc1ZzO == null) {
                return null;
            }
            zzc1 = zzc1ZzO;
        }
        return new zzTP(zzko, zzc1, z);
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return Boolean.TYPE;
    }

    @Override // com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return false;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzu() {
        return null;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzv() {
        return null;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class zzw() {
        return Boolean.TYPE;
    }

    @Override // com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        boolean z = this.zzRk;
        Iterator it = ((Iterable) this.zzi.zzx()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            zzC1 zzc1 = this.zzRl;
            if (zzc1 == null) {
                return Boolean.TRUE;
            }
            zzc1.zzBM()[0].setValue(next);
            if (((Boolean) this.zzRl.zzBN().zzx()).booleanValue() != z) {
                z = !z;
                break;
            }
        }
        zzC1 zzc12 = this.zzRl;
        if (zzc12 != null) {
            zzc12.zzBM()[0].zzFi();
        }
        return Boolean.valueOf(z);
    }
}
