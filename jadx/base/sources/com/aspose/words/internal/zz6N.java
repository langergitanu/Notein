package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz6N extends zzKO implements zzFZ {
    private String mName;
    private boolean zzlK;
    private boolean zzlL;
    private zzZVP zzlM;
    private zzZVP zzlN;
    private Object zzth;

    private zz6N(String str, Class cls, zzZVP zzzvp, zzZVP zzzvp2) {
        this(str, cls, zzzvp, zzzvp2, false);
    }

    public static zz6N zzX(Class cls, String str) {
        return new zz6N(str, cls, null, null);
    }

    public static zz6N zzY(zzKO zzko, String str) {
        return new zz6N(str, zzko.getType(), zzko, null, zzko.zzSj());
    }

    public static zz6N zzZ(zzKO zzko, Class cls, String str, zzGY zzgy, boolean z) {
        if (zzko.zzSj() || (zzko.zzs() && zzgy.zzIH())) {
            return new zz6N(str, Object.class, null, null, true);
        }
        zzZVP zzzvpZzP = zzKK.zzP(zzko);
        if (zzzvpZzP == null) {
            zzZVP zzzvpZzV = zzKK.zzV(zzko, z);
            if (!Iterable.class.isAssignableFrom(zzzvpZzV.getType())) {
                throw new zzCX(zzZKN.format("Can not iterate over an instance of type '{0}'.", zzzvpZzV.getType()));
            }
            zzzvpZzP = zzRE.zzZ(zzzvpZzV, zzgy);
        }
        if (cls == null) {
            return zzZ(zzzvpZzP, str);
        }
        if (cls == zzzvpZzP.getType()) {
            zzzvpZzP = null;
        }
        zz6N zz6n = new zz6N(str, cls, null, zzzvpZzP);
        if (zzzvpZzP == null || zzSC.zzY(zzzvpZzP, zz6n)) {
            return zz6n;
        }
        throw new zzCX(zzZKN.format("An explicit predefined conversion from type '{0}' to type '{1}' does not exist.", zzzvpZzP.getType(), zz6n.getType()));
    }

    @Override // com.aspose.words.internal.zzFZ
    public final String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.internal.zzFZ
    public final void setValue(Object obj) {
        if (this.zzlL && obj != null) {
            throw new IllegalStateException();
        }
        zzZVP zzzvp = this.zzlM;
        if (zzzvp != null) {
            obj = zzKK.zzZ(obj, zzzvp, this);
        }
        this.zzth = obj;
        this.zzlK = true;
    }

    @Override // com.aspose.words.internal.zzFZ
    public final void zzFi() {
        this.zzth = null;
        this.zzlK = false;
    }

    @Override // com.aspose.words.internal.zzKO
    public final String zzN5() {
        return this.mName;
    }

    @Override // com.aspose.words.internal.zzKO
    public final boolean zzSj() {
        return this.zzlL;
    }

    @Override // com.aspose.words.internal.zzZVP
    public final Object zzTT() {
        if (this.zzlL) {
            return null;
        }
        return super.zzTT();
    }

    @Override // com.aspose.words.internal.zzZVP
    public final boolean zzTU() {
        return this.zzlL;
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return this.zzlL;
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzu() {
        zzZVP zzzvp = this.zzlN;
        if (zzzvp != null) {
            return zzzvp.zzu();
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzv() {
        zzZVP zzzvp = this.zzlN;
        if (zzzvp != null) {
            return zzzvp.zzv();
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() {
        if (this.zzlK) {
            return this.zzth;
        }
        throw new IllegalStateException(zzZKN.format("Can not get the value of variable '{0}' before it is set.", this.mName));
    }

    private zz6N(String str, Class cls, zzZVP zzzvp, zzZVP zzzvp2, boolean z) {
        super(cls);
        this.mName = str;
        this.zzlN = zzzvp;
        this.zzlM = zzzvp2;
        this.zzlL = z;
    }

    public static zz6N zzZ(zzZVP zzzvp, String str) {
        return new zz6N(str, zzzvp.getType(), zzzvp, null);
    }

    public static zz6N zzZ(Class cls, Object obj, String str) {
        if (obj != null) {
            return zzZ(zzZVO.zzX(cls, obj, null), str);
        }
        return zzX(cls, str);
    }
}
