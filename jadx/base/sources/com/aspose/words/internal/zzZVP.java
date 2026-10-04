package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzZVP implements zzF6 {
    private int zz7E;
    private int zz7F;
    private Class zz7G;
    private Class zz8a;

    public zzZVP(Class cls) {
        this.zz8a = cls;
        Class clsZzz = zzZZO.zzz(cls);
        this.zz7G = clsZzz;
        this.zz7F = zzZKM.zzr(clsZzz);
        this.zz7E = zzW(this.zz8a, this.zz7G);
    }

    private static int zzW(Class cls, Class cls2) {
        int i = cls != cls2 ? 1 : 0;
        if (zzZZO.zzE(cls)) {
            i |= 2;
        }
        zzZZO.zzrO();
        return i;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return this.zz8a;
    }

    public boolean zzRC() {
        return false;
    }

    public Object zzTT() {
        throw new UnsupportedOperationException();
    }

    public boolean zzTU() {
        return false;
    }

    public final boolean zznl() {
        return zznv() || zzs();
    }

    public final boolean zznm() {
        return zznp() || zzno() || zzns() || zz7F.zzUj(this.zz7F);
    }

    public final boolean zznn() {
        return zz7F.zzUj(this.zz7F);
    }

    public final boolean zzno() {
        return this.zz7F == 3;
    }

    public final boolean zznp() {
        return this.zz7F == 18;
    }

    public final boolean zznq() {
        return zznt() && !zznv();
    }

    public final boolean zznr() {
        return !zznt() || zznv();
    }

    public final boolean zzns() {
        return (this.zz7E & 4) != 0;
    }

    public final boolean zznt() {
        return (this.zz7E & 2) != 0;
    }

    public final boolean zznu() {
        return zznt() && zznv();
    }

    public final boolean zznv() {
        return (this.zz7E & 1) != 0;
    }

    public final int zznw() {
        return this.zz7F;
    }

    @Override // com.aspose.words.internal.zzF6
    public boolean zzs() {
        return false;
    }

    @Override // com.aspose.words.internal.zzF6
    public Object zzu() {
        return null;
    }

    @Override // com.aspose.words.internal.zzF6
    public Object zzv() {
        return null;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class zzw() {
        return this.zz7G;
    }
}
