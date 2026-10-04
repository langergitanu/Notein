package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSI extends zzKO {
    private zzZVP zzOt;
    private zzKO zzOu;
    private zzKO zzOv;
    private zzKO zzOw;
    private zzAD zzVX;

    private zzSI(zzKO zzko, zzKO zzko2, zzKO zzko3, zzAD zzad, zzZVP zzzvp) {
        super(zzzvp.getType());
        this.zzOw = zzko;
        this.zzOv = zzko2;
        this.zzOu = zzko3;
        this.zzVX = zzad;
        this.zzOt = zzzvp;
    }

    private static zzZVP zzS(zzKO zzko, zzKO zzko2) {
        if (zzko.zzs() && zzko2.zzs()) {
            return null;
        }
        if (zzko.zzs()) {
            if (zzko2.zznr()) {
                return zzko2;
            }
            return null;
        }
        if (zzko2.zzs()) {
            if (!zzko.zznr()) {
                return null;
            }
        } else {
            if (zzSC.zzW(zzko, zzko2)) {
                return zzko2;
            }
            if (!zzSC.zzW(zzko2, zzko)) {
                return null;
            }
        }
        return zzko;
    }

    private static zzSI zzX(zzKO zzko, zzKO zzko2, zzKO zzko3, zzGY zzgy) {
        zzAD zzad;
        if (zzko.zzIN()) {
            zzad = null;
        } else {
            zzAD zzadZzZ = zzKK.zzZ(5, zzko, zzgy);
            if (zzadZzZ == null) {
                return null;
            }
            zzad = zzadZzZ;
        }
        zzZVP zzzvpZzS = zzS(zzko2, zzko3);
        if (zzzvpZzS == null) {
            return null;
        }
        return new zzSI(zzko, zzko2, zzko3, zzad, zzzvpZzS);
    }

    public static zzSI zzY(zzKO zzko, zzKO zzko2, zzKO zzko3, zzGY zzgy) {
        zzSI zzsiZzX = zzX(zzko, zzko2, zzko3, zzgy);
        if (zzsiZzX != null) {
            return zzsiZzX;
        }
        throw new zzCX(zzZKN.format("Can not apply operator '{0}' to operands of type '{1}', '{2}', and '{3}'.", zzKK.zzWZ(5), zzko.getType(), zzko2.getType(), zzko3.getType()));
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzOt.zzu();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzOt.zzv();
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Object objZzx = this.zzOw.zzx();
        zzAD zzad = this.zzVX;
        if (zzad != null) {
            objZzx = zzad.zzH(null, objZzx);
        }
        return (((Boolean) objZzx).booleanValue() ? this.zzOv : this.zzOu).zzZ(this);
    }
}
