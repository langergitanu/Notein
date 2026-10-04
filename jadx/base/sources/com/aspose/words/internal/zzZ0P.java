package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ0P {
    public static final zzX zzWe8;
    public static final zzX zzWe9;
    public static final zzQ zzWea;
    public static final zzQ zzWeb;
    public static final zzY zzWec;
    public static final zzQ zzWed;
    public static final zzY zzWee;
    public static final zzQ zzWef;
    public static final zzY zzWeg;
    public static final zzQ zzWeh;
    public static final zzY zzWei;
    public static final zzQ zzWej;
    public static final zzY zzWek;
    public static final zzQ zzWel;
    public static final zzY zzWem;
    public static final zzQ zzWen;
    public static final zzY zzWeo;
    public static final zzQ zzWep;
    public static final zzY zzWeq;
    public static final zzQ zzWer;
    public static final zzY zzWes;
    public static final zzQ zzWet;
    public static final zzY zzWeu;
    public static final zzQ zzWev;
    public static final zzY zzWew;
    public static final zzQ zzWex;
    private static Map<zzZ1P, zzZ1E<zzYUR>> zzWey;
    private static final Map<zzZ1P, Integer> zzWez;
    private static Map<zzZ1P, zzZ1E<zzYUU>> zzWmB;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZ0P$30 */
    public static /* synthetic */ class C1567930 {
        static final /* synthetic */ int[] zzWhw;

        static {
            int[] iArr = new int[zzO.values().length];
            zzWhw = iArr;
            try {
                iArr[zzO.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWhw[zzO.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWhw[zzO.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzWhw[zzO.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzWhw[zzO.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzWhw[zzO.SHA512_224.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zzWhw[zzO.SHA512_256.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zzWhw[zzO.SHA3_224.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zzWhw[zzO.SHA3_256.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zzWhw[zzO.SHA3_384.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zzWhw[zzO.SHA3_512.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                zzWhw[zzO.SHA1_HMAC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                zzWhw[zzO.SHA224_HMAC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                zzWhw[zzO.SHA256_HMAC.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                zzWhw[zzO.SHA384_HMAC.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                zzWhw[zzO.SHA512_HMAC.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                zzWhw[zzO.SHA512_224_HMAC.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                zzWhw[zzO.SHA512_256_HMAC.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                zzWhw[zzO.SHA3_224_HMAC.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                zzWhw[zzO.SHA3_256_HMAC.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                zzWhw[zzO.SHA3_384_HMAC.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                zzWhw[zzO.SHA3_512_HMAC.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static final class zzN<T extends zzQ> extends zzZ0G<T> {

        public class zzZ<T extends zzQ> extends zzZ0U {
            private boolean zzWdb;
            private final zzYU1 zzWdc;
            private final T zzWdd;

            public zzZ(T t, zzYUB zzyub) {
                this.zzWdd = t;
                this.zzWdc = new zzYU1(zzyub);
            }

            @Override // com.aspose.words.internal.zzZ4N
            public final zzZ41 zzXGM() {
                if (this.zzWdb) {
                    this.zzWdb = false;
                    this.zzWdc.reset();
                }
                return this.zzWdc;
            }

            @Override // com.aspose.words.internal.zzZ0U
            public final int zzb(byte[] bArr, int i) {
                this.zzWdb = true;
                return this.zzWdc.zzr(bArr, 0, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ0G
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public zzZ0U<T> zzY(T t) {
            return new zzZ(t, zzZ0P.zzZ(t));
        }
    }

    public enum zzO {
        SHA1,
        SHA1_HMAC,
        SHA224,
        SHA224_HMAC,
        SHA256,
        SHA256_HMAC,
        SHA384,
        SHA384_HMAC,
        SHA512,
        SHA512_HMAC,
        SHA512_224,
        SHA512_224_HMAC,
        SHA512_256,
        SHA512_256_HMAC,
        SHA3_224,
        SHA3_256,
        SHA3_384,
        SHA3_512,
        SHA3_224_HMAC,
        SHA3_256_HMAC,
        SHA3_384_HMAC,
        SHA3_512_HMAC
    }

    public static class zzP<T extends zzYUX> implements zzYRV<T> {
        private static final byte[] zzWkl = zzYGI.zzwb("abc");
        private final byte[] zzWkk;

        public zzP(byte[] bArr) {
            this.zzWkk = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYRV
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public boolean zzWO(zzYUX zzyux) {
            byte[] bArr = zzWkl;
            zzyux.update(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[zzyux.zzQI()];
            zzyux.doFinal(bArr2, 0);
            zzyux.reset();
            return zzYGU.zzp(bArr2, this.zzWkk);
        }
    }

    public static class zzQ extends zzZ0S {
        public zzQ(zzZ1P zzz1p) {
            super(zzz1p);
        }
    }

    public static final class zzR<T extends zzQ> extends zzZ1I<T> {
        public static zzZ10<T> zzX(T t) {
            return new zzT((zzQ) t, (zzW) zzZ0P.zzW(t.zzXF4()), (byte) 0);
        }

        @Override // com.aspose.words.internal.zzZ1I
        public final /* synthetic */ zzZ10 zzZ(zzZ0S zzz0s) {
            return zzX((zzQ) zzz0s);
        }

        @Override // com.aspose.words.internal.zzZ1I, com.aspose.words.internal.zzZ5J
        public final /* synthetic */ zzZ4V zzZ(zzZ4M zzz4m) {
            return zzX((zzQ) zzz4m);
        }
    }

    public static final class zzS extends zzZ15<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            zzYUD zzyudZzZ = zzYZZ.zzZ(zzz46);
            zzYUR zzyurZzT = zzZ0P.zzT(zzy.zzXF4());
            if (zzyurZzT.zzXDn() != (zzy.zzXH3() + 7) / 8) {
                zzyurZzT = new zzYTT(zzyurZzT, zzy.zzWdl);
            }
            zzYS8 zzys8ZzZ = zzYZF.zzZ(zzyudZzZ);
            if (!zzZ5L.zzXH0() || zzys8ZzZ.getKey().length * 8 >= 112) {
                zzyurZzT.zzZ(zzys8ZzZ);
                return zzyurZzT;
            }
            throw new zzZ5E("Key size for HMAC must be at least 112 bits in approved mode: " + zzy.zzXF4().getName());
        }

        @Override // com.aspose.words.internal.zzZ15
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzY) zzz5q);
        }
    }

    public static class zzT<T extends zzQ> extends zzZ10<T> implements Cloneable {
        private final zzW<zzYUU> zzWdf;
        private final T zzWdg;
        private final zzYUU zzWdh;

        public /* synthetic */ zzT(zzQ zzq, zzW zzw, byte b) {
            this(zzq, zzw);
        }

        @Override // com.aspose.words.internal.zzZ4V
        public final void reset() {
            this.zzWdh.reset();
        }

        @Override // com.aspose.words.internal.zzZ10, com.aspose.words.internal.zzZ4V
        public final int zzQI() {
            return this.zzWdh.zzQI();
        }

        @Override // com.aspose.words.internal.zzZ10
        public final int zzWZ(byte[] bArr) {
            return this.zzWdh.doFinal(bArr, 0);
        }

        @Override // com.aspose.words.internal.zzZ10, com.aspose.words.internal.zzZ4V
        /* JADX INFO: renamed from: zzXER, reason: merged with bridge method [inline-methods] */
        public final zzZ10<T> clone() throws CloneNotSupportedException {
            return new zzT(this.zzWdg, this.zzWdh, this.zzWdf);
        }

        @Override // com.aspose.words.internal.zzZ10, com.aspose.words.internal.zzZ4V
        public final zzZ41 zzXGT() {
            return new zzYU6(this.zzWdh);
        }

        @Override // com.aspose.words.internal.zzZ4V
        public final /* bridge */ /* synthetic */ Object zzXGU() {
            return this.zzWdg;
        }

        private zzT(T t, zzW<zzYUU> zzw) {
            this(t, (zzYUU) null, zzw);
        }

        private zzT(T t, zzYUU zzyuu, zzW<zzYUU> zzw) {
            this.zzWdh = zzw.zzZ(zzyuu);
            this.zzWdg = t;
            this.zzWdf = zzw;
        }
    }

    public static final class zzU extends zzZ0K {
        private final int zzWiC;
        private final zzZ1P zzWjX;
        private final SecureRandom zzWk5;

        public zzU(zzZ1P zzz1p, int i, SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                if (i < 112) {
                    throw new IllegalArgumentException("Key size for HMAC must be at least 112 bits in approved mode: " + zzz1p.getName());
                }
                zzYZF.zzZ(secureRandom, 112, zzz1p);
            }
            this.zzWjX = zzz1p;
            this.zzWiC = i;
            this.zzWk5 = secureRandom;
        }

        @Override // com.aspose.words.internal.zzZ45
        public final zzZ46 zzXGH() {
            zzYV4 zzyv4 = new zzYV4();
            zzyv4.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWjX, zzyv4.zzXG8());
        }
    }

    public static class zzV implements zzYRV<zzYUR> {
        private final byte[] zzWkk;
        private static final byte[] zzWdi = zzYGI.zzwb("what do ya want for nothing?");
        private static final byte[] key = zzYGC.decode("4a656665");

        public zzV(byte[] bArr) {
            this.zzWkk = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYRV
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public boolean zzWO(zzYUR zzyur) {
            zzyur.zzZ(new zzYS7(zzYGU.zzVI(key)));
            byte[] bArr = zzWdi;
            zzyur.update(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[zzyur.zzXDn()];
            zzyur.doFinal(bArr2, 0);
            return zzYGU.zzp(bArr2, this.zzWkk);
        }
    }

    public interface zzW<D extends zzYUU> {
        D zzZ(D d);
    }

    public static final class zzX extends zzQ {
        private final byte[] zzWdj;
        private final byte[] zzWdk;

        public zzX(zzZ1P zzz1p) {
            this(zzz1p, (byte) 0);
        }

        private zzX(zzZ1P zzz1p, byte b) {
            super(zzz1p);
            this.zzWdk = null;
            this.zzWdj = null;
        }
    }

    public static final class zzZ {
        public static final zzZ1J zzWdL = new zzZ1J(IDevicePopManager.SHA_1, zzO.SHA1);
        public static final zzZ1J zzWdK = new zzZ1J("SHA-1/HMAC", zzO.SHA1_HMAC);
        public static final zzZ1J zzWdJ = new zzZ1J("SHA-224", zzO.SHA224);
        public static final zzZ1J zzWdI = new zzZ1J("SHA-224/HMAC", zzO.SHA224_HMAC);
        public static final zzZ1J zzWdH = new zzZ1J(KeyUtil.HMAC_KEY_HASH_ALGORITHM, zzO.SHA256);
        public static final zzZ1J zzWdG = new zzZ1J("SHA-256/HMAC", zzO.SHA256_HMAC);
        public static final zzZ1J zzWdF = new zzZ1J("SHA-384", zzO.SHA384);
        public static final zzZ1J zzWdE = new zzZ1J("SHA-384/HMAC", zzO.SHA384_HMAC);
        public static final zzZ1J zzWdD = new zzZ1J("SHA-512", zzO.SHA512);
        public static final zzZ1J zzWdC = new zzZ1J("SHA-512/HMAC", zzO.SHA512_HMAC);
        public static final zzZ1J zzWdB = new zzZ1J("SHA-512(224)", zzO.SHA512_224);
        public static final zzZ1J zzWdA = new zzZ1J("SHA-512(224)/HMAC", zzO.SHA512_224_HMAC);
        public static final zzZ1J zzWdz = new zzZ1J("SHA-512(256)", zzO.SHA512_256);
        public static final zzZ1J zzWdy = new zzZ1J("SHA-512(256)/HMAC", zzO.SHA512_256_HMAC);
        public static final zzZ1J zzWdx = new zzZ1J("SHA3-224", zzO.SHA3_224);
        public static final zzZ1J zzWdw = new zzZ1J("SHA3-224/HMAC", zzO.SHA3_224_HMAC);
        public static final zzZ1J zzWdv = new zzZ1J("SHA3-256", zzO.SHA3_256);
        public static final zzZ1J zzWdu = new zzZ1J("SHA3-256/HMAC", zzO.SHA3_256_HMAC);
        public static final zzZ1J zzWdt = new zzZ1J("SHA3-384", zzO.SHA3_384);
        public static final zzZ1J zzWds = new zzZ1J("SHA3-384/HMAC", zzO.SHA3_384_HMAC);
        public static final zzZ1J zzWdr = new zzZ1J("SHA3-512", zzO.SHA3_512);
        public static final zzZ1J zzWdq = new zzZ1J("SHA3-512/HMAC", zzO.SHA3_512_HMAC);
        public static final zzZ1P zzWdp = new zzZ1P("SHAKE128");
        public static final zzZ1P zzWdo = new zzZ1P("SHAKE256");
        public static final zzZ1P zzWdn = new zzZ1P("cSHAKE128");
        public static final zzZ1P zzWdm = new zzZ1P("cSHAKE256");
    }

    static {
        HashMap map = new HashMap();
        zzWez = map;
        zzWmB = new HashMap();
        zzWey = new HashMap();
        zzZ1J zzz1j = zzZ.zzWdK;
        map.put(zzz1j, 160);
        zzZ1J zzz1j2 = zzZ.zzWdI;
        map.put(zzz1j2, 224);
        zzZ1J zzz1j3 = zzZ.zzWdG;
        map.put(zzz1j3, 256);
        zzZ1J zzz1j4 = zzZ.zzWdE;
        map.put(zzz1j4, 384);
        zzZ1J zzz1j5 = zzZ.zzWdC;
        map.put(zzz1j5, 512);
        zzZ1J zzz1j6 = zzZ.zzWdA;
        map.put(zzz1j6, 224);
        zzZ1J zzz1j7 = zzZ.zzWdy;
        map.put(zzz1j7, 256);
        zzZ1J zzz1j8 = zzZ.zzWdw;
        map.put(zzz1j8, 224);
        zzZ1J zzz1j9 = zzZ.zzWdu;
        map.put(zzz1j9, 256);
        zzZ1J zzz1j10 = zzZ.zzWds;
        map.put(zzz1j10, 384);
        zzZ1J zzz1j11 = zzZ.zzWdq;
        map.put(zzz1j11, 512);
        final zzP zzp = new zzP(zzYGC.decode("a9993e364706816aba3e25717850c26c9cd0d89d"));
        Map<zzZ1P, zzZ1E<zzYUU>> map2 = zzWmB;
        zzZ1J zzz1j12 = zzZ.zzWdL;
        map2.put(zzz1j12, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdL, zzp);
            }
        });
        final zzP zzp2 = new zzP(zzYGC.decode("23097d223405d8228642a477bda255b32aadbce4bda0b3f7e36c9da7"));
        zzWmB.put(zzZ.zzWdJ, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.12
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdJ, zzp2);
            }
        });
        final zzP zzp3 = new zzP(zzYGC.decode("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad"));
        Map<zzZ1P, zzZ1E<zzYUU>> map3 = zzWmB;
        zzZ1J zzz1j13 = zzZ.zzWdH;
        map3.put(zzz1j13, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.23
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdH, zzp3);
            }
        });
        final zzP zzp4 = new zzP(zzYGC.decode("cb00753f45a35e8bb5a03d699ac65007272c32ab0eded1631a8b605a43ff5bed8086072ba1e7cc2358baeca134c825a7"));
        zzWmB.put(zzZ.zzWdF, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.31
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdF, zzp4);
            }
        });
        final zzP zzp5 = new zzP(zzYGC.decode("ddaf35a193617abacc417349ae20413112e6fa4e89a97ea20a9eeee64b55d39a2192992a274fc1a836ba3c23a3feebbd454d4423643ce80e2a9ac94fa54ca49f"));
        Map<zzZ1P, zzZ1E<zzYUU>> map4 = zzWmB;
        zzZ1J zzz1j14 = zzZ.zzWdD;
        map4.put(zzz1j14, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.32
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdD, zzp5);
            }
        });
        final zzP zzp6 = new zzP(zzYGC.decode("4634270F707B6A54DAAE7530460842E20E37ED265CEEE9A43E8924AA"));
        zzWmB.put(zzZ.zzWdB, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.33
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdB, zzp6);
            }
        });
        final zzP zzp7 = new zzP(zzYGC.decode("53048E2681941EF99B2E29B76B4C7DABE4C2D0C634FC6D46E0E2F13107E7AF23"));
        zzWmB.put(zzZ.zzWdz, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.34
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdz, zzp7);
            }
        });
        final zzP zzp8 = new zzP(zzYGC.decode("e642824c3f8cf24ad09234ee7d3c766fc9a3a5168d0c94ad73b46fdf"));
        zzWmB.put(zzZ.zzWdx, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.35
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdx, zzp8);
            }
        });
        final zzP zzp9 = new zzP(zzYGC.decode("3a985da74fe225b2045c172d6bd390bd855f086e3e9d525b46bfe24511431532"));
        zzWmB.put(zzZ.zzWdv, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.36
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdv, zzp9);
            }
        });
        final zzP zzp10 = new zzP(zzYGC.decode("ec01498288516fc926459f58e2c6ad8df9b473cb0fc08c2596da7cf0e49be4b298d88cea927ac7f539f1edf228376d25"));
        zzWmB.put(zzZ.zzWdt, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdt, zzp10);
            }
        });
        final zzP zzp11 = new zzP(zzYGC.decode("b751850b1a57168a5693cd924b6b096e08f621827444f70d884f5d0240d2712e10e116e9192af3c91a7ec57647e3934057340b4cf408d5a56592f8274eec53f0"));
        zzWmB.put(zzZ.zzWdr, new zzZ1E<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXEj, reason: merged with bridge method [inline-methods] */
            public zzYUU zzXFZ() {
                return zzZ0P.zzZ(zzZ.zzWdr, zzp11);
            }
        });
        final zzV zzv = new zzV(zzYGC.decode("effcdf6ae5eb2fa2d27416d5f184df9c259a7c79"));
        zzWey.put(zzz1j, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdK, zzv);
            }
        });
        final zzV zzv2 = new zzV(zzYGC.decode("a30e01098bc6dbbf45690f3a7e9e6d0f8bbea2a39e6148008fd05e44"));
        zzWey.put(zzz1j2, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdI, zzv2);
            }
        });
        final zzV zzv3 = new zzV(zzYGC.decode("5bdcc146bf60754e6a042426089575c75a003f089d2739839dec58b964ec3843"));
        zzWey.put(zzz1j3, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.6
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdG, zzv3);
            }
        });
        final zzV zzv4 = new zzV(zzYGC.decode("af45d2e376484031617f78d2b58a6b1b9c7ef464f5a01b47e42ec3736322445e8e2240ca5e69e2c78b3239ecfab21649"));
        zzWey.put(zzz1j4, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.7
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdE, zzv4);
            }
        });
        final zzV zzv5 = new zzV(zzYGC.decode("164b7a7bfcf819e2e395fbe73b56e0a387bd64222e831fd610270cd7ea2505549758bf75c05a994a6d034f65f8f0e6fdcaeab1a34d4a6b4b636e070a38bce737"));
        zzWey.put(zzz1j5, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.8
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdC, zzv5);
            }
        });
        final zzV zzv6 = new zzV(zzYGC.decode("4a530b31a79ebcce36916546317c45f247d83241dfb818fd37254bde"));
        zzWey.put(zzz1j6, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.9
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdA, zzv6);
            }
        });
        final zzV zzv7 = new zzV(zzYGC.decode("6df7b24630d5ccb2ee335407081a87188c221489768fa2020513b2d593359456"));
        zzWey.put(zzz1j7, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.10
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdy, zzv7);
            }
        });
        final zzV zzv8 = new zzV(zzYGC.decode("7fdb8dd88bd2f60d1b798634ad386811c2cfc85bfaf5d52bbace5e66"));
        zzWey.put(zzz1j8, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.11
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdw, zzv8);
            }
        });
        final zzV zzv9 = new zzV(zzYGC.decode("c7d4072e788877ae3596bbb0da73b887c9171f93095b294ae857fbe2645e1ba5"));
        zzWey.put(zzz1j9, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.13
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdu, zzv9);
            }
        });
        final zzV zzv10 = new zzV(zzYGC.decode("f1101f8cbf9766fd6764d2ed61903f21ca9b18f57cf3e1a23ca13508a93243ce48c045dc007f26a21b3f5e0e9df4c20a"));
        zzWey.put(zzz1j10, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.14
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWds, zzv10);
            }
        });
        final zzV zzv11 = new zzV(zzYGC.decode("5a4bfeab6166427c7a3647b747292b8384537cdb89afb3bf5665e4c5e709350b287baec921fd7ca0ee7a0c31d022a95e1fc92ba9d77df883960275beb4e62024"));
        zzWey.put(zzz1j11, new zzZ1E<zzYUR>() { // from class: com.aspose.words.internal.zzZ0P.15
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzYUV
            /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
            public zzYUR zzXFZ() {
                return zzZ0P.zzY(zzZ.zzWdq, zzv11);
            }
        });
        zzWmB.get(zzz1j12).zzXFZ();
        zzWmB.get(zzz1j13).zzXFZ();
        zzWmB.get(zzz1j14).zzXFZ();
        zzWey.get(zzz1j3).zzXFZ();
        zzWey.get(zzz1j5).zzXFZ();
        zzWey.get(zzz1j9).zzXFZ();
        zzZ(new zzQ(zzZ.zzWdo));
        for (Map.Entry<zzZ1P, zzZ1E<zzYUU>> entry : zzWmB.entrySet()) {
            zzYXY.zzZ(entry.getKey(), entry.getValue());
        }
        zzYXY.zzZ(zzZ.zzWdp, new zzZ1E<zzYUB>() { // from class: com.aspose.words.internal.zzZ0P.16
            private static zzYUB zzXEi() {
                return zzZ0P.zzZ(new zzQ(zzZ.zzWdp));
            }

            @Override // com.aspose.words.internal.zzYUV
            public final /* synthetic */ Object zzXFZ() {
                return zzXEi();
            }
        });
        zzYXY.zzZ(zzZ.zzWdo, new zzZ1E<zzYUB>() { // from class: com.aspose.words.internal.zzZ0P.17
            private static zzYUB zzXEi() {
                return zzZ0P.zzZ(new zzQ(zzZ.zzWdo));
            }

            @Override // com.aspose.words.internal.zzYUV
            public final /* synthetic */ Object zzXFZ() {
                return zzXEi();
            }
        });
        for (Map.Entry<zzZ1P, zzZ1E<zzYUR>> entry2 : zzWey.entrySet()) {
            zzYXY.zzZ(entry2.getKey(), entry2.getValue());
        }
        zzWex = new zzQ(zzZ.zzWdL);
        zzWew = new zzY(zzZ.zzWdK);
        zzWev = new zzQ(zzZ.zzWdJ);
        zzWeu = new zzY(zzZ.zzWdI);
        zzWet = new zzQ(zzZ.zzWdH);
        zzWes = new zzY(zzZ.zzWdG);
        zzWer = new zzQ(zzZ.zzWdF);
        zzWeq = new zzY(zzZ.zzWdE);
        zzWep = new zzQ(zzZ.zzWdD);
        zzWeo = new zzY(zzZ.zzWdC);
        zzWen = new zzQ(zzZ.zzWdB);
        zzWem = new zzY(zzZ.zzWdA);
        zzWel = new zzQ(zzZ.zzWdz);
        zzWek = new zzY(zzZ.zzWdy);
        zzWej = new zzQ(zzZ.zzWdx);
        zzWei = new zzY(zzZ.zzWdw);
        zzWeh = new zzQ(zzZ.zzWdv);
        zzWeg = new zzY(zzZ.zzWdu);
        zzWef = new zzQ(zzZ.zzWdt);
        zzWee = new zzY(zzZ.zzWds);
        zzWed = new zzQ(zzZ.zzWdr);
        zzWec = new zzY(zzZ.zzWdq);
        zzWeb = new zzQ(zzZ.zzWdp);
        zzWea = new zzQ(zzZ.zzWdo);
        zzWe9 = new zzX(zzZ.zzWdn);
        zzWe8 = new zzX(zzZ.zzWdm);
    }

    private zzZ0P() {
    }

    public static zzYUR zzT(zzZ1P zzz1p) {
        return zzX(zzz1p).zzXFZ();
    }

    public static zzYUU zzU(zzZ1P zzz1p) {
        return zzWmB.get(zzz1p).zzXFZ();
    }

    private static zzYUU zzV(zzZ1P zzz1p) {
        switch (C1567930.zzWhw[((zzO) zzz1p.zzXFS()).ordinal()]) {
            case 1:
                return new zzYZR();
            case 2:
                return new zzYZQ();
            case 3:
                return new zzYZP();
            case 4:
                return new zzYZO();
            case 5:
                return new zzYZM();
            case 6:
                return new zzYZL(224);
            case 7:
                return new zzYZL(256);
            case 8:
                return new zzYZN(224);
            case 9:
                return new zzYZN(256);
            case 10:
                return new zzYZN(384);
            case 11:
                return new zzYZN(512);
            default:
                throw new IllegalArgumentException("Unknown algorithm passed to FipsSHS.OperatorFactory.createOutputDigestCalculator: " + zzz1p.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUU zzZ(zzZ1P zzz1p, zzYRV<zzYUU> zzyrv) {
        return (zzYUU) zzYZG.zzZ(zzz1p, zzV(zzz1p), zzyrv);
    }

    public static final class zzY extends zzZ0S implements zzZ5Q<zzY> {
        private final int zzWdl;

        private zzY(zzZ1P zzz1p, int i) {
            super(zzz1p);
            this.zzWdl = i;
        }

        @Override // com.aspose.words.internal.zzZ5Q
        public final int zzXH3() {
            return this.zzWdl;
        }

        @Override // com.aspose.words.internal.zzZ5Q
        /* JADX INFO: renamed from: zzfH, reason: merged with bridge method [inline-methods] */
        public final zzY zzg1(int i) {
            return new zzY(zzXF4(), i);
        }

        public zzY(zzZ1P zzz1p) {
            this(zzz1p, ((Integer) zzZ0P.zzWez.get(zzz1p)).intValue());
        }
    }

    public static zzW<zzYUU> zzW(zzZ1P zzz1p) {
        switch (C1567930.zzWhw[((zzO) zzz1p.zzXFS()).ordinal()]) {
            case 1:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.18
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZR((zzYZR) zzyuu) : zzZ0P.zzU(zzZ.zzWdL);
                    }
                };
            case 2:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.19
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZQ((zzYZQ) zzyuu) : zzZ0P.zzU(zzZ.zzWdJ);
                    }
                };
            case 3:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.20
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZP((zzYZP) zzyuu) : zzZ0P.zzU(zzZ.zzWdH);
                    }
                };
            case 4:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.21
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZO((zzYZO) zzyuu) : zzZ0P.zzU(zzZ.zzWdF);
                    }
                };
            case 5:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.22
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZM((zzYZM) zzyuu) : zzZ0P.zzU(zzZ.zzWdD);
                    }
                };
            case 6:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.24
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZL((zzYZL) zzyuu) : zzZ0P.zzU(zzZ.zzWdB);
                    }
                };
            case 7:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.25
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZL((zzYZL) zzyuu) : zzZ0P.zzU(zzZ.zzWdz);
                    }
                };
            case 8:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.26
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZN((zzYZN) zzyuu) : zzZ0P.zzU(zzZ.zzWdx);
                    }
                };
            case 9:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.27
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZN((zzYZN) zzyuu) : zzZ0P.zzU(zzZ.zzWdv);
                    }
                };
            case 10:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.28
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZN((zzYZN) zzyuu) : zzZ0P.zzU(zzZ.zzWdt);
                    }
                };
            case 11:
                return new zzW<zzYUU>() { // from class: com.aspose.words.internal.zzZ0P.29
                    @Override // com.aspose.words.internal.zzZ0P.zzW
                    public final zzYUU zzZ(zzYUU zzyuu) {
                        return zzyuu != null ? new zzYZN((zzYZN) zzyuu) : zzZ0P.zzU(zzZ.zzWdr);
                    }
                };
            default:
                throw new IllegalArgumentException("Unknown algorithm passed to FipsSHS.OperatorFactory.createOutputDigestCalculator: " + zzz1p.getName());
        }
    }

    public static zzZ1E<zzYUR> zzX(zzZ1P zzz1p) {
        return zzWey.get(zzz1p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUR zzY(zzZ1P zzz1p, zzYRV<zzYUR> zzyrv) {
        zzYTV zzytv;
        switch (C1567930.zzWhw[((zzO) zzz1p.zzXFS()).ordinal()]) {
            case 12:
                zzytv = new zzYTV(new zzYZR());
                break;
            case 13:
                zzytv = new zzYTV(new zzYZQ());
                break;
            case 14:
                zzytv = new zzYTV(new zzYZP());
                break;
            case 15:
                zzytv = new zzYTV(new zzYZO());
                break;
            case 16:
                zzytv = new zzYTV(new zzYZM());
                break;
            case 17:
                zzytv = new zzYTV(new zzYZL(224));
                break;
            case 18:
                zzytv = new zzYTV(new zzYZL(256));
                break;
            case 19:
                zzytv = new zzYTV(new zzYZN(224));
                break;
            case 20:
                zzytv = new zzYTV(new zzYZN(256));
                break;
            case 21:
                zzytv = new zzYTV(new zzYZN(384));
                break;
            case 22:
                zzytv = new zzYTV(new zzYZN(512));
                break;
            default:
                throw new IllegalArgumentException("Unknown algorithm passed to FipsSHS.OperatorFactory.createOutputMACCalculator: " + zzz1p.getName());
        }
        return (zzYUR) zzYZG.zzZ(zzz1p, zzytv, (zzYRV<zzYTV>) zzyrv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUB zzZ(zzQ zzq) {
        zzZ1P zzz1pZzXF4 = zzq.zzXF4();
        if (zzz1pZzXF4 == zzZ.zzWdp) {
            return (zzYUB) zzYZG.zzZ(zzz1pZzXF4, new zzYZK(128), new zzP(zzYGC.decode("5881092dd818bf5cf8a3ddb793fbcba7")));
        }
        if (zzz1pZzXF4 == zzZ.zzWdo) {
            return (zzYUB) zzYZG.zzZ(zzz1pZzXF4, new zzYZK(256), new zzP(zzYGC.decode("483366601360a8771c6863080cc4114d8db44530f8f1e1ee4f94ea37e78b5739")));
        }
        if (zzz1pZzXF4 == zzZ.zzWdn) {
            zzX zzx = (zzX) zzq;
            return new zzZ2S(128, zzx.zzWdk, zzx.zzWdj);
        }
        if (zzz1pZzXF4 == zzZ.zzWdm) {
            zzX zzx2 = (zzX) zzq;
            return new zzZ2S(256, zzx2.zzWdk, zzx2.zzWdj);
        }
        throw new IllegalArgumentException("Unknown extendable output function requested: " + zzz1pZzXF4.getName());
    }
}
