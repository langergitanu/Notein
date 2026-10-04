package com.aspose.words.internal;

import com.aspose.words.FipsUnapprovedOperationException;
import com.aspose.words.internal.zzYZ8;
import com.aspose.words.internal.zzZ1T;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXK {
    public static zzXL zzS(byte[] bArr) {
        zzZ43 zzz43 = new zzZ43(zzZ1T.zzWjd, bArr);
        zzZ1T.zzS zzs = zzZ1T.zzWj5;
        new zzZ1T.zzT();
        return new zzXL(zzZ1T.zzT.zzZ(zzz43, zzs), 16);
    }

    public static zzXL zzT(byte[] bArr) {
        zzZ43 zzz43 = new zzZ43(zzZ1T.zzWjd, bArr);
        new zzZ1T.zzT();
        return new zzXL(zzZ1T.zzT.zzZ(zzz43, zzZ1T.zzWjc), bArr.length >> 3);
    }

    public static zzXL zzU(byte[] bArr) {
        return new zzXL(new zzZ1T.zzT().zzW(new zzZ43(zzZ1T.zzWjd, bArr), zzZ1T.zzWjc), bArr.length >> 3);
    }

    public static zzXL zzW(byte[] bArr, byte[] bArr2) {
        zzZ43 zzz43 = new zzZ43(zzZ1T.zzWjd, bArr);
        zzZ1T.zzS zzsZzXg = zzZ1T.zzWj6.zzXg(bArr2);
        new zzZ1T.zzT();
        return new zzXL(zzZ1T.zzT.zzZ(zzz43, zzsZzXg), 16);
    }

    public static zzXL zzY(boolean z, byte[] bArr, byte[] bArr2) {
        zzZ43 zzz43 = new zzZ43(zzZ1T.zzWjd, bArr);
        zzZ1T.zzS zzsZzXg = zzZ1T.zzWj3.zzXg(bArr2);
        return z ? new zzXL(zzZ1T.zzT.zzZ(zzz43, zzsZzXg), 16) : new zzXL(new zzZ1T.zzT().zzW(zzz43, zzsZzXg), 16);
    }

    public static zzXL zzZ(String str, int i, byte[] bArr, byte[] bArr2) {
        return new zzXL(new zzZ1T.zzT().zzW(new zzZ43(zzZ1T.zzWjd, bArr), ("ChainingModeCFB".equalsIgnoreCase(str) ? zzZ1T.zzWiW : zzZ1T.zzWj6).zzXg(bArr2)), i);
    }

    public static zzXL zzZ(boolean z, byte[] bArr, byte[] bArr2) {
        if (!zzS1.isInFipsMode()) {
            zzYZ8.zzT zztZzXg = zzYZ8.zzWaG.zzXg(bArr2);
            zzZ43 zzz43 = new zzZ43(zzYZ8.zzWb4, bArr);
            zzYZ8.zzU zzu = new zzYZ8.zzU();
            if (z) {
                return new zzXL(zzu.zzX(zzz43, zztZzXg), 8);
            }
            return new zzXL(zzu.zzW(zzz43, zztZzXg), 8);
        }
        throw new FipsUnapprovedOperationException("An attempt to open an ODT file which uses the Blowfish algorithm. This algorithm is not on the FIPS-approved algorithm list.");
    }
}
