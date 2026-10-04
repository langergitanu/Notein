package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDD extends zzZD5 {
    byte[] zzZWW;

    public zzZDD(long j) {
        this.zzZWW = BigInteger.valueOf(j).toByteArray();
    }

    public static zzZDD zzYB(Object obj) {
        if (obj == null || (obj instanceof zzZDD)) {
            return (zzZDD) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "Illegal object in getInstance: "));
        }
        try {
            return (zzZDD) zzZD5.zzXo((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static zzZDD zzZ(zzZCY zzzcy, boolean z) {
        zzZD5 zzzd5ZzXKw = zzzcy.zzXKw();
        return (z || (zzzd5ZzXKw instanceof zzZDD)) ? zzYB(zzzd5ZzXKw) : new zzZDD(zzZD9.zzYz(zzzcy.zzXKw()).zzXL5());
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.zzZWW;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    public final String toString() {
        return zzXKZ().toString();
    }

    public final BigInteger zzXKM() {
        return new BigInteger(1, this.zzZWW);
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

    public zzZDD(BigInteger bigInteger) {
        this.zzZWW = bigInteger.toByteArray();
    }

    private zzZDD(byte[] bArr) {
        this(bArr, true);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(2, this.zzZWW);
    }

    public zzZDD(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            byte b = bArr[0];
            if (b == 0 && (bArr[1] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                throw new IllegalArgumentException("malformed integer");
            }
            if (b == -1 && (bArr[1] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                throw new IllegalArgumentException("malformed integer");
            }
        }
        this.zzZWW = z ? zzYGU.zzVI(bArr) : bArr;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZDD) {
            return zzYGU.zzp(this.zzZWW, ((zzZDD) zzzd5).zzZWW);
        }
        return false;
    }
}
