package com.google.android.gms.internal.mlkit_translate;

import OoooooO.C21421OooO0oO;
import androidx.appcompat.widget.C21532OooOOo;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
final class zzam {
    final int zza;
    final int zzb;
    final int zzc;
    private final String zzd;
    private final char[] zze;
    private final byte[] zzf;
    private final boolean[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzam(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            zzf.zzd(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            zzf.zzd(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzam) {
            zzam zzamVar = (zzam) obj;
            boolean z = zzamVar.zzh;
            if (Arrays.equals(this.zze, zzamVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zze) + 1237;
    }

    public final String toString() {
        return this.zzd;
    }

    public final char zza(int i) {
        return this.zze[i];
    }

    public final int zzb(char c) throws zzao {
        if (c > 127) {
            throw new zzao("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.zzf[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zzao("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new zzao(C21421OooO0oO.OooO00o("Unrecognized character: ", c));
    }

    public final boolean zzc(int i) {
        return this.zzg[i % this.zzb];
    }

    public final boolean zzd(char c) {
        return this.zzf[61] != -1;
    }

    private zzam(String str, char[] cArr, byte[] bArr, boolean z) {
        this.zzd = str;
        cArr.getClass();
        this.zze = cArr;
        try {
            int iZzb = zzbj.zzb(cArr.length, RoundingMode.UNNECESSARY);
            this.zza = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzb = i;
            this.zzc = iZzb >> iNumberOfTrailingZeros;
            this.zzf = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzc; i2++) {
                zArr[zzbj.zza(i2 * 8, this.zza, RoundingMode.CEILING)] = true;
            }
            this.zzg = zArr;
            this.zzh = false;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(cArr.length, "Illegal alphabet length "), e);
        }
    }
}
