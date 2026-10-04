package com.google.android.gms.internal.play_billing;

import OooOo.C20485OooOoO;
import Oooo0.C20855OooooOO;
import Oooo0oO.o0Oo0oo;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzei implements Iterable, Serializable {
    public static final zzei zzb = new zzeg(zzfo.zzb);
    private int zza = 0;

    static {
        int i = zzdv.zza;
    }

    public static int zzh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(o0Oo0oo.OooO0O0(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i2, i3, "End index: ", " >= "));
    }

    public static zzei zzj(byte[] bArr, int i, int i2) {
        zzh(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzeg(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzea(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return androidx.concurrent.futures.OooO00o.OooO0OO(C20485OooOoO.OooO0OO(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzhf.zza(this) : zzhf.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzei zzf(int i, int i2);

    public abstract void zzg(zzdz zzdzVar) throws IOException;

    public final int zzi() {
        return this.zza;
    }
}
