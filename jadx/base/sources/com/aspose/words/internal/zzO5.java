package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzO5 {
    public static void zzZ(zzOU zzou, int i, boolean z) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                zzZ(zzou, i, 0, z);
                return;
            }
            if (i == 3) {
                zzZ(zzou, 2, 0, z);
                return;
            }
            if (i != 240) {
                if (i == 255) {
                    zzZ(zzou, 0, 6, z);
                    return;
                }
                switch (i) {
                    case 16:
                        break;
                    case 17:
                        zzZ(zzou, 0, 3, z);
                        return;
                    case 18:
                        zzZ(zzou, 0, 4, z);
                        return;
                    case 19:
                        zzZ(zzou, 0, 3, z);
                        return;
                    case 20:
                        zzZ(zzou, 0, 1, z);
                        return;
                    default:
                        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: lineCap");
                }
            }
        }
        zzZ(zzou, i, 0, z);
    }

    private static void zzZ(zzOU zzou, int i, int i2, boolean z) {
        zzPF zzpfZzNO = zzou.zzNO();
        if (z) {
            zzou.zzXX(i);
            zzpfZzNO.zzOB().setType(i2);
        } else {
            zzou.setEndCap(i);
            zzpfZzNO.zzOA().setType(i2);
        }
        zzpfZzNO.zzY2(1);
    }
}
