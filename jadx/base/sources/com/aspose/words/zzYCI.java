package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCI extends com.aspose.words.internal.zzYC {
    public zzYCI(Shape shape) {
        int iZzYbj = (int) ((((double) shape.zzYbj()) / 65536.0d) * 255.0d);
        zzz(zzmq(shape.zzXT()));
        zzW(new com.aspose.words.internal.zzPV(iZzYbj, shape.zzYbi()));
        zzXR().add(((double) shape.zzYbg()) / 12700.0d);
        zzXQ().add(((double) shape.zzYbf()) / 12700.0d);
        zzP(((double) shape.zzYbc()) / 65536.0d);
        zzO(((double) shape.zzYba()) / 65536.0d);
        zzN(((double) shape.zzYb9()) / 65536.0d);
        zzM(((double) shape.zzYbb()) / 65536.0d);
        zzL(((double) shape.zzYb8()) / 65536.0d);
        zzK(((double) shape.zzYb7()) / 65536.0d);
        zzJ(((double) shape.zzYb6()) / 12700.0d);
        zzI(((double) shape.zzYb5()) / 12700.0d);
        if (zzXT() == 1) {
            zzW(new com.aspose.words.internal.zzPV(iZzYbj, shape.zzYbh()));
            zzXR().add(((double) shape.zzYbe()) / 12700.0d);
            zzXQ().add(((double) shape.zzYbd()) / 12700.0d);
        }
    }

    private static int zzmq(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }
}
