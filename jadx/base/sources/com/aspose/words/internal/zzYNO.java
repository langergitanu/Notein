package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYW0;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNO {
    private static zzZ5J<zzYXO> zzVPO;
    private static final zzYQC.zzZ zzVQb = new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYNO.1
        @Override // com.aspose.words.internal.zzYQC.zzZ
        public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
            return bArr;
        }
    };

    public static class zzQ extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNO$zzQ";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.WHIRLPOOL", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzQ.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return zzYNO.zzZ(zzYW0.zzW1Z);
                }
            }));
            zzyq8.zzZ("MessageDigest", "WHIRLPOOL", zzZ9Y.zzWBD);
            zzYPV.zzZ(zzyq8, "WHIRLPOOL", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzQ.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzYW0.zzZ.zzW1H, new zzW(zzYW0.zzW1Y));
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzQ.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacWhirlpool", 512, new zzYPL() { // from class: com.aspose.words.internal.zzYNO.zzQ.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzYW0.zzU(zzYW0.zzZ.zzW1H, i, secureRandom);
                        }
                    });
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzQ.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacWhirlpool", zzYW0.zzZ.zzW1H, zzYNO.zzVQb);
                }
            }));
        }
    }

    public static class zzR extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNO$zzR";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.TIGER", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzR.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return zzYNO.zzZ(zzYW0.zzW21);
                }
            });
            zzyq8.zzZ("MessageDigest", "TIGER", zzZA1.zzWCB);
            zzYPV.zzZ(zzyq8, "TIGER", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzR.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzYW0.zzZ.zzW1J, new zzW(zzYW0.zzW20));
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzR.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacTiger", 192, new zzYPL() { // from class: com.aspose.words.internal.zzYNO.zzR.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzYW0.zzU(zzYW0.zzZ.zzW1J, i, secureRandom);
                        }
                    });
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzR.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacTiger", zzYW0.zzZ.zzW1J, zzYNO.zzVQb);
                }
            }));
            zzYPV.zzZ(zzyq8, "TIGER", zzZA0.zzWC3);
        }
    }

    public static class zzS extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNO$zzS";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.RIPEMD320", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzS.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return zzYNO.zzZ(zzYW0.zzW23);
                }
            });
            zzyq8.zzZ("MessageDigest", "RIPEMD320", "RIPEMD-320");
            zzYPV.zzZ(zzyq8, "RIPEMD320", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzS.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzYW0.zzZ.zzW1L, new zzW(zzYW0.zzW22));
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzS.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacRIPEMD320", StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6, new zzYPL() { // from class: com.aspose.words.internal.zzYNO.zzS.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzYW0.zzU(zzYW0.zzZ.zzW1L, i, secureRandom);
                        }
                    });
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzS.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacRIPEMD320", zzYW0.zzZ.zzW1L, zzYNO.zzVQb);
                }
            }));
        }
    }

    public static class zzT extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNO$zzT";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.RIPEMD256", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzT.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return zzYNO.zzZ(zzYW0.zzW25);
                }
            });
            zzyq8.zzZ("MessageDigest", "RIPEMD256", "RIPEMD-256");
            zzyq8.zzZ("MessageDigest", "RIPEMD256", zzZ8R.zzWu4);
            zzYPV.zzZ(zzyq8, "RIPEMD256", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzT.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzYW0.zzZ.zzW1N, new zzW(zzYW0.zzW24));
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzT.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacRIPEMD256", 256, new zzYPL() { // from class: com.aspose.words.internal.zzYNO.zzT.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzYW0.zzU(zzYW0.zzZ.zzW1N, i, secureRandom);
                        }
                    });
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzT.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacRIPEMD256", zzYW0.zzZ.zzW1N, zzYNO.zzVQb);
                }
            }));
        }
    }

    public static class zzU extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNO$zzU";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.RIPEMD160", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzU.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return zzYNO.zzZ(zzYW0.zzW27);
                }
            }));
            zzyq8.zzZ("MessageDigest", "RIPEMD160", "RIPEMD-160");
            zzyq8.zzZ("MessageDigest", "RIPEMD160", zzZ8R.zzWBF, zzZ9Y.zzWBF);
            zzYPV.zzZ(zzyq8, "RIPEMD160", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzU.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzYW0.zzZ.zzW1P, new zzW(zzYW0.zzW26));
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzU.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacRIPEMD160", 160, new zzYPL() { // from class: com.aspose.words.internal.zzYNO.zzU.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzYW0.zzU(zzYW0.zzZ.zzW1P, i, secureRandom);
                        }
                    });
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzU.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacRIPEMD160", zzYW0.zzZ.zzW1P, zzYNO.zzVQb);
                }
            }));
            zzYPV.zzZ(zzyq8, "RIPEMD160", zzZA0.zzWC2);
        }
    }

    public static class zzV extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNO$zzV";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.RIPEMD128", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzV.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return zzYNO.zzZ(zzYW0.zzW29);
                }
            }));
            zzyq8.zzZ("MessageDigest", "RIPEMD128", "RIPEMD-128");
            zzyq8.zzZ("MessageDigest", "RIPEMD128", zzZ8R.zzWBE, zzZ9Y.zzWBE);
            zzYPV.zzZ(zzyq8, "RIPEMD128", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzV.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzYW0.zzZ.zzW1R, new zzW(zzYW0.zzW28));
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzV.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacRIPEMD128", 128, new zzYPL() { // from class: com.aspose.words.internal.zzYNO.zzV.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzYW0.zzU(zzYW0.zzZ.zzW1R, i, secureRandom);
                        }
                    });
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzV.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacRIPEMD128", zzYW0.zzZ.zzW1R, zzYNO.zzVQb);
                }
            }));
        }
    }

    public static class zzW implements zzYPG {
        private final zzYW0.zzY zzVPI;

        public zzW(zzYW0.zzY zzy) {
            this.zzVPI = zzy;
        }

        @Override // com.aspose.words.internal.zzYPG
        public final zzZ5Q zzXBE() {
            return this.zzVPI;
        }

        @Override // com.aspose.words.internal.zzYPG
        /* JADX INFO: renamed from: zzZ */
        public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            return this.zzVPI;
        }
    }

    public static class zzX extends MessageDigest implements Cloneable {
        private final zzYPH zzVPJ;

        public zzX() {
            super("MD5");
            this.zzVPJ = new zzYPH();
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public final Object clone() throws CloneNotSupportedException {
            return new zzX(this.zzVPJ);
        }

        @Override // java.security.MessageDigestSpi
        public final byte[] engineDigest() {
            byte[] bArr = new byte[this.zzVPJ.zzQI()];
            this.zzVPJ.doFinal(bArr, 0);
            engineReset();
            return bArr;
        }

        @Override // java.security.MessageDigestSpi
        public final int engineGetDigestLength() {
            return this.zzVPJ.zzQI();
        }

        @Override // java.security.MessageDigestSpi
        public final void engineReset() {
            this.zzVPJ.reset();
        }

        @Override // java.security.MessageDigestSpi
        public final void engineUpdate(byte b) {
            this.zzVPJ.update(b);
        }

        @Override // java.security.MessageDigestSpi
        public final void engineUpdate(byte[] bArr, int i, int i2) {
            this.zzVPJ.update(bArr, i, i2);
        }

        private zzX(zzYPH zzyph) {
            super("MD5");
            this.zzVPJ = new zzYPH(zzyph);
        }
    }

    public static class zzY extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNO$zzY";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.MD5", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzY.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzX();
                }
            });
            zzyq8.zzZ("MessageDigest", "MD5", zzZ96.zzWy5);
            if (zzZ5L.zzXH0()) {
                return;
            }
            zzYPV.zzZ(zzyq8, "MD5", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzY.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzYW0.zzZ.zzW1V, new zzW(zzYW0.zzW2c));
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzY.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacMD5", 128, new zzYPL() { // from class: com.aspose.words.internal.zzYNO.zzY.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzYW0.zzU(zzYW0.zzZ.zzW1V, i, secureRandom);
                        }
                    });
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzY.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacMD5", zzYW0.zzZ.zzW1V, zzYNO.zzVQb);
                }
            }));
            zzYPV.zzZ(zzyq8, "MD5", zzZA0.zzWC5);
        }
    }

    public static class zzZ extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNO$zzZ";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.GOST3411", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzZ.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return zzYNO.zzZ(zzYW0.zzW2b);
                }
            }));
            zzyq8.zzZ("MessageDigest", "GOST3411", "GOST", "GOST-3411");
            zzZDA zzzda = zzZAE.zzWF1;
            zzyq8.zzZ("MessageDigest", "GOST3411", zzzda);
            zzYPV.zzZ(zzyq8, "GOST3411", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzZ.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzYW0.zzZ.zzW1T, new zzW(zzYW0.zzW2a));
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzZ.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacGOST3411", 256, new zzYPL() { // from class: com.aspose.words.internal.zzYNO.zzZ.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzYW0.zzU(zzYW0.zzZ.zzW1T, i, secureRandom);
                        }
                    });
                }
            }), C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNO.zzZ.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacGOST3411", zzYW0.zzZ.zzW1T, zzYNO.zzVQb);
                }
            }));
            zzYPV.zzZ(zzyq8, "GOST3411", zzZAE.zzWF0, zzzda);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYQD zzZ(zzYW0.zzQ zzq) {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (zzVPO == null) {
            zzVPO = new zzYW0.zzR();
        }
        return new zzYQD(zzVPO.zzZ(zzq));
    }
}
