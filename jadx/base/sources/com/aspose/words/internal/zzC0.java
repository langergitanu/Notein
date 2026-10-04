package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzC0 {
    public static zzC1 zzM(zzKO zzko) {
        zzC1 zzc1ZzRD = zzko.zzRD();
        if (zzc1ZzRD == null || zzc1ZzRD.zzBM().length != 1 || zzZWA.zzu(zzc1ZzRD.zzBN().getType())) {
            return null;
        }
        return zzc1ZzRD;
    }

    public static zzC1 zzN(zzKO zzko) {
        zzC1 zzc1ZzM = zzM(zzko);
        if (zzc1ZzM != null && Comparable.class.isAssignableFrom(zzZZO.zzy(zzc1ZzM.zzBN().getType()))) {
            return zzc1ZzM;
        }
        return null;
    }

    public static zzC1 zzO(zzKO zzko) {
        zzC1 zzc1ZzM = zzM(zzko);
        if (zzc1ZzM != null && zzc1ZzM.zzBN().zzIN()) {
            return zzc1ZzM;
        }
        return null;
    }

    public static Object zzZ(zzC1 zzc1, Object obj) throws Exception {
        zz6N zz6n = zzc1.zzBM()[0];
        zz6n.setValue(obj);
        Object objZzx = zzc1.zzBN().zzx();
        zz6n.zzFi();
        return objZzx;
    }
}
