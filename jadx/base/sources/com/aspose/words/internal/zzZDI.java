package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDI extends zzZD5 {
    private static zzZDI[] zzWIB = new zzZDI[12];
    byte[] zzZWW;

    public zzZDI(int i) {
        this.zzZWW = BigInteger.valueOf(i).toByteArray();
    }

    public static zzZDI zzXq(byte[] bArr) {
        if (bArr.length > 1) {
            return new zzZDI(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        zzZDI[] zzzdiArr = zzWIB;
        if (i >= zzzdiArr.length) {
            return new zzZDI(zzYGU.zzVI(bArr));
        }
        zzZDI zzzdi = zzzdiArr[i];
        if (zzzdi != null) {
            return zzzdi;
        }
        zzZDI zzzdi2 = new zzZDI(zzYGU.zzVI(bArr));
        zzzdiArr[i] = zzzdi2;
        return zzzdi2;
    }

    public static zzZDI zzYD(Object obj) {
        if (obj == null || (obj instanceof zzZDI)) {
            return (zzZDI) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "Illegal object in getInstance: "));
        }
        try {
            return (zzZDI) zzZD5.zzXo((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public final int hashCode() {
        return zzYGU.hashCode(this.zzZWW);
    }

    public final BigInteger zzXKZ() {
        return new BigInteger(this.zzZWW);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return zzZBC.zzg4(this.zzZWW.length) + 1 + this.zzZWW.length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(10, this.zzZWW);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZDI) {
            return zzYGU.zzp(this.zzZWW, ((zzZDI) zzzd5).zzZWW);
        }
        return false;
    }

    private zzZDI(byte[] bArr) {
        if (bArr.length > 1) {
            byte b = bArr[0];
            if (b == 0 && (bArr[1] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                throw new IllegalArgumentException("malformed enumerated");
            }
            if (b == -1 && (bArr[1] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                throw new IllegalArgumentException("malformed enumerated");
            }
        }
        this.zzZWW = zzYGU.zzVI(bArr);
    }
}
