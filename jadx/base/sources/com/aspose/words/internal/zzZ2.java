package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2 extends zzKO {
    private zzZVP zzXX;
    private zzKO zzXY;

    private zzZ2(zzKO zzko, zzZVP zzzvp) {
        super(zzzvp.getType());
        this.zzXY = zzko;
        this.zzXX = zzzvp;
    }

    public static zzKO zzZ(zzKO zzko, zzGY zzgy) {
        zzZVP zzzvpZzP;
        return (Iterable.class.isAssignableFrom(zzko.getType()) || (zzzvpZzP = zzKK.zzP(zzko)) == null) ? zzko : new zzZ2(zzko, zzRE.zzY(zzzvpZzP, zzgy));
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzXX.zzu();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzXX.zzv();
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        return zzZZO.zzg(this.zzXY.zzx());
    }
}
