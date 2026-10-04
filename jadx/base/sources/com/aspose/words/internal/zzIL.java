package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzIL {
    public static zzXC zz3(byte[] bArr) {
        return new zzXC(bArr);
    }

    public static byte[] zzW(int i, byte[] bArr, int i2) {
        return zzZ(zzS1.zzYu(i), bArr, 0, i2);
    }

    public static byte[] zzZ(zzH7 zzh7, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: input");
        }
        zzh7.reset();
        zzh7.zzW(bArr, i, i2);
        byte[] bArr2 = new byte[zzh7.zzQI()];
        zzh7.zzo(bArr2);
        return bArr2;
    }

    public static int zzZ4(String str) {
        int length = str.length();
        int i = 352654597;
        int i2 = 352654597;
        int i3 = 0;
        while (length > 0) {
            int iCharAt = ((length > 1 ? str.charAt(i3 + 1) : (char) 0) << 16) + str.charAt(i3);
            int iCharAt2 = ((length > 3 ? str.charAt(i3 + 3) : (char) 0) << 16) + (length > 2 ? str.charAt(i3 + 2) : (char) 0);
            i = (((i << 5) + i) + (i >> 27)) ^ iCharAt;
            if (length <= 2) {
                break;
            }
            i2 = (((i2 << 5) + i2) + (i2 >> 27)) ^ iCharAt2;
            i3 += 4;
            length -= 4;
        }
        return (i2 * 1566083941) + i;
    }

    public static byte[] zzZ(zzH7 zzh7, byte[] bArr) {
        return zzZ(zzh7, bArr, 0, bArr.length);
    }
}
