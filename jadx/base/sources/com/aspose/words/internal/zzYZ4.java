package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYZ4 {
    public static final zzS zzW9A;
    public static final zzS zzW9B;
    public static final zzS zzW9C;
    public static final zzS zzW9D;
    public static final zzS zzW9E;
    public static final zzS zzW9F;
    public static final zzS zzW9G;
    public static final zzS zzW9H;
    public static final zzS zzW9I;
    public static final zzS zzW9J;
    public static final zzS zzW9K;
    public static final zzS zzW9L;
    public static final zzS zzW9M;
    public static final zzS zzW9N;
    public static final zzS zzW9O;
    public static final zzS zzW9P;
    private static final zzX zzW9Q;
    public static final zzR zzW9o;
    public static final zzR zzW9p;
    public static final zzY zzW9q;
    public static final zzY zzW9r;
    public static final zzY zzW9s;
    public static final zzY zzW9t;
    public static final zzY zzW9u;
    public static final zzY zzW9v;
    public static final zzS zzW9w;
    public static final zzS zzW9x;
    public static final zzS zzW9y;
    public static final zzS zzW9z;
    public static final zzYXR zzWb4;

    public static final class zzR extends zzYXO<zzYXR> implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51283iv;
        private final boolean zzWis;

        public zzR(zzYXR zzyxr) {
            this(zzyxr, null, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public zzR zzW(SecureRandom secureRandom) {
            return new zzR(zzXGV(), zzXGV().zzZ(zzXDP(), secureRandom), this.zzWis);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWJ, reason: merged with bridge method [inline-methods] */
        public zzR zzXg(byte[] bArr) {
            return new zzR(zzXGV(), zzYGU.zzVI(bArr), this.zzWis);
        }

        private int zzXDP() {
            return zzXGV().equals(zzYZ4.zzW9p.zzXGV()) ? 8 : 4;
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51283iv);
        }

        public final zzR zzOK(boolean z) {
            return new zzR(zzXGV(), zzYGU.zzVI(this.f51283iv), z);
        }

        private zzR(zzYXR zzyxr, byte[] bArr, boolean z) {
            super(zzyxr);
            if (bArr != null) {
                ((zzYWU) zzyxr.zzXFS()).zz5(bArr, zzXDP());
            }
            this.f51283iv = bArr;
            this.zzWis = z;
        }
    }

    public static final class zzS extends zzYXN<zzS> {
        private zzS(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 16, zzyxr.zz5(bArr, 16));
        }

        private static zzS zzU(zzYXR zzyxr, byte[] bArr) {
            return new zzS(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzU(zzyxr, bArr);
        }

        public zzS(zzYXR zzyxr) {
            this(zzyxr, null);
        }
    }

    public static final class zzT extends zzYX3<zzS> {
        @Override // com.aspose.words.internal.zzYX3
        public final /* bridge */ /* synthetic */ zzYV5 zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, zzz46, (zzS) zzz4m, secureRandom);
        }

        private static zzYV5 zzZ(boolean z, zzZ46 zzz46, zzS zzs, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYZ4.zzZ(zzz46, zzs.zzXGV()), zzYZ4.zzW9Q, zzs, secureRandom);
        }
    }

    public static final class zzU extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYZ4.zzZ(zzz46, zzy.zzXGV()), zzYZ4.zzW9Q, zzy);
        }

        @Override // com.aspose.words.internal.zzYX9
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzY) zzz5q);
        }
    }

    public static final class zzV extends zzYXA<zzR, zzZ46> {
        @Override // com.aspose.words.internal.zzYXA
        public final /* bridge */ /* synthetic */ zzYUC zzZ(boolean z, zzZ58 zzz58, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, (zzZ46) zzz58, (zzR) zzz4m, secureRandom);
        }

        private static zzYUC zzZ(boolean z, zzZ46 zzz46, zzR zzr, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYZ4.zzZ(zzz46, zzr.zzXGV()), zzYZ4.zzW9Q, zzr, zzr.zzWis, secureRandom);
        }
    }

    public static final class zzW extends zzYX4 {
        private final zzYXR zzWb0;
        private final int zzWiC;
        private final SecureRandom zzWk5;

        public zzW(int i, SecureRandom secureRandom) {
            this(zzYZ4.zzWb4, i, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzW(zzYXR zzyxr, int i, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            if (zzYZ4.zzfw(i)) {
                StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Attempt to create key with invalid key size [", "]: ");
                sbOooO0OO.append(zzyxr.getName());
                throw new IllegalArgumentException(sbOooO0OO.toString());
            }
            this.zzWiC = i;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzX implements zzYUV<zzYV8> {
        private zzX() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFX, reason: merged with bridge method [inline-methods] */
        public final zzYV8 zzXFZ() {
            return (zzYV8) zzYVZ.zzZ(zzYZ4.zzWb4, new zzYZ3(), new zzYVN<zzYZ3>() { // from class: com.aspose.words.internal.zzYZ4.zzX.1
                private static void zzZ(zzYZ3 zzyz3) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("2edf1f3418d53b88841fc8985fb1ecf2");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f"));
                    zzyz3.zzZ(true, zzys7);
                    zzyz3.zzY(bArrDecode, 0, bArr, 0);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyz3.zzZ(false, zzys7);
                    zzyz3.zzY(bArr, 0, bArr, 0);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYZ3 zzyz3) throws Exception {
                    zzZ(zzyz3);
                }
            });
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static final class zzY extends zzYXQ<zzY> {
        private zzY(zzYXR zzyxr, byte[] bArr, int i) {
            super(zzyxr, 16, bArr, i);
        }

        private static zzY zzV(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzV(zzyxr, bArr, i);
        }

        public zzY(zzYXR zzyxr) {
            this(zzyxr, null, zzYVO.zzY(zzyxr, 128));
        }
    }

    public static final class zzZ extends zzYXE<zzY> {
        @Override // com.aspose.words.internal.zzYXE
        public final /* bridge */ /* synthetic */ zzYTS zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(z, zzz46, (zzY) zzz4m);
        }

        private static zzYTS zzZ(boolean z, zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(z, zzYZ4.zzZ(zzz46, zzy.zzXGV()), zzYZ4.zzW9Q, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("Camellia");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW9Q = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW9P = new zzS(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW9O = new zzS(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW9N = new zzS(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW9M = new zzS(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW9L = new zzS(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW9K = new zzS(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW9J = new zzS(new zzYXR(zzyxr, zzywu2));
        zzW9I = new zzS(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW9H = new zzS(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW9G = new zzS(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW9F = new zzS(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW9E = new zzS(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW9D = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW9C = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW9B = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW9A = new zzS(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW9z = new zzS(new zzYXR(zzyxr, zzYWU.CFB128));
        zzW9y = new zzS(new zzYXR(zzyxr, zzYWU.OFB128));
        zzW9x = new zzS(new zzYXR(zzyxr, zzYWU.OpenPGPCFB));
        zzW9w = new zzS(new zzYXR(zzyxr, zzYWU.CTR));
        zzW9v = new zzY(new zzYXR(zzyxr, zzYWU.GCM));
        zzW9u = new zzY(new zzYXR(zzyxr, zzYWU.CCM));
        zzW9t = new zzY(new zzYXR(zzyxr, zzYWU.OCB));
        zzW9s = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW9r = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
        zzW9q = new zzY(new zzYXR(zzyxr, zzYWU.GMAC));
        zzW9p = new zzR(new zzYXR(zzyxr, zzYWU.WRAP));
        zzW9o = new zzR(new zzYXR(zzyxr, zzYWU.WRAPPAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("Camellia key must be of length 128, 192, or 256");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzfw(int i) {
        return (i == 128 || i == 192 || i == 256) ? false : true;
    }
}
