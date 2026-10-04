package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzTC extends zzTE {
    private zzTC(int i, int i2, int i3, zzZYV<Integer> zzzyv) {
        super(i, i2, i3, zzzyv);
    }

    public static zzTC zzY(zzY0 zzy0, zzTF zztf) throws Exception {
        short s;
        int i;
        int i2;
        int i3 = 1;
        zzZYV zzzyv = new zzZYV();
        zzZXK zzzxkZzZx = zzZXK.zzZx(zztf.zzTw(), zztf.zzTv());
        zzy0.zzq().zzH(zztf.getPosition());
        zzy0.zzX9();
        zzy0.zzX9();
        short s2 = 65535;
        int iZzX9 = zzy0.zzX9() & 65535;
        int[] iArr = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr[i4] = zzy0.zzX9() & 65535;
        }
        long position = zzy0.zzq().getPosition();
        zzy0.zzX9();
        int iZzX92 = zzy0.zzX9() & 65535;
        short sZzXa = zzy0.zzXa();
        zzy0.zzq().zzH(((long) ((zzy0.zzX9() & 65535) - 2)) + zzy0.zzq().getPosition());
        int[] iArr2 = new int[iZzX92];
        for (int i5 = 0; i5 < iZzX92; i5++) {
            iArr2[i5] = zzy0.zzX9() & 65535;
        }
        int i6 = 0;
        for (int i7 = 256; i6 < i7; i7 = 256) {
            int i8 = iArr[i6];
            if (i8 == 0) {
                int i9 = iArr2[i6] + sZzXa;
                byte[] bArr = new byte[i3];
                bArr[0] = (byte) i6;
                zzZ(bArr, i9, zzzyv, zzzxkZzZx);
            } else {
                zzy0.zzq().zzH(position + ((long) i8));
                int iZzX93 = zzy0.zzX9() & s2;
                int iZzX94 = zzy0.zzX9() & s2;
                short sZzXa2 = zzy0.zzXa();
                int iZzX95 = zzy0.zzX9() & s2;
                if (iZzX94 != 0) {
                    s = s2;
                    zzy0.zzq().zzH(zzy0.zzq().getPosition() + ((long) (iZzX95 - 2)));
                    int i10 = iZzX93;
                    while (i10 < iZzX93 + iZzX94) {
                        int iZzX96 = zzy0.zzX9() & s;
                        if (iZzX96 != 0) {
                            i2 = i3;
                            byte[] bArr2 = new byte[2];
                            bArr2[0] = (byte) i6;
                            bArr2[i2] = (byte) i10;
                            zzZ(bArr2, iZzX96 + sZzXa2, zzzyv, zzzxkZzZx);
                        } else {
                            i2 = i3;
                        }
                        i10++;
                        i3 = i2;
                    }
                    i = i3;
                }
                i6++;
                s2 = s;
                i3 = i;
            }
            i = i3;
            s = s2;
            i6++;
            s2 = s;
            i3 = i;
        }
        return new zzTC(zztf.zzTw(), zztf.zzTv(), iZzX9, zzzyv);
    }

    private static void zzZ(byte[] bArr, int i, zzZYV<Integer> zzzyv, zzZXK zzzxk) {
        int iZzA = zzZVS.zzA(zzzxk.zzZn(bArr), 0);
        if (zzzyv.zzVE(iZzA)) {
            return;
        }
        zzzyv.add(iZzA, Integer.valueOf(i));
    }

    @Override // com.aspose.words.internal.zzTE
    public final void zzX(zzXZ zzxz) {
        throw new UnsupportedOperationException();
    }
}
