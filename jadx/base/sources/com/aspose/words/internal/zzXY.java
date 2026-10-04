package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzXY extends zzKO {
    private int zzVV;
    private int zzVW;
    private zzAD zzVX;
    private Object zzVY;
    private Object zzVZ;
    private int zzW0;
    private boolean zzW1;
    private zzAD zzW2;
    private zzKO zzW3;
    private zzKO zzW4;

    private zzXY(Class cls, Object obj, Object obj2, zzKO zzko, zzKO zzko2) {
        this(3, cls, obj, obj2, zzko, zzko2, false, null, null, 0, 0);
    }

    public static zzXY zzF(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 3, zzgy);
    }

    public static zzXY zzG(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 16, zzgy);
    }

    public static zzXY zzH(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 15, zzgy);
    }

    public static zzXY zzI(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 13, zzgy);
    }

    public static zzXY zzJ(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 12, zzgy);
    }

    public static zzXY zzK(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 25, zzgy);
    }

    public static zzXY zzL(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 10, zzgy);
    }

    public static zzXY zzM(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 27, zzgy);
    }

    public static zzXY zzN(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 2, zzgy);
    }

    public static zzXY zzO(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 29, zzgy);
    }

    public static zzXY zzP(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 14, zzgy);
    }

    public static zzXY zzQ(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 11, zzgy);
    }

    public static zzXY zzR(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 26, zzgy);
    }

    public static zzXY zzS(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 1, zzgy);
    }

    public static zzXY zzT(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 8, zzgy);
    }

    public static zzXY zzU(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 21, zzgy);
    }

    public static zzXY zzV(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 20, zzgy);
    }

    public static zzXY zzW(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 30, zzgy);
    }

    public static zzXY zzX(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, 0, zzgy);
    }

    private Object zzX3() throws Exception {
        Object objZzx = this.zzW4.zzx();
        Object objZzx2 = this.zzW3.zzx();
        if (this.zzW1 && (objZzx == null || objZzx2 == null)) {
            return zzV(objZzx, objZzx2);
        }
        zzAD zzad = this.zzW2;
        if (zzad != null) {
            return this.zzW2.zzZ(null, zzKK.zzZ(objZzx, this.zzW4, zzad.zzAE()[0]), zzKK.zzZ(objZzx2, this.zzW3, this.zzW2.zzAE()[1]));
        }
        int i = this.zzVW;
        if (i == 1) {
            return zzR(objZzx, objZzx2);
        }
        if (i == 2) {
            return zzQ(objZzx, objZzx2);
        }
        if (i == 3) {
            return zzP(objZzx, objZzx2);
        }
        if (i == 4) {
            return zzM(objZzx, objZzx2);
        }
        throw new IllegalStateException();
    }

    private Object zzX4() throws Exception {
        Object objZzZ = zzZ(this.zzW4, 0);
        if (zzT(objZzZ)) {
            return objZzZ;
        }
        Object objZzZ2 = zzZ(this.zzW3, 1);
        zzAD zzad = this.zzW2;
        return zzad != null ? zzad.zzZ(null, objZzZ, objZzZ2) : objZzZ2;
    }

    private Object zzX5() throws Exception {
        zzKO zzko = this.zzW4;
        Object objZzx = zzko.zzx();
        if (objZzx == null) {
            zzko = this.zzW3;
            objZzx = zzko.zzx();
        }
        if (objZzx != null) {
            return zzKK.zzZ(objZzx, zzko, this);
        }
        return null;
    }

    private static zzXY zzY(zzKO zzko, zzKO zzko2, int i, zzGY zzgy) {
        zzAD zzadZzZ;
        zzAD zzad;
        if (((zzko.zznm() || zzko.zzs()) && (zzko2.zznm() || zzko2.zzs())) || (zzadZzZ = zzRE.zzZ(zzKK.zzX0(i), zzko, zzko2, zzgy)) == null) {
            return null;
        }
        Class type = zzadZzZ.zzAF().getType();
        boolean z = false;
        if (zzd(i)) {
            zzAD zzadZzZ2 = zzZ(zzadZzZ, zzko, zzko2, i, zzgy);
            if (zzadZzZ2 == null) {
                return null;
            }
            zzad = zzadZzZ2;
        } else {
            if (zzadZzZ.zzAD() && (zzko.zznl() || zzko2.zznl())) {
                type = zzZ(type, i);
                z = true;
            }
            zzad = null;
        }
        return new zzXY(i, type, null, null, zzko, zzko2, z, zzadZzZ, zzad, 0, 0);
    }

    private static zzXY zzZ(zzKO zzko, zzKO zzko2, int i, zzGY zzgy) {
        zzXY zzxyZzZ;
        if (i != 3) {
            zzxyZzZ = zzY(zzko, zzko2, i, zzgy);
            if (zzxyZzZ == null) {
                zzxyZzZ = zzZ(zzko, zzko2, i);
            }
        } else {
            zzxyZzZ = zzZ(zzko, zzko2);
        }
        if (zzxyZzZ != null) {
            return zzxyZzZ;
        }
        throw new zzCX(zzZKN.format("Can not apply operator '{0}' to operands of type '{1}' and '{2}'.", zzKK.zzWZ(i), zzko.getType(), zzko2.getType()));
    }

    private static boolean zzb(int i) {
        return i == 10 || i == 25;
    }

    private static boolean zzc(int i) {
        switch (i) {
            case 12:
            case 13:
            case 15:
            case 16:
                return true;
            case 14:
            default:
                return zzb(i);
        }
    }

    private static boolean zzd(int i) {
        return i == 2 || i == 27;
    }

    private static boolean zze(int i) {
        return i == 14 || i == 29;
    }

    private static boolean zzf(int i) {
        return i == 1 || i == 11 || i == 26;
    }

    private static boolean zzg(int i) {
        return i == 0 || i == 8 || i == 30 || i == 20 || i == 21;
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzVY;
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzVZ;
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        int i = this.zzW0;
        return i != 3 ? zzd(i) ? zzX4() : zzX3() : zzX5();
    }

    private zzXY(int i, Class cls, Object obj, Object obj2, zzKO zzko, zzKO zzko2, boolean z, zzAD zzad, zzAD zzad2, int i2, int i3) {
        super(cls);
        this.zzW0 = i;
        this.zzW4 = zzko;
        this.zzW3 = zzko2;
        this.zzW1 = z;
        this.zzW2 = zzad;
        this.zzVZ = obj;
        this.zzVY = obj2;
        this.zzVX = zzad2;
        this.zzVW = i2;
        this.zzVV = i3;
    }

    private Object zzM(Object obj, Object obj2) {
        int i = this.zzW0;
        if (i == 10) {
            return Boolean.valueOf(obj == obj2);
        }
        if (i == 25) {
            return Boolean.valueOf(obj != obj2);
        }
        throw new IllegalStateException();
    }

    private Object zzN(Object obj, Object obj2) {
        int i = this.zzVV;
        if (i == 9) {
            return zzP(zz7F.zzT(obj, this.zzW4.zznw()), zz7F.zzT(obj2, this.zzW3.zznw()));
        }
        if (i == 11) {
            return zzY(zz7F.zzS(obj, this.zzW4.zznw()), zz7F.zzS(obj2, this.zzW3.zznw()));
        }
        if (i == 13) {
            return zzZ(zz7F.zzR(obj, this.zzW4.zznw()), zz7F.zzR(obj2, this.zzW3.zznw()));
        }
        if (i == 14) {
            return zzZ(zz7F.zzQ(obj, this.zzW4.zznw()), zz7F.zzQ(obj2, this.zzW3.zznw()));
        }
        throw new IllegalStateException();
    }

    private Object zzO(Object obj, Object obj2) {
        int i = this.zzVV;
        if (i == 9) {
            return zzQ(zz7F.zzT(obj, this.zzW4.zznw()), zz7F.zzT(obj2, this.zzW3.zznw()));
        }
        if (i == 11) {
            return zzY(zz7F.zzS(obj, this.zzW4.zznw()), zz7F.zzT(obj2, this.zzW3.zznw()));
        }
        throw new IllegalStateException();
    }

    private Object zzP(Object obj, Object obj2) {
        Object objZzO = zze(this.zzW0) ? zzO(obj, obj2) : zzN(obj, obj2);
        if (!zzns()) {
            return zznn() ? zz7F.zzY(objZzO, this.zzVV, zznw()) : objZzO;
        }
        zzw();
        return zzZZO.zzrN();
    }

    private Object zzQ(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        int i = this.zzW0;
        if (i == 1) {
            if (zBooleanValue && zBooleanValue2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (i == 10) {
            return Boolean.valueOf(zBooleanValue == zBooleanValue2);
        }
        if (i == 11) {
            return Boolean.valueOf(zBooleanValue ^ zBooleanValue2);
        }
        if (i == 25) {
            return Boolean.valueOf(zBooleanValue != zBooleanValue2);
        }
        if (i == 26) {
            return Boolean.valueOf(zBooleanValue || zBooleanValue2);
        }
        throw new IllegalStateException();
    }

    private static boolean zzR(int i, int i2) {
        if (zzg(i2) || zzc(i2)) {
            return true;
        }
        if (zzf(i2) || zze(i2)) {
            return zz7F.zzUk(i);
        }
        return false;
    }

    private Object zzS(Object obj, Object obj2) {
        int i = this.zzW0;
        if (i == 10) {
            return Boolean.valueOf(obj == null && obj2 == null);
        }
        if (i != 25) {
            return Boolean.FALSE;
        }
        if (obj == null && obj2 == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private boolean zzT(Object obj) throws Exception {
        zzAD zzad = this.zzVX;
        if (zzad != null) {
            return ((Boolean) zzad.zzH(null, obj)).booleanValue();
        }
        int i = this.zzW0;
        if (i == 2) {
            return !((Boolean) obj).booleanValue();
        }
        if (i == 27) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException();
    }

    private static Class zzU(zzKO zzko, zzKO zzko2, int i) {
        if (!zzb(i)) {
            return null;
        }
        boolean zZzs = zzko.zzs();
        Class cls = Boolean.TYPE;
        if (zZzs || zzko2.zzs()) {
            return cls;
        }
        if (zzko.zznt() || zzko2.zznt()) {
            return null;
        }
        return cls;
    }

    private static int zzV(zzKO zzko, zzKO zzko2) {
        int iZznw = zzko.zzns() ? zzko.zznw() : zzko2.zznw();
        if (zzSC.zzs(iZznw, 9)) {
            return 9;
        }
        return iZznw;
    }

    private static Class zzW(zzKO zzko, zzKO zzko2, int i) {
        if (!zzko.zzns() && !zzko2.zzns()) {
            return null;
        }
        if (zzko.zzns() && zzko2.zzns() && zzko.zzw() != zzko2.zzw()) {
            return null;
        }
        if (i != 0) {
            if (i != 30) {
                if (zzX(zzko) && zzX(zzko2)) {
                    if (!zzf(i)) {
                        if (zzc(i)) {
                            return Boolean.TYPE;
                        }
                    }
                }
                return null;
            }
            if (zzko.zzns() && zzko2.zzns()) {
                return zz7F.zzYY(zzko.zznw());
            }
            if (!zzX(zzko, zzko2)) {
                return null;
            }
        } else if ((zzko.zzns() && zzko2.zzns()) || !zzX(zzko, zzko2)) {
            return null;
        }
        return zzko.zzns() ? zzko.getType() : zzko2.getType();
    }

    private static Class zzX(zzKO zzko, zzKO zzko2, int i) {
        if (!zzko.zzno() && !zzko2.zzno()) {
            return null;
        }
        boolean zZzd = zzd(i);
        Class cls = Boolean.TYPE;
        if (zZzd && zzko.zzIN() && zzko2.zzIN()) {
            return cls;
        }
        if ((zzf(i) || zzb(i)) && zzY(zzko) && zzY(zzko2)) {
            return cls;
        }
        return null;
    }

    private static int zzV(zzKO zzko, zzKO zzko2, int i) {
        if (zzko.zzns() || zzko2.zzns() || !(zzko.zznn() || zzko2.zznn())) {
            return 0;
        }
        if (zzko.zzs()) {
            if (zzko2.zznn()) {
                return zzko2.zznw();
            }
            return 0;
        }
        if (zzko2.zzs()) {
            if (zzko.zznn()) {
                return zzko.zznw();
            }
            return 0;
        }
        if (zzko.zznn() && zzko2.zznn()) {
            return zzX(zzko.zznw(), zzko2.zznw(), i);
        }
        return 0;
    }

    private Object zzR(Object obj, Object obj2) {
        int i = this.zzW0;
        if (i != 0) {
            if (i == 10) {
                return Boolean.valueOf(zzZKN.zzX((String) obj, (String) obj2, zzZOF.ORDINAL$4894b8c8));
            }
            if (i == 25) {
                return Boolean.valueOf(!zzZKN.zzX((String) obj, (String) obj2, zzZOF.ORDINAL$4894b8c8));
            }
            throw new IllegalStateException();
        }
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        if (this.zzW4.zznp()) {
            return ((String) obj) + obj2;
        }
        return obj + ((String) obj2);
    }

    private static Object zzU(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || ((Boolean) obj2).booleanValue()) {
                return null;
            }
            return Boolean.FALSE;
        }
        if (obj2 == null) {
            if (((Boolean) obj).booleanValue()) {
                return null;
            }
            return Boolean.FALSE;
        }
        throw new IllegalStateException();
    }

    private static Object zzT(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || !((Boolean) obj2).booleanValue()) {
                return null;
            }
            return Boolean.TRUE;
        }
        if (obj2 == null) {
            if (((Boolean) obj).booleanValue()) {
                return Boolean.TRUE;
            }
            return null;
        }
        throw new IllegalStateException();
    }

    private Object zzP(int i, int i2) {
        int i3 = this.zzW0;
        if (i3 == 0) {
            return Integer.valueOf(i + i2);
        }
        if (i3 == 1) {
            return Integer.valueOf(i & i2);
        }
        if (i3 == 8) {
            return Integer.valueOf(i / i2);
        }
        if (i3 == 30) {
            return Integer.valueOf(i - i2);
        }
        if (i3 == 15) {
            return Boolean.valueOf(i < i2);
        }
        if (i3 == 16) {
            return Boolean.valueOf(i <= i2);
        }
        if (i3 == 20) {
            return Integer.valueOf(i % i2);
        }
        if (i3 == 21) {
            return Integer.valueOf(i * i2);
        }
        if (i3 == 25) {
            return Boolean.valueOf(i != i2);
        }
        if (i3 != 26) {
            switch (i3) {
                case 10:
                    return Boolean.valueOf(i == i2);
                case 11:
                    return Integer.valueOf(i ^ i2);
                case 12:
                    return Boolean.valueOf(i > i2);
                case 13:
                    return Boolean.valueOf(i >= i2);
                default:
                    throw new IllegalStateException();
            }
        }
        return Integer.valueOf(i | i2);
    }

    private static boolean zzX(zzKO zzko, zzKO zzko2) {
        return zzW(zzko, zzko2) && zzW(zzko2, zzko);
    }

    private static zzXY zzZ(zzKO zzko, zzKO zzko2) {
        zzZVP zzzvpZzZ = zzZ((zzZVP) zzko, (zzZVP) zzko2);
        if (zzzvpZzZ == null) {
            return null;
        }
        return new zzXY(zzzvpZzZ.getType(), zzzvpZzZ.zzv(), zzzvpZzZ.zzu(), zzko, zzko2);
    }

    private static boolean zzX(zzKO zzko) {
        return zzko.zzns() || zzko.zzs() || zzko.zzRC();
    }

    private static boolean zzY(zzKO zzko, zzKO zzko2) {
        if (zzko.zznp() || zzko2.zznp()) {
            return false;
        }
        if (zzko.zznt() || zzko.zznv() || zzko2.zznt() || zzko2.zznv()) {
            return zzko.zznl() || zzko2.zznl();
        }
        return false;
    }

    private Object zzQ(int i, int i2) {
        int i3 = this.zzW0;
        if (i3 == 14) {
            return Integer.valueOf(i << i2);
        }
        if (i3 == 29) {
            return Integer.valueOf(i >> i2);
        }
        throw new IllegalStateException();
    }

    private static int zzX(int i, int i2, int i3) {
        if (zze(i3)) {
            if (!zz7F.zzUk(i) || !zzSC.zzs(i2, 9)) {
                return 0;
            }
            if (zzSC.zzs(i, 9)) {
                return 9;
            }
        } else {
            if (zzSC.zzs(i, 9) && zzSC.zzs(i2, 9)) {
                return 9;
            }
            if (i != i2) {
                if (i <= i2) {
                    i = i2;
                }
                if (i == 11 || i == 13 || i == 14) {
                    return i;
                }
                return 0;
            }
        }
        return i;
    }

    private static boolean zzW(zzKO zzko, zzKO zzko2) {
        return !zzko.zzns() || zzko2.zzs() || zzko2.zzRC() || zzSC.zzs(zzko2.zznw(), zzko.zznw());
    }

    private static Class zzY(zzKO zzko, zzKO zzko2, int i) {
        if (!zzko.zznp() && !zzko2.zznp()) {
            return null;
        }
        if (i == 0) {
            return String.class;
        }
        if (zzZ(zzko) && zzZ(zzko2) && zzb(i)) {
            return Boolean.TYPE;
        }
        return null;
    }

    private Object zzV(Object obj, Object obj2) {
        if (this.zzVW == 2) {
            int i = this.zzW0;
            if (i == 1) {
                return zzU(obj, obj2);
            }
            if (i == 26) {
                return zzT(obj, obj2);
            }
        }
        if (zzc(this.zzW0) && zzno() && !zznv()) {
            return zzS(obj, obj2);
        }
        return null;
    }

    private static zzZVP zzZ(zzZVP zzzvp, zzZVP zzzvp2) {
        if (!zzzvp.zzs() && !zzzvp.zznr()) {
            return null;
        }
        if (zzzvp.zzs() && zzzvp2.zzs()) {
            return null;
        }
        if (zzzvp.zzs()) {
            if (zzzvp2.zznr()) {
                return zzzvp2;
            }
            return null;
        }
        if (zzzvp2.zzs()) {
            return zzzvp;
        }
        if (zzzvp.zznv() && zzzvp2.zznq()) {
            zzzvp = zzZVO.zzX(zzzvp.zzw(), zzzvp.zzv(), zzzvp.zzu());
        }
        if (zzSC.zzW(zzzvp2, zzzvp)) {
            return zzzvp;
        }
        if (zzSC.zzW(zzzvp, zzzvp2)) {
            return zzzvp2;
        }
        return null;
    }

    private static boolean zzY(zzKO zzko) {
        return zzko.zzno() || zzko.zzs();
    }

    private Object zzY(long j, int i) {
        int i2 = this.zzW0;
        if (i2 == 14) {
            return Long.valueOf(j << i);
        }
        if (i2 == 29) {
            return Long.valueOf(j >> i);
        }
        throw new IllegalStateException();
    }

    private Object zzY(long j, long j2) {
        int i = this.zzW0;
        if (i == 0) {
            return Long.valueOf(j + j2);
        }
        if (i == 1) {
            return Long.valueOf(j & j2);
        }
        if (i == 8) {
            return Long.valueOf(j / j2);
        }
        if (i == 30) {
            return Long.valueOf(j - j2);
        }
        if (i == 15) {
            return Boolean.valueOf(j < j2);
        }
        if (i == 16) {
            return Boolean.valueOf(j <= j2);
        }
        if (i == 20) {
            return Long.valueOf(j % j2);
        }
        if (i == 21) {
            return Long.valueOf(j * j2);
        }
        if (i == 25) {
            return Boolean.valueOf(j != j2);
        }
        if (i != 26) {
            switch (i) {
                case 10:
                    return Boolean.valueOf(j == j2);
                case 11:
                    return Long.valueOf(j ^ j2);
                case 12:
                    return Boolean.valueOf(j > j2);
                case 13:
                    return Boolean.valueOf(j >= j2);
                default:
                    throw new IllegalStateException();
            }
        }
        return Long.valueOf(j | j2);
    }

    private static zzAD zzZ(zzAD zzad, zzKO zzko, zzKO zzko2, int i, zzGY zzgy) {
        if (zzad.zzAF().getType() != zzad.zzAE()[0].getType() || zzad.zzAF().getType() != zzad.zzAE()[1].getType()) {
            return null;
        }
        if (zzad.zzAD() && (zzko.zznl() || zzko2.zznl())) {
            return null;
        }
        return zzKK.zzZ(i, zzad.zzAF(), zzgy);
    }

    private static Class zzZ(Class cls, int i) {
        return (zzc(i) && cls == Boolean.TYPE) ? cls : zzZZO.zzA(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzXY zzZ(zzKO zzko, zzKO zzko2, int i) {
        int iZzV;
        int i2;
        int i3;
        boolean z;
        Class clsZzY = zzY(zzko, zzko2, i);
        int i4 = clsZzY != null ? 1 : 0;
        if (i4 == 0 && (clsZzY = zzX(zzko, zzko2, i)) != null) {
            i4 = 2;
        }
        int i5 = 3;
        if (i4 != 0 || (clsZzY = zzW(zzko, zzko2, i)) == null) {
            iZzV = 0;
        } else {
            iZzV = zzV(zzko, zzko2);
            i4 = 3;
        }
        if (i4 != 0 || (iZzV = zzV(zzko, zzko2, i)) == 0) {
            i5 = i4;
        } else {
            if (!zzR(iZzV, i)) {
                i2 = 0;
                i5 = i4;
                if (i5 == 0 && (clsZzY = zzU(zzko, zzko2, i)) != null) {
                    i5 = 4;
                }
                i3 = i5;
                if (i3 != 0) {
                    return null;
                }
                boolean zZzB = zzZZO.zzB(clsZzY);
                if (zZzB || !zzY(zzko, zzko2)) {
                    z = zZzB;
                } else {
                    clsZzY = zzZ(clsZzY, i);
                    z = true;
                }
                return new zzXY(i, clsZzY, null, null, zzko, zzko2, z, null, null, i3, i2);
            }
            if (zzc(i)) {
                clsZzY = Boolean.TYPE;
            } else {
                clsZzY = zz7F.zzYY(iZzV);
            }
        }
        i2 = iZzV;
        if (i5 == 0) {
            i5 = 4;
        }
        i3 = i5;
        if (i3 != 0) {
        }
    }

    private static boolean zzZ(zzKO zzko) {
        return zzko.zznp() || zzko.zzs();
    }

    private Object zzZ(zzKO zzko, int i) throws Exception {
        zzAD zzad = this.zzW2;
        if (zzad != null) {
            return zzko.zzZ(zzad.zzAE()[i]);
        }
        return zzko.zzx();
    }

    private Object zzZ(float f, float f2) {
        int i = this.zzW0;
        if (i == 0) {
            return Float.valueOf(f + f2);
        }
        if (i == 8) {
            return Float.valueOf(f / f2);
        }
        if (i == 10) {
            return Boolean.valueOf(f == f2);
        }
        if (i == 25) {
            return Boolean.valueOf(f != f2);
        }
        if (i == 30) {
            return Float.valueOf(f - f2);
        }
        if (i == 12) {
            return Boolean.valueOf(f > f2);
        }
        if (i == 13) {
            return Boolean.valueOf(f >= f2);
        }
        if (i == 15) {
            return Boolean.valueOf(f < f2);
        }
        if (i == 16) {
            return Boolean.valueOf(f <= f2);
        }
        if (i == 20) {
            return Float.valueOf(f % f2);
        }
        if (i == 21) {
            return Float.valueOf(f * f2);
        }
        throw new IllegalStateException();
    }

    private Object zzZ(double d, double d2) {
        int i = this.zzW0;
        if (i == 0) {
            return Double.valueOf(d + d2);
        }
        if (i == 8) {
            return Double.valueOf(d / d2);
        }
        if (i == 10) {
            return Boolean.valueOf(d == d2);
        }
        if (i == 25) {
            return Boolean.valueOf(d != d2);
        }
        if (i == 30) {
            return Double.valueOf(d - d2);
        }
        if (i == 12) {
            return Boolean.valueOf(d > d2);
        }
        if (i == 13) {
            return Boolean.valueOf(d >= d2);
        }
        if (i == 15) {
            return Boolean.valueOf(d < d2);
        }
        if (i == 16) {
            return Boolean.valueOf(d <= d2);
        }
        if (i == 20) {
            return Double.valueOf(d % d2);
        }
        if (i == 21) {
            return Double.valueOf(d * d2);
        }
        throw new IllegalStateException();
    }
}
