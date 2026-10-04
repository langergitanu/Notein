package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYW2 {
    public static final zzT zzW2A;
    public static final zzT zzW2B;
    public static final zzT zzW2C;
    public static final zzT zzW2D;
    public static final zzT zzW2E;
    public static final zzT zzW2F;
    public static final zzT zzW2G;
    public static final zzT zzW2H;
    public static final zzT zzW2I;
    private static final zzX zzW2J;
    public static final zzY zzW2o;
    public static final zzY zzW2p;
    public static final zzT zzW2q;
    public static final zzT zzW2r;
    public static final zzT zzW2s;
    public static final zzT zzW2t;
    public static final zzT zzW2u;
    public static final zzT zzW2v;
    public static final zzT zzW2w;
    public static final zzT zzW2x;
    public static final zzT zzW2y;
    public static final zzT zzW2z;
    public static final zzYXR zzWb4;

    public static final class zzT extends zzYXN<zzT> {
        private zzT(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 32, zzyxr.zz5(bArr, 32));
        }

        private static zzT zzP(zzYXR zzyxr, byte[] bArr) {
            return new zzT(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzP(zzyxr, bArr);
        }

        public zzT(zzYXR zzyxr) {
            this(zzyxr, null);
        }
    }

    public static final class zzU extends zzYX3<zzT> {
        @Override // com.aspose.words.internal.zzYX3
        public final /* bridge */ /* synthetic */ zzYV5 zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, zzz46, (zzT) zzz4m, secureRandom);
        }

        private static zzYV5 zzZ(boolean z, zzZ46 zzz46, zzT zzt, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYW2.zzZ(zzz46, zzt.zzXGV()), zzYW2.zzW2J, zzt, secureRandom);
        }
    }

    public static final class zzV extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYW2.zzZ(zzz46, zzy.zzXGV()), zzYW2.zzW2J, zzy);
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
            this(zzYW2.zzWb4, i, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzW(zzYXR zzyxr, int i, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            if (zzYW2.zzfw(i)) {
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
            return (zzYV8) zzYVZ.zzZ(zzYW2.zzWb4, new zzYVV(), new zzYVN<zzYVV>() { // from class: com.aspose.words.internal.zzYW2.zzX.1
                private static void zzZ(zzYVV zzyvv) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeffaf527210eb79c7a023abf348e70c9045");
                    byte[] bArrDecode2 = zzYGC.decode("a70f7778411101607576d051ad03280690cbe213c7d457388e54fb4f9ed925bb");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f"));
                    zzyvv.zzZ(true, zzys7);
                    zzyvv.zzY(bArrDecode, 0, bArr, 0);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyvv.zzZ(false, zzys7);
                    zzyvv.zzY(bArr, 0, bArr, 0);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYVV zzyvv) throws Exception {
                    zzZ(zzyvv);
                }
            });
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static final class zzY extends zzYXQ<zzY> {
        private zzY(zzYXR zzyxr, byte[] bArr, int i) {
            super(zzyxr, 32, bArr, i);
        }

        private static zzY zzO(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzO(zzyxr, bArr, i);
        }

        public zzY(zzYXR zzyxr) {
            this(zzyxr, null, zzYVO.zzY(zzyxr, 256));
        }
    }

    public static final class zzZ extends zzYXE<zzY> {
        @Override // com.aspose.words.internal.zzYXE
        public final /* bridge */ /* synthetic */ zzYTS zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(z, zzz46, (zzY) zzz4m);
        }

        private static zzYTS zzZ(boolean z, zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(z, zzYW2.zzZ(zzz46, zzy.zzXGV()), zzYW2.zzW2J, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("SHACAL-2");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW2J = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW2I = new zzT(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW2H = new zzT(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW2G = new zzT(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW2F = new zzT(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW2E = new zzT(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW2D = new zzT(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW2C = new zzT(new zzYXR(zzyxr, zzywu2));
        zzW2B = new zzT(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW2A = new zzT(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW2z = new zzT(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW2y = new zzT(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW2x = new zzT(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW2w = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW2v = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW2u = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW2t = new zzT(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW2s = new zzT(new zzYXR(zzyxr, zzYWU.CFB256));
        zzW2r = new zzT(new zzYXR(zzyxr, zzYWU.OFB256));
        zzW2q = new zzT(new zzYXR(zzyxr, zzYWU.CTR));
        zzW2p = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW2o = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("SHACAL-2 key must be 128 - 512 bits and a multiple of 64");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzfw(int i) {
        return i == 0 || i > 512 || i < 128 || i % 64 != 0;
    }
}
