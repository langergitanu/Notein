package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzRN {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzLU zzY(Shape shape) {
        double dZzZBu = shape.zzY9J().zzZBu();
        com.aspose.words.internal.zzPV zzpvZz8Q = shape.zzY9J().zz8Q();
        com.aspose.words.internal.zzPV zzpvZzZ = zzZ7K.zzZ(shape.zzY9J().zzZBx(), shape);
        zzL2 zzl2 = new zzL2();
        int i = (int) dZzZBu;
        if (i == -135) {
            zzl2.zzI(new zzPP(dZzZBu + 90.0d));
            if (!zzZ1(shape.zzY9J().zzZBo())) {
                zzY(zzl2, zzpvZzZ, zzpvZz8Q);
            }
        } else if (i == -90) {
            zzl2.zzI(new zzPP(dZzZBu + 180.0d));
            if (!zzZ1(shape.zzY9J().zzZBo())) {
                zzY(zzl2, zzpvZzZ, zzpvZz8Q);
            }
        } else if (i == -45) {
            zzl2.zzI(new zzPP(dZzZBu + 90.0d));
            if (zzZ1(shape.zzY9J().zzZBo())) {
                zzY(zzl2, zzpvZzZ, zzpvZz8Q);
            } else {
                zzY(zzl2, zzpvZz8Q, zzpvZzZ);
            }
        } else if (i == 0) {
            zzl2.zzI(new zzPP(dZzZBu + 180.0d));
            if (zzZ1(shape.zzY9J().zzZBo())) {
                zzZ(zzl2, zzpvZz8Q, zzpvZzZ);
            } else {
                zzZ(zzl2, zzpvZzZ, zzpvZz8Q);
            }
        }
        zzLU zzlu = new zzLU();
        zzlu.zzX(zzl2);
        return zzlu;
    }

    public static zzLU zzZ(Shape shape, zzZ1F zzz1f) throws Exception {
        if (shape == null || !shape.getFilled()) {
            return null;
        }
        int fillType = shape.zzY9J().getFillType();
        if (fillType != 0) {
            if (fillType == 1 || fillType == 2 || fillType == 3) {
                String strZzk = zzz1f.zzk(shape);
                if (com.aspose.words.internal.zzZKN.zzU3(strZzk)) {
                    return null;
                }
                zzLU zzlu = new zzLU();
                zzlu.zzZq("background-image", strZzk);
                return zzlu;
            }
            if (fillType == 7) {
                return zzY(shape);
            }
            if (fillType != 9) {
                return null;
            }
        }
        zzLU zzlu2 = new zzLU();
        zzlu2.zzN(new zzQC(shape.zzY9J().zz8Q()));
        return zzlu2;
    }

    private static boolean zzZ1(double d) {
        return Math.abs(d - 100.0d) < 1.0d;
    }

    private static void zzZ(zzL2 zzl2, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        zzl2.zzI(new zzQC(zzpv));
        zzl2.zzI(new zzQC(zzpv2));
        zzl2.zzI(new zzQC(zzpv));
        zzl2.zzI(new zzQC(zzpv2));
    }

    private static void zzY(zzL2 zzl2, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        zzl2.zzI(new zzQC(zzpv));
        zzl2.zzI(new zzQC(zzpv2));
        zzl2.zzI(new zzQC(zzpv));
    }
}
