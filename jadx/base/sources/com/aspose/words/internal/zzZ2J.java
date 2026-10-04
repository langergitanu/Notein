package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2J {
    static final Hashtable zzWjV;

    public static class zzY implements zzZ5G {
        private final int zzWjU;

        public zzY(int i) {
            this.zzWjU = i;
        }

        @Override // com.aspose.words.internal.zzZ5G
        public final int zzXGW() {
            return this.zzWjU;
        }

        @Override // com.aspose.words.internal.zzZ5G
        public final byte[] zzXGX() {
            return new byte[2];
        }
    }

    public static class zzZ extends zzZ0F {
        public zzZ() {
            super(zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f202122232425262728292a2b2c2d2e2f303132333435363738393a3b3c3d3e3f404142434445464748494a4b4c4d4e4f505152535455565758595a5b5c5d5e5f606162636465666768696a6b6c6d6e6f707172737475767778797a7b7c7d7e7f808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9fa0a1a2a3a4a5a6a7a8a9aaabacadaeafb0b1b2b3b4b5b6b7b8b9babbbcbdbebfc0c1c2c3c4c5c6c7c8c9cacbcccdcecfd0d1d2d3d4d5d6d7d8d9dadbdcdddedfe0e1e2e3e4e5e6e7e8e9eaebecedeeeff0f1f2f3f4f5f6f7f8f9fafbfcfdfeff000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f202122232425262728292a2b2c2d2e2f303132333435363738393a3b3c3d3e3f404142434445464748494a4b4c4d4e4f505152535455565758595a5b5c5d5e5f606162636465666768696a6b6c6d6e6f707172737475767778797a7b7c7d7e7f808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9fa0a1a2a3a4a5a6a7a8a9aaabacadaeafb0b1b2b3b4b5b6b7b8b9babbbcbdbebfc0c1c2c3c4c5c6c7c8c9cacbcccdcecfd0d1d2d3d4d5d6d7d8d9dadbdcdddedfe0e1e2e3e4e5e6e7e8e9eaebecedeeeff0f1f2f3f4f5f6f7f8f9fafbfcfdfeff"));
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        zzWjV = hashtable;
        hashtable.put(IDevicePopManager.SHA_1, 128);
        hashtable.put("SHA-224", 192);
        hashtable.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, 256);
        hashtable.put("SHA-384", 256);
        hashtable.put("SHA-512", 256);
        hashtable.put("SHA-512/224", 192);
        hashtable.put("SHA-512/256", 256);
    }

    public static int zzY(zzYUX zzyux) {
        return ((Integer) zzWjV.get(zzyux.zzXGi())).intValue();
    }

    public static int zzZ(zzYUR zzyur) {
        String strZzXGi = zzyur.zzXGi();
        return ((Integer) zzWjV.get(strZzXGi.substring(0, strZzXGi.indexOf("/")))).intValue();
    }

    public static boolean zzc(byte[] bArr, int i) {
        return bArr != null && bArr.length > i;
    }

    public static byte[] zzZ(zzYUX zzyux, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        int iZzQI = i2 / zzyux.zzQI();
        int iZzQI2 = zzyux.zzQI();
        byte[] bArr3 = new byte[iZzQI2];
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 <= iZzQI; i5++) {
            zzyux.update((byte) i3);
            zzyux.update((byte) (i >> 24));
            zzyux.update((byte) (i >> 16));
            zzyux.update((byte) (i >> 8));
            zzyux.update((byte) i);
            zzyux.update(bArr, 0, bArr.length);
            zzyux.doFinal(bArr3, 0);
            int i6 = i5 * iZzQI2;
            int i7 = i2 - i6;
            if (i7 > iZzQI2) {
                i7 = iZzQI2;
            }
            System.arraycopy(bArr3, 0, bArr2, i6, i7);
            i3++;
        }
        int i8 = i % 8;
        if (i8 != 0) {
            int i9 = 8 - i8;
            int i10 = 0;
            while (i4 != i2) {
                int i11 = bArr2[i4] & 255;
                bArr2[i4] = (byte) ((i10 << (8 - i9)) | (i11 >>> i9));
                i4++;
                i10 = i11;
            }
        }
        return bArr2;
    }
}
