package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz19 implements zzH0 {
    private int zzDt;
    private zzKO zzFK;
    private zzC1 zzRl;
    private Object zza;
    private boolean zzfj;
    private zzZVP zzfk;
    private zzKO zzi;

    private zz19(zzKO zzko, zzC1 zzc1, zzKO zzko2, zzZVP zzzvp, int i, boolean z, Object obj) {
        this.zzi = zzko;
        this.zzRl = zzc1;
        this.zzFK = zzko2;
        this.zzfk = zzzvp;
        this.zzDt = i;
        this.zzfj = z;
        this.zza = obj;
    }

    public static zzH0 zz7(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, null, zzko2, zzgy, 3, true);
    }

    public static zzH0 zz8(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, null, zzko2, zzgy, 3, false);
    }

    public static zzH0 zz9(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 2, true);
    }

    private static zzH0 zzZ(zzKO zzko, zzKO zzko2, zzKO zzko3, zzGY zzgy, int i, boolean z) {
        zzC1 zzc1;
        Iterable.class.isAssignableFrom(zzko.getType());
        if (zzko2 != null) {
            zzC1 zzc1ZzO = zzC0.zzO(zzko2);
            if (zzc1ZzO == null) {
                return null;
            }
            zzc1 = zzc1ZzO;
        } else {
            zzc1 = null;
        }
        if (zzko3 != null && !zzko3.zzIM()) {
            return null;
        }
        zzZVP zzzvpZzZ = zzRE.zzZ(zzko, zzgy);
        return new zz19(zzko, zzc1, zzko3, zzzvpZzZ, i, z, z ? zzZZO.zzx(zzzvpZzZ.getType()) : null);
    }

    public static zzH0 zza(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 2, false);
    }

    public static zzH0 zzb(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 1, true);
    }

    public static zzH0 zzc(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 1, false);
    }

    public static zzH0 zzd(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 0, true);
    }

    public static zzH0 zze(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, null, zzgy, 0, false);
    }

    private Object zzsV() {
        if (this.zzfj) {
            return this.zza;
        }
        if (this.zzDt == 3) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        throw new IllegalStateException("The sequence is empty or does not contain a satisfactory element.");
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return this.zzfk.getType();
    }

    @Override // com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return false;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzfk.zzu();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzfk.zzv();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class zzw() {
        return this.zzfk.zzw();
    }

    @Override // com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Object obj;
        zzKO zzko = this.zzFK;
        int i = 0;
        int iZzT = zzko != null ? zz7F.zzT(zzko.zzx(), this.zzFK.zznw()) : 0;
        Object obj2 = null;
        if (iZzT >= 0) {
            int i2 = 0;
            obj = null;
            for (Object obj3 : (Iterable) this.zzi.zzx()) {
                zzC1 zzc1 = this.zzRl;
                if (zzc1 != null) {
                    zzc1.zzBM()[0].setValue(obj3);
                    if (!((Boolean) this.zzRl.zzBN().zzx()).booleanValue()) {
                        continue;
                    }
                }
                int i3 = i2 + 1;
                if (i2 == 0) {
                    obj2 = obj3;
                }
                int i4 = this.zzDt;
                if (i4 == 0 || ((i4 == 2 && i3 > 1) || (i4 == 3 && iZzT == i2))) {
                    i2 = i3;
                    obj = obj3;
                    break;
                }
                i2 = i3;
                obj = obj3;
            }
            zzC1 zzc12 = this.zzRl;
            if (zzc12 != null) {
                zzc12.zzBM()[0].zzFi();
            }
            i = i2;
        } else {
            obj = null;
        }
        return zzZ(iZzT, i, obj2, obj);
    }

    private Object zzZ(int i, int i2, Object obj, Object obj2) {
        int i3 = this.zzDt;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    if (i2 == 0 || i != i2 - 1) {
                        return zzsV();
                    }
                } else {
                    if (i2 == 0) {
                        return zzsV();
                    }
                    if (i2 != 1) {
                        throw new IllegalStateException("The sequence contains more than one satisfactory element.");
                    }
                }
            } else if (i2 == 0) {
                return zzsV();
            }
            return obj2;
        }
        if (i2 == 0) {
            return zzsV();
        }
        return obj;
    }
}
