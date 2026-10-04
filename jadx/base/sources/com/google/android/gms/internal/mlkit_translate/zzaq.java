package com.google.android.gms.internal.mlkit_translate;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzaq {
    private static final zzaq zza = new zzan("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    static {
        new zzan("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzap("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzap("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzam zzamVar = new zzam("base16()", "0123456789ABCDEF".toCharArray());
        new zzap(zzamVar, null);
        char[] cArr = new char[512];
        zzf.zzc(zzamVar.zze.length == 16);
        for (int i = 0; i < 256; i++) {
            cArr[i] = zzamVar.zza(i >>> 4);
            cArr[i | 256] = zzamVar.zza(i & 15);
        }
    }

    public static zzaq zzd() {
        return zza;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzao;

    public abstract int zzb(int i);

    public CharSequence zzc(CharSequence charSequence) {
        throw null;
    }

    public final byte[] zze(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzc = zzc(charSequence);
            int iZzb = zzb(charSequenceZzc.length());
            byte[] bArr = new byte[iZzb];
            int iZza = zza(bArr, charSequenceZzc);
            if (iZza == iZzb) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzao e) {
            throw new IllegalArgumentException(e);
        }
    }
}
