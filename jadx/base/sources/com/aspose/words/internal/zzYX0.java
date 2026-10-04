package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYX0 {
    public static final zzT zzW5A;
    public static final zzT zzW5B;
    public static final zzT zzW5C;
    public static final zzT zzW5D;
    public static final zzT zzW5E;
    public static final zzT zzW5F;
    public static final zzT zzW5G;
    public static final zzT zzW5H;
    public static final zzT zzW5I;
    private static final zzX zzW5J;
    public static final zzY zzW5k;
    public static final zzY zzW5l;
    public static final zzY zzW5m;
    public static final zzY zzW5n;
    public static final zzY zzW5o;
    public static final zzT zzW5p;
    public static final zzT zzW5q;
    public static final zzT zzW5r;
    public static final zzT zzW5s;
    public static final zzT zzW5t;
    public static final zzT zzW5u;
    public static final zzT zzW5v;
    public static final zzT zzW5w;
    public static final zzT zzW5x;
    public static final zzT zzW5y;
    public static final zzT zzW5z;
    public static final zzYXR zzWb4;

    public static final class zzT extends zzYXN<zzT> {
        public zzT(zzYXR zzyxr) {
            this(zzyxr, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYXN, com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public zzT zzW(SecureRandom secureRandom) {
            return new zzT(zzXGV(), zzXGV().zzZ(8, secureRandom));
        }

        private static zzT zzR(zzYXR zzyxr, byte[] bArr) {
            return new zzT(zzyxr, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYXN, com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWp, reason: merged with bridge method [inline-methods] */
        public zzT zzXg(byte[] bArr) {
            return new zzT(zzXGV(), (byte[]) bArr.clone());
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzR(zzyxr, bArr);
        }

        private zzT(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 8, bArr);
            ((zzYWU) zzyxr.zzXFS()).zz5(bArr, 8);
        }
    }

    public static final class zzU extends zzYX3<zzT> {
        @Override // com.aspose.words.internal.zzYX3
        public final /* bridge */ /* synthetic */ zzYV5 zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, zzz46, (zzT) zzz4m, secureRandom);
        }

        private static zzYV5 zzZ(boolean z, zzZ46 zzz46, zzT zzt, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYX0.zzZ(zzz46, zzt.zzXGV()), zzYX0.zzW5J, zzt, secureRandom);
        }
    }

    public static final class zzV extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYX0.zzZ(zzz46, zzy.zzXGV()), zzYX0.zzW5J, zzy);
        }

        @Override // com.aspose.words.internal.zzYX9
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzY) zzz5q);
        }
    }

    public static final class zzW extends zzYX4 {
        private final zzYXR zzWb0;
        private final int zzWiC;
        private final SecureRandom zzWk5;

        public zzW(int i, SecureRandom secureRandom) {
            this(zzYX0.zzWb4, i, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzW(zzYXR zzyxr, int i, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            if (zzYX0.zzfw(i)) {
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
            return (zzYV8) zzYVZ.zzZ(zzYX0.zzWb4, new zzYWZ(), new zzYVN<zzYWZ>() { // from class: com.aspose.words.internal.zzYX0.zzX.1
                private static void zzZ(zzYWZ zzywz) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("9262841e460830173784e9f6efbbca12");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("101112131415161718191a1b1c1d1e1f"));
                    zzywz.zzZ(true, (zzYV3) zzys7);
                    zzywz.zzY(bArrDecode, 0, bArr, 0);
                    zzywz.zzY(bArrDecode, 8, bArr, 8);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzywz.zzZ(false, (zzYV3) zzys7);
                    zzywz.zzY(bArr, 0, bArr, 0);
                    zzywz.zzY(bArr, 8, bArr, 8);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYWZ zzywz) throws Exception {
                    zzZ(zzywz);
                }
            });
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static final class zzY extends zzYXQ<zzY> {
        private zzY(zzYXR zzyxr, byte[] bArr, int i) {
            super(zzyxr, 8, bArr, i);
        }

        private static zzY zzS(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzS(zzyxr, bArr, i);
        }

        public zzY(zzYXR zzyxr) {
            this(zzyxr, null, zzYVO.zzY(zzyxr, 64));
        }
    }

    public static final class zzZ extends zzYXE<zzY> {
        @Override // com.aspose.words.internal.zzYXE
        public final /* bridge */ /* synthetic */ zzYTS zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(z, zzz46, (zzY) zzz4m);
        }

        private static zzYTS zzZ(boolean z, zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(z, zzYX0.zzZ(zzz46, zzy.zzXGV()), zzYX0.zzW5J, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("IDEA");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW5J = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW5I = new zzT(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW5H = new zzT(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW5G = new zzT(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW5F = new zzT(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW5E = new zzT(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW5D = new zzT(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW5C = new zzT(new zzYXR(zzyxr, zzywu2));
        zzW5B = new zzT(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW5A = new zzT(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW5z = new zzT(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW5y = new zzT(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW5x = new zzT(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW5w = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW5v = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW5u = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW5t = new zzT(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW5s = new zzT(new zzYXR(zzyxr, zzYWU.CFB64));
        zzW5r = new zzT(new zzYXR(zzyxr, zzYWU.OFB64));
        zzW5q = new zzT(new zzYXR(zzyxr, zzYWU.OpenPGPCFB));
        zzW5p = new zzT(new zzYXR(zzyxr, zzYWU.CTR));
        zzW5o = new zzY(new zzYXR(zzyxr, zzYWU.OCB));
        zzW5n = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW5m = new zzY(new zzYXR(zzyxr, zzYWU.CBCMAC));
        zzW5l = new zzY(new zzYXR(zzyxr, zzYWU.CFB8MAC));
        zzW5k = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("IDEA key must be of length 40 to 128 bits");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzfw(int i) {
        return i < 40 || i > 128;
    }
}
