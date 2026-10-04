package com.aspose.words.internal;

import com.aspose.words.internal.zzZ2J;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ0D implements zzYZJ {
    private static final Map<String, byte[]> zzWcu;
    private static final Hashtable zzWcv;
    private static final Map<String, byte[][]> zzWki;
    private static final Map<String, byte[][]> zzWkj;
    private byte[] zzWct;
    private zzYUX zzWhn;
    private long zzWk8;
    private byte[] zzWk9;
    private int zzWkb;
    private int zzWkd;
    private zzZ5G zzWkg;
    private static final byte[] zzWcx = {0};
    private static final byte[] zzWcw = {1};

    static {
        Hashtable hashtable = new Hashtable();
        zzWcv = hashtable;
        HashMap map = new HashMap();
        zzWkj = map;
        HashMap map2 = new HashMap();
        zzWcu = map2;
        HashMap map3 = new HashMap();
        zzWki = map3;
        hashtable.put(IDevicePopManager.SHA_1, 440);
        hashtable.put("SHA-224", 440);
        hashtable.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, 440);
        hashtable.put("SHA-512/256", 440);
        hashtable.put("SHA-512/224", 440);
        hashtable.put("SHA-384", 888);
        hashtable.put("SHA-512", 888);
        map.put(IDevicePopManager.SHA_1, new byte[][]{zzYGC.decode("61a50e3970bdb72c7ebf2a6225519ea2f324148123a3503443ec80993a62c4ea6528ff4f5f4fe778"), zzYGC.decode("71adf1e44be3e0a6af022d6e79aad42a99d8261ef41e06c3efed4ac8bf9687e8e1bab92da552e109")});
        map.put("SHA-224", new byte[][]{zzYGC.decode("5be6d688ee42f489506a5a3407380325c633627f8c2458c1d82fc9a3db5787565c9d6c5e0e32b5f0"), zzYGC.decode("3726e8c434f91c2fdd6d80621e79005f38320932ca9da5edad095eeff18693b7908f936268e20b58")});
        map.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, new byte[][]{zzYGC.decode("788dd696649d97295de7ed10a2c55104abb36cd0f262abdc2b8b2b183a3602c3f7513d2a4893b759"), zzYGC.decode("3db6a852f92035e4890fa53438cf8070020a95ae19f1098f98a4d4bdb65f3c5c2dd4c9fb5483410d")});
        map.put("SHA-384", new byte[][]{zzYGC.decode("0536f72f4123b8e438981912b3c60b09d1303a93b7cbe4af13cd3ae01d389720ff687916135bb254"), zzYGC.decode("80ae6b3d1a120d9f58d427a178c7d73d429758f6039962b66f8afbc7fa758228b13b8f5829588cd6")});
        map.put("SHA-512", new byte[][]{zzYGC.decode("ca8387ba70bc7f8cb71e5d25703972ed58c7b5c81649050cdc17a9f646f7bd57857ca715e411d2ca"), zzYGC.decode("ce2fe5ba54cde888bee0f4863ca70b258ab6e2be31523542a4da66033433fb8e7e394b28198daa1e")});
        map.put("SHA-512(224)", new byte[][]{zzYGC.decode("d2a49d96a75e30d65da621aaf5e3e84b1c3d5313aefa2d276c9e1d836615217b67d766ccd342e956"), zzYGC.decode("32195006d69ed3cdef3d6e5af94ae91c0c3282202b0bfebdc11cc9d4c02f534b0f6bb9a8b8f2b7fe")});
        map.put("SHA-512(256)", new byte[][]{zzYGC.decode("881b2a06f0f23921341819bf9cf78ed122850a80ae6c6eaf84e84600d756486c442305a495db0d96"), zzYGC.decode("c9351dfad36fd8309a5bd598ac4ee9ca22297263f21c21d8481acefea97f5e508134f43959ac7f90")});
        map2.put(IDevicePopManager.SHA_1, zzYGC.decode("3c01bdbb26f358bab27f267924aa2c9a03fcfdb8"));
        map2.put("SHA-224", zzYGC.decode("107c5072b799c4771f328304cfe1ebb375eb6ea7f35a3aa753836fad"));
        map2.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, zzYGC.decode("b5d4045c3f466fa91fe2cc6abe79232a1a57cdf104f7a26e716e0a1e2789df78"));
        map2.put("SHA-384", zzYGC.decode("1e02dc92a41db610c9bcdc9b5935d1fb9be5639116f6c67e97bc1a3ac649753baba7ba021c813e1fe20c0480213ad371"));
        map2.put("SHA-512", zzYGC.decode("397118fdac8d83ad98813c50759c85b8c47565d8268bf10da483153b747a74743a58a90e85aa9f705ce6984ffc128db567489817e4092d050d8a1cc596ddc119"));
        map2.put("SHA-512(224)", zzYGC.decode("2a2aa10c3ca33a979d6cc7d36f94425fb72a09d3d7137c8b9b5b4474"));
        map2.put("SHA-512(256)", zzYGC.decode("625c3e642852cb343b9b06eae14b47a7da0fd292a7be7b8a251208a65271af36"));
        map3.put(IDevicePopManager.SHA_1, new byte[][]{zzYGC.decode("657d09ba244bf82e69ee1f860d9bfbf53aebd25827aab770e1f33d4d7bd34596d5f1be2ff0dcde4c"), zzYGC.decode("01b3e73d42c180963004e6d4d31f38f1bfa3a815c8571f4d9bbed56d5f8afc8f1da145d36232554f")});
        map3.put("SHA-224", new byte[][]{zzYGC.decode("267c1bc6462b4157320dfe212118370788cff8124af984c3aac5f543228ad69ebdbbf401db50de77"), zzYGC.decode("9b7b7b267d3d7bd6cead4242b9bae3bcdf812901bcff06dca582dfa01e2db3cada2e77f665db1e20")});
        map3.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, new byte[][]{zzYGC.decode("05e4940b7cbb02e2bfa3cb03e369379f068ff7d51595403c41579791ee585605b8c4a676bf3a9b52"), zzYGC.decode("dbb50e0e562f3d83fee0c1f020ffbc04f2eaa8e78009cae0eb8c40628a25dcb4ac096732cc2fa1b4")});
        map3.put("SHA-384", new byte[][]{zzYGC.decode("5ad1f8c6d18dc235cdb306613926eb9ba67fc910ee7d5483ccc4c9717c576342945aaead78a99bbb"), zzYGC.decode("03a45f886270781455ff6242d2052b5d84fcea57d95de31fdbd7f973d4027586972da7028fa4c820")});
        map3.put("SHA-512", new byte[][]{zzYGC.decode("147abe77d9b19bf6331691eeb3571e55afb406d1ddcd7aa5f1b3de71f0d3eb6949ea580764588000"), zzYGC.decode("59c18dd408b82f930411bfdeea503d0154a77263c934d7888677ce34018307d4dd035effed210979")});
        map3.put("SHA-512(224)", new byte[][]{zzYGC.decode("b8517f43fb91321ee4b6e2d9478970b4fa727518e0176e97536dbb3a55cba46a29557a8dd9db26d4"), zzYGC.decode("d9d32c83c6586c3ab235830367733fa405ade3c8ff6d24ea28bf6ba3f4ab4784336a32a2a8535be5")});
        map3.put("SHA-512(256)", new byte[][]{zzYGC.decode("a33a0d6840f8be385f9aa683cb01e0e0b4d36a1de33e2ea931c015f86f231f574569452950537db7"), zzYGC.decode("e862780ba48bab8df070be0ca429299a9c744cfa84acb578be5f86155719a23aab6c92b432e9f85b")});
    }

    public zzZ0D(zzYUX zzyux, int i, zzZ5G zzz5g, byte[] bArr, byte[] bArr2) {
        zzZ(zzyux, i, zzz5g, bArr, bArr2);
    }

    private void zzC(byte[] bArr, byte[] bArr2) {
        this.zzWhn.update(bArr, 0, bArr.length);
        this.zzWhn.doFinal(bArr2, 0);
    }

    private static void zzD(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + (bArr2[bArr2.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i4 = (bArr[bArr.length - length] & 255) + i;
            i = i4 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    private byte[] zzWQ(byte[] bArr) {
        byte[] bArr2 = new byte[this.zzWhn.zzQI()];
        zzC(bArr, bArr2);
        return bArr2;
    }

    private byte[] zzWR(byte[] bArr) {
        try {
            return zzZ2J.zzZ(this.zzWhn, bArr, this.zzWkd);
        } finally {
            zzYGU.fill(bArr, (byte) 0);
        }
    }

    private void zzWS(byte[] bArr) {
        byte[] bArrZzWR = zzWR(bArr);
        this.zzWk9 = bArrZzWR;
        this.zzWct = zzWR(zzYGU.zzn(zzWcx, bArrZzWR));
        this.zzWk8 = 1L;
    }

    private byte[] zzXGX() {
        byte[] bArrZzXGX = this.zzWkg.zzXGX();
        if (bArrZzXGX == null || bArrZzXGX.length < (this.zzWkb + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        return bArrZzXGX;
    }

    private byte[] zza(byte[] bArr, int i) {
        int i2 = i / 8;
        int iZzQI = i2 / this.zzWhn.zzQI();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i2];
        int iZzQI2 = this.zzWhn.zzQI();
        byte[] bArr4 = new byte[iZzQI2];
        for (int i3 = 0; i3 <= iZzQI; i3++) {
            zzC(bArr2, bArr4);
            int i4 = i3 * iZzQI2;
            int i5 = i2 - i4;
            if (i5 > iZzQI2) {
                i5 = iZzQI2;
            }
            System.arraycopy(bArr4, 0, bArr3, i4, i5);
            zzD(bArr2, zzWcw);
        }
        return bArr3;
    }

    public final void finalize() throws Throwable {
        zzYGU.fill(this.zzWk9, (byte) 0);
        zzYGU.fill(this.zzWct, (byte) 0);
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final int zzXGf() {
        return this.zzWkb;
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final void zzXa(byte[] bArr) {
        byte[] bArrZzXGX = zzXGX();
        byte[] bArrZzW = zzYGU.zzW(zzWcw, this.zzWk9, bArrZzXGX, bArr);
        zzYGU.fill(bArrZzXGX, (byte) 0);
        zzWS(bArrZzW);
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
            byte[] bArr3 = this.zzWk9;
            byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
            bArr4[0] = 2;
            System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
            System.arraycopy(bArr2, 0, bArr4, this.zzWk9.length + 1, bArr2.length);
            zzD(this.zzWk9, zzWQ(bArr4));
        }
        byte[] bArrZza = zza(this.zzWk9, length);
        byte[] bArr5 = this.zzWk9;
        byte[] bArr6 = new byte[bArr5.length + 1];
        System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
        bArr6[0] = 3;
        zzD(this.zzWk9, zzWQ(bArr6));
        zzD(this.zzWk9, this.zzWct);
        zzD(this.zzWk9, new byte[]{(byte) (r6 >> 24), (byte) (r6 >> 16), (byte) (r6 >> 8), (byte) this.zzWk8});
        this.zzWk8++;
        System.arraycopy(bArrZza, 0, bArr, 0, bArr.length);
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzZ(zzYUX zzyux, int i, zzZ5G zzz5g, byte[] bArr, byte[] bArr2) {
        if (i <= zzZ2J.zzY(zzyux)) {
            if (zzz5g.zzXGW() >= i) {
                this.zzWhn = zzyux;
                this.zzWkg = zzz5g;
                this.zzWkb = i;
                this.zzWkd = ((Integer) zzWcv.get(zzyux.zzXGi())).intValue();
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
        return new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ0D.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v18, types: [byte[]] */
            /* JADX WARN: Type inference failed for: r0v20 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v6, types: [byte[]] */
            /* JADX WARN: Type inference failed for: r17v0 */
            /* JADX WARN: Type inference failed for: r17v1 */
            /* JADX WARN: Type inference failed for: r17v10 */
            /* JADX WARN: Type inference failed for: r17v3 */
            /* JADX WARN: Type inference failed for: r17v4 */
            /* JADX WARN: Type inference failed for: r17v6 */
            /* JADX WARN: Type inference failed for: r17v8 */
            /* JADX WARN: Type inference failed for: r17v9 */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [int] */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v6 */
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                ?? r2;
                byte[] bArrDecode;
                byte[] bArrDecode2;
                int iZzY;
                ?? r17;
                int i;
                byte[] bArr;
                byte[] bArr2 = zzZ0D.this.zzWk9;
                byte[] bArr3 = zzZ0D.this.zzWct;
                long j = zzZ0D.this.zzWk8;
                zzZ5G zzz5g = zzZ0D.this.zzWkg;
                int i2 = zzZ0D.this.zzWkd;
                int i3 = zzZ0D.this.zzWkb;
                try {
                    bArrDecode = zzYGC.decode("404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F70717273747576");
                    bArrDecode2 = zzYGC.decode("2021222324");
                    iZzY = zzZ2J.zzY(zzZ0D.this.zzWhn);
                    byte[][] bArr4 = (byte[][]) zzZ0D.zzWkj.get(this.zzWjX.getName());
                    zzZ0D zzz0d = zzZ0D.this;
                    r17 = bArr4;
                    zzz0d.zzZ(zzz0d.zzWhn, zzZ0D.this.zzWkb, new zzZ2J.zzZ().zzg0(iZzY), bArrDecode, bArrDecode2);
                    byte[] bArr5 = new byte[r17[0].length];
                    zzZ0D.this.zzY(bArr5, null, true);
                    if (!zzYGU.zzp(r17[0], bArr5)) {
                        zzYZE.zzTQ("DRBG Block 1 KAT failure");
                    }
                    byte[] bArr6 = new byte[r17[1].length];
                    zzZ0D.this.zzY(bArr6, null, true);
                    if (!zzYGU.zzp(r17[1], bArr6)) {
                        zzYZE.zzTQ("DRBG Block 2 KAT failure");
                    }
                } catch (Throwable th) {
                    th = th;
                    r2 = i3;
                }
                try {
                    try {
                        zzZ0D zzz0d2 = zzZ0D.this;
                        i = i3;
                        bArr = null;
                        try {
                            zzz0d2.zzZ(zzz0d2.zzWhn, zzZ0D.this.zzWkb, new zzZ2J.zzY(iZzY), bArrDecode, bArrDecode2);
                            zzYZE.zzTQ("DRBG LyingEntropySource not detected in init");
                            r17 = i;
                        } catch (IllegalStateException e) {
                            e = e;
                            r17 = i;
                            if (!e.getMessage().equals("Insufficient entropy provided by entropy source")) {
                                zzYZE.zzTQ("DRBG self test failed init entropy check");
                                r17 = i;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = r17;
                        zzZ0D.this.zzWk9 = bArr2;
                        zzZ0D.this.zzWct = bArr3;
                        zzZ0D.this.zzWk8 = j;
                        zzZ0D.this.zzWkg = zzz5g;
                        zzZ0D.this.zzWkd = i2;
                        zzZ0D.this.zzWkb = r2;
                        throw th;
                    }
                } catch (IllegalStateException e2) {
                    e = e2;
                    i = i3;
                    bArr = null;
                } catch (Throwable th3) {
                    th = th3;
                    r17 = i3;
                    r2 = r17;
                    zzZ0D.this.zzWk9 = bArr2;
                    zzZ0D.this.zzWct = bArr3;
                    zzZ0D.this.zzWk8 = j;
                    zzZ0D.this.zzWkg = zzz5g;
                    zzZ0D.this.zzWkd = i2;
                    zzZ0D.this.zzWkb = r2;
                    throw th;
                }
                try {
                    zzZ0D zzz0d3 = zzZ0D.this;
                    zzz0d3.zzZ(zzz0d3.zzWhn, zzZ0D.this.zzWkb, new zzZ2J.zzY(20), bArrDecode, bArrDecode2);
                    zzYZE.zzTQ("DRBG insufficient EntropySource not detected");
                } catch (IllegalArgumentException e3) {
                    if (!e3.getMessage().equals("Not enough entropy for security strength required")) {
                        zzYZE.zzTQ("DRBG self test failed init entropy check");
                    }
                }
                try {
                    zzZ0D.this.zzWkg = new zzZ2J.zzY(iZzY);
                    zzZ0D.this.zzXa(bArr);
                    zzYZE.zzTQ("DRBG LyingEntropySource not detected in reseed");
                } catch (IllegalStateException e4) {
                    if (!e4.getMessage().equals("Insufficient entropy provided by entropy source")) {
                        zzYZE.zzTQ("DRBG self test failed reseed entropy check");
                    }
                }
                try {
                    zzZ0D zzz0d4 = zzZ0D.this;
                    zzz0d4.zzZ(zzz0d4.zzWhn, iZzY + 1, new zzZ2J.zzZ().zzg0(iZzY), bArrDecode, bArrDecode2);
                    zzYZE.zzTQ("DRBG successful initialise with too high security strength");
                } catch (IllegalArgumentException e5) {
                    if (!e5.getMessage().equals("Requested security strength is not supported by the derivation function")) {
                        zzYZE.zzTQ("DRBG self test failed init security strength check");
                    }
                }
                zzZ0D.this.zzWk9 = bArr2;
                zzZ0D.this.zzWct = bArr3;
                zzZ0D.this.zzWk8 = j;
                zzZ0D.this.zzWkg = zzz5g;
                zzZ0D.this.zzWkd = i2;
                zzZ0D.this.zzWkb = r17 == true ? 1 : 0;
            }
        };
    }

    @Override // com.aspose.words.internal.zzZ2M
    public final zzYZE zzY(zzZ1P zzz1p) {
        return new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ0D.2
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                byte[] bArr = zzZ0D.this.zzWk9;
                byte[] bArr2 = zzZ0D.this.zzWct;
                long j = zzZ0D.this.zzWk8;
                zzZ5G zzz5g = zzZ0D.this.zzWkg;
                int i = zzZ0D.this.zzWkd;
                int i2 = zzZ0D.this.zzWkb;
                try {
                    byte[] bArrDecode = zzYGC.decode("404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F70717273747576");
                    int iZzY = zzZ2J.zzY(zzZ0D.this.zzWhn);
                    byte[][] bArr3 = (byte[][]) zzZ0D.zzWki.get(this.zzWjX.getName());
                    zzZ0D.this.zzWk9 = zzYGU.zzVI((byte[]) zzZ0D.zzWcu.get(this.zzWjX.getName()));
                    zzZ0D.this.zzWkg = new zzZ2J.zzZ().zzg0(iZzY);
                    zzZ0D.this.zzXa(bArrDecode);
                    if (zzZ0D.this.zzWk8 != 1) {
                        zzYZE.zzTQ("DRBG reseedCounter failed to reset");
                    }
                    byte[] bArr4 = new byte[bArr3[0].length];
                    zzZ0D.this.zzY(bArr4, null, false);
                    if (!zzYGU.zzp(bArr3[0], bArr4)) {
                        zzYZE.zzTQ("DRBG Block 1 reseed KAT failure");
                    }
                    byte[] bArr5 = new byte[bArr3[1].length];
                    zzZ0D.this.zzY(bArr5, null, false);
                    if (!zzYGU.zzp(bArr3[1], bArr5)) {
                        zzYZE.zzTQ("DRBG Block 2 reseed KAT failure");
                    }
                    try {
                        zzZ0D.this.zzWkg = new zzZ2J.zzY(iZzY);
                        zzZ0D.this.zzXa(null);
                        zzYZE.zzTQ("DRBG LyingEntropySource not detected on reseed");
                    } catch (IllegalStateException e) {
                        if (!e.getMessage().equals("Insufficient entropy provided by entropy source")) {
                            zzYZE.zzTQ("DRBG self test failed reseed entropy check");
                        }
                    }
                    zzZ0D.this.zzWk9 = bArr;
                    zzZ0D.this.zzWct = bArr2;
                    zzZ0D.this.zzWk8 = j;
                    zzZ0D.this.zzWkg = zzz5g;
                    zzZ0D.this.zzWkd = i;
                    zzZ0D.this.zzWkb = i2;
                } catch (Throwable th) {
                    zzZ0D.this.zzWk9 = bArr;
                    zzZ0D.this.zzWct = bArr2;
                    zzZ0D.this.zzWk8 = j;
                    zzZ0D.this.zzWkg = zzz5g;
                    zzZ0D.this.zzWkd = i;
                    zzZ0D.this.zzWkb = i2;
                    throw th;
                }
            }
        };
    }
}
