package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz7R extends zzKO {
    private zzZVP zzo5;
    private zzKO[] zzo6;

    private zz7R(Class cls, zzZVP zzzvp, zzKO[] zzkoArr) {
        super(cls);
        this.zzo6 = zzkoArr;
        this.zzo5 = zzzvp;
    }

    public static zz7R zzY(Class cls, zzKO[] zzkoArr) {
        cls.isArray();
        Class<?> componentType = cls.getComponentType();
        zzZVP zzzvp = new zzZVP(componentType);
        for (zzKO zzko : zzkoArr) {
            if (!zzSC.zzW(zzko, zzzvp)) {
                throw new zzCX(zzZKN.format("Cannot create an array. Cannot implicitly convert type '{1}' to '{0}'.", componentType, zzko.getType()));
            }
        }
        return new zz7R(cls, zzzvp, zzkoArr);
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Object objZzY = zzZZO.zzY(this.zzo5.getType(), this.zzo6.length);
        int i = 0;
        while (true) {
            zzKO[] zzkoArr = this.zzo6;
            if (i >= zzkoArr.length) {
                return objZzY;
            }
            zzZZO.zzZ(objZzY, i, zzkoArr[i].zzZ(this.zzo5));
            i++;
        }
    }
}
