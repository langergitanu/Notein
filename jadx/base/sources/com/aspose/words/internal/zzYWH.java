package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYWH {
    public static final zzS zzW3U;
    public static final zzY zzW3V;
    public static final zzY zzW3W;
    public static final zzY zzW3X;
    public static final zzY zzW3Y;
    public static final zzS zzW3Z;
    public static final zzS zzW40;
    public static final zzS zzW41;
    public static final zzS zzW42;
    public static final zzS zzW43;
    public static final zzS zzW44;
    public static final zzS zzW45;
    public static final zzS zzW46;
    public static final zzS zzW47;
    public static final zzS zzW48;
    public static final zzS zzW49;
    public static final zzS zzW4a;
    public static final zzS zzW4b;
    public static final zzS zzW4c;
    public static final zzS zzW4d;
    public static final zzS zzW4e;
    public static final zzS zzW4f;
    public static final zzS zzW4g;
    public static final zzS zzW4h;
    private static final zzX zzW4i;
    public static final zzYXR zzWb4;

    public static final class zzS extends zzYXO<zzYXR> implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51272iv;
        private final int zzW3T;

        public zzS(zzYXR zzyxr) {
            this(zzyxr, -1, null);
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51272iv);
        }

        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public final zzS zzW(SecureRandom secureRandom) {
            return new zzS(zzXGV(), this.zzW3T, zzXGV().zzZ(8, secureRandom));
        }

        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWk, reason: merged with bridge method [inline-methods] */
        public final zzS zzXg(byte[] bArr) {
            return new zzS(zzXGV(), this.zzW3T, zzYGU.zzVI(bArr));
        }

        public final int zzXDc() {
            return this.zzW3T;
        }

        public final zzS zzfl(int i) {
            return new zzS(zzXGV(), i, this.f51272iv);
        }

        private zzS(zzYXR zzyxr, int i, byte[] bArr) {
            super(zzyxr);
            this.zzW3T = i;
            this.f51272iv = bArr;
        }
    }

    public static final class zzT extends zzYX3<zzS> {
        private static zzYV5 zzY(boolean z, zzZ46 zzz46, zzS zzs, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYWH.zzZ(zzz46, zzs.zzXGV(), zzs.zzXDc()), zzYWH.zzW4i, zzs, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX3
        public final /* synthetic */ zzYV5 zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzY(z, zzz46, (zzS) zzz4m, secureRandom);
        }
    }

    public static final class zzU extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYWH.zzZ(zzz46, zzy.zzXGV(), zzy.zzXDc()), zzYWH.zzW4i, zzy);
        }

        @Override // com.aspose.words.internal.zzYX9
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzY) zzz5q);
        }
    }

    public static final class zzV extends zzYXA<zzS, zzZ46> {
        @Override // com.aspose.words.internal.zzYXA
        public final /* bridge */ /* synthetic */ zzYUC zzZ(boolean z, zzZ58 zzz58, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, (zzZ46) zzz58, (zzS) zzz4m, secureRandom);
        }

        private static zzYUC zzZ(boolean z, zzZ46 zzz46, zzS zzs, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYWH.zzZ(zzz46, zzs.zzXGV(), zzs.zzXDc()), (zzYUV<zzYV8>) zzYWH.zzW4i, (zzZ4L) zzs, false, secureRandom);
        }
    }

    public static final class zzW extends zzYX4 {
        private final zzYXR zzWb0;
        private final int zzWiC;
        private final SecureRandom zzWk5;

        public zzW(int i, SecureRandom secureRandom) {
            this(zzYWH.zzWb4, i, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzW(zzYXR zzyxr, int i, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            if (zzYWH.zzfw(i)) {
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
            return (zzYV8) zzYVZ.zzZ(zzYWH.zzWb4, new zzYWG(), new zzYVN<zzYWG>() { // from class: com.aspose.words.internal.zzYWH.zzX.1
                private static void zzZ(zzYWG zzywg) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("c9ac8a939b3868f6fcc81336913d515e");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("101112131415161718191a1b1c1d1e1f"));
                    zzywg.zzZ(true, zzys7);
                    zzywg.zzY(bArrDecode, 0, bArr, 0);
                    zzywg.zzY(bArrDecode, 8, bArr, 8);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzywg.zzZ(false, zzys7);
                    zzywg.zzY(bArr, 0, bArr, 0);
                    zzywg.zzY(bArr, 8, bArr, 8);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYWG zzywg) throws Exception {
                    zzZ(zzywg);
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
            return zzYYZ.zzZ(z, zzYWH.zzZ(zzz46, zzy.zzXGV(), zzy.zzXDc()), zzYWH.zzW4i, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("RC2");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW4i = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW4h = new zzS(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW4g = new zzS(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW4f = new zzS(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW4e = new zzS(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW4d = new zzS(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW4c = new zzS(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW4b = new zzS(new zzYXR(zzyxr, zzywu2));
        zzW4a = new zzS(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW49 = new zzS(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW48 = new zzS(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW47 = new zzS(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW46 = new zzS(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW45 = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW44 = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW43 = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW42 = new zzS(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW41 = new zzS(new zzYXR(zzyxr, zzYWU.CFB64));
        zzW40 = new zzS(new zzYXR(zzyxr, zzYWU.OFB64));
        zzW3Z = new zzS(new zzYXR(zzyxr, zzYWU.CTR));
        zzW3Y = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW3X = new zzY(new zzYXR(zzyxr, zzYWU.CBCMAC));
        zzW3W = new zzY(new zzYXR(zzyxr, zzYWU.CFB8MAC));
        zzW3V = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
        zzW3U = new zzS(new zzYXR(zzyxr, zzYWU.RFC3217_WRAP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYS8 zzZ(zzZ46 zzz46, zzZ5W zzz5w, int i) {
        zzYUD zzyudZzZ = zzZ(zzz46, zzz5w);
        return i > 0 ? new zzYWF(zzyudZzZ.zzXK4(), i) : new zzYS7(zzyudZzZ.zzXK4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzfw(int i) {
        return i < 8 || i > 1024;
    }

    public static final class zzY extends zzYXQ<zzY> {
        private final int zzW3T;

        private zzY(zzYXR zzyxr, int i, byte[] bArr, int i2) {
            super(zzyxr, 8, bArr, i2);
            this.zzW3T = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYXQ
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public zzY zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, this.zzW3T, bArr, i);
        }

        public final int zzXDc() {
            return this.zzW3T;
        }

        public final zzY zzfm(int i) {
            return new zzY(zzXGV(), i, this.f51276iv, this.zzWiH);
        }

        public zzY(zzYXR zzyxr) {
            this(zzyxr, -1, null, zzYVO.zzY(zzyxr, 64));
        }
    }

    private static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (!zzfw(zzyudZzZ.zzXEo())) {
            zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
            return zzyudZzZ;
        }
        throw new zzZ5E("Key the wrong size for RC2");
    }
}
