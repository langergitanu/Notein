package com.google.android.gms.internal.play_billing;

import OooOo.C20485OooOoO;
import Oooo0oO.C21036OooOOo0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class zzhi {
    private static final zzhi zza = new zzhi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhi(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzhi zzc() {
        return zza;
    }

    public static zzhi zze(zzhi zzhiVar, zzhi zzhiVar2) {
        int i = zzhiVar.zzb + zzhiVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhiVar.zzc, i);
        System.arraycopy(zzhiVar2.zzc, 0, iArrCopyOf, zzhiVar.zzb, zzhiVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhiVar.zzd, i);
        System.arraycopy(zzhiVar2.zzd, 0, objArrCopyOf, zzhiVar.zzb, zzhiVar2.zzb);
        return new zzhi(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzhi zzf() {
        return new zzhi(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhi)) {
            return false;
        }
        zzhi zzhiVar = (zzhi) obj;
        int i = this.zzb;
        if (i == zzhiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhiVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhiVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzC;
        int iZzD;
        int iZzC2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzC3 = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.zzd[i2]).getClass();
                    iZzC2 = zzep.zzC(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    zzei zzeiVar = (zzei) this.zzd[i2];
                    int iZzC4 = zzep.zzC(i6);
                    int iZzd = zzeiVar.zzd();
                    iZzC3 = zzep.zzC(iZzd) + iZzd + iZzC4 + iZzC3;
                } else if (i5 == 3) {
                    int iZzC5 = zzep.zzC(i4 << 3);
                    iZzC = iZzC5 + iZzC5;
                    iZzD = ((zzhi) this.zzd[i2]).zza();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new zzfp("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i2]).getClass();
                    iZzC2 = zzep.zzC(i4 << 3) + 4;
                }
                iZzC3 = iZzC2 + iZzC3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzC = zzep.zzC(i7);
                iZzD = zzep.zzD(jLongValue);
            }
            iZzC3 = iZzD + iZzC + iZzC3;
        }
        this.zze = iZzC3;
        return iZzC3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iOooO00o = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzei zzeiVar = (zzei) this.zzd[i2];
            int iZzC = zzep.zzC(8);
            int iZzC2 = zzep.zzC(i3) + zzep.zzC(16);
            int iZzC3 = zzep.zzC(24);
            int iZzd = zzeiVar.zzd();
            iOooO00o = C21036OooOOo0.OooO00o(iZzC + iZzC, iZzC2, C20485OooOoO.OooO00o(iZzd, iZzd, iZzC3), iOooO00o);
        }
        this.zze = iOooO00o;
        return iOooO00o;
    }

    public final zzhi zzd(zzhi zzhiVar) {
        if (zzhiVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhiVar.zzb;
        zzm(i);
        System.arraycopy(zzhiVar.zzc, 0, this.zzc, this.zzb, zzhiVar.zzb);
        System.arraycopy(zzhiVar.zzd, 0, this.zzd, this.zzb, zzhiVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgn.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzhu zzhuVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhuVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhu zzhuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzhuVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzhuVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzhuVar.zzd(i4, (zzei) obj);
                } else if (i3 == 3) {
                    zzhuVar.zzF(i4);
                    ((zzhi) obj).zzl(zzhuVar);
                    zzhuVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzfp("Protocol message tag had invalid wire type."));
                    }
                    zzhuVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzhi() {
        this(0, new int[8], new Object[8], true);
    }
}
