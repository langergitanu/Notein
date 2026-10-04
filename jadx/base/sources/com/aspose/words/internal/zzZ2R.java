package com.aspose.words.internal;

import com.aspose.words.internal.zzZ2J;
import com.google.common.primitives.UnsignedBytes;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2R implements zzYZJ {
    private static final byte[] zzWk7;
    private static final Map<String, byte[][]> zzWkh;
    private static final Map<String, byte[][]> zzWki;
    private static final Map<String, byte[][]> zzWkj;
    private long zzWk8 = 0;
    private byte[] zzWk9;
    private byte[] zzWka;
    private int zzWkb;
    private boolean zzWkc;
    private int zzWkd;
    private int zzWke;
    private zzYV8 zzWkf;
    private zzZ5G zzWkg;

    static {
        HashMap map = new HashMap();
        zzWkj = map;
        HashMap map2 = new HashMap();
        zzWki = map2;
        HashMap map3 = new HashMap();
        zzWkh = map3;
        map.put("TRIPLEDES", new byte[][]{zzYGC.decode("09b2711937c5fc9fdf6f7e070625b41f74916ddb93b9f7a7c90091f86cdf2003a052e8d17bc37d86"), zzYGC.decode("b5c3c811e17247830be34f9461bf991401edbe99bc0dd6668b5d3f2501d2659bf99da71e38979e75")});
        map.put("AES-128", new byte[][]{zzYGC.decode("314069e227a6e4c59c402ac0f9189f921ef19673d16b3fd401ded2f3b8b1d19a1c3b11f948ba8e2a"), zzYGC.decode("36ccfd81909865e88091079bbd408e9943dd3bedf8e7521e43cd639fed11f482bb17a794ed0265f1")});
        map.put("AES-192", new byte[][]{zzYGC.decode("7ee353634fb8bd87bd4a2b292db7a049615bb8ae6a887efb8e81af7124453dac21949cfb51dd065f"), zzYGC.decode("8861d7165d9983a987e4ac39b9013ae41377f2134e5c7b57d6f8a3653e0ee616f0ddc9e11d85a8fd")});
        map.put("AES-256", new byte[][]{zzYGC.decode("f5771b72bb3c3ceeea5d4327159f7bcf5d3aed67adaa039528b3d5f846961700734ac1aa5d401709"), zzYGC.decode("a6b09617644ea00b797ce09060d23682b89a09c293fb5fac71ba77943421a7559557bd957bce64c9")});
        map3.put("TRIPLEDES", new byte[][]{zzYGC.decode("0102030405060708090a0b0c0d0e0f101112131415"), zzYGC.decode("0807060504030201")});
        map3.put("AES-128", new byte[][]{zzYGC.decode("0102030405060708090a0b0c0d0e0f10"), zzYGC.decode("100f0e0d0c0b0a090807060504030201")});
        map3.put("AES-192", new byte[][]{zzYGC.decode("0102030405060708090a0b0c0d0e0f101112131415161718"), zzYGC.decode("100f0e0d0c0b0a090807060504030201")});
        map3.put("AES-256", new byte[][]{zzYGC.decode("0102030405060708090a0b0c0d0e0f100102030405060708090a0b0c0d0e0f10"), zzYGC.decode("100f0e0d0c0b0a090807060504030201")});
        map2.put("TRIPLEDES", new byte[][]{zzYGC.decode("48ce7cefb4ec0f4a5a3b50c09a309675a9827404e01e0adff50a6d8d895d0308f6fffaf5e8159a8a"), zzYGC.decode("19d8a900cf51f131070cbbf22a7028edb42d79c836feb0a270e6703bf7d64ffa7bab66922bc7597b")});
        map2.put("AES-128", new byte[][]{zzYGC.decode("af649344a18257a1448aca5e7014c784cf01618ac354a4dd9b63b83f10fd4d31eff645b737619fd7"), zzYGC.decode("c63ff00c3f966108d53270633a945b87fd11d8344946589f1533617323895593229d060c0b25f53e")});
        map2.put("AES-192", new byte[][]{zzYGC.decode("544c683bd1538f349b62135813dc752ee329244ec83e037039dc35beb12a28ea505cdb81ec4bd61e"), zzYGC.decode("58dda13ba129e5ea009c8d0dac7cc5c998b84d52f759acfffa9bdd08d7cdbedc185114e270679e99")});
        map2.put("AES-256", new byte[][]{zzYGC.decode("e20e7e3e5fc4876ac58b412c20b0cd173e0c934762f32d558f84c7a533efcee1b1571253afe18551"), zzYGC.decode("bae2554712e8143be922d97125c7b88fd768dd7c359fc1fe413f6ba5cb83892fe4a407c8aec04762")});
        zzWk7 = zzYGC.decode("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    }

    public zzZ2R(zzYV8 zzyv8, int i, int i2, zzZ5G zzz5g, byte[] bArr, byte[] bArr2) {
        this.zzWkc = false;
        this.zzWkf = zzyv8;
        this.zzWke = i;
        this.zzWkd = (zzyv8.getBlockSize() * 8) + i;
        this.zzWkc = zzZ(zzyv8);
        zzZ(i2, zzz5g, bArr, bArr2);
    }

    private static void zzA(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private void zzF(byte[] bArr, byte[] bArr2) {
        byte[] bArrZzXGX = zzXGX();
        byte[] bArrZzV = zzYGU.zzV(bArrZzXGX, bArr2, bArr);
        zzYGU.fill(bArrZzXGX, (byte) 0);
        byte[] bArrZzd = zzd(bArrZzV, this.zzWkd);
        zzYGU.fill(bArrZzV, (byte) 0);
        int blockSize = this.zzWkf.getBlockSize();
        byte[] bArr3 = new byte[zzXGe()];
        this.zzWka = bArr3;
        this.zzWk9 = new byte[blockSize];
        zzX9(bArr3);
        zzXd(bArrZzd);
        zzYGU.fill(bArrZzd, (byte) 0);
        this.zzWk8 = 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzX9(byte[] bArr) {
        if (this.zzWkc) {
            byte[] bArr2 = new byte[24];
            zzX(bArr, 0, bArr2, 0);
            zzX(bArr, 7, bArr2, 8);
            zzX(bArr, 14, bArr2, 16);
            System.arraycopy(bArr2, 0, bArr, 0, 24);
            zzYGU.fill(bArr2, (byte) 0);
        }
    }

    private byte[] zzXGX() {
        byte[] bArrZzXGX = this.zzWkg.zzXGX();
        if (bArrZzXGX == null || bArrZzXGX.length < (this.zzWkb + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        return bArrZzXGX;
    }

    private int zzXGd() {
        return (this.zzWke + 7) / 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int zzXGe() {
        if (this.zzWkc) {
            return 24;
        }
        return zzXGd();
    }

    private static void zzXb(byte[] bArr) {
        int i = 1;
        for (int i2 = 1; i2 <= bArr.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
    }

    private void zzXc(byte[] bArr) {
        byte[] bArrZzXGX = zzXGX();
        byte[] bArrZzn = zzYGU.zzn(bArrZzXGX, bArr);
        zzYGU.fill(bArrZzXGX, (byte) 0);
        byte[] bArrZzd = zzd(bArrZzn, this.zzWkd);
        zzYGU.fill(bArrZzn, (byte) 0);
        zzXd(bArrZzd);
        zzYGU.fill(bArrZzd, (byte) 0);
        this.zzWk8 = 1L;
    }

    private void zzXd(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[this.zzWkf.getBlockSize()];
        int blockSize = this.zzWkf.getBlockSize();
        this.zzWkf.zzZ(true, new zzYS7(this.zzWka));
        int i = 0;
        while (true) {
            int i2 = i * blockSize;
            if (i2 >= bArr.length) {
                zzYGU.fill(bArr3, (byte) 0);
                zzY(bArr2, bArr, bArr2, 0);
                System.arraycopy(bArr2, 0, this.zzWka, 0, zzXGd());
                int iZzXGd = zzXGd();
                byte[] bArr4 = this.zzWk9;
                System.arraycopy(bArr2, iZzXGd, bArr4, 0, bArr4.length);
                zzYGU.fill(bArr2, (byte) 0);
                zzX9(this.zzWka);
                return;
            }
            zzXb(this.zzWk9);
            this.zzWkf.zzY(this.zzWk9, 0, bArr3, 0);
            int i3 = length - i2;
            if (i3 > blockSize) {
                i3 = blockSize;
            }
            System.arraycopy(bArr3, 0, bArr2, i2, i3);
            i++;
        }
    }

    public static /* synthetic */ int zzZ(zzZ2R zzz2r, zzYV8 zzyv8, int i) {
        return zzZ(zzyv8, i);
    }

    private byte[] zzd(byte[] bArr, int i) {
        int blockSize = this.zzWkf.getBlockSize();
        int length = bArr.length;
        byte[] bArr2 = new byte[((((length + 9) + blockSize) - 1) / blockSize) * blockSize];
        zzA(bArr2, length, 0);
        zzA(bArr2, i / 8, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = UnsignedBytes.MAX_POWER_OF_TWO;
        int iZzXGd = zzXGd() + blockSize;
        byte[] bArr3 = new byte[iZzXGd];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        byte[] bArr6 = new byte[zzXGe()];
        System.arraycopy(zzWk7, 0, bArr6, 0, zzXGd());
        zzX9(bArr6);
        zzYS7 zzys7 = new zzYS7(bArr6);
        int i2 = 0;
        while (true) {
            int i3 = i2 * blockSize;
            if (i3 * 8 >= (blockSize * 8) + this.zzWke) {
                break;
            }
            zzA(bArr5, i2, 0);
            zzZ(bArr4, zzys7, bArr5, bArr2);
            int i4 = iZzXGd - i3;
            if (i4 > blockSize) {
                i4 = blockSize;
            }
            System.arraycopy(bArr4, 0, bArr3, i3, i4);
            i2++;
        }
        zzYGU.fill(bArr2, (byte) 0);
        zzYGU.fill(bArr4, (byte) 0);
        zzYGU.fill(bArr5, (byte) 0);
        byte[] bArr7 = new byte[blockSize];
        System.arraycopy(bArr3, 0, bArr6, 0, zzXGd());
        System.arraycopy(bArr3, zzXGd(), bArr7, 0, blockSize);
        zzYGU.fill(bArr3, (byte) 0);
        zzX9(bArr6);
        int i5 = i / 2;
        byte[] bArr8 = new byte[i5];
        this.zzWkf.zzZ(true, new zzYS7(bArr6));
        int i6 = 0;
        while (true) {
            int i7 = i6 * blockSize;
            if (i7 >= i5) {
                zzYGU.fill(bArr7, (byte) 0);
                zzYGU.fill(bArr6, (byte) 0);
                return bArr8;
            }
            this.zzWkf.zzY(bArr7, 0, bArr7, 0);
            int i8 = i5 - i7;
            if (i8 > blockSize) {
                i8 = blockSize;
            }
            System.arraycopy(bArr7, 0, bArr8, i7, i8);
            i6++;
        }
    }

    public final void finalize() throws Throwable {
        zzYGU.fill(this.zzWka, (byte) 0);
        zzYGU.fill(this.zzWk9, (byte) 0);
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final int zzXGf() {
        return this.zzWkb;
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final void zzXa(byte[] bArr) {
        zzXc(bArr);
    }

    private static void zzX(byte[] bArr, int i, byte[] bArr2, int i2) {
        bArr2[i2] = (byte) (bArr[i] & 254);
        int i3 = i + 1;
        bArr2[i2 + 1] = (byte) ((bArr[i] << 7) | ((bArr[i3] & 252) >>> 1));
        int i4 = bArr[i3] << 6;
        int i5 = i + 2;
        bArr2[i2 + 2] = (byte) (i4 | ((bArr[i5] & 248) >>> 2));
        int i6 = bArr[i5] << 5;
        int i7 = i + 3;
        bArr2[i2 + 3] = (byte) (i6 | ((bArr[i7] & 240) >>> 3));
        int i8 = bArr[i7] << 4;
        int i9 = i + 4;
        bArr2[i2 + 4] = (byte) (i8 | ((bArr[i9] & 224) >>> 4));
        int i10 = bArr[i9] << 3;
        int i11 = i + 5;
        bArr2[i2 + 5] = (byte) (i10 | ((bArr[i11] & 192) >>> 5));
        int i12 = i + 6;
        bArr2[i2 + 6] = (byte) ((bArr[i11] << 2) | ((bArr[i12] & UnsignedBytes.MAX_POWER_OF_TWO) >>> 6));
        int i13 = i2 + 7;
        bArr2[i13] = (byte) (bArr[i12] << 1);
        while (i2 <= i13) {
            byte b = bArr2[i2];
            bArr2[i2] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
            i2++;
        }
    }

    private static void zzY(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr2[i2] ^ bArr3[i2 + i]);
        }
    }

    @Override // com.aspose.words.internal.zzYZJ, com.aspose.words.internal.zzZ2M
    public final int zzY(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] bArrZzd;
        if (z) {
            zzXc(bArr2);
            bArr2 = null;
        }
        if (this.zzWkc) {
            if (this.zzWk8 > 2147483648L) {
                return -1;
            }
            if (zzZ2J.zzc(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (this.zzWk8 > 140737488355328L) {
                return -1;
            }
            if (zzZ2J.zzc(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (bArr2 != null) {
            bArrZzd = zzd(bArr2, this.zzWkd);
            zzXd(bArrZzd);
        } else {
            bArrZzd = new byte[this.zzWkd];
        }
        int length = this.zzWk9.length;
        byte[] bArr3 = new byte[length];
        this.zzWkf.zzZ(true, new zzYS7(this.zzWka));
        for (int i = 0; i <= bArr.length / length; i++) {
            int i2 = i * length;
            int length2 = bArr.length - i2 > length ? length : bArr.length - (this.zzWk9.length * i);
            if (length2 != 0) {
                zzXb(this.zzWk9);
                this.zzWkf.zzY(this.zzWk9, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i2, length2);
            }
        }
        zzXd(bArrZzd);
        zzYGU.fill(bArrZzd, (byte) 0);
        this.zzWk8++;
        return bArr.length * 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzZ(int i, zzZ5G zzz5g, byte[] bArr, byte[] bArr2) {
        if (i <= 256) {
            if (zzZ(this.zzWkf, this.zzWke) >= i) {
                if (zzz5g.zzXGW() >= i) {
                    this.zzWkg = zzz5g;
                    this.zzWkb = i;
                    zzF(bArr, bArr2);
                    return;
                }
                throw new IllegalArgumentException("Not enough entropy for security strength required");
            }
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    private void zzZ(byte[] bArr, zzYS8 zzys8, byte[] bArr2, byte[] bArr3) {
        int blockSize = this.zzWkf.getBlockSize();
        byte[] bArr4 = new byte[blockSize];
        int length = bArr3.length / blockSize;
        byte[] bArr5 = new byte[blockSize];
        this.zzWkf.zzZ(true, zzys8);
        this.zzWkf.zzY(bArr2, 0, bArr4, 0);
        for (int i = 0; i < length; i++) {
            zzY(bArr5, bArr4, bArr3, i * blockSize);
            this.zzWkf.zzY(bArr5, 0, bArr4, 0);
        }
        System.arraycopy(bArr4, 0, bArr, 0, bArr.length);
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzZ(zzZ1P zzz1p) {
        return new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ2R.1
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                byte[] bArr = zzZ2R.this.zzWka;
                byte[] bArr2 = zzZ2R.this.zzWk9;
                long j = zzZ2R.this.zzWk8;
                zzZ5G zzz5g = zzZ2R.this.zzWkg;
                try {
                    byte[] bArrDecode = zzYGC.decode("404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F70717273747576");
                    byte[] bArrDecode2 = zzYGC.decode("2021222324");
                    zzZ2R zzz2r = zzZ2R.this;
                    int iZzZ = zzZ2R.zzZ(zzz2r, zzz2r.zzWkf, zzZ2R.this.zzWke);
                    byte[][] bArr3 = (byte[][]) zzZ2R.zzWkj.get(this.zzWjX.getName());
                    zzZ2R zzz2r2 = zzZ2R.this;
                    zzz2r2.zzZ(zzz2r2.zzWkb, new zzZ2J.zzZ().zzg0(iZzZ), bArrDecode, bArrDecode2);
                    byte[] bArr4 = new byte[bArr3[0].length];
                    zzZ2R.this.zzY(bArr4, null, true);
                    if (!zzYGU.zzp(bArr3[0], bArr4)) {
                        zzYZE.zzTQ("DRBG Block 1 KAT failure");
                    }
                    byte[] bArr5 = new byte[bArr3[1].length];
                    zzZ2R.this.zzY(bArr5, null, true);
                    if (!zzYGU.zzp(bArr3[1], bArr5)) {
                        zzYZE.zzTQ("DRBG Block 2 KAT failure");
                    }
                    try {
                        zzZ2R zzz2r3 = zzZ2R.this;
                        zzz2r3.zzZ(zzz2r3.zzWkb, new zzZ2J.zzY(iZzZ), bArrDecode, bArrDecode2);
                        zzYZE.zzTQ("DRBG LyingEntropySource not detected in init");
                    } catch (IllegalStateException e) {
                        if (!e.getMessage().equals("Insufficient entropy provided by entropy source")) {
                            zzYZE.zzTQ("DRBG self test failed init entropy check");
                        }
                    }
                    try {
                        zzZ2R zzz2r4 = zzZ2R.this;
                        zzz2r4.zzZ(zzz2r4.zzWkb, new zzZ2J.zzY(20), bArrDecode, bArrDecode2);
                        zzYZE.zzTQ("DRBG insufficient EntropySource not detected");
                    } catch (IllegalArgumentException e2) {
                        if (!e2.getMessage().equals("Not enough entropy for security strength required")) {
                            zzYZE.zzTQ("DRBG self test failed init entropy check");
                        }
                    }
                    try {
                        zzZ2R.this.zzWkg = new zzZ2J.zzY(iZzZ);
                        zzZ2R.this.zzXa(null);
                        zzYZE.zzTQ("DRBG LyingEntropySource not detected in reseed");
                    } catch (IllegalStateException e3) {
                        if (!e3.getMessage().equals("Insufficient entropy provided by entropy source")) {
                            zzYZE.zzTQ("DRBG self test failed reseed entropy check");
                        }
                    }
                    try {
                        zzZ2R.this.zzZ(iZzZ + 1, new zzZ2J.zzZ().zzg0(iZzZ), bArrDecode, bArrDecode2);
                        zzYZE.zzTQ("DRBG successful initialise with too high security strength");
                    } catch (IllegalArgumentException e4) {
                        if (!e4.getMessage().equals("Requested security strength is not supported by the derivation function")) {
                            zzYZE.zzTQ("DRBG self test failed init security strength check");
                        }
                    }
                    zzZ2R.this.zzWka = bArr;
                    zzZ2R.this.zzWk9 = bArr2;
                    zzZ2R.this.zzWk8 = j;
                    zzZ2R.this.zzWkg = zzz5g;
                } catch (Throwable th) {
                    zzZ2R.this.zzWka = bArr;
                    zzZ2R.this.zzWk9 = bArr2;
                    zzZ2R.this.zzWk8 = j;
                    zzZ2R.this.zzWkg = zzz5g;
                    throw th;
                }
            }
        };
    }

    private static boolean zzZ(zzYV8 zzyv8) {
        return zzyv8.zzXGi().equals("DESede") || zzyv8.zzXGi().equals("TDEA");
    }

    private static int zzZ(zzYV8 zzyv8, int i) {
        if (zzZ(zzyv8) && i == 168) {
            return 112;
        }
        if (zzyv8.zzXGi().equals(AES256KeyLoader.AES_ALGORITHM)) {
            return i;
        }
        return -1;
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzY(zzZ1P zzz1p) {
        return new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ2R.2
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                byte[] bArr = zzZ2R.this.zzWka;
                byte[] bArr2 = zzZ2R.this.zzWk9;
                long j = zzZ2R.this.zzWk8;
                zzZ5G zzz5g = zzZ2R.this.zzWkg;
                try {
                    byte[] bArrDecode = zzYGC.decode("404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F70717273747576");
                    zzZ2R zzz2r = zzZ2R.this;
                    int iZzZ = zzZ2R.zzZ(zzz2r, zzz2r.zzWkf, zzZ2R.this.zzWke);
                    byte[][] bArr3 = (byte[][]) zzZ2R.zzWki.get(this.zzWjX.getName());
                    byte[][] bArr4 = (byte[][]) zzZ2R.zzWkh.get(this.zzWjX.getName());
                    byte[] bArr5 = bArr4[0];
                    zzZ2R zzz2r2 = zzZ2R.this;
                    zzz2r2.zzWka = new byte[zzz2r2.zzXGe()];
                    System.arraycopy(bArr5, 0, zzZ2R.this.zzWka, 0, bArr5.length);
                    zzZ2R zzz2r3 = zzZ2R.this;
                    zzz2r3.zzX9(zzz2r3.zzWka);
                    zzZ2R.this.zzWk9 = zzYGU.zzVI(bArr4[1]);
                    zzZ2R.this.zzWkg = new zzZ2J.zzZ().zzg0(iZzZ);
                    zzZ2R.this.zzXa(bArrDecode);
                    if (zzZ2R.this.zzWk8 != 1) {
                        zzYZE.zzTQ("DRBG reseedCounter failed to reset");
                    }
                    byte[] bArr6 = new byte[bArr3[0].length];
                    zzZ2R.this.zzY(bArr6, null, false);
                    if (!zzYGU.zzp(bArr3[0], bArr6)) {
                        zzYZE.zzTQ("DRBG Block 1 reseed KAT failure");
                    }
                    byte[] bArr7 = new byte[bArr3[1].length];
                    zzZ2R.this.zzY(bArr7, null, false);
                    if (!zzYGU.zzp(bArr3[1], bArr7)) {
                        zzYZE.zzTQ("DRBG Block 2 reseed KAT failure");
                    }
                    try {
                        zzZ2R.this.zzWkg = new zzZ2J.zzY(iZzZ);
                        zzZ2R.this.zzXa(null);
                        zzYZE.zzTQ("DRBG LyingEntropySource not detected");
                    } catch (IllegalStateException e) {
                        if (!e.getMessage().equals("Insufficient entropy provided by entropy source")) {
                            zzYZE.zzTQ("DRBG self test failed reseed entropy check");
                        }
                    }
                    zzZ2R.this.zzWka = bArr;
                    zzZ2R.this.zzWk9 = bArr2;
                    zzZ2R.this.zzWk8 = j;
                    zzZ2R.this.zzWkg = zzz5g;
                } catch (Throwable th) {
                    zzZ2R.this.zzWka = bArr;
                    zzZ2R.this.zzWk9 = bArr2;
                    zzZ2R.this.zzWk8 = j;
                    zzZ2R.this.zzWkg = zzz5g;
                    throw th;
                }
            }
        };
    }
}
