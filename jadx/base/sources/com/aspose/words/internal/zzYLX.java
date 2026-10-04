package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYLX {

    /* JADX INFO: renamed from: am */
    protected static final zzYM0[] f51156am = new zzYM0[0];
    private static SecureRandom zzWbb;

    /* JADX INFO: renamed from: an */
    protected zzYM0 f51157an;

    /* JADX INFO: renamed from: ao */
    protected zzYM0 f51158ao;

    /* JADX INFO: renamed from: ap */
    protected zzYM0[] f51159ap;

    /* JADX INFO: renamed from: aq */
    protected Map<String, zzYLP> f51160aq;
    protected zzYM1 zzWoB;

    public static class zzW extends zzY {
        public zzW(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
            super(zzym1, zzym0, zzym02);
        }

        private zzYM0 zzM(zzYM0 zzym0) {
            return zzN(zzym0.zzW(zzym0));
        }

        private static zzYM0 zzN(zzYM0 zzym0) {
            zzYM0 zzym0ZzW = zzym0.zzW(zzym0);
            return zzym0ZzW.zzW(zzym0ZzW);
        }

        private static zzYM0 zzO(zzYM0 zzym0) {
            return zzym0.zzW(zzym0).zzW(zzym0);
        }

        private zzW zzOB(boolean z) {
            zzYM0 zzym0ZzW;
            zzYM0 zzym0 = this.f51157an;
            zzYM0 zzym02 = this.f51158ao;
            zzYM0 zzym03 = this.f51159ap[0];
            zzYM0 zzym0ZzXz9 = zzXz9();
            zzYM0 zzym0ZzW2 = zzO(zzym0.zzXzy()).zzW(zzym0ZzXz9);
            zzYM0 zzym0ZzW3 = zzym02.zzW(zzym02);
            zzYM0 zzym0ZzU = zzym0ZzW3.zzU(zzym02);
            zzYM0 zzym0ZzU2 = zzym0.zzU(zzym0ZzU);
            zzYM0 zzym0ZzW4 = zzym0ZzU2.zzW(zzym0ZzU2);
            zzYM0 zzym0ZzV = zzym0ZzW2.zzXzy().zzV(zzym0ZzW4.zzW(zzym0ZzW4));
            zzYM0 zzym0ZzXzy = zzym0ZzU.zzXzy();
            zzYM0 zzym0ZzW5 = zzym0ZzXzy.zzW(zzym0ZzXzy);
            zzYM0 zzym0ZzV2 = zzym0ZzW2.zzU(zzym0ZzW4.zzV(zzym0ZzV)).zzV(zzym0ZzW5);
            if (z) {
                zzYM0 zzym0ZzU3 = zzym0ZzW5.zzU(zzym0ZzXz9);
                zzym0ZzW = zzym0ZzU3.zzW(zzym0ZzU3);
            } else {
                zzym0ZzW = null;
            }
            if (!zzym03.zzXzv()) {
                zzym0ZzW3 = zzym0ZzW3.zzU(zzym03);
            }
            return new zzW(zzXHv(), zzym0ZzV, zzym0ZzV2, new zzYM0[]{zzym0ZzW3, zzym0ZzW});
        }

        private zzYM0 zzW(zzYM0 zzym0, zzYM0 zzym02) {
            zzYM0 zzym0ZzXzK = zzXHv().zzXzK();
            if (zzym0ZzXzK.isZero() || zzym0.zzXzv()) {
                return zzym0ZzXzK;
            }
            if (zzym02 == null) {
                zzym02 = zzym0.zzXzy();
            }
            zzYM0 zzym0ZzXzy = zzym02.zzXzy();
            zzYM0 zzym0ZzXzz = zzym0ZzXzK.zzXzz();
            return zzym0ZzXzz.bitLength() < zzym0ZzXzK.bitLength() ? zzym0ZzXzy.zzU(zzym0ZzXzz).zzXzz() : zzym0ZzXzy.zzU(zzym0ZzXzK);
        }

        private zzYM0 zzXz9() {
            zzYM0[] zzym0Arr = this.f51159ap;
            zzYM0 zzym0 = zzym0Arr[1];
            if (zzym0 != null) {
                return zzym0;
            }
            zzYM0 zzym0ZzW = zzW(zzym0Arr[0], null);
            zzym0Arr[1] = zzym0ZzW;
            return zzym0ZzW;
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzR(zzYLX zzylx) {
            if (this == zzylx) {
                return zzXza();
            }
            if (zzXzd()) {
                return zzylx;
            }
            if (zzylx.zzXzd()) {
                return zzXzb();
            }
            zzYM0 zzym0 = this.f51158ao;
            if (zzym0.isZero()) {
                return zzylx;
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            int iZzXzH = zzym1ZzXHv.zzXzH();
            if (iZzXzH != 0) {
                return iZzXzH != 4 ? zzXzb().zzT(zzylx) : zzOB(false).zzT(zzylx);
            }
            zzYM0 zzym02 = this.f51157an;
            zzYM0 zzym03 = zzylx.f51157an;
            zzYM0 zzym04 = zzylx.f51158ao;
            zzYM0 zzym0ZzV = zzym03.zzV(zzym02);
            zzYM0 zzym0ZzV2 = zzym04.zzV(zzym0);
            if (zzym0ZzV.isZero()) {
                return zzym0ZzV2.isZero() ? zzXza() : this;
            }
            zzYM0 zzym0ZzXzy = zzym0ZzV.zzXzy();
            zzYM0 zzym0ZzV3 = zzym0ZzXzy.zzU(zzym02.zzW(zzym02).zzW(zzym03)).zzV(zzym0ZzV2.zzXzy());
            if (zzym0ZzV3.isZero()) {
                return zzym1ZzXHv.zzXzM();
            }
            zzYM0 zzym0ZzXzx = zzym0ZzV3.zzU(zzym0ZzV).zzXzx();
            zzYM0 zzym0ZzU = zzym0ZzV3.zzU(zzym0ZzXzx).zzU(zzym0ZzV2);
            zzYM0 zzym0ZzV4 = zzym0.zzW(zzym0).zzU(zzym0ZzXzy).zzU(zzym0ZzV).zzU(zzym0ZzXzx).zzV(zzym0ZzU);
            zzYM0 zzym0ZzW = zzym0ZzV4.zzV(zzym0ZzU).zzU(zzym0ZzU.zzW(zzym0ZzV4)).zzW(zzym03);
            return new zzW(zzym1ZzXHv, zzym0ZzW, zzym02.zzV(zzym0ZzW).zzU(zzym0ZzV4).zzV(zzym0));
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
        @Override // com.aspose.words.internal.zzYLX
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final zzYLX zzT(zzYLX zzylx) {
            char c;
            int i;
            zzYM0 zzym0ZzZ;
            zzYM0 zzym0ZzU;
            zzYM0 zzym0ZzV;
            zzYM0 zzym0;
            zzYM0[] zzym0Arr;
            if (zzXzd()) {
                return zzylx;
            }
            if (zzylx.zzXzd()) {
                return this;
            }
            if (this == zzylx) {
                return zzXzb();
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            int iZzXzH = zzym1ZzXHv.zzXzH();
            zzYM0 zzym0ZzU2 = this.f51157an;
            zzYM0 zzym0ZzU3 = this.f51158ao;
            zzYM0 zzym0ZzU4 = zzylx.f51157an;
            zzYM0 zzym0ZzU5 = zzylx.f51158ao;
            if (iZzXzH == 0) {
                zzYM0 zzym0ZzV2 = zzym0ZzU4.zzV(zzym0ZzU2);
                zzYM0 zzym0ZzV3 = zzym0ZzU5.zzV(zzym0ZzU3);
                if (zzym0ZzV2.isZero()) {
                    return zzym0ZzV3.isZero() ? zzXzb() : zzym1ZzXHv.zzXzM();
                }
                zzYM0 zzym0ZzT = zzym0ZzV3.zzT(zzym0ZzV2);
                zzYM0 zzym0ZzV4 = zzym0ZzT.zzXzy().zzV(zzym0ZzU2).zzV(zzym0ZzU4);
                return new zzW(zzym1ZzXHv, zzym0ZzV4, zzym0ZzT.zzU(zzym0ZzU2.zzV(zzym0ZzV4)).zzV(zzym0ZzU3));
            }
            if (iZzXzH == 1) {
                zzYM0 zzym0ZzU6 = this.f51159ap[0];
                zzYM0 zzym02 = zzylx.f51159ap[0];
                boolean zZzXzv = zzym0ZzU6.zzXzv();
                boolean zZzXzv2 = zzym02.zzXzv();
                if (!zZzXzv) {
                    zzym0ZzU5 = zzym0ZzU5.zzU(zzym0ZzU6);
                }
                if (!zZzXzv2) {
                    zzym0ZzU3 = zzym0ZzU3.zzU(zzym02);
                }
                zzYM0 zzym0ZzV5 = zzym0ZzU5.zzV(zzym0ZzU3);
                if (!zZzXzv) {
                    zzym0ZzU4 = zzym0ZzU4.zzU(zzym0ZzU6);
                }
                if (!zZzXzv2) {
                    zzym0ZzU2 = zzym0ZzU2.zzU(zzym02);
                }
                zzYM0 zzym0ZzV6 = zzym0ZzU4.zzV(zzym0ZzU2);
                if (zzym0ZzV6.isZero()) {
                    return zzym0ZzV5.isZero() ? zzXzb() : zzym1ZzXHv.zzXzM();
                }
                if (zZzXzv) {
                    zzym0ZzU6 = zzym02;
                } else if (!zZzXzv2) {
                    zzym0ZzU6 = zzym0ZzU6.zzU(zzym02);
                }
                zzYM0 zzym0ZzXzy = zzym0ZzV6.zzXzy();
                zzYM0 zzym0ZzU7 = zzym0ZzXzy.zzU(zzym0ZzV6);
                zzYM0 zzym0ZzU8 = zzym0ZzXzy.zzU(zzym0ZzU2);
                zzYM0 zzym0ZzV7 = zzym0ZzV5.zzXzy().zzU(zzym0ZzU6).zzV(zzym0ZzU7).zzV(zzym0ZzU8.zzW(zzym0ZzU8));
                return new zzW(zzym1ZzXHv, zzym0ZzV6.zzU(zzym0ZzV7), zzym0ZzU8.zzV(zzym0ZzV7).zzZ(zzym0ZzV5, zzym0ZzU3, zzym0ZzU7), new zzYM0[]{zzym0ZzU7.zzU(zzym0ZzU6)});
            }
            if (iZzXzH != 2 && iZzXzH != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            zzYM0 zzym03 = this.f51159ap[0];
            zzYM0 zzym04 = zzylx.f51159ap[0];
            boolean zZzXzv3 = zzym03.zzXzv();
            if (zZzXzv3 || !zzym03.equals(zzym04)) {
                if (!zZzXzv3) {
                    zzYM0 zzym0ZzXzy2 = zzym03.zzXzy();
                    zzym0ZzU4 = zzym0ZzXzy2.zzU(zzym0ZzU4);
                    zzym0ZzU5 = zzym0ZzXzy2.zzU(zzym03).zzU(zzym0ZzU5);
                }
                boolean zZzXzv4 = zzym04.zzXzv();
                if (zZzXzv4) {
                    c = 0;
                } else {
                    c = 0;
                    zzYM0 zzym0ZzXzy3 = zzym04.zzXzy();
                    zzym0ZzU2 = zzym0ZzXzy3.zzU(zzym0ZzU2);
                    zzym0ZzU3 = zzym0ZzXzy3.zzU(zzym04).zzU(zzym0ZzU3);
                }
                zzYM0 zzym0ZzV8 = zzym0ZzU2.zzV(zzym0ZzU4);
                zzYM0 zzym0ZzV9 = zzym0ZzU3.zzV(zzym0ZzU5);
                if (zzym0ZzV8.isZero()) {
                    return zzym0ZzV9.isZero() ? zzXzb() : zzym1ZzXHv.zzXzM();
                }
                zzYM0 zzym0ZzXzy4 = zzym0ZzV8.zzXzy();
                zzYM0 zzym0ZzU9 = zzym0ZzXzy4.zzU(zzym0ZzV8);
                zzYM0 zzym0ZzU10 = zzym0ZzXzy4.zzU(zzym0ZzU2);
                i = 1;
                zzYM0 zzym0ZzV10 = zzym0ZzV9.zzXzy().zzW(zzym0ZzU9).zzV(zzym0ZzU10.zzW(zzym0ZzU10));
                zzym0ZzZ = zzym0ZzU10.zzV(zzym0ZzV10).zzZ(zzym0ZzV9, zzym0ZzU9, zzym0ZzU3);
                zzYM0 zzym0ZzU11 = !zZzXzv3 ? zzym0ZzV8.zzU(zzym03) : zzym0ZzV8;
                zzym0ZzU = !zZzXzv4 ? zzym0ZzU11.zzU(zzym04) : zzym0ZzU11;
                if (zzym0ZzU == zzym0ZzV8) {
                    zzym0ZzV = zzym0ZzV10;
                    zzym0 = zzym0ZzXzy4;
                    if (iZzXzH != 4) {
                        zzYM0 zzym0ZzW = zzW(zzym0ZzU, zzym0);
                        zzym0Arr = new zzYM0[2];
                        zzym0Arr[c] = zzym0ZzU;
                        zzym0Arr[i] = zzym0ZzW;
                    } else {
                        zzym0Arr = new zzYM0[i];
                        zzym0Arr[c] = zzym0ZzU;
                    }
                    return new zzW(zzym1ZzXHv, zzym0ZzV, zzym0ZzZ, zzym0Arr);
                }
                zzym0ZzV = zzym0ZzV10;
            } else {
                zzYM0 zzym0ZzV11 = zzym0ZzU2.zzV(zzym0ZzU4);
                zzYM0 zzym0ZzV12 = zzym0ZzU3.zzV(zzym0ZzU5);
                if (zzym0ZzV11.isZero()) {
                    return zzym0ZzV12.isZero() ? zzXzb() : zzym1ZzXHv.zzXzM();
                }
                zzYM0 zzym0ZzXzy5 = zzym0ZzV11.zzXzy();
                zzYM0 zzym0ZzU12 = zzym0ZzU2.zzU(zzym0ZzXzy5);
                zzYM0 zzym0ZzU13 = zzym0ZzU4.zzU(zzym0ZzXzy5);
                zzYM0 zzym0ZzU14 = zzym0ZzU12.zzV(zzym0ZzU13).zzU(zzym0ZzU3);
                zzym0ZzV = zzym0ZzV12.zzXzy().zzV(zzym0ZzU12).zzV(zzym0ZzU13);
                zzym0ZzZ = zzym0ZzU12.zzV(zzym0ZzV).zzU(zzym0ZzV12).zzV(zzym0ZzU14);
                zzym0ZzU = zzym0ZzV11.zzU(zzym03);
                i = 1;
                c = 0;
            }
            zzym0 = null;
            if (iZzXzH != 4) {
            }
            return new zzW(zzym1ZzXHv, zzym0ZzV, zzym0ZzZ, zzym0Arr);
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzXza() {
            if (!zzXzd()) {
                zzYM0 zzym0 = this.f51158ao;
                if (!zzym0.isZero()) {
                    zzYM1 zzym1ZzXHv = zzXHv();
                    int iZzXzH = zzym1ZzXHv.zzXzH();
                    if (iZzXzH != 0) {
                        return iZzXzH != 4 ? zzXzb().zzT(this) : zzOB(false).zzT(this);
                    }
                    zzYM0 zzym02 = this.f51157an;
                    zzYM0 zzym0ZzW = zzym0.zzW(zzym0);
                    zzYM0 zzym0ZzXzy = zzym0ZzW.zzXzy();
                    zzYM0 zzym0ZzW2 = zzO(zzym02.zzXzy()).zzW(zzXHv().zzXzK());
                    zzYM0 zzym0ZzV = zzO(zzym02).zzU(zzym0ZzXzy).zzV(zzym0ZzW2.zzXzy());
                    if (zzym0ZzV.isZero()) {
                        return zzXHv().zzXzM();
                    }
                    zzYM0 zzym0ZzXzx = zzym0ZzV.zzU(zzym0ZzW).zzXzx();
                    zzYM0 zzym0ZzU = zzym0ZzV.zzU(zzym0ZzXzx).zzU(zzym0ZzW2);
                    zzYM0 zzym0ZzV2 = zzym0ZzXzy.zzXzy().zzU(zzym0ZzXzx).zzV(zzym0ZzU);
                    zzYM0 zzym0ZzW3 = zzym0ZzV2.zzV(zzym0ZzU).zzU(zzym0ZzU.zzW(zzym0ZzV2)).zzW(zzym02);
                    return new zzW(zzym1ZzXHv, zzym0ZzW3, zzym02.zzV(zzym0ZzW3).zzU(zzym0ZzV2).zzV(zzym0));
                }
            }
            return this;
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzXzb() {
            zzYM0 zzym0ZzV;
            zzYM0 zzym0ZzW;
            if (zzXzd()) {
                return this;
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            zzYM0 zzym0 = this.f51158ao;
            if (zzym0.isZero()) {
                return zzym1ZzXHv.zzXzM();
            }
            int iZzXzH = zzym1ZzXHv.zzXzH();
            zzYM0 zzym02 = this.f51157an;
            if (iZzXzH == 0) {
                zzYM0 zzym0ZzT = zzO(zzym02.zzXzy()).zzW(zzXHv().zzXzK()).zzT(zzym0.zzW(zzym0));
                zzYM0 zzym0ZzV2 = zzym0ZzT.zzXzy().zzV(zzym02.zzW(zzym02));
                return new zzW(zzym1ZzXHv, zzym0ZzV2, zzym0ZzT.zzU(zzym02.zzV(zzym0ZzV2)).zzV(zzym0));
            }
            if (iZzXzH == 1) {
                zzYM0 zzym03 = this.f51159ap[0];
                boolean zZzXzv = zzym03.zzXzv();
                zzYM0 zzym0ZzXzK = zzym1ZzXHv.zzXzK();
                if (!zzym0ZzXzK.isZero() && !zZzXzv) {
                    zzym0ZzXzK = zzym0ZzXzK.zzU(zzym03.zzXzy());
                }
                zzYM0 zzym0ZzW2 = zzym0ZzXzK.zzW(zzO(zzym02.zzXzy()));
                zzYM0 zzym0ZzU = zZzXzv ? zzym0 : zzym0.zzU(zzym03);
                zzYM0 zzym0ZzXzy = zZzXzv ? zzym0.zzXzy() : zzym0ZzU.zzU(zzym0);
                zzYM0 zzym0ZzU2 = zzym02.zzU(zzym0ZzXzy);
                zzYM0 zzym0ZzW3 = zzym0ZzU2.zzW(zzym0ZzU2);
                zzYM0 zzym0ZzW4 = zzym0ZzW3.zzW(zzym0ZzW3);
                zzYM0 zzym0ZzV3 = zzym0ZzW2.zzXzy().zzV(zzym0ZzW4.zzW(zzym0ZzW4));
                zzYM0 zzym0ZzW5 = zzym0ZzU.zzW(zzym0ZzU);
                zzYM0 zzym0ZzU3 = zzym0ZzV3.zzU(zzym0ZzW5);
                zzYM0 zzym0ZzW6 = zzym0ZzXzy.zzW(zzym0ZzXzy);
                zzYM0 zzym0ZzU4 = zzym0ZzW4.zzV(zzym0ZzV3).zzU(zzym0ZzW2);
                zzYM0 zzym0ZzXzy2 = zzym0ZzW6.zzXzy();
                zzYM0 zzym0ZzV4 = zzym0ZzU4.zzV(zzym0ZzXzy2.zzW(zzym0ZzXzy2));
                zzYM0 zzym0ZzW7 = zZzXzv ? zzym0ZzW6.zzW(zzym0ZzW6) : zzym0ZzW5.zzXzy();
                return new zzW(zzym1ZzXHv, zzym0ZzU3, zzym0ZzV4, new zzYM0[]{zzym0ZzW7.zzW(zzym0ZzW7).zzU(zzym0ZzU)});
            }
            if (iZzXzH != 2) {
                if (iZzXzH == 4) {
                    return zzOB(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            zzYM0 zzym04 = this.f51159ap[0];
            boolean zZzXzv2 = zzym04.zzXzv();
            zzYM0 zzym0ZzXzy3 = zzym0.zzXzy();
            zzYM0 zzym0ZzXzy4 = zzym0ZzXzy3.zzXzy();
            zzYM0 zzym0ZzXzK2 = zzym1ZzXHv.zzXzK();
            zzYM0 zzym0ZzXzz = zzym0ZzXzK2.zzXzz();
            if (zzym0ZzXzz.toBigInteger().equals(BigInteger.valueOf(3L))) {
                zzYM0 zzym0ZzXzy5 = zZzXzv2 ? zzym04 : zzym04.zzXzy();
                zzym0ZzV = zzO(zzym02.zzW(zzym0ZzXzy5).zzU(zzym02.zzV(zzym0ZzXzy5)));
                zzYM0 zzym0ZzU5 = zzym0ZzXzy3.zzU(zzym02);
                zzYM0 zzym0ZzW8 = zzym0ZzU5.zzW(zzym0ZzU5);
                zzym0ZzW = zzym0ZzW8.zzW(zzym0ZzW8);
            } else {
                zzYM0 zzym0ZzO = zzO(zzym02.zzXzy());
                if (zZzXzv2) {
                    zzym0ZzV = zzym0ZzO.zzW(zzym0ZzXzK2);
                } else if (zzym0ZzXzK2.isZero()) {
                    zzym0ZzV = zzym0ZzO;
                } else {
                    zzYM0 zzym0ZzXzy6 = zzym04.zzXzy().zzXzy();
                    zzym0ZzV = zzym0ZzXzz.bitLength() < zzym0ZzXzK2.bitLength() ? zzym0ZzO.zzV(zzym0ZzXzy6.zzU(zzym0ZzXzz)) : zzym0ZzO.zzW(zzym0ZzXzy6.zzU(zzym0ZzXzK2));
                }
                zzYM0 zzym0ZzU6 = zzym02.zzU(zzym0ZzXzy3);
                zzYM0 zzym0ZzW9 = zzym0ZzU6.zzW(zzym0ZzU6);
                zzym0ZzW = zzym0ZzW9.zzW(zzym0ZzW9);
            }
            zzYM0 zzym0ZzV5 = zzym0ZzV.zzXzy().zzV(zzym0ZzW.zzW(zzym0ZzW));
            zzYM0 zzym0ZzV6 = zzym0ZzW.zzV(zzym0ZzV5).zzU(zzym0ZzV).zzV(zzM(zzym0ZzXzy4));
            zzYM0 zzym0ZzW10 = zzym0.zzW(zzym0);
            if (!zZzXzv2) {
                zzym0ZzW10 = zzym0ZzW10.zzU(zzym04);
            }
            return new zzW(zzym1ZzXHv, zzym0ZzV5, zzym0ZzV6, new zzYM0[]{zzym0ZzW10});
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzXzc() {
            if (zzXzd()) {
                return this;
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            return zzym1ZzXHv.zzXzH() != 0 ? new zzW(zzym1ZzXHv, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap) : new zzW(zzym1ZzXHv, this.f51157an, this.f51158ao.zzXzz());
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzeP(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (i == 0 || zzXzd()) {
                return this;
            }
            if (i == 1) {
                return zzXzb();
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            zzYM0 zzym0ZzV = this.f51158ao;
            if (zzym0ZzV.isZero()) {
                return zzym1ZzXHv.zzXzM();
            }
            int iZzXzH = zzym1ZzXHv.zzXzH();
            zzYM0 zzym0ZzXzK = zzym1ZzXHv.zzXzK();
            zzYM0 zzym0ZzU = this.f51157an;
            zzYM0[] zzym0Arr = this.f51159ap;
            int i2 = 0;
            zzYM0 zzym0ZzP = zzym0Arr.length <= 0 ? zzym1ZzXHv.zzP(zzYM2.ONE) : zzym0Arr[0];
            if (!zzym0ZzP.zzXzv() && iZzXzH != 0) {
                if (iZzXzH == 1) {
                    zzYM0 zzym0ZzXzy = zzym0ZzP.zzXzy();
                    zzym0ZzU = zzym0ZzU.zzU(zzym0ZzP);
                    zzym0ZzV = zzym0ZzV.zzU(zzym0ZzXzy);
                    zzym0ZzXzK = zzW(zzym0ZzP, zzym0ZzXzy);
                } else if (iZzXzH == 2) {
                    zzym0ZzXzK = zzW(zzym0ZzP, null);
                } else {
                    if (iZzXzH != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    zzym0ZzXzK = zzXz9();
                }
            }
            while (i2 < i) {
                if (zzym0ZzV.isZero()) {
                    return zzym1ZzXHv.zzXzM();
                }
                zzYM0 zzym0ZzO = zzO(zzym0ZzU.zzXzy());
                zzYM0 zzym0ZzW = zzym0ZzV.zzW(zzym0ZzV);
                zzYM0 zzym0ZzU2 = zzym0ZzW.zzU(zzym0ZzV);
                zzYM0 zzym0ZzU3 = zzym0ZzU.zzU(zzym0ZzU2);
                zzYM0 zzym0ZzW2 = zzym0ZzU3.zzW(zzym0ZzU3);
                zzYM0 zzym0ZzXzy2 = zzym0ZzU2.zzXzy();
                zzYM0 zzym0ZzW3 = zzym0ZzXzy2.zzW(zzym0ZzXzy2);
                if (!zzym0ZzXzK.isZero()) {
                    zzym0ZzO = zzym0ZzO.zzW(zzym0ZzXzK);
                    zzYM0 zzym0ZzU4 = zzym0ZzW3.zzU(zzym0ZzXzK);
                    zzym0ZzXzK = zzym0ZzU4.zzW(zzym0ZzU4);
                }
                zzYM0 zzym0ZzV2 = zzym0ZzO.zzXzy().zzV(zzym0ZzW2.zzW(zzym0ZzW2));
                zzym0ZzV = zzym0ZzO.zzU(zzym0ZzW2.zzV(zzym0ZzV2)).zzV(zzym0ZzW3);
                zzym0ZzP = zzym0ZzP.zzXzv() ? zzym0ZzW : zzym0ZzW.zzU(zzym0ZzP);
                i2++;
                zzym0ZzU = zzym0ZzV2;
            }
            if (iZzXzH == 0) {
                zzYM0 zzym0ZzXzx = zzym0ZzP.zzXzx();
                zzYM0 zzym0ZzXzy3 = zzym0ZzXzx.zzXzy();
                return new zzW(zzym1ZzXHv, zzym0ZzU.zzU(zzym0ZzXzy3), zzym0ZzV.zzU(zzym0ZzXzy3.zzU(zzym0ZzXzx)));
            }
            if (iZzXzH == 1) {
                return new zzW(zzym1ZzXHv, zzym0ZzU.zzU(zzym0ZzP), zzym0ZzV, new zzYM0[]{zzym0ZzP.zzU(zzym0ZzP.zzXzy())});
            }
            if (iZzXzH == 2) {
                return new zzW(zzym1ZzXHv, zzym0ZzU, zzym0ZzV, new zzYM0[]{zzym0ZzP});
            }
            if (iZzXzH == 4) {
                return new zzW(zzym1ZzXHv, zzym0ZzU, zzym0ZzV, new zzYM0[]{zzym0ZzP, zzym0ZzXzK});
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYM0 zzeQ(int i) {
            return (i == 1 && 4 == zzXzo()) ? zzXz9() : super.zzeQ(i);
        }

        public zzW(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
            super(zzym1, zzym0, zzym02, zzym0Arr);
        }
    }

    public static class zzX extends zzZ {
        public zzX(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
            super(zzym1, zzym0, zzym02);
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzR(zzYLX zzylx) {
            if (zzXzd()) {
                return zzylx;
            }
            if (zzylx.zzXzd()) {
                return zzXzb();
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            zzYM0 zzym0 = this.f51157an;
            if (zzym0.isZero()) {
                return zzylx;
            }
            if (zzym1ZzXHv.zzXzH() != 6) {
                return zzXzb().zzT(zzylx);
            }
            zzYM0 zzym02 = zzylx.f51157an;
            zzYM0 zzym03 = zzylx.f51159ap[0];
            if (zzym02.isZero() || !zzym03.zzXzv()) {
                return zzXzb().zzT(zzylx);
            }
            zzYM0 zzym04 = this.f51158ao;
            zzYM0 zzym05 = this.f51159ap[0];
            zzYM0 zzym06 = zzylx.f51158ao;
            zzYM0 zzym0ZzXzy = zzym0.zzXzy();
            zzYM0 zzym0ZzXzy2 = zzym04.zzXzy();
            zzYM0 zzym0ZzXzy3 = zzym05.zzXzy();
            zzYM0 zzym0ZzW = zzym1ZzXHv.zzXzK().zzU(zzym0ZzXzy3).zzW(zzym0ZzXzy2).zzW(zzym04.zzU(zzym05));
            zzYM0 zzym0ZzXzA = zzym06.zzXzA();
            zzYM0 zzym0ZzY = zzym1ZzXHv.zzXzK().zzW(zzym0ZzXzA).zzU(zzym0ZzXzy3).zzW(zzym0ZzXzy2).zzY(zzym0ZzW, zzym0ZzXzy, zzym0ZzXzy3);
            zzYM0 zzym0ZzU = zzym02.zzU(zzym0ZzXzy3);
            zzYM0 zzym0ZzXzy4 = zzym0ZzU.zzW(zzym0ZzW).zzXzy();
            if (zzym0ZzXzy4.isZero()) {
                return zzym0ZzY.isZero() ? zzylx.zzXzb() : zzym1ZzXHv.zzXzM();
            }
            if (zzym0ZzY.isZero()) {
                return new zzX(zzym1ZzXHv, zzym0ZzY, zzym1ZzXHv.zzXzJ().zzXzw());
            }
            zzYM0 zzym0ZzU2 = zzym0ZzY.zzXzy().zzU(zzym0ZzU);
            zzYM0 zzym0ZzU3 = zzym0ZzY.zzU(zzym0ZzXzy4).zzU(zzym0ZzXzy3);
            return new zzX(zzym1ZzXHv, zzym0ZzU2, zzym0ZzY.zzW(zzym0ZzXzy4).zzXzy().zzY(zzym0ZzW, zzym0ZzXzA, zzym0ZzU3), new zzYM0[]{zzym0ZzU3});
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzT(zzYLX zzylx) {
            zzYM0 zzym0ZzU;
            zzYM0 zzym0ZzU2;
            zzYM0 zzym0ZzU3;
            zzYM0 zzym0ZzP;
            zzYM0 zzym0ZzW;
            zzYM0 zzym0ZzW2;
            if (zzXzd()) {
                return zzylx;
            }
            if (zzylx.zzXzd()) {
                return this;
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            int iZzXzH = zzym1ZzXHv.zzXzH();
            zzYM0 zzym0ZzU4 = this.f51157an;
            zzYM0 zzym0 = zzylx.f51157an;
            if (iZzXzH == 0) {
                zzYM0 zzym02 = this.f51158ao;
                zzYM0 zzym03 = zzylx.f51158ao;
                zzYM0 zzym0ZzW3 = zzym0ZzU4.zzW(zzym0);
                zzYM0 zzym0ZzW4 = zzym02.zzW(zzym03);
                if (zzym0ZzW3.isZero()) {
                    return zzym0ZzW4.isZero() ? zzXzb() : zzym1ZzXHv.zzXzM();
                }
                zzYM0 zzym0ZzT = zzym0ZzW4.zzT(zzym0ZzW3);
                zzYM0 zzym0ZzW5 = androidx.concurrent.futures.OooO00o.OooO00o(zzym0ZzT, zzym0ZzT, zzym0ZzW3).zzW(zzym1ZzXHv.zzXzK());
                return new zzX(zzym1ZzXHv, zzym0ZzW5, zzym0ZzT.zzU(zzym0ZzU4.zzW(zzym0ZzW5)).zzW(zzym0ZzW5).zzW(zzym02));
            }
            if (iZzXzH == 1) {
                zzYM0 zzym04 = this.f51158ao;
                zzYM0 zzym0ZzU5 = this.f51159ap[0];
                zzYM0 zzym05 = zzylx.f51158ao;
                zzYM0 zzym06 = zzylx.f51159ap[0];
                boolean zZzXzv = zzym06.zzXzv();
                zzYM0 zzym0ZzW6 = zzym0ZzU5.zzU(zzym05).zzW(zZzXzv ? zzym04 : zzym04.zzU(zzym06));
                zzYM0 zzym0ZzW7 = zzym0ZzU5.zzU(zzym0).zzW(zZzXzv ? zzym0ZzU4 : zzym0ZzU4.zzU(zzym06));
                if (zzym0ZzW7.isZero()) {
                    return zzym0ZzW6.isZero() ? zzXzb() : zzym1ZzXHv.zzXzM();
                }
                zzYM0 zzym0ZzXzy = zzym0ZzW7.zzXzy();
                zzYM0 zzym0ZzU6 = zzym0ZzXzy.zzU(zzym0ZzW7);
                if (!zZzXzv) {
                    zzym0ZzU5 = zzym0ZzU5.zzU(zzym06);
                }
                zzYM0 zzym0ZzW8 = zzym0ZzW6.zzW(zzym0ZzW7);
                zzYM0 zzym0ZzW9 = zzym0ZzW8.zzY(zzym0ZzW6, zzym0ZzXzy, zzym1ZzXHv.zzXzK()).zzU(zzym0ZzU5).zzW(zzym0ZzU6);
                zzYM0 zzym0ZzU7 = zzym0ZzW7.zzU(zzym0ZzW9);
                if (!zZzXzv) {
                    zzym0ZzXzy = zzym0ZzXzy.zzU(zzym06);
                }
                return new zzX(zzym1ZzXHv, zzym0ZzU7, zzym0ZzW6.zzY(zzym0ZzU4, zzym0ZzW7, zzym04).zzY(zzym0ZzXzy, zzym0ZzW8, zzym0ZzW9), new zzYM0[]{zzym0ZzU6.zzU(zzym0ZzU5)});
            }
            if (iZzXzH != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (zzym0ZzU4.isZero()) {
                return zzym0.isZero() ? zzym1ZzXHv.zzXzM() : zzylx.zzT(this);
            }
            zzYM0 zzym07 = this.f51158ao;
            zzYM0 zzym08 = this.f51159ap[0];
            zzYM0 zzym09 = zzylx.f51158ao;
            zzYM0 zzym010 = zzylx.f51159ap[0];
            boolean zZzXzv2 = zzym08.zzXzv();
            if (zZzXzv2) {
                zzym0ZzU = zzym0;
                zzym0ZzU2 = zzym09;
            } else {
                zzym0ZzU = zzym0.zzU(zzym08);
                zzym0ZzU2 = zzym09.zzU(zzym08);
            }
            boolean zZzXzv3 = zzym010.zzXzv();
            if (zZzXzv3) {
                zzym0ZzU3 = zzym07;
            } else {
                zzym0ZzU4 = zzym0ZzU4.zzU(zzym010);
                zzym0ZzU3 = zzym07.zzU(zzym010);
            }
            zzYM0 zzym0ZzW10 = zzym0ZzU3.zzW(zzym0ZzU2);
            zzYM0 zzym0ZzW11 = zzym0ZzU4.zzW(zzym0ZzU);
            if (zzym0ZzW11.isZero()) {
                return zzym0ZzW10.isZero() ? zzXzb() : zzym1ZzXHv.zzXzM();
            }
            if (zzym0.isZero()) {
                zzYLX zzylxZzXze = zzXze();
                zzYM0 zzym0ZzXzl = zzylxZzXze.zzXzl();
                zzYM0 zzym0ZzXzk = zzylxZzXze.zzXzk();
                zzYM0 zzym0ZzT2 = zzym0ZzXzk.zzW(zzym09).zzT(zzym0ZzXzl);
                zzym0ZzW2 = androidx.concurrent.futures.OooO00o.OooO00o(zzym0ZzT2, zzym0ZzT2, zzym0ZzXzl).zzW(zzym1ZzXHv.zzXzK());
                if (zzym0ZzW2.isZero()) {
                    return new zzX(zzym1ZzXHv, zzym0ZzW2, zzym1ZzXHv.zzXzJ().zzXzw());
                }
                zzym0ZzW = zzym0ZzT2.zzU(zzym0ZzXzl.zzW(zzym0ZzW2)).zzW(zzym0ZzW2).zzW(zzym0ZzXzk).zzT(zzym0ZzW2).zzW(zzym0ZzW2);
                zzym0ZzP = zzym1ZzXHv.zzP(zzYM2.ONE);
            } else {
                zzYM0 zzym0ZzXzy2 = zzym0ZzW11.zzXzy();
                zzYM0 zzym0ZzU8 = zzym0ZzW10.zzU(zzym0ZzU4);
                zzYM0 zzym0ZzU9 = zzym0ZzW10.zzU(zzym0ZzU);
                zzYM0 zzym0ZzU10 = zzym0ZzU8.zzU(zzym0ZzU9);
                if (zzym0ZzU10.isZero()) {
                    return new zzX(zzym1ZzXHv, zzym0ZzU10, zzym1ZzXHv.zzXzJ().zzXzw());
                }
                zzYM0 zzym0ZzU11 = zzym0ZzW10.zzU(zzym0ZzXzy2);
                zzYM0 zzym0ZzU12 = !zZzXzv3 ? zzym0ZzU11.zzU(zzym010) : zzym0ZzU11;
                zzYM0 zzym0ZzY = zzym0ZzU9.zzW(zzym0ZzXzy2).zzY(zzym0ZzU12, zzym07.zzW(zzym08));
                if (!zZzXzv2) {
                    zzym0ZzU12 = zzym0ZzU12.zzU(zzym08);
                }
                zzym0ZzP = zzym0ZzU12;
                zzym0ZzW = zzym0ZzY;
                zzym0ZzW2 = zzym0ZzU10;
            }
            return new zzX(zzym1ZzXHv, zzym0ZzW2, zzym0ZzW, new zzYM0[]{zzym0ZzP});
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzXzb() {
            zzYM0 zzym0ZzW;
            if (zzXzd()) {
                return this;
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            zzYM0 zzym0ZzU = this.f51157an;
            if (zzym0ZzU.isZero()) {
                return zzym1ZzXHv.zzXzM();
            }
            int iZzXzH = zzym1ZzXHv.zzXzH();
            if (iZzXzH == 0) {
                zzYM0 zzym0ZzW2 = this.f51158ao.zzT(zzym0ZzU).zzW(zzym0ZzU);
                zzYM0 zzym0ZzW3 = zzym0ZzW2.zzXzy().zzW(zzym0ZzW2).zzW(zzym1ZzXHv.zzXzK());
                return new zzX(zzym1ZzXHv, zzym0ZzW3, zzym0ZzU.zzY(zzym0ZzW3, zzym0ZzW2.zzXzA()));
            }
            if (iZzXzH == 1) {
                zzYM0 zzym0ZzU2 = this.f51158ao;
                zzYM0 zzym0 = this.f51159ap[0];
                boolean zZzXzv = zzym0.zzXzv();
                zzYM0 zzym0ZzU3 = zZzXzv ? zzym0ZzU : zzym0ZzU.zzU(zzym0);
                if (!zZzXzv) {
                    zzym0ZzU2 = zzym0ZzU2.zzU(zzym0);
                }
                zzYM0 zzym0ZzXzy = zzym0ZzU.zzXzy();
                zzYM0 zzym0ZzW4 = zzym0ZzXzy.zzW(zzym0ZzU2);
                zzYM0 zzym0ZzXzy2 = zzym0ZzU3.zzXzy();
                zzYM0 zzym0ZzW5 = zzym0ZzW4.zzW(zzym0ZzU3);
                zzYM0 zzym0ZzY = zzym0ZzW5.zzY(zzym0ZzW4, zzym0ZzXzy2, zzym1ZzXHv.zzXzK());
                return new zzX(zzym1ZzXHv, zzym0ZzU3.zzU(zzym0ZzY), zzym0ZzXzy.zzXzy().zzY(zzym0ZzU3, zzym0ZzY, zzym0ZzW5), new zzYM0[]{zzym0ZzU3.zzU(zzym0ZzXzy2)});
            }
            if (iZzXzH != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            zzYM0 zzym02 = this.f51158ao;
            zzYM0 zzym03 = this.f51159ap[0];
            boolean zZzXzv2 = zzym03.zzXzv();
            zzYM0 zzym0ZzU4 = zZzXzv2 ? zzym02 : zzym02.zzU(zzym03);
            zzYM0 zzym0ZzXzy3 = zZzXzv2 ? zzym03 : zzym03.zzXzy();
            zzYM0 zzym0ZzXzK = zzym1ZzXHv.zzXzK();
            zzYM0 zzym0ZzU5 = zZzXzv2 ? zzym0ZzXzK : zzym0ZzXzK.zzU(zzym0ZzXzy3);
            zzYM0 zzym0OooO00o = androidx.concurrent.futures.OooO00o.OooO00o(zzym02, zzym0ZzU4, zzym0ZzU5);
            if (zzym0OooO00o.isZero()) {
                return new zzX(zzym1ZzXHv, zzym0OooO00o, zzym1ZzXHv.zzXzJ().zzXzw());
            }
            zzYM0 zzym0ZzXzy4 = zzym0OooO00o.zzXzy();
            zzYM0 zzym0ZzU6 = zZzXzv2 ? zzym0OooO00o : zzym0OooO00o.zzU(zzym0ZzXzy3);
            zzYM0 zzym0ZzXzJ = zzym1ZzXHv.zzXzJ();
            if (zzym0ZzXzJ.bitLength() < (zzym1ZzXHv.getFieldSize() >> 1)) {
                zzYM0 zzym0ZzXzy5 = zzym02.zzW(zzym0ZzU).zzXzy();
                zzym0ZzW = zzym0ZzXzy5.zzW(zzym0OooO00o).zzW(zzym0ZzXzy3).zzU(zzym0ZzXzy5).zzW(zzym0ZzXzJ.zzXzv() ? zzym0ZzU5.zzW(zzym0ZzXzy3).zzXzy() : zzym0ZzU5.zzY(zzym0ZzXzJ, zzym0ZzXzy3.zzXzy())).zzW(zzym0ZzXzy4);
                if (zzym0ZzXzK.isZero()) {
                    zzym0ZzW = zzym0ZzW.zzW(zzym0ZzU6);
                } else if (!zzym0ZzXzK.zzXzv()) {
                    zzym0ZzW = zzym0ZzW.zzW(zzym0ZzXzK.zzXzA().zzU(zzym0ZzU6));
                }
            } else {
                if (!zZzXzv2) {
                    zzym0ZzU = zzym0ZzU.zzU(zzym03);
                }
                zzym0ZzW = zzym0ZzU.zzY(zzym0OooO00o, zzym0ZzU4).zzW(zzym0ZzXzy4).zzW(zzym0ZzU6);
            }
            return new zzX(zzym1ZzXHv, zzym0ZzXzy4, zzym0ZzW, new zzYM0[]{zzym0ZzU6});
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzXzc() {
            if (!zzXzd()) {
                zzYM0 zzym0 = this.f51157an;
                if (!zzym0.isZero()) {
                    int iZzXzo = zzXzo();
                    if (iZzXzo == 0) {
                        return new zzX(this.zzWoB, zzym0, this.f51158ao.zzW(zzym0));
                    }
                    if (iZzXzo == 1) {
                        return new zzX(this.zzWoB, zzym0, this.f51158ao.zzW(zzym0), new zzYM0[]{this.f51159ap[0]});
                    }
                    if (iZzXzo == 5) {
                        return new zzX(this.zzWoB, zzym0, this.f51158ao.zzXzA());
                    }
                    if (iZzXzo != 6) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    zzYM0 zzym02 = this.f51158ao;
                    zzYM0 zzym03 = this.f51159ap[0];
                    return new zzX(this.zzWoB, zzym0, zzym02.zzW(zzym03), new zzYM0[]{zzym03});
                }
            }
            return this;
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYM0 zzXzk() {
            int iZzXzo = zzXzo();
            if (iZzXzo != 5 && iZzXzo != 6) {
                return this.f51158ao;
            }
            zzYM0 zzym0 = this.f51157an;
            zzYM0 zzym02 = this.f51158ao;
            if (zzXzd() || zzym0.isZero()) {
                return zzym02;
            }
            zzYM0 zzym0ZzU = zzym02.zzW(zzym0).zzU(zzym0);
            if (6 == iZzXzo) {
                zzYM0 zzym03 = this.f51159ap[0];
                if (!zzym03.zzXzv()) {
                    return zzym0ZzU.zzT(zzym03);
                }
            }
            return zzym0ZzU;
        }

        public zzX(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
            super(zzym1, zzym0, zzym02, zzym0Arr);
        }
    }

    public static abstract class zzY extends zzYLX {
        public zzY(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
            super(zzym1, zzym0, zzym02);
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzS(zzYLX zzylx) {
            return zzylx.zzXzd() ? this : zzT(zzylx.zzXzc());
        }

        @Override // com.aspose.words.internal.zzYLX
        public final boolean zzXzq() {
            zzYM0 zzym0 = this.f51157an;
            zzYM0 zzym02 = this.f51158ao;
            zzYM0 zzym0ZzXzK = this.zzWoB.zzXzK();
            zzYM0 zzym0ZzXzJ = this.zzWoB.zzXzJ();
            zzYM0 zzym0ZzXzy = zzym02.zzXzy();
            int iZzXzo = zzXzo();
            if (iZzXzo != 0) {
                if (iZzXzo == 1) {
                    zzYM0 zzym03 = this.f51159ap[0];
                    if (!zzym03.zzXzv()) {
                        zzYM0 zzym0ZzXzy2 = zzym03.zzXzy();
                        zzYM0 zzym0ZzU = zzym03.zzU(zzym0ZzXzy2);
                        zzym0ZzXzy = zzym0ZzXzy.zzU(zzym03);
                        zzym0ZzXzK = zzym0ZzXzK.zzU(zzym0ZzXzy2);
                        zzym0ZzXzJ = zzym0ZzXzJ.zzU(zzym0ZzU);
                    }
                } else {
                    if (iZzXzo != 2 && iZzXzo != 3 && iZzXzo != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    zzYM0 zzym04 = this.f51159ap[0];
                    if (!zzym04.zzXzv()) {
                        zzYM0 zzym0ZzXzy3 = zzym04.zzXzy();
                        zzYM0 zzym0ZzXzy4 = zzym0ZzXzy3.zzXzy();
                        zzYM0 zzym0ZzU2 = zzym0ZzXzy3.zzU(zzym0ZzXzy4);
                        zzym0ZzXzK = zzym0ZzXzK.zzU(zzym0ZzXzy4);
                        zzym0ZzXzJ = zzym0ZzXzJ.zzU(zzym0ZzU2);
                    }
                }
            }
            return zzym0ZzXzy.equals(zzym0.zzXzy().zzW(zzym0ZzXzK).zzU(zzym0).zzW(zzym0ZzXzJ));
        }

        public zzY(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
            super(zzym1, zzym0, zzym02, zzym0Arr);
        }
    }

    public static abstract class zzZ extends zzYLX {
        public zzZ(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
            super(zzym1, zzym0, zzym02);
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzP(zzYM0 zzym0) {
            if (zzXzd()) {
                return this;
            }
            int iZzXzo = zzXzo();
            if (iZzXzo != 5 && iZzXzo != 6) {
                return super.zzP(zzym0);
            }
            zzYM0 zzym0ZzXzj = zzXzj();
            return zzXHv().zzZ(zzym0ZzXzj, zzXzi().zzW(zzym0ZzXzj).zzU(zzym0).zzW(zzym0ZzXzj), zzXzh());
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzQ(zzYM0 zzym0) {
            if (zzXzd()) {
                return this;
            }
            int iZzXzo = zzXzo();
            if (iZzXzo == 5) {
                zzYM0 zzym0ZzXzj = zzXzj();
                zzYM0 zzym0ZzXzi = zzXzi();
                return zzXHv().zzZ(zzym0ZzXzj, zzym0ZzXzi.zzW(zzym0ZzXzj).zzT(zzym0).zzW(zzym0ZzXzj.zzU(zzym0)), zzXzh());
            }
            if (iZzXzo != 6) {
                return super.zzQ(zzym0);
            }
            zzYM0 zzym0ZzXzj2 = zzXzj();
            zzYM0 zzym0ZzXzi2 = zzXzi();
            zzYM0 zzym02 = zzXzh()[0];
            zzYM0 zzym0ZzU = zzym0ZzXzj2.zzU(zzym0.zzXzy());
            return zzXHv().zzZ(zzym0ZzU, zzym0ZzXzi2.zzW(zzym0ZzXzj2).zzW(zzym0ZzU), new zzYM0[]{zzym02.zzU(zzym0)});
        }

        @Override // com.aspose.words.internal.zzYLX
        public final zzYLX zzS(zzYLX zzylx) {
            return zzylx.zzXzd() ? this : zzT(zzylx.zzXzc());
        }

        @Override // com.aspose.words.internal.zzYLX
        public final boolean zzXzp() {
            BigInteger bigIntegerZzXzI = this.zzWoB.zzXzI();
            if (zzYM2.zzWkF.equals(bigIntegerZzXzI)) {
                return ((zzYM0.zzZ) zzXze().zzXzn().zzW(this.zzWoB.zzXzK())).zzXzs() == 0;
            }
            if (!zzYM2.f51194M.equals(bigIntegerZzXzI)) {
                return super.zzXzp();
            }
            zzYLX zzylxZzXze = zzXze();
            zzYM0 zzym0ZzXzn = zzylxZzXze.zzXzn();
            zzYM1 zzym1 = this.zzWoB;
            zzYM0 zzym0ZzX = ((zzYM1.zzZ) zzym1).zzX(zzym0ZzXzn.zzW(zzym1.zzXzK()));
            if (zzym0ZzX == null) {
                return false;
            }
            zzYM0 zzym0ZzW = zzym0ZzXzn.zzU(zzym0ZzX).zzW(zzylxZzXze.zzXzm()).zzW(this.zzWoB.zzXzK());
            return ((zzYM0.zzZ) zzym0ZzW).zzXzs() == 0 || ((zzYM0.zzZ) zzym0ZzW.zzW(zzym0ZzXzn)).zzXzs() == 0;
        }

        @Override // com.aspose.words.internal.zzYLX
        public final boolean zzXzq() {
            zzYM0 zzym0ZzY;
            zzYM0 zzym0ZzY2;
            zzYM1 zzym1ZzXHv = zzXHv();
            zzYM0 zzym0 = this.f51157an;
            zzYM0 zzym0ZzXzK = zzym1ZzXHv.zzXzK();
            zzYM0 zzym0ZzXzJ = zzym1ZzXHv.zzXzJ();
            int iZzXzH = zzym1ZzXHv.zzXzH();
            if (iZzXzH != 6) {
                zzYM0 zzym02 = this.f51158ao;
                zzYM0 zzym0ZzU = zzym02.zzW(zzym0).zzU(zzym02);
                if (iZzXzH != 0) {
                    if (iZzXzH != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    zzYM0 zzym03 = this.f51159ap[0];
                    if (!zzym03.zzXzv()) {
                        zzYM0 zzym0ZzU2 = zzym03.zzU(zzym03.zzXzy());
                        zzym0ZzU = zzym0ZzU.zzU(zzym03);
                        zzym0ZzXzK = zzym0ZzXzK.zzU(zzym03);
                        zzym0ZzXzJ = zzym0ZzXzJ.zzU(zzym0ZzU2);
                    }
                }
                return zzym0ZzU.equals(zzym0.zzW(zzym0ZzXzK).zzU(zzym0.zzXzy()).zzW(zzym0ZzXzJ));
            }
            zzYM0 zzym04 = this.f51159ap[0];
            boolean zZzXzv = zzym04.zzXzv();
            if (zzym0.isZero()) {
                zzYM0 zzym0ZzXzy = this.f51158ao.zzXzy();
                if (!zZzXzv) {
                    zzym0ZzXzJ = zzym0ZzXzJ.zzU(zzym04.zzXzy());
                }
                return zzym0ZzXzy.equals(zzym0ZzXzJ);
            }
            zzYM0 zzym05 = this.f51158ao;
            zzYM0 zzym0ZzXzy2 = zzym0.zzXzy();
            if (zZzXzv) {
                zzym0ZzY = androidx.concurrent.futures.OooO00o.OooO00o(zzym05, zzym05, zzym0ZzXzK);
                zzym0ZzY2 = zzym0ZzXzy2.zzXzy().zzW(zzym0ZzXzJ);
            } else {
                zzYM0 zzym0ZzXzy3 = zzym04.zzXzy();
                zzYM0 zzym0ZzXzy4 = zzym0ZzXzy3.zzXzy();
                zzym0ZzY = zzym05.zzW(zzym04).zzY(zzym05, zzym0ZzXzK, zzym0ZzXzy3);
                zzym0ZzY2 = zzym0ZzXzy2.zzY(zzym0ZzXzJ, zzym0ZzXzy4);
            }
            return zzym0ZzY.zzU(zzym0ZzXzy2).equals(zzym0ZzY2);
        }

        public final zzZ zzeO(int i) {
            if (zzXzd()) {
                return this;
            }
            zzYM1 zzym1ZzXHv = zzXHv();
            int iZzXzH = zzym1ZzXHv.zzXzH();
            zzYM0 zzym0 = this.f51157an;
            if (iZzXzH != 0) {
                if (iZzXzH != 1) {
                    if (iZzXzH != 5) {
                        if (iZzXzH != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                return (zzZ) zzym1ZzXHv.zzZ(zzym0.zzeR(i), this.f51158ao.zzeR(i), new zzYM0[]{this.f51159ap[0].zzeR(i)});
            }
            return (zzZ) zzym1ZzXHv.zzZ(zzym0.zzeR(i), this.f51158ao.zzeR(i));
        }

        public zzZ(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
            super(zzym1, zzym0, zzym02, zzym0Arr);
        }
    }

    public zzYLX(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
        this(zzym1, zzym0, zzym02, zzU(zzym1));
    }

    private static zzYM0[] zzU(zzYM1 zzym1) {
        int iZzXzH = zzym1 == null ? 0 : zzym1.zzXzH();
        if (iZzXzH == 0 || iZzXzH == 5) {
            return f51156am;
        }
        zzYM0 zzym0ZzP = zzym1.zzP(zzYM2.ONE);
        if (iZzXzH != 1 && iZzXzH != 2) {
            if (iZzXzH == 3) {
                return new zzYM0[]{zzym0ZzP, zzym0ZzP, zzym0ZzP};
            }
            if (iZzXzH == 4) {
                return new zzYM0[]{zzym0ZzP, zzym1.zzXzK()};
            }
            if (iZzXzH != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new zzYM0[]{zzym0ZzP};
    }

    private zzYLX zzX(zzYM0 zzym0, zzYM0 zzym02) {
        return this.zzWoB.zzZ(this.f51157an.zzU(zzym0), this.f51158ao.zzU(zzym02));
    }

    private void zzXzg() {
        if (!zzXzf()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    private static synchronized SecureRandom zzXzr() {
        try {
            if (zzWbb == null) {
                zzZ0L.isReady();
                zzWbb = zzZ1L.zzWhM.zzZ(new SecureRandom(), false).zzZ(zzYGN.zzWX(System.currentTimeMillis()), false, zzYGI.zzwb(zzYLX.class.getName()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzWbb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYLX) {
            return zzU((zzYLX) obj);
        }
        return false;
    }

    public int hashCode() {
        zzYM1 zzym1 = this.zzWoB;
        int i = zzym1 == null ? 0 : ~zzym1.hashCode();
        if (zzXzd()) {
            return i;
        }
        zzYLX zzylxZzXze = zzXze();
        return (i ^ (zzylxZzXze.f51157an.hashCode() * 17)) ^ (zzylxZzXze.zzXzk().hashCode() * 257);
    }

    public final boolean isValid() {
        return zzu(false, true);
    }

    public String toString() {
        if (zzXzd()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.f51157an);
        stringBuffer.append(',');
        stringBuffer.append(this.f51158ao);
        for (int i = 0; i < this.f51159ap.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.f51159ap[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public final zzYLX zzK(BigInteger bigInteger) {
        return this.zzWoB.zzXzF().zzZ(this, bigInteger);
    }

    public final byte[] zzOC(boolean z) {
        if (zzXzd()) {
            return new byte[1];
        }
        zzYLX zzylxZzXze = zzXze();
        byte[] encoded = zzylxZzXze.f51157an.getEncoded();
        byte[] encoded2 = zzylxZzXze.zzXzk().getEncoded();
        byte[] bArr = new byte[encoded.length + encoded2.length + 1];
        bArr[0] = 4;
        System.arraycopy(encoded, 0, bArr, 1, encoded.length);
        System.arraycopy(encoded2, 0, bArr, encoded.length + 1, encoded2.length);
        return bArr;
    }

    public zzYLX zzP(zzYM0 zzym0) {
        return zzXzd() ? this : this.zzWoB.zzZ(this.f51157an, this.f51158ao.zzU(zzym0), this.f51159ap);
    }

    public zzYLX zzQ(zzYM0 zzym0) {
        return zzXzd() ? this : this.zzWoB.zzZ(this.f51157an.zzU(zzym0), this.f51158ao, this.f51159ap);
    }

    public final zzYLX zzR(zzYM0 zzym0) {
        int iZzXzo = zzXzo();
        if (iZzXzo != 1) {
            if (iZzXzo == 2 || iZzXzo == 3 || iZzXzo == 4) {
                zzYM0 zzym0ZzXzy = zzym0.zzXzy();
                return zzX(zzym0ZzXzy, zzym0ZzXzy.zzU(zzym0));
            }
            if (iZzXzo != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return zzX(zzym0, zzym0);
    }

    public abstract zzYLX zzS(zzYLX zzylx);

    public abstract zzYLX zzT(zzYLX zzylx);

    public final zzYM1 zzXHv() {
        return this.zzWoB;
    }

    public zzYLX zzXza() {
        return zzR(this);
    }

    public abstract zzYLX zzXzb();

    public abstract zzYLX zzXzc();

    public final boolean zzXzd() {
        if (this.f51157an == null || this.f51158ao == null) {
            return true;
        }
        zzYM0[] zzym0Arr = this.f51159ap;
        return zzym0Arr.length > 0 && zzym0Arr[0].isZero();
    }

    public final zzYLX zzXze() {
        int iZzXzo;
        if (!zzXzd() && (iZzXzo = zzXzo()) != 0 && iZzXzo != 5) {
            zzYM0 zzym0ZzeQ = zzeQ(0);
            if (!zzym0ZzeQ.zzXzv()) {
                zzYM0 zzym0Zzv = this.zzWoB.zzv(zzXzr());
                return zzR(zzym0ZzeQ.zzU(zzym0Zzv).zzXzx().zzU(zzym0Zzv));
            }
        }
        return this;
    }

    public final boolean zzXzf() {
        int iZzXzo = zzXzo();
        return iZzXzo == 0 || iZzXzo == 5 || zzXzd() || this.f51159ap[0].zzXzv();
    }

    public final zzYM0[] zzXzh() {
        return this.f51159ap;
    }

    public final zzYM0 zzXzi() {
        return this.f51158ao;
    }

    public final zzYM0 zzXzj() {
        return this.f51157an;
    }

    public zzYM0 zzXzk() {
        return this.f51158ao;
    }

    public final zzYM0 zzXzl() {
        return this.f51157an;
    }

    public final zzYM0 zzXzm() {
        zzXzg();
        return zzXzk();
    }

    public final zzYM0 zzXzn() {
        zzXzg();
        return this.f51157an;
    }

    public final int zzXzo() {
        zzYM1 zzym1 = this.zzWoB;
        if (zzym1 == null) {
            return 0;
        }
        return zzym1.zzXzH();
    }

    public boolean zzXzp() {
        return zzYM2.ONE.equals(this.zzWoB.zzXzI()) || zzYM3.zzX(this, this.zzWoB.getOrder()).zzXzd();
    }

    public abstract boolean zzXzq();

    public zzYLX zzeP(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        zzYLX zzylxZzXzb = this;
        while (true) {
            i--;
            if (i < 0) {
                return zzylxZzXzb;
            }
            zzylxZzXzb = zzylxZzXzb.zzXzb();
        }
    }

    public zzYM0 zzeQ(int i) {
        if (i < 0) {
            return null;
        }
        zzYM0[] zzym0Arr = this.f51159ap;
        if (i >= zzym0Arr.length) {
            return null;
        }
        return zzym0Arr[i];
    }

    public final boolean zzu(final boolean z, final boolean z2) {
        return zzXzd() || !((zzYLL) this.zzWoB.zzZ(this, "bc_validity", new zzYLQ() { // from class: com.aspose.words.internal.zzYLX.1
            @Override // com.aspose.words.internal.zzYLQ
            public final zzYLP zzZ(zzYLP zzylp) {
                zzYLL zzyll = zzylp instanceof zzYLL ? (zzYLL) zzylp : null;
                if (zzyll == null) {
                    zzyll = new zzYLL();
                }
                if (!zzyll.zzXyZ()) {
                    if (!zzyll.zzXyX()) {
                        if (!z && !zzYLX.this.zzXzq()) {
                            zzyll.zzXyY();
                            return zzyll;
                        }
                        zzyll.zzXyW();
                    }
                    if (z2 && !zzyll.zzXyV()) {
                        if (!zzYLX.this.zzXzp()) {
                            zzyll.zzXyY();
                            return zzyll;
                        }
                        zzyll.zzXyU();
                    }
                }
                return zzyll;
            }
        })).zzXyZ();
    }

    public zzYLX(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        this.f51160aq = null;
        if (zzym1 == null) {
            throw new IllegalArgumentException("'curve' cannot be null");
        }
        if ((zzym0 == null) != (zzym02 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        if (zzym0Arr == null) {
            throw new IllegalArgumentException("'zs' cannot be null");
        }
        this.zzWoB = zzym1;
        this.f51157an = zzym0;
        this.f51158ao = zzym02;
        this.f51159ap = zzym0Arr;
    }

    public zzYLX zzR(zzYLX zzylx) {
        return zzXzb().zzT(zzylx);
    }

    public final boolean zzU(zzYLX zzylx) {
        zzYLX zzylxZzXze;
        if (zzylx == null) {
            return false;
        }
        zzYM1 zzym1 = this.zzWoB;
        zzYM1 zzym12 = zzylx.zzWoB;
        boolean z = zzym1 == null;
        boolean z2 = zzym12 == null;
        boolean zZzXzd = zzXzd();
        boolean zZzXzd2 = zzylx.zzXzd();
        if (zZzXzd || zZzXzd2) {
            return zZzXzd && zZzXzd2 && (z || z2 || zzym1.zzV(zzym12));
        }
        if (z && z2) {
            zzylxZzXze = this;
        } else if (z) {
            zzylx = zzylx.zzXze();
            zzylxZzXze = this;
        } else if (z2) {
            zzylxZzXze = zzXze();
        } else {
            if (!zzym1.zzV(zzym12)) {
                return false;
            }
            zzYLX[] zzylxArr = {this, zzym1.zzW(zzylx)};
            zzym1.zzZ(zzylxArr);
            zzylxZzXze = zzylxArr[0];
            zzylx = zzylxArr[1];
        }
        return zzylxZzXze.f51157an.equals(zzylx.f51157an) && zzylxZzXze.zzXzk().equals(zzylx.zzXzk());
    }
}
