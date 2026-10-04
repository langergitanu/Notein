package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzSE implements zzH0 {
    private zzKO zzPj;
    private zzKO zzi;

    private zzSE(zzKO zzko, zzKO zzko2) {
        this.zzi = zzko;
        this.zzPj = zzko2;
    }

    public static zzH0 zzR(zzKO zzko, zzKO zzko2) {
        Iterable.class.isAssignableFrom(zzko.getType());
        return new zzSE(zzko, zzko2);
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
        Object objZzx = this.zzPj.zzx();
        Iterator it = ((Iterable) this.zzi.zzx()).iterator();
        while (it.hasNext()) {
            if (zzZKO.equals(it.next(), objZzx)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
