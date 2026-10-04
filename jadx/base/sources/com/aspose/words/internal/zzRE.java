package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzRE {
    private static zzZVP zzMK = new zzZVP(Object.class);
    private static zzZVP zzMJ = new zzZVP(Iterable.class);
    private static zzFP[] zzMI = {zzRC.zzME, zzRB.zzMD, zzR8.zzMt};
    private static zzH9[] zzMH = {zzRD.zzMF, zzRC.zzME, zzR5.zzMq, zzRB.zzMD, zzR3.zzMo, zzR8.zzMt, zzR7.zzMs};
    private static zzAF[] zzMG = {zzQ.zz7, zzRC.zzME, zzRB.zzMD, zzZZL.zzd3, zzR8.zzMt, zzR7.zzMs};

    public static void zzK(Object obj) {
        zzZ4.zzY(obj, "dataSource");
        if (zzP(obj.getClass())) {
            return;
        }
        throw new IllegalArgumentException(zzZKN.format("A data source object must be of a visible type or implement '{0}'.", Iterable.class) + "\r\nParameter name: dataSource");
    }

    private static zzAF zzN(Class cls) {
        for (zzAF zzaf : zzMG) {
            if (zzaf.zzZ(cls)) {
                return zzaf;
            }
        }
        return null;
    }

    private static zzH9 zzO(Class cls) {
        for (zzH9 zzh9 : zzMH) {
            if (zzh9.zzZ(cls)) {
                return zzh9;
            }
        }
        return null;
    }

    private static boolean zzP(Class cls) {
        return zzZWA.zzt(cls) || zzO(cls) != null || Iterable.class.isAssignableFrom(cls);
    }

    private static Class zzQ(Class cls) {
        zzFP zzfpZzZ = zzZ(cls, false);
        if (zzfpZzZ != null) {
            return zzfpZzZ.zzQS();
        }
        return null;
    }

    private static Class zzR(Class cls) {
        zzFP zzfpZzZ = zzZ(cls, true);
        if (zzfpZzZ != null) {
            return zzfpZzZ.zzQR();
        }
        return null;
    }

    private static zzAF zzV(zzZVP zzzvp, zzGY zzgy) {
        if (zzzvp.zzs()) {
            return null;
        }
        return zzZ(zzzvp.getType(), zzgy);
    }

    public static Object zzW(Object obj) {
        zzH9 zzh9ZzO = zzO(obj.getClass());
        if (zzh9ZzO != null) {
            return zzh9ZzO.zzW(obj);
        }
        return null;
    }

    public static zzZVP zzX(zzZVP zzzvp, zzGY zzgy) {
        Class clsZzR = zzR(zzzvp.getType());
        if (clsZzR != null) {
            return zzZVO.zzX(zzQ(clsZzR), zzzvp.zzv(), null);
        }
        zzZVP zzzvp2 = (zzZVP) zzgy.zzII().zzW(zzzvp);
        if (zzzvp2 != null) {
            return zzzvp2;
        }
        if (zzZZO.zzC(zzzvp.getType())) {
            return zzzvp;
        }
        zzZVP zzzvpZzZ = zzZ(zzzvp, zzgy, false);
        if (zzzvpZzZ != null) {
            return zzY(zzzvpZzZ, zzgy, false);
        }
        return null;
    }

    public static zzZVP zzY(zzZVP zzzvp, zzGY zzgy) {
        return zzY(zzzvp, zzgy, true);
    }

    public static zzZVP zzZ(zzZVP zzzvp, zzGY zzgy) {
        return zzZ(zzzvp, zzgy, true);
    }

    private static zzZVP zzY(zzZVP zzzvp, zzGY zzgy, boolean z) {
        if (z) {
            Class clsZzQ = zzQ(zzzvp.getType());
            if (clsZzQ != null) {
                return zzZVO.zzX(clsZzQ, zzzvp.zzv(), null);
            }
            zzZVP zzzvp2 = (zzZVP) zzgy.zzII().zzX(zzzvp);
            if (zzzvp2 != null) {
                return zzzvp2;
            }
        }
        return zzzvp.getType() == Object.class ? zzMJ : zzZZO.zzY(zzzvp.getType(), zzzvp.zzu(), zzzvp.zzv());
    }

    private static zzZVP zzZ(zzZVP zzzvp, zzGY zzgy, boolean z) {
        if (z) {
            Class clsZzR = zzR(zzzvp.getType());
            if (clsZzR != null) {
                return zzZVO.zzX(clsZzR, zzzvp.zzv(), null);
            }
            zzZVP zzzvp2 = (zzZVP) zzgy.zzII().zzY(zzzvp);
            if (zzzvp2 != null) {
                return zzzvp2;
            }
        }
        zzZVP zzzvpZzZ = zzZZO.zzZ(zzzvp.getType(), zzzvp.zzu(), zzzvp.zzv());
        if (zzzvpZzZ != null) {
            return zzzvpZzZ;
        }
        if (Iterable.class.isAssignableFrom(zzzvp.getType())) {
            return zzMK;
        }
        return null;
    }

    private static zzZW6 zzW(zzZVP zzzvp, zzGY zzgy) {
        if (zzzvp.zzs()) {
            return null;
        }
        return (zzZW6) zzZKW.zzZ(zzZ(zzzvp.zzw(), zzgy), zzZW6.class);
    }

    public static Object zzX(Object obj) {
        zzH9 zzh9ZzO = zzO(obj.getClass());
        return zzh9ZzO != null ? zzh9ZzO.zzX(obj) : obj;
    }

    public static zzAD zzY(Class cls, String str, zzGY zzgy) {
        zzAF zzafZzZ = zzZ(cls, zzgy);
        if (zzafZzZ != null) {
            return zzafZzZ.zzYv(str);
        }
        return null;
    }

    private static zzFP zzZ(Class cls, boolean z) {
        for (zzFP zzfp : zzMI) {
            if (z) {
                if (zzfp.zzM(cls)) {
                    return zzfp;
                }
            } else {
                if (zzfp.zzZ(cls)) {
                    return zzfp;
                }
            }
        }
        return null;
    }

    public static zzAD zzZ(zzZVP zzzvp, String str, zzGY zzgy) {
        zzAF zzafZzV = zzV(zzzvp, zzgy);
        if (zzafZzV != null) {
            return zzafZzV.zzZ(zzzvp.zzv(), str);
        }
        return null;
    }

    public static zzAD zzZ(zzZVP zzzvp, String str, zzZVP zzzvp2, zzGY zzgy) {
        zzAF zzafZzV = zzV(zzzvp, zzgy);
        if (zzafZzV != null) {
            return zzafZzV.zzZ(zzzvp.zzv(), str, zzzvp2);
        }
        return null;
    }

    public static zzAD zzZ(zzZVP zzzvp, zzZVP[] zzzvpArr, zzGY zzgy) {
        zzAF zzafZzV = zzV(zzzvp, zzgy);
        if (zzafZzV != null) {
            return zzafZzV.zzZ(zzzvp.zzv(), zzzvpArr);
        }
        return null;
    }

    public static zzAD zzZ(Class cls, String str, zzZVP[] zzzvpArr, zzGY zzgy) {
        zzAF zzafZzZ = zzZ(cls, zzgy);
        if (zzafZzZ != null) {
            return zzafZzZ.zzZ(str, zzzvpArr);
        }
        return null;
    }

    public static zzAD zzZ(zzZVP zzzvp, String str, zzZVP[] zzzvpArr, zzGY zzgy) {
        zzAF zzafZzV = zzV(zzzvp, zzgy);
        if (zzafZzV != null) {
            return zzafZzV.zzZ(zzzvp.zzv(), str, zzzvpArr);
        }
        return null;
    }

    public static zzAD zzZ(Class cls, zzZVP[] zzzvpArr, zzGY zzgy) {
        zzAF zzafZzZ = zzZ(cls, zzgy);
        if (zzafZzZ != null) {
            return zzafZzZ.zzZ(zzzvpArr);
        }
        return null;
    }

    public static zzAD zzZ(zzZVP zzzvp, zzZVP zzzvp2, zzGY zzgy) {
        if (zzzvp.zzs() || zzzvp2.zzs()) {
            return null;
        }
        return zzZ(0, null, zzzvp, zzzvp2, zzgy);
    }

    public static zzAD zzZ(String str, zzZVP zzzvp, zzGY zzgy) {
        zzZW6 zzzw6ZzW = zzW(zzzvp, zzgy);
        if (zzzw6ZzW != null) {
            return zzzw6ZzW.zzZ(str, zzzvp);
        }
        return null;
    }

    public static zzAD zzZ(String str, zzZVP zzzvp, zzZVP zzzvp2, zzGY zzgy) {
        return zzZ(1, str, zzzvp, zzzvp2, zzgy);
    }

    private static zzAD zzZ(int i, String str, zzZVP zzzvp, zzZVP zzzvp2, zzGY zzgy) {
        zzZW6 zzzw6ZzW = zzW(zzzvp, zzgy);
        zzZW6 zzzw6ZzW2 = zzW(zzzvp2, zzgy);
        if (zzzw6ZzW == null && zzzw6ZzW2 == null) {
            return null;
        }
        if (zzzw6ZzW != null) {
            return zzZ(i, str, zzzvp, zzzvp2, zzzw6ZzW, zzzw6ZzW2);
        }
        return zzZ(i, str, zzzvp, zzzvp2, zzzw6ZzW2, null);
    }

    private static zzAD zzZ(int i, String str, zzZVP zzzvp, zzZVP zzzvp2, zzZW6 zzzw6, zzZW6 zzzw62) {
        if (i == 0) {
            return zzzw6.zzZ(zzzvp, zzzvp2, zzzw62);
        }
        if (i == 1) {
            return zzzw6.zzZ(str, zzzvp, zzzvp2, zzzw62);
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: type");
    }

    private static zzAF zzZ(Class cls, zzGY zzgy) {
        zzAF zzaf = (zzAF) zzgy.zzIJ().get(cls);
        if (zzaf != null) {
            return zzaf;
        }
        zzAF zzafZzN = zzN(cls);
        if (zzafZzN == null && (zzafZzN = zzYS.zzY(cls)) == null) {
            return null;
        }
        zzgy.zzIJ().put(cls, zzafZzN);
        return zzafZzN;
    }
}
