package com.aspose.words.internal;

import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYYW;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYYI {
    public static final zzYXR zzWb4 = new zzYXR("ECGOST3410", zzV.ECGOST3410);
    public static final zzW zzW83 = new zzW();

    public enum zzV {
        ECGOST3410
    }

    public static final class zzW extends zzYXO {
        private final zzZ5K zzW8y;

        public zzW() {
            this(zzYW0.zzZ.zzW1U);
        }

        public final zzZ5K zzXDF() {
            return this.zzW8y;
        }

        private zzW(zzZ5K zzz5k) {
            super(zzYYI.zzWb4);
            this.zzW8y = zzz5k;
        }
    }

    public static final class zzY extends zzYXD<zzZ, zzZ3Q, zzZ3R> {
        private final zzZ2Y<zzZ33> zzW81;
        private final zzYYF zzW8p;
        private final zzYYE zzW8q;

        public zzY(zzZ zzz, SecureRandom secureRandom) {
            super(zzz);
            zzYYE zzyye = new zzYYE();
            this.zzW8q = zzyye;
            zzZ2Y<zzZ33> zzz2yZzXDA = zzz.zzXDA();
            this.zzW81 = zzz2yZzXDA;
            zzYYF zzyyf = new zzYYF(zzYYI.zzV(zzz2yZzXDA.zzXGk()), secureRandom);
            this.zzW8p = zzyyf;
            zzyye.zzZ(zzyyf);
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G<zzZ3Q, zzZ3R> zzXDI() {
            zzYVB zzyvbZzXG6 = this.zzW8q.zzXG6();
            zzYYI.zzW(zzyvbZzXG6);
            zzYSD zzysd = (zzYSD) zzyvbZzXG6.zzXCP();
            zzYSE zzyse = (zzYSE) zzyvbZzXG6.zzXCO();
            zzZ5W zzz5wZzXGV = zzXH6().zzXGV();
            return new zzZ3G<>(new zzZ3Q(zzz5wZzXGV, this.zzW81, zzysd.zzXCe()), new zzZ3R(zzz5wZzXGV, this.zzW81, zzyse.zzXCf()));
        }
    }

    public static final class zzZ extends zzYXO {
        private final zzZ2Y<zzZ33> zzWle;

        public zzZ(zzZ2Y<zzZ33> zzz2y) {
            super(zzYYI.zzWb4);
            this.zzWle = zzz2y;
        }

        public final zzZ2Y<zzZ33> zzXDA() {
            return this.zzWle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSJ zzV(zzZ33 zzz33) {
        return zzz33 instanceof zzZ2W ? new zzYSF((zzZ2W) zzz33) : new zzYSJ(zzz33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzW(zzYVB zzyvb) {
        zzYVZ.zzZ(zzWb4, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzYYI.2
            private static boolean zzX(zzYVB zzyvb2) {
                byte[] bArrDecode = zzYGC.decode("576a1f885e3420128c8a656097ba7d8bb4c6f1b1853348cf2ba976971dbdbefc");
                zzYYG zzyyg = new zzYYG();
                zzyyg.zzZ(true, new zzYS3(zzyvb2.zzXCO(), zzYVO.zzWbb));
                BigInteger[] bigIntegerArrZzX6 = zzyyg.zzX6(bArrDecode);
                zzyyg.zzZ(false, zzyvb2.zzXCP());
                zzyyg.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
                return zzyyg.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
            }

            @Override // com.aspose.words.internal.zzYRU
            public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                return zzX(zzyvb2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSE zzZ(final zzZ3R zzz3r) {
        return (zzYSE) AccessController.doPrivileged(new PrivilegedAction<zzYSE>() { // from class: com.aspose.words.internal.zzYYI.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXFd, reason: merged with bridge method [inline-methods] */
            public zzYSE run() {
                return new zzYSE(zzz3r.getS(), zzYYI.zzV(zzz3r.zzXGz().zzXGk()));
            }
        });
    }

    public static final class zzX extends zzYX7<zzW> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4R<zzW> zzU(zzZ5S zzz5s, zzW zzw) {
            zzYYG zzyyg = new zzYYG();
            zzYUX zzyuxZzZ = zzYW6.zzZ(zzw.zzXDF());
            final zzYSE zzyseZzZ = zzYYI.zzZ((zzZ3R) zzz5s);
            return new zzYYW(zzyyg, zzyuxZzZ, zzw, new zzYYW.zzZ() { // from class: com.aspose.words.internal.zzYYI.zzX.1
                @Override // com.aspose.words.internal.zzYYW.zzZ
                public final void zzZ(zzYV1 zzyv1, SecureRandom secureRandom) {
                    zzyv1.zzZ(true, new zzYS3(zzyseZzZ, secureRandom));
                }
            });
        }

        @Override // com.aspose.words.internal.zzYX7
        public final /* synthetic */ zzZ4P zzX(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzW) zzz4m);
        }

        private static zzZ4P<zzW> zzZ(zzZ5R zzz5r, zzW zzw) {
            zzYYG zzyyg = new zzYYG();
            zzYUX zzyuxZzZ = zzYW6.zzZ(zzw.zzXDF());
            zzZ3Q zzz3q = (zzZ3Q) zzz5r;
            zzyyg.zzZ(false, new zzYSD(zzz3q.zzXGA(), zzYYI.zzV(zzz3q.zzXGz().zzXGk())));
            return new zzYYV(zzyyg, zzyuxZzZ, zzw);
        }
    }
}
