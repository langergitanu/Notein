package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Objects;
import oO0o0O0o.C33580OooO00o;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strO000oOoO;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        int i2 = 0;
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr[i2];
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(i4));
                i2++;
            }
            sb.append((CharSequence) "]");
            strO000oOoO = sb.toString();
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, C33580OooO00o.f121231OooO0O0);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i5 = 0;
                while (i2 < length2) {
                    long j = jArr[i2];
                    i5++;
                    if (i5 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf(j));
                    i2++;
                }
                sb2.append((CharSequence) "]");
                strO000oOoO = sb2.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i6 = 0;
                while (i2 < length3) {
                    short s = sArr[i2];
                    i6++;
                    if (i6 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf((int) s));
                    i2++;
                }
                sb3.append((CharSequence) "]");
                strO000oOoO = sb3.toString();
            } else if (objZza instanceof float[]) {
                strO000oOoO = OooOOO.Oooo0((float[]) objZza, null, 56);
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = dArr.length;
                int i7 = 0;
                while (i2 < length4) {
                    double d = dArr[i2];
                    i7++;
                    if (i7 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(d));
                    i2++;
                }
                sb4.append((CharSequence) "]");
                strO000oOoO = sb4.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strO000oOoO = OooOOO.Oooo0O0((Object[]) objZza, ",", "[", "]", null, 56);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                strO000oOoO = OooOo.o000oOoO((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strO000oOoO = str;
        }
        zzgdVar.zzc().zze(i, strO000oOoO);
    }
}
