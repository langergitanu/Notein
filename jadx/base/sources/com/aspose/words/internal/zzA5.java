package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzA5 extends zzAH {
    private zzA5(zzKO zzko, zzAD zzad, zzKO[] zzkoArr) {
        super(zzko, zzad, zzkoArr);
    }

    public static zzA5 zzX(zzKO zzko, String str, zzKO[] zzkoArr, zzGY zzgy) {
        if (zzko.zzSj()) {
            return new zzA5();
        }
        zzAD zzadZzZ = zzRE.zzZ(zzko, str, zzkoArr, zzgy);
        if (zzadZzZ != null) {
            return new zzA5(zzko, zzadZzZ, zzkoArr);
        }
        zzH0 zzh0ZzZ = zzgy.zzII().zzZ(zzko, str, zzkoArr);
        if (zzh0ZzZ != null) {
            return new zzA5(zzh0ZzZ);
        }
        if (zzgy.zzIH()) {
            return new zzA5();
        }
        throw zzY(zzko.getType(), str);
    }

    public static zzA5 zzY(Class cls, String str, zzKO[] zzkoArr, zzGY zzgy) {
        zzAD zzadZzZ = zzRE.zzZ(cls, str, zzkoArr, zzgy);
        if (zzadZzZ != null) {
            return new zzA5(null, zzadZzZ, zzkoArr);
        }
        throw zzY(cls, str);
    }

    private zzA5(zzH0 zzh0) {
        super(zzh0);
    }

    private zzA5() {
    }

    private static zzCX zzY(Class cls, String str) {
        return new zzCX(zzZKN.format("Can not resolve method '{0}' on type '{1}'.", str, cls));
    }
}
