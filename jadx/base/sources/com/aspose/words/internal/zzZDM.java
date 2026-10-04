package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDM extends zzZD5 {
    private final byte[] zzWIF;
    private static final byte[] zzWIH = {-1};
    private static final byte[] zzWIG = {0};
    public static final zzZDM zzWIE = new zzZDM(false);
    public static final zzZDM zzWID = new zzZDM(true);

    private zzZDM(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b = bArr[0];
        if (b == 0) {
            this.zzWIF = zzWIG;
        } else if ((b & 255) == 255) {
            this.zzWIF = zzWIH;
        } else {
            this.zzWIF = zzYGU.zzVI(bArr);
        }
    }

    public static zzZDM zzOQ(boolean z) {
        return z ? zzWID : zzWIE;
    }

    public static zzZDM zzXr(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        return b == 0 ? zzWIE : (b & 255) == 255 ? zzWID : new zzZDM(bArr);
    }

    public static zzZDM zzYE(Object obj) {
        if (obj == null || (obj instanceof zzZDM)) {
            return (zzZDM) obj;
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
    }

    public static zzZDM zzZ(zzZCY zzzcy) {
        zzZD5 zzzd5ZzXKw = zzzcy.zzXKw();
        return zzzd5ZzXKw instanceof zzZDM ? zzYE(zzzd5ZzXKw) : zzXr(((zzZD9) zzzd5ZzXKw).zzXL5());
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public final int hashCode() {
        return this.zzWIF[0];
    }

    public final String toString() {
        return this.zzWIF[0] != 0 ? "TRUE" : "FALSE";
    }

    public final boolean zzXL1() {
        return this.zzWIF[0] != 0;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return 3;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(1, this.zzWIF);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        return (zzzd5 instanceof zzZDM) && this.zzWIF[0] == ((zzZDM) zzzd5).zzWIF[0];
    }

    private zzZDM(boolean z) {
        this.zzWIF = z ? zzWIH : zzWIG;
    }
}
