package com.aspose.words.internal;

import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYYW;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYYT {
    private static byte[] zzW8u = {10, 9, 13, 6, 14, 11, 4, 5, 15, 1, 3, 12, 7, 0, 8, 2, 8, 0, 12, 4, 9, 6, 7, 11, 2, 3, 1, 15, 5, 14, 10, 13, 15, 6, 5, 8, 14, 11, 10, 4, 12, 0, 3, 7, 2, 9, 1, 13, 3, 8, 13, 9, 6, 11, 15, 0, 2, 5, 12, 10, 4, 14, 1, 7, 15, 8, 14, 9, 7, 2, 0, 13, 12, 6, 1, 5, 11, 4, 3, 10, 2, 8, 9, 7, 5, 15, 0, 11, 12, 1, 13, 14, 10, 3, 6, 4, 3, 8, 11, 5, 6, 4, 14, 10, 2, 12, 1, 7, 9, 15, 13, 0, 1, 2, 3, 14, 6, 13, 11, 8, 15, 10, 12, 5, 7, 9, 0, 4};
    public static final zzYXR zzWb4 = new zzYXR("DSTU4145", zzU.DSTU4145);
    public static final zzV zzW8t = new zzV();

    public enum zzU {
        DSTU4145
    }

    public static final class zzV extends zzYXO {
        private final zzZ5K zzW8y;

        public zzV() {
            this(zzYW0.zzZ.zzW1U);
        }

        public final zzZ5K zzXDF() {
            return this.zzW8y;
        }

        private zzV(zzZ5K zzz5k) {
            super(zzYYT.zzWb4);
            this.zzW8y = zzz5k;
        }
    }

    public static final class zzY extends zzYXD<zzZ, zzZ3S, zzZ3T> {
        private final zzYYF zzW8p;
        private final zzYYE zzW8q;
        private final zzZ34 zzWlr;

        public zzY(zzZ zzz, SecureRandom secureRandom) {
            super(zzz);
            zzYYS zzyys = new zzYYS();
            this.zzW8q = zzyys;
            zzZ34 zzz34ZzXDG = zzz.zzXDG();
            this.zzWlr = zzz34ZzXDG;
            zzYYF zzyyf = new zzYYF(zzYYT.zzV(zzz34ZzXDG.zzXGy()), secureRandom);
            this.zzW8p = zzyyf;
            zzyys.zzZ(zzyyf);
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G<zzZ3S, zzZ3T> zzXDI() {
            zzYVB zzyvbZzXG6 = this.zzW8q.zzXG6();
            zzYYT.zzW(zzyvbZzXG6);
            zzYSD zzysd = (zzYSD) zzyvbZzXG6.zzXCP();
            zzYSE zzyse = (zzYSE) zzyvbZzXG6.zzXCO();
            zzZ5W zzz5wZzXGV = zzXH6().zzXGV();
            return new zzZ3G<>(new zzZ3S(zzz5wZzXGV, this.zzWlr, zzysd.zzXCe()), new zzZ3T(zzz5wZzXGV, this.zzWlr, zzyse.zzXCf()));
        }
    }

    public static final class zzZ extends zzYXO {
        private final zzZ34 zzW8r;

        public zzZ(zzZ34 zzz34) {
            super(zzYYT.zzWb4);
            this.zzW8r = zzz34;
        }

        public final zzZ34 zzXDG() {
            return this.zzW8r;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSJ zzV(zzZ33 zzz33) {
        return zzz33 instanceof zzZ2W ? new zzYSF((zzZ2W) zzz33) : new zzYSJ(zzz33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzW(zzYVB zzyvb) {
        zzYVZ.zzZ(zzWb4, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzYYT.2
            private static boolean zzX(zzYVB zzyvb2) {
                byte[] bArrDecode = zzYGC.decode("576a1f885e3420128c8a656097ba7d8bb4c6f1b1853348cf2ba976971dbdbefc");
                zzYYR zzyyr = new zzYYR();
                zzyyr.zzZ(true, (zzYV3) new zzYS3(zzyvb2.zzXCO(), zzYVO.zzWbb));
                BigInteger[] bigIntegerArrZzX6 = zzyyr.zzX6(bArrDecode);
                zzyyr.zzZ(false, (zzYV3) zzyvb2.zzXCP());
                zzyyr.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
                return zzyyr.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
            }

            @Override // com.aspose.words.internal.zzYRU
            public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                return zzX(zzyvb2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSE zzZ(final zzZ3T zzz3t) {
        return (zzYSE) AccessController.doPrivileged(new PrivilegedAction<zzYSE>() { // from class: com.aspose.words.internal.zzYYT.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXFd, reason: merged with bridge method [inline-methods] */
            public zzYSE run() {
                return new zzYSE(zzz3t.getS(), zzYYT.zzV(zzz3t.zzXGB().zzXGy()));
            }
        });
    }

    public static final class zzW extends zzYX7<zzV> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4R<zzV> zzU(zzZ5S zzz5s, zzV zzv) {
            zzYYR zzyyr = new zzYYR();
            zzYUX zzyxs = zzv.zzW8y == zzYW0.zzZ.zzW1U ? new zzYXS(zzYYT.zzW8u) : zzYW6.zzZ(zzv.zzXDF());
            zzZ3T zzz3t = (zzZ3T) zzz5s;
            final zzYSE zzyse = new zzYSE(zzz3t.getS(), zzYYT.zzV(zzz3t.zzXGB().zzXGy()));
            return new zzYYW(zzyyr, zzyxs, zzv, new zzYYW.zzZ() { // from class: com.aspose.words.internal.zzYYT.zzW.1
                @Override // com.aspose.words.internal.zzYYW.zzZ
                public final void zzZ(zzYV1 zzyv1, SecureRandom secureRandom) {
                    zzyv1.zzZ(true, new zzYS3(zzyse, secureRandom));
                }
            });
        }

        @Override // com.aspose.words.internal.zzYX7
        public final /* synthetic */ zzZ4P zzX(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzV) zzz4m);
        }

        private static zzZ4P<zzV> zzZ(zzZ5R zzz5r, zzV zzv) {
            zzYYR zzyyr = new zzYYR();
            zzYUX zzyxs = zzv.zzW8y == zzYW0.zzZ.zzW1U ? new zzYXS(zzYYT.zzW8u) : zzYW6.zzZ(zzv.zzXDF());
            zzZ3S zzz3s = (zzZ3S) zzz5r;
            zzyyr.zzZ(false, (zzYV3) new zzYSD(zzz3s.zzXGA(), zzYYT.zzV(zzz3s.zzXGB().zzXGy())));
            return new zzYYV(zzyyr, zzyxs, zzv);
        }
    }

    public static final class zzX extends zzYX7<zzV> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4R<zzV> zzU(zzZ5S zzz5s, zzV zzv) {
            zzYYR zzyyr = new zzYYR();
            zzYUX zzyxs = zzv.zzW8y == zzYW0.zzZ.zzW1U ? new zzYXS(zzYYT.zzW8u) : zzYW6.zzZ(zzv.zzXDF());
            final zzYSE zzyseZzZ = zzYYT.zzZ((zzZ3T) zzz5s);
            return new zzYYW(zzyyr, zzyxs, zzv, new zzYYW.zzZ() { // from class: com.aspose.words.internal.zzYYT.zzX.1
                @Override // com.aspose.words.internal.zzYYW.zzZ
                public final void zzZ(zzYV1 zzyv1, SecureRandom secureRandom) {
                    zzyv1.zzZ(true, new zzYS3(zzyseZzZ, secureRandom));
                }
            }, (byte) 0);
        }

        @Override // com.aspose.words.internal.zzYX7
        public final /* synthetic */ zzZ4P zzX(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzV) zzz4m);
        }

        private static zzZ4P<zzV> zzZ(zzZ5R zzz5r, zzV zzv) {
            zzYYR zzyyr = new zzYYR();
            zzYUX zzyxs = zzv.zzW8y == zzYW0.zzZ.zzW1U ? new zzYXS(zzYYT.zzW8u) : zzYW6.zzZ(zzv.zzXDF());
            zzZ3S zzz3s = (zzZ3S) zzz5r;
            zzyyr.zzZ(false, (zzYV3) new zzYSD(zzz3s.zzXGA(), zzYYT.zzV(zzz3s.zzXGB().zzXGy())));
            return new zzYYV(zzyyr, zzyxs, zzv, true);
        }
    }
}
