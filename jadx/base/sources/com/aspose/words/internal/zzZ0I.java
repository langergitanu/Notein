package com.aspose.words.internal;

import java.io.OutputStream;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ0I {
    public static final zzZ zzWcK;
    public static final zzS zzWcL;
    public static final zzT zzWcM;
    public static final zzT zzWcN;
    public static final zzT zzWcO;
    public static final zzT zzWcP;
    public static final zzT zzWcQ;
    public static final zzT zzWcR;
    public static final zzT zzWcS;
    public static final zzT zzWcT;
    public static final zzT zzWcU;
    public static final zzT zzWcV;
    public static final zzT zzWcW;
    public static final zzT zzWcX;
    public static final zzT zzWcY;
    public static final zzT zzWcZ;
    public static final zzT zzWd0;
    public static final zzT zzWd1;
    public static final zzT zzWd2;
    public static final zzT zzWd3;
    public static final zzT zzWd4;
    public static final zzZ1P zzWjd;
    static final zzZ1E<zzYV8> zzWje;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZ0I$3 */
    public static /* synthetic */ class C156513 {
        static final /* synthetic */ int[] zzWkq;

        static {
            int[] iArr = new int[zzZ05.values().length];
            zzWkq = iArr;
            try {
                iArr[zzZ05.CMAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWkq[zzZ05.WRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class zzS extends zzZ0S {
        private final boolean zzWis;

        public zzS(zzZ1P zzz1p) {
            this(zzz1p, false);
        }

        public final zzS zzOL(boolean z) {
            return new zzS(zzXF4(), z);
        }

        private zzS(zzZ1P zzz1p, boolean z) {
            super(zzz1p);
            this.zzWis = z;
        }
    }

    public static final class zzT extends zzZ0S implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51295iv;

        public zzT(zzZ1P zzz1p) {
            this(zzz1p, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public zzT zzW(SecureRandom secureRandom) {
            return new zzT(zzXF4(), ((zzZ05) zzXF4().zzXFS()).zzZ(8, secureRandom));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWU, reason: merged with bridge method [inline-methods] */
        public zzT zzXg(byte[] bArr) {
            return new zzT(zzXF4(), zzYGU.zzVI(bArr));
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51295iv);
        }

        private zzT(zzZ1P zzz1p, byte[] bArr) {
            super(zzz1p);
            ((zzZ05) zzz1p.zzXFS()).zz9(bArr, 8);
            this.f51295iv = bArr;
        }
    }

    public static final class zzU extends zzZ0J<zzT> {

        public class zzZ extends zzZ0Z<zzT> implements zzZ50<zzZ4U<zzT>> {
            private final zzT zzWcE;
            private final zzYV5 zzWit;
            private final zzYUD zzWiu;

            public zzZ(zzYUD zzyud, zzT zzt, SecureRandom secureRandom) {
                this.zzWiu = zzyud;
                this.zzWcE = zzt;
                this.zzWit = zzZ2T.zzZ(true, zzyud, zzZ0I.zzWje, zzt, secureRandom);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
            public zzZ4U<zzT> zzX(SecureRandom secureRandom) {
                return zzU.this.new zzZ(this.zzWiu, this.zzWcE, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ4U
            public final zzZ5N zzR(OutputStream outputStream) {
                return this.zzWit.zzXCK() instanceof zzYUE ? new zzYU7(outputStream, (zzYUE) this.zzWit.zzXCK()) : new zzYU7(outputStream, this.zzWit);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                return this.zzWcE;
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfY(int i) {
                return this.zzWit.zzfY(i);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfZ(int i) {
                return this.zzWit.getOutputSize(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ0J, com.aspose.words.internal.zzZ44
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public zzZ11<zzT> zzW(zzZ46 zzz46, final zzT zzt) {
            final zzYV5 zzyv5ZzZ = zzZ2T.zzZ(false, zzZ0I.zzZ(zzz46, zzt, true), zzZ0I.zzWje, zzt, null);
            return new zzZ11<zzT>() { // from class: com.aspose.words.internal.zzZ0I.zzU.1
                @Override // com.aspose.words.internal.zzZ4W
                public final zzZ5N zzS(OutputStream outputStream) {
                    return zzyv5ZzZ.zzXCK() instanceof zzYUE ? new zzYU7(outputStream, (zzYUE) zzyv5ZzZ.zzXCK()) : new zzYU7(outputStream, zzyv5ZzZ);
                }

                @Override // com.aspose.words.internal.zzZ4X
                public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                    return zzt;
                }

                @Override // com.aspose.words.internal.zzZ4X
                public final int zzfY(int i) {
                    return zzyv5ZzZ.zzfY(i);
                }

                @Override // com.aspose.words.internal.zzZ4X
                public final int zzfZ(int i) {
                    return zzyv5ZzZ.getOutputSize(i);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ0J, com.aspose.words.internal.zzZ44
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public zzZ0Z<zzT> zzX(zzZ46 zzz46, zzT zzt) {
            return new zzZ(zzZ0I.zzZ(zzz46, zzt, false), zzt, null);
        }
    }

    public static final class zzV extends zzZ15<zzZ> {
        private static zzYUR zzZ(zzZ46 zzz46, zzZ zzz) {
            zzYUR zzyurZzZ = zzZ0I.zzZ(zzz);
            zzYUD zzyudZzZ = zzZ0I.zzZ(zzz46, zzz, false);
            if (zzz.getIV() != null) {
                zzyurZzZ.zzZ(zzYZF.zzZ(zzyudZzZ, zzz.getIV()));
                return zzyurZzZ;
            }
            zzyurZzZ.zzZ(zzYZF.zzZ(zzyudZzZ));
            return zzyurZzZ;
        }

        @Override // com.aspose.words.internal.zzZ15
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzZ) zzz5q);
        }
    }

    public static final class zzW extends zzZ18<zzS, zzZ46> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ18, com.aspose.words.internal.zzZ55
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public zzZ1A<zzS> zzY(zzZ46 zzz46, final zzS zzs) {
            zzYUD zzyudZzZ = zzZ0I.zzZ(zzz46, zzs, true);
            final zzYUC zzyucZzZ = zzZ(zzs.zzXF4(), zzs.zzWis);
            zzyucZzZ.zzZ(false, new zzYS7(zzyudZzZ.zzXK4()));
            return new zzZ1A<zzS>() { // from class: com.aspose.words.internal.zzZ0I.zzW.2
                @Override // com.aspose.words.internal.zzZ57
                public final byte[] zzh(byte[] bArr, int i) throws zzZ5B {
                    try {
                        return zzyucZzZ.zzu(bArr, 0, i);
                    } catch (zzYUT e) {
                        throw new zzZ5B("Unable to unwrap key: " + e.getMessage(), e);
                    }
                }
            };
        }

        private static zzYUC zzZ(zzZ1P zzz1p, boolean z) {
            if (C156513.zzWkq[((zzZ05) zzz1p.zzXFS()).ordinal()] == 2) {
                return new zzYRS(zzZ0I.zzWje.zzXFZ(), z);
            }
            throw new IllegalArgumentException("Unknown algorithm passed to FipsDESEDE.KeyWrapOperatorFactory: " + zzz1p.getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ18, com.aspose.words.internal.zzZ55
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public zzZ17<zzS> zzZ(zzZ46 zzz46, final zzS zzs) {
            zzYUD zzyudZzZ = zzZ0I.zzZ(zzz46, zzs, false);
            final zzYUC zzyucZzZ = zzZ(zzs.zzXF4(), zzs.zzWis);
            zzyucZzZ.zzZ(true, new zzYS7(zzyudZzZ.zzXK4()));
            return new zzZ17<zzS>() { // from class: com.aspose.words.internal.zzZ0I.zzW.1
                @Override // com.aspose.words.internal.zzZ54
                public final byte[] zzg(byte[] bArr, int i) throws zzZ4H {
                    try {
                        return zzyucZzZ.zzv(bArr, 0, i);
                    } catch (Exception e) {
                        throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to wrap key: ")), e);
                    }
                }
            };
        }
    }

    public static final class zzX extends zzZ0K {
        private final int zzWiC;
        private final zzZ1P zzWjX;
        private final SecureRandom zzWk5;

        public zzX(int i, SecureRandom secureRandom) {
            this(zzZ0I.zzWjd, i, secureRandom);
        }

        @Override // com.aspose.words.internal.zzZ45
        public final zzZ46 zzXGH() {
            zzZ2E zzz2e = new zzZ2E(this.zzWjX);
            zzz2e.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWjX, zzz2e.zzXG8());
        }

        public zzX(zzZ0S zzz0s, SecureRandom secureRandom) {
            this(zzz0s.zzXF4(), 168, secureRandom);
        }

        private zzX(zzZ1P zzz1p, int i, SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                zzYZF.zzZ(secureRandom, 112, zzz1p);
                if (i != 168 && i != 192) {
                    StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Attempt to create key with unapproved key size [", "]: ");
                    sbOooO0OO.append(zzz1p.getName());
                    throw new IllegalArgumentException(sbOooO0OO.toString());
                }
            } else if (i != 112 && i != 168 && i != 128 && i != 192) {
                StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(i, "Attempt to create key with invalid key size [", "]: ");
                sbOooO0OO2.append(zzz1p.getName());
                throw new IllegalArgumentException(sbOooO0OO2.toString());
            }
            this.zzWjX = zzz1p;
            this.zzWiC = i;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzY extends zzZ1E<zzYV8> {
        private static byte[] zzWiG = zzYGC.decode("4e6f772069732074");
        private static byte[] zzWiF = zzYGC.decode("f7cfbe5e6c38b35a");
        private static final byte[] zzWiE = zzYGC.decode("0102020404070708080b0b0d0d0e0e101013131515161619");

        private zzY() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFX, reason: merged with bridge method [inline-methods] */
        public final zzYV8 zzXFZ() {
            return (zzYV8) zzYZG.zzZ(zzZ0I.zzWjd, new zzZ2F(), new zzYZD<zzZ2F>() { // from class: com.aspose.words.internal.zzZ0I.zzY.1
                private static void zzZ(zzZ2F zzz2f) {
                    byte[] bArr = new byte[zzY.zzWiG.length];
                    zzYS7 zzys7 = new zzYS7(zzY.zzWiE);
                    zzz2f.zzZ(true, (zzYV3) zzys7);
                    zzz2f.zzY(zzY.zzWiG, 0, bArr, 0);
                    if (!zzYGU.zzp(zzY.zzWiF, bArr)) {
                        zzYZD.zzTQ("Failed self test on encryption");
                    }
                    zzz2f.zzZ(false, (zzYV3) zzys7);
                    zzz2f.zzY(bArr, 0, bArr, 0);
                    if (zzYGU.zzp(zzY.zzWiG, bArr)) {
                        return;
                    }
                    zzYZD.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ2F zzz2f) throws Exception {
                    zzZ(zzz2f);
                }
            });
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static final class zzZ extends zzZ0S implements zzZ5P {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51296iv;
        private final int zzWiH;

        public zzZ(zzZ1P zzz1p) {
            this(zzz1p, null, zzYZF.zzY(zzz1p, 64));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public zzZ zzW(SecureRandom secureRandom) {
            return new zzZ(zzXF4(), zzXF4().zzZ(8, secureRandom), this.zzWiH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzWV, reason: merged with bridge method [inline-methods] */
        public zzZ zzXg(byte[] bArr) {
            return new zzZ(zzXF4(), zzYGU.zzVI(bArr), this.zzWiH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ5Q
        /* JADX INFO: renamed from: zzfG, reason: merged with bridge method [inline-methods] */
        public zzZ zzg1(int i) {
            return new zzZ(zzXF4(), zzYGU.zzVI(this.f51296iv), i);
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51296iv);
        }

        @Override // com.aspose.words.internal.zzZ5Q
        public final int zzXH3() {
            return this.zzWiH;
        }

        private zzZ(zzZ1P zzz1p, byte[] bArr, int i) {
            super(zzz1p);
            this.f51296iv = bArr;
            this.zzWiH = i;
        }
    }

    static {
        zzZ1P zzz1p = new zzZ1P("TripleDES");
        zzWjd = zzz1p;
        zzZ05 zzz05 = zzZ05.ECB;
        zzWd4 = new zzT(new zzZ1P(zzz1p, zzz05));
        zzZ00 zzz00 = zzZ00.PKCS7;
        zzWd3 = new zzT(new zzZ1P(zzz1p, zzz05, zzz00));
        zzZ00 zzz002 = zzZ00.ISO10126_2;
        zzWd2 = new zzT(new zzZ1P(zzz1p, zzz05, zzz002));
        zzZ00 zzz003 = zzZ00.X923;
        zzWd1 = new zzT(new zzZ1P(zzz1p, zzz05, zzz003));
        zzZ00 zzz004 = zzZ00.ISO7816_4;
        zzWd0 = new zzT(new zzZ1P(zzz1p, zzz05, zzz004));
        zzZ00 zzz005 = zzZ00.TBC;
        zzWcZ = new zzT(new zzZ1P(zzz1p, zzz05, zzz005));
        zzZ05 zzz052 = zzZ05.CBC;
        zzWcY = new zzT(new zzZ1P(zzz1p, zzz052));
        zzWcX = new zzT(new zzZ1P(zzz1p, zzz052, zzz00));
        zzWcW = new zzT(new zzZ1P(zzz1p, zzz052, zzz002));
        zzWcV = new zzT(new zzZ1P(zzz1p, zzz052, zzz003));
        zzWcU = new zzT(new zzZ1P(zzz1p, zzz052, zzz004));
        zzWcT = new zzT(new zzZ1P(zzz1p, zzz052, zzz005));
        zzWcS = new zzT(new zzZ1P(zzz1p, zzz052, zzZ00.CS1));
        zzWcR = new zzT(new zzZ1P(zzz1p, zzz052, zzZ00.CS2));
        zzWcQ = new zzT(new zzZ1P(zzz1p, zzz052, zzZ00.CS3));
        zzWcP = new zzT(new zzZ1P(zzz1p, zzZ05.CFB8));
        zzWcO = new zzT(new zzZ1P(zzz1p, zzZ05.CFB64));
        zzWcN = new zzT(new zzZ1P(zzz1p, zzZ05.OFB64));
        zzWcM = new zzT(new zzZ1P(zzz1p, zzZ05.CTR));
        zzWcL = new zzS(new zzZ1P(zzz1p, zzZ05.WRAP));
        zzWcK = new zzZ(new zzZ1P(zzz1p, zzZ05.CMAC));
        zzY zzy = new zzY((byte) 0);
        zzy.zzXFZ();
        zzZ(zzy);
        zzWje = zzy;
        zzYXY.zzZ(zzz1p, zzy);
    }

    private zzZ0I() {
    }

    public static zzZ1E<zzYUR> zzX(zzZ1P zzz1p) {
        if (C156513.zzWkq[((zzZ05) zzz1p.zzXFS()).ordinal()] == 1) {
            return new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0I.1
                private static zzYUR zzXG0() {
                    return new zzYTX(zzZ0I.zzWje.zzXFZ());
                }

                @Override // com.aspose.words.internal.zzYUV
                public final /* synthetic */ Object zzXFZ() {
                    return zzXG0();
                }
            };
        }
        throw new IllegalArgumentException("Unknown algorithm passed to FipsTripleDES MAC Provider: " + zzz1p);
    }

    public static zzYUR zzZ(zzZ zzz) {
        if (C156513.zzWkq[((zzZ05) zzz.zzXF4().zzXFS()).ordinal()] == 1) {
            return new zzYTX(zzWje.zzXFZ(), zzz.zzWiH);
        }
        throw new IllegalArgumentException("Unknown algorithm passed to FipsTripleDES.OperatorFactory.createMACCalculator: " + zzz.zzXF4());
    }

    private static void zzZ(zzZ5W zzz5w, int i) {
        if (zzZ5L.zzXH0()) {
            if (i == 168 || i == 192) {
                return;
            }
            throw new zzZ5E("Key must be of length 192 bits: " + zzz5w.getName());
        }
        if (i == 112 || i == 168 || i == 128 || i == 192) {
            return;
        }
        throw new zzZ5E("Key must be of length 128 or 192 bits: " + zzz5w.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ4M zzz4m, boolean z) {
        zzYUD zzyudZzZ = zzYZZ.zzZ(zzz46);
        int iZzXEo = zzyudZzZ.zzXEo();
        if (!z || iZzXEo != 128) {
            zzZ(zzz46.zzXGV(), iZzXEo);
            if (zzZ5L.zzXH0() && !z && !zzYT1.zzW2(zzyudZzZ.zzXK4())) {
                throw new zzZ5E("Key not real 3-Key DESEDE key");
            }
        }
        if (!zzYGM.zzwd("org.bouncycastle.tripledes.allow_weak") && !z) {
            if (!zzYT1.zzW1(zzyudZzZ.zzXK4())) {
                if (zzYT1.zzZU(zzyudZzZ.zzXK4(), zzyudZzZ.zzXK4().length)) {
                    throw new zzZ5E("Attempt to use weak key: " + zzz46.zzXGV().getName());
                }
            } else {
                throw new zzZ5E("Attempt to use repeated DES key: " + zzz46.zzXGV().getName());
            }
        }
        zzZ5W zzz5wZzXGV = zzz46.zzXGV();
        if (zzz5wZzXGV.equals(zzWjd) || zzz5wZzXGV.equals(zzz4m.zzXGV())) {
            return zzyudZzZ;
        }
        throw new zzZ5E("FIPS Key not for specified algorithm");
    }

    private static void zzZ(zzY zzy) {
        zzYZG.zzZ(zzWjd, zzy, new zzYRV<zzY>() { // from class: com.aspose.words.internal.zzZ0I.2
            private static boolean zzY(zzY zzy2) throws Exception {
                byte[] bArrDecode = zzYGC.decode("6bc1bee22e409f96e93d7e117393172a");
                byte[] bArrDecode2 = zzYGC.decode("c0b9bbee139722ab");
                zzYTX zzytx = new zzYTX(zzy2.zzXFZ(), 64);
                zzytx.zzZ(new zzYS7(zzYGC.decode("0102020404070708080b0b0d0d0e0e101013131515161619")));
                zzytx.update(bArrDecode, 0, bArrDecode.length);
                byte[] bArr = new byte[8];
                zzytx.doFinal(bArr, 0);
                return zzYGU.zzp(bArr, bArrDecode2);
            }

            @Override // com.aspose.words.internal.zzYRV
            public final /* synthetic */ boolean zzWO(zzY zzy2) throws Exception {
                return zzY(zzy2);
            }
        });
    }
}
