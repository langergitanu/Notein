package com.google.android.gms.internal.mlkit_translate;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
class zzap extends zzaq {
    final zzam zza;
    final Character zzb;

    public zzap(zzam zzamVar, Character ch) {
        this.zza = zzamVar;
        if (ch != null && zzamVar.zzd('=')) {
            throw new IllegalArgumentException(zzi.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzap) {
            zzap zzapVar = (zzap) obj;
            if (this.zza.equals(zzapVar.zza) && Objects.equals(this.zzb, zzapVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zza != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzaq
    public int zza(byte[] bArr, CharSequence charSequence) throws zzao {
        zzam zzamVar;
        CharSequence charSequenceZzc = zzc(charSequence);
        if (!this.zza.zzc(charSequenceZzc.length())) {
            throw new zzao(C21532OooOOo.OooO0OO(charSequenceZzc.length(), "Invalid input length "));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZzc.length()) {
            long jZzb = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                zzamVar = this.zza;
                if (i3 >= zzamVar.zzb) {
                    break;
                }
                jZzb <<= zzamVar.zza;
                if (i + i3 < charSequenceZzc.length()) {
                    jZzb |= (long) this.zza.zzb(charSequenceZzc.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = zzamVar.zzc;
            int i6 = i4 * zzamVar.zza;
            int i7 = (i5 - 1) * 8;
            while (i7 >= (i5 * 8) - i6) {
                bArr[i2] = (byte) ((jZzb >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.zza.zzb;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzaq
    public final int zzb(int i) {
        return (int) (((((long) this.zza.zza) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzaq
    public final CharSequence zzc(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public zzap(String str, String str2, Character ch) {
        this(new zzam(str, str2.toCharArray()), ch);
    }
}
