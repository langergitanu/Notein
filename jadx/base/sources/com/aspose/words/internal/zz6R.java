package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6R {
    private Object zzm9;
    private Object zzma;

    public zz6R(Object obj, Object obj2) {
        this.zzma = obj;
        this.zzm9 = obj2;
    }

    private boolean zzZ(zz6R zz6r) {
        return zz6r != null && zzZKO.zzA(this.zzma, zz6r.zzma) && zzZKO.zzA(this.zzm9, zz6r.zzm9);
    }

    public final boolean equals(Object obj) {
        zz6R zz6r;
        if (obj == null || (zz6r = (zz6R) zzZKW.zzZ(obj, zz6R.class)) == null) {
            return false;
        }
        return zzZ(zz6r);
    }

    public final Object getFirst() {
        return this.zzma;
    }

    public final int hashCode() {
        return this.zzma.hashCode() ^ this.zzm9.hashCode();
    }

    public final Object zzwW() {
        return this.zzm9;
    }
}
