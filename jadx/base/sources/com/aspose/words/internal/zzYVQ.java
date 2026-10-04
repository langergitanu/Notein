package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYVQ {
    public static final zzS zzW0A;
    public static final zzS zzW0B;
    public static final zzS zzW0C;
    private static final zzX zzW0D;
    public static final zzR zzW0b;
    public static final zzR zzW0c;
    public static final zzY zzW0d;
    public static final zzY zzW0e;
    public static final zzS zzW0f;
    public static final zzY zzW0g;
    public static final zzY zzW0h;
    public static final zzY zzW0i;
    public static final zzY zzW0j;
    public static final zzS zzW0k;
    public static final zzS zzW0l;
    public static final zzS zzW0m;
    public static final zzS zzW0n;
    public static final zzS zzW0o;
    public static final zzS zzW0p;
    public static final zzS zzW0q;
    public static final zzS zzW0r;
    public static final zzS zzW0s;
    public static final zzS zzW0t;
    public static final zzS zzW0u;
    public static final zzS zzW0v;
    public static final zzS zzW0w;
    public static final zzS zzW0x;
    public static final zzS zzW0y;
    public static final zzS zzW0z;
    public static final zzYXR zzWb4;

    public static final class zzR extends zzYXO<zzYXR> implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51260iv;
        private final boolean zzWis;

        public zzR(zzYXR zzyxr) {
            this(zzyxr, null, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWe, reason: merged with bridge method [inline-methods] */
        public zzR zzXg(byte[] bArr) {
            return new zzR(zzXGV(), zzYGU.zzVI(bArr), this.zzWis);
        }

        private int zzXDP() {
            return zzXGV().equals(zzYVQ.zzW0c.zzXGV()) ? 8 : 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzx, reason: merged with bridge method [inline-methods] */
        public zzR zzW(SecureRandom secureRandom) {
            return new zzR(zzXGV(), zzXGV().zzZ(zzXDP(), secureRandom), this.zzWis);
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51260iv);
        }

        public final zzR zzOH(boolean z) {
            return new zzR(zzXGV(), zzYGU.zzVI(this.f51260iv), z);
        }

        private zzR(zzYXR zzyxr, byte[] bArr, boolean z) {
            super(zzyxr);
            if (bArr != null) {
                ((zzYWU) zzyxr.zzXFS()).zz5(bArr, zzXDP());
            }
            this.f51260iv = bArr;
            this.zzWis = z;
        }
    }

    public static final class zzS extends zzYXN<zzS> {
        private zzS(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 16, zzyxr.zz5(bArr, 16));
        }

        private static zzS zzM(zzYXR zzyxr, byte[] bArr) {
            return new zzS(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzM(zzyxr, bArr);
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
            return zzYYZ.zzZ(z, zzYVQ.zzZ(zzz46, zzs.zzXGV()), zzYVQ.zzW0D, zzs, secureRandom);
        }
    }

    public static final class zzU extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYVQ.zzZ(zzz46, zzy.zzXGV()), zzYVQ.zzW0D, zzy);
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
            return zzYYZ.zzZ(z, zzYVQ.zzZ(zzz46, zzr.zzXGV()), zzYVQ.zzW0D, zzr, zzr.zzWis, secureRandom);
        }
    }

    public static final class zzW extends zzYX4 {
        private final zzYXR zzWb0;
        private final int zzWiC;
        private final SecureRandom zzWk5;

        public zzW(int i, SecureRandom secureRandom) {
            this(zzYVQ.zzWb4, i, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzW(zzYXR zzyxr, int i, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            if (zzYVQ.zzfw(i)) {
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
            return (zzYV8) zzYVZ.zzZ(zzYVQ.zzWb4, new zzYVP(), new zzYVN<zzYVP>() { // from class: com.aspose.words.internal.zzYVQ.zzX.1
                private static void zzZ(zzYVP zzyvp) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("b7b5fb57ec446a11cbb7e6292342537b");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f"));
                    zzyvp.zzZ(true, zzys7);
                    zzyvp.zzY(bArrDecode, 0, bArr, 0);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyvp.zzZ(false, zzys7);
                    zzyvp.zzY(bArr, 0, bArr, 0);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYVP zzyvp) throws Exception {
                    zzZ(zzyvp);
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

        private static zzY zzL(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzL(zzyxr, bArr, i);
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
            return zzYYZ.zzZ(z, zzYVQ.zzZ(zzz46, zzy.zzXGV()), zzYVQ.zzW0D, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("Twofish");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW0D = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW0C = new zzS(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW0B = new zzS(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW0A = new zzS(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW0z = new zzS(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW0y = new zzS(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW0x = new zzS(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW0w = new zzS(new zzYXR(zzyxr, zzywu2));
        zzW0v = new zzS(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW0u = new zzS(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW0t = new zzS(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW0s = new zzS(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW0r = new zzS(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW0q = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW0p = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW0o = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW0n = new zzS(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW0m = new zzS(new zzYXR(zzyxr, zzYWU.CFB128));
        zzW0l = new zzS(new zzYXR(zzyxr, zzYWU.OFB128));
        zzW0k = new zzS(new zzYXR(zzyxr, zzYWU.CTR));
        zzW0j = new zzY(new zzYXR(zzyxr, zzYWU.GCM));
        zzW0i = new zzY(new zzYXR(zzyxr, zzYWU.CCM));
        zzW0h = new zzY(new zzYXR(zzyxr, zzYWU.OCB));
        zzW0g = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW0f = new zzS(new zzYXR(zzyxr, zzYWU.OpenPGPCFB));
        zzW0e = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
        zzW0d = new zzY(new zzYXR(zzyxr, zzYWU.GMAC));
        zzW0c = new zzR(new zzYXR(zzyxr, zzYWU.WRAP));
        zzW0b = new zzR(new zzYXR(zzyxr, zzYWU.WRAPPAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("Twofish key must be of length 64-256 bits");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzfw(int i) {
        return i < 64 || i > 256;
    }
}
