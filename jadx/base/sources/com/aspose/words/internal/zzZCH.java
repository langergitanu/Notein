package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCH extends zzZD5 implements zzZCZ {
    private final char[] zzWHV;

    public zzZCH(char[] cArr) {
        this.zzWHV = cArr;
    }

    public static zzZCH zzYv(Object obj) {
        if (obj == null || (obj instanceof zzZCH)) {
            return (zzZCH) obj;
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
    }

    @Override // com.aspose.words.internal.zzZCZ
    public final String getString() {
        return new String(this.zzWHV);
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public final int hashCode() {
        return zzYGU.hashCode(this.zzWHV);
    }

    public final String toString() {
        return getString();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return (this.zzWHV.length * 2) + zzZBC.zzg4(this.zzWHV.length * 2) + 1;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZCH) {
            return zzYGU.zzZ(this.zzWHV, ((zzZCH) zzzd5).zzWHV);
        }
        return false;
    }

    public zzZCH(String str) {
        this.zzWHV = str.toCharArray();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.write(30);
        zzzd7.zzg7(this.zzWHV.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.zzWHV;
            if (i == cArr.length) {
                return;
            }
            char c = cArr[i];
            zzzd7.write((byte) (c >> '\b'));
            zzzd7.write((byte) c);
            i++;
        }
    }
}
