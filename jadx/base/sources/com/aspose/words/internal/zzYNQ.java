package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzZ0P;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNQ {
    private static final zzYQC.zzZ zzVQb = new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYNQ.1
        @Override // com.aspose.words.internal.zzYQC.zzZ
        public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
            return bArr;
        }
    };

    public static class zzP implements zzYPG {
        private final zzZ0P.zzY zzVQa;
        private final int zzWdl;

        public zzP(zzZ0P.zzY zzy, int i) {
            this.zzVQa = zzy;
            this.zzWdl = i;
        }

        @Override // com.aspose.words.internal.zzYPG
        public final zzZ5Q zzXBE() {
            return this.zzVQa.zzg1(this.zzWdl);
        }

        @Override // com.aspose.words.internal.zzYPG
        /* JADX INFO: renamed from: zzZ */
        public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            return zzXBE();
        }
    }

    public static class zzQ extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzQ";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA-512", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWep);
                }
            });
            zzyq8.zzZ("MessageDigest", "SHA-512", "SHA512");
            zzZDA zzzda = zzZ9O.zzWAJ;
            zzyq8.zzZ("MessageDigest", "SHA-512", zzzda);
            zzYPV.zzZ(zzyq8, "SHA-512", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.8
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdC, new zzZ(zzZ0P.zzWeo));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.9
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA512", 512, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzQ.9.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdC, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.10
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA512", zzZ0P.zzZ.zzWdC, zzYNQ.zzVQb);
                }
            });
            zzYPV.zzZ(zzyq8, "SHA-512", "HMAC-SHA512", "HMACSHA512");
            zzYPV.zzZ(zzyq8, "SHA-512", zzZ96.zzWy0, zzzda);
            zzyq8.zzZ("Mac.HMAC256SHA512", C21111o0ooOoO.OooO0Oo(str, "$HashMac256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.11
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdC, new zzP(zzZ0P.zzWeo, 256));
                }
            });
            zzyq8.zzZ("Mac", "HMAC256SHA512", "HMAC256SHA-512");
            zzyq8.zzZ("MessageDigest.SHA-512(224)", C21111o0ooOoO.OooO0Oo(str, "$DigestT224"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.12
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWen);
                }
            });
            zzyq8.zzZ("MessageDigest", "SHA-512(224)", "SHA512(224)", "SHA-512/224", "SHA512/224");
            zzyq8.zzZ("MessageDigest", "SHA-512(224)", zzZ9O.zzWAH);
            zzyq8.zzZ("MessageDigest.SHA-512(256)", C21111o0ooOoO.OooO0Oo(str, "$DigestT256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.13
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWel);
                }
            });
            zzyq8.zzZ("MessageDigest", "SHA-512(256)", "SHA512(256)", "SHA-512/256", "SHA512/256");
            zzyq8.zzZ("MessageDigest", "SHA-512(256)", zzZ9O.zzWAG);
            zzYPV.zzZ(zzyq8, "SHA-512(224)", C21111o0ooOoO.OooO0Oo(str, "$HashMacT224"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.14
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdA, new zzZ(zzZ0P.zzWem));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGeneratorT224"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.15
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA512(224)", 224, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzQ.15.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdA, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactoryT224"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA512(224)", zzZ0P.zzZ.zzWdA, zzYNQ.zzVQb);
                }
            });
            zzYPV.zzZ(zzyq8, "SHA-512(224)", "HMAC-SHA512(224)", "HMACSHA512(224)", "HMAC-SHA512/224", "HMACSHA512/224");
            zzyq8.zzZ("Mac.HMAC128SHA512(224)", C21111o0ooOoO.OooO0Oo(str, "$Hmac128_224"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdA, new zzP(zzZ0P.zzWem, 128));
                }
            });
            zzyq8.zzZ("Mac", "HMAC128SHA512(224)", "HMAC128SHA-512(224)");
            zzYPV.zzZ(zzyq8, "SHA-512(256)", C21111o0ooOoO.OooO0Oo(str, "$HashMacT256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdy, new zzZ(zzZ0P.zzWek));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGeneratorT256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA512(256)", 256, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzQ.5.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdy, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactoryT256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.6
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA512(256)", zzZ0P.zzZ.zzWdy, zzYNQ.zzVQb);
                }
            });
            zzYPV.zzZ(zzyq8, "SHA-512(256)", "HMAC-SHA512(256)", "HMACSHA512(256)", "HMAC-SHA512/256", "HMACSHA512/256");
            zzyq8.zzZ("Mac.HMAC128SHA512(256)", C21111o0ooOoO.OooO0Oo(str, "$Hmac128_256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzQ.7
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdy, new zzP(zzZ0P.zzWek, 128));
                }
            });
            zzyq8.zzZ("Mac", "HMAC128SHA512(256)", "HMAC128SHA-512(256)");
        }
    }

    public static class zzR extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzR";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA3-512", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzR.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWed);
                }
            });
            zzZDA zzzda = zzZ9O.zzWAC;
            zzyq8.zzZ("MessageDigest", "SHA3-512", zzzda);
            zzYPV.zzZ(zzyq8, "SHA3-512", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzR.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdq, new zzZ(zzZ0P.zzWec));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzR.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA3-512", 512, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzR.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdq, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzR.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA3-512", zzZ0P.zzZ.zzWdq, zzYNQ.zzVQb);
                }
            });
            zzyq8.zzZ("Mac.HMAC256SHA3-512", C21111o0ooOoO.OooO0Oo(str, "$HashMac256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzR.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdq, new zzP(zzZ0P.zzWec, 256));
                }
            });
            zzYPV.zzZ(zzyq8, "SHA3-512", "HMACSHA3-512");
            zzYPV.zzZ(zzyq8, "SHA3-512", zzZ9O.zzWAw, zzzda);
        }
    }

    public static class zzS extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzS";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA3-384", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzS.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWef);
                }
            });
            zzZDA zzzda = zzZ9O.zzWAD;
            zzyq8.zzZ("MessageDigest", "SHA3-384", zzzda);
            zzYPV.zzZ(zzyq8, "SHA3-384", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzS.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWds, new zzZ(zzZ0P.zzWee));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzS.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA3-384", 384, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzS.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWds, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzS.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA3-384", zzZ0P.zzZ.zzWds, zzYNQ.zzVQb);
                }
            });
            zzyq8.zzZ("Mac.HMAC256SHA3-384", C21111o0ooOoO.OooO0Oo(str, "$HashMac256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzS.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWds, new zzP(zzZ0P.zzWee, 256));
                }
            });
            zzYPV.zzZ(zzyq8, "SHA3-384", "HMACSHA3-384");
            zzYPV.zzZ(zzyq8, "SHA3-384", zzZ9O.zzWAx, zzzda);
        }
    }

    public static class zzT extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzT";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA3-256", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzT.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWeh);
                }
            });
            zzZDA zzzda = zzZ9O.zzWAE;
            zzyq8.zzZ("MessageDigest", "SHA3-256", zzzda);
            zzYPV.zzZ(zzyq8, "SHA3-256", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzT.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdu, new zzZ(zzZ0P.zzWeg));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzT.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA3-256", 256, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzT.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdu, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzT.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA3-256", zzZ0P.zzZ.zzWdu, zzYNQ.zzVQb);
                }
            });
            zzyq8.zzZ("Mac.HMAC128SHA3-256", C21111o0ooOoO.OooO0Oo(str, "$HashMac128"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzT.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdu, new zzP(zzZ0P.zzWeg, 128));
                }
            });
            zzYPV.zzZ(zzyq8, "SHA3-256", "HMACSHA3-256");
            zzYPV.zzZ(zzyq8, "SHA3-256", zzZ9O.zzWAy, zzzda);
        }
    }

    public static class zzU extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzU";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA3-224", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzU.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWej);
                }
            });
            zzZDA zzzda = zzZ9O.zzWAF;
            zzyq8.zzZ("MessageDigest", "SHA3-224", zzzda);
            zzYPV.zzZ(zzyq8, "SHA3-224", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzU.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdw, new zzZ(zzZ0P.zzWei));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzU.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA3-224", 224, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzU.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdw, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzU.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA3-224", zzZ0P.zzZ.zzWdw, zzYNQ.zzVQb);
                }
            });
            zzyq8.zzZ("Mac.HMAC128SHA3-224", C21111o0ooOoO.OooO0Oo(str, "$HashMac128"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzU.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdw, new zzP(zzZ0P.zzWei, 128));
                }
            });
            zzYPV.zzZ(zzyq8, "SHA3-224", "HMACSHA3-224");
            zzYPV.zzZ(zzyq8, "SHA3-224", zzZ9O.zzWAz, zzzda);
        }
    }

    public static class zzV extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzV";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA-384", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzV.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWer);
                }
            });
            zzyq8.zzZ("MessageDigest", "SHA-384", "SHA384");
            zzZDA zzzda = zzZ9O.zzWAK;
            zzyq8.zzZ("MessageDigest", "SHA-384", zzzda);
            zzYPV.zzZ(zzyq8, "SHA-384", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzV.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdE, new zzZ(zzZ0P.zzWeq));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzV.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA384", 384, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzV.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdE, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzV.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA384", zzZ0P.zzZ.zzWdE, zzYNQ.zzVQb);
                }
            });
            zzYPV.zzZ(zzyq8, "SHA-384", "HMAC-SHA384", "HMACSHA384");
            zzYPV.zzZ(zzyq8, "SHA-384", zzZ96.zzWy1, zzzda);
            zzyq8.zzZ("Mac.HMAC256SHA384", C21111o0ooOoO.OooO0Oo(str, "$Hmac256"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzV.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdE, new zzP(zzZ0P.zzWeq, 256));
                }
            });
            zzyq8.zzZ("Mac", "HMAC256SHA384", "HMAC256SHA-384");
        }
    }

    public static class zzW extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzW";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA-256", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzW.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWet);
                }
            });
            zzyq8.zzZ("MessageDigest", KeyUtil.HMAC_KEY_HASH_ALGORITHM, "SHA256");
            zzZDA zzzda = zzZ9O.zzWAL;
            zzyq8.zzZ("MessageDigest", KeyUtil.HMAC_KEY_HASH_ALGORITHM, zzzda);
            zzYPV.zzZ(zzyq8, KeyUtil.HMAC_KEY_HASH_ALGORITHM, C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzW.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdG, new zzZ(zzZ0P.zzWes));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzW.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, KeyUtil.HMAC_ALGORITHM, 256, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzW.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdG, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzW.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC(KeyUtil.HMAC_ALGORITHM, zzZ0P.zzZ.zzWdG, zzYNQ.zzVQb);
                }
            });
            zzYPV.zzZ(zzyq8, KeyUtil.HMAC_KEY_HASH_ALGORITHM, "HMAC-SHA256", "HMACSHA256");
            zzYPV.zzZ(zzyq8, KeyUtil.HMAC_KEY_HASH_ALGORITHM, zzZ96.zzWy2, zzzda);
            zzyq8.zzZ("Mac.HMAC128SHA256", C21111o0ooOoO.OooO0Oo(str, "$Hmac128"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzW.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdG, new zzP(zzZ0P.zzWes, 128));
                }
            });
            zzyq8.zzZ("Mac", "HMAC128SHA256", "HMAC128SHA-256");
        }
    }

    public static class zzX extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzX";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA-224", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzX.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWev);
                }
            });
            zzyq8.zzZ("MessageDigest", "SHA-224", "SHA224");
            zzZDA zzzda = zzZ9O.zzWAI;
            zzyq8.zzZ("MessageDigest", "SHA-224", zzzda);
            zzYPV.zzZ(zzyq8, "SHA-224", C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzX.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdI, new zzZ(zzZ0P.zzWeu));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzX.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA224", 224, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzX.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdI, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzX.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA224", zzZ0P.zzZ.zzWdI, zzYNQ.zzVQb);
                }
            });
            zzYPV.zzZ(zzyq8, "SHA-224", "HMAC-SHA224", "HMACSHA224");
            zzYPV.zzZ(zzyq8, "SHA-224", zzZ96.zzWy3, zzzda);
            zzyq8.zzZ("Mac.HMAC128SHA224", C21111o0ooOoO.OooO0Oo(str, "$Hmac128"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzX.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdI, new zzP(zzZ0P.zzWeu, 128));
                }
            });
            zzyq8.zzZ("Mac", "HMAC128SHA224", "HMAC128SHA-224");
        }
    }

    public static class zzY extends zzYPV {
        private static final String PREFIX = "com.aspose.words.internal.zzYNQ$zzY";

        @Override // com.aspose.words.internal.zzYQR
        public final void zzZ(final zzYQ8 zzyq8) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            zzyq8.zzZ("MessageDigest.SHA-1", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$Digest"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzY.1
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQD(zzZ0P.zzWex);
                }
            });
            zzyq8.zzZ("MessageDigest", IDevicePopManager.SHA_1, "SHA1", "SHA");
            zzZDA zzzda = zzZ9K.zzWyW;
            zzyq8.zzZ("MessageDigest", IDevicePopManager.SHA_1, zzzda);
            zzYPV.zzZ(zzyq8, IDevicePopManager.SHA_1, C21111o0ooOoO.OooO0Oo(str, "$HashMac"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzY.2
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdK, new zzZ(zzZ0P.zzWew));
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzY.3
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQF(zzyq8, "HmacSHA1", 160, new zzYPL() { // from class: com.aspose.words.internal.zzYNQ.zzY.3.1
                        @Override // com.aspose.words.internal.zzYPL
                        public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                            return new zzZ0P.zzU(zzZ0P.zzZ.zzWdK, i, secureRandom);
                        }
                    });
                }
            }, C21111o0ooOoO.OooO0Oo(str, "$SecretKeyFactory"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzY.4
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQC("HmacSHA1", zzZ0P.zzZ.zzWdK, zzYNQ.zzVQb);
                }
            });
            zzYPV.zzZ(zzyq8, IDevicePopManager.SHA_1, "HMAC-SHA1", "HMACSHA1", "HMACSHA");
            zzYPV.zzZ(zzyq8, IDevicePopManager.SHA_1, zzZ96.zzWy4, zzZA0.zzWC4, zzzda);
            zzyq8.zzZ("Mac.HMAC128SHA1", C21111o0ooOoO.OooO0Oo(str, "$Hmac128"), new zzYPS() { // from class: com.aspose.words.internal.zzYNQ.zzY.5
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQI(zzZ0P.zzZ.zzWdK, new zzP(zzZ0P.zzWew, 128));
                }
            });
            zzyq8.zzZ("Mac", "HMAC128SHA1", "HMAC128SHA-1");
        }
    }

    public static class zzZ implements zzYPG {
        private final zzZ0P.zzY zzVQa;

        public zzZ(zzZ0P.zzY zzy) {
            this.zzVQa = zzy;
        }

        @Override // com.aspose.words.internal.zzYPG
        public final zzZ5Q zzXBE() {
            return this.zzVQa;
        }

        @Override // com.aspose.words.internal.zzYPG
        /* JADX INFO: renamed from: zzZ */
        public final zzZ5Q zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null) {
                return this.zzVQa;
            }
            throw new InvalidAlgorithmParameterException("Unknown AlgorithmParameterSpec found: ".concat(algorithmParameterSpec.getClass().getName()));
        }
    }
}
