package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYZ6 {
    public static final zzY zzWa2;
    public static final zzT zzWa3;
    public static final zzY zzWa4;
    public static final zzT zzWa5;
    public static final zzT zzWa6;
    public static final zzT zzWa7;
    public static final zzT zzWa8;
    public static final zzT zzWa9;
    public static final zzT zzWaa;
    public static final zzT zzWab;
    public static final zzT zzWac;
    public static final zzT zzWad;
    public static final zzT zzWae;
    public static final zzT zzWaf;
    public static final zzT zzWag;
    public static final zzT zzWah;
    public static final zzT zzWai;
    public static final zzT zzWaj;
    public static final zzT zzWak;
    public static final zzT zzWal;
    public static final zzT zzWam;
    public static final zzT zzWan;
    private static final zzX zzWao;
    public static final zzYXR zzWb4;

    public static final class zzT extends zzYXN<zzT> {
        private zzT(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 8, zzyxr.zz5(bArr, 8));
        }

        private static zzT zzV(zzYXR zzyxr, byte[] bArr) {
            return new zzT(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzV(zzyxr, bArr);
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
            return zzYYZ.zzZ(z, zzYZ6.zzZ(zzz46, zzt.zzXGV()), zzYZ6.zzWao, zzt, secureRandom);
        }
    }

    public static final class zzV extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYZ6.zzZ(zzz46, zzy.zzXGV()), zzYZ6.zzWao, zzy);
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
            this(zzYZ6.zzWb4, i, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzW(zzYXR zzyxr, int i, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            if (zzYZ6.zzfw(i)) {
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
            return (zzYV8) zzYVZ.zzZ(zzYZ6.zzWb4, new zzYZ5(), new zzYVN<zzYZ5>() { // from class: com.aspose.words.internal.zzYZ6.zzX.1
                private static void zzZ(zzYZ5 zzyz5) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("d211ebd0ac42e44ba357819b935d8470");
                    byte[] bArr = new byte[bArrDecode.length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("101112131415161718191a1b1c1d1e1f"));
                    zzyz5.zzZ(true, zzys7);
                    zzyz5.zzY(bArrDecode, 0, bArr, 0);
                    zzyz5.zzY(bArrDecode, 8, bArr, 8);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyz5.zzZ(false, zzys7);
                    zzyz5.zzY(bArr, 0, bArr, 0);
                    zzyz5.zzY(bArr, 8, bArr, 8);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYZ5 zzyz5) throws Exception {
                    zzZ(zzyz5);
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

        private static zzY zzW(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzW(zzyxr, bArr, i);
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
            return zzYYZ.zzZ(z, zzYZ6.zzZ(zzz46, zzy.zzXGV()), zzYZ6.zzWao, zzy);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("CAST5");
        zzWb4 = zzyxr;
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzWao = zzx;
        zzYWU zzywu = zzYWU.ECB;
        zzWan = new zzT(new zzYXR(zzyxr, zzywu));
        zzYWM zzywm = zzYWM.PKCS7;
        zzWam = new zzT(new zzYXR(zzyxr, zzywu, zzywm));
        zzYWM zzywm2 = zzYWM.ISO10126_2;
        zzWal = new zzT(new zzYXR(zzyxr, zzywu, zzywm2));
        zzYWM zzywm3 = zzYWM.X923;
        zzWak = new zzT(new zzYXR(zzyxr, zzywu, zzywm3));
        zzYWM zzywm4 = zzYWM.ISO7816_4;
        zzWaj = new zzT(new zzYXR(zzyxr, zzywu, zzywm4));
        zzYWM zzywm5 = zzYWM.TBC;
        zzWai = new zzT(new zzYXR(zzyxr, zzywu, zzywm5));
        zzYWU zzywu2 = zzYWU.CBC;
        zzWah = new zzT(new zzYXR(zzyxr, zzywu2));
        zzWag = new zzT(new zzYXR(zzyxr, zzywu2, zzywm));
        zzWaf = new zzT(new zzYXR(zzyxr, zzywu2, zzywm2));
        zzWae = new zzT(new zzYXR(zzyxr, zzywu2, zzywm3));
        zzWad = new zzT(new zzYXR(zzyxr, zzywu2, zzywm4));
        zzWac = new zzT(new zzYXR(zzyxr, zzywu2, zzywm5));
        zzWab = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS1));
        zzWaa = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS2));
        zzWa9 = new zzT(new zzYXR(zzyxr, zzywu2, zzYWM.CS3));
        zzWa8 = new zzT(new zzYXR(zzyxr, zzYWU.CFB8));
        zzWa7 = new zzT(new zzYXR(zzyxr, zzYWU.CFB64));
        zzWa6 = new zzT(new zzYXR(zzyxr, zzYWU.OFB64));
        zzWa5 = new zzT(new zzYXR(zzyxr, zzYWU.CTR));
        zzWa4 = new zzY(new zzYXR(zzyxr, zzYWU.EAX));
        zzWa3 = new zzT(new zzYXR(zzyxr, zzYWU.OpenPGPCFB));
        zzWa2 = new zzY(new zzYXR(zzyxr, zzYWU.CMAC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("CAST5 key must be between 40 and 128 bits inclusive");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzfw(int i) {
        return i < 40 || i > 128;
    }
}
