package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSF extends zzKO {
    static zzSF zzOn = new zzSF(Object.class, null);
    private Object zzOo;

    private zzSF(Class cls, Object obj) {
        super(cls);
        this.zzOo = obj;
    }

    public static zzSF zzM(Object obj) {
        return new zzSF(zzZZO.zzz(obj.getClass()), obj);
    }

    @Override // com.aspose.words.internal.zzZVP
    public final boolean zzRC() {
        Object obj;
        return (!zznn() || zzns() || zznw() == 4 || (obj = this.zzOo) == null || zz7F.zzQ(obj, zznw()) != 0.0d) ? false : true;
    }

    @Override // com.aspose.words.internal.zzKO
    public final zzC1 zzRD() {
        if (getType() != zzC1.class) {
            return null;
        }
        return (zzC1) this.zzOo;
    }

    @Override // com.aspose.words.internal.zzZVP
    public final Object zzTT() {
        return this.zzOo;
    }

    @Override // com.aspose.words.internal.zzZVP
    public final boolean zzTU() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return this.zzOo == null;
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() {
        return this.zzOo;
    }
}
