package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz2V {
    private byte[] zzhe = zzZZS.zzT8(16);
    private zzXL zzic;

    public zz2V(byte[] bArr) {
        this.zzic = zzXK.zzS(bArr);
    }

    public final zzZOP zz3(zzZOP zzzop) throws Exception {
        return new zz3U(zzzop, this.zzic, this.zzhe);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        r6 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zzZi(byte[] bArr) throws Exception {
        int length = this.zzhe.length + bArr.length;
        zzZOR zzzor = new zzZOR(length);
        try {
            zzzor = new zzZOR(length);
            byte[] bArr2 = this.zzhe;
            zzzor.write(bArr2, 0, bArr2.length);
            zzzor.write(bArr, 0, bArr.length);
            zzzor.zzH(0L);
            this.zzic.zzZ(zzzor, zzzor);
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            return bArrZzWy;
        } finally {
        }
    }
}
