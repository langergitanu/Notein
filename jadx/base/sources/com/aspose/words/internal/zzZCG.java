package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZCG extends zzZDN {
    public zzZCG(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static zzZCG zzW(zzZCY zzzcy) {
        zzZD5 zzzd5ZzXKw = zzzcy.zzXKw();
        return zzzd5ZzXKw instanceof zzZCG ? zzYu(zzzd5ZzXKw) : zzXn(((zzZD9) zzzd5ZzXKw).zzXL5());
    }

    private static zzZCG zzXn(byte[] bArr) {
        if (bArr.length <= 0) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte b = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        if (length != 0) {
            System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        }
        return new zzZCG(bArr2, b);
    }

    public static zzZCG zzYu(Object obj) {
        if (obj == null || (obj instanceof zzZCG)) {
            return (zzZCG) obj;
        }
        if (obj instanceof zzZBQ) {
            zzZBQ zzzbq = (zzZBQ) obj;
            return new zzZCG(zzzbq.data, zzzbq.zzWII);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
        }
        try {
            return (zzZCG) zzZD5.zzXo((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return zzZBC.zzg4(this.data.length + 1) + 1 + this.data.length + 1;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZDN, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        byte[] bArrZzl = zzZDN.zzl(this.data, this.zzWII);
        int length = bArrZzl.length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) zzXL4();
        System.arraycopy(bArrZzl, 0, bArr, 1, length);
        zzzd7.zzV(3, bArr);
    }

    public zzZCG(byte[] bArr) {
        this(bArr, 0);
    }

    public zzZCG(zzZDK zzzdk) throws IOException {
        super(zzzdk.zzXL0().getEncoded("DER"), 0);
    }
}
