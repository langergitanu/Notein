package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzS implements zzH0 {
    private Object zza;
    private boolean zzb;
    private zzKO zzc;
    private zzKO zzd;
    private zz6N zze;
    private zz6N zzf;
    private zz6N zzg;
    private zzC1 zzh;
    private zzKO zzi;

    private zzS(zzKO zzko, zzC1 zzc1, zz6N zz6n, zz6N zz6n2, zz6N zz6n3, zzKO zzko2, zzKO zzko3, boolean z, Object obj) {
        this.zzi = zzko;
        this.zzh = zzc1;
        this.zzg = zz6n;
        this.zzf = zz6n2;
        this.zze = zz6n3;
        this.zzd = zzko2;
        this.zzc = zzko3;
        this.zzb = z;
        this.zza = obj;
    }

    public static zzH0 zzY(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, true, zzgy);
    }

    public static zzH0 zzZ(zzKO zzko, zzKO zzko2, zzGY zzgy) {
        return zzZ(zzko, zzko2, false, zzgy);
    }

    private zzZVP zzt() {
        return this.zzb ? this.zzc : this.zzf;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class getType() {
        return zzt().getType();
    }

    @Override // com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return false;
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzu() {
        return zzt().zzu();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Object zzv() {
        return zzt().zzv();
    }

    @Override // com.aspose.words.internal.zzF6
    public final Class zzw() {
        return zzt().zzw();
    }

    @Override // com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Object objZzx;
        Iterator it = ((Iterable) this.zzi.zzx()).iterator();
        int i = 0;
        while (it.hasNext()) {
            this.zzh.zzBM()[0].setValue(it.next());
            Object objZzx2 = this.zzh.zzBN().zzx();
            if (objZzx2 != null) {
                int i2 = i + 1;
                if (i == 0) {
                    this.zzf.setValue(zzKK.zzZ(objZzx2, this.zzg, this.zzf));
                } else {
                    this.zzg.setValue(objZzx2);
                    this.zzf.setValue(this.zzd.zzx());
                }
                i = i2;
            }
        }
        this.zzh.zzBM()[0].zzFi();
        this.zzg.zzFi();
        if (i == 0) {
            if (!this.zzb || this.zzf.zznr()) {
                return this.zza;
            }
            throw new IllegalStateException(zzZKN.format("Can not calculate an average value for an empty sequence of type '{0}'.", this.zzf.getType()));
        }
        if (this.zzb) {
            this.zze.setValue(this.zze.zznw() == 14 ? Double.valueOf(i) : Integer.valueOf(i));
            objZzx = this.zzc.zzx();
            this.zze.zzFi();
        } else {
            objZzx = this.zzf.zzx();
        }
        this.zzf.zzFi();
        return objZzx;
    }

    private static zzH0 zzZ(zzKO zzko, zzKO zzko2, boolean z, zzGY zzgy) {
        zz6N zz6nZzY;
        zz6N zz6nZzY2;
        zzKO zzkoZzZ;
        zz6N zz6n;
        zzKO zzko3;
        Object objZzx;
        Iterable.class.isAssignableFrom(zzko.getType());
        zzC1 zzc1ZzM = zzC0.zzM(zzko2);
        if (zzc1ZzM == null || (zzkoZzZ = zzZ((zzKO) (zz6nZzY2 = zz6N.zzY(zzc1ZzM.zzBN(), null)), (zzKO) (zz6nZzY = zz6N.zzY(zzc1ZzM.zzBN(), null)), zzgy, true)) == null) {
            return null;
        }
        if (zzkoZzZ.getType() != zz6nZzY2.getType()) {
            if (!zzSC.zzs(zz6nZzY2.zznw(), zzkoZzZ.zznw())) {
                return null;
            }
            zz6nZzY2 = zz6N.zzY(zzkoZzZ, null);
            zzkoZzZ = zzZ((zzKO) zz6nZzY2, (zzKO) zz6nZzY, zzgy, true);
            if (zzkoZzZ != null) {
                zzkoZzZ.getType();
                zz6nZzY2.getType();
            }
        }
        zz6N zz6n2 = zz6nZzY2;
        zzKO zzko4 = zzkoZzZ;
        if (z) {
            zz6N zz6nZzX = zz6N.zzX(zz7F.zzUk(zz6n2.zznw()) ? Double.TYPE : Integer.TYPE, null);
            zzKO zzkoZzZ2 = zzZ((zzKO) zz6n2, (zzKO) zz6nZzX, zzgy, false);
            if (zzkoZzZ2 == null) {
                return null;
            }
            objZzx = zzZZO.zzx(zzkoZzZ2.getType());
            zzko3 = zzkoZzZ2;
            zz6n = zz6nZzX;
        } else {
            zz6n = null;
            zzko3 = null;
            objZzx = zzZZO.zzx(zz6n2.zzw());
        }
        return new zzS(zzko, zzc1ZzM, zz6nZzY, zz6n2, zz6n, zzko4, zzko3, z, objZzx);
    }

    private static zzKO zzZ(zzKO zzko, zzKO zzko2, zzGY zzgy, boolean z) {
        try {
            if (z) {
                return zzXY.zzX(zzko, zzko2, zzgy);
            }
            return zzXY.zzT(zzko, zzko2, zzgy);
        } catch (zzCX unused) {
            return null;
        }
    }
}
