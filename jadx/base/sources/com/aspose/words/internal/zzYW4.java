package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYW4 {
    public static final zzR zzW2R;
    public static final zzR zzW2S;
    public static final zzY zzW2T;
    public static final zzY zzW2U;
    public static final zzY zzW2V;
    public static final zzY zzW2W;
    public static final zzY zzW2X;
    public static final zzY zzW2Y;
    public static final zzS zzW2Z;
    public static final zzS zzW30;
    public static final zzS zzW31;
    public static final zzS zzW32;
    public static final zzS zzW33;
    public static final zzS zzW34;
    public static final zzS zzW35;
    public static final zzS zzW36;
    public static final zzS zzW37;
    public static final zzS zzW38;
    public static final zzS zzW39;
    public static final zzS zzW3a;
    public static final zzS zzW3b;
    public static final zzS zzW3c;
    public static final zzS zzW3d;
    public static final zzS zzW3e;
    public static final zzS zzW3f;
    public static final zzS zzW3g;
    public static final zzS zzW3h;
    private static final zzX zzW3i;
    public static final zzYXR zzWb4;

    public static final class zzR extends zzYXO<zzYXR> implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51262iv;
        private final boolean zzWis;

        public zzR(zzYXR zzyxr) {
            this(zzyxr, null, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWi, reason: merged with bridge method [inline-methods] */
        public zzR zzXg(byte[] bArr) {
            return new zzR(zzXGV(), zzYGU.zzVI(bArr), this.zzWis);
        }

        private int zzXDP() {
            return zzXGV().equals(zzYW4.zzW2S.zzXGV()) ? 8 : 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public zzR zzW(SecureRandom secureRandom) {
            return new zzR(zzXGV(), zzXGV().zzZ(zzXDP(), secureRandom), this.zzWis);
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51262iv);
        }

        public final zzR zzOJ(boolean z) {
            return new zzR(zzXGV(), zzYGU.zzVI(this.f51262iv), z);
        }

        private zzR(zzYXR zzyxr, byte[] bArr, boolean z) {
            super(zzyxr);
            if (bArr != null) {
                ((zzYWU) zzyxr.zzXFS()).zz5(bArr, zzXDP());
            }
            this.f51262iv = bArr;
            this.zzWis = z;
        }
    }

    public static final class zzS extends zzYXN<zzS> {
        private zzS(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 16, zzyxr.zz5(bArr, 16));
        }

        private static zzS zzQ(zzYXR zzyxr, byte[] bArr) {
            return new zzS(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzQ(zzyxr, bArr);
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
            return zzYYZ.zzZ(z, zzYW4.zzZ(zzz46, zzs.zzXGV()), zzYW4.zzW3i, zzs, secureRandom);
        }
    }

    public static final class zzU extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYW4.zzZ(zzz46, zzy.zzXGV()), zzYW4.zzW3i, zzy);
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
            return zzYYZ.zzZ(z, zzYW4.zzZ(zzz46, zzr.zzXGV()), zzYW4.zzW3i, zzr, zzr.zzWis, secureRandom);
        }
    }

    public static final class zzW extends zzYX4 {
        private final zzYXR zzWb0;
        private final int zzWiC;
        private final SecureRandom zzWk5;

        public zzW(SecureRandom secureRandom) {
            this(zzYW4.zzWb4, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzW(zzYXR zzyxr, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            this.zzWiC = 128;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzX implements zzYUV<zzYV8> {
        private zzX() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFX, reason: merged with bridge method [inline-methods] */
        public final zzYV8 zzXFZ() {
            return (zzYV8) zzYVZ.zzZ(zzYW4.zzWb4, new zzYW3(), new zzYVN<zzYW3>() { // from class: com.aspose.words.internal.zzYW4.zzX.1
                private static void zzZ(zzYW3 zzyw3) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("af527210eb79c7a023abf348e70c9045");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f"));
                    zzyw3.zzZ(true, zzys7);
                    zzyw3.zzY(bArrDecode, 0, bArr, 0);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyw3.zzZ(false, zzys7);
                    zzyw3.zzY(bArr, 0, bArr, 0);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYW3 zzyw3) throws Exception {
                    zzZ(zzyw3);
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

        private static zzY zzP(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzP(zzyxr, bArr, i);
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
            return zzYYZ.zzZ(z, zzYW4.zzZ(zzz46, zzy.zzXGV()), zzYW4.zzW3i, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("SEED");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW3i = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW3h = new zzS(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW3g = new zzS(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW3f = new zzS(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW3e = new zzS(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW3d = new zzS(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW3c = new zzS(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW3b = new zzS(new zzYXR(zzyxr, zzywu2));
        zzW3a = new zzS(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW39 = new zzS(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW38 = new zzS(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW37 = new zzS(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW36 = new zzS(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW35 = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW34 = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW33 = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW32 = new zzS(new zzYXR(zzyxr, zzYWU.CFB128));
        zzW31 = new zzS(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW30 = new zzS(new zzYXR(zzyxr, zzYWU.OFB128));
        zzW2Z = new zzS(new zzYXR(zzyxr, zzYWU.CTR));
        zzW2Y = new zzY(new zzYXR(zzyxr, zzYWU.GCM));
        zzW2X = new zzY(new zzYXR(zzyxr, zzYWU.CCM));
        zzW2W = new zzY(new zzYXR(zzyxr, zzYWU.OCB));
        zzW2V = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW2U = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
        zzW2T = new zzY(new zzYXR(zzyxr, zzYWU.GMAC));
        zzW2S = new zzR(new zzYXR(zzyxr, zzYWU.WRAP));
        zzW2R = new zzR(new zzYXR(zzyxr, zzYWU.WRAPPAD));
    }

    private static boolean zzY(zzYUD zzyud) {
        return zzyud.zzXEo() != 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzY(zzyudZzZ)) {
            throw new zzZ5E("SEED key must be of length 128");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }
}
