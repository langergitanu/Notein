package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYZH {
    public static final zzX zzWbg = new zzX(new zzZ1P("scrypt"));

    public static final class zzX extends zzZ0S {
        public zzX(zzZ1P zzz1p) {
            super(zzz1p);
        }

        public static zzY zzZ(byte[] bArr, int i, int i2, int i3, byte[] bArr2) {
            return new zzY(i, zzYGU.zzVI(bArr2), i2, i3, zzYGU.zzVI(bArr), (byte) 0);
        }
    }

    public static final class zzY extends zzZ0S {
        final byte[] zzWAR;
        final int zzWbc;
        final int zzWbd;
        final int zzWgn;
        final byte[] zzWoA;

        public /* synthetic */ zzY(int i, byte[] bArr, int i2, int i3, byte[] bArr2, byte b) {
            this(i, bArr, i2, i3, bArr2);
        }

        private zzY(int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
            super(zzYZH.zzWbg.zzXF4());
            this.zzWoA = bArr;
            this.zzWbd = i;
            this.zzWgn = i2;
            this.zzWbc = i3;
            this.zzWAR = bArr2;
        }
    }

    public static final class zzZ implements zzZ59<zzY> {
        @Override // com.aspose.words.internal.zzZ59
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public final zzZ5A<zzY> zzY(final zzY zzy) {
            return new zzZ5A<zzY>() { // from class: com.aspose.words.internal.zzYZH.zzZ.1
                @Override // com.aspose.words.internal.zzZ5A
                public final void zzXi(byte[] bArr) {
                    zzY zzy2 = zzy;
                    byte[] bArrZzZ = zzYZS.zzZ(zzy2.zzWoA, zzy2.zzWAR, zzy2.zzWbd, zzy2.zzWgn, zzy2.zzWbc, bArr.length);
                    System.arraycopy(bArrZzZ, 0, bArr, 0, bArr.length);
                    zzYGU.fill(bArrZzZ, (byte) 0);
                }

                @Override // com.aspose.words.internal.zzZ5A
                public final void zzi(byte[] bArr, int i) {
                    zzY zzy2 = zzy;
                    byte[] bArrZzZ = zzYZS.zzZ(zzy2.zzWoA, zzy2.zzWAR, zzy2.zzWbd, zzy2.zzWgn, zzy2.zzWbc, i);
                    System.arraycopy(bArrZzZ, 0, bArr, 0, i);
                    zzYGU.fill(bArrZzZ, (byte) 0);
                }
            };
        }
    }
}
