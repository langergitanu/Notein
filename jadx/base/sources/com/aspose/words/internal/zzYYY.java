package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYYY {
    public static final zzY zzW8F;
    public static final zzY zzW8G;
    public static final zzY zzW8H;
    public static final zzY zzW8I;
    public static final zzY zzW8J;
    public static final zzY zzW8K;
    public static final zzT zzW8L;
    public static final zzY zzW8M;
    public static final zzT zzW8N;
    public static final zzT zzW8O;
    public static final zzT zzW8P;
    public static final zzT zzW8Q;
    public static final zzT zzW8R;
    public static final zzT zzW8S;
    public static final zzT zzW8T;
    public static final zzT zzW8U;
    public static final zzT zzW8V;
    public static final zzT zzW8W;
    public static final zzT zzW8X;
    public static final zzT zzW8Y;
    public static final zzT zzW8Z;
    public static final zzT zzW90;
    public static final zzT zzW91;
    public static final zzT zzW92;
    public static final zzT zzW93;
    public static final zzT zzW94;
    public static final zzT zzW95;
    private static final zzX zzW96;
    public static final zzYXR zzWb4;

    public static final class zzT extends zzYXO<zzYXR> implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51281iv;

        public zzT(zzYXR zzyxr) {
            this(zzyxr, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public zzT zzW(SecureRandom secureRandom) {
            return new zzT(zzXGV(), zzXGV().zzZ(8, secureRandom));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWH, reason: merged with bridge method [inline-methods] */
        public zzT zzXg(byte[] bArr) {
            return new zzT(zzXGV(), zzYGU.zzVI(bArr));
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51281iv);
        }

        private zzT(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr);
            ((zzYWU) zzyxr.zzXFS()).zz5(bArr, 8);
            this.f51281iv = bArr;
        }
    }

    public static final class zzU extends zzYX3<zzT> {
        @Override // com.aspose.words.internal.zzYX3
        public final /* bridge */ /* synthetic */ zzYV5 zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, zzz46, (zzT) zzz4m, secureRandom);
        }

        private static zzYV5 zzZ(boolean z, zzZ46 zzz46, zzT zzt, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYYY.zzZ(zzz46, zzt.zzXGV()), zzYYY.zzW96, zzt, secureRandom);
        }
    }

    public static final class zzV extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYYY.zzZ(zzz46, zzy.zzXGV()), zzYYY.zzW96, zzy);
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

        public zzW(SecureRandom secureRandom) {
            this(zzYYY.zzWb4, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYYO zzyyo = new zzYYO();
            zzyyo.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyyo.zzXG8());
        }

        private zzW(zzYXR zzyxr, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            this.zzWiC = 56;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzX implements zzYUV<zzYV8> {
        private zzX() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFX, reason: merged with bridge method [inline-methods] */
        public final zzYV8 zzXFZ() {
            return (zzYV8) zzYVZ.zzZ(zzYYY.zzWb4, new zzYYP(), new zzYVN<zzYYP>() { // from class: com.aspose.words.internal.zzYYY.zzX.1
                private static void zzZ(zzYYP zzyyp) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("e7109a793167d69a0e62538ba866f7f8");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("1011121314151617"));
                    zzyyp.zzZ(true, (zzYV3) zzys7);
                    zzyyp.zzY(bArrDecode, 0, bArr, 0);
                    zzyyp.zzY(bArrDecode, 8, bArr, 8);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyyp.zzZ(false, (zzYV3) zzys7);
                    zzyyp.zzY(bArr, 0, bArr, 0);
                    zzyyp.zzY(bArr, 8, bArr, 8);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYYP zzyyp) throws Exception {
                    zzZ(zzyyp);
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

        private static zzY zzU(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzU(zzyxr, bArr, i);
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
            return zzYYZ.zzZ(z, zzYYY.zzZ(zzz46, zzy.zzXGV()), zzYYY.zzW96, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("DES");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW96 = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW95 = new zzT(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW94 = new zzT(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW93 = new zzT(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW92 = new zzT(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW91 = new zzT(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW90 = new zzT(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW8Z = new zzT(new zzYXR(zzyxr, zzywu2));
        zzW8Y = new zzT(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW8X = new zzT(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW8W = new zzT(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW8V = new zzT(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW8U = new zzT(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW8T = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW8S = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW8R = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW8Q = new zzT(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW8P = new zzT(new zzYXR(zzyxr, zzYWU.CFB64));
        zzW8O = new zzT(new zzYXR(zzyxr, zzYWU.OFB64));
        zzW8N = new zzT(new zzYXR(zzyxr, zzYWU.CTR));
        zzW8M = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW8L = new zzT(new zzYXR(zzyxr, zzYWU.OpenPGPCFB));
        zzW8K = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
        zzYWU zzywu3 = zzYWU.CBCMAC;
        zzW8J = new zzY(new zzYXR(zzyxr, zzywu3));
        zzW8I = new zzY(new zzYXR(zzyxr, zzywu3, zzywm4));
        zzYWU zzywu4 = zzYWU.ISO9797alg3;
        zzW8H = new zzY(new zzYXR(zzyxr, zzywu4));
        zzW8G = new zzY(new zzYXR(zzyxr, zzywu4, zzywm4));
        zzW8F = new zzY(new zzYXR(zzyxr, zzYWU.CFB8MAC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzYXR zzyxr) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        int iZzXEo = zzyudZzZ.zzXEo();
        if (iZzXEo != 64) {
            if (zzyxr.zzXFS() != zzYWU.ISO9797alg3) {
                throw new zzZ5E("DES key must be of length 64 bits including parity");
            }
            if (iZzXEo != 128 && iZzXEo != 192) {
                throw new zzZ5E("DES key for ISO979alg3 must be of length 128 or 192 bits including parity");
            }
        } else if (zzyxr.zzXFS() == zzYWU.ISO9797alg3) {
            throw new zzZ5E("DES key for ISO979alg3 must be of length 128 or 192 bits including parity");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzyxr);
        return zzyudZzZ;
    }
}
