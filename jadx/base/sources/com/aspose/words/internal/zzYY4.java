package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ1M;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYY4 {
    public static final zzYXR zzWb4 = new zzYXR("ELGAMAL", zzR.RAW);
    private static final zzYXR zzW7j = new zzYXR("ELGAMAL/PKCS1V1.5", zzR.PKCS1v1_5);
    private static final zzYXR zzW7i = new zzYXR("ELGAMAL/OAEP", zzR.OAEP);
    public static final zzS zzW7h = new zzS();
    public static final zzW zzW7g = new zzW();
    public static final zzU zzW7f = new zzU();

    public interface zzQ extends zzZ4M {
    }

    public enum zzR {
        RAW,
        PKCS1v1_5,
        OAEP
    }

    public static final class zzS extends zzT {
        public zzS() {
            super(zzYY4.zzWb4);
        }
    }

    public static class zzT extends zzYXO {
        public zzT(zzYXR zzyxr) {
            super(zzyxr);
        }
    }

    public static final class zzU extends zzT implements zzQ {
        public zzU() {
            super(zzYY4.zzW7j);
        }
    }

    public static final class zzW extends zzT implements zzQ {
        private final zzZ5K zzW7a;
        private final zzZ5K zzW8y;
        private final byte[] zzWeL;

        /* JADX WARN: Illegal instructions before constructor call */
        public zzW() {
            zzZ1J zzz1j = zzZ0P.zzZ.zzWdL;
            this(zzz1j, zzz1j, null);
        }

        public final zzW zzW(zzZ5K zzz5k) {
            return new zzW(this.zzW8y, zzz5k, this.zzWeL);
        }

        public final zzW zzWD(byte[] bArr) {
            return new zzW(this.zzW8y, this.zzW7a, zzYGU.zzVI(bArr));
        }

        private zzW(zzZ5K zzz5k, zzZ5K zzz5k2, byte[] bArr) {
            super(zzYY4.zzW7i);
            this.zzW8y = zzz5k;
            this.zzW7a = zzz5k2;
            this.zzWeL = zzYGU.zzVI(bArr);
        }

        public final zzW zzX(zzZ5K zzz5k) {
            return new zzW(zzz5k, zzz5k, this.zzWeL);
        }
    }

    public static final class zzX implements zzZ55<zzQ, zzZ40> {

        public class zzY implements zzZ53<zzQ> {
            private final zzQ zzW7c;
            private final zzZ40 zzW7d;
            private final zzYVC zzWeU;

            /* JADX WARN: Multi-variable type inference failed */
            public zzY(zzZ40 zzz40, zzQ zzq, SecureRandom secureRandom) {
                if (!(zzq instanceof zzT)) {
                    throw new IllegalArgumentException("Unknown parameters object: ".concat(zzq.getClass().getName()));
                }
                this.zzW7d = zzz40;
                this.zzW7c = zzq;
                if (secureRandom != null) {
                    this.zzWeU = zzYY4.zzZ(true, zzz40, (zzT) zzq, secureRandom);
                } else {
                    this.zzWeU = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
            public zzZ53<zzQ> zzX(SecureRandom secureRandom) {
                return zzX.this.new zzY(this.zzW7d, this.zzW7c, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ54
            public final byte[] zzg(byte[] bArr, int i) throws zzZ4H {
                if (this.zzWeU == null) {
                    throw new IllegalStateException("KeyWrapper requires a SecureRandom");
                }
                zzYVO.zzX(this.zzW7c.zzXGV());
                try {
                    return this.zzWeU.zzy(bArr, 0, i);
                } catch (Exception e) {
                    throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to wrap key: ")), e);
                }
            }
        }

        public class zzZ implements zzZ56<zzQ> {
            private final zzQ zzW7c;
            private final zzZ40 zzW7d;
            private final zzYVC zzWeU;

            /* JADX WARN: Multi-variable type inference failed */
            public zzZ(zzZ40 zzz40, zzQ zzq, SecureRandom secureRandom) {
                if (!(zzq instanceof zzT)) {
                    throw new IllegalArgumentException("Unknown parameters object: ".concat(zzq.getClass().getName()));
                }
                this.zzW7d = zzz40;
                this.zzW7c = zzq;
                if (secureRandom != null) {
                    this.zzWeU = zzYY4.zzZ(false, zzz40, (zzT) zzq, secureRandom);
                } else {
                    this.zzWeU = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
            public zzZ56<zzQ> zzX(SecureRandom secureRandom) {
                return zzX.this.new zzZ(this.zzW7d, this.zzW7c, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ57
            public final byte[] zzh(byte[] bArr, int i) throws zzZ5B {
                if (this.zzWeU == null) {
                    throw new IllegalStateException("KeyUnwrapper requires a SecureRandom");
                }
                zzYVO.zzX(this.zzW7c.zzXGV());
                try {
                    return this.zzWeU.zzy(bArr, 0, i);
                } catch (Exception e) {
                    throw new zzZ5B(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to unwrap key: ")), e);
                }
            }
        }

        public zzX() {
            zzZ0L.isReady();
            if (zzZ5L.zzXH0()) {
                throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ55
        public zzZ56<zzQ> zzY(zzZ40 zzz40, zzQ zzq) {
            return new zzZ(zzz40, zzq, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ55
        public zzZ53<zzQ> zzZ(zzZ40 zzz40, zzQ zzq) {
            return new zzY(zzz40, zzq, null);
        }
    }

    public static final class zzY extends zzYXD<zzZ, zzZ3Y, zzZ3Z> {
        private final zzZ1M.zzP zzW7e;

        public zzY(zzZ zzz, SecureRandom secureRandom) {
            super(zzz);
            this.zzW7e = new zzZ1M.zzP(new zzZ1M.zzQ(zzz.zzWly), secureRandom);
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G<zzZ3Y, zzZ3Z> zzXDI() {
            zzZ3G<zzZ3Y, zzZ3Z> zzz3gZzXH4 = this.zzW7e.zzXH4();
            zzZ5W zzz5wZzXGV = zzXH6().zzXGV();
            zzZ3Y zzz3y = (zzZ3Y) zzz3gZzXH4.zzXGw();
            zzZ3Z zzz3z = (zzZ3Z) zzz3gZzXH4.zzXGv();
            return new zzZ3G<>(new zzZ3Y(zzz5wZzXGV, zzz3y.zzXGD(), zzz3y.getY()), new zzZ3Z(zzz5wZzXGV, zzz3z.zzXGD(), zzz3z.getX()));
        }
    }

    public static final class zzZ extends zzYXO {
        private zzZ38 zzWly;

        public zzZ(zzZ38 zzz38) {
            super(zzYY4.zzWb4);
            this.zzWly = zzz38;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzYVC zzZ(boolean z, zzZ5V zzz5v, zzT zzt, SecureRandom secureRandom) {
        zzYV3 zzyy0;
        zzYVC zzyu9;
        zzYVC zzyy3 = new zzYY3();
        if (zzz5v instanceof zzZ3Y) {
            zzZ3Y zzz3y = (zzZ3Y) zzz5v;
            zzyy0 = new zzYXZ(zzz3y.getY(), new zzYY1(zzz3y.zzXGD().getP(), zzz3y.zzXGD().getG(), zzz3y.zzXGD().getL()));
        } else {
            zzZ3Z zzz3z = (zzZ3Z) zzz5v;
            zzyy0 = new zzYY0(zzz3z.getX(), new zzYY1(zzz3z.zzXGD().getP(), zzz3z.zzXGD().getG(), zzz3z.zzXGD().getL()));
        }
        if (!zzt.zzXGV().equals(zzW7j)) {
            if (zzt.zzXGV().equals(zzW7i)) {
                zzW zzw = (zzW) zzt;
                zzyu9 = new zzYU9(zzyy3, zzYW6.zzZ(zzw.zzW8y), zzYW6.zzZ(zzw.zzW7a), zzw.zzWeL);
            }
            if (secureRandom != null) {
                zzyy0 = new zzYS3(zzyy0, secureRandom);
            }
            zzyy3.zzZ(z, zzyy0);
            return zzyy3;
        }
        zzyu9 = new zzYU8(zzyy3);
        zzyy3 = zzyu9;
        if (secureRandom != null) {
        }
        zzyy3.zzZ(z, zzyy0);
        return zzyy3;
    }

    public static final class zzV extends zzYXC<zzT> {
        @Override // com.aspose.words.internal.zzYXC
        public final /* synthetic */ zzYVC zzZ(zzZ5V zzz5v, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzYY4.zzZ(true, zzz5v, (zzT) zzz4m, secureRandom);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ5T
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4B<zzT> zzY(zzZ5V zzz5v, final zzT zzt) {
            if (!zzZ5L.zzXH0()) {
                final zzYVC zzyvcZzZ = zzYY4.zzZ(false, zzz5v, zzt, null);
                return new zzZ4B<zzT>() { // from class: com.aspose.words.internal.zzYY4.zzV.1
                    @Override // com.aspose.words.internal.zzZ4C
                    public final int zzXGI() {
                        zzYVO.zzX(zzt.zzXGV());
                        return zzyvcZzZ.zzXDX();
                    }

                    @Override // com.aspose.words.internal.zzZ4C
                    public final int zzXGJ() {
                        zzYVO.zzX(zzt.zzXGV());
                        return zzYXC.zzY(zzyvcZzZ) ? zzyvcZzZ.zzXDY() + 1 : zzyvcZzZ.zzXDY();
                    }

                    @Override // com.aspose.words.internal.zzZ4B
                    public final byte[] zzf(byte[] bArr, int i) throws zzZ5D {
                        try {
                            zzYVO.zzX(zzt.zzXGV());
                            return zzyvcZzZ.zzy(bArr, 0, i);
                        } catch (zzYUT e) {
                            throw new zzZ5D(e.getMessage(), e);
                        }
                    }
                };
            }
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", zzt.zzXGV());
        }
    }
}
