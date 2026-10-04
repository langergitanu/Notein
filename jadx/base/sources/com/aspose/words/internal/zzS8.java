package com.aspose.words.internal;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
final class zzS8 implements zzH0 {
    private zzC1 zzRl;
    private zzKO zzi;

    private zzS8(zzKO zzko, zzC1 zzc1) {
        this.zzi = zzko;
        this.zzRl = zzc1;
    }

    public static zzH0 zzR(zzKO zzko, zzKO zzko2) {
        Iterable.class.isAssignableFrom(zzko.getType());
        zzC1 zzc1 = null;
        if (zzko2 != null) {
            zzC1 zzc1ZzO = zzC0.zzO(zzko2);
            if (zzc1ZzO == null) {
                return null;
            }
            zzc1 = zzc1ZzO;
        }
        return new zzS8(zzko, zzc1);
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return Integer.TYPE;
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
        return Integer.TYPE;
    }

    @Override // com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Collection collection;
        Iterable iterable = (Iterable) this.zzi.zzx();
        if (this.zzRl == null && (collection = (Collection) zzZKW.zzZ(iterable, Collection.class)) != null) {
            return Integer.valueOf(collection.size());
        }
        int i = 0;
        for (Object obj : iterable) {
            zzC1 zzc1 = this.zzRl;
            if (zzc1 != null) {
                zzc1.zzBM()[0].setValue(obj);
                if (((Boolean) this.zzRl.zzBN().zzx()).booleanValue()) {
                }
            }
            i++;
        }
        zzC1 zzc12 = this.zzRl;
        if (zzc12 != null) {
            zzc12.zzBM()[0].zzFi();
        }
        return Integer.valueOf(i);
    }
}
