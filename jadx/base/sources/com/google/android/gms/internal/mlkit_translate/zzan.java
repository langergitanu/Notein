package com.google.android.gms.internal.mlkit_translate;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes7.dex */
final class zzan extends zzap {
    public zzan(String str, String str2, Character ch) {
        zzam zzamVar = new zzam(str, str2.toCharArray());
        super(zzamVar, ch);
        zzf.zzc(zzamVar.zze.length == 64);
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzap, com.google.android.gms.internal.mlkit_translate.zzaq
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzao {
        CharSequence charSequenceZzc = zzc(charSequence);
        if (!this.zza.zzc(charSequenceZzc.length())) {
            throw new zzao(C21532OooOOo.OooO0OO(charSequenceZzc.length(), "Invalid input length "));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzc.length()) {
            int i3 = i2 + 1;
            int iZzb = (this.zza.zzb(charSequenceZzc.charAt(i)) << 18) | (this.zza.zzb(charSequenceZzc.charAt(i + 1)) << 12);
            bArr[i2] = (byte) (iZzb >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceZzc.length()) {
                int i5 = i + 3;
                int iZzb2 = iZzb | (this.zza.zzb(charSequenceZzc.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iZzb2 >>> 8) & 255);
                if (i5 < charSequenceZzc.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iZzb2 | this.zza.zzb(charSequenceZzc.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }
}
