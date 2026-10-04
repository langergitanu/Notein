package com.aspose.words.internal;

import com.aspose.words.internal.zzZ2J;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ0E implements zzYZJ {
    private static final Map<String, byte[][]> zzWkh;
    private static final Map<String, byte[][]> zzWki;
    private static final Map<String, byte[][]> zzWkj;
    private byte[] zzWcA;
    private zzYUR zzWcz;
    private long zzWk8;
    private byte[] zzWk9;
    private int zzWkb;
    private zzZ5G zzWkg;

    static {
        HashMap map = new HashMap();
        zzWkj = map;
        HashMap map2 = new HashMap();
        zzWki = map2;
        HashMap map3 = new HashMap();
        zzWkh = map3;
        map.put("SHA-1/HMAC", new byte[][]{zzYGC.decode("09e8e2eab9b4acfcea6fc8f8e98a25ff0481ced2ad65e9682e347965529c421b0ee65f1af7f06657"), zzYGC.decode("7982a3a8c3a737407ca1f6f3821f1d1ed1d1acfbf3e6a2d830ee702063ef42992de2b4f5c3157310")});
        map.put("SHA-224/HMAC", new byte[][]{zzYGC.decode("24eff5d06816cd3da66f7888ca2c80d4416ed1adb35040492b8d1a06cf280382fcd4008f0e7809db"), zzYGC.decode("d014b676e03610a8addf59b25ccf227758b72c7fb218e3308336188352acbe12ac3e4d43837e7320")});
        map.put("SHA-256/HMAC", new byte[][]{zzYGC.decode("c8eb1ed8c27c86fad174c8445b1a8401735cabd847a533ddf75bb43fe1bed58916ed222d10715dd5"), zzYGC.decode("67cf599a5a80d7cdf6113468e6f1dd66bd4e9864511f5913749511ac56a3f3a75fb0b68c5502444d")});
        map.put("SHA-384/HMAC", new byte[][]{zzYGC.decode("7a70bad84ceeb34ddfae4fe0e7911f3772b9bcdc95fc373254be4c64282e517e8b5346440d73e6b6"), zzYGC.decode("7d68e490dbc4c0043eb3510ec1cee55b4718bfcfc4e93f3341fa3bbc0513e92ef38f40f2ffe04b4b")});
        map.put("SHA-512/HMAC", new byte[][]{zzYGC.decode("7223e2b58fb4b987cbd25f0b01a19135ca5cd78ccc16e8e5f8c6efd33fe2a71a97c3c8456fba6507"), zzYGC.decode("e90ee5626d5266cf6b70d118b07a0d4dd06ff0db4a65248628eadb88d9994f8e59a093b4ad217a83")});
        map.put("SHA-512(224)/HMAC", new byte[][]{zzYGC.decode("0c1563ed502a9e9b33fc3beb8adced92f7440b346f311ffd3727a14d461f9199a6ef3c827a5199fb"), zzYGC.decode("40dc8b5b304cf82ddd4d47c69ba0743b242bddabf393353ed78867b947b2f8e6a553605253b62356")});
        map.put("SHA-512(256)/HMAC", new byte[][]{zzYGC.decode("a9c1c62095292f475eb8a2a80890f9b3d77b9b42d4ef446881315d3531eccb5430c6659a4fc3c63b"), zzYGC.decode("1c0d60c8a99603ef18588d5c441c9ed2db93b682f810af39dc60296d8ea102505004f9b9fdf3cbc6")});
        map3.put("SHA-1/HMAC", new byte[][]{zzYGC.decode("7bedcd650a8ddbb58b3d3e931c258b11ef0405ab"), zzYGC.decode("8d95ddbc7ccc68982e5885b3ff0124cf22997231")});
        map3.put("SHA-224/HMAC", new byte[][]{zzYGC.decode("dc23db9b7f9f20b47c5f66a20a3e814062761a85813d513fa68fffb6"), zzYGC.decode("da520ecafcbd13c1af9d6882a98c13e906b9497b4c6b0ce97f3cf6f4")});
        map3.put("SHA-256/HMAC", new byte[][]{zzYGC.decode("d4f6183d6bc347533ce1d35bb15b0827516d13c7596f08be8640ede806f11558"), zzYGC.decode("035efd9db053cd09a42c5386c6cee390a24de11de7d0ab447bfaa89e4cf1ea5c")});
        map3.put("SHA-384/HMAC", new byte[][]{zzYGC.decode("1b6b3e7460776ddb5a6cb339f3b8e4184543e53a9067a20317866ccf437eca98802058612fbd926770653221917e3208"), zzYGC.decode("dccd578a26ca50c2e65a5812e049f79fa90e5fa01ce2542a34bbe4fb35e2ef1955d1d48b823b69ff45e67e7757b75a98")});
        map3.put("SHA-512/HMAC", new byte[][]{zzYGC.decode("394c512894673b146c3539f2ad708d49658fbb0cc305e06e2311267b0d97fc2daf76483d0b7824cf70b7dc035ee2cb206168f5616abc162976d970ba912cb45a"), zzYGC.decode("2269652d19f62a7da40a3a2e67cad2065209f26268fab3ff924fff91afef349a70bdb63599013936fbe98f1d7267cbc1ae6817264bfb8aead91c421b4a2f344f")});
        map3.put("SHA-512(224)/HMAC", new byte[][]{zzYGC.decode("46a8083d5553f1372297d1915e848e0c94f508fd39fc3937dde0f719"), zzYGC.decode("6d61dd2447807e8a630468383f5b59393e8a0b2860f614198aa03f7a")});
        map3.put("SHA-512(256)/HMAC", new byte[][]{zzYGC.decode("93c284295b6ba606037d63f8912ba22036f6e40c19d872935b71f944c323209e"), zzYGC.decode("e499e4e92dabcb0efd6d99cc5798f85cafc114f8fd9dc895b6212b92026fecc0")});
        map2.put("SHA-1/HMAC", new byte[][]{zzYGC.decode("9d27edc5b266cdaeb53e1cbff2c7f45375a64bdb4c0494bf270ea0123f392dbfa7579ae28ca26b4e"), zzYGC.decode("ffbf224df85dbaa8bf456cf77d2119cb5e7f96d9a16f2193d7bf222be9c367ea7365d8d380ac8df8")});
        map2.put("SHA-224/HMAC", new byte[][]{zzYGC.decode("78db8e7652435e8658ca8489939d503a717faeaf65a417ab56f152fe34f22adca2257ba7391c7b95"), zzYGC.decode("29124d827d159924f7c1a92558cd035c07efc26d244215a03cdbfcf83be2977ca52694f395de9792")});
        map2.put("SHA-256/HMAC", new byte[][]{zzYGC.decode("2855b533c124d5acd070dcadfd9105d74aae4ceecfc0d848559e35b5860c10facb021ba31b216dbc"), zzYGC.decode("08d4e9daf7265a606af90c7b661468e96f097734de89f23bda6b6e4f3308c31714ca200d7b0ddd2e")});
        map2.put("SHA-384/HMAC", new byte[][]{zzYGC.decode("a18f64766084ab908389dc1ed23485b67f6383278b436ccdf335a495572dc11c338e65bad9a09ec4"), zzYGC.decode("dacaf121aac01c68e8171a0926e974e2008ea5403230c133258ac1f99a349bdc185ad500983ee988")});
        map2.put("SHA-512/HMAC", new byte[][]{zzYGC.decode("80530aa6df83038ee721f28da155be91780f5aefb3278d048102b9e1d18ad3ef8b9ced43da3e2b5c"), zzYGC.decode("104a35b8b289f49658521d2f408633fe677bea064ff7673d3d844d060239fd9f8db9681b11c42d8a")});
        map2.put("SHA-512(224)/HMAC", new byte[][]{zzYGC.decode("046157b89fe2d0e98f0d403e8b7b6764c6c441c63dd6b1a4977a427810812e01733460e2d0eeeee5"), zzYGC.decode("ba49668623438e669d1a4764a33611467517d83ad266aa6be086fced53c8d5508c77ae6d34b7080d")});
        map2.put("SHA-512(256)/HMAC", new byte[][]{zzYGC.decode("90965e6618c74e5ee1a7ee4b7e6d9b7d1dd791cb57d7f255a50ef6571731ad6e20e373e222bdc3f4"), zzYGC.decode("ec3fde0e481624700da0e355daa9b75585bc1d973a03e85ee3887afa6d40b9231c7f9ebe09bfe97c")});
    }

    public zzZ0E(zzYUR zzyur, int i, zzZ5G zzz5g, byte[] bArr, byte[] bArr2) {
        zzZ(zzyur, i, zzz5g, bArr, bArr2);
    }

    private void zzWS(byte[] bArr) {
        try {
            zzWT(bArr);
            zzYGU.fill(bArr, (byte) 0);
            this.zzWk8 = 1L;
        } catch (Throwable th) {
            zzYGU.fill(bArr, (byte) 0);
            throw th;
        }
    }

    private void zzWT(byte[] bArr) {
        zzV(bArr, (byte) 0);
        if (bArr != null) {
            zzV(bArr, (byte) 1);
        }
    }

    private byte[] zzXGX() {
        byte[] bArrZzXGX = this.zzWkg.zzXGX();
        if (bArrZzXGX == null || bArrZzXGX.length < (this.zzWkb + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        return bArrZzXGX;
    }

    public final void finalize() throws Throwable {
        zzYGU.fill(this.zzWcA, (byte) 0);
        zzYGU.fill(this.zzWk9, (byte) 0);
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final int zzXGf() {
        return this.zzWkb;
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final void zzXa(byte[] bArr) {
        byte[] bArrZzXGX = zzXGX();
        byte[] bArrZzn = zzYGU.zzn(bArrZzXGX, bArr);
        zzYGU.fill(bArrZzXGX, (byte) 0);
        zzWS(bArrZzn);
    }

    private void zzV(byte[] bArr, byte b) {
        this.zzWcz.zzZ(new zzYS7(this.zzWcA));
        zzYUR zzyur = this.zzWcz;
        byte[] bArr2 = this.zzWk9;
        zzyur.update(bArr2, 0, bArr2.length);
        this.zzWcz.update(b);
        if (bArr != null) {
            this.zzWcz.update(bArr, 0, bArr.length);
        }
        this.zzWcz.doFinal(this.zzWcA, 0);
        this.zzWcz.zzZ(new zzYS7(this.zzWcA));
        zzYUR zzyur2 = this.zzWcz;
        byte[] bArr3 = this.zzWk9;
        zzyur2.update(bArr3, 0, bArr3.length);
        this.zzWcz.doFinal(this.zzWk9, 0);
    }

    @Override // com.aspose.words.internal.zzYZJ, com.aspose.words.internal.zzZ2M
    public final int zzY(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (z) {
            zzXa(bArr2);
            bArr2 = null;
        }
        if (this.zzWk8 > 140737488355328L) {
            return -1;
        }
        if (bArr2 != null) {
            zzWT(bArr2);
        }
        int length2 = bArr.length;
        byte[] bArr3 = new byte[length2];
        int length3 = bArr.length / this.zzWk9.length;
        this.zzWcz.zzZ(new zzYS7(this.zzWcA));
        for (int i = 0; i < length3; i++) {
            zzYUR zzyur = this.zzWcz;
            byte[] bArr4 = this.zzWk9;
            zzyur.update(bArr4, 0, bArr4.length);
            this.zzWcz.doFinal(this.zzWk9, 0);
            byte[] bArr5 = this.zzWk9;
            System.arraycopy(bArr5, 0, bArr3, bArr5.length * i, bArr5.length);
        }
        byte[] bArr6 = this.zzWk9;
        if (bArr6.length * length3 < length2) {
            this.zzWcz.update(bArr6, 0, bArr6.length);
            this.zzWcz.doFinal(this.zzWk9, 0);
            byte[] bArr7 = this.zzWk9;
            System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
        }
        zzWT(bArr2);
        this.zzWk8++;
        System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzZ(zzYUR zzyur, int i, zzZ5G zzz5g, byte[] bArr, byte[] bArr2) {
        if (i <= zzZ2J.zzZ(zzyur)) {
            if (zzz5g.zzXGW() >= i) {
                this.zzWkb = i;
                this.zzWcz = zzyur;
                this.zzWkg = zzz5g;
                byte[] bArr3 = new byte[zzyur.zzXDn()];
                this.zzWcA = bArr3;
                byte[] bArr4 = new byte[bArr3.length];
                this.zzWk9 = bArr4;
                zzYGU.fill(bArr4, (byte) 1);
                byte[] bArrZzXGX = zzXGX();
                byte[] bArrZzV = zzYGU.zzV(bArrZzXGX, bArr2, bArr);
                zzYGU.fill(bArrZzXGX, (byte) 0);
                zzWS(bArrZzV);
                return;
            }
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzZ(zzZ1P zzz1p) {
        return new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ0E.1
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                String str;
                byte[] bArr;
                byte[] bArr2 = zzZ0E.this.zzWcA;
                byte[] bArr3 = zzZ0E.this.zzWk9;
                long j = zzZ0E.this.zzWk8;
                zzZ5G zzz5g = zzZ0E.this.zzWkg;
                try {
                    byte[] bArrDecode = zzYGC.decode("404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F70717273747576");
                    byte[] bArrDecode2 = zzYGC.decode("2021222324");
                    int iZzZ = zzZ2J.zzZ(zzZ0E.this.zzWcz);
                    byte[][] bArr4 = (byte[][]) zzZ0E.zzWkj.get(this.zzWjX.getName());
                    zzZ0E zzz0e = zzZ0E.this;
                    zzz0e.zzZ(zzz0e.zzWcz, zzZ0E.this.zzWkb, new zzZ2J.zzZ().zzg0(iZzZ), bArrDecode, bArrDecode2);
                    byte[] bArr5 = new byte[bArr4[0].length];
                    zzZ0E.this.zzY(bArr5, null, true);
                    if (!zzYGU.zzp(bArr4[0], bArr5)) {
                        zzYZE.zzTQ("DRBG Block 1 KAT failure");
                    }
                    byte[] bArr6 = new byte[bArr4[1].length];
                    zzZ0E.this.zzY(bArr6, null, true);
                    if (!zzYGU.zzp(bArr4[1], bArr6)) {
                        zzYZE.zzTQ("DRBG Block 2 KAT failure");
                    }
                    try {
                        zzZ0E zzz0e2 = zzZ0E.this;
                        try {
                            str = "DRBG self test failed init entropy check";
                            bArr = null;
                            try {
                                zzz0e2.zzZ(zzz0e2.zzWcz, zzZ0E.this.zzWkb, new zzZ2J.zzY(iZzZ), bArrDecode, bArrDecode2);
                                zzYZE.zzTQ("DRBG LyingEntropySource not detected in init");
                            } catch (IllegalStateException e) {
                                e = e;
                                if (!e.getMessage().equals("Insufficient entropy provided by entropy source")) {
                                    zzYZE.zzTQ(str);
                                }
                            }
                        } catch (IllegalStateException e2) {
                            e = e2;
                            str = "DRBG self test failed init entropy check";
                            bArr = null;
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        str = "DRBG self test failed init entropy check";
                        bArr = null;
                    }
                    try {
                        zzZ0E zzz0e3 = zzZ0E.this;
                        zzz0e3.zzZ(zzz0e3.zzWcz, zzZ0E.this.zzWkb, new zzZ2J.zzY(20), bArrDecode, bArrDecode2);
                        zzYZE.zzTQ("DRBG insufficient EntropySource not detected");
                    } catch (IllegalArgumentException e4) {
                        if (!e4.getMessage().equals("Not enough entropy for security strength required")) {
                            zzYZE.zzTQ(str);
                        }
                    }
                    try {
                        zzZ0E.this.zzWkg = new zzZ2J.zzY(iZzZ);
                        zzZ0E.this.zzXa(bArr);
                        zzYZE.zzTQ("DRBG LyingEntropySource not detected in reseed");
                    } catch (IllegalStateException e5) {
                        if (!e5.getMessage().equals("Insufficient entropy provided by entropy source")) {
                            zzYZE.zzTQ("DRBG self test failed reseed entropy check");
                        }
                    }
                    try {
                        zzZ0E zzz0e4 = zzZ0E.this;
                        zzz0e4.zzZ(zzz0e4.zzWcz, iZzZ + 1, new zzZ2J.zzZ().zzg0(iZzZ), bArrDecode, bArrDecode2);
                        zzYZE.zzTQ("DRBG successful initialise with too high security strength");
                    } catch (IllegalArgumentException e6) {
                        if (!e6.getMessage().equals("Requested security strength is not supported by the derivation function")) {
                            zzYZE.zzTQ("DRBG self test failed init security strength check");
                        }
                    }
                    zzZ0E.this.zzWcA = bArr2;
                    zzZ0E.this.zzWk9 = bArr3;
                    zzZ0E.this.zzWk8 = j;
                    zzZ0E.this.zzWkg = zzz5g;
                } catch (Throwable th) {
                    zzZ0E.this.zzWcA = bArr2;
                    zzZ0E.this.zzWk9 = bArr3;
                    zzZ0E.this.zzWk8 = j;
                    zzZ0E.this.zzWkg = zzz5g;
                    throw th;
                }
            }
        };
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzY(zzZ1P zzz1p) {
        return new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ0E.2
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                byte[] bArr = zzZ0E.this.zzWcA;
                byte[] bArr2 = zzZ0E.this.zzWk9;
                long j = zzZ0E.this.zzWk8;
                zzZ5G zzz5g = zzZ0E.this.zzWkg;
                try {
                    byte[] bArrDecode = zzYGC.decode("404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F70717273747576");
                    int iZzZ = zzZ2J.zzZ(zzZ0E.this.zzWcz);
                    byte[][] bArr3 = (byte[][]) zzZ0E.zzWki.get(this.zzWjX.getName());
                    byte[][] bArr4 = (byte[][]) zzZ0E.zzWkh.get(this.zzWjX.getName());
                    zzZ0E.this.zzWcA = zzYGU.zzVI(bArr4[0]);
                    zzZ0E.this.zzWk9 = zzYGU.zzVI(bArr4[1]);
                    zzZ0E.this.zzWkg = new zzZ2J.zzZ().zzg0(iZzZ);
                    zzZ0E.this.zzXa(bArrDecode);
                    if (zzZ0E.this.zzWk8 != 1) {
                        zzYZE.zzTQ("DRBG reseedCounter failed to reset");
                    }
                    byte[] bArr5 = new byte[bArr3[0].length];
                    zzZ0E.this.zzY(bArr5, null, false);
                    if (!zzYGU.zzp(bArr3[0], bArr5)) {
                        zzYZE.zzTQ("DRBG Block 1 reseed KAT failure");
                    }
                    byte[] bArr6 = new byte[bArr3[1].length];
                    zzZ0E.this.zzY(bArr6, null, false);
                    if (!zzYGU.zzp(bArr3[1], bArr6)) {
                        zzYZE.zzTQ("DRBG Block 2 reseed KAT failure");
                    }
                    try {
                        zzZ0E.this.zzWkg = new zzZ2J.zzY(iZzZ);
                        zzZ0E.this.zzXa(null);
                        zzYZE.zzTQ("DRBG LyingEntropySource not detected");
                    } catch (IllegalStateException e) {
                        if (!e.getMessage().equals("Insufficient entropy provided by entropy source")) {
                            zzYZE.zzTQ("DRBG self test failed reseed entropy check");
                        }
                    }
                    zzZ0E.this.zzWcA = bArr;
                    zzZ0E.this.zzWk9 = bArr2;
                    zzZ0E.this.zzWk8 = j;
                    zzZ0E.this.zzWkg = zzz5g;
                } catch (Throwable th) {
                    zzZ0E.this.zzWcA = bArr;
                    zzZ0E.this.zzWk9 = bArr2;
                    zzZ0E.this.zzWk8 = j;
                    zzZ0E.this.zzWkg = zzz5g;
                    throw th;
                }
            }
        };
    }
}
