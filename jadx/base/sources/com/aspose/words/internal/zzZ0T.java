package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4K;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ0T {
    private static final zzZ1P zzWfJ = new zzZ1P("PBKDF2");
    public static final zzX zzWfI = new zzX();

    public static final class zzX extends zzZ0S {
        public zzX() {
            super(zzZ0T.zzWfJ);
        }

        public static zzY zzZ(zzZ1J zzz1j, byte[] bArr) {
            return new zzY(zzz1j, null, zzYGU.zzVI(bArr), new byte[20]);
        }

        public static zzY zzZ(zzZ1J zzz1j, zzZ4I zzz4i, char[] cArr) {
            return new zzY(zzz1j, zzz4i, zzz4i.zzI(cArr), new byte[20]);
        }
    }

    public static final class zzY extends zzZ0S {
        private final byte[] zzWAR;
        private final int zzWfC;
        private final byte[] zzWfD;
        private final zzZ4I zzWfE;
        private final zzZ1J zzWhV;

        public /* synthetic */ zzY(zzZ1J zzz1j, zzZ4I zzz4i, byte[] bArr, byte[] bArr2) {
            this(zzz1j, zzz4i, bArr, 1024, bArr2);
        }

        public final void finalize() {
            zzYGU.fill(this.zzWfD, (byte) 0);
        }

        public final int getIterationCount() {
            return this.zzWfC;
        }

        public final byte[] getSalt() {
            return zzYGU.zzVI(this.zzWAR);
        }

        public final zzY zzWY(byte[] bArr) {
            return new zzY(this.zzWhV, this.zzWfE, zzYGU.zzVI(this.zzWfD), this.zzWfC, zzYGU.zzVI(bArr));
        }

        public final zzZ1J zzXEO() {
            return this.zzWhV;
        }

        public final byte[] zzXEP() {
            return zzYGU.zzVI(this.zzWfD);
        }

        public final zzY zzfM(int i) {
            return new zzY(this.zzWhV, this.zzWfE, zzYGU.zzVI(this.zzWfD), i, this.zzWAR);
        }

        private zzY(zzZ1J zzz1j, zzZ4I zzz4i, byte[] bArr, int i, byte[] bArr2) {
            super(zzZ0T.zzWfJ);
            this.zzWhV = zzz1j;
            this.zzWfE = zzz4i;
            this.zzWfD = bArr;
            this.zzWfC = i;
            this.zzWAR = bArr2;
            if (zzZ5L.zzXH0()) {
                if (bArr2.length < 16) {
                    throw new zzZ0H("salt must be at least 128 bits");
                }
                if (bArr.length < 14) {
                    throw new zzZ0H("password must be at least 112 bits");
                }
            }
        }
    }

    public static class zzZ extends zzZ0R<zzY> {
        @Override // com.aspose.words.internal.zzZ4J
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public final zzZ4K<zzY> zzX(final zzY zzy) {
            final zzZ02 zzz02 = new zzZ02(zzy, zzZ0P.zzT(zzy.zzXEO()));
            zzz02.zzT(zzy.zzXEP(), zzy.getSalt(), zzy.getIterationCount());
            return new zzZ4K<zzY>() { // from class: com.aspose.words.internal.zzZ0T.zzZ.1
                @Override // com.aspose.words.internal.zzZ4K
                public final byte[] zzZ(zzZ4K.zzZ zzz, int i) {
                    return zzz02.zzZ(zzz, i);
                }

                @Override // com.aspose.words.internal.zzZ4K
                public final byte[][] zzZ(zzZ4K.zzZ zzz, int i, int i2) {
                    return zzz02.zzZ(zzz, i, i2);
                }
            };
        }
    }

    private zzZ0T() {
    }
}
