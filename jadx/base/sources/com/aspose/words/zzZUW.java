package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUW {
    private int zzAr;
    private int zzQw;
    private byte[] zzTZ;
    private boolean zzYLE;

    public zzZUW(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fontData");
        }
        this.zzTZ = bArr;
        this.zzQw = i;
        this.zzAr = i2;
        this.zzYLE = z;
    }

    public final byte[] getData() {
        return this.zzTZ;
    }

    public final int getFormat() {
        return this.zzQw;
    }

    public final int getStyle() {
        return this.zzAr;
    }

    public final zzZUW zzMF(String str) throws Exception {
        byte[] bArrZzZ;
        if (this.zzTZ == null) {
            return null;
        }
        if (this.zzQw == 0) {
            return this;
        }
        try {
            bArrZzZ = new com.aspose.words.internal.zzZXF().zzZ(this.zzTZ, str, this.zzYLE);
        } catch (Exception unused) {
            bArrZzZ = null;
        }
        if (bArrZzZ == null) {
            return null;
        }
        return new zzZUW(bArrZzZ, 0, this.zzAr, this.zzYLE);
    }

    public final boolean zzZjy() {
        return this.zzYLE;
    }

    public final zzZUW zzZjz() {
        byte[] bArr = this.zzTZ;
        if (bArr == null) {
            return null;
        }
        if (this.zzQw == 1) {
            return this;
        }
        byte[] bArrZzc = com.aspose.words.internal.zzKU.zzc(bArr);
        if (bArrZzc == null) {
            return null;
        }
        return new zzZUW(bArrZzc, 1, this.zzAr, this.zzYLE);
    }
}
