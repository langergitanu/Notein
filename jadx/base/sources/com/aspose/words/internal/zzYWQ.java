package com.aspose.words.internal;

import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ4K;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYWQ {
    private static Map<zzZ5W, zzZ4J<zzT>> zzW56;
    public static final zzX zzW57;
    public static final zzS zzW58;
    public static final zzS zzW59;
    public static final zzS zzW5a;
    private static final zzYXR zzW5b;
    private static final zzYXR zzW5c;
    private static final zzYXR zzW5d;
    private static final zzYXR zzW5e;

    public static final class zzS extends zzYXO {
        private final zzZ5K zzW4W;

        public zzS(zzYXR zzyxr, zzZ5K zzz5k) {
            super(zzyxr);
            this.zzW4W = zzz5k;
        }

        public final zzT zzZ(zzZ5K zzz5k, byte[] bArr) {
            return new zzT((zzYXR) zzXGV(), zzz5k, null, zzYGU.zzVI(bArr), new byte[20]);
        }

        public final zzT zzZ(zzZ5K zzz5k, zzZ4I zzz4i, char[] cArr) {
            return new zzT((zzYXR) zzXGV(), zzz5k, zzz4i, zzz4i.zzI(cArr), new byte[20]);
        }
    }

    public static final class zzT extends zzYXO<zzZ5W> {
        private final zzZ5K zzW8y;
        private final byte[] zzWAR;
        private final int zzWfC;
        private final byte[] zzWfD;
        private final zzZ4I zzWfE;

        public /* synthetic */ zzT(zzYXR zzyxr, zzZ5K zzz5k, zzZ4I zzz4i, byte[] bArr, byte[] bArr2) {
            this(zzyxr, zzz5k, zzz4i, bArr, 1024, bArr2);
        }

        public final void finalize() throws Throwable {
            zzYGU.fill(this.zzWfD, (byte) 0);
        }

        public final int getIterationCount() {
            return this.zzWfC;
        }

        public final byte[] getSalt() {
            return zzYGU.zzVI(this.zzWAR);
        }

        public final zzT zzWm(byte[] bArr) {
            return new zzT((zzYXR) zzXGV(), this.zzW8y, this.zzWfE, zzYGU.zzVI(this.zzWfD), this.zzWfC, zzYGU.zzVI(bArr));
        }

        public final zzZ5K zzXDg() {
            return this.zzW8y;
        }

        public final byte[] zzXEP() {
            return zzYGU.zzVI(this.zzWfD);
        }

        public final zzT zzfo(int i) {
            return new zzT((zzYXR) zzXGV(), this.zzW8y, this.zzWfE, zzYGU.zzVI(this.zzWfD), i, this.zzWAR);
        }

        private zzT(zzYXR zzyxr, zzZ5K zzz5k, zzZ4I zzz4i, byte[] bArr, int i, byte[] bArr2) {
            super(zzyxr);
            this.zzW8y = zzz5k;
            this.zzWfE = zzz4i;
            this.zzWfD = bArr;
            this.zzWfC = i;
            this.zzWAR = bArr2;
        }
    }

    public static class zzU extends zzYX8<zzT> {
        private zzU() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4J
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4K<zzT> zzX(final zzT zzt) {
            final zzYWP zzywp = new zzYWP(zzt, zzYW6.zzZ(zzt.zzXDg()));
            zzywp.zzT(zzt.zzXEP(), zzt.getSalt(), zzt.getIterationCount());
            return new zzZ4K<zzT>() { // from class: com.aspose.words.internal.zzYWQ.zzU.1
                @Override // com.aspose.words.internal.zzZ4K
                public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
                    zzYVO.zzX(zzt.zzXGV());
                    return zzywp.zzZ(zzz, i);
                }

                @Override // com.aspose.words.internal.zzZ4K
                public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
                    zzYVO.zzX(zzt.zzXGV());
                    return zzywp.zzZ(zzz, i, i2);
                }
            };
        }

        public /* synthetic */ zzU(byte b) {
            this();
        }
    }

    public static class zzV extends zzYX8<zzT> {
        private zzV() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4J
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4K<zzT> zzX(final zzT zzt) {
            final zzYWN zzywn = new zzYWN(zzt, zzYW6.zzY(zzt.zzXDg()));
            zzywn.zzT(zzt.zzXEP(), zzt.getSalt(), zzt.getIterationCount());
            return new zzZ4K<zzT>() { // from class: com.aspose.words.internal.zzYWQ.zzV.1
                @Override // com.aspose.words.internal.zzZ4K
                public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
                    zzYVO.zzX(zzt.zzXGV());
                    return zzywn.zzZ(zzz, i);
                }

                @Override // com.aspose.words.internal.zzZ4K
                public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
                    zzYVO.zzX(zzt.zzXGV());
                    return zzywn.zzZ(zzz, i, i2);
                }
            };
        }

        public /* synthetic */ zzV(byte b) {
            this();
        }
    }

    public static class zzW extends zzYX8<zzT> {
        private zzW() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4J
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4K<zzT> zzX(final zzT zzt) {
            final zzYWO zzywo = new zzYWO(zzt, zzYW6.zzZ(zzt.zzXDg()));
            zzywo.zzT(zzt.zzXEP(), zzt.getSalt(), zzt.getIterationCount());
            return new zzZ4K<zzT>() { // from class: com.aspose.words.internal.zzYWQ.zzW.1
                @Override // com.aspose.words.internal.zzZ4K
                public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
                    zzYVO.zzX(zzt.zzXGV());
                    return zzywo.zzZ(zzz, i);
                }

                @Override // com.aspose.words.internal.zzZ4K
                public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
                    zzYVO.zzX(zzt.zzXGV());
                    return zzywo.zzZ(zzz, i, i2);
                }
            };
        }

        public /* synthetic */ zzW(byte b) {
            this();
        }
    }

    public static final class zzX extends zzYXO {
        public zzX() {
            super(zzYWQ.zzW5b);
        }

        public final zzT zzWn(byte[] bArr) {
            return new zzT((zzYXR) zzXGV(), zzYW0.zzZ.zzW1W, null, zzYGU.zzVI(bArr), new byte[20]);
        }
    }

    public static class zzY extends zzYX8<zzT> {
        private zzY() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4J
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4K<zzT> zzX(final zzT zzt) {
            if (zzt.zzXDg() != zzYW0.zzZ.zzW1W) {
                throw new IllegalArgumentException("OpenSSL PBKDF only defined for MD5");
            }
            final zzYWS zzyws = new zzYWS(zzt);
            zzyws.zzT(zzt.zzXEP(), zzt.getSalt(), zzt.getIterationCount());
            return new zzZ4K<zzT>() { // from class: com.aspose.words.internal.zzYWQ.zzY.1
                @Override // com.aspose.words.internal.zzZ4K
                public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
                    zzYVO.zzX(zzt.zzXGV());
                    return zzyws.zzZ(zzz, i);
                }

                @Override // com.aspose.words.internal.zzZ4K
                public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
                    zzYVO.zzX(zzt.zzXGV());
                    return zzyws.zzZ(zzz, i, i2);
                }
            };
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static class zzZ extends zzYX8<zzT> {
        public static zzZ4K<zzT> zzZ(zzT zzt) {
            return ((zzZ4J) zzYWQ.zzW56.get(zzt.zzXGV())).zzX(zzt);
        }

        @Override // com.aspose.words.internal.zzZ4J
        public final /* synthetic */ zzZ4K zzX(zzZ4M zzz4m) {
            return zzZ((zzT) zzz4m);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("PBKDF2");
        zzW5e = zzyxr;
        zzYXR zzyxr2 = new zzYXR("PBKDF1");
        zzW5d = zzyxr2;
        zzYXR zzyxr3 = new zzYXR("PKCS12");
        zzW5c = zzyxr3;
        zzYXR zzyxr4 = new zzYXR("OpenSSL");
        zzW5b = zzyxr4;
        zzZ1J zzz1j = zzZ0P.zzZ.zzWdL;
        zzW5a = new zzS(zzyxr2, zzz1j);
        zzW59 = new zzS(zzyxr, zzZ0P.zzZ.zzWdK);
        zzW58 = new zzS(zzyxr3, zzz1j);
        zzW57 = new zzX();
        HashMap map = new HashMap();
        zzW56 = map;
        byte b = 0;
        map.put(zzyxr, new zzV(b));
        zzW56.put(zzyxr2, new zzW(b));
        zzW56.put(zzyxr3, new zzU(b));
        zzW56.put(zzyxr4, new zzY(b));
    }
}
