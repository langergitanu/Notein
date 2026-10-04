package com.aspose.words.internal;

import com.aspose.words.internal.zzYYW;
import com.aspose.words.internal.zzZ0P;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYYX {
    public static final zzU zzW8C;
    public static final zzU zzW8D;
    public static final zzZ5W zzWb9;

    public enum zzT {
        DSA,
        DDSA
    }

    public static final class zzU extends zzYXO {
        private final zzZ5K zzW8y;

        public zzU(zzYXR zzyxr, zzZ5K zzz5k) {
            super(zzyxr);
            if (zzyxr.zzXFS() == zzT.DDSA && zzz5k == null) {
                throw new IllegalArgumentException("DDSA cannot be used with a NULL digest");
            }
            this.zzW8y = zzz5k;
        }

        public final zzU zzZ(zzZ5K zzz5k) {
            return new zzU((zzYXR) zzXGV(), zzz5k);
        }
    }

    public static final class zzW extends zzYXD<zzX, zzZ3V, zzZ3W> {
        private final zzYYM zzW8A;
        private final zzYSS zzWjr;
        private final zzZ36 zzWls;

        public zzW(zzX zzx, SecureRandom secureRandom) {
            super(zzx);
            zzYYM zzyym = new zzYYM();
            this.zzW8A = zzyym;
            zzZ36 zzz36ZzXGC = zzx.zzXGC();
            this.zzWls = zzz36ZzXGC;
            zzYSS zzyss = new zzYSS(secureRandom, zzYYX.zzY(zzz36ZzXGC));
            this.zzWjr = zzyss;
            zzyym.zzZ(zzyss);
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G<zzZ3V, zzZ3W> zzXDI() {
            zzYVB zzyvbZzXG6 = this.zzW8A.zzXG6();
            zzYYX.zzW(zzyvbZzXG6);
            zzYSN zzysn = (zzYSN) zzyvbZzXG6.zzXCP();
            zzYSO zzyso = (zzYSO) zzyvbZzXG6.zzXCO();
            zzZ5W zzz5wZzXGV = zzXH6().zzXGV();
            return new zzZ3G<>(new zzZ3V(zzz5wZzXGV, this.zzWls, zzysn.getY()), new zzZ3W(zzz5wZzXGV, this.zzWls, zzyso.getX()));
        }
    }

    public static final class zzX extends zzYXO {
        private final zzZ36 zzWls;

        public zzX(zzZ36 zzz36) {
            super(zzYYX.zzWb9);
            this.zzWls = zzz36;
        }

        public final zzZ36 zzXGC() {
            return this.zzWls;
        }
    }

    public static final class zzY {
        private final zzZ zzW8B;
        private final SecureRandom zzWk5;

        public zzY(zzZ zzz, SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                throw new zzZ0H("Attempt to create unapproved generator in approved only mode.");
            }
            this.zzW8B = zzz;
            this.zzWk5 = secureRandom;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final zzZ36 zzXFq() {
            zzYYL zzyyl = this.zzW8B.zzWk4 <= 1024 ? new zzYYL() : new zzYYL(zzYW6.zzZ(zzZ0P.zzZ.zzWdH));
            if (this.zzW8B.zzWk4 == 1024) {
                if (zzYGM.zzwd("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                    zzyyl.zzZ(this.zzW8B.zzWk4, this.zzW8B.zzWjt, this.zzWk5);
                } else {
                    zzyyl.zzZ(new zzYSQ(1024, 160, this.zzW8B.zzWjt, this.zzWk5));
                }
            } else if (this.zzW8B.zzWk4 > 1024) {
                zzyyl.zzZ(new zzYSQ(this.zzW8B.zzWk4, 256, this.zzW8B.zzWjt, this.zzWk5));
            }
            zzYSP zzyspZzXG3 = zzyyl.zzXG3();
            zzYSM zzysmZzXCm = zzyspZzXG3.zzXCm();
            return new zzZ36(zzyspZzXG3.getP(), zzyspZzXG3.getQ(), zzyspZzXG3.getG(), new zzZ35(zzysmZzXCm.getSeed(), zzysmZzXCm.zzXGp(), zzysmZzXCm.zzXGn()));
        }
    }

    public static final class zzZ extends zzYXO {
        private final int zzWjt;
        private final int zzWk4;

        public zzZ(int i) {
            this(i, zzYUL.zzf4(i));
        }

        private zzZ(int i, int i2) {
            super(zzYYX.zzWb9);
            this.zzWk4 = i;
            this.zzWjt = i2;
        }
    }

    static {
        zzZ1P zzz1p = zzZ1K.zzWjd;
        zzWb9 = zzz1p;
        zzYXR zzyxr = new zzYXR(zzz1p.getName(), zzT.DSA);
        zzZ1J zzz1j = zzZ0P.zzZ.zzWdL;
        zzW8D = new zzU(zzyxr, zzz1j);
        zzW8C = new zzU(new zzYXR(zzz1p.getName(), zzT.DDSA), zzz1j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSP zzY(zzZ36 zzz36) {
        return new zzYSP(zzz36.getP(), zzz36.getQ(), zzz36.getG());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSO zzZ(final zzZ3W zzz3w) {
        return (zzYSO) AccessController.doPrivileged(new PrivilegedAction<zzYSO>() { // from class: com.aspose.words.internal.zzYYX.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXFr, reason: merged with bridge method [inline-methods] */
            public zzYSO run() {
                return new zzYSO(zzz3w.getX(), zzYYX.zzY(zzz3w.zzXGC()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzW(zzYVB zzyvb) {
        zzYVZ.zzZ(zzWb9, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzYYX.1
            private static boolean zzX(zzYVB zzyvb2) {
                byte[] bArrDecode = zzYGC.decode("576a1f885e3420128c8a656097ba7d8bb4c6f1b1853348cf2ba976971dbdbefc");
                zzYYK zzyyk = new zzYYK(new zzYW7());
                zzyyk.zzZ(true, (zzYV3) new zzYS3(zzyvb2.zzXCO(), zzYVO.zzWbb));
                BigInteger[] bigIntegerArrZzX6 = zzyyk.zzX6(bArrDecode);
                zzyyk.zzZ(false, (zzYV3) zzyvb2.zzXCP());
                return zzyyk.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
            }

            @Override // com.aspose.words.internal.zzYRU
            public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                return zzX(zzyvb2);
            }
        });
    }

    public static final class zzV extends zzYX6<zzU> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX6
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4R<zzU> zzV(zzZ5S zzz5s, zzU zzu) {
            zzYUX zzyuxZzZ = zzu.zzW8y != null ? zzYW6.zzZ(zzu.zzW8y) : new zzYWT();
            zzYYK zzyyk = zzu.zzXGV() == zzYYX.zzW8D.zzXGV() ? new zzYYK(new zzYW7()) : new zzYYK(new zzYX1(zzYW6.zzZ(zzu.zzW8y)));
            final zzYSO zzysoZzZ = zzYYX.zzZ((zzZ3W) zzz5s);
            return new zzYYW(zzyyk, zzyuxZzZ, zzu, new zzYYW.zzZ() { // from class: com.aspose.words.internal.zzYYX.zzV.1
                @Override // com.aspose.words.internal.zzYYW.zzZ
                public final void zzZ(zzYV1 zzyv1, SecureRandom secureRandom) {
                    zzyv1.zzZ(true, new zzYS3(zzysoZzZ, secureRandom));
                }
            });
        }

        @Override // com.aspose.words.internal.zzYX6
        public final /* synthetic */ zzZ4P zzX(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzU) zzz4m);
        }

        private static zzZ4P<zzU> zzZ(zzZ5R zzz5r, zzU zzu) {
            zzYYK zzyyk;
            zzYUX zzyuxZzZ = zzu.zzW8y != null ? zzYW6.zzZ(zzu.zzW8y) : new zzYWT();
            if (zzu.zzXGV() == zzYYX.zzW8D.zzXGV()) {
                zzyyk = new zzYYK(new zzYW7());
            } else {
                zzyyk = new zzYYK(new zzYX1(zzYW6.zzZ(zzu.zzW8y)));
            }
            zzZ3V zzz3v = (zzZ3V) zzz5r;
            zzyyk.zzZ(false, (zzYV3) new zzYSN(zzz3v.getY(), zzYYX.zzY(zzz3v.zzXGC())));
            return new zzYYV(zzyyk, zzyuxZzZ, zzu);
        }
    }
}
