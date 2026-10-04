package com.aspose.words.internal;

import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYYW;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYXT {
    public static final zzYXR zzWb4 = new zzYXR("GOST3410", zzV.GOST3410);
    public static final zzW zzW6j = new zzW();

    public enum zzV {
        GOST3410
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
            super(zzYXT.zzWb4);
            this.zzW8y = zzz5k;
        }
    }

    public static final class zzY extends zzYXD<zzZ, zzZ3H, zzZ3I> {
        private final zzYXL zzW6g;
        private final zzYXK zzW6h;
        private final zzZ2Y<zzZ2Z> zzW81;

        public zzY(zzZ zzz, SecureRandom secureRandom) {
            super(zzz);
            zzYXK zzyxk = new zzYXK();
            this.zzW6h = zzyxk;
            zzZ2Y<zzZ2Z> zzz2yZzXDA = zzz.zzXDA();
            this.zzW81 = zzz2yZzXDA;
            zzYXL zzyxl = new zzYXL(secureRandom, zzYXT.zzZ(zzz2yZzXDA));
            this.zzW6g = zzyxl;
            zzyxk.zzZ(zzyxl);
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G<zzZ3H, zzZ3I> zzXDI() {
            zzYVB zzyvbZzXG6 = this.zzW6h.zzXG6();
            zzYXT.zzW(zzyvbZzXG6);
            zzYXG zzyxg = (zzYXG) zzyvbZzXG6.zzXCP();
            zzYXH zzyxh = (zzYXH) zzyvbZzXG6.zzXCO();
            zzZ5W zzz5wZzXGV = zzXH6().zzXGV();
            return new zzZ3G<>(new zzZ3H(zzz5wZzXGV, this.zzW81, zzyxg.getY()), new zzZ3I(zzz5wZzXGV, this.zzW81, zzyxh.getX()));
        }
    }

    public static final class zzZ extends zzYXO {
        private final zzZ2Y<zzZ2Z> zzWle;

        public zzZ(zzZ2Y<zzZ2Z> zzz2y) {
            super(zzYXT.zzWb4);
            this.zzWle = zzz2y;
        }

        public final zzZ2Y<zzZ2Z> zzXDA() {
            return this.zzWle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzW(zzYVB zzyvb) {
        zzYVZ.zzZ(zzWb4, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzYXT.1
            private static boolean zzX(zzYVB zzyvb2) {
                byte[] bArrDecode = zzYGC.decode("576a1f885e3420128c8a656097ba7d8bb4c6f1b1853348cf2ba976971dbdbefc");
                zzYXF zzyxf = new zzYXF();
                zzyxf.zzZ(true, new zzYS3(zzyvb2.zzXCO(), zzYVO.zzWbb));
                BigInteger[] bigIntegerArrZzX6 = zzyxf.zzX6(bArrDecode);
                zzyxf.zzZ(false, zzyvb2.zzXCP());
                zzyxf.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
                return zzyxf.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
            }

            @Override // com.aspose.words.internal.zzYRU
            public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                return zzX(zzyvb2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYXI zzZ(zzZ2Y<zzZ2Z> zzz2y) {
        zzZ2Z zzz2zZzXGk = zzz2y.zzXGk();
        return new zzYXI(zzz2zZzXGk.getP(), zzz2zZzXGk.getQ(), zzz2zZzXGk.getA());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYXH zzZ(final zzZ3I zzz3i) {
        return (zzYXH) AccessController.doPrivileged(new PrivilegedAction<zzYXH>() { // from class: com.aspose.words.internal.zzYXT.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXDm, reason: merged with bridge method [inline-methods] */
            public zzYXH run() {
                return new zzYXH(zzz3i.getX(), zzYXT.zzZ(zzz3i.zzXGz()));
            }
        });
    }

    public static final class zzX extends zzYX7<zzW> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4R<zzW> zzU(zzZ5S zzz5s, zzW zzw) {
            zzYXF zzyxf = new zzYXF();
            zzYUX zzyuxZzZ = zzYW6.zzZ(zzw.zzXDF());
            final zzYXH zzyxhZzZ = zzYXT.zzZ((zzZ3I) zzz5s);
            return new zzYYW(zzyxf, zzyuxZzZ, zzw, new zzYYW.zzZ() { // from class: com.aspose.words.internal.zzYXT.zzX.1
                @Override // com.aspose.words.internal.zzYYW.zzZ
                public final void zzZ(zzYV1 zzyv1, SecureRandom secureRandom) {
                    zzyv1.zzZ(true, new zzYS3(zzyxhZzZ, secureRandom));
                }
            });
        }

        @Override // com.aspose.words.internal.zzYX7
        public final /* synthetic */ zzZ4P zzX(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzW) zzz4m);
        }

        private static zzZ4P<zzW> zzZ(zzZ5R zzz5r, zzW zzw) {
            zzYXF zzyxf = new zzYXF();
            zzYUX zzyuxZzZ = zzYW6.zzZ(zzw.zzXDF());
            zzZ3H zzz3h = (zzZ3H) zzz5r;
            zzyxf.zzZ(false, new zzYXG(zzz3h.getY(), zzYXT.zzZ(zzz3h.zzXGz())));
            return new zzYYV(zzyxf, zzyuxZzZ, zzw);
        }
    }
}
