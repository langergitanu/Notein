package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ1T {
    public static final zzR zzWiO;
    public static final zzR zzWiP;
    public static final zzY zzWiQ;
    public static final zzY zzWiR;
    public static final zzY zzWiS;
    public static final zzY zzWiT;
    public static final zzS zzWiU;
    public static final zzS zzWiV;
    public static final zzS zzWiW;
    public static final zzS zzWiX;
    public static final zzS zzWiY;
    public static final zzS zzWiZ;
    public static final zzS zzWj0;
    public static final zzS zzWj1;
    public static final zzS zzWj2;
    public static final zzS zzWj3;
    public static final zzS zzWj4;
    public static final zzS zzWj5;
    public static final zzS zzWj6;
    public static final zzS zzWj7;
    public static final zzS zzWj8;
    public static final zzS zzWj9;
    public static final zzS zzWja;
    public static final zzS zzWjb;
    public static final zzS zzWjc;
    public static final zzZ1P zzWjd;
    static final zzZ1E<zzYV8> zzWje;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZ1T$6 */
    public static /* synthetic */ class C157496 {
        static final /* synthetic */ int[] zzWkq;

        static {
            int[] iArr = new int[zzZ05.values().length];
            zzWkq = iArr;
            try {
                iArr[zzZ05.CMAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWkq[zzZ05.GMAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWkq[zzZ05.CCM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzWkq[zzZ05.WRAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzWkq[zzZ05.WRAPPAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class zzR extends zzZ0S {
        private final boolean zzWis;

        public zzR(zzZ1P zzz1p) {
            this(zzz1p, false);
        }

        public final zzR zzOM(boolean z) {
            return new zzR(zzXF4(), z);
        }

        private zzR(zzZ1P zzz1p, boolean z) {
            super(zzz1p);
            this.zzWis = z;
        }
    }

    public static final class zzS extends zzZ0S implements zzZ4L {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51303iv;

        public zzS(zzZ1P zzz1p) {
            this(zzz1p, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public zzS zzW(SecureRandom secureRandom) {
            return new zzS(zzXF4(), zzXF4().zzZ(16, secureRandom));
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51303iv);
        }

        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzX4, reason: merged with bridge method [inline-methods] */
        public final zzS zzXg(byte[] bArr) {
            return new zzS(zzXF4(), zzYGU.zzVI(bArr));
        }

        private zzS(zzZ1P zzz1p, byte[] bArr) {
            super(zzz1p);
            ((zzZ05) zzz1p.zzXFS()).zz9(bArr, 16);
            this.f51303iv = bArr;
        }
    }

    public static final class zzT extends zzZ0J<zzS> {
        private final SecureRandom zzWk5;

        public static class zzZ extends zzZ0Z<zzS> implements zzZ50<zzZ4U<zzS>> {
            private final zzYV5 zzWit;
            private final zzYUD zzWiu;
            private final zzS zzWiv;

            public zzZ(zzYUD zzyud, zzS zzs, SecureRandom secureRandom) {
                this.zzWiu = zzyud;
                this.zzWiv = zzs;
                this.zzWit = zzZ2T.zzZ(true, zzyud, zzZ1T.zzWje, zzs, secureRandom);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
            public zzZ4U<zzS> zzX(SecureRandom secureRandom) {
                return new zzZ(this.zzWiu, this.zzWiv, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ4U
            public final zzZ5N zzR(OutputStream outputStream) {
                return this.zzWit.zzXCK() instanceof zzYUE ? new zzYU7(outputStream, (zzYUE) this.zzWit.zzXCK()) : new zzYU7(outputStream, this.zzWit);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                return this.zzWiv;
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

        public zzT() {
            this((byte) 0);
        }

        public static zzZ0Z<zzS> zzZ(zzZ46 zzz46, zzS zzs) {
            return new zzZ(zzZ1T.zzZ(zzz46, zzs.zzXF4()), zzs, null);
        }

        @Override // com.aspose.words.internal.zzZ0J
        /* JADX INFO: renamed from: zzU */
        public final /* synthetic */ zzZ0Z zzX(zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(zzz46, (zzS) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ0J, com.aspose.words.internal.zzZ44
        public final /* synthetic */ zzZ4U zzX(zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(zzz46, (zzS) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ0J, com.aspose.words.internal.zzZ44
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public final zzZ11<zzS> zzW(zzZ46 zzz46, final zzS zzs) {
            final zzYV5 zzyv5ZzZ = zzZ2T.zzZ(false, zzZ1T.zzZ(zzz46, zzs.zzXF4()), zzZ1T.zzWje, zzs, this.zzWk5);
            return new zzZ11<zzS>() { // from class: com.aspose.words.internal.zzZ1T.zzT.1
                @Override // com.aspose.words.internal.zzZ4W
                public final zzZ5N zzS(OutputStream outputStream) {
                    return zzyv5ZzZ.zzXCK() instanceof zzYUE ? new zzYU7(outputStream, (zzYUE) zzyv5ZzZ.zzXCK()) : new zzYU7(outputStream, zzyv5ZzZ);
                }

                @Override // com.aspose.words.internal.zzZ4X
                public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                    return zzs;
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

        private zzT(byte b) {
            this.zzWk5 = null;
        }
    }

    public static final class zzU extends zzZ15<zzY> {
        private static zzYUR zzX(zzZ46 zzz46, zzY zzy) {
            zzYUR zzyurZzZ = zzZ1T.zzZ(zzy);
            zzYUD zzyudZzZ = zzZ1T.zzZ(zzz46, zzy.zzXF4());
            if (zzy.getIV() != null) {
                zzyurZzZ.zzZ(zzYZF.zzZ(zzyudZzZ, zzy.getIV()));
                return zzyurZzZ;
            }
            zzyurZzZ.zzZ(zzYZF.zzZ(zzyudZzZ));
            return zzyurZzZ;
        }

        @Override // com.aspose.words.internal.zzZ15
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzX(zzz46, (zzY) zzz5q);
        }
    }

    public static final class zzV extends zzZ18<zzR, zzZ46> {
        private static zzYUC zzZ(zzZ1P zzz1p, boolean z) {
            int i = C157496.zzWkq[((zzZ05) zzz1p.zzXFS()).ordinal()];
            if (i == 4) {
                return new zzYRS(zzZ1T.zzWje.zzXFZ(), z);
            }
            if (i == 5) {
                return new zzYRR(zzZ1T.zzWje.zzXFZ(), z);
            }
            throw new IllegalArgumentException("Unknown algorithm passed to FipsAES.KeyWrapOperatorFactory: " + zzz1p.getName());
        }

        @Override // com.aspose.words.internal.zzZ18, com.aspose.words.internal.zzZ55
        public final zzZ1A<zzR> zzY(zzZ46 zzz46, final zzR zzr) {
            zzYUD zzyudZzZ = zzZ1T.zzZ(zzz46, zzr.zzXF4());
            final zzYUC zzyucZzZ = zzZ(zzr.zzXF4(), zzr.zzWis);
            zzyucZzZ.zzZ(false, zzYZF.zzZ(zzyudZzZ));
            return new zzZ1A<zzR>() { // from class: com.aspose.words.internal.zzZ1T.zzV.2
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

        @Override // com.aspose.words.internal.zzZ18, com.aspose.words.internal.zzZ55
        public final zzZ17<zzR> zzZ(zzZ46 zzz46, final zzR zzr) {
            zzYUD zzyudZzZ = zzZ1T.zzZ(zzz46, zzr.zzXF4());
            final zzYUC zzyucZzZ = zzZ(zzr.zzXF4(), zzr.zzWis);
            zzyucZzZ.zzZ(true, zzYZF.zzZ(zzyudZzZ));
            return new zzZ17<zzR>() { // from class: com.aspose.words.internal.zzZ1T.zzV.1
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

    public static final class zzW extends zzZ0K<zzZ43> {
        private final int zzWiC;
        private final zzZ1P zzWjX;
        private final SecureRandom zzWk5;

        public zzW(int i, SecureRandom secureRandom) {
            this(zzZ1T.zzWjd, i, secureRandom);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ45
        /* JADX INFO: renamed from: zzXFT, reason: merged with bridge method [inline-methods] */
        public zzZ43 zzXGH() {
            zzZ2Q zzz2q = new zzZ2Q();
            zzz2q.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWjX, zzz2q.zzXG8());
        }

        private zzW(zzZ1P zzz1p, int i, SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                zzYZF.zzZ(secureRandom, i, zzz1p);
            }
            if (i != 128 && i != 192 && i != 256) {
                StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Attempt to create key with invalid key size [", "]: ");
                sbOooO0OO.append(zzz1p.getName());
                throw new IllegalArgumentException(sbOooO0OO.toString());
            }
            this.zzWjX = zzz1p;
            this.zzWiC = i;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzX extends zzZ1E<zzYV8> {
        private static final byte[] zzWiG = zzYGC.decode("00112233445566778899aabbccddeeff");
        private static final byte[] zzWiF = zzYGC.decode("69c4e0d86a7b0430d8cdb78070b4c55a");
        private static final byte[] zzWiE = zzYGC.decode("000102030405060708090a0b0c0d0e0f");

        private zzX() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFX, reason: merged with bridge method [inline-methods] */
        public final zzYV8 zzXFZ() {
            return (zzYV8) zzYZG.zzZ(zzZ1T.zzWjd, new zzZ2V(), new zzYZD<zzZ2V>() { // from class: com.aspose.words.internal.zzZ1T.zzX.1
                private static void zzZ(zzZ2V zzz2v) {
                    byte[] bArr = new byte[zzX.zzWiG.length];
                    zzYS7 zzys7 = new zzYS7(zzX.zzWiE);
                    zzz2v.zzZ(true, zzys7);
                    zzz2v.zzY(zzX.zzWiG, 0, bArr, 0);
                    if (!zzYGU.zzp(zzX.zzWiF, bArr)) {
                        zzYZD.zzTQ("Failed self test on encryption");
                    }
                    zzz2v.zzZ(false, zzys7);
                    zzz2v.zzY(bArr, 0, bArr, 0);
                    if (zzYGU.zzp(zzX.zzWiG, bArr)) {
                        return;
                    }
                    zzYZD.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ2V zzz2v) throws Exception {
                    zzZ(zzz2v);
                }
            });
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static final class zzY extends zzZ0S implements zzZ5P {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51304iv;
        private final int zzWiH;

        public zzY(zzZ1P zzz1p) {
            this(zzz1p, null, zzYZF.zzY(zzz1p, 128));
        }

        @Override // com.aspose.words.internal.zzZ4L
        public final byte[] getIV() {
            return zzYGU.zzVI(this.f51304iv);
        }

        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public final zzY zzW(SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                zzZ1P zzz1pZzXF4 = zzXF4();
                zzY zzy = zzZ1T.zzWiT;
                if (zzz1pZzXF4.equals(zzy.zzXF4())) {
                    zzYZF.zzZ(secureRandom, zzy.zzXF4(), "GCM IV can only be generated by an approved DRGB");
                }
            }
            return new zzY(zzXF4(), zzXF4().zzZ(16, secureRandom), this.zzWiH);
        }

        @Override // com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzX5, reason: merged with bridge method [inline-methods] */
        public final zzY zzXg(byte[] bArr) {
            return new zzY(zzXF4(), zzYGU.zzVI(bArr), this.zzWiH);
        }

        @Override // com.aspose.words.internal.zzZ5Q
        public final int zzXH3() {
            return this.zzWiH;
        }

        @Override // com.aspose.words.internal.zzZ5Q
        /* JADX INFO: renamed from: zzfP, reason: merged with bridge method [inline-methods] */
        public final zzY zzg1(int i) {
            return new zzY(zzXF4(), zzYGU.zzVI(this.f51304iv), i);
        }

        private zzY(zzZ1P zzz1p, byte[] bArr, int i) {
            super(zzz1p);
            this.f51304iv = bArr;
            this.zzWiH = i;
        }
    }

    public static final class zzZ extends zzZ1U<zzY> {

        public static class zzY extends zzZ12<zzY> {
            private final zzY zzWiI;
            private final zzYTS zzWiJ;

            public zzY(zzYUD zzyud, zzY zzy) {
                this.zzWiI = zzy;
                zzYTS zzytsZzZ = zzZ2T.zzZ(zzy.zzXF4(), zzZ1T.zzWje);
                this.zzWiJ = zzytsZzZ;
                if (zzy.f51304iv == null) {
                    throw new IllegalArgumentException("AEAD encryption requires an iv/nonce to be provided.");
                }
                zzytsZzZ.zzZ(true, zzYZF.zzZ(zzyud, zzy.f51304iv, zzy.zzWiH));
            }

            @Override // com.aspose.words.internal.zzZ4U
            public final zzZ5N zzR(OutputStream outputStream) {
                return new zzYU7(outputStream, this.zzWiJ);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                return this.zzWiI;
            }

            @Override // com.aspose.words.internal.zzZ60
            public final zzZ41 zzXH7() {
                return new C19093zzZ(this.zzWiJ);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfY(int i) {
                return this.zzWiJ.zzfY(i);
            }

            @Override // com.aspose.words.internal.zzZ4X
            public final int zzfZ(int i) {
                return this.zzWiJ.getOutputSize(i);
            }
        }

        /* JADX INFO: renamed from: com.aspose.words.internal.zzZ1T$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19093zzZ extends zzZ41 {
            private zzYTS zzWiJ;

            public C19093zzZ(zzYTS zzyts) {
                this.zzWiJ = zzyts;
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) throws IOException {
                this.zzWiJ.zzq(bArr, i, i2);
            }

            @Override // java.io.OutputStream
            public final void write(int i) throws IOException {
                this.zzWiJ.zzc((byte) i);
            }
        }

        @Override // com.aspose.words.internal.zzZ1U
        public final /* bridge */ /* synthetic */ zzZ12 zzZ(zzZ46 zzz46, zzZ0S zzz0s) {
            return zzZ(zzz46, (zzY) zzz0s);
        }

        @Override // com.aspose.words.internal.zzZ1U, com.aspose.words.internal.zzZ5Z
        public final /* bridge */ /* synthetic */ zzZ4Y zzZ(zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(zzz46, (zzY) zzz4m);
        }

        public static zzZ12<zzY> zzZ(zzZ46 zzz46, zzY zzy) {
            return new zzY(zzZ1T.zzZ(zzz46, zzy.zzXF4()), zzy);
        }

        @Override // com.aspose.words.internal.zzZ1U, com.aspose.words.internal.zzZ5Z
        public final zzZ13<zzY> zzY(zzZ46 zzz46, final zzY zzy) {
            zzYUD zzyudZzZ = zzZ1T.zzZ(zzz46, zzy.zzXF4());
            final zzYTS zzytsZzZ = zzZ2T.zzZ(zzy.zzXF4(), zzZ1T.zzWje);
            if (zzy.f51304iv != null) {
                zzytsZzZ.zzZ(false, zzYZF.zzZ(zzyudZzZ, zzy.f51304iv, zzy.zzWiH));
                return new zzZ13<zzY>() { // from class: com.aspose.words.internal.zzZ1T.zzZ.1
                    @Override // com.aspose.words.internal.zzZ4W
                    public final zzZ5N zzS(OutputStream outputStream) {
                        return new zzYU7(outputStream, zzytsZzZ);
                    }

                    @Override // com.aspose.words.internal.zzZ4X
                    public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                        return zzy;
                    }

                    @Override // com.aspose.words.internal.zzZ60
                    public final zzZ41 zzXH7() {
                        return new C19093zzZ(zzytsZzZ);
                    }

                    @Override // com.aspose.words.internal.zzZ4X
                    public final int zzfY(int i) {
                        return zzytsZzZ.zzfY(i);
                    }

                    @Override // com.aspose.words.internal.zzZ4X
                    public final int zzfZ(int i) {
                        return zzytsZzZ.getOutputSize(i);
                    }
                };
            }
            throw new IllegalArgumentException("AEAD decryption requires an iv/nonce to be provided.");
        }
    }

    static {
        zzZ1P zzz1p = new zzZ1P(AES256KeyLoader.AES_ALGORITHM);
        zzWjd = zzz1p;
        zzZ05 zzz05 = zzZ05.ECB;
        zzWjc = new zzS(new zzZ1P(zzz1p, zzz05));
        zzZ00 zzz00 = zzZ00.PKCS7;
        zzWjb = new zzS(new zzZ1P(zzz1p, zzz05, zzz00));
        zzZ00 zzz002 = zzZ00.ISO10126_2;
        zzWja = new zzS(new zzZ1P(zzz1p, zzz05, zzz002));
        zzZ00 zzz003 = zzZ00.X923;
        zzWj9 = new zzS(new zzZ1P(zzz1p, zzz05, zzz003));
        zzZ00 zzz004 = zzZ00.ISO7816_4;
        zzWj8 = new zzS(new zzZ1P(zzz1p, zzz05, zzz004));
        zzZ00 zzz005 = zzZ00.TBC;
        zzWj7 = new zzS(new zzZ1P(zzz1p, zzz05, zzz005));
        zzZ05 zzz052 = zzZ05.CBC;
        zzWj6 = new zzS(new zzZ1P(zzz1p, zzz052));
        zzWj5 = new zzS(new zzZ1P(zzz1p, zzz052, zzz00));
        zzWj4 = new zzS(new zzZ1P(zzz1p, zzz052, zzz002));
        zzWj3 = new zzS(new zzZ1P(zzz1p, zzz052, zzz003));
        zzWj2 = new zzS(new zzZ1P(zzz1p, zzz052, zzz004));
        zzWj1 = new zzS(new zzZ1P(zzz1p, zzz052, zzz005));
        zzWj0 = new zzS(new zzZ1P(zzz1p, zzz052, zzZ00.CS1));
        zzWiZ = new zzS(new zzZ1P(zzz1p, zzz052, zzZ00.CS2));
        zzWiY = new zzS(new zzZ1P(zzz1p, zzz052, zzZ00.CS3));
        zzWiX = new zzS(new zzZ1P(zzz1p, zzZ05.CFB8));
        zzWiW = new zzS(new zzZ1P(zzz1p, zzZ05.CFB128));
        zzWiV = new zzS(new zzZ1P(zzz1p, zzZ05.OFB128));
        zzWiU = new zzS(new zzZ1P(zzz1p, zzZ05.CTR));
        zzWiT = new zzY(new zzZ1P(zzz1p, zzZ05.GCM));
        zzWiS = new zzY(new zzZ1P(zzz1p, zzZ05.CCM));
        zzWiR = new zzY(new zzZ1P(zzz1p, zzZ05.CMAC));
        zzWiQ = new zzY(new zzZ1P(zzz1p, zzZ05.GMAC));
        zzWiP = new zzR(new zzZ1P(zzz1p, zzZ05.WRAP));
        zzWiO = new zzR(new zzZ1P(zzz1p, zzZ05.WRAPPAD));
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzZ(zzx);
        zzY(zzx);
        zzX(zzx);
        zzWje = zzx;
        zzYXY.zzZ(zzz1p, zzx);
    }

    private zzZ1T() {
    }

    public static zzZ1E<zzYUR> zzX(zzZ1P zzz1p) {
        int i = C157496.zzWkq[((zzZ05) zzz1p.zzXFS()).ordinal()];
        if (i == 1) {
            return new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ1T.1
                private static zzYUR zzXG0() {
                    return new zzYTX(zzZ1T.zzWje.zzXFZ());
                }

                @Override // com.aspose.words.internal.zzYUV
                public final /* synthetic */ Object zzXFZ() {
                    return zzXG0();
                }
            };
        }
        if (i == 2) {
            return new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ1T.2
                private static zzYUR zzXG0() {
                    return new zzYTW(new zzYTM(zzZ1T.zzWje.zzXFZ()));
                }

                @Override // com.aspose.words.internal.zzYUV
                public final /* synthetic */ Object zzXFZ() {
                    return zzXG0();
                }
            };
        }
        throw new IllegalArgumentException("Unknown algorithm passed to FipsAES MAC Provider: " + zzz1p);
    }

    public static zzYUR zzZ(zzY zzy) {
        int i = C157496.zzWkq[((zzZ05) zzy.zzXF4().zzXFS()).ordinal()];
        if (i == 1) {
            return new zzYTX(zzWje.zzXFZ(), zzy.zzWiH);
        }
        if (i == 2) {
            return new zzYTW(new zzYTM(zzWje.zzXFZ()), zzy.zzWiH);
        }
        if (i == 3) {
            return new zzYU0(new zzYTQ(zzWje.zzXFZ()), zzy.zzWiH);
        }
        throw new IllegalArgumentException("Unknown algorithm passed to FipsAES.OperatorFactory.createMACCalculator: " + zzy.zzXF4());
    }

    private static void zzY(final zzX zzx) {
        zzYZG.zzZ(zzWiR.zzXF4(), zzx, new zzYRV<zzX>() { // from class: com.aspose.words.internal.zzZ1T.4
            private boolean zzXFY() {
                byte[] bArrDecode = zzYGC.decode("2b7e151628aed2a6abf7158809cf4f3c");
                byte[] bArrDecode2 = zzYGC.decode("6bc1bee22e409f96e93d7e117393172a");
                byte[] bArrDecode3 = zzYGC.decode("070a16b46b4d4144f79bdd9dd04a287c");
                zzYTX zzytx = new zzYTX(zzx.zzXFZ(), 128);
                zzytx.zzZ(new zzYS7(bArrDecode));
                zzytx.update(bArrDecode2, 0, bArrDecode2.length);
                byte[] bArr = new byte[16];
                zzytx.doFinal(bArr, 0);
                return zzYGU.zzp(bArr, bArrDecode3);
            }

            @Override // com.aspose.words.internal.zzYRV
            public final /* synthetic */ boolean zzWO(zzX zzx2) throws Exception {
                return zzXFY();
            }
        });
    }

    private static void zzX(zzX zzx) {
        zzYZG.zzZ(zzWiT.zzXF4(), zzx, new zzYZD<zzX>() { // from class: com.aspose.words.internal.zzZ1T.5
            private static void zzW(zzX zzx2) throws Exception {
                zzYV8 zzyv8ZzXFZ = zzx2.zzXFZ();
                zzYTM zzytm = new zzYTM(zzyv8ZzXFZ);
                byte[] bArrDecode = zzYGC.decode("feffe9928665731c6d6a8f9467308308");
                byte[] bArrDecode2 = zzYGC.decode("d9313225f88406e5a55909c5aff5269a86a7a9531534f7da2e4c303d8a318a721c3c0c95956809532fcf0e2449a6b525b16aedf5aa0de657ba637b39");
                byte[] bArrDecode3 = zzYGC.decode("feedfacedeadbeeffeedfacedeadbeefabaddad2");
                byte[] bArrDecode4 = zzYGC.decode("cafebabefacedbaddecaf888");
                byte[] bArrDecode5 = zzYGC.decode("42831ec2217774244b7221b784d0d49ce3aa212f2c02a4e035c17e2329aca12e21d514b25466931c7d8f6a5aac84aa051ba30b396a0aac973d58e091");
                byte[] bArrDecode6 = zzYGC.decode("5bc94fbc3221a5db94fae95ae7121a47");
                zzYT3 zzyt3 = new zzYT3(new zzYS7(bArrDecode), bArrDecode6.length * 8, bArrDecode4, bArrDecode3);
                zzytm.zzZ(true, zzyt3);
                int outputSize = zzytm.getOutputSize(bArrDecode2.length);
                byte[] bArr = new byte[outputSize];
                int iZzY = zzytm.zzY(bArrDecode2, 0, bArrDecode2.length, bArr);
                if (outputSize != zzytm.doFinal(bArr, iZzY) + iZzY) {
                    zzYZD.zzTQ("Encryption reported incorrect length");
                }
                byte[] bArrZzXK5 = zzytm.zzXK5();
                int length = bArrDecode2.length;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                int length2 = outputSize - bArrDecode2.length;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, bArrDecode2.length, bArr3, 0, length2);
                if (!zzYGU.zzp(bArrDecode5, bArr2)) {
                    zzYZD.zzTQ("Incorrect encrypt");
                }
                if (!zzYGU.zzp(bArrDecode6, bArrZzXK5)) {
                    zzYZD.zzTQ("getMac() returned wrong MAC");
                }
                if (!zzYGU.zzp(bArrDecode6, bArr3)) {
                    zzYZD.zzTQ("Stream contained wrong MAC");
                }
                zzYTM zzytm2 = new zzYTM(zzyv8ZzXFZ);
                zzytm2.zzZ(false, zzyt3);
                byte[] bArr4 = new byte[zzytm2.getOutputSize(outputSize)];
                zzytm2.doFinal(bArr4, zzytm2.zzY(bArr, 0, outputSize, bArr4));
                byte[] bArrZzXK52 = zzytm2.zzXK5();
                int length3 = bArrDecode5.length;
                byte[] bArr5 = new byte[length3];
                System.arraycopy(bArr4, 0, bArr5, 0, length3);
                if (!zzYGU.zzp(bArrDecode2, bArr5)) {
                    zzYZD.zzTQ("Incorrect decrypt");
                }
                if (zzYGU.zzp(bArrDecode6, bArrZzXK52)) {
                    return;
                }
                zzYZD.zzTQ("Incorrect MAC on decrypt");
            }

            @Override // com.aspose.words.internal.zzYZD
            public final /* synthetic */ void zzWN(zzX zzx2) throws Exception {
                zzW(zzx2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ1P zzz1p) {
        zzYUD zzyudZzZ = zzYZZ.zzZ(zzz46);
        int iZzXEo = zzyudZzZ.zzXEo();
        if (iZzXEo != 128 && iZzXEo != 192 && iZzXEo != 256) {
            throw new zzZ5E("AES key must be of length 128, 192, or 256");
        }
        zzZ5W zzz5wZzXGV = zzyudZzZ.zzXGV();
        if (zzz5wZzXGV.equals(zzWjd) || zzz5wZzXGV.equals(zzz1p)) {
            return zzyudZzZ;
        }
        throw new zzZ5E("FIPS Key not for specified algorithm");
    }

    private static void zzZ(zzX zzx) {
        zzYZG.zzZ(zzWiS.zzXF4(), zzx, new zzYZD<zzX>() { // from class: com.aspose.words.internal.zzZ1T.3
            private static void zzW(zzX zzx2) throws Exception {
                byte[] bArrDecode = zzYGC.decode("404142434445464748494a4b4c4d4e4f");
                byte[] bArrDecode2 = zzYGC.decode("10111213141516");
                byte[] bArrDecode3 = zzYGC.decode("0001020304050607");
                byte[] bArrDecode4 = zzYGC.decode("20212223");
                byte[] bArrDecode5 = zzYGC.decode("7162015b4dac255d");
                byte[] bArrDecode6 = zzYGC.decode("6084341b");
                zzYV8 zzyv8ZzXFZ = zzx2.zzXFZ();
                zzYTQ zzytq = new zzYTQ(zzyv8ZzXFZ);
                int length = bArrDecode6.length * 8;
                zzYS7 zzys7 = new zzYS7(bArrDecode);
                zzytq.zzZ(true, new zzYT3(zzys7, length, bArrDecode2, bArrDecode3));
                int length2 = bArrDecode5.length;
                byte[] bArr = new byte[length2];
                zzytq.doFinal(bArr, zzytq.zzY(bArrDecode4, 0, bArrDecode4.length, bArr));
                if (!zzYGU.zzp(bArrDecode5, bArr)) {
                    zzYZD.zzTQ("Encrypted stream fails to match in self test");
                }
                if (!zzYGU.zzp(bArrDecode6, zzytq.zzXK5())) {
                    zzYZD.zzTQ("MAC fails to match in self test encrypt");
                }
                zzYTQ zzytq2 = new zzYTQ(zzyv8ZzXFZ);
                zzytq2.zzZ(false, new zzYT3(zzys7, length, bArrDecode2, bArrDecode3));
                byte[] bArr2 = new byte[length2];
                int iZzY = zzytq2.zzY(bArr, 0, length2, bArr2);
                int iDoFinal = zzytq2.doFinal(bArr2, iZzY) + iZzY;
                byte[] bArr3 = new byte[iDoFinal];
                System.arraycopy(bArr2, 0, bArr3, 0, iDoFinal);
                if (!zzYGU.zzp(bArrDecode4, bArr3)) {
                    zzYZD.zzTQ("Decrypted stream fails to match in self test");
                }
                if (zzYGU.zzp(bArrDecode6, zzytq2.zzXK5())) {
                    return;
                }
                zzYZD.zzTQ("MAC fails to match in self test");
            }

            @Override // com.aspose.words.internal.zzYZD
            public final /* synthetic */ void zzWN(zzX zzx2) throws Exception {
                zzW(zzx2);
            }
        });
    }
}
