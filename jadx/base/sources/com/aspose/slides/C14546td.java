package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p407st.AbstractC10376bv;
import com.aspose.slides.internal.p407st.C10675uz;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.td */
/* JADX INFO: loaded from: classes3.dex */
class C14546td {
    /* JADX INFO: renamed from: k4 */
    private static double m71099k4(long j) {
        long j2 = 4294967295L & j;
        double d = (j & 255) / 255.0d;
        double d2 = ((j2 >> 8) & 255) / 255.0d;
        double d3 = ((j2 >> 16) & 255) / 255.0d;
        return (C14116yg.m67491kk(d, C14116yg.m67491kk(d2, d3)) + C14116yg.m67502x1(d, C14116yg.m67502x1(d2, d3))) * 127.5d;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m71102x1(List<Long> list, ExtraColorScheme extraColorScheme) {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 1;
        iArr[2] = 2;
        iArr[3] = 3;
        double[] dArr = new double[4];
        for (int i = 0; i < 4; i++) {
            dArr[i] = m71099k4(list.get_Item(i).longValue());
        }
        for (int i2 = 0; i2 < 3; i2++) {
            for (int i3 = 3; i3 > i2; i3--) {
                int i4 = i3 - 1;
                int i5 = iArr[i4];
                double d = dArr[i5];
                int i6 = iArr[i3];
                if (d > dArr[i6]) {
                    int i7 = i5 ^ i6;
                    iArr[i3] = i7;
                    int i8 = i7 ^ iArr[i4];
                    iArr[i4] = i8;
                    iArr[i3] = iArr[i3] ^ i8;
                }
            }
        }
        extraColorScheme.m1427k4().m63290k4(iArr[0], (byte) 0);
        extraColorScheme.m1427k4().m63290k4(iArr[1], (byte) 2);
        extraColorScheme.m1427k4().m63290k4(iArr[2], (byte) 3);
        extraColorScheme.m1427k4().m63290k4(iArr[3], (byte) 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71100k4(List<Long> list, ExtraColorScheme extraColorScheme) {
        C13682je c13682jeM1427k4 = extraColorScheme.m1427k4();
        IColorScheme colorScheme = extraColorScheme.getColorScheme();
        for (int i = 0; i < 8; i++) {
            ((ColorFormat) colorScheme.getByColorSchemeIndex(c13682jeM1427k4.m63289k4(f6b.m5959to(i)))).m1080k4(C3085sv.m13077k4(255, list.get_Item(i).longValue()).Clone());
        }
        ((ColorFormat) colorScheme.getByColorSchemeIndex((byte) 6)).m1080k4(C12003du.m56397k4(155, 187, 89).Clone());
        ((ColorFormat) colorScheme.getByColorSchemeIndex((byte) 7)).m1080k4(C12003du.m56397k4(128, 100, 162).Clone());
        ((ColorFormat) colorScheme.getByColorSchemeIndex((byte) 8)).m1080k4(C12003du.m56397k4(75, 172, 198).Clone());
        ((ColorFormat) colorScheme.getByColorSchemeIndex((byte) 9)).m1080k4(C12003du.m56397k4(StyleIdentifier.LIGHT_LIST_ACCENT_6, 150, 70).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71101k4(ExtraColorScheme extraColorScheme, AbstractC10376bv abstractC10376bv, boolean z) {
        if (extraColorScheme == null) {
            return;
        }
        C10675uz c10675uz = new C10675uz();
        c10675uz.m51409um().m51920k4(z ? (short) 6 : (short) 1);
        for (int i = 0; i < 8; i++) {
            IColorFormat byColorSchemeIndex = extraColorScheme.getColorScheme().getByColorSchemeIndex(extraColorScheme.m1427k4().m63289k4(f6b.m5959to(i)));
            if (byColorSchemeIndex != null && byColorSchemeIndex.getColorType() != -1) {
                c10675uz.m51835x1().set_Item(i, Long.valueOf(C3085sv.m13075k4(((ColorFormat) byColorSchemeIndex).m1084to().Clone())));
            }
        }
        abstractC10376bv.m50507k4(c10675uz);
    }
}
