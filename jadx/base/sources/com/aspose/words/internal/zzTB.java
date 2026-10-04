package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzTB extends zzTE {
    public zzTB(int i, int i2, zzZYV<Integer> zzzyv, int i3) {
        super(i, i2, i3, zzY(zzzyv));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzTB zzX(zzY0 zzy0, zzTF zztf) throws Exception {
        int i;
        zzZYV zzzyv = new zzZYV();
        zzy0.zzq().zzH(zztf.getPosition());
        zzy0.zzX9();
        int iZzX9 = zzy0.zzX9() & 65535;
        int iZzX92 = zzy0.zzX9() & 65535;
        int iZzX93 = zzy0.zzX9() & 65535;
        zzy0.zzX9();
        zzy0.zzX9();
        zzy0.zzX9();
        int i2 = iZzX93 / 2;
        int[] iArrZzY = zzY(zzy0, i2);
        zzy0.zzX9();
        int[] iArrZzY2 = zzY(zzy0, i2);
        int[] iArrZzX = zzX(zzy0, i2);
        int[] iArrZzY3 = zzY(zzy0, i2);
        int position = ((((int) zztf.getPosition()) + iZzX9) - ((int) zzy0.zzq().getPosition())) / 2;
        if (r9 + 4 <= zzy0.zzq().getLength()) {
            position += 2;
        }
        int[] iArrZzY4 = zzY(zzy0, position);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = iArrZzY2[i3]; i4 <= iArrZzY[i3]; i4++) {
                if (i4 != 65535) {
                    int i5 = iArrZzY3[i3];
                    if (i5 == 0) {
                        i = (iArrZzX[i3] + i4) & 65535;
                        if (i == 65535) {
                        }
                    } else if (i5 != 65535) {
                        i = iArrZzY4[(((i5 / 2) + (i4 - iArrZzY2[i3])) - i2) + i3];
                        if (i != 0) {
                            i = (i + iArrZzX[i3]) & 65535;
                        }
                    } else {
                        i = 0;
                    }
                }
                zzzyv.set(i4, Integer.valueOf(i));
            }
        }
        return new zzTB(zztf.zzTw(), zztf.zzTv(), zzzyv, iZzX92);
    }

    private static zzZYV<Integer> zzY(zzZYV<Integer> zzzyv) {
        zzZYV<Integer> zzzyv2 = new zzZYV<>();
        for (int i = 0; i < zzzyv.getCount(); i++) {
            int iZzT3 = zzzyv.zzT3(i);
            if (zzZVS.zzS4(iZzT3)) {
                break;
            }
            zzzyv2.add(iZzT3, zzzyv.zzVY(i));
        }
        return zzzyv2;
    }

    private static void zzZ(int[] iArr, zzXZ zzxz) throws Exception {
        for (int i : iArr) {
            zzxz.zzj(i);
        }
    }

    private static int[] zzY(zzY0 zzy0, int i) throws Exception {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = zzy0.zzX9() & 65535;
        }
        return iArr;
    }

    private static int[] zzX(zzY0 zzy0, int i) throws Exception {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = zzy0.zzXa();
        }
        return iArr;
    }

    @Override // com.aspose.words.internal.zzTE
    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzq().getPosition();
        zzxz.zzj(4);
        boolean zZzVE = zzTt().zzVE(65535);
        int count = zzTt().getCount() + (!zZzVE ? 1 : 0);
        int i = count * 2;
        int iFloor = 2 << ((int) Math.floor(Math.log(count) / Math.log(2.0d)));
        int iLog = (int) (Math.log(((double) iFloor) / 2.0d) / Math.log(2.0d));
        int i2 = i - iFloor;
        int[] iArr = new int[count];
        int[] iArr2 = new int[count];
        int[] iArr3 = new int[count];
        int[] iArr4 = new int[count];
        for (int i3 = 0; i3 < zzTt().getCount(); i3++) {
            int iZzT3 = zzTt().zzT3(i3);
            int iIntValue = zzTt().zzVY(i3).intValue();
            iArr[i3] = iZzT3;
            iArr2[i3] = iZzT3;
            iArr3[i3] = iIntValue - iZzT3;
        }
        if (!zZzVE) {
            int i4 = count - 1;
            iArr[i4] = 65535;
            iArr2[i4] = 65535;
            iArr3[i4] = -65535;
        }
        zzxz.zzj((count * 8) + 16);
        zzxz.zzj(zzTu());
        zzxz.zzj(i);
        zzxz.zzj(iFloor);
        zzxz.zzj(iLog);
        zzxz.zzj(i2);
        zzZ(iArr, zzxz);
        zzxz.zzj(0);
        zzZ(iArr2, zzxz);
        zzZ(iArr3, zzxz);
        zzZ(iArr4, zzxz);
        zzxz.zzq().getPosition();
    }
}
