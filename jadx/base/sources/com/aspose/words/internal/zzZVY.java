package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVY extends zzKO {
    private zzKO zz81;
    private int zzVV;
    private int zzW0;
    private boolean zzW1;
    private zzAD zzW2;

    private zzZVY(int i, zzKO zzko, Class cls, zzAD zzad, boolean z) {
        this(i, zzko, cls, zzad, z, 0);
    }

    private Object zz9(Object obj) {
        int i = this.zzVV;
        if (i == 9) {
            return Integer.valueOf(-zz7F.zzT(obj, this.zz81.zznw()));
        }
        if (i == 11) {
            return Long.valueOf(-zz7F.zzS(obj, this.zz81.zznw()));
        }
        if (i == 13) {
            return Float.valueOf(-zz7F.zzR(obj, this.zz81.zznw()));
        }
        if (i == 14) {
            return Double.valueOf(-zz7F.zzQ(obj, this.zz81.zznw()));
        }
        throw new IllegalStateException();
    }

    private static zzZVY zzJ(zzKO zzko) {
        if (zzko.zzno()) {
            return new zzZVY(24, zzko, zzko.getType(), null, zzko.zznv());
        }
        return null;
    }

    public static zzZVY zzS(zzKO zzko, zzGY zzgy) {
        return zzZ(22, zzko, zzgy);
    }

    private static int zzS8(int i) {
        if (!zz7F.zzUj(i)) {
            return 0;
        }
        if (!zz7F.zzUk(i)) {
            return i;
        }
        if (zzSC.zzs(i, 9)) {
            return 9;
        }
        return zzSC.zzs(i, 11) ? 11 : 0;
    }

    private static int zzS9(int i) {
        if (!zz7F.zzUk(i)) {
            return 0;
        }
        if (zzSC.zzs(i, 9)) {
            return 9;
        }
        return i;
    }

    public static zzZVY zzT(zzKO zzko, zzGY zzgy) {
        return zzZ(4, zzko, zzgy);
    }

    public static zzZVY zzU(zzKO zzko, zzGY zzgy) {
        return zzZ(24, zzko, zzgy);
    }

    public static zzZVY zzY(zzKO zzko, Class cls, zzGY zzgy) {
        zzZVP zzzvp = new zzZVP(cls);
        if (zzSC.zzY(zzko, zzzvp)) {
            return new zzZVY(7, zzko, cls, null, false);
        }
        zzAD zzadZzZ = zzRE.zzZ(zzko, zzzvp, zzgy);
        if (zzadZzZ != null) {
            return new zzZVY(7, zzko, cls, zzadZzZ, zzadZzZ.zzAD() && zzko.zznl());
        }
        throw new zzCX(zzZKN.format("Can not cast an expression of type '{0}' to type '{1}'.", zzko.getType(), cls));
    }

    private static zzZVY zzZ(int i, zzKO zzko, zzGY zzgy) {
        zzAD zzadZzZ;
        zzZVY zzzvyZzJ = i == 24 ? zzJ(zzko) : zzY(i, zzko);
        if (zzzvyZzJ != null) {
            return zzzvyZzJ;
        }
        if (zzko.zznm() || (zzadZzZ = zzRE.zzZ(zzKK.zzX0(i), zzko, zzgy)) == null) {
            throw new zzCX(zzZKN.format("Can not apply operator '{0}' to operand of type '{1}'.", zzKK.zzWZ(i), zzko.getType()));
        }
        boolean z = zzadZzZ.zzAD() && zzko.zznl();
        Class type = zzadZzZ.zzAF().getType();
        if (z) {
            type = zzZZO.zzA(type);
        }
        return new zzZVY(i, zzko, type, zzadZzZ, z);
    }

    private static int zzZr(int i, int i2) {
        if (i == 4) {
            return zzS9(i2);
        }
        if (i == 22) {
            return zzS8(i2);
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: expressionType");
    }

    private Object zza(Object obj) {
        int i = this.zzVV;
        if (i == 9) {
            return Integer.valueOf(~zz7F.zzT(obj, this.zz81.zznw()));
        }
        if (i == 11) {
            return Long.valueOf(~zz7F.zzS(obj, this.zz81.zznw()));
        }
        throw new IllegalStateException();
    }

    private Object zzb(Object obj) {
        Object objZza = zza(obj);
        if (!zzns()) {
            return objZza;
        }
        zzw();
        return zzZZO.zzrN();
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Object objZzx = this.zz81.zzx();
        if (this.zzW1 && objZzx == null) {
            return null;
        }
        zzAD zzad = this.zzW2;
        if (zzad != null) {
            Object objZzH = this.zzW2.zzH(null, zzKK.zzZ(objZzx, this.zz81, zzad.zzAE()[0]));
            return this.zzW0 == 7 ? zzKK.zzZ(objZzH, this.zzW2.zzAF(), this) : objZzH;
        }
        int i = this.zzW0;
        if (i == 4) {
            return zzb(objZzx);
        }
        if (i == 7) {
            return zzKK.zzZ(objZzx, this.zz81, this);
        }
        if (i == 22) {
            return zz9(objZzx);
        }
        if (i == 24) {
            return Boolean.valueOf(!((Boolean) objZzx).booleanValue());
        }
        throw new IllegalStateException();
    }

    private zzZVY(int i, zzKO zzko, Class cls, zzAD zzad, boolean z, int i2) {
        super(cls);
        this.zz81 = zzko;
        this.zzW2 = zzad;
        this.zzW1 = z;
        this.zzW0 = i;
        this.zzVV = i2;
    }

    private static zzZVY zzY(int i, zzKO zzko) {
        int iZzZr;
        if ((zzko.zzns() && i != 4) || (iZzZr = zzZr(i, zzko.zznw())) == 0) {
            return null;
        }
        Class type = zzko.getType();
        if (!zzko.zzns() && iZzZr != zzko.zznw()) {
            type = zz7F.zzYY(iZzZr);
            if (zzko.zznv()) {
                type = zzZZO.zzA(type);
            }
        }
        return new zzZVY(i, zzko, type, null, zzko.zznv(), iZzZr);
    }
}
