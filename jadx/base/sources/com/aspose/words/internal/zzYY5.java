package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYY5 {
    public static final byte[] zzW7K = new byte[0];
    public static final zzW zzW7J = new zzW(null);
    public static final zzW zzW7I = new zzW(zzZ.zzW7v);
    public static final zzW zzW7H = new zzW(zzZ.zzW7u);
    public static final zzW zzW7G = new zzW(zzZ.zzW7t);
    public static final zzW zzW7F = new zzW(zzZ.zzW7s);
    private static final byte[] zzW7E = zzYGC.decode("683ea9b2857ff88fff5160bede45edb3b64f5d76c2c3ef6ef0479caa65c6ec2bcddaf76e3c3c61dcc557a09771b7593cf6240c2328b4054f");
    private static final byte[] zzW7D = zzYGC.decode("daafe9ae6984c3ab2fea0498990ee3c1690aac801e508a735e037436dcd16435c5fa93b5186e668247c4c1e9560a3d2e53a1136ca714978b");
    private static final byte[] zzW7C = zzYGC.decode("4a434deaa453db96d893c92d4193d5ccb0002e74121548f936c2a313b9fd3a49");
    private static final byte[] zzW7B = zzYGC.decode("722143ed71a72fb2f6ecb3a2549d09d0e9db308b79450c38cd2d406ef8723167");
    private static final byte[] data = zzYGC.decode("576a1f885e3420128c8a656097ba7d8bb4c6f1b1853348cf2ba976971dbdbefc");

    /* JADX INFO: renamed from: com.aspose.words.internal.zzYY5$3 */
    public static /* synthetic */ class C156043 {
        static final /* synthetic */ int[] zzW7A;

        static {
            int[] iArr = new int[zzV.values().length];
            zzW7A = iArr;
            try {
                iArr[zzV.Ed448.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzW7A[zzV.Ed25519.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzW7A[zzV.X448.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzW7A[zzV.X25519.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class zzT extends zzYXD {
        private final zzYVA zzW7q;
        private final zzV zzW7r;

        public zzT(zzW zzw, SecureRandom secureRandom) {
            super(zzw);
            int i = C156043.zzW7A[((zzV) zzw.zzXGV().zzXFS()).ordinal()];
            if (i == 3) {
                this.zzW7r = zzV.X448;
                this.zzW7q = new zzYVG();
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("unknown algorithm");
                }
                this.zzW7r = zzV.X25519;
                this.zzW7q = new zzYVK();
            }
            this.zzW7q.zzZ(new zzYUS(secureRandom, 0));
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G zzXDI() {
            zzYVB zzyvbZzXG6 = this.zzW7q.zzXG6();
            zzYY5.zzQ(zzyvbZzXG6);
            int i = C156043.zzW7A[this.zzW7r.ordinal()];
            if (i == 3) {
                return new zzZ3G(new zzZ3A(zzXH6().zzXGV(), ((zzYVE) zzyvbZzXG6.zzXCP()).getEncoded()), new zzZ3B(zzXH6().zzXGV(), ((zzYVF) zzyvbZzXG6.zzXCO()).getEncoded(), ((zzYVE) zzyvbZzXG6.zzXCP()).getEncoded()));
            }
            if (i == 4) {
                return new zzZ3G(new zzZ3A(zzXH6().zzXGV(), ((zzYVI) zzyvbZzXG6.zzXCP()).getEncoded()), new zzZ3B(zzXH6().zzXGV(), ((zzYVJ) zzyvbZzXG6.zzXCO()).getEncoded(), ((zzYVI) zzyvbZzXG6.zzXCP()).getEncoded()));
            }
            throw new IllegalArgumentException("unknown algorithm");
        }
    }

    public static final class zzU implements zzZ5X<zzW> {
        public zzU() {
            zzZ0L.isReady();
            if (zzZ5L.zzXH0()) {
                throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ5X
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public zzZ5Y<zzW> zzZ(zzZ5S zzz5s, final zzW zzw) {
            final zzYUK zzyvh;
            int i = C156043.zzW7A[((zzV) zzw.zzXGV().zzXFS()).ordinal()];
            if (i == 3) {
                zzyvh = new zzYVH();
                zzyvh.zzZ(zzYY5.zzZ((zzZ3B) zzz5s));
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("unknown algorithm");
                }
                zzyvh = new zzYVL();
                zzyvh.zzZ(zzYY5.zzZ((zzZ3B) zzz5s));
            }
            return new zzZ5Y<zzW>() { // from class: com.aspose.words.internal.zzYY5.zzU.1
                @Override // com.aspose.words.internal.zzZ5Y
                public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                    return zzw;
                }

                @Override // com.aspose.words.internal.zzZ5Y
                public final byte[] zzZ(zzZ5R zzz5r) {
                    zzYT2 zzyt2ZzZ = zzYY5.zzZ((zzZ3A) zzz5r);
                    byte[] bArr = zzyt2ZzZ instanceof zzYVE ? new byte[56] : new byte[32];
                    zzyvh.zzZ(zzyt2ZzZ, bArr);
                    return bArr;
                }
            };
        }
    }

    public enum zzV {
        Ed448,
        Ed25519,
        X448,
        X25519
    }

    public static class zzW extends zzYXO<zzYXR> {
        public zzW(zzYXR zzyxr) {
            super(zzyxr);
        }
    }

    public static final class zzY extends zzYXD {
        private final zzYVA zzW7q;
        private final zzV zzW7r;

        public zzY(zzW zzw, SecureRandom secureRandom) {
            super(zzw);
            int i = C156043.zzW7A[((zzV) zzw.zzXGV().zzXFS()).ordinal()];
            if (i == 1) {
                this.zzW7r = zzV.Ed448;
                this.zzW7q = new zzYY9();
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("unknown algorithm");
                }
                this.zzW7r = zzV.Ed25519;
                this.zzW7q = new zzYYD();
            }
            this.zzW7q.zzZ(new zzYUS(secureRandom, 0));
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G zzXDI() {
            zzYVB zzyvbZzXG6 = this.zzW7q.zzXG6();
            zzYY5.zzP(zzyvbZzXG6);
            int i = C156043.zzW7A[this.zzW7r.ordinal()];
            if (i == 1) {
                return new zzZ3G(new zzZ3K(zzXH6().zzXGV(), ((zzYY7) zzyvbZzXG6.zzXCP()).getEncoded()), new zzZ3L(zzXH6().zzXGV(), ((zzYY8) zzyvbZzXG6.zzXCO()).getEncoded(), ((zzYY7) zzyvbZzXG6.zzXCP()).getEncoded()));
            }
            if (i == 2) {
                return new zzZ3G(new zzZ3K(zzXH6().zzXGV(), ((zzYYB) zzyvbZzXG6.zzXCP()).getEncoded()), new zzZ3L(zzXH6().zzXGV(), ((zzYYC) zzyvbZzXG6.zzXCO()).getEncoded(), ((zzYYB) zzyvbZzXG6.zzXCP()).getEncoded()));
            }
            throw new IllegalArgumentException("unknown algorithm");
        }
    }

    public static final class zzZ {
        public static final zzYXR zzW7v = new zzYXR("Ed448", zzV.Ed448);
        public static final zzYXR zzW7u = new zzYXR("Ed25519", zzV.Ed25519);
        public static final zzYXR zzW7t = new zzYXR("X448", zzV.X448);
        public static final zzYXR zzW7s = new zzYXR("X25519", zzV.X25519);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzP(zzYVB zzyvb) {
        if (zzyvb.zzXCP() instanceof zzYY7) {
            zzYVZ.zzZ(zzZ.zzW7v, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzYY5.11
                private static boolean zzX(zzYVB zzyvb2) {
                    return zzYY5.zzZ(new zzYY6(zzYY5.zzW7K), zzyvb2);
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
        } else {
            zzYVZ.zzZ(zzZ.zzW7u, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzYY5.2
                private static boolean zzX(zzYVB zzyvb2) {
                    return zzYY5.zzZ(new zzYYA(), zzyvb2);
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzQ(zzYVB zzyvb) {
        if (zzyvb.zzXCP() instanceof zzYVE) {
            zzYVZ.zzZ(zzZ.zzW7t, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzYY5.9
                private static boolean zzX(zzYVB zzyvb2) {
                    return zzYY5.zzZ(new zzYVH(), zzyvb2, new zzYVF(zzYY5.zzW7E), new zzYVE(zzYY5.zzW7D));
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
        } else {
            zzYVZ.zzZ(zzZ.zzW7s, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzYY5.10
                private static boolean zzX(zzYVB zzyvb2) {
                    return zzYY5.zzZ(new zzYVL(), zzyvb2, new zzYVJ(zzYY5.zzW7C), new zzYVI(zzYY5.zzW7B));
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
        }
    }

    public static byte[] zzZ(zzZ5W zzz5w, byte[] bArr) {
        if (zzz5w.equals(zzZ.zzW7v)) {
            byte[] bArr2 = new byte[57];
            new zzYID() { // from class: com.aspose.words.internal.zzYY5.1
                @Override // com.aspose.words.internal.zzYID
                public final zzYUB zzXDw() {
                    return (zzYUB) zzYW6.zzZ(zzZ0P.zzZ.zzWdo);
                }
            }.zzr(bArr, bArr2);
            return bArr2;
        }
        if (zzz5w.equals(zzZ.zzW7u)) {
            byte[] bArr3 = new byte[32];
            new zzYIE() { // from class: com.aspose.words.internal.zzYY5.4
                @Override // com.aspose.words.internal.zzYIE
                public final zzYUX zzXDy() {
                    return zzYW6.zzZ(zzZ0P.zzZ.zzWdD);
                }
            }.zzr(bArr, bArr3);
            return bArr3;
        }
        if (zzz5w.equals(zzZ.zzW7t)) {
            byte[] bArr4 = new byte[56];
            zzYIG.zzs(bArr, bArr4);
            return bArr4;
        }
        byte[] bArr5 = new byte[32];
        zzYII.zzs(bArr, bArr5);
        return bArr5;
    }

    public static final class zzX extends zzYX7<zzW> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4S<zzW> zzU(zzZ5S zzz5s, final zzW zzw) {
            final zzYUI zzyy6;
            final zzYXR zzyxr = (zzYXR) (zzw.zzXGV() != null ? zzw.zzXGV() : zzz5s.zzXGV());
            int i = C156043.zzW7A[((zzV) zzyxr.zzXFS()).ordinal()];
            if (i == 1) {
                zzyy6 = new zzYY6(zzYY5.zzW7K);
                zzyy6.zzZ(true, zzYY5.zzZ((zzZ3L) zzz5s));
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("unknown algorithm");
                }
                zzyy6 = new zzYYA();
                zzyy6.zzZ(true, zzYY5.zzZ((zzZ3L) zzz5s));
            }
            return new zzZ4S<zzW>() { // from class: com.aspose.words.internal.zzYY5.zzX.1
                @Override // com.aspose.words.internal.zzZ4S
                public final byte[] getSignature() throws zzZ4H {
                    try {
                        return zzyy6.zzXEp();
                    } catch (Exception e) {
                        throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to create signature: ")), e);
                    }
                }

                @Override // com.aspose.words.internal.zzZ4S
                public final zzZ41 zzXGO() {
                    return new zzYU4(zzyxr.getName(), zzyy6);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4P<zzW> zzX(zzZ5R zzz5r, final zzW zzw) {
            final zzYUI zzyy6;
            final zzYXR zzyxr = (zzYXR) (zzw.zzXGV() != null ? zzw.zzXGV() : zzz5r.zzXGV());
            int i = C156043.zzW7A[((zzV) zzyxr.zzXFS()).ordinal()];
            if (i == 1) {
                zzyy6 = new zzYY6(new byte[0]);
                zzyy6.zzZ(false, zzYY5.zzZ((zzZ3K) zzz5r));
            } else if (i == 2) {
                zzyy6 = new zzYYA();
                zzyy6.zzZ(false, zzYY5.zzZ((zzZ3K) zzz5r));
            } else {
                throw new IllegalArgumentException("unknown algorithm");
            }
            return new zzZ4P<zzW>() { // from class: com.aspose.words.internal.zzYY5.zzX.2
                @Override // com.aspose.words.internal.zzZ4P
                public final zzZ41 zzXGN() {
                    return new zzYU4(zzyxr.getName(), zzyy6);
                }

                @Override // com.aspose.words.internal.zzZ4P
                public final boolean zzXh(byte[] bArr) throws zzZ5C {
                    return zzyy6.zzWX(bArr);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYT2 zzZ(final zzZ3L zzz3l) {
        return (zzYT2) AccessController.doPrivileged(new PrivilegedAction<zzYT2>() { // from class: com.aspose.words.internal.zzYY5.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXDt, reason: merged with bridge method [inline-methods] */
            public zzYT2 run() {
                return zzz3l.zzXGV().equals(zzZ.zzW7v) ? new zzYY8(zzz3l.zzXGL()) : new zzYYC(zzz3l.zzXGL());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYT2 zzZ(final zzZ3K zzz3k) {
        return (zzYT2) AccessController.doPrivileged(new PrivilegedAction<zzYT2>() { // from class: com.aspose.words.internal.zzYY5.6
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXDt, reason: merged with bridge method [inline-methods] */
            public zzYT2 run() {
                return zzz3k.zzXGV().equals(zzZ.zzW7v) ? new zzYY7(zzz3k.zzXGx()) : new zzYYB(zzz3k.zzXGx());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYT2 zzZ(final zzZ3B zzz3b) {
        return (zzYT2) AccessController.doPrivileged(new PrivilegedAction<zzYT2>() { // from class: com.aspose.words.internal.zzYY5.7
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXDt, reason: merged with bridge method [inline-methods] */
            public zzYT2 run() {
                return zzz3b.zzXGV().equals(zzZ.zzW7t) ? new zzYVF(zzz3b.zzXGL()) : new zzYVJ(zzz3b.zzXGL());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYT2 zzZ(final zzZ3A zzz3a) {
        return (zzYT2) AccessController.doPrivileged(new PrivilegedAction<zzYT2>() { // from class: com.aspose.words.internal.zzYY5.8
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXDt, reason: merged with bridge method [inline-methods] */
            public zzYT2 run() {
                return zzz3a.zzXGV().equals(zzZ.zzW7t) ? new zzYVE(zzz3a.zzXGx()) : new zzYVI(zzz3a.zzXGx());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzZ(zzYUK zzyuk, zzYVB zzyvb, zzYV3 zzyv3, zzYV3 zzyv32) {
        try {
            byte[] bArr = new byte[zzyuk.zzXCS()];
            byte[] bArr2 = new byte[zzyuk.zzXCS()];
            zzyuk.zzZ(zzyvb.zzXCO());
            zzyuk.zzZ(zzyv32, bArr);
            zzyuk.zzZ(zzyv3);
            zzyuk.zzZ(zzyvb.zzXCP(), bArr2);
            return zzYGU.zzp(bArr, bArr2);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzZ(zzYUI zzyui, zzYVB zzyvb) {
        try {
            zzyui.zzZ(true, zzyvb.zzXCO());
            byte[] bArr = data;
            zzyui.update(bArr, 0, bArr.length);
            byte[] bArrZzXEp = zzyui.zzXEp();
            zzyui.zzZ(false, zzyvb.zzXCP());
            zzyui.update(bArr, 0, bArr.length);
            return zzyui.zzWX(bArrZzXEp);
        } catch (Exception unused) {
            return false;
        }
    }
}
