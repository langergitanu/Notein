package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZJ {
    private static volatile boolean zzcV = false;
    private int zzCF;
    private zzYW zzLS;
    private zzC2 zzcW = new zzC2();

    public static Class[] getRestrictedTypes() {
        return zzZZC.zzrn();
    }

    public static boolean getUseReflectionOptimization() {
        return zzcV;
    }

    public static void setRestrictedTypes(Class... clsArr) {
        zzZZC.zzZ(clsArr);
    }

    public static void setUseReflectionOptimization(boolean z) {
        zzcV = z;
    }

    private static Object[] zzX(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        Object[] objArr2 = objArr;
        for (int i = 0; i < objArr.length; i++) {
            zzH8 zzh8 = (zzH8) zzZKW.zzZ(objArr[i], zzH8.class);
            if (zzh8 != null) {
                if (objArr2 == objArr) {
                    objArr2 = (Object[]) objArr.clone();
                }
                objArr2[i] = zzh8.zzRt();
            }
        }
        return objArr2;
    }

    public final int getOptions() {
        return this.zzCF;
    }

    public final void setOptions(int i) {
        this.zzCF = i;
    }

    public final void zzW(Object[] objArr) {
        zzYW zzywZzZ = zzYW.zzZ(objArr);
        if (zzywZzZ != null) {
            this.zzLS = zzywZzZ;
        }
    }

    public final boolean zzZ(String[] strArr, Object[] objArr, zzFH zzfh, zzFS zzfs) throws Exception {
        return zzZ(strArr, objArr, new zzSW(), new zzX9(), zzfh, zzfs);
    }

    public final zzC2 zzrx() {
        return this.zzcW;
    }

    public static boolean zzZ(Object obj, boolean z, boolean z2, zzFH zzfh, zzFS zzfs) throws Exception {
        return zzZ(obj, z, z2, new zzSW(), new zzX9(), zzfh, zzfs);
    }

    private boolean zzZ(String[] strArr, Object[] objArr, zzG2 zzg2, zzGX zzgx, zzFH zzfh, zzFS zzfs) throws Exception {
        if (!zzZHP.zzci().startsWith("1.")) {
            zzcV = false;
        }
        int i = this.zzCF;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        boolean z4 = (i & 8) != 0;
        zzgx.zzZ(this.zzcW, zzX(objArr), strArr, z, z3);
        zzgx.zzIx().zzII().zzZ(zzBS.zzsQ);
        zzfs.zzT(z2, z4);
        return zzZ(zzg2.zzZ(zzgx, zzfh, zzfs, this.zzLS, z3), zzfs);
    }

    private static boolean zzZ(Object obj, boolean z, boolean z2, zzG2 zzg2, zzGX zzgx, zzFH zzfh, zzFS zzfs) throws Exception {
        zzfs.zzT(z, z2);
        return zzZ(zzg2.zzZ(zzgx, zzfh, zzfs, obj), zzfs);
    }

    private static boolean zzZ(zzFI zzfi, zzFS zzfs) throws Exception {
        if (zzfi == null) {
            return false;
        }
        return zzfi.zzW(zzfs);
    }
}
