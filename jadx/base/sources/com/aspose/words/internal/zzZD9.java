package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22206OooOOo0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZD9 extends zzZD5 implements zzZD8 {
    byte[] zzWIn;

    public zzZD9(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.zzWIn = bArr;
    }

    public static zzZD9 zzY(zzZCY zzzcy, boolean z) {
        zzZD5 zzzd5ZzXKw = zzzcy.zzXKw();
        return (z || (zzzd5ZzXKw instanceof zzZD9)) ? zzYz(zzzd5ZzXKw) : zzZCS.zzZ(zzZD4.zzYy(zzzd5ZzXKw));
    }

    public static zzZD9 zzYz(Object obj) {
        if (obj == null || (obj instanceof zzZD9)) {
            return (zzZD9) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return zzYz(zzZD5.zzXo((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct OCTET STRING from byte[]: ")));
            }
        }
        if (obj instanceof zzZDK) {
            zzZD5 zzzd5ZzXL0 = ((zzZDK) obj).zzXL0();
            if (zzzd5ZzXL0 instanceof zzZD9) {
                return (zzZD9) zzzd5ZzXL0;
            }
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        return zzYGU.hashCode(zzXL5());
    }

    public String toString() {
        return "#" + zzYGI.zzVG(zzYGC.encode(this.zzWIn));
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() {
        return zzXL0();
    }

    @Override // com.aspose.words.internal.zzZD8
    public final InputStream zzXKJ() {
        return new ByteArrayInputStream(this.zzWIn);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL2() {
        return new zzZC6(this.zzWIn);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL3() {
        return new zzZC6(this.zzWIn);
    }

    public byte[] zzXL5() {
        return this.zzWIn;
    }

    @Override // com.aspose.words.internal.zzZD5
    public abstract void zzZ(zzZD7 zzzd7) throws IOException;

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZD9) {
            return zzYGU.zzp(this.zzWIn, ((zzZD9) zzzd5).zzWIn);
        }
        return false;
    }
}
