package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZC9 extends zzZD5 implements zzZCZ {
    private final byte[] zzWIn;

    public zzZC9(byte[] bArr) {
        this.zzWIn = bArr;
    }

    public static zzZC9 zzV(zzZCY zzzcy) {
        zzZD5 zzzd5ZzXKw = zzzcy.zzXKw();
        return zzzd5ZzXKw instanceof zzZC9 ? zzYt(zzzd5ZzXKw) : new zzZC9(((zzZD9) zzzd5ZzXKw).zzXL5());
    }

    public static zzZC9 zzYt(Object obj) {
        if (obj == null || (obj instanceof zzZC9)) {
            return (zzZC9) obj;
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
    }

    @Override // com.aspose.words.internal.zzZCZ
    public final String getString() {
        return zzYGI.zzVG(this.zzWIn);
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        return zzYGU.hashCode(this.zzWIn);
    }

    public String toString() {
        return getString();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return zzZBC.zzg4(this.zzWIn.length) + 1 + this.zzWIn.length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(22, this.zzWIn);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZC9) {
            return zzYGU.zzp(this.zzWIn, ((zzZC9) zzzd5).zzWIn);
        }
        return false;
    }

    public zzZC9(String str) {
        this(str, (byte) 0);
    }

    private zzZC9(String str, byte b) {
        if (str != null) {
            this.zzWIn = zzYGI.zzwb(str);
            return;
        }
        throw new NullPointerException("string cannot be null");
    }
}
