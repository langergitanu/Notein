package com.aspose.words.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzYS {
    private static HashMap<Class, zzAF> zzXJ = new HashMap<>();
    private static Object zzXI = new Object();

    private static zzAF zzX(Class cls) {
        return new zzJ7(cls);
    }

    public static zzAF zzY(Class cls) {
        zzAF zzaf;
        if (!zzZWA.zzt(cls)) {
            return null;
        }
        synchronized (zzXI) {
            zzaf = (zzAF) zzQW.zzZ(zzXJ, cls);
        }
        if (zzaf != null) {
            return zzaf;
        }
        if (zzZZC.zzv(cls)) {
            return null;
        }
        zzAF zzafZzX = zzX(cls);
        synchronized (zzXI) {
            try {
                zzAF zzaf2 = (zzAF) zzQW.zzZ(zzXJ, cls);
                if (zzaf2 == null) {
                    zzXJ.put(cls, zzafZzX);
                } else {
                    zzafZzX = zzaf2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafZzX;
    }
}
