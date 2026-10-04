package com.aspose.words;

import com.aspose.slides.o000oOoO;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ11 {
    private static int[] zzY1R = {21, 10, 13, 29, 26, 28, 27};

    public static float zzG(com.aspose.words.internal.zzPM zzpm) {
        com.aspose.words.internal.zzZXH zzzxhZzPl = zzpm.zzPl();
        return zzzxhZzPl.zzJ((zzzxhZzPl.zzHR() ? zzzxhZzPl.zzpt() : zzzxhZzPl.zzpu()).zzHT(), zzpm.zzPg());
    }

    public static float zzH(com.aspose.words.internal.zzPM zzpm) {
        return zzZ((((double) zzpm.zzPg()) * 0.8158d) - 0.3459d, zzpm);
    }

    public static float zzI(com.aspose.words.internal.zzPM zzpm) {
        double dZzPg = zzpm.zzPg();
        return zzZ(o000oOoO.OooO00o(dZzPg, 0.6375d, 0.0019d * dZzPg * dZzPg, 0.7627d), zzpm);
    }

    public static boolean zzJ(zzZ13 zzz13) {
        if (zzz13 == null) {
            return false;
        }
        return zzU(zzz13.zzYG8().getMathObjectType(), zzY1R);
    }

    public static zzZ13 zzK(zzZ13 zzz13) {
        if (zzz13.zzYGr() == null) {
            return zzz13;
        }
        zzZ13 zzz13ZzYGr = zzz13.zzYGr();
        int[] iArr = {0, 1};
        while (zzz13ZzYGr.zzYGr() != null && !zzU(zzz13ZzYGr.zzYGk().getMathObjectType(), iArr)) {
            zzz13ZzYGr = zzz13ZzYGr.zzYGr();
        }
        return zzz13ZzYGr.zzQw().get(0);
    }

    public static boolean zzL(zzZ13 zzz13) {
        return zzz13.zzd(6);
    }

    public static boolean zzM(zzZ13 zzz13) {
        return zzz13.zzd(24);
    }

    public static boolean zzN(zzZ13 zzz13) {
        return zzz13.zzd(25, 24);
    }

    public static boolean zzO(zzZ13 zzz13) {
        return zzz13.zzd(12, 11);
    }

    public static boolean zzP(zzZ13 zzz13) {
        return zzO(zzz13) || zzN(zzz13);
    }

    public static void zzQ(zzZ13 zzz13) {
        if (zzz13.getIndex() == zzz13.zzYGr().zzQw().size() - 1 || zzz13.getIndex() < 0) {
            return;
        }
        zzZ(zzz13, (zzz13.zzYGd() ? 0.095f : 0.055f) * zzz13.zzZYh().getSize(), 0.0f);
    }

    public static void zzR(zzZ13 zzz13) {
        if (zzz13.getIndex() <= 0) {
            return;
        }
        zzY(zzz13, (zzz13.zzYGc() ? 0.1f : 0.05f) * zzz13.zzZYh().getSize(), 0.0f);
    }

    public static float zzS(zzZ13 zzz13) {
        return zzz13.zzYG0() * 0.15f;
    }

    public static void zzT(zzZ13 zzz13) throws Exception {
        float fZzYG0 = zzz13.zzYG0() * 0.15f;
        float fMax = 0.0f;
        zzY(zzz13, 0.0f, fZzYG0);
        zzz13.zzYp(zzz13.zzYGq() + fZzYG0);
        if (zzz13.isInline()) {
            Iterator<zzZ13> it = zzz13.zzQw().iterator();
            while (it.hasNext()) {
                fMax = Math.max(fMax, it.next().zzYGq());
            }
            zzz13.zzYp(((zzz13.zzYG0() * 0.4798f) + fMax) - 4.2024f);
        }
    }

    public static boolean zzU(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static void zzW(zzZ13 zzz13, float f) {
        zzZ(zzz13, f, 0.0f);
    }

    public static void zzX(zzZ13 zzz13, float f) {
        zzY(zzz13, f, 0.0f);
    }

    public static void zzY(zzZ13 zzz13, float f) {
        zzZ(zzz13, 0.0f, f);
    }

    private static float zzZ(double d, com.aspose.words.internal.zzPM zzpm) {
        return (float) ((com.aspose.words.internal.zzZKQ.zzZa(d / 0.5d) * 0.5d) / ((double) zzpm.zzPg()));
    }

    public static void zzW(zzZ13 zzz13, float f, float f2) throws Exception {
        zzZ13 zzz132 = new zzZ13(zzz13.zzYGj(), zzz13.zzYGk());
        zzz132.zzI(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, 0.0f, f));
        zzz132.zzYp(f2);
        zzz13.zzZ(zzz132);
        zzz132.zzY25 = false;
    }

    public static void zzX(zzZ13 zzz13, float f, float f2) {
        if (zzz13.zzYGn().zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzz13.zzYGn());
        }
        zzz13.zzYGn().zzZO().zzY(f, f2, 1);
        zzZ(zzz13, f, f2, 0.0f, 0.0f);
    }

    private static void zzY(zzZ13 zzz13, float f, float f2) {
        if (zzz13.zzYGn().zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzz13.zzYGn());
        }
        zzz13.zzYGn().zzZO().zzY(f, f2, 1);
        zzZ(zzz13, -f, -f2, f, f2);
    }

    public static void zzZ(zzZ13 zzz13, float f) {
        zzY(zzz13, 0.0f, f);
    }

    public static boolean zzI(zzZ13 zzz13) {
        return zzU(zzz13.zzYG8().getMathObjectType(), new int[]{29, 26, 28, 27});
    }

    private static void zzZ(zzZ13 zzz13, float f, float f2) {
        zzZ(zzz13, 0.0f, 0.0f, f, f2);
    }

    private static void zzZ(zzZ13 zzz13, float f, float f2, float f3, float f4) {
        zzz13.zzI(new com.aspose.words.internal.zzZQ4(zzz13.zzZj().getX() + f, zzz13.zzZj().getY() + f2, zzz13.zzZj().getWidth() + f3, zzz13.zzZj().getHeight() + f4));
    }

    public static com.aspose.words.internal.zzZG zzZ(int i, com.aspose.words.internal.zzZXH zzzxh, float f, com.aspose.words.internal.zzPV zzpv) throws Exception {
        com.aspose.words.internal.zzP8 zzp8ZzZ8 = new com.aspose.words.internal.zzUW(zzzxh, f, i).zzZ8(i);
        if (zzp8ZzZ8 == null) {
            return null;
        }
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(zzp8ZzZ8);
        zzzg.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzg;
    }
}
