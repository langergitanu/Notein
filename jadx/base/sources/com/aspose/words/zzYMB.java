package com.aspose.words;

import com.aspose.slides.PatternStyle;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMB implements Cloneable {
    private static com.aspose.words.internal.zzZYJ zzXFv;
    static byte[] zzXFw = {-124, -118, -114, -105, -33, 100, 34, -65, -2, 55, 72, 114, -94, -15, PatternStyle.Plaid, -19};
    int zzXFx;
    int zzXFy;
    byte[] zzXFz;
    byte[] zzYL3;

    static {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        zzXFv = zzzyj;
        zzzyj.zzH("MD2", 1);
        zzXFv.zzH("MD4", 2);
        zzXFv.zzH("MD5", 3);
        zzXFv.zzH("RIPEMD-128", 6);
        zzXFv.zzH("RIPEMD-160", 7);
        zzXFv.zzH(IDevicePopManager.SHA_1, 4);
        zzXFv.zzH(KeyUtil.HMAC_KEY_HASH_ALGORITHM, 12);
        zzXFv.zzH("SHA-384", 13);
        zzXFv.zzH("SHA-512", 14);
        zzXFv.zzH("WHIRLPOOL", 15);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int zzCX(String str) {
        return zzXFv.zzG(str, 15);
    }

    private static byte[] zzV(int i, byte[] bArr, int i2) {
        com.aspose.words.internal.zzH7 zzh7ZzYu = com.aspose.words.internal.zzS1.zzYu(i == zzCX("SHA-512") ? 5 : 1);
        int iZzQI = zzh7ZzYu.zzQI();
        byte[] bArrZzZ = com.aspose.words.internal.zzIL.zzZ(zzh7ZzYu, bArr);
        byte[] bArr2 = new byte[iZzQI + 4];
        for (int i3 = 0; i3 < i2; i3++) {
            System.arraycopy(bArrZzZ, 0, bArr2, 0, bArrZzZ.length);
            com.aspose.words.internal.zzZ1.zzZ(i3, bArr2, iZzQI);
            bArrZzZ = com.aspose.words.internal.zzIL.zzZ(zzh7ZzYu, bArr2);
        }
        return bArrZzZ;
    }

    public static String zzqg(int i) {
        return zzXFv.getValue(i);
    }

    public final boolean isEmpty() {
        return this.zzXFz == null;
    }

    public final zzYMB zzYnT() {
        return (zzYMB) memberwiseClone();
    }

    public final void zzZ(int i, zzYMB zzymb) {
        int i2 = zzymb.zzXFy;
        if (i2 <= 0) {
            i2 = 4;
        }
        this.zzXFy = i2;
        this.zzXFx = zzymb.isEmpty() ? 50000 : zzymb.zzXFx;
        byte[] bArr = zzymb.zzYL3;
        if (bArr == null) {
            bArr = zzXFw;
        }
        this.zzYL3 = bArr;
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(com.aspose.words.internal.zzJB.zzWs(com.aspose.words.internal.zzXU.zz9(i)));
        System.arraycopy(bytes, 0, bArr2, 16, bytes.length);
        this.zzXFz = zzV(this.zzXFy, bArr2, this.zzXFx);
    }

    public final void zzZ(String str, zzYMB zzymb) {
        int i = zzymb.zzXFy;
        if (i <= 0) {
            i = 4;
        }
        this.zzXFy = i;
        int i2 = zzymb.zzXFx;
        if (i2 <= 0) {
            i2 = 50000;
        }
        this.zzXFx = i2;
        byte[] bArr = zzymb.zzYL3;
        if (bArr == null) {
            bArr = zzXFw;
        }
        this.zzYL3 = bArr;
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(str);
        byte[] bArr2 = new byte[bytes.length + 16];
        byte[] bArr3 = this.zzYL3;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(bytes, 0, bArr2, 16, bytes.length);
        this.zzXFz = zzV(this.zzXFy, bArr2, this.zzXFx);
    }
}
