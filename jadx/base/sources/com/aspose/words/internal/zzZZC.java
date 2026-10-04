package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZC {
    private static volatile boolean zzcE;
    private static volatile Class[] zzcF;
    private static Object zzcD = new Object();
    private static Class[] zzcC = new Class[0];

    private static IllegalArgumentException zzX(String str, int i, String str2) {
        return new IllegalArgumentException(zzZKN.format("{0} Item index: {1}.", str, Integer.valueOf(i)) + "\r\nParameter name: " + str2);
    }

    private static Class[] zzY(Class[] clsArr) {
        zzIM zzim = new zzIM(clsArr.length);
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            if (cls == null) {
                throw zzX("The type cannot be null.", i, "types");
            }
            if (!zzZWA.zzt(cls)) {
                throw zzX("The type must be visible.", i, "types");
            }
            if (cls.isArray()) {
                throw zzX("The type must be non-array.", i, "types");
            }
            if (!zzim.add(cls)) {
                throw zzX("The type must not be duplicated.", i, "types");
            }
        }
        return zzX(clsArr);
    }

    public static void zzZ(Class[] clsArr) {
        zzZ4.zzY((Object) clsArr, "types");
        Class[] clsArrZzY = clsArr.length != 0 ? zzY(clsArr) : null;
        boolean z = zzcE;
        if (!z) {
            synchronized (zzcD) {
                try {
                    z = zzcE;
                    if (!z) {
                        zzcF = clsArrZzY;
                    }
                } finally {
                }
            }
        }
        if (z) {
            throw new IllegalStateException("The set of restricted types cannot be changed during or after building a report.");
        }
    }

    public static Class[] zzrn() {
        Class[] clsArr = zzcF;
        return clsArr != null ? zzX(clsArr) : zzcC;
    }

    public static boolean zzv(Class cls) {
        Class[] clsArr;
        Class[] clsArr2;
        if (zzcE) {
            clsArr2 = zzcF;
        } else {
            synchronized (zzcD) {
                zzcE = true;
                clsArr = zzcF;
            }
            clsArr2 = clsArr;
        }
        if (clsArr2 != null) {
            for (Class cls2 : clsArr2) {
                if (cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Class[] zzX(Class[] clsArr) {
        Class[] clsArr2 = new Class[clsArr.length];
        System.arraycopy(clsArr, 0, clsArr2, 0, clsArr.length);
        return clsArr2;
    }
}
