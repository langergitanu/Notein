package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzKI implements zzH0 {
    private int zzBY;
    private zzC1 zzh;
    private zzKO zzi;

    private zzKI(zzKO zzko, zzC1 zzc1, int i) {
        this.zzi = zzko;
        this.zzh = zzc1;
        this.zzBY = i;
    }

    public static zzH0 zzP(zzKO zzko, zzKO zzko2) {
        return zzZ(zzko, zzko2, false);
    }

    public static zzH0 zzQ(zzKO zzko, zzKO zzko2) {
        return zzZ(zzko, zzko2, true);
    }

    private static zzH0 zzZ(zzKO zzko, zzKO zzko2, boolean z) {
        Iterable.class.isAssignableFrom(zzko.getType());
        zzC1 zzc1ZzN = zzC0.zzN(zzko2);
        if (zzc1ZzN == null) {
            return null;
        }
        return new zzKI(zzko, zzc1ZzN, z ? -1 : 1);
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return this.zzh.zzBN().getType();
    }

    @Override // com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return false;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzh.zzBN().zzu();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzh.zzBN().zzv();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class zzw() {
        return this.zzh.zzBN().zzw();
    }

    @Override // com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Iterator it = ((Iterable) this.zzi.zzx()).iterator();
        Object obj = null;
        while (it.hasNext()) {
            this.zzh.zzBM()[0].setValue(it.next());
            Object objZzx = this.zzh.zzBN().zzx();
            if (objZzx != null && (obj == null || Integer.signum(((Comparable) objZzx).compareTo(obj)) == this.zzBY)) {
                obj = objZzx;
            }
        }
        this.zzh.zzBM()[0].zzFi();
        if (obj != null || this.zzh.zzBN().zznr()) {
            return obj;
        }
        throw new IllegalStateException(zzZKN.format("Can not determine a minimum or maximum value for an empty sequence of type '{0}'.", this.zzh.zzBN().getType()));
    }
}
