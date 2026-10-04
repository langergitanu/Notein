package com.aspose.words.internal;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYXX {
    private static byte[] zzW6A;
    private static byte[] zzW6B;
    private static byte[] zzW6C;
    public static final zzY zzW6D;
    public static final zzT zzW6E;
    public static final zzT zzW6F;
    public static final zzY zzW6G;
    public static final zzY zzW6H;
    public static final zzT zzW6I;
    public static final zzT zzW6J;
    public static final zzT zzW6K;
    public static final zzT zzW6L;
    public static final zzT zzW6M;
    public static final zzT zzW6N;
    public static final zzT zzW6O;
    public static final zzT zzW6P;
    public static final zzT zzW6Q;
    public static final zzT zzW6R;
    public static final zzT zzW6S;
    public static final zzT zzW6T;
    public static final zzT zzW6U;
    public static final zzT zzW6V;
    public static final zzT zzW6W;
    public static final zzT zzW6X;
    public static final zzT zzW6Y;
    public static final zzT zzW6Z;
    private static Map<String, zzZDA> zzW6r;
    private static Map<zzZDA, String> zzW6s;
    private static Map<String, byte[]> zzW6t;
    private static byte[] zzW6u;
    private static byte[] zzW6v;
    private static byte[] zzW6w;
    private static byte[] zzW6x;
    private static byte[] zzW6y;
    private static byte[] zzW6z;
    public static final zzT zzW70;
    private static final zzX zzW71;
    public static final zzYXR zzWb4;

    public static final class zzU extends zzYX3<zzT> {
        @Override // com.aspose.words.internal.zzYX3
        public final /* bridge */ /* synthetic */ zzYV5 zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, zzz46, (zzT) zzz4m, secureRandom);
        }

        private static zzYV5 zzZ(boolean z, zzZ46 zzz46, zzT zzt, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYXX.zzZ(zzz46, zzt.zzXGV(), zzt.zzXDo()), zzYXX.zzW71, zzt, secureRandom);
        }
    }

    public static final class zzV extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYXX.zzZ(zzz46, zzy.zzXGV(), zzy.zzW6q), zzYXX.zzW71, zzy);
        }

        @Override // com.aspose.words.internal.zzYX9
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzY) zzz5q);
        }
    }

    public static final class zzW extends zzYX4 {
        private final SecureRandom zzWk5;
        private final zzZ5W zzWlz = zzYXX.zzWb4;

        public zzW(SecureRandom secureRandom) {
            this.zzWk5 = secureRandom;
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, 256));
            return new zzZ43(this.zzWlz, zzyz0.zzXG8());
        }
    }

    public static final class zzX implements zzYUV<zzYV8> {
        private zzX() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFX, reason: merged with bridge method [inline-methods] */
        public final zzYV8 zzXFZ() {
            return (zzYV8) zzYVZ.zzZ(zzYXX.zzWb4, new zzYXW(), new zzYVN<zzYXW>() { // from class: com.aspose.words.internal.zzYXX.zzX.1
                private static void zzZ(zzYXW zzyxw) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("54410a030c22e4c6a33255fa5f54cc84");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f"));
                    zzyxw.zzZ(true, (zzYV3) zzys7);
                    zzyxw.zzY(bArrDecode, 0, bArr, 0);
                    zzyxw.zzY(bArrDecode, 8, bArr, 8);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyxw.zzZ(false, (zzYV3) zzys7);
                    zzyxw.zzY(bArr, 0, bArr, 0);
                    zzyxw.zzY(bArr, 8, bArr, 8);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYXW zzyxw) throws Exception {
                    zzZ(zzyxw);
                }
            });
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static final class zzZ extends zzYXE<zzY> {
        @Override // com.aspose.words.internal.zzYXE
        public final /* bridge */ /* synthetic */ zzYTS zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(z, zzz46, (zzY) zzz4m);
        }

        private static zzYTS zzZ(boolean z, zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(z, zzYXX.zzZ(zzz46, zzy.zzXGV(), zzy.zzW6q), zzYXX.zzW71, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("GOST28147");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW71 = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW70 = new zzT(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW6Z = new zzT(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW6Y = new zzT(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW6X = new zzT(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW6W = new zzT(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW6V = new zzT(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW6U = new zzT(new zzYXR(zzyxr, zzywu2));
        zzW6T = new zzT(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW6S = new zzT(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW6R = new zzT(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW6Q = new zzT(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW6P = new zzT(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW6O = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW6N = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW6M = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW6L = new zzT(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW6K = new zzT(new zzYXR(zzyxr, zzYWU.CFB64));
        zzW6J = new zzT(new zzYXR(zzyxr, zzYWU.OFB64));
        zzW6I = new zzT(new zzYXR(zzyxr, zzYWU.CTR));
        zzW6H = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW6G = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
        zzW6F = new zzT(new zzYXR(zzyxr, zzYWU.GCFB));
        zzW6E = new zzT(new zzYXR(zzyxr, zzYWU.GOFB));
        zzW6D = new zzY(new zzYXR(zzyxr, zzYWU.GOSTMAC));
        zzW6C = new byte[]{4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
        zzW6B = new byte[]{4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, 14, 7, 10, 15, 4, 1, 8};
        zzW6A = new byte[]{9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
        zzW6z = new byte[]{8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};
        zzW6y = new byte[]{1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 12, 6, 1, 11, 13, 9, 3, 8};
        zzW6x = new byte[]{15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, 14};
        zzW6w = new byte[]{12, 4, 6, 2, 10, 5, 11, 9, 14, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, 14, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, 14, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, 14, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, 14, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, 14, 0, 8, 14, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, 14, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};
        zzW6v = new byte[]{4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
        zzW6u = new byte[]{10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, 14, 13, 0, 2, 12};
        zzW6t = new HashMap();
        zzO("Default", zzW6C);
        zzO("E-TEST", zzW6B);
        zzO("E-A", zzW6A);
        zzO("E-B", zzW6z);
        zzO("E-C", zzW6y);
        zzO("E-D", zzW6x);
        zzO("Param-Z", zzW6w);
        zzO("D-TEST", zzW6v);
        zzO("D-A", zzW6u);
        zzW6s = new HashMap();
        zzW6r = new HashMap();
        zzW6s.put(zzZAE.zzWEW, "E-TEST");
        Map<zzZDA, String> map = zzW6s;
        zzZDA zzzda = zzZAE.zzWEV;
        map.put(zzzda, "E-A");
        Map<zzZDA, String> map2 = zzW6s;
        zzZDA zzzda2 = zzZAE.zzWEU;
        map2.put(zzzda2, "E-B");
        Map<zzZDA, String> map3 = zzW6s;
        zzZDA zzzda3 = zzZAE.zzWET;
        map3.put(zzzda3, "E-C");
        Map<zzZDA, String> map4 = zzW6s;
        zzZDA zzzda4 = zzZAE.zzWES;
        map4.put(zzzda4, "E-D");
        Map<zzZDA, String> map5 = zzW6s;
        zzZDA zzzda5 = zzZ8W.zzWvG;
        map5.put(zzzda5, "Param-Z");
        zzW6r.put("E-A", zzzda);
        zzW6r.put("E-B", zzzda2);
        zzW6r.put("E-C", zzzda3);
        zzW6r.put("E-D", zzzda4);
        zzW6r.put("Param-Z", zzzda5);
    }

    private static String zzK(zzZDA zzzda) {
        String str = zzW6s.get(zzzda);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unknown SBOX OID: " + zzzda);
    }

    public static byte[] zzL(zzZDA zzzda) {
        return zzwC(zzK(zzzda));
    }

    private static void zzO(String str, byte[] bArr) {
        zzW6t.put(zzYGI.toUpperCase(str), bArr);
    }

    public static zzZDA zzWC(byte[] bArr) {
        for (Map.Entry<String, byte[]> entry : zzW6t.entrySet()) {
            if (zzYGU.zzp(entry.getValue(), bArr)) {
                return zzwB(entry.getKey());
            }
        }
        throw new IllegalArgumentException("SBOX provided did not map to a known one");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYXU zzZ(zzZ46 zzz46, zzZ5W zzz5w, byte[] bArr) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzyudZzZ.zzXEo() != 256) {
            throw new zzZ5E("GOST28147 key must be of length 256 bits");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return new zzYXU(zzyudZzZ.zzXK4(), bArr);
    }

    public static zzZDA zzwB(String str) {
        zzZDA zzzda = zzW6r.get(str);
        if (zzzda != null) {
            return zzzda;
        }
        throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown SBOX name: ", str));
    }

    private static byte[] zzwC(String str) {
        byte[] bArr = zzW6t.get(zzYGI.toUpperCase(str));
        if (bArr != null) {
            return zzYGU.zzVI(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    public static final class zzY extends zzYXQ<zzY> {
        private final byte[] zzW6q;

        private zzY(zzYXR zzyxr, byte[] bArr, int i, byte[] bArr2) {
            super(zzyxr, 8, bArr, i);
            this.zzW6q = bArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYXQ
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public zzY zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i, this.zzW6q);
        }

        public final zzY zzWB(byte[] bArr) {
            return new zzY(zzXGV(), this.f51276iv, this.zzWiH, zzYGU.zzVI(bArr));
        }

        public zzY(zzYXR zzyxr) {
            this(zzyxr, null, zzYVO.zzY(zzyxr, 64), null);
        }
    }

    public static final class zzT extends zzYXO<zzYXR> implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51277iv;
        private final byte[] zzW6q;

        public zzT(zzYXR zzyxr) {
            super(zzyxr);
            this.f51277iv = null;
            this.zzW6q = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public zzT zzW(SecureRandom secureRandom) {
            return new zzT(this, false, zzXGV().zzZ(8, secureRandom));
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51277iv);
        }

        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWA, reason: merged with bridge method [inline-methods] */
        public final zzT zzXg(byte[] bArr) {
            return new zzT(this, false, zzYGU.zzVI(bArr));
        }

        public final zzT zzWz(byte[] bArr) {
            return new zzT(this, true, zzYGU.zzVI(bArr));
        }

        public final byte[] zzXDo() {
            byte[] bArr = this.zzW6q;
            if (bArr != null) {
                return (byte[]) bArr.clone();
            }
            return null;
        }

        private zzT(zzT zzt, boolean z, byte[] bArr) {
            super(zzt.zzXGV());
            if (z) {
                this.zzW6q = bArr;
                this.f51277iv = zzt.f51277iv;
            } else {
                this.zzW6q = zzt.zzW6q;
                this.f51277iv = bArr;
            }
            ((zzYWU) zzt.zzXGV().zzXFS()).zz5(this.f51277iv, 8);
        }
    }
}
