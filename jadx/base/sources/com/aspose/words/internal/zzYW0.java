package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYW0 {
    public static final zzY zzW1Y;
    public static final zzQ zzW1Z;
    public static final zzY zzW20;
    public static final zzQ zzW21;
    public static final zzY zzW22;
    public static final zzQ zzW23;
    public static final zzY zzW24;
    public static final zzQ zzW25;
    public static final zzY zzW26;
    public static final zzQ zzW27;
    public static final zzY zzW28;
    public static final zzQ zzW29;
    public static final zzY zzW2a;
    public static final zzQ zzW2b;
    public static final zzY zzW2c;
    public static final zzQ zzW2d;
    private static final Map<zzYXR, Integer> zzWez;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzYW0$9 */
    public static /* synthetic */ class C155729 {
        static final /* synthetic */ int[] zzW1X;

        static {
            int[] iArr = new int[zzP.values().length];
            zzW1X = iArr;
            try {
                iArr[zzP.GOST3411_HMAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzW1X[zzP.RIPEMD128_HMAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzW1X[zzP.RIPEMD160_HMAC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzW1X[zzP.RIPEMD256_HMAC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzW1X[zzP.RIPEMD320_HMAC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzW1X[zzP.TIGER_HMAC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zzW1X[zzP.MD5_HMAC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zzW1X[zzP.WHIRLPOOL_HMAC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zzW1X[zzP.MD5.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zzW1X[zzP.GOST3411.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zzW1X[zzP.RIPEMD128.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                zzW1X[zzP.RIPEMD160.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                zzW1X[zzP.RIPEMD256.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                zzW1X[zzP.RIPEMD320.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                zzW1X[zzP.TIGER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                zzW1X[zzP.WHIRLPOOL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public enum zzP {
        MD5,
        MD5_HMAC,
        GOST3411,
        GOST3411_HMAC,
        RIPEMD128,
        RIPEMD128_HMAC,
        RIPEMD160,
        RIPEMD160_HMAC,
        RIPEMD256,
        RIPEMD256_HMAC,
        RIPEMD320,
        RIPEMD320_HMAC,
        TIGER,
        TIGER_HMAC,
        WHIRLPOOL,
        WHIRLPOOL_HMAC
    }

    public static final class zzQ extends zzYXO<zzYXR> {
        public zzQ(zzYXR zzyxr) {
            super(zzyxr);
        }
    }

    public static final class zzR extends zzYXB<zzYXO> {
        @Override // com.aspose.words.internal.zzZ5J
        public final /* bridge */ /* synthetic */ zzZ4V zzZ(zzZ4M zzz4m) {
            return zzZ((zzYXO) zzz4m);
        }

        public static zzZ4V<zzYXO> zzZ(zzYXO zzyxo) {
            return new zzT(zzyxo, zzYW0.zzY((zzYXR) zzyxo.zzXGV()), (byte) 0);
        }
    }

    public static final class zzS extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            zzYUR zzyurZzZ = zzYW0.zzZ(zzy.zzXGV());
            if (zzyurZzZ.zzXDn() != (zzy.zzXH3() + 7) / 8) {
                zzyurZzZ = new zzYTT(zzyurZzZ, zzy.zzWdl);
            }
            zzyurZzZ.zzZ(zzYVO.zzZ(zzYWI.zzZ(zzz46)));
            return zzyurZzZ;
        }

        @Override // com.aspose.words.internal.zzYX9
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzY) zzz5q);
        }
    }

    public static class zzT<T extends zzYXO> implements zzZ4V<T>, Cloneable {
        private final zzX<zzYUX> zzW1F;
        private final T zzW1G;
        private final zzYUX zzWkt;

        public /* synthetic */ zzT(zzYXO zzyxo, zzX zzx, byte b) {
            this(zzyxo, zzx);
        }

        private int zzWZ(byte[] bArr) {
            return this.zzWkt.doFinal(bArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4V
        /* JADX INFO: renamed from: zzXD2, reason: merged with bridge method [inline-methods] */
        public T zzXGU() {
            zzYVO.zzX(this.zzW1G.zzXGV());
            return this.zzW1G;
        }

        @Override // com.aspose.words.internal.zzZ4V
        public final void reset() {
            this.zzWkt.reset();
        }

        @Override // com.aspose.words.internal.zzZ4V
        public final int zzQI() {
            zzYVO.zzX(this.zzW1G.zzXGV());
            return this.zzWkt.zzQI();
        }

        @Override // com.aspose.words.internal.zzZ4V
        /* JADX INFO: renamed from: zzXGS, reason: merged with bridge method [inline-methods] */
        public final zzZ4V<T> clone() throws CloneNotSupportedException {
            return new zzT(this.zzW1G, this.zzWkt, this.zzW1F);
        }

        @Override // com.aspose.words.internal.zzZ4V
        public final zzZ41 zzXGT() {
            return new zzYU6(this.zzWkt);
        }

        @Override // com.aspose.words.internal.zzZ4V
        public final byte[] zzXI5() {
            byte[] bArr = new byte[zzQI()];
            zzWZ(bArr);
            return bArr;
        }

        private zzT(T t, zzX<zzYUX> zzx) {
            this(t, (zzYUX) null, zzx);
        }

        private zzT(T t, zzYUX zzyux, zzX<zzYUX> zzx) {
            this.zzWkt = zzx.zzX(zzyux);
            this.zzW1G = t;
            this.zzW1F = zzx;
        }
    }

    public static final class zzU extends zzYX4<zzQ> {
        private final zzYXR zzWb0;
        private final int zzWiC;
        private final SecureRandom zzWk5;

        public zzU(zzYXR zzyxr, int i, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            this.zzWiC = i;
            this.zzWk5 = secureRandom;
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYV4 zzyv4 = new zzYV4();
            zzyv4.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyv4.zzXG8());
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

    public static class zzW implements zzYRV<zzYUX> {
        private static final byte[] zzWkl = zzYGI.zzwb("abc");
        private final byte[] zzWkk;

        public zzW(byte[] bArr) {
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
            return zzYGU.zzp(bArr2, this.zzWkk);
        }
    }

    public interface zzX<D extends zzYUX> {
        D zzX(D d);
    }

    public static final class zzZ {
        public static final zzYXP zzW1W = new zzYXP("MD5", zzP.MD5);
        public static final zzYXP zzW1V = new zzYXP("MD5/HMAC", zzP.MD5_HMAC);
        public static final zzYXP zzW1U = new zzYXP("GOST3411", zzP.GOST3411);
        public static final zzYXP zzW1T = new zzYXP("GOST3411/HMAC", zzP.GOST3411_HMAC);
        public static final zzYXP zzW1S = new zzYXP("RIPEMD128", zzP.RIPEMD128);
        public static final zzYXP zzW1R = new zzYXP("RIPEMD128/HMAC", zzP.RIPEMD128_HMAC);
        public static final zzYXP zzW1Q = new zzYXP("RIPEMD160", zzP.RIPEMD160);
        public static final zzYXP zzW1P = new zzYXP("RIPEMD160/HMAC", zzP.RIPEMD160_HMAC);
        public static final zzYXP zzW1O = new zzYXP("RIPEMD256", zzP.RIPEMD256);
        public static final zzYXP zzW1N = new zzYXP("RIPEMD256/HMAC", zzP.RIPEMD256_HMAC);
        public static final zzYXP zzW1M = new zzYXP("RIPEMD320", zzP.RIPEMD320);
        public static final zzYXP zzW1L = new zzYXP("RIPEMD320/HMAC", zzP.RIPEMD320_HMAC);
        public static final zzYXP zzW1K = new zzYXP("TIGER", zzP.TIGER);
        public static final zzYXP zzW1J = new zzYXP("TIGER/HMAC", zzP.TIGER_HMAC);
        public static final zzYXP zzW1I = new zzYXP("WHIRLPOOL", zzP.WHIRLPOOL);
        public static final zzYXP zzW1H = new zzYXP("WHIRLPOOL/HMAC", zzP.WHIRLPOOL_HMAC);
    }

    static {
        HashMap map = new HashMap();
        zzWez = map;
        zzYXP zzyxp = zzZ.zzW1V;
        map.put(zzyxp, 128);
        zzYXP zzyxp2 = zzZ.zzW1T;
        map.put(zzyxp2, 256);
        zzYXP zzyxp3 = zzZ.zzW1R;
        map.put(zzyxp3, 128);
        zzYXP zzyxp4 = zzZ.zzW1P;
        map.put(zzyxp4, 160);
        zzYXP zzyxp5 = zzZ.zzW1N;
        map.put(zzyxp5, 256);
        zzYXP zzyxp6 = zzZ.zzW1L;
        map.put(zzyxp6, Integer.valueOf(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6));
        zzYXP zzyxp7 = zzZ.zzW1J;
        map.put(zzyxp7, 192);
        zzYXP zzyxp8 = zzZ.zzW1H;
        map.put(zzyxp8, 512);
        zzW2d = new zzQ(zzZ.zzW1W);
        zzW2c = new zzY(zzyxp);
        zzW2b = new zzQ(zzZ.zzW1U);
        zzW2a = new zzY(zzyxp2);
        zzW29 = new zzQ(zzZ.zzW1S);
        zzW28 = new zzY(zzyxp3);
        zzW27 = new zzQ(zzZ.zzW1Q);
        zzW26 = new zzY(zzyxp4);
        zzW25 = new zzQ(zzZ.zzW1O);
        zzW24 = new zzY(zzyxp5);
        zzW23 = new zzQ(zzZ.zzW1M);
        zzW22 = new zzY(zzyxp6);
        zzW21 = new zzQ(zzZ.zzW1K);
        zzW20 = new zzY(zzyxp7);
        zzW1Z = new zzQ(zzZ.zzW1I);
        zzW1Y = new zzY(zzyxp8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzX<zzYUX> zzY(final zzYXR zzyxr) {
        switch (C155729.zzW1X[((zzP) zzyxr.zzXFS()).ordinal()]) {
            case 9:
                return new zzX<zzYUX>() { // from class: com.aspose.words.internal.zzYW0.1
                    @Override // com.aspose.words.internal.zzYW0.zzX
                    public final zzYUX zzX(zzYUX zzyux) {
                        return zzyux != null ? new zzYWV((zzYWV) zzyux) : (zzYUX) zzYVZ.zzZ(zzyxr, new zzYWV(), new zzW(zzYGC.decode("900150983cd24fb0d6963f7d28e17f72")));
                    }
                };
            case 10:
                return new zzX<zzYUX>() { // from class: com.aspose.words.internal.zzYW0.2
                    @Override // com.aspose.words.internal.zzYW0.zzX
                    public final zzYUX zzX(zzYUX zzyux) {
                        return zzyux != null ? new zzYXS((zzYXS) zzyux) : (zzYUX) zzYVZ.zzZ(zzyxr, new zzYXS(), new zzW(zzYGC.decode("b285056dbf18d7392d7677369524dd14747459ed8143997e163b2986f92fd42c")));
                    }
                };
            case 11:
                return new zzX<zzYUX>() { // from class: com.aspose.words.internal.zzYW0.3
                    @Override // com.aspose.words.internal.zzYW0.zzX
                    public final zzYUX zzX(zzYUX zzyux) {
                        return zzyux != null ? new zzYWC((zzYWC) zzyux) : (zzYUX) zzYVZ.zzZ(zzyxr, new zzYWC(), new zzW(zzYGC.decode("c14a12199c66e4ba84636b0f69144c77")));
                    }
                };
            case 12:
                return new zzX<zzYUX>() { // from class: com.aspose.words.internal.zzYW0.4
                    @Override // com.aspose.words.internal.zzYW0.zzX
                    public final zzYUX zzX(zzYUX zzyux) {
                        return zzyux != null ? new zzYWB((zzYWB) zzyux) : (zzYUX) zzYVZ.zzZ(zzyxr, new zzYWB(), new zzW(zzYGC.decode("8eb208f7e05d987a9b044a8e98c6b087f15a0bfc")));
                    }
                };
            case 13:
                return new zzX<zzYUX>() { // from class: com.aspose.words.internal.zzYW0.5
                    @Override // com.aspose.words.internal.zzYW0.zzX
                    public final zzYUX zzX(zzYUX zzyux) {
                        return zzyux != null ? new zzYWA((zzYWA) zzyux) : (zzYUX) zzYVZ.zzZ(zzyxr, new zzYWA(), new zzW(zzYGC.decode("afbd6e228b9d8cbbcef5ca2d03e6dba10ac0bc7dcbe4680e1e42d2e975459b65")));
                    }
                };
            case 14:
                return new zzX<zzYUX>() { // from class: com.aspose.words.internal.zzYW0.6
                    @Override // com.aspose.words.internal.zzYW0.zzX
                    public final zzYUX zzX(zzYUX zzyux) {
                        return zzyux != null ? new zzYW9((zzYW9) zzyux) : (zzYUX) zzYVZ.zzZ(zzyxr, new zzYW9(), new zzW(zzYGC.decode("de4c01b3054f8930a79d09ae738e92301e5a17085beffdc1b8d116713e74f82fa942d64cdbc4682d")));
                    }
                };
            case 15:
                return new zzX<zzYUX>() { // from class: com.aspose.words.internal.zzYW0.7
                    @Override // com.aspose.words.internal.zzYW0.zzX
                    public final zzYUX zzX(zzYUX zzyux) {
                        return zzyux != null ? new zzYVS((zzYVS) zzyux) : (zzYUX) zzYVZ.zzZ(zzyxr, new zzYVS(), new zzW(zzYGC.decode("2aab1484e8c158f2bfb8c5ff41b57a525129131c957b5f93")));
                    }
                };
            case 16:
                return new zzX<zzYUX>() { // from class: com.aspose.words.internal.zzYW0.8
                    @Override // com.aspose.words.internal.zzYW0.zzX
                    public final zzYUX zzX(zzYUX zzyux) {
                        return zzyux != null ? new zzYVM((zzYVM) zzyux) : (zzYUX) zzYVZ.zzZ(zzyxr, new zzYVM(), new zzW(zzYGC.decode("4e2448a4c6f486bb16b6562c73b4020bf3043e3a731bce721ae1b303d97e6d4c7181eebdb6c57e277d0e34957114cbd6c797fc9d95d8b582d225292076d4eef5")));
                    }
                };
            default:
                throw new IllegalArgumentException("Unknown algorithm passed to SecureHash.OperatorFactory.createOutputDigestCalculator: " + zzyxr.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUR zzZ(zzYXR zzyxr) {
        switch (C155729.zzW1X[((zzP) zzyxr.zzXFS()).ordinal()]) {
            case 1:
                return (zzYUR) zzYVZ.zzZ(zzyxr, new zzYTV(new zzYXS()), new zzV(zzYGC.decode("ec352aec8da53f0626fe22699243266ed40da2beff219dfd7dd2dcf3d86ebbc9")));
            case 2:
                return (zzYUR) zzYVZ.zzZ(zzyxr, new zzYTV(new zzYWC()), new zzV(zzYGC.decode("875f828862b6b334b427c55f9f7ff09b")));
            case 3:
                return (zzYUR) zzYVZ.zzZ(zzyxr, new zzYTV(new zzYWB()), new zzV(zzYGC.decode("dda6c0213a485a9e24f4742064a7f033b43c4069")));
            case 4:
                return (zzYUR) zzYVZ.zzZ(zzyxr, new zzYTV(new zzYWA()), new zzV(zzYGC.decode("932d3e799272765675dd63c33f8d2815ea38181494f43271dd52fde91392619f")));
            case 5:
                return (zzYUR) zzYVZ.zzZ(zzyxr, new zzYTV(new zzYW9()), new zzV(zzYGC.decode("e440b00b6326e4f7dad3a6591e8189e9708fc17e3cab306fc67efaf70947aad2ea89e28f79d03bd3")));
            case 6:
                return (zzYUR) zzYVZ.zzZ(zzyxr, new zzYTV(new zzYVS()), new zzV(zzYGC.decode("3a351b1dec6075d6290e68b604e553821edc39041b82da83")));
            case 7:
                return (zzYUR) zzYVZ.zzZ(zzyxr, new zzYTV(new zzYWV()), new zzV(zzYGC.decode("750c783e6ab0b503eaa86e310a5db738")));
            case 8:
                return (zzYUR) zzYVZ.zzZ(zzyxr, new zzYTV(new zzYVM()), new zzV(zzYGC.decode("3d595ccd1d4f4cfd045af53ba7d5c8283fee6ded6eaf1269071b6b4ea64800056b5077c6a942cfa1221bd4e5aed791276e5dd46a407d2b8007163d3e7cd1de66")));
            default:
                throw new IllegalArgumentException("Unknown algorithm passed to createMAC: " + zzyxr.getName());
        }
    }

    public static final class zzY extends zzYXO<zzYXR> implements zzZ5Q<zzY> {
        private final int zzWdl;

        private zzY(zzYXR zzyxr, int i) {
            super(zzyxr);
            this.zzWdl = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ5Q
        /* JADX INFO: renamed from: zzfi, reason: merged with bridge method [inline-methods] */
        public zzY zzg1(int i) {
            return new zzY(zzXGV(), i);
        }

        @Override // com.aspose.words.internal.zzZ5Q
        public final int zzXH3() {
            return this.zzWdl;
        }

        public zzY(zzYXR zzyxr) {
            this(zzyxr, ((Integer) zzYW0.zzWez.get(zzyxr)).intValue());
        }
    }

    public static zzYUR zzY(zzYXP zzyxp) {
        return zzZ((zzYXR) zzyxp);
    }

    public static zzYUX zzZ(zzYXP zzyxp) {
        return zzY((zzYXR) zzyxp).zzX(null);
    }
}
