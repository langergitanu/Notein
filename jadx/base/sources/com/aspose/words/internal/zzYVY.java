package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYVY {
    public static final zzS zzW1A;
    public static final zzS zzW1B;
    public static final zzS zzW1C;
    private static final zzX zzW1D;
    public static final zzR zzW1c;
    public static final zzR zzW1d;
    public static final zzY zzW1e;
    public static final zzY zzW1f;
    public static final zzY zzW1g;
    public static final zzY zzW1h;
    public static final zzY zzW1i;
    public static final zzY zzW1j;
    public static final zzS zzW1k;
    public static final zzS zzW1l;
    public static final zzS zzW1m;
    public static final zzS zzW1n;
    public static final zzS zzW1o;
    public static final zzS zzW1p;
    public static final zzS zzW1q;
    public static final zzS zzW1r;
    public static final zzS zzW1s;
    public static final zzS zzW1t;
    public static final zzS zzW1u;
    public static final zzS zzW1v;
    public static final zzS zzW1w;
    public static final zzS zzW1x;
    public static final zzS zzW1y;
    public static final zzS zzW1z;
    public static final zzYXR zzWb4;

    public static final class zzR extends zzYXO<zzYXR> implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51261iv;
        private final boolean zzWis;

        public zzR(zzYXR zzyxr) {
            this(zzyxr, null, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWg, reason: merged with bridge method [inline-methods] */
        public zzR zzXg(byte[] bArr) {
            return new zzR(zzXGV(), zzYGU.zzVI(bArr), this.zzWis);
        }

        private int zzXDP() {
            return zzXGV().equals(zzYVY.zzW1d.zzXGV()) ? 8 : 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzy, reason: merged with bridge method [inline-methods] */
        public zzR zzW(SecureRandom secureRandom) {
            return new zzR(zzXGV(), zzXGV().zzZ(zzXDP(), secureRandom), this.zzWis);
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51261iv);
        }

        public final zzR zzOI(boolean z) {
            return new zzR(zzXGV(), zzYGU.zzVI(this.f51261iv), z);
        }

        private zzR(zzYXR zzyxr, byte[] bArr, boolean z) {
            super(zzyxr);
            if (bArr != null) {
                ((zzYWU) zzyxr.zzXFS()).zz5(bArr, zzXDP());
            }
            this.f51261iv = bArr;
            this.zzWis = z;
        }
    }

    public static final class zzS extends zzYXN<zzS> {
        private zzS(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 16, zzyxr.zz5(bArr, 16));
        }

        private static zzS zzO(zzYXR zzyxr, byte[] bArr) {
            return new zzS(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzO(zzyxr, bArr);
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
            return zzYYZ.zzZ(z, zzYVY.zzZ(zzz46, zzs.zzXGV()), zzYVY.zzW1D, zzs, secureRandom);
        }
    }

    public static final class zzU extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYVY.zzZ(zzz46, zzy.zzXGV()), zzYVY.zzW1D, zzy);
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
            return zzYYZ.zzZ(z, zzYVY.zzZ(zzz46, zzr.zzXGV()), zzYVY.zzW1D, zzr, zzr.zzWis, secureRandom);
        }
    }

    public static final class zzW extends zzYX4 {
        private final zzYXR zzWb0;
        private final int zzWiC;
        private final SecureRandom zzWk5;

        public zzW(int i, SecureRandom secureRandom) {
            this(zzYVY.zzWb4, i, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzW(zzYXR zzyxr, int i, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            if (zzYVY.zzfw(i)) {
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
            return (zzYV8) zzYVZ.zzZ(zzYVY.zzWb4, new zzYVX(), new zzYVN<zzYVX>() { // from class: com.aspose.words.internal.zzYVY.zzX.1
                private static void zzZ(zzYVX zzyvx) {
                    byte[] bArrDecode = zzYGC.decode("3DA46FFA6F4D6F30CD258333E5A61369");
                    byte[] bArrDecode2 = zzYGC.decode("00112233445566778899AABBCCDDEEFF");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F"));
                    zzyvx.zzZ(true, zzys7);
                    zzyvx.zzY(bArrDecode, 0, bArr, 0);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyvx.zzZ(false, zzys7);
                    zzyvx.zzY(bArr, 0, bArr, 0);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYVX zzyvx) throws Exception {
                    zzZ(zzyvx);
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

        private static zzY zzN(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzN(zzyxr, bArr, i);
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
            return zzYYZ.zzZ(z, zzYVY.zzZ(zzz46, zzy.zzXGV()), zzYVY.zzW1D, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("Serpent");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzW1D = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzW1C = new zzS(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzW1B = new zzS(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzW1A = new zzS(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzW1z = new zzS(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzW1y = new zzS(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzW1x = new zzS(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzW1w = new zzS(new zzYXR(zzyxr, zzywu2));
        zzW1v = new zzS(new zzYXR(zzyxr, zzywu2, zzywm));
        zzW1u = new zzS(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzW1t = new zzS(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzW1s = new zzS(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzW1r = new zzS(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzW1q = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzW1p = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzW1o = new zzS(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzW1n = new zzS(new zzYXR(zzyxr, zzYWU.CFB8));
        zzW1m = new zzS(new zzYXR(zzyxr, zzYWU.CFB128));
        zzW1l = new zzS(new zzYXR(zzyxr, zzYWU.OFB128));
        zzW1k = new zzS(new zzYXR(zzyxr, zzYWU.CTR));
        zzW1j = new zzY(new zzYXR(zzyxr, zzYWU.GCM));
        zzW1i = new zzY(new zzYXR(zzyxr, zzYWU.CCM));
        zzW1h = new zzY(new zzYXR(zzyxr, zzYWU.OCB));
        zzW1g = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzW1f = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
        zzW1e = new zzY(new zzYXR(zzyxr, zzYWU.GMAC));
        zzW1d = new zzR(new zzYXR(zzyxr, zzYWU.WRAP));
        zzW1c = new zzR(new zzYXR(zzyxr, zzYWU.WRAPPAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("Serpent key must be a multiple of 32 bits and no more than 256 bits");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzfw(int i) {
        return i < 32 || i % 32 != 0 || i > 256;
    }
}
